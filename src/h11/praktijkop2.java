
package h11;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class praktijkop2 extends Applet {

    Button next;
    int tafelnummer;
    int resultaat;


    public void init() {

        tafelnummer = 0;
        next = new Button("volgende tafel");
        next.addActionListener(new OkListener());
        add(next);

    }



    class OkListener implements ActionListener {

        public void actionPerformed(ActionEvent e) {

            tafelnummer++;

            if (tafelnummer > 10) {
                tafelnummer = 1;

            }

            repaint();

        }

    }



    public void paint(Graphics g) {

        int y = 40;
        for (int teller = 0; teller < 10; teller++) {

            resultaat = tafelnummer * (teller + 1);
            g.drawString((teller + 1) + " X " + tafelnummer + " = " + resultaat, 20, y);
            y += 20;

        }

    }

}