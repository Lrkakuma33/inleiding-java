package h02;

import java.applet.Applet;
import java.awt.*;

public class Opdracht2b extends Applet {


    public void init() {
        setBackground(Color.white);
    }


    public void paint(Graphics g) {
        g.setColor(Color.BLUE);
        g.drawString("Lucien", 50, 60 );
        g.setColor(Color.RED);
        g.drawString("Keenswijk", 60, 70 );
    }
}
