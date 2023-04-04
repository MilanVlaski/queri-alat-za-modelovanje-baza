/***********************************************************************
 * Module:  ConceptualModel.java
 * Author:  Yelja
 * Purpose: Defines the Class ConceptualModel
 ***********************************************************************/

package model.datamodel;

import java.util.*;

import model.appmodel.ApplicationModel;
/**
 * Definiše konceptualni model.
 * 
 * @see Model
 * @author Grupa 1
 * @version 1.0
 *
 */
public class ConceptualModel extends Model {
	
	
   public ConceptualModel(String name, String location) {
		super(name, location);
	}

	public ConceptualModel(String name) {
		super(name);
	}
	public ConceptualModel() {
		super("ConceptualModel"+ApplicationModel.modelCount);
		ApplicationModel.modelCount++;
	}

public Diagram createDiagram(String name) {
      
      return new ConceptualDiagram(name);
}
public Diagram createDiagram() {
    
    return new ConceptualDiagram();
}


}