package h04;
import java.awt.*;
import java.applet.Applet;

public class Opdracht4f extends Applet {
    public void init() {
    }

    public void paint(Graphics g) {

        g.setColor(Color.black);
        g.fillRect(20,20,90,250);
        g.drawRoundRect(20, 20, 90, 250, 8, 8);
        g.setColor(Color.red);
        g.fillArc(40, 40, 50, 50, 500, 500);


        g.setColor(Color.yellow);
        g.fillArc(40,120,50,50,500,500);


        g.setColor(Color.green);
        g.fillArc(40,200,50,50,500,500);
    }
}