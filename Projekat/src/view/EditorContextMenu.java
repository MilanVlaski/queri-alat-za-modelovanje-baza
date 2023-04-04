/***********************************************************************
 * Module:  EditorContextMenu.java
 * Author:  PC
 * Purpose: Defines the Class EditorContextMenu
 ***********************************************************************/

package view;

import java.util.*;
/**
 * Definiše kontekstni meni.
 * 
 * @author Grupa 1
 * @version 1.0
 *
 */
public class EditorContextMenu {
   private java.util.List<EditorContextMenuItem> contextMenuItems;
   
   
   /** @pdGenerated default getter */
   public java.util.List<EditorContextMenuItem> getContextMenuItems() {
      if (contextMenuItems == null)
         contextMenuItems = new java.util.Vector<EditorContextMenuItem>();
      return contextMenuItems;
   }
   
   /** @pdGenerated default iterator getter */
   public java.util.Iterator getIteratorContextMenuItems() {
      if (contextMenuItems == null)
         contextMenuItems = new java.util.Vector<EditorContextMenuItem>();
      return contextMenuItems.iterator();
   }
   
   /** @pdGenerated default setter
     * @param newContextMenuItems */
   public void setContextMenuItems(java.util.List<EditorContextMenuItem> newContextMenuItems) {
      removeAllContextMenuItems();
      for (java.util.Iterator iter = newContextMenuItems.iterator(); iter.hasNext();)
         addContextMenuItems((EditorContextMenuItem)iter.next());
   }
   
   /** @pdGenerated default add
     * @param newEditorContextMenuItem */
   public void addContextMenuItems(EditorContextMenuItem newEditorContextMenuItem) {
      if (newEditorContextMenuItem == null)
         return;
      if (this.contextMenuItems == null)
         this.contextMenuItems = new java.util.Vector<EditorContextMenuItem>();
      if (!this.contextMenuItems.contains(newEditorContextMenuItem))
         this.contextMenuItems.add(newEditorContextMenuItem);
   }
   
   /** @pdGenerated default remove
     * @param oldEditorContextMenuItem */
   public void removeContextMenuItems(EditorContextMenuItem oldEditorContextMenuItem) {
      if (oldEditorContextMenuItem == null)
         return;
      if (this.contextMenuItems != null)
         if (this.contextMenuItems.contains(oldEditorContextMenuItem))
            this.contextMenuItems.remove(oldEditorContextMenuItem);
   }
   
   /** @pdGenerated default removeAll */
   public void removeAllContextMenuItems() {
      if (contextMenuItems != null)
         contextMenuItems.clear();
   }

}