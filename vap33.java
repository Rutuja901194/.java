
//Create a swing in Netbeans. Print the message “Swing code is faster than applet code”. Use the Algerian bold font with a size of 28.


    import javax.swing.*;
import java.awt.*;

public class vap33 extends JFrame {

    private JLabel jLabel1;

    public vap33() {
        initComponents();
        jLabel1.setFont(new Font("Algerian", Font.BOLD, 28));
    }

    private void initComponents() {
        jLabel1 = new JLabel("Swing code is faster than applet code", JLabel.CENTER);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        getContentPane().add(jLabel1, BorderLayout.CENTER);
        setSize(600, 200);
        setLocationRelativeTo(null); // center on screen
    }

    public static void main(String args[]) {
        SwingUtilities.invokeLater(() -> new vap33().setVisible(true));
    }
}


