package H06;

import java.applet.Applet;
import java.awt.*;

public class Opdracht6b extends Applet {
    // declarenen variabelen
    // hoeveel seconden een uur is?
    int getal2;
    int getal3;
    int uitkomst;

    // hoeveel seconden 24 uur is ?
    int getal4;
    int getal5;
    int uitkomstt;

    // hoeveel seconden in 365 dagen zitten?
    int getal6;
    int getal7;
    int uitkomsttt;


    public void init() {
        // intialiseren variabelen
        // hoeveel seconden een uur is?
        getal2 = 60;
        getal3 = 60;
        uitkomst = getal2 * getal3;

        // hoeveel seconden 24 uur is?
        getal4 = 3600;
        getal5 = 24;
        uitkomstt = getal4 * getal5;

        // hoeveel seconden in 365 dagen zitten?
        getal6 = 86400;
        getal7 = 365;
        uitkomsttt = getal6 * getal7;

    }
        // Berekeningen secondes
    public void paint(Graphics g) {
        g.drawString("hoeveel seconden een uur is?", 50,50);
        g.drawString("" + uitkomst, 50, 65);

        g.drawString("hoeveel seconden 24 uur is?", 50, 100);
        g.drawString("" + uitkomstt, 50, 115);

        g.drawString("hoeveel seconden in 365 dagen zit?", 50, 145);
        g.drawString("" + uitkomsttt, 50, 160);


    }
}
