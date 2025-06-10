
//Create a JFrame form as shown in Assignment number 2.  If the user clicks on “Dynamic” option then a dialog box should flash the message.

 
    import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class vap37 extends JFrame {

    private JRadioButton dynamicOption;
    private JRadioButton staticOption;
    private ButtonGroup optionGroup;

    public vap37() {
        setTitle("Assignment 2 - Options");
        setSize(300, 200);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new FlowLayout());

        JLabel label = new JLabel("Choose Option:");
        add(label);

        dynamicOption = new JRadioButton("Dynamic");
        staticOption = new JRadioButton("Static");

        // Group the radio buttons
        optionGroup = new ButtonGroup();
        optionGroup.add(dynamicOption);
        optionGroup.add(staticOption);

        add(dynamicOption);
        add(staticOption);

        // Add Action Listener to "Dynamic" button
        dynamicOption.addActionListener(e -> {
            JOptionPane.showMessageDialog(this, "You selected the Dynamic option!");
        });

        // Optional: handle static as well
        staticOption.addActionListener(e -> {
            JOptionPane.showMessageDialog(this, "You selected the Static option.");
        });
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new vap37().setVisible(true));
    }
}


