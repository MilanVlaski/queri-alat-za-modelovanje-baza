/***********************************************************************
 * Module:  ExecutableCommand.java
 * Author:  Yelja
 * Purpose: Defines the Interface ExecutableCommand
 ***********************************************************************/

package controller.executablecommand;

import java.util.*;
/** 
 * Interfejs kojim se implementira dizajn šablon Command. 
 * Primjenjuje se u realizaciji kontrolera, dijela MVC šablona. 
 * 
 * @author Grupa 1
 * @version 1.0
 */
public interface ExecutableCommand {
	/**Metoda koja se izvršava pri pozivu pojedinačne komande. Svaka komanda je implementira posebno.*/
   boolean execute();

}