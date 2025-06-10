
    import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class vap36 extends JFrame implements ActionListener {

    private JTextField usernameField;
    private JPasswordField passwordField;
    private JButton loginButton, clearButton;

    public vap36() {
        setTitle("Login Form - Advanced Java Swing");
        setSize(400, 250);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null); // center the frame

        // Layout manager
        setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(10, 10, 10, 10);
        gbc.fill = GridBagConstraints.HORIZONTAL;

        // Username Label
        gbc.gridx = 0;
        gbc.gridy = 0;
        add(new JLabel("Username:"), gbc);

        // Username Field
        usernameField = new JTextField(20);
        gbc.gridx = 1;
        add(usernameField, gbc);

        // Password Label
        gbc.gridx = 0;
        gbc.gridy = 1;
        add(new JLabel("Password:"), gbc);

        // Password Field
        passwordField = new JPasswordField(20);
        gbc.gridx = 1;
        add(passwordField, gbc);

        // Login Button
        loginButton = new JButton("Login");
        loginButton.addActionListener(this);
        gbc.gridx = 0;
        gbc.gridy = 2;
        add(loginButton, gbc);

        // Clear Button
        clearButton = new JButton("Clear");
        clearButton.addActionListener(this);
        gbc.gridx = 1;
        add(clearButton, gbc);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == loginButton) {
            String user = usernameField.getText();
            String pass = new String(passwordField.getPassword());

            // Example logic: hardcoded credentials
            if (user.equals("admin") && pass.equals("MKCL123$")) {
                JOptionPane.showMessageDialog(this, "Access Granted!", "Login", JOptionPane.INFORMATION_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(this, "Access Denied!", "Error", JOptionPane.ERROR_MESSAGE);
            }
        } else if (e.getSource() == clearButton) {
            usernameField.setText("");
            passwordField.setText("");
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new vap36().setVisible(true));
    }
}


