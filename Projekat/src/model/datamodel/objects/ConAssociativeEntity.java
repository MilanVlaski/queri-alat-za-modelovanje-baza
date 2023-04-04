/***********************************************************************
 * Module:  ConAssociativeEntity.java
 * Author:  Yelja
 * Purpose: Defines the Class ConAssociativeEntity
 ***********************************************************************/

package model.datamodel.objects;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Font;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.util.*;
/**
 * Omogućava kreiranje i iscrtavanje asocijativnog entiteta.
 * 
 * @see Element
 * @author Grupa 1
 * @version 1.0
 *
 */
public class ConAssociativeEntity extends Element {
	
	private String name;
	private static int objectCount = 1;
	private static int width = 120;
	private static int height = 90;
	
   public ConAssociativeEntity(int x, int y) {
		super(x, y);
		this.name = "Association" + objectCount;
		ConAssociativeEntity.objectCount++;
	}

   
	public ConAssociativeEntity() {
		super();
		this.name = "Entity" + objectCount;
		ConAssociativeEntity.objectCount++;
	}

@Override
public void draw(Graphics g) {
	
	Graphics2D g2d = (Graphics2D) g;
	
	
	BasicStroke bs1 = new BasicStroke(2, BasicStroke.CAP_SQUARE, BasicStroke.JOIN_MITER, 5);
	g2d.setPaint(new GradientPaint(x,y, new Color(178, 227, 237), x + width, y + height, new Color(178, 191, 237)));
	g2d.fillRoundRect(x, y, width, height, 35, 35);

	g2d.setStroke(bs1);
	g2d.setColor(new Color(50, 59, 120));
	g2d.drawRoundRect(x, y, width, height, 35, 35);
	g2d.drawLine(x, y + height/3, x + width, y + height/3);
	g2d.drawLine(x, y + 2*height/3, x + width, y + 2*height/3);
	
	g2d.setColor(new Color(50, 59, 120));
	g2d.setFont(new Font("Helvetica", Font.PLAIN, 16));
	int nameOffset = g2d.getFontMetrics().charsWidth(name.toCharArray(), 0, name.length()/2);
	g2d.drawString(name, x + width/2 - nameOffset, y + height/2 - height/3 + g2d.getFontMetrics().getDescent());
	
}

}