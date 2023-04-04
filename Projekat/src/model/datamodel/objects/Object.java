/***********************************************************************
 * Module:  Object.java
 * Author:  Yelja
 * Purpose: Defines the Class Object
 ***********************************************************************/

package model.datamodel.objects;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.util.*;

public abstract class Object {
   private DrawInterface drawInterface;
   
   public abstract void draw(Graphics g);
   public void delete() {
      // TODO: implement
   }

}