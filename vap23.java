
    import java.applet.Applet;
import java.awt.Graphics;

public class vap23 extends Applet {

    @Override
    public void paint(Graphics g) {
        // Draw a line
        g.drawLine(20, 30, 200, 30);

        // Draw a rectangle
        g.drawRect(20, 50, 100, 60);

        // Draw an oval
        g.drawOval(150, 50, 100, 60);
    }
}


