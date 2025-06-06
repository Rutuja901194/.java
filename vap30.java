
//Create a small data entry Applet form in Netbeans similar to the one shown below.
 
    import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class vap30 extends JApplet {
    JTextField nameField, ageField;
    JButton submitButton;
    JLabel outputLabel;

    public void init() {
        try {
            SwingUtilities.invokeAndWait(() -> createGUI());
        } catch (Exception e) {
            System.out.println("Error creating GUI: " + e);
        }
    }

    private void createGUI() {
        setLayout(new GridLayout(4, 2, 5, 5));

        add(new JLabel("Name:"));
        nameField = new JTextField(15);
        add(nameField);

        add(new JLabel("Age:"));
        ageField = new JTextField(5);
        add(ageField);

        submitButton = new JButton("Submit");
        add(submitButton);

        outputLabel = new JLabel("");
        add(outputLabel);

        submitButton.addActionListener(e -> {
            String name = nameField.getText();
            String age = ageField.getText();
            outputLabel.setText("Hello " + name + ", Age: " + age);
        });
    }
}


