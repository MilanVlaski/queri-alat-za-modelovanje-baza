/***********************************************************************
 * Module:  MenuItem.java
 * Author:  fejzo_000
 * Purpose: Defines the Class MenuItem
 ***********************************************************************/

package view;
/**
* Nasljeđuje klasu JMenuItem.
* 
* @see JMenuItem
* @author Grupa1
* @version 1.0
*/
import controller.executablecommand.*;
import java.util.*;

import javax.swing.JMenuItem;

public class MenuItem extends JMenuItem{
   protected AbstractExecutableCommand abstractExecutableCommand;

   public MenuItem(String text)  {
	super(text);
}
}