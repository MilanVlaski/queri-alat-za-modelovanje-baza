/***********************************************************************
 * Module:  PhysAppFactory.java
 * Author:  PC
 * Purpose: Defines the Class PhysAppFactory
 ***********************************************************************/

package model.appmodel;

import java.util.*;
import model.datamodel.Model;
import view.menubar.DefaultMenuBar;
import view.objectbox.AbstractObjectBox;
/**
 * Klasom se predstavlja izgled aplikacije pri kreiranju fizičkog modela.
 * 
 * @see AppFactory
 * @author Grupa 1
 * @version 1.0
 *
 */
public class PhysAppFactory implements AppFactory {
	
   public AbstractObjectBox createObjectBox() {
      // TODO: implement
      return null;
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
	
	@Override
	public DefaultMenuBar createMenuBar(ApplicationModel appModel) {
		// TODO Auto-generated method stub
		return null;
	}

}