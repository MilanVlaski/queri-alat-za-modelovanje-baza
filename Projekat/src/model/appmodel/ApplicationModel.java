/***********************************************************************
 * Module:  ApplicationModel.java
 * Author:  PC
 * Purpose: Defines the Class ApplicationModel
 ***********************************************************************/

package model.appmodel;


import model.datamodel.*;
import view.menubar.DefaultMenuBar;
import view.objectbox.AbstractObjectBox;
import controller.undoablecommand.*;
import model.datamodel.Model;
import model.datamodel.Project;
import model.datamodel.WorkspaceComponent;
import controller.undoablecommand.CommandHistory;
import observer.Subject;
import observer.Observer;

import java.awt.Dimension;
import java.io.File;
import java.io.IOException;
import java.nio.file.FileSystem;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;

/** 
 * Klasa za definisanje modela podataka softverskog alata queri.
 * Omogućava pristup podacima aplikacije i upravlja njenim stanjem.
 * Ova klasa je dizajnirana da bude glavni posrednik između prezentacionog (view) sloja i poslovnog sloja softverskog alata. 
 * 
 * @see Application
 * @author Grupa 1
 * @version 1.0
 */
public class ApplicationModel implements observer.Subject {
	
   private String language;
   private Dimension location;
   private ModelType currentModelType;
   private Diagram focusedDiagram;
   
   private DataExporter dataExporter;
   private ApplicationState currentState;
   private DataImporter dataImporter;
   private java.util.List<WorkspaceComponent> components;
   private AppFactory appFactory;
   private java.util.List<CommandHistory> commandHistory;
   private java.util.List<Observer> observers;
   
   public static int projectCount=1;
   public static int modelCount=1;
   public static int diagramCount=1;
   
   public ApplicationModel() {
	   this.currentState = new Idle();
	   this.observers = new Vector<>();
	   this.commandHistory = new Vector<>();
	   this.components = new Vector<>();
   }
   
   public Diagram getFocusedDiagram() {
		return focusedDiagram;
	}
	public void setFocusedDiagram(Diagram focusedDiagram) {
		this.focusedDiagram = focusedDiagram;
	}
   
   public AppFactory getAppFactory() {
	   return appFactory;
   }

	public ModelType getCurrentModelType() {
		return currentModelType;
	}
	//Setuje i Fabriku shodno tipu modela
	public void setCurrentModelType(ModelType currentModelType) {
		
		this.currentModelType = currentModelType;
		
		 switch (currentModelType) {
			case CONCEPTUAL:
				this.appFactory = new ConAppFactory(); break;
			case LOGICAL: 	
				this.appFactory = new LogAppFactory(); break;
			case PHYSICAL:
				this.appFactory = new PhysAppFactory(); break;
		 }	
	}
	
	public ApplicationState getCurrentState() {
		return currentState;
	}
	public void setCurrentState(ApplicationState currentState) {
		this.currentState = currentState;
	}
/** @pdGenerated default getter */
   public List<WorkspaceComponent> getComponents() {
      if (components == null)
         components = new java.util.Vector<WorkspaceComponent>();
      return components;
   }
   
   /** @pdGenerated default iterator getter */
   public Iterator getIteratorComponents() {
      if (components == null)
         components = new java.util.Vector<WorkspaceComponent>();
      return components.iterator();
   }
   
   /** @pdGenerated default setter
     * @param newComponents */
   public void setComponents(List<WorkspaceComponent> newComponents) {
      removeAllComponents();
      for (Iterator<?> iter = newComponents.iterator(); iter.hasNext();)
         addComponents((WorkspaceComponent)iter.next());
   }
   
   /** @pdGenerated default add
     * @param newWorkspaceComponent */
   public void addComponents(WorkspaceComponent newWorkspaceComponent) {
      if (newWorkspaceComponent == null)
         return;
      if (this.components == null)
         this.components = new java.util.Vector<WorkspaceComponent>();
      if (!this.components.contains(newWorkspaceComponent))
         this.components.add(newWorkspaceComponent);
   }
   
   /** @pdGenerated default remove
     * @param oldWorkspaceComponent */
   public void removeComponent(WorkspaceComponent oldWorkspaceComponent) {
      if (oldWorkspaceComponent == null)
         return;
      if (this.components != null)
         if (this.components.contains(oldWorkspaceComponent))
            this.components.remove(oldWorkspaceComponent);
      
   }
   
   /** @pdGenerated default removeAll */
   public void removeAllComponents() {
      if (components != null)
         components.clear();
   }
   /** @pdGenerated default getter */
   public java.util.List<CommandHistory> getCommandHistory() {
      if (commandHistory == null)
         commandHistory = new java.util.Vector<CommandHistory>();
      return commandHistory;
   }
   
   /** @pdGenerated default iterator getter */
   public java.util.Iterator getIteratorCommandHistory() {
      if (commandHistory == null)
         commandHistory = new java.util.Vector<CommandHistory>();
      return commandHistory.iterator();
   }
   
   /** @pdGenerated default setter
     * @param newCommandHistory */
   public void setCommandHistory(java.util.List<CommandHistory> newCommandHistory) {
      removeAllCommandHistory();
      for (java.util.Iterator iter = newCommandHistory.iterator(); iter.hasNext();)
         addCommandHistory((CommandHistory)iter.next());
   }
   
   /** @pdGenerated default add
     * @param newCommandHistory */
   public void addCommandHistory(CommandHistory newCommandHistory) {
      if (newCommandHistory == null)
         return;
      if (this.commandHistory == null)
         this.commandHistory = new java.util.Vector<CommandHistory>();
      if (!this.commandHistory.contains(newCommandHistory))
         this.commandHistory.add(newCommandHistory);
   }
   
   /** @pdGenerated default remove
     * @param oldCommandHistory */
   public void removeCommandHistory(CommandHistory oldCommandHistory) {
      if (oldCommandHistory == null)
         return;
      if (this.commandHistory != null)
         if (this.commandHistory.contains(oldCommandHistory))
            this.commandHistory.remove(oldCommandHistory);
   }
   
   /** @pdGenerated default removeAll */
   public void removeAllCommandHistory() {
      if (commandHistory != null)
         commandHistory.clear();
   }
   /** @pdGenerated default getter */
   public java.util.List<Observer> getObservers() {
      if (observers == null)
         observers = new java.util.Vector<Observer>();
      return observers;
   }
   
   /** @pdGenerated default iterator getter */
   public Iterator<Observer> getIteratorObservers() {
      if (observers == null)
         observers = new java.util.Vector<Observer>();
      return observers.iterator();
   }
   
   /** @pdGenerated default setter
     * @param newObservers */
   public void setObservers(List<Observer> newObservers) {
      removeAllObservers();
      for (Iterator<Observer> iter = newObservers.iterator(); iter.hasNext();)
         attachObserver((Observer)iter.next());
   }
   
   	@Override
	public void attachObserver(Observer newObserver) {
	   
	      if (newObserver == null)
	          return;
	       if (this.observers == null)
	          this.observers = new java.util.Vector<Observer>();
	       if (!this.observers.contains(newObserver))
	          this.observers.add(newObserver);
	}
   	@Override
	public void detachObserver(Observer oldObserver) {
		
	      if (oldObserver == null)
	          return;
	       if (this.observers != null)
	          if (this.observers.contains(oldObserver))
	             this.observers.remove(oldObserver);
	}
   	
   	@Override
   	public void notifyAllObservers() {  			
   		for (Observer o : observers)
			o.update();
   	}
   
   /** @pdGenerated default removeAll */
   public void removeAllObservers() {
      if (observers != null)
         observers.clear();
   }
   
   public void openModel(String path) {
	   	   
//     Model m = importComponent(path); TODO
//	   setCurrentModelType(ModelType.valueOfModelClass(m.getClass()));
//	   addModel(m);
	   notifyAllObservers();
   }
   //Za datu lokaciju i naziv, kreira projektni fajl na toj lokaciji
   //sa tim imenom
   public void createProjectFile(String location, String name) {
	   
	   createFileWithExtension(location, name, ".pqvi");
   }
   
   public void createModelFile(String location, String name) {
	   
	   createFileWithExtension(location, name, ".qvi");
   }
   
   private void createFileWithExtension(String location, String name, String extension) {
	   
	   File file = new File(location);
	   
	   try {
		Files.createDirectories(file.toPath());	   
		Files.createFile(Paths.get(file.toPath().toString() + 
				FileSystems.getDefault().getSeparator() + name + extension));
		
	} catch (IOException e) {
		e.printStackTrace();
	}
   }
   public void deleteProject(Project p) {
	   
	   deleteFileWithExtension(p, ".pqvi");
   }
   
   public void deleteModel(Model m) {
	   
	   deleteFileWithExtension(m, ".qvi");
   }
   
   private void deleteFileWithExtension(WorkspaceComponent w, String extension) {
	   
	   File file = new File(w.getLocation() + 
			   FileSystems.getDefault().getSeparator() + w.getName() + extension);
	   this.components.remove(w);
	   file.delete();
   }
   
   //SETUJE odgovarajucu fabriku, i dodaje odgovarajuci Model
   //AppView bi pozvao ovu fabriku i napravio sebi ViewKomponente? 
   public void newModel(ModelType type, String name) {
	   currentState.newModel(this, type, name);
   }
   
 	public void newModelInProject(ModelType type, Project project, String name) {
		
   		setCurrentModelType(type);
		project.addModel(this.appFactory.createModelWithName(name));
		notifyAllObservers();
	}
   
   public void newProject(String name) {
	   
	   currentState.newProject(this, name);
   }
   
   public void removeModelFromProject(Project project, Model model) {
	   
	   Iterator<?> iterator = this.getIteratorComponents();
	   while(iterator.hasNext())
		  if(iterator.next().equals(project)) {
			  project.getModels().remove(model);
			  notifyAllObservers();
		  } 
	}
   
   public AbstractObjectBox createObjectBox() {  
      return currentState.createObjectBox(this);
   }
   
   public DefaultMenuBar createMenuBar() {
      return currentState.createMenuBar(this);
   }
   
   
   public WorkspaceComponent importComponent() {
      // TODO: implement
      return null;
   }
   
   public File exportComponent() {
      // TODO: implement
      return null;
   }
   
   public void saveComponent(WorkspaceComponent wc) {
	   wc.save();
   }
   
   public void saveComponentAs(WorkspaceComponent wc) {
      wc.saveAs();
   }



}