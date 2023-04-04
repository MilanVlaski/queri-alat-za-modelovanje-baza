/***********************************************************************
 * Module:  LogicalModel.java
 * Author:  Yelja
 * Purpose: Defines the Class LogicalModel
 ***********************************************************************/

package model.datamodel;

import java.util.*;

import model.appmodel.ApplicationModel;
/**
 * Definiše logički model.
 * 
 * @see Model
 * @author Grupa 1
 * @version 1.0
 *
 */
public class LogicalModel extends Model {
   public LogicalModel(String name) {
		super(name);
	}
   
	public LogicalModel(String name, String location) {
		super(name, location);
	}
	public LogicalModel() {
		super("LogicalModel"+ApplicationModel.modelCount);
		ApplicationModel.modelCount++;
	}

public Diagram createDiagram() {
      // TODO: implement
      return null;
   }

@Override
public Diagram createDiagram(String name) {
	// TODO Auto-generated method stub
	return null;
}

}