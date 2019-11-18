package h11;

import java.applet.Applet;
import java.awt.*;


public class opdracht11h extends Applet {

    public void init() {}

    int teller;
    int x = 1;
    int y = 1;
    int width = 20;
    int height = 20;



    public void paint(Graphics g) {

        for (teller = 0; teller < 100; teller++) {

            g.drawOval(x, y, width, height);
            x += 3;
            y += 3;


            height += 2;
            width += 2;

        }
    }
}