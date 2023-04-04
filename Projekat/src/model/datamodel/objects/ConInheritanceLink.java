/***********************************************************************
 * Module:  ConInheritanceLink.java
 * Author:  Yelja
 * Purpose: Defines the Class ConInheritanceLink
 ***********************************************************************/

package model.datamodel.objects;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Line2D;
import java.util.*;
/**
 * Omogućava kreiranje i iscrtavanje linka za naslijeđivanje u konceptualnom modelu.
 * 
 * @see Link
 * @author Grupa 1
 * @version 1.0
 *
 */
public class ConInheritanceLink extends Link {
	
	private String name;
	private static int relCount = 1;

public ConInheritanceLink() {
		super();
		this.name = "INHERITANCE_LINK_" + relCount;
		ConInheritanceLink.relCount++;
	}



	public ConInheritanceLink(int x1, int y1, int x2, int y2) {
		super(x1, y1, x2, y2);
		this.name = "INHERITANCE_LINK_" + relCount;
		ConInheritanceLink.relCount++;
	}



	@Override
	public void draw(Graphics g) {
		
		Graphics2D g2d = (Graphics2D) g;
		BasicStroke bs1 = new BasicStroke(1.5f);
		
		g2d.setStroke(bs1);
		g2d.setColor(new Color(49, 14, 136));
		
		Line2D line = new Line2D.Double(x1, y1, x2, y2);
		
		g2d.draw(line);
	}

}