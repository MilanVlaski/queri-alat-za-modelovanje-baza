/***********************************************************************
 * Module:  PhysicalModel.java
 * Author:  Yelja
 * Purpose: Defines the Class PhysicalModel
 ***********************************************************************/

package model.datamodel;

import java.io.File;
import java.util.*;

import model.appmodel.ApplicationModel;
/**
 * Definiše Fizički model.
 * 
 * @see Model
 * @author Grupa 1
 * @version 1.0
 *
 */
public class PhysicalModel extends Model {
   public PhysicalModel(String name, String location) {
		super(name, location);
	}

	public PhysicalModel(String name) {
		super(name);
	}

	public PhysicalModel() {
		super("PhysicalModel"+ApplicationModel.modelCount);
		ApplicationModel.modelCount++;
	}

private SQLScriptGenerator sqlScriptGenerator;
   
   public Diagram createDiagram() {
      // TODO: implement
      return null;
   }
   
   public File generateScript() {
      // TODO: implement
      return null;
   }

@Override
public Diagram createDiagram(String name) {
	// TODO Auto-generated method stub
	return null;
}

}