/***********************************************************************
 * Module:  Element.java
 * Author:  Yelja
 * Purpose: Defines the Class Element
 ***********************************************************************/

package model.datamodel.objects;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics2D;
import java.awt.geom.Point2D;
import java.util.*;
/**
 * Klasa koja sadrži osnovna svojstva svih elemenata.
 * 
 * @see Object
 * @author Grupa 1
 * @version 1.0
 */
public abstract class Element extends Object {
	
	protected int x;
	protected int y;
	
	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}
	
	public Element(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}
   
	public Element() {
		super();
	}

   
   public void delete() {
      // TODO: implement
   }
}