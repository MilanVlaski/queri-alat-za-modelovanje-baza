/***********************************************************************
 * Module:  Model.java
 * Author:  Yelja
 * Purpose: Defines the Class Model
 ***********************************************************************/

package model.datamodel;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.*;

import javax.swing.JFileChooser;

public abstract class Model extends WorkspaceComponent {
	  public Model(String name) {
		super(name);
	  }
	   
	public Model(String name, String location) {
		super(name, location);
	}


private java.util.List<Diagram> diagrams;
   
   
   /** @pdGenerated default getter */
   public java.util.List<Diagram> getDiagrams() {
      if (diagrams == null)
         diagrams = new java.util.Vector<Diagram>();
      return diagrams;
   }
   
   /** @pdGenerated default iterator getter */
   public java.util.Iterator getIteratorDiagrams() {
      if (diagrams == null)
         diagrams = new java.util.Vector<Diagram>();
      return diagrams.iterator();
   }
   
   /** @pdGenerated default setter
     * @param newDiagrams */
   public void setDiagrams(java.util.List<Diagram> newDiagrams) {
      removeAllDiagrams();
      for (java.util.Iterator iter = newDiagrams.iterator(); iter.hasNext();)
         addDiagram((Diagram)iter.next());
   }
   
   /** @pdGenerated default add
     * @param newDiagram */
   public void addDiagram(Diagram newDiagram) {
      if (newDiagram == null)
         return;
      if (this.diagrams == null)
         this.diagrams = new java.util.Vector<Diagram>();
      if (!this.diagrams.contains(newDiagram))
         this.diagrams.add(newDiagram);
   }
   
   /** @pdGenerated default remove
     * @param oldDiagram */
   public void removeDiagrams(Diagram oldDiagram) {
      if (oldDiagram == null)
         return;
      if (this.diagrams != null)
         if (this.diagrams.contains(oldDiagram))
            this.diagrams.remove(oldDiagram);
   }
   
   /** @pdGenerated default removeAll */
   public void removeAllDiagrams() {
      if (diagrams != null)
         diagrams.clear();
   }
   
   public void newDiagram() {
	   Diagram d = createDiagram();
	   
	   if(getDiagrams().isEmpty()) {
		   addDiagram(d);
	   }
	   else {
		   Iterator<?> itr = getIteratorDiagrams();
		   String dName = d.getName();
		   while(itr.hasNext()) {
			   if(((Diagram)itr.next()).getName() == dName) {
				   	addDiagram(d);
			   		d.open();
			   }
		   }
	   }
   }
   
   public abstract Diagram createDiagram();
   public abstract Diagram createDiagram(String name);
   
   /** @param d */
   public void deleteDiagram(Diagram d) {
      if(getDiagrams().size() > 1) {
    	  d.close();
    	  diagrams.remove(d);
      }
   }
   
   public void renameDiagram(Diagram d, String newName) {
	  
	   Iterator<?> itr = getIteratorDiagrams();
	   String dName = d.getName();
	   while(itr.hasNext()) 
		   if(((Diagram)itr.next()).getName() == dName)
			   return;
	   
	   d.setName(newName);
   }
   
   public void save() {
    
   }
   
   public void saveAs() {
      // TODO: implement
   }
}