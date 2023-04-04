/***********************************************************************
 * Module:  Project.java
 * Author:  Yelja
 * Purpose: Defines the Class Project
 ***********************************************************************/

package model.datamodel;

import java.util.*;

import model.appmodel.ApplicationModel;
/**
 * Omogućava kreiranje projekta.
 * Omoguća rad sa modelima u projektu.
 * 
 * @see WorkspaceComponent
 * @author Grupa 1
 * @version 1.0
 *
 */
public class Project extends WorkspaceComponent {
   private java.util.List<WorkspaceComponent> models;
   
   
   public Project(String name, String location) {
		super(name, location);
   }
   public Project(String name) {
	   super(name);
   }
   public Project(){
	   super("Project"+ApplicationModel.projectCount);
	   ApplicationModel.projectCount++;
   }

/** @pdGenerated default getter */
   public java.util.List<WorkspaceComponent> getModels() {
      if (models == null)
         models = new java.util.Vector<WorkspaceComponent>();
      return models;
   }
   
   /** @pdGenerated default iterator getter */
   public java.util.Iterator getIteratorModels() {
      if (models == null)
         models = new java.util.Vector<WorkspaceComponent>();
      return models.iterator();
   }
   
   /** @pdGenerated default setter
     * @param newModels */
   public void setModels(java.util.List<WorkspaceComponent> newModels) {
      removeAllModels();
      for (java.util.Iterator iter = newModels.iterator(); iter.hasNext();)
         addModel((WorkspaceComponent)iter.next());
   }
   
   /** @pdGenerated default add
     * @param newWorkspaceComponent */
   public void addModel(WorkspaceComponent newWorkspaceComponent) {
      if (newWorkspaceComponent == null)
         return;
      if (this.models == null)
         this.models = new java.util.Vector<WorkspaceComponent>();
      if (!this.models.contains(newWorkspaceComponent) && newWorkspaceComponent instanceof Model)
         this.models.add(newWorkspaceComponent);
      
   }
   
   /** @pdGenerated default remove
     * @param oldWorkspaceComponent */
   public void removeModels(WorkspaceComponent oldWorkspaceComponent) {
      if (oldWorkspaceComponent == null)
         return;
      if (this.models != null)
         if (this.models.contains(oldWorkspaceComponent))
            this.models.remove(oldWorkspaceComponent);
   }
   
   /** @pdGenerated default removeAll */
   public void removeAllModels() {
      if (models != null)
         models.clear();
   }
   
   public void save() {
      // TODO: implement
   }
   
   public void saveAs() {
      // TODO: implement
   }

}