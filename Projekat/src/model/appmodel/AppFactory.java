/***********************************************************************
 * Module:  AppFactory.java
 * Author:  Yelja
 * Purpose: Defines the Interface AppFactory
 ***********************************************************************/

package model.appmodel;

import java.util.*;

import model.datamodel.Model;
import view.menubar.DefaultMenuBar;
import view.objectbox.AbstractObjectBox;

public interface AppFactory {
   Model createModelWithName(String name);
   Model createModel();
   AbstractObjectBox createObjectBox();
   DefaultMenuBar createMenuBar(ApplicationModel appModel);

}