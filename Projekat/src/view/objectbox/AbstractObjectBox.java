/***********************************************************************
 * Module:  AbstractObjectBox.java
 * Author:  PC
 * Purpose: Defines the Class AbstractObjectBox
 ***********************************************************************/

package view.objectbox;

import java.awt.Toolkit;
import java.util.*;

import javax.swing.JPanel;

import view.ObjectBoxItem;
import view.ViewComponent;
/**
 * Klasa koja kreira sve tipove object box-ova i u zavisnosti od vrste modela
 * mijenja i dostupne elemente.
 * Naslijedjuju je ConceptualObjectBox, LogicalObjectBox, PhysicalObjectBox
 * 
 * @see JPanel
 * @see ViewComponent
 * @author Grupa 1
 * @version 1.0
 */
public abstract class AbstractObjectBox extends JPanel implements ViewComponent {
 
	private static final long serialVersionUID = 1L;
	protected List<ObjectBoxItem> objectBoxItems;
   protected Toolkit toolkit=Toolkit.getDefaultToolkit();
   
   /** @pdGenerated default getter */
   public List<ObjectBoxItem> getObjectBoxItems() {
      if (objectBoxItems == null)
         objectBoxItems = new Vector<ObjectBoxItem>();
      return objectBoxItems;
   }
   
   /** @pdGenerated default iterator getter */
   public Iterator<ObjectBoxItem> getIteratorObjectBoxItems() {
      if (objectBoxItems == null)
         objectBoxItems = new Vector<ObjectBoxItem>();
      return objectBoxItems.iterator();
   }
   
   /** @pdGenerated default setter
     * @param newObjectBoxItems */
   public void setObjectBoxItems(List<ObjectBoxItem> newObjectBoxItems) {
      removeAllObjectBoxItems();
      for (Iterator<ObjectBoxItem> iter = newObjectBoxItems.iterator(); iter.hasNext();)
         addObjectBoxItems((ObjectBoxItem)iter.next());
   }
   
   /** @pdGenerated default add
     * @param newObjectBoxItem */
   public void addObjectBoxItems(ObjectBoxItem newObjectBoxItem) {
      if (newObjectBoxItem == null)
         return;
      if (this.objectBoxItems == null)
         this.objectBoxItems = new java.util.Vector<ObjectBoxItem>();
      if (!this.objectBoxItems.contains(newObjectBoxItem))
         this.objectBoxItems.add(newObjectBoxItem);
   }
   
   /** @pdGenerated default remove
     * @param oldObjectBoxItem */
   public void removeObjectBoxItems(ObjectBoxItem oldObjectBoxItem) {
      if (oldObjectBoxItem == null)
         return;
      if (this.objectBoxItems != null)
         if (this.objectBoxItems.contains(oldObjectBoxItem))
            this.objectBoxItems.remove(oldObjectBoxItem);
   }
   
   /** @pdGenerated default removeAll */
   public void removeAllObjectBoxItems() {
      if (objectBoxItems != null)
         objectBoxItems.clear();
   }

}