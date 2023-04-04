/***********************************************************************
 * Module:  Active.java
 * Author:  Yelja
 * Purpose: Defines the Class Active
 ***********************************************************************/

package model.appmodel;

import java.util.*;

import model.datamodel.Model;
import model.datamodel.Project;
import view.menubar.DefaultMenuBar;
import view.objectbox.AbstractObjectBox;
/**
 * Klasom se predstavlja izgled aplikacije kada je u aktivnom stanju.
 * 
 * @see ApplicationState
 * @author Grupa 1
 * @version 1.0
 */
public class Active implements ApplicationState {

	private String nameOfState = "Active";
	
	public void newModel(ApplicationModel appModel, ModelType type, String name) {
		appModel.setCurrentModelType(type);
		Model model = appModel.getAppFactory().createModelWithName(name);
		appModel.addComponents(model);
		appModel.notifyAllObservers();
	}
	
	@Override
	public void newProject(ApplicationModel appModel, String name) {
		appModel.addComponents(new Project(name));
		appModel.notifyAllObservers();
		
	}
	

   
   public Project createProject() {
      // TODO: implement
      return null;
   }

	@Override
	public AbstractObjectBox createObjectBox(ApplicationModel context) {
		return context.getAppFactory().createObjectBox();
	}
	
	@Override
	public DefaultMenuBar createMenuBar(ApplicationModel context) {
		return context.getAppFactory().createMenuBar(context);
	}

	@Override
	public String getNameOfState() {
		return nameOfState;
	}





}