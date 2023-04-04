/***********************************************************************
 * Module:  ConAssociationLink.java
 * Author:  Yelja
 * Purpose: Defines the Class ConAssociationLink
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
 * Omogućava kreiranje linka asocijacije i njegovo iscrtavanje.
 * 
 * @see Link
 * @author Grupa 1
 * @version 1.0
 */
public class ConAssociationLink extends Link {
   
	private String name;
	private static int relCount = 1;
   
   public ConAssociationLink() {
		super();
		this.name = "ASSOCIATION_LINK_" + relCount;
		ConAssociationLink.relCount++;
	}

	public ConAssociationLink(int x1, int y1, int x2, int y2) {
		super(x1, y1, x2, y2);
		this.name = "ASSOCIATION_LINK_" + relCount;
		ConAssociationLink.relCount++;
	}

	@Override
	public void draw(Graphics g) {
		
		Graphics2D g2d = (Graphics2D) g;
		BasicStroke bs1 = new BasicStroke(1.5f);
		
		g2d.setStroke(bs1);
		g2d.setColor(new Color(59, 168, 219));
		
		Line2D line = new Line2D.Double(x1, y1, x2, y2);
		
		g2d.draw(line);
		
		g2d.setColor(new Color(44, 118, 184));
		g2d.setFont(new Font("Consola", Font.PLAIN, 10));
		int nameOffset = g2d.getFontMetrics().charsWidth(name.toCharArray(), 0, name.length()/2);
		g2d.drawString(name, (x1 + x2)/2  - nameOffset, (y1 + y2)/2 + g2d.getFontMetrics().getAscent());
	}

}