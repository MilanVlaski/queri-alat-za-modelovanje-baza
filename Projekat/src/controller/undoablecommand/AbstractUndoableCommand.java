/***********************************************************************
 * Module:  AbstractUndoableCommand.java
 * Author:  Yelja
 * Purpose: Defines the Class AbstractUndoableCommand
 ***********************************************************************/

package controller.undoablecommand;

import java.util.*;

public abstract class AbstractUndoableCommand implements UndoableCommand {
   public boolean unexecute() {
      // TODO: implement
      return false;
   }
   
   public boolean execute() {
      // TODO: implement
      return false;
   }

}