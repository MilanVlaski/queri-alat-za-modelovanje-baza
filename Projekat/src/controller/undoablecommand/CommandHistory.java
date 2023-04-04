/***********************************************************************
 * Module:  CommandHistory.java
 * Author:  PC
 * Purpose: Defines the Class CommandHistory
 ***********************************************************************/

package controller.undoablecommand;

import java.util.*;

public class CommandHistory {
   private java.util.List<UndoableCommand> undoableCommands;
   
   
   /** @pdGenerated default getter */
   public java.util.List<UndoableCommand> getUndoableCommands() {
      if (undoableCommands == null)
         undoableCommands = new java.util.Vector<UndoableCommand>();
      return undoableCommands;
   }
   
   /** @pdGenerated default iterator getter */
   public java.util.Iterator getIteratorUndoableCommands() {
      if (undoableCommands == null)
         undoableCommands = new java.util.Vector<UndoableCommand>();
      return undoableCommands.iterator();
   }
   
   /** @pdGenerated default setter
     * @param newUndoableCommands */
   public void setUndoableCommands(java.util.List<UndoableCommand> newUndoableCommands) {
      removeAllUndoableCommands();
      for (java.util.Iterator iter = newUndoableCommands.iterator(); iter.hasNext();)
         addUndoableCommands((UndoableCommand)iter.next());
   }
   
   /** @pdGenerated default add
     * @param newUndoableCommand */
   public void addUndoableCommands(UndoableCommand newUndoableCommand) {
      if (newUndoableCommand == null)
         return;
      if (this.undoableCommands == null)
         this.undoableCommands = new java.util.Vector<UndoableCommand>();
      if (!this.undoableCommands.contains(newUndoableCommand))
         this.undoableCommands.add(newUndoableCommand);
   }
   
   /** @pdGenerated default remove
     * @param oldUndoableCommand */
   public void removeUndoableCommands(UndoableCommand oldUndoableCommand) {
      if (oldUndoableCommand == null)
         return;
      if (this.undoableCommands != null)
         if (this.undoableCommands.contains(oldUndoableCommand))
            this.undoableCommands.remove(oldUndoableCommand);
   }
   
   /** @pdGenerated default removeAll */
   public void removeAllUndoableCommands() {
      if (undoableCommands != null)
         undoableCommands.clear();
   }
   
   /** @param command */
   public void push(UndoableCommand command) {
      // TODO: implement
   }
   
   public UndoableCommand pop() {
      // TODO: implement
      return null;
   }

}