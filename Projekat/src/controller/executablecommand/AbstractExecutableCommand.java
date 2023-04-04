/***********************************************************************
 * Module:  AbstractExecutableCommand.java
 * Author:  Yelja
 * Purpose: Defines the Class AbstractExecutableCommand
 ***********************************************************************/

package controller.executablecommand;

import java.util.*;

import model.appmodel.Application;
import model.appmodel.ApplicationModel;

/** 
 * Apstraktna klasa izvršive komande koja implementira ExecutableCommand interfejs.
 * Ovu klasu nasljeđuju konkretne komande.
 * 
 * @see ExecutableCommand
 * @author Grupa 1
 * @version 1.0
 */
public abstract class AbstractExecutableCommand implements ExecutableCommand {
	private ApplicationModel appmodel;
	
   public boolean execute() {
      // TODO: implement
      return false;
   }

}