package h11;


import java.applet.Applet;
import java.awt.*;


public class opdracht11i extends Applet {

    public void init() {
        setSize(500,500);}



    public void paint(Graphics g) {
        int x = 50;
        int y = 50;
        int width = 50;
        int height = 50;

        for (int rij = 0; rij < 4; rij++) {

            g.drawRect(x, y, width, height);



            // line 1
            for (int vak = 0; vak < 8; vak++) {
                g.drawRect(x, y, width, height);

                if (vak == 0 || vak == 2 || vak == 4 || vak == 6) {

                    g.setColor(Color.black);
                    g.fillRect(x, y, width, height);

                } else {
                    g.setColor(Color.white);

                }

                x += width;

            }

            x = 50;
            y += height;



            // line 2
            for (int vak = 0; vak < 8; vak++) {

                g.setColor(Color.black);
                g.drawRect(x, y, width, height);

                if (vak == 0 || vak == 2 || vak == 4 || vak == 6) {
                    g.setColor(Color.white);

                } else {
                    g.setColor(Color.black);
                    g.fillRect(x, y, width, height);

                }
                x += width;

            }

            x = 50;
            y += height;
        }
    }
}