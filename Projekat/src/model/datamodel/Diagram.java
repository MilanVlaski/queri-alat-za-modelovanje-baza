/***********************************************************************
 * Module:  Diagram.java
 * Author:  Yelja
 * Purpose: Defines the Class Diagram
 ***********************************************************************/

package model.datamodel;

import model.datamodel.objects.ConEntity;
import model.datamodel.objects.Element;
import model.datamodel.objects.Link;
import model.datamodel.objects.Object;
import observer.Observer;
import view.Canvas;

import java.awt.Graphics2D;
import java.util.Vector;

import javax.security.auth.Subject;
import javax.swing.tree.DefaultMutableTreeNode;
/**
 * Klasa definiše dijagram na osnovu trenutnih stanja i objekata.
 * 
 * @see DefaultMutableTreeNode
 * @see Subject
 * @author Grupa 1
 * @version 1.0
 *
 */
public abstract class Diagram extends DefaultMutableTreeNode implements observer.Subject {
   private String name;
  // private Dimension size;
   private boolean isOpen;
   private DiagramState currentState;
   private java.util.List<Object> objects;
   private java.util.List<observer.Observer> observers;
 
   public Diagram(String name) {
	   super(name);
	   this.name=name;
	   this.observers = new Vector<>();
	   this.objects = new Vector<>();
 	  }
   

  	public Diagram() {
		super();
		this.isOpen = false;
		this.currentState = new SelectionState();
	}
   
   public DiagramState getCurrentState() {
		return currentState;
	}


	public void setCurrentState(DiagramState currentState) {
		this.currentState = currentState;
	}


/** @pdGenerated default getter */

   
   public String getName() {
	   return name;
   	}


	public void setName(String name) {
		this.name = name;
	}

/** @pdGenerated default getter */

   public java.util.List<Object> getObjects() {
      if (objects == null)
         objects = new java.util.Vector<Object>();
      return objects;
   }

/** @pdGenerated default iterator getter */
   public java.util.Iterator getIteratorObjects() {
      if (objects == null)
         objects = new java.util.Vector<Object>();
      return objects.iterator();
   }
   
   /** @pdGenerated default setter
     * @param newObjects */
   public void setObjects(java.util.List<Object> newObjects) {
      removeAllObjects();
      for (java.util.Iterator iter = newObjects.iterator(); iter.hasNext();)
         addObjects((Object)iter.next());
   }
   
   /** @pdGenerated default add
     * @param newObject */
   public void addObjects(Object newObject) {
      if (newObject == null)
         return;
      if (this.objects == null)
         this.objects = new java.util.Vector<Object>();
      if (!this.objects.contains(newObject))
         this.objects.add(newObject);
   }
   
   /** @pdGenerated default remove
     * @param oldObject */
   public void removeObjects(Object oldObject) {
      if (oldObject == null)
         return;
      if (this.objects != null)
         if (this.objects.contains(oldObject))
            this.objects.remove(oldObject);
   }
   
   /** @pdGenerated default removeAll */
   public void removeAllObjects() {
      if (objects != null)
         objects.clear();
   }
   /** @pdGenerated default getter */
   public java.util.List<observer.Observer> getObservers() {
      if (observers == null)
         observers = new java.util.Vector<observer.Observer>();
      return observers;
   }
   
   /** @pdGenerated default iterator getter */
   public java.util.Iterator getIteratorObservers() {
      if (observers == null)
         observers = new java.util.Vector<observer.Observer>();
      return observers.iterator();
   }
   
   /** @pdGenerated default setter
     * @param newObservers */
   public void setObservers(java.util.List<observer.Observer> newObservers) {
      removeAllObservers();
      for (java.util.Iterator iter = newObservers.iterator(); iter.hasNext();)
         attachObserver((observer.Observer)iter.next());
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
   
	public boolean isOpen() {
		return isOpen;
	}
	
	public void open() {
		isOpen = true;
		notifyAllObservers();
	}
	
	public void close() {
		isOpen = false;
		notifyAllObservers();
	}
   
	public void drawDiagram(Graphics2D g2d) {
		
		if(!objects.isEmpty()) {
			
		for (Object o : objects)
			if(o instanceof Link)
				o.draw(g2d);
		
		for (Object o : objects)
			if(o instanceof Element)
				o.draw(g2d);
		}
		g2d.dispose();
	}
   
   public abstract Object createObject(String type);

   public void addElement(int x, int y) {
	   currentState.addElement(this, x, y);
   }
   
   public void addLink(int x1, int y1, int x2, int y2) {
	   currentState.addLink(this, x1, y1, x2, y2);
   }
   

}