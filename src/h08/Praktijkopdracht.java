package h08;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Praktijkopdracht extends Applet {
    TextField tekstvak1;
    TextField tekstvak2;
    Button Knopvermenigvuldigen;
    Button KnopDelen;
    Button KnopPlus;
    Button KnopMin;
    Button KnopReset;
    double invoer1, invoer2;
    double antwoord;
    double input1;
    double input2;


    public void init() {
        tekstvak1 = new TextField("", 10);
        tekstvak2 = new TextField("", 10);
        Knopvermenigvuldigen = new Button("*");
        KnopDelen = new Button("/");
        KnopPlus = new Button("+");
        KnopMin = new Button("-");
        KnopReset = new Button("Reset");
        Knopvermenigvuldigen.addActionListener(new KnopvermenigvuldigenListener());
        KnopDelen.addActionListener(new KnopDelenListener());
        KnopPlus.addActionListener(new KnopPlusListener());
        KnopMin.addActionListener(new KnopMinListener());
        KnopReset.addActionListener(new KnopResetListener());
        add(tekstvak1);
        add(tekstvak2);
        add(Knopvermenigvuldigen);
        add(KnopDelen);
        add(KnopPlus);
        add(KnopMin);
        add(KnopReset);

    }


    public void paint(Graphics g) {
    }
    class KnopvermenigvuldigenListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            input1 = Double.valueOf(tekstvak1.getText());
            input2 = Double.valueOf(tekstvak2.getText());
            antwoord = input1 + input2;
            tekstvak1.setText("" +antwoord);
            tekstvak2.setText("");
            repaint();

        }
    }

    class KnopDelenListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            input1 = Double.valueOf(tekstvak1.getText());
            input2 = Double.valueOf(tekstvak2.getText());
            antwoord = input1 + input2;
            tekstvak1.setText("" +antwoord);
            tekstvak2.setText("");
            repaint();

        }
    }

    class KnopPlusListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            input1 = Double.valueOf(tekstvak1.getText());
            input2 = Double.valueOf(tekstvak2.getText());
            antwoord = input1 + input2;
            tekstvak1.setText("" +antwoord);
            tekstvak2.setText("");
            repaint();

        }
    }

    class KnopMinListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            input1 = Double.valueOf(tekstvak1.getText());
            input2 = Double.valueOf(tekstvak2.getText());
            antwoord = input1 + input2;
            tekstvak1.setText("" +antwoord);
            tekstvak2.setText("");
            repaint();

        }
    }

    class KnopResetListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            input1 = 0;
            input2 = 0;
            antwoord = 0;
            tekstvak1.setText("");
            tekstvak2.setText("");
            repaint();

        }
    }
}
