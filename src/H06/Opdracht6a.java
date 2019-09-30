package H06;

import java.awt.*;
import java.applet.*;


public class Opdracht6a extends Applet {
    double getal1;
    double getal2;
    double uitkomst;

    public void init() {
        getal1 = 113;
        getal2 = 4;
        uitkomst = getal1 / getal2;

    }

    public void paint(Graphics g) {
        g.drawString("Jan", 55, 50);
        g.drawString("" + uitkomst, 80, 50);

        g.drawString("Ali", 55, 70);
        g.drawString("" + uitkomst, 80, 70);

        g.drawString("Jeannette", 55, 90);
        g.drawString("" + uitkomst, 120, 90);

        g.drawString("Lu", + 55, 110);
        g.drawString("" + uitkomst, 80, 110);
    }
}
