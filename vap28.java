//Write an applet in Netbeans that uses a checkbox with text “Are you above 60”.

    import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class vap28  extends JApplet {
    JCheckBox ageCheckbox;
    JLabel messageLabel;

    public void init() {
        // Run on Event Dispatch Thread for thread safety
        try {
            SwingUtilities.invokeAndWait(() -> createGUI());
        } catch (Exception e) {
            System.out.println("Error creating GUI: " + e);
        }
    }

    private void createGUI() {
        setLayout(new FlowLayout());

        // Checkbox with label
        ageCheckbox = new JCheckBox("Are you above 60?");
        messageLabel = new JLabel("Please select the checkbox.");

        // Add components
        add(ageCheckbox);
        add(messageLabel);

        // Event listener for checkbox
        ageCheckbox.addItemListener(new ItemListener() {
            public void itemStateChanged(ItemEvent e) {
                if (ageCheckbox.isSelected()) {
                    messageLabel.setText("Senior citizen confirmed.");
                } else {
                    messageLabel.setText("You are below 60.");
                }
            }
        });
    }
}






