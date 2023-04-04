/***********************************************************************
 * Module:  LogicalDiagram.java
 * Author:  Yelja
 * Purpose: Defines the Class LogicalDiagram
 ***********************************************************************/

package model.datamodel;

import java.util.*;

import model.appmodel.ApplicationModel;
import model.datamodel.objects.Object;
/**
 * Definiše logički dijagram.
 * 
 * @see Diagram
 * @author Grupa 1
 * @version 1.0
 *
 */
public class LogicalDiagram extends Diagram {

/** @param type */
   public LogicalDiagram(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}
public LogicalDiagram() {
	super("LogicalDiagram"+ApplicationModel.diagramCount);
	ApplicationModel.diagramCount++;
}
/** @param type */
   public Object createObject(String type) {
      // TODO: implement
      return null;
   }

}