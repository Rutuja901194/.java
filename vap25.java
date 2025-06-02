    import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class vap25 extends JApplet {

    public void init() {
        // Use FlowLayout for simplicity
        setLayout(new FlowLayout());

        // Create components
        JLabel label = new JLabel("Enter your name:");
        JTextField textField = new JTextField(15);
        JButton button = new JButton("Submit");
        JCheckBox checkBox = new JCheckBox("I agree");
        String[] items = {"Select", "Item 1", "Item 2", "Item 3"};
        JComboBox<String> comboBox = new JComboBox<>(items);

        // Add components to the applet
        add(label);
        add(textField);
        add(button);
        add(checkBox);
        add(comboBox);

        // Optional: Add button click event
        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String name = textField.getText();
                boolean agreed = checkBox.isSelected();
                String selectedItem = (String) comboBox.getSelectedItem();
                JOptionPane.showMessageDialog(null,
                    "Name: " + name + "\nAgreed: " + agreed + "\nSelected: " + selectedItem);
            }
        });
    }
}


