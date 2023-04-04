/***********************************************************************
 * Module:  PhysicalDiagram.java
 * Author:  Yelja
 * Purpose: Defines the Class PhysicalDiagram
 ***********************************************************************/

package model.datamodel;

import java.util.*;

import model.appmodel.ApplicationModel;
import model.datamodel.objects.Object;
/**
 * Definiše fizički dijagram. 
 * 
 * @see Diagram
 * @author Grupa 1
 * @version 1.0
 *
 */
public class PhysicalDiagram extends Diagram {

/** @param type */
   public PhysicalDiagram(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}
   public PhysicalDiagram() {
	super("PhysicalDiagram"+ApplicationModel.diagramCount);
	ApplicationModel.diagramCount++;
}

/** @param type */
   public Object createObject(String type) {
      // TODO: implement
      return null;
   }

}