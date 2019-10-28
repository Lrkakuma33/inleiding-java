package h10;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.TextListener;

public class h10a extends Applet {

    TextField tekstvak;
    boolean firstnumber;
    int maxInput;
    int minInput;
    int Waarde;

    public void init() {
        tekstvak = new TextField( 25);
        tekstvak.addActionListener(new TextListener());
        add(tekstvak);
        maxInput = 0;
        minInput = 0;
        firstnumber = true;
    }
    public void paint(Graphics g) {
        g.drawString("Max input: " + maxInput, 55,105);
        g.drawString("Min input: " + minInput, 55, 135);
    }

    class TextListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            String Waardestring = tekstvak.getText();
            Waarde = Integer.parseInt(Waardestring);
            if (firstnumber) {
                firstnumber = false;
                maxInput = Waarde;
                minInput = Waarde;
                repaint();
            } else if (Waarde > maxInput) {
                maxInput = Waarde;
                repaint();
            } else if (Waarde < minInput) {
                minInput = Waarde;
                repaint();
            }









        }





    }
}
