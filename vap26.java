
//Write any applet in Netbeans that has 2 buttons having labels as “Filled circle”, and “Filled rectangle”.

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class vap26 extends JApplet {
    private String shapeToDraw = "";

    public void init() {
        // Use FlowLayout
        setLayout(new FlowLayout());

        // Create buttons
        JButton circleButton = new JButton("Filled circle");
        JButton rectangleButton = new JButton("Filled rectangle");

        // Add buttons to the applet
        add(circleButton);
        add(rectangleButton);

        // Add action listeners
        circleButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                shapeToDraw = "circle";
                repaint();  // Triggers the paint method
            }
        });

        rectangleButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                shapeToDraw = "rectangle";
                repaint();  // Triggers the paint method
            }
        });
    }

    public void paint(Graphics g) {
        super.paint(g); // Always call super.paint

        // Set drawing color
        g.setColor(Color.BLUE);

        // Draw based on selected shape
        if ("circle".equals(shapeToDraw)) {
            g.fillOval(100, 100, 100, 100); // Draw filled circle
        } else if ("rectangle".equals(shapeToDraw)) {
            g.fillRect(100, 100, 150, 100); // Draw filled rectangle
        }
    }
}


