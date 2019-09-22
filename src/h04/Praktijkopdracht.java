package h04;

import java.awt.*;
import java.applet.*;

public class Praktijkopdracht extends Applet {

    public void init() {

    }


    public void paint(Graphics g) {

        setBackground(Color.white);

        g.setColor(Color.black);


        //1 lijn
        g.drawLine(10, 30, 250, 30);
        g.drawString("Lijn",110,45);


        //Rechthoek
        g.drawRect(10,60,200,100);
        g.drawString("Rechthoek",80,175);


        //Afgeronde rechthoek
        g.drawRoundRect(10,190,195,105,30,30);
        g.drawString("Afgeronde rechthoek",50,310);


        //Gevulde rechthoek met ovaal
        g.setColor(Color.magenta);
        g.fillRect(220,60,195,100);
        g.setColor(Color.black);
        g.drawOval(220,60,195,100);
        g.drawString("Gevulde ovaal",275,175);


        //gevulde ovaal
        g.setColor(Color.magenta);
        g.fillOval(220,190,190,105);
        g.setColor(Color.black);
        g.drawString("Gevulde ovaal",275,308);


        //Taartpunt met ovaal eromheen
        g.fillArc(430,55,190,110,0,45);
        g.setColor(Color.black);
        g.drawOval(430,55,190,110);
        g.drawString("Taartpunt met ovaal eromheen",455,180);


        //Cirkel
        g.drawOval(475,195,105,105);
        g.drawString("Cirkel",515,315);





    }

}