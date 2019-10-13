package h08;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Opdracht8c extends Applet {
    TextField tekstvak;
    Button KnopOK;
    Button KnopReset;
    Label label;
    double bedragnietafgerond;
    double bedrag10x;
    int bedragint;
    double bedrag;

    public void init() {
        label = new Label("Vul bedrag in ");
        add(label);

        tekstvak = new TextField(20);
        KnopOK = new Button("OK");
        KnopReset = new Button("Reset");
        KnopOK.addActionListener(new Opdracht8c.KnopOKlistener());
        KnopReset.addActionListener(new Opdracht8c.KnopResetlistener());
        add(tekstvak);
        add(KnopOK);
        add(KnopReset);

    }


    public void paint(Graphics g) {
        super.paint(g);
        g.drawString("" +bedrag, 60, 100);

    }
    public void repaint() {
        super.repaint();
    }

    class KnopOKlistener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            bedragnietafgerond = Double.parseDouble(tekstvak.getText());
            bedragnietafgerond = bedragnietafgerond * 1.21;
            bedrag10x = bedragnietafgerond * 10;
            bedragint = (int) bedrag10x;
            bedrag = (double) bedragint / 10;

            repaint();
        }
    }

    public class KnopResetlistener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            tekstvak.setText("");
            bedrag = 0;
            repaint();
            
        }
    }
}
