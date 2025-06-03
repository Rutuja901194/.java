    import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class vap27 extends JApplet {
    public void init() {
        try {
            SwingUtilities.invokeAndWait(new Runnable() {
                public void run() {
                    createGUI();
                }
            });
        } catch (Exception e) {
            System.err.println("GUI creation failed: " + e);
        }
    }

    private void createGUI() {
        // Set layout
        setLayout(new BorderLayout());

        // Top panel for input
        JPanel inputPanel = new JPanel(new GridLayout(5, 2, 5, 5));
        inputPanel.setBorder(BorderFactory.createTitledBorder("User Input"));

        // Label and text field
        inputPanel.add(new JLabel("Username:"));
        JTextField usernameField = new JTextField(15);
        inputPanel.add(usernameField);

        // Password
        inputPanel.add(new JLabel("Password:"));
        JPasswordField passwordField = new JPasswordField(15);
        inputPanel.add(passwordField);

        // Checkbox
        inputPanel.add(new JLabel("Subscribe:"));
        JCheckBox subscribeBox = new JCheckBox("Yes");
        inputPanel.add(subscribeBox);

        // Radio Buttons
        inputPanel.add(new JLabel("Gender:"));
        JPanel genderPanel = new JPanel(new FlowLayout(FlowLayout.LEFT));
        JRadioButton male = new JRadioButton("Male");
        JRadioButton female = new JRadioButton("Female");
        ButtonGroup genderGroup = new ButtonGroup();
        genderGroup.add(male);
        genderGroup.add(female);
        genderPanel.add(male);
        genderPanel.add(female);
        inputPanel.add(genderPanel);

        // Combo Box
        inputPanel.add(new JLabel("Country:"));
        JComboBox<String> countryBox = new JComboBox<>(new String[] {
            "Select", "USA", "Canada", "UK", "India"
        });
        inputPanel.add(countryBox);

        add(inputPanel, BorderLayout.NORTH);

        // Center panel for text area
        JTextArea commentArea = new JTextArea(5, 30);
        commentArea.setBorder(BorderFactory.createTitledBorder("Comments"));
        add(new JScrollPane(commentArea), BorderLayout.CENTER);

        // Bottom panel for button
        JPanel buttonPanel = new JPanel();
        JButton submitButton = new JButton("Submit");
        buttonPanel.add(submitButton);
        add(buttonPanel, BorderLayout.SOUTH);

        // Action listener for submit
        submitButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String userInfo = "Username: " + usernameField.getText()
                        + "\nPassword: " + new String(passwordField.getPassword())
                        + "\nSubscribed: " + subscribeBox.isSelected()
                        + "\nGender: " + (male.isSelected() ? "Male" : female.isSelected() ? "Female" : "Not selected")
                        + "\nCountry: " + countryBox.getSelectedItem()
                        + "\nComments: " + commentArea.getText();
                JOptionPane.showMessageDialog(null, userInfo);
            }
        });
    }
}


