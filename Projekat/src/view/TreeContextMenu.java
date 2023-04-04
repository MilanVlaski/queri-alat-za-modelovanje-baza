/***********************************************************************
 * Module:  TreeContextMenu.java
 * Author:  PC
 * Purpose: Defines the Class TreeContextMenu
 ***********************************************************************/

package view;

import java.util.*;
/**
 * Definiše konktekstne menije u stablu sa lijeve strane prozora aplikacije.
 * 
 * @author Grupa 1
 * @version 1.0
 *
 */
public class TreeContextMenu {
   private java.util.List<TreeContextMenuItem> treeContextMenuItems;
   
   
   /** @pdGenerated default getter */
   public java.util.List<TreeContextMenuItem> getTreeContextMenuItems() {
      if (treeContextMenuItems == null)
         treeContextMenuItems = new java.util.Vector<TreeContextMenuItem>();
      return treeContextMenuItems;
   }
   
   /** @pdGenerated default iterator getter */
   public java.util.Iterator getIteratorTreeContextMenuItems() {
      if (treeContextMenuItems == null)
         treeContextMenuItems = new java.util.Vector<TreeContextMenuItem>();
      return treeContextMenuItems.iterator();
   }
   
   /** @pdGenerated default setter
     * @param newTreeContextMenuItems */
   public void setTreeContextMenuItems(java.util.List<TreeContextMenuItem> newTreeContextMenuItems) {
      removeAllTreeContextMenuItems();
      for (java.util.Iterator iter = newTreeContextMenuItems.iterator(); iter.hasNext();)
         addTreeContextMenuItems((TreeContextMenuItem)iter.next());
   }
   
   /** @pdGenerated default add
     * @param newTreeContextMenuItem */
   public void addTreeContextMenuItems(TreeContextMenuItem newTreeContextMenuItem) {
      if (newTreeContextMenuItem == null)
         return;
      if (this.treeContextMenuItems == null)
         this.treeContextMenuItems = new java.util.Vector<TreeContextMenuItem>();
      if (!this.treeContextMenuItems.contains(newTreeContextMenuItem))
         this.treeContextMenuItems.add(newTreeContextMenuItem);
   }
   
   /** @pdGenerated default remove
     * @param oldTreeContextMenuItem */
   public void removeTreeContextMenuItems(TreeContextMenuItem oldTreeContextMenuItem) {
      if (oldTreeContextMenuItem == null)
         return;
      if (this.treeContextMenuItems != null)
         if (this.treeContextMenuItems.contains(oldTreeContextMenuItem))
            this.treeContextMenuItems.remove(oldTreeContextMenuItem);
   }
   
   /** @pdGenerated default removeAll */
   public void removeAllTreeContextMenuItems() {
      if (treeContextMenuItems != null)
         treeContextMenuItems.clear();
   }

}