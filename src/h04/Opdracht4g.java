package h04;
import java.awt.*;
import java.applet.Applet;

public class Opdracht4g extends Applet {
    public void init() {
    }

    public void paint(Graphics g) {

        g.drawRoundRect(100, 100, 100, 100, 10, 10);
        g.fillOval(120,120,20,20);
        g.fillOval(160,120,20,20);
        g.fillOval(120,160,20,20);
        g.fillOval(160,160,20,20);

    }
}