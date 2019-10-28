package h10;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class h10e extends Applet {

    double gemiddelde;
    double input1;
    double input2;
    double input3;
    double input4;
    double input5;

    String state;
    TextField tekstvak1;
    TextField tekstvak2;
    TextField tekstvak3;
    TextField tekstvak4;
    TextField tekstvak5;
    Button Uitrekenen;
    Button Reset;



    public void init() {

        tekstvak1 = new TextField(5);
        tekstvak2 = new TextField(5);
        tekstvak3 = new TextField(5);
        tekstvak4 = new TextField(5);
        tekstvak5 = new TextField(5);



        add(tekstvak1);
        add(tekstvak2);
        add(tekstvak3);
        add(tekstvak4);
        add(tekstvak5);



        Uitrekenen = new Button("Uitrekenen");
        Uitrekenen.addActionListener(new ButtonListener());
        Reset = new Button("Reset");
        Reset.addActionListener(new ResetButtonListener());
        add(Uitrekenen);
        add(Reset);

    }

    public void paint(Graphics g) {
        g.drawString("Het gemiddelde is: " + gemiddelde + " dus de leerling is " + state, 50, 70);

    }

    class ButtonListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {

            input1 = Double.valueOf(tekstvak1.getText());
            input2 = Double.valueOf(tekstvak2.getText());
            input3 = Double.valueOf(tekstvak3.getText());
            input4 = Double.valueOf(tekstvak4.getText());
            input5 = Double.valueOf(tekstvak5.getText());
            gemiddelde = (input1 + input2 + input3 + input4 + input5) / 5;



            if (gemiddelde > 5.5) {
                state = "Geslaagd";
            }
            else {
                state = "Gezakt";

            }

            repaint();

        }

    }


    class ResetButtonListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {

            input1 = 0;
            input2 = 0;
            input3 = 0;
            input4 = 0;
            input5 = 0;
            gemiddelde = 0;
            repaint();

        }

    }

}