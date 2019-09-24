package h05;

import java.awt.*;
import java.applet.*;

public class Opdracht5a extends Applet {
    //declaratie.
    Color opvulkleur;
    Color lijnkleur;
    int breedteline1;
    int hoogteline1;
    int breedteline;
    int hoogteline;
    int breedteeenvoudigrechthoek;
    int hoogteeenvoudigrechthoek;
    int breedteronderechthoek;
    int hoogteronderechthoek;
    int hoogterechthoekk;
    int breedterechthoekk;
    int hoogterechthoekkk;
    int Breedterechthoekkk;
    int breedtegevulde;
    int hoogtegevulde;
    int breedtetaart;
    int hoogtetaart;
    int hoogtecirkel;
    int breedtecirkel;


    public void init() {
        //initialisatie.
        opvulkleur = Color.MAGENTA;
        lijnkleur = Color.BLACK;

        // 1 line
        breedteline1 = 30;
        hoogteline1 = 250;
        breedteline = 30;
        hoogteline = 10;

        // rechthoek
        breedteeenvoudigrechthoek = 200;
        hoogteeenvoudigrechthoek = 100;

        //afgeronde rechthoek
        hoogteronderechthoek =105;
        breedteronderechthoek = 195;

        //gevulde rechthoek met ovaal
        opvulkleur = Color.MAGENTA;
        breedterechthoekk = 195;
        hoogterechthoekk = 100;
        lijnkleur = Color.BLACK;
        Breedterechthoekkk = 195;
        hoogterechthoekkk = 100;

        //gevulde ovaal
        hoogtegevulde = 105;
        breedtegevulde = 190;

        //Taartpunt met ovaal eromheen
        hoogtetaart = 110;
        breedtetaart = 190;

        //cirkel
        hoogtecirkel = 105;
        breedtecirkel = 105;


    }


    public void paint(Graphics g) {

        //1 lijn
        g.drawLine(hoogteline, breedteline, hoogteline1, breedteline1);
        g.drawString("Lijn",110,45);


        //Rechthoek
        g.drawRect(10,60,breedteeenvoudigrechthoek,hoogteeenvoudigrechthoek);
        g.drawString("Rechthoek",80,175);


        //Afgeronde rechthoek
        g.drawRoundRect(10,190,breedteronderechthoek,hoogteronderechthoek,30,30);
        g.drawString("Afgeronde rechthoek",50,310);


        //Gevulde rechthoek met ovaal
        g.setColor(Color.magenta);
        g.fillRect(220,60,breedterechthoekk,hoogterechthoekk);
        g.setColor(Color.black);
        g.drawOval(220,60, Breedterechthoekkk, hoogterechthoekkk);
        g.drawString(" gevulde ovaal",275,175);


        //gevulde ovaal
        g.setColor(Color.magenta);
        g.fillOval(220,190,breedtegevulde,hoogtegevulde);
        g.setColor(Color.black);
        g.drawString("Gevulde ovaal",275,308);


        //Taartpunt met ovaal eromheen
        g.fillArc(430,55,breedtetaart,hoogtetaart,0,45);
        g.setColor(Color.black);
        g.drawOval(430,55,breedtetaart,hoogtetaart);
        g.drawString("Taartpunt met ovaal eromheen",455,180);


        //Cirkel
        g.drawOval(475,195,breedtecirkel,hoogtecirkel);
        g.drawString("Cirkel",515,315);



    }

}

