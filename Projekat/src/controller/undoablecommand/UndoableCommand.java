/***********************************************************************
 * Module:  UndoableCommand.java
 * Author:  PC
 * Purpose: Defines the Interface UndoableCommand
 ***********************************************************************/

package controller.undoablecommand;

import java.util.*;

public interface UndoableCommand extends controller.executablecommand.ExecutableCommand {
   boolean unexecute();

}