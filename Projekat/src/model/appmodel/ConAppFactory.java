/***********************************************************************
 * Module:  ConAppFactory.java
 * Author:  PC
 * Purpose: Defines the Class ConAppFactory
 ***********************************************************************/

package model.appmodel;

import java.util.*;

import model.datamodel.Model;
import view.menubar.ConceptualMenuBar;
import view.menubar.DefaultMenuBar;
import view.objectbox.AbstractObjectBox;
import view.objectbox.ConceptualObjectBox;
import model.datamodel.ConceptualModel;
import model.datamodel.Model;
import model.datamodel.ConceptualModel;
import model.datamodel.Model;
/**
 * Klasa implementira način prikazivanja aplikacije prilikom kreiranja konceptualnog modela.
 * 
 * @see AppFactory
 * @author Grupa 1
 * @version 1.0
 */
public class ConAppFactory implements AppFactory {
	
   public Model createModelWithName(String name) {
	   ConceptualModel m = new ConceptualModel(name);
	   m.addDiagram(m.createDiagram(name));
	   return m;
   }
   public Model createModel() {
	   
	   ConceptualModel m = new ConceptualModel();
	   m.addDiagram(m.createDiagram());
	   return m;
   }
   
   public AbstractObjectBox createObjectBox(ApplicationModel appModel) {
      return new ConceptualObjectBox(appModel);
   }
   
   public DefaultMenuBar createMenuBar(ApplicationModel appModel) {
      return new ConceptualMenuBar(appModel);
   }
	@Override
	public AbstractObjectBox createObjectBox() {
		// TODO Auto-generated method stub
		return null;
	}

}