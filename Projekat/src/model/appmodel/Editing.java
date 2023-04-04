/***********************************************************************
 * Module:  Editing.java
 * Author:  Yelja
 * Purpose: Defines the Class Editing
 ***********************************************************************/

package model.appmodel;


import model.datamodel.Diagram;
import model.datamodel.DiagramState;
import model.datamodel.Model;
import model.datamodel.Project;
import view.menubar.DefaultMenuBar;
import view.objectbox.AbstractObjectBox;
/**
 * Klasa definiše izgled aplikacije kada je u stanju Editing.
 * 
 * @see ApplicationState
 * @see DiagramState
 * @author Grupa 1
 * @version 1.0
 */
public class Editing implements ApplicationState, DiagramState {
   
	private String nameOfState = "Editing";
	
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

	@Override
	public void addElement(Diagram context, int x, int y) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void addLink(Diagram context, int x1, int y1, int x2, int y2) {
		// TODO Auto-generated method stub
		
	}





}