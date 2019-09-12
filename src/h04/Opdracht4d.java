package h04;
import java.awt.*;
import java.applet.Applet;

public class Opdracht4d extends Applet {
    public void init() {
    }

    public void paint(Graphics g) {
        //Verticale as
        g.drawLine(80, 80, 80, 350);
        // Horzitontale as
        g.drawLine(80, 350, 350, 350);

        // teken cijfers
        g.drawString("0", 70, 350);
        g.drawString("20",60, 300);
        g.drawString("40",60, 250);
        g.drawString("60",60, 200);
        g.drawString("80",60, 150);
        g.drawString("100",55,100);

        // Namen toevoegen
        g.drawString("valerie",100,370);
        g.drawString("jeroen",185, 370);
        g.drawString("hans",265, 370);



        // Teken staven
        g.setColor(Color.yellow);
        g.fillRect(81,250,80, 100);

        g.setColor(Color.red);
        g.fillRect(161,95,80,255);

        g.setColor(Color.blue);
        g.fillRect(241,145,80,205);

    }
}