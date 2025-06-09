
//Create a swing using Netbeans as shown below.


import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class vap34 extends JFrame implements ActionListener {

    private JLabel nameLabel;
    private JTextField nameField;
    private JButton submitButton;
    private JTextArea outputArea;

    public vap34() {
        setTitle("Advanced Swing Form");
        setSize(500, 300);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null); // Center the window

        // Use GridBagLayout for flexible layout
        setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();

        // Label
        nameLabel = new JLabel("Enter your name:");
        nameLabel.setFont(new Font("Arial", Font.BOLD, 16));
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.insets = new Insets(10, 10, 10, 10);
        add(nameLabel, gbc);

        // Text field
        nameField = new JTextField(20);
        gbc.gridx = 1;
        add(nameField, gbc);

        // Submit button
        submitButton = new JButton("Submit");
        submitButton.setFont(new Font("Arial", Font.BOLD, 14));
        submitButton.addActionListener(this);
        gbc.gridx = 1;
        gbc.gridy = 1;
        gbc.anchor = GridBagConstraints.WEST;
        add(submitButton, gbc);

        // Output area
        outputArea = new JTextArea(5, 30);
        outputArea.setEditable(false);
        outputArea.setFont(new Font("Serif", Font.ITALIC, 16));
        JScrollPane scrollPane = new JScrollPane(outputArea);
        gbc.gridx = 0;
        gbc.gridy = 2;
        gbc.gridwidth = 2;
        add(scrollPane, gbc);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String name = nameField.getText().trim();
        if (!name.isEmpty()) {
            outputArea.setText("Hello, " + name + "!\nSwing code is faster than applet code.");
        } else {
            outputArea.setText("Please enter your name first.");
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new vap34().setVisible(true));
    }
}


