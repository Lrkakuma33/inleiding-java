
package h10;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Praktijkopdrachth10 extends Applet {



    double input;
    TextField textfield;
    Button OK;
    Button Resetbutton;
    String state = "";



    public void init() {

        textfield = new TextField(4);
        OK = new Button("OK");
        OK.addActionListener(new ButtonListener());
        Resetbutton = new Button("Reset");
        Resetbutton.addActionListener(new ResetButtonListener());



        add(textfield);
        add(OK);
        add(Resetbutton);
    }



    public void paint(Graphics g) {
        g.drawString("" + state,40,40);



    }class ButtonListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            input = Double.valueOf(textfield.getText());

            if (input < 4) {
                state = "Slecht";
                repaint();
            }

            else if (input < 5.5) {
                state = "Onvoldoende";
                repaint();
            }


            else if (input < 7.5) {
                state = "Voldoende";
                repaint();
            }

            else if (input < 9) {
                state = "Goed";
                repaint();

            }
            else if (input <= 10) {
                state = "goed";
                repaint();


            }


        }
    }


    class ResetButtonListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            input = 0;
            state = "";
            repaint();
        }
    }
}