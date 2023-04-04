/***********************************************************************
 * Module:  ConEntity.java
 * Author:  Yelja
 * Purpose: Defines the Class ConEntity
 ***********************************************************************/

package model.datamodel.objects;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.JFrame;
import javax.swing.JPanel;
/**
 * Omogućava kreiranje i iscrtavanje netiteta u konceptualnom modelu.
 * 
 * @see Element
 * @author Grupa 1
 * @version 1.0
 *
 */
public class ConEntity extends Element {

	private String name;
	private static int objectCount = 1;
	private static int width = 120;
	private static int height = 90;
	
	public ConEntity(int x, int y) {
		super(x, y);
		this.name = "Entity" + objectCount;
		ConEntity.objectCount++;
	}

	public ConEntity() {
		super();
		this.name = "Entity" + objectCount;
		ConEntity.objectCount++;
	}

	@Override
	public void draw(Graphics g) {
		
		Graphics2D g2d = (Graphics2D) g;
		
		BasicStroke bs1 = new BasicStroke(2, BasicStroke.CAP_SQUARE, BasicStroke.JOIN_MITER, 5);
		g2d.setPaint(new GradientPaint(x,y, new Color(178, 237, 227),x + width, y + height, new Color(161, 181, 201)));
		g2d.fillRect(x, y, width, height);

		g2d.setStroke(bs1);
		g2d.setColor(new Color(60, 120, 50));
		g2d.drawRect(x, y, width, height);
		g2d.drawLine(x, y + height/3, x + width, y + height/3);
		g2d.drawLine(x, y + 2*height/3, x + width, y + 2*height/3);
		
		g2d.setColor(new Color(40, 100, 50));
		g2d.setFont(new Font("Helvetica", Font.PLAIN, 16));
		int nameOffset = g2d.getFontMetrics().charsWidth(name.toCharArray(), 0, name.length()/2);
		g2d.drawString(name, x + width/2 - nameOffset, y + height/2 - height/3 + g2d.getFontMetrics().getDescent());
		
	}
	
}
