/***********************************************************************
 * Module:  LogAppFactory.java
 * Author:  PC
 * Purpose: Defines the Class LogAppFactory
 ***********************************************************************/

package model.appmodel;

import java.util.*;
import model.datamodel.Model;
import view.menubar.DefaultMenuBar;
import view.menubar.LogicalMenuBar;
import view.objectbox.AbstractObjectBox;
import view.objectbox.ConceptualObjectBox;
import view.objectbox.LogicalObjectBox;
/**
 * Klasom se predstavlja izgled aplikacije pri kreiranju logičkog modela.
 * 
 * @see AppFactory
 * @author Grupa 1
 * @version 1.0
 *
 */
public class LogAppFactory implements AppFactory {
   @Override
   public AbstractObjectBox createObjectBox() {
      // TODO: implement
      return new LogicalObjectBox();
   }
   @Override
   public DefaultMenuBar createMenuBar(ApplicationModel appModel) {
      // TODO: implement
      return new LogicalMenuBar(appModel);
   }

	@Override
	public Model createModelWithName(String name) {
		// TODO Auto-generated method stub
		return null;
	}
	
	@Override
	public Model createModel() {
		// TODO Auto-generated method stub
		return null;
	}

}