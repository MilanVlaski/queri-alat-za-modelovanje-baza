/***********************************************************************
 * Module:  ConRelationship.java
 * Author:  Yelja
 * Purpose: Defines the Class ConRelationship
 ***********************************************************************/

package model.datamodel.objects;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Line2D;
import java.util.*;
/**
 * Omogućava kreiranje i iscrtavanje linka veze u konceptualnom modelu.
 * 
 * @see Link
 * @author Grupa 1
 * @version 1.0
 *
 */
public class ConRelationship extends Link {

	private String name;
	private static int relCount = 1;
   
   public ConRelationship() {
		super();
		this.name = "RELATIONSHIP_" + relCount;
		ConRelationship.relCount++;
	}

	public ConRelationship(int x1, int y1, int x2, int y2) {
		super(x1, y1, x2, y2);
		this.name = "RELATIONSHIP_" + relCount;
		ConRelationship.relCount++;
	}

	@Override
	public void draw(Graphics g) {
		
		Graphics2D g2d = (Graphics2D) g;
		BasicStroke bs1 = new BasicStroke(1.5f);
		
		g2d.setStroke(bs1);
		g2d.setColor(new Color(59, 219, 203));
		
		Line2D line = new Line2D.Double(x1, y1, x2, y2);
		
		g2d.draw(line);
		
		g2d.setColor(new Color(14, 131, 136));
		g2d.setFont(new Font("Consola", Font.PLAIN, 10));
		int nameOffset = g2d.getFontMetrics().charsWidth(name.toCharArray(), 0, name.length()/2);
		g2d.drawString(name, (x1 + x2)/2  - nameOffset, (y1 + y2)/2 + g2d.getFontMetrics().getAscent());
	}

}