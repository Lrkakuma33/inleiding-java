package h11;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class praktijkop1 extends Applet {

    TextField textfield;
    Button Ok;
    int inputnumber;
    int result;


    public void init() {
        textfield = new TextField("", 25);
        Ok = new Button("Ok");
        Ok.addActionListener(new OkListener());
        add(textfield);
        add(Ok);

    }



    class OkListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            inputnumber = Integer.valueOf(textfield.getText());

            if (inputnumber > 1000) {
                inputnumber = 1;

            }

            repaint();

        }

    }


    public void paint(Graphics g) {
        int y = 40;
        for (int teller = 0; teller < 10; teller++) {
            result = inputnumber * (teller + 1);
            g.drawString((teller + 1) + " X " + inputnumber + " = " + result, 20, y);
            y += 20;

        }

    }

}