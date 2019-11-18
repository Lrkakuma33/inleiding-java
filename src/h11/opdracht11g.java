package h11;

import java.applet.Applet;
import java.awt.*;

public class opdracht11g extends Applet {

    public void init() {
        setSize(700,700);

    }

    int teller;
    int x = 10;
    int y = 10;
    int width = 500;
    int height = 500;

    public void paint(Graphics g) {

        for (teller = 0; teller < 50; teller++) {
            g.drawOval(x,y,width,height);

            y += 5;
            x += 5;

            height -= 10;
            width -= 10;
        }
    }
}