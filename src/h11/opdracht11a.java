package h11;

import java.applet.Applet;
import java.awt.*;

public class opdracht11a extends Applet {


    public void init() {}

    public void paint(Graphics g) {
        int teller;
        int y = 0;
        int y1 = 150;
        int x = 15;
        for (teller = 0; teller <10; teller++) {
            x += 65;
            g.drawLine(x,y,x,y1);
        }
 
    }
}
