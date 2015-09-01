package h06;

import java.awt.*;
import java.applet.*;


public class H6o1 extends Applet {
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	int a, b ;
    double uitkomst;
	
	
    public void init() {
        a = 113;
        b = 4;
        
        uitkomst = (a / b) ;}

    public void paint(Graphics g) {
        g.drawString("Jan: " + uitkomst, 20, 20);
        g.drawString("Nino: " + uitkomst, 20, 40);
        g.drawString("Jeannette: " + uitkomst, 20, 60);
        g.drawString("Ali: " + uitkomst , 20, 80);
        g.drawString("Totaal : 113 euro", 20, 110);
    }
    
}