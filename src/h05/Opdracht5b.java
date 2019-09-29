package h05;
import java.awt.*;
import java.applet.Applet;

public class Opdracht5b extends Applet {
    // Variabelen declaren
    int gewichtValerie;
    int hoogteX;
    int gewichtJeroen;
    int gewichtHans;



    public void init() {

        // Variabelen initialiseren
        gewichtValerie = 40;
        hoogteX = 350;
        gewichtJeroen = 100;
        gewichtHans = 80;


    }

    public void paint(Graphics g) {
        //Verticale as
        g.drawLine(80, 220, 80, hoogteX);
        // Horzitontale as
        g.drawLine(80, hoogteX, hoogteX, hoogteX);

        // teken cijfers
        g.drawString("0", 60, 350);
        g.drawString("20",60, 330);
        g.drawString("40",60, 310);
        g.drawString("60",60, 290);
        g.drawString("80",60, 270);
        g.drawString("100",55,250);

        // Namen toevoegen
        g.drawString("valerie",100,370);
        g.drawString("jeroen",185, 370);
        g.drawString("hans",265, 370);



        // Teken staven
        // Valerie
        g.setColor(Color.yellow);
        g.fillRect(81,hoogteX - gewichtValerie,80, gewichtValerie);

        // Jeroen
        g.setColor(Color.red);
        g.fillRect(161,hoogteX - gewichtJeroen,80,gewichtJeroen);

        // Hans
        g.setColor(Color.blue);
        g.fillRect(241,hoogteX - gewichtHans,80,gewichtHans);

    }
}