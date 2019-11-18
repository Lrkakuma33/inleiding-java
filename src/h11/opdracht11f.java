package h11;

import java.applet.Applet;
import java.awt.*;


public class opdracht11f extends Applet {

    public void init() {
        setSize(400,400);
    }

    int teller;
    int x = 150;
    int y = 150;
    int width = 50;
    int height = 50;

    public void paint(Graphics g) {

        for (teller = 0; teller < 5; teller++) {

            g.drawOval(x,y,width,height);
            y += 5;
            x += 5;


            height -= 10;
            width -= 10;
        }
    }
}