

    import java.applet.Applet;
import java.awt.Graphics;

public class vap22  extends Applet {
    String name, course;
    int age;

    public void init() {
        // Read parameters passed from HTML
        name = getParameter("name");
        course = getParameter("course");
        String ageParam = getParameter("age");
        if (ageParam != null) {
            age = Integer.parseInt(ageParam);
        }
    }

    public void paint(Graphics g) {
        g.drawString("Student Name: " + name, 20, 30);
        g.drawString("Age: " + age, 20, 50);
        g.drawString("Course: " + course, 20, 70);
    }
}


