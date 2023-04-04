/***********************************************************************
 * Module:  ConInheritanceNode.java
 * Author:  Yelja
 * Purpose: Defines the Class ConInheritanceNode
 ***********************************************************************/

package model.datamodel.objects;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.util.*;
/**
 * Omogućava kreiranje i iscrtavanje čvora naslijeđivanje u konceptualnom modelu. 
 * 
 * @see Element
 * @author Grupa 1
 * @version 1.0
 *
 */
public class ConInheritanceNode extends Element {

	private String name;
	private static int objectCount = 1;
	private static int width = 32;
	private static int height = 32;
	
	public ConInheritanceNode(int x, int y) {
			super(x, y);
			this.name = "Inheritance node" + objectCount;
			ConInheritanceNode.objectCount++;
		}
	
	public ConInheritanceNode() {
			super();
			this.name = "Inheritance node" + objectCount;
			ConInheritanceNode.objectCount++;
		}

	@Override
	public void draw(Graphics g) {
		
		Graphics2D g2d = (Graphics2D) g;
		
		BasicStroke bs1 = new BasicStroke(2, BasicStroke.CAP_SQUARE, BasicStroke.JOIN_MITER, 5);
		g2d.setPaint(new GradientPaint(x,y, new Color(178, 237, 226), x + width, y + height, new Color(178, 237, 210)));
		g2d.fillArc(x, y, width, height, 0, 180);
		
		g2d.setStroke(bs1);
		g2d.setColor(new Color(86, 50, 120));
		g2d.drawArc(x, y, width, height, 0, 180);
		g2d.drawLine(x, y + height/2, x + width, y + height/2);
		
	}

}