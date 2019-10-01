package H06;

import java.applet.Applet;
import java.awt.*;

public class Opdracht6c extends Applet {

    // declareren variabelen
    int getal1;
    int getal2;
    int uitkomst;


    public void init() {
        // positieve waarden
        getal1 = 2147483647;
        getal2 = 1;
        uitkomst = getal1 + getal2;

    }

    public void paint(Graphics g) {
        // negatieve waarde
        g.drawString("Negatieve waarde", 50, 50);
        g.drawString("" + uitkomst, 50, 65);


        // 1.waarom is initialiseren van variabelen noodzakelijk?
        // na het initialiseren van een variabele krijgt het een waarde.

        // 2.waarom is er typecasting noodzakelijk bij de conversie van een double naar een int?
        // dat er word geaccepteert dat informatie verloren kan gaan.

        // 3. Wat is de uitvoer van dit programma? Geef een verklaring?
        // a=8 word opgeteld met b=8 en daarna gedeeld door 3.

        // 5. Wat is de uitvoer van dit programma? Geef een verklaring.
        // er word een andere berekening gemaakt 8 gedeeld door 3 en daarna word 8 erbij opgeteld.


    }

}
