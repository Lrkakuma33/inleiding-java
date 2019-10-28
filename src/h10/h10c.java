package h10;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class h10c extends Applet {

    TextField tekstvak;
    int Maand;
    int Dagen;
    String Maandnaam;
    Label label;


    public void init() {

        tekstvak = new TextField(15);
        tekstvak.addActionListener(new TekstListener());
        label = new Label("Type het Maandnummer en druk op enter:");
        add(label);
        add(tekstvak);

    }



    public void paint(Graphics g) {
        g.drawString(" De maand "+ Maandnaam +" heeft " + Dagen + " dagen." ,45,100);

    }

    class TekstListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            Maand = Integer.valueOf(tekstvak.getText());

            switch (Maand){
                case 1:
                    Maandnaam = "januari";
                    Dagen = 31;
                    break;

                case 2:
                    Maandnaam = "februari";
                    Dagen = 28;
                    break;

                case 3:
                    Maandnaam = "maart";
                    Dagen = 31;
                    break;

                case 4:
                    Maandnaam = "april";
                    Dagen = 30;
                    break;

                case 5:
                    Maandnaam = "mei";
                    Dagen = 31;
                    break;

                case 6:
                    Maandnaam = "juni";
                    Dagen = 30;
                    break;

                case 7:
                    Maandnaam = "juli";
                    Dagen = 31;
                    break;

                case 8:
                    Maandnaam = "augustus";
                    Dagen = 31;
                    break;

                case 9:
                    Maandnaam = "september";
                    Dagen = 30;
                    break;

                case 10:
                    Maandnaam = "oktober";
                    Dagen = 31;
                    break;

                case 11:
                    Maandnaam = "november";
                    Dagen = 30;
                    break;

                case 12:
                    Maandnaam = "december";
                    Dagen = 31;
                    break;

                default:
                    Maandnaam = "0";
                    Dagen = 0;
                    break;


            }
            repaint();

            }

    }
}