package h05;

import java.applet.Applet;
import java.awt.Color;
import java.awt.Graphics;

@SuppressWarnings("serial")
public class Show extends Applet{
    Color opvulkleur;
    Color lijnkleur;
    int breedte;
    int hoogte;

    public void init() {
        opvulkleur = Color.MAGENTA;
        lijnkleur = Color.BLACK;
        breedte = 200;
        hoogte = 100;
    }

    public void paint(Graphics g) {
        g.setColor(lijnkleur);
        g.drawRect(hoogte, hoogte, breedte, hoogte);
        g.setColor(lijnkleur);
        g.drawRoundRect(hoogte, 225, breedte, hoogte, 30, 30);
        g.setColor(opvulkleur);
        g.fillRect(315, hoogte, breedte, hoogte);
        g.setColor(lijnkleur);
        g.drawOval(315, hoogte, breedte, hoogte);
        g.setColor(opvulkleur);
        g.fillOval(315, 225, breedte, hoogte);
        g.setColor(lijnkleur);
        g.drawOval (550, 225, hoogte, hoogte);
        g.setColor(lijnkleur);
        g.drawArc(550, hoogte, hoogte, hoogte, 360, 360);
        g.setColor(opvulkleur);
        g.fillArc(550, hoogte, hoogte, hoogte, 360, 45);
        g.setColor(lijnkleur);
        g.drawLine(105, 50, 305, 50);
        g.drawString("lijn", breedte, 70);
        g.drawString("rechthoek", 180, 215);
        g.drawString("afgeronde rechthoek", 150, 340);
        g.drawString("gevulde ovaal", 380, 340);
        g.drawString("gevulde rechthoek met ovaal", 340, 215);
        g.drawString("cirkel", 585, 340);
        g.drawString("taartpunt met ovaal eromheen", 520, 215);
    }
}