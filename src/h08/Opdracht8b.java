package h08;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Opdracht8b extends Applet {
    Button knop1;
    Button knop2;
    Button knop3;
    Button knop4;
    Button knopreset;
    Label label;

    int mannen;
    int vrouwen;
    int mannelijkestudenten;
    int vrouwelijkestudenten;
    int totaal;


    public void init() {

        knop1 = new Button("Mannen");
        knop2 = new Button("Vrouwen");
        knop3 = new Button("Mannelijkestudenten");
        knop4 = new Button("Vrouwelijkestudenten");
        knopreset = new Button("Reset");
        knop1.addActionListener(new Knop1Listener());
        knop2.addActionListener(new Knop2listener());
        knop3.addActionListener(new Knop3Listener());
        knop4.addActionListener(new Knop4Listener());
        knopreset.addActionListener(new KnopresetListener());
        totaal = mannelijkestudenten + vrouwelijkestudenten + mannen + vrouwen;

        add(knop1);
        add(knop2);
        add(knop3);
        add(knop4);
        add(knopreset);
    }


    public void paint(Graphics g) {
        g.drawString("Mannen = " + mannen, 50, 100);
        g.drawString("Vrouwen =" + vrouwen, 50, 120);
        g.drawString("Mannelijke studenten = " + mannelijkestudenten, 50, 140);
        g.drawString("Vrouwelijke studenten =" + vrouwelijkestudenten, 50, 160);

    }
    public void repaint() {
        super.repaint();

    }

    class Knop1Listener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            mannen++;
            totaal = mannelijkestudenten + vrouwelijkestudenten + mannen + vrouwen;
            repaint();

        }
    }

   class Knop2listener implements ActionListener {
       public void actionPerformed(ActionEvent e) {
           vrouwen++;
           totaal = mannelijkestudenten + vrouwelijkestudenten + mannen + vrouwen;
           repaint();
       }
   }
       class Knop3Listener implements ActionListener {
           public void actionPerformed(ActionEvent e) {
               mannelijkestudenten++;
               totaal = mannelijkestudenten + vrouwelijkestudenten + mannen + vrouwen;
               repaint();
           }
       }

       class Knop4Listener implements ActionListener {
           public void actionPerformed(ActionEvent e) {
               vrouwelijkestudenten++;
               totaal = mannelijkestudenten + vrouwelijkestudenten + mannen + vrouwen;
               repaint();
           }
       }

       class KnopresetListener implements ActionListener {
           public void actionPerformed(ActionEvent e) {
               mannen = 0;
               vrouwen = 0;
               mannelijkestudenten = 0;
               vrouwelijkestudenten = 0;
               totaal = 0;
               repaint();
           }
       }

}
