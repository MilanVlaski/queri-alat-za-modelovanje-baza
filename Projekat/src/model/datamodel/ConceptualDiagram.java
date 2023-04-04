/***********************************************************************
 * Module:  ConceptualDiagram.java
 * Author:  Yelja
 * Purpose: Defines the Class ConceptualDiagram
 ***********************************************************************/

package model.datamodel;

import java.util.*;


import model.appmodel.ApplicationModel;
import model.datamodel.objects.ConAssociationLink;
import model.datamodel.objects.ConAssociativeEntity;
import model.datamodel.objects.ConEntity;
import model.datamodel.objects.ConInheritanceLink;
import model.datamodel.objects.ConInheritanceNode;
import model.datamodel.objects.ConRelationship;
import model.datamodel.objects.Object;
/**
 * Definiše izgled konceptualnog dijagrama.
 * 
 * @see Diagram
 * @author Grupa 1
 * @version 1.0
 *
 */
public class ConceptualDiagram extends Diagram {
	public ConceptualDiagram(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	public ConceptualDiagram() {
		super("ConceptualDiagram" + ApplicationModel.diagramCount);
		ApplicationModel.diagramCount++;
	}


/** @param type */
   public Object createObject(String type) {
	   
	   Object result = null;
      switch (type) {
		case "ENTITY": result = new ConEntity(); break;
		case "RELATIONSHIP": result = new ConRelationship(); break;
		case "ASSOCIATION_LINK": result = new ConAssociationLink(); break;
		case "ASSOCIATIVE_ENTITY": result = new ConAssociativeEntity(); break;
		case "INHERITANCE_LINK": result = new ConInheritanceLink(); break;
		case "INHERITANCE_NODE": result = new ConInheritanceNode(); break;
	default:
		throw new IllegalArgumentException("Unexpected value: " + type);
	}
      return result;
   }

}