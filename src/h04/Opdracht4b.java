package h04;
import java.awt.*;
import java.applet.Applet;

public class Opdracht4b extends Applet {
    public void init() {
    }

    public void paint(Graphics g) {
        g.drawLine(100,  100,  225, 50);
        g.drawLine(350,  100,  225, 50);
        g.drawRect(100, 100, 250, 200);
        g.drawRect(120, 150, 75, 50);
        g.drawRect(270, 150, 40, 150);
    }
}