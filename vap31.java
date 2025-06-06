 
    import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class vap31 extends JFrame {

    private JTextField nameField;
    private JTextField emailField;
    private JButton submitButton;
    private JButton clearButton;
    private JTextArea outputArea;

    public vap31() {
        super("Advanced Java Frame Form");

        // Set layout manager
        setLayout(new BorderLayout());

        // Create form panel
        JPanel formPanel = new JPanel(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();

        // Name label and field
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.anchor = GridBagConstraints.WEST;
        formPanel.add(new JLabel("Name: "), gbc);

        nameField = new JTextField(20);
        gbc.gridx = 1;
        formPanel.add(nameField, gbc);

        // Email label and field
        gbc.gridx = 0;
        gbc.gridy = 1;
        formPanel.add(new JLabel("Email: "), gbc);

        emailField = new JTextField(20);
        gbc.gridx = 1;
        formPanel.add(emailField, gbc);

        // Buttons panel
        JPanel buttonPanel = new JPanel();
        submitButton = new JButton("Submit");
        clearButton = new JButton("Clear");

        buttonPanel.add(submitButton);
        buttonPanel.add(clearButton);

        // Output area
        outputArea = new JTextArea(5, 30);
        outputArea.setEditable(false);
        JScrollPane scrollPane = new JScrollPane(outputArea);

        // Add components to frame
        add(formPanel, BorderLayout.NORTH);
        add(buttonPanel, BorderLayout.CENTER);
        add(scrollPane, BorderLayout.SOUTH);

        // Button actions
        submitButton.addActionListener(e -> handleSubmit());
        clearButton.addActionListener(e -> handleClear());

        // Frame settings
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        pack();
        setLocationRelativeTo(null); // center on screen
        setVisible(true);
    }

    private void handleSubmit() {
        String name = nameField.getText();
        String email = emailField.getText();
        outputArea.setText("Submitted Information:\n");
        outputArea.append("Name: " + name + "\n");
        outputArea.append("Email: " + email);
    }

    private void handleClear() {
        nameField.setText("");
        emailField.setText("");
        outputArea.setText("");
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new vap31());
    }
}


