/***********************************************************************
 * Module:  ObjectBoxItem.java
 * Author:  PC
 * Purpose: Defines the Class ObjectBoxItem
 ***********************************************************************/

package view;

import controller.executablecommand.*;

import java.awt.Dimension;
import java.util.*;

import javax.swing.Icon;
import javax.swing.JButton;

public class ObjectBoxItem extends JButton {
   public AbstractExecutableCommand abstractExecutableCommand;
   public ObjectBoxItem(Icon icon) {
	   super(icon);
	   setPreferredSize(new Dimension(93, 93));
   }

}