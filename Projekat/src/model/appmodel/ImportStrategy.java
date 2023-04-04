/***********************************************************************
 * Module:  ImportStrategy.java
 * Author:  Yelja
 * Purpose: Defines the Interface ImportStrategy
 ***********************************************************************/

package model.appmodel;

import java.util.*;

import model.datamodel.WorkspaceComponent;

public interface ImportStrategy {
   WorkspaceComponent importComponent();

}