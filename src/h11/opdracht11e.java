package h11;

import java.applet.Applet;
import java.awt.*;

public class opdracht11e extends Applet {

    public void init() {}

    public void paint(Graphics g) {
        int teller;
        int y = 15;
        int x = 15;
        int width = 20;
        int height = 20;


        for (teller = 0; teller < 5; teller++) {
            g.drawRect(x,y,width,width);
            y += height;
            x += width;
        }
    }
}