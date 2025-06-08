
//Create an Applet form that displays a label with text “MKCL” and two command buttons. If the user clicks 
//on the first button, the label background color changes to red. If the user clicks on the second button, 
//the label background changes to blue.

 
import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;

/* <applet code="ColorChangeApplet" width=300 height=150>
</applet> */

public class vap32 extends Applet implements ActionListener {

    Label label;
    Button redButton, blueButton;

    public void init() {
        // Set layout
        setLayout(new FlowLayout());

        // Initialize components
        label = new Label("MKCL", Label.CENTER);
        label.setBackground(Color.lightGray);
        label.setPreferredSize(new Dimension(100, 30));

        redButton = new Button("Red");
        blueButton = new Button("Blue");

        // Add action listeners
        redButton.addActionListener(this);
        blueButton.addActionListener(this);

        // Add components to Applet
        add(label);
        add(redButton);
        add(blueButton);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == redButton) {
            label.setBackground(Color.RED);
        } else if (e.getSource() == blueButton) {
            label.setBackground(Color.BLUE);
        }
    }
}


