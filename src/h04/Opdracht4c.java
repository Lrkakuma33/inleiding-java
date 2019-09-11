package h04;
import java.awt.*;
import java.applet.Applet;

public class Opdracht4c extends Applet {
    public void init() {
    }

    public void paint(Graphics g) {
        g.drawRect(100, 100, 350, 150);
        g.setColor(Color.red);
        g.fillRect(100, 100, 350, 75);
        g.setColor(Color.white);
        g.fillRect(100, 175, 350, 150);
        g.drawRect(100, 175, 350, 75);
        g.setColor(Color.blue);
        g.fillRect(100, 250, 350, 75);
        g.drawRect(100, 250, 350, 75);
        g.drawRect(100, 250, 25, 350);


    }
}