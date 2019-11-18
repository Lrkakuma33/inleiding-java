package h11;

import java.applet.Applet;
import java.awt.*;

public class opdracht11d extends Applet {

    public void init() {}

    public void paint(Graphics g) {
        int teller;
        int keer=3;
        int eindresultaat;
        int nummer1=1;
        int y = 0;

        for (teller = 0; teller<= 10; teller++) {
            y+= 20;
            eindresultaat = (nummer1*keer)*teller;
            g.drawString("" + eindresultaat, 60, y);
        }

    }
}
