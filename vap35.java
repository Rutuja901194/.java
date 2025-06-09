
//Create a swing in Netbean Secret code should be hidden. If the user keys in “MKCL123$”, then the following message should appear in a dialg box.


    import javax.swing.*;

    public class vap35 extends JFrame {

    private JPasswordField passwordField;
    private JButton submitButton;

    public vap35() {
        setTitle("Secret Code Access");
        setSize(400, 150);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(null);

        JLabel label = new JLabel("Enter Secret Code:");
        label.setBounds(30, 20, 150, 25);
        add(label);

        passwordField = new JPasswordField();
        passwordField.setBounds(180, 20, 150, 25);
        add(passwordField);

        submitButton = new JButton("Submit");
        submitButton.setBounds(140, 60, 100, 30);
        add(submitButton);

        submitButton.addActionListener(e -> {
            String code = new String(passwordField.getPassword());
            if ("MKCL123$".equals(code)) {
                JOptionPane.showMessageDialog(this, "Access Granted!");
            } else {
                JOptionPane.showMessageDialog(this, "Access Denied");
            }
        });
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new vap35().setVisible(true));
    }
}


