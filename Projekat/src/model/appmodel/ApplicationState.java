/***********************************************************************
 * Module:  ApplicationState.java
 * Author:  Yelja
 * Purpose: Defines the Interface ApplicationState
 ***********************************************************************/

package model.appmodel;


import model.datamodel.Project;
import view.menubar.DefaultMenuBar;
import view.objectbox.AbstractObjectBox;

public interface ApplicationState {
	void newModel(ApplicationModel appModel , ModelType type, String name);
	void newProject(ApplicationModel appModel, String name);
	Project createProject();
	AbstractObjectBox createObjectBox(ApplicationModel context);
	DefaultMenuBar createMenuBar(ApplicationModel context);
	public String getNameOfState();
}