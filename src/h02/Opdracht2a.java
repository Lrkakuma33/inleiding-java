package h02;

import java.applet.Applet;
import java.awt.*;

public class Opdracht2a extends Applet {


    public void init() {
        setBackground(Color.yellow);
    }


    public void paint(Graphics g) {
        g.setColor(Color.BLUE);
        g.drawString("Lucien", 50, 60 );
    }
}
