
//Write a simple applet in Netbeans that overrides the following methods.

import java.applet.Applet;
import java.awt.Graphics;

public class vap24
 extends Applet {

    @Override
    public void init() {
        System.out.println("init() called");
    }

    @Override
    public void start() {
        System.out.println("start() called");
    }

    @Override
    public void stop() {
        System.out.println("stop() called");
    }

    @Override
    public void destroy() {
        System.out.println("destroy() called");
    }

    @Override
    public void paint(Graphics g) {
        g.drawString("Hello from MyApplet!", 20, 30);
    }
}
