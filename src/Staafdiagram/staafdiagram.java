package Staafdiagram;

import java.applet.Applet;
import java.awt.Graphics;

public class staafdiagram extends Applet{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	int valerie = 40;
	int jeroen = 100;
	int hans = 80;
	int breedtescherm;
	int hoogtescherm;
	int margeH;
	int margeV;
	int hoogteYas;
	int maxGewicht = 140;
	int aantalStrepen = 7;
	int breedtestaaf;
	
	public void init() {
		breedtescherm = 500;
		hoogtescherm = 400;
		this.setSize(breedtescherm, hoogtescherm);
        margeH = breedtescherm / 10;
	    margeV = hoogtescherm / 10;
	    hoogteYas = hoogtescherm - margeH * 2;
	    breedtestaaf = margeH;
	}
	
	
	public void paint(Graphics g) {
	breedtescherm = this.getWidth();
    hoogtescherm = this.getHeight();
    margeH = breedtescherm / 10;
    margeV = hoogtescherm / 10;
    hoogteYas = hoogtescherm - margeH * 2;
	//teken de x-as, marge = 10%
	int x = margeH;
	int y = hoogtescherm - margeV;
	int x2 = breedtescherm - margeH;
	int y2 = y;
	g.drawLine(x, y, x2, y2);
	
	//teken de y-as
	y2 = margeV;
	x2 = x;
	g.drawLine(x, y, x2, y2);
	
	//teken schaalstreepje op y-as
	int breedteStreep = 5;
	x -= breedteStreep;
	g.drawLine(x, y, x + breedteStreep, y);
	y -= hoogteYas / aantalStrepen;
	g.drawLine(x, y, x + breedteStreep, y);
	y -= hoogteYas / aantalStrepen;
	g.drawLine(x, y, x + breedteStreep, y);
	y -= hoogteYas / aantalStrepen;
	g.drawLine(x, y, x + breedteStreep, y);
	y -= hoogteYas / aantalStrepen;
	g.drawLine(x, y, x + breedteStreep, y);
	y -= hoogteYas / aantalStrepen;
	g.drawLine(x, y, x + breedteStreep, y);
	y -= hoogteYas / aantalStrepen;
	g.drawLine(x, y, x + breedteStreep, y);
	
	
	//teken staaf Valerie
	x = margeH * 2;
	y = hoogtescherm - margeV;
	y -= (hoogteYas / maxGewicht) * valerie;
	int height = (hoogteYas / maxGewicht) * valerie;
	g.fillRect(x, y, breedtestaaf, height);
	
	//teken staaf jeroen
	x += margeH + breedtestaaf;
	y = hoogtescherm - margeV;
	y -= (hoogteYas / maxGewicht) * jeroen;
	height = (hoogteYas / maxGewicht) * jeroen;
	g.fillRect(x, y, breedtestaaf, height);

	// teken staaf hans
	x += margeH + breedtestaaf;
	y = hoogtescherm - margeV;
	y -= (hoogteYas / maxGewicht) * hans;
	height = (hoogteYas / maxGewicht) * hans;
	g.fillRect(x, y, breedtestaaf, height);
	

	}
}
