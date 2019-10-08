package h08;

import java.awt.*;
import java.applet.*;
import java.awt.event.*;

public class Opdracht8a extends Applet {
    TextField tekstvak;
    Button knop;
    Button resetKnop;
    String schermtekst;


    public void init() {
        schermtekst = "Type een hele lange tekst in het tekstvakje en klik op ok";
        tekstvak = new TextField("", 30);
        knop = new Button("Ok");
        knop.addActionListener(new KnopListener());
        add(tekstvak);
        add(knop);
        resetKnop = new Button("reset");
        resetKnop.addActionListener(new Resetknoplistener());
        add(resetKnop);
    }

    public void paint(Graphics g) {
        g.drawString(schermtekst, 50, 60);
    }

    class KnopListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            schermtekst = tekstvak.getText();
            repaint();

        }
    }


    class Resetknoplistener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            tekstvak.setText("");

        }
    }
}