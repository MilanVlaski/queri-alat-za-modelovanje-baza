/***********************************************************************
 * Module:  Idle.java
 * Author:  Yelja
 * Purpose: Defines the Class Idle
 ***********************************************************************/

package model.appmodel;


import java.util.Vector;

import javax.swing.JPanel;

import model.datamodel.Model;
import model.datamodel.Project;
import view.Menu;
import view.menubar.DefaultMenuBar;
import view.objectbox.AbstractObjectBox;
import view.objectbox.ConceptualObjectBox;
/**
 * Klasom se predstavlja izgled aplikacije kada je u stanju Idle.
 * 
 * @see ApplicationState
 * @author Grupa 1
 * @version 1.0
 */
public class Idle implements ApplicationState {

	private String nameOfState = "Idle";
	
	public void newModel(ApplicationModel appModel, ModelType type, String name) {
		
		appModel.setCurrentModelType(type);
		Model model = appModel.getAppFactory().createModelWithName(name);
		appModel.addComponents(model);
		appModel.setCurrentState(new Active());
		appModel.notifyAllObservers();
	}
   
   public void newProject(ApplicationModel appModel, String name) {
	   appModel.addComponents(new Project(name));
	   appModel.setCurrentState(new Active());
	   appModel.notifyAllObservers();
   }


	@Override
	public AbstractObjectBox createObjectBox(ApplicationModel context) {
		return new ConceptualObjectBox(context);
	}
	
	@Override
	public DefaultMenuBar createMenuBar(ApplicationModel context) {
		return new DefaultMenuBar(context);
	}
	
	@Override
	public String getNameOfState() {
		return nameOfState;
	}

	@Override
	public Project createProject() {
		// TODO Auto-generated method stub
		return null;
	}



}