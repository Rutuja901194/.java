
//Create a small data entry Applet form in Netbeans similar to the one shown below.

    import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

 public class vap29 extends JApplet {

    JTextField nameField, emailField;
    JRadioButton maleButton, femaleButton;
    JComboBox<String> courseBox;
    JButton submitButton, clearButton;
    JTextArea outputArea;

    public void init() {
        try {
            SwingUtilities.invokeAndWait(() -> createGUI());
        } catch (Exception e) {
            System.out.println("GUI creation failed: " + e);
        }
    }

    private void createGUI() {
        setLayout(new BorderLayout());

        // Panel for form
        JPanel formPanel = new JPanel(new GridLayout(5, 2, 5, 5));

        // Name
        formPanel.add(new JLabel("Name:"));
        nameField = new JTextField(15);
        formPanel.add(nameField);

        // Email
        formPanel.add(new JLabel("Email:"));
        emailField = new JTextField(15);
        formPanel.add(emailField);

        // Gender
        formPanel.add(new JLabel("Gender:"));
        JPanel genderPanel = new JPanel(new FlowLayout(FlowLayout.LEFT));
        maleButton = new JRadioButton("Male");
        femaleButton = new JRadioButton("Female");
        ButtonGroup genderGroup = new ButtonGroup();
        genderGroup.add(maleButton);
        genderGroup.add(femaleButton);
        genderPanel.add(maleButton);
        genderPanel.add(femaleButton);
        formPanel.add(genderPanel);

        // Course
        formPanel.add(new JLabel("Course:"));
        courseBox = new JComboBox<>(new String[] {"Select", "BSc", "BCA", "MSc", "MCA"});
        formPanel.add(courseBox);

        // Buttons
        submitButton = new JButton("Submit");
        clearButton = new JButton("Clear");
        formPanel.add(submitButton);
        formPanel.add(clearButton);

        add(formPanel, BorderLayout.NORTH);

        // Output area
        outputArea = new JTextArea(6, 30);
        outputArea.setEditable(false);
        outputArea.setBorder(BorderFactory.createTitledBorder("Entered Data"));
        add(new JScrollPane(outputArea), BorderLayout.CENTER);

        // Button actions
        submitButton.addActionListener(e -> {
            String name = nameField.getText();
            String email = emailField.getText();
            String gender = maleButton.isSelected() ? "Male" : femaleButton.isSelected() ? "Female" : "Not selected";
            String course = (String) courseBox.getSelectedItem();

            outputArea.setText("Name: " + name + "\nEmail: " + email +
                               "\nGender: " + gender + "\nCourse: " + course);
        });

        clearButton.addActionListener(e -> {
            nameField.setText("");
            emailField.setText("");
            genderGroup.clearSelection();
            courseBox.setSelectedIndex(0);
            outputArea.setText("");
        });
    }
}


