/***********************************************************************
 * Module:  ExportStrategy.java
 * Author:  Yelja
 * Purpose: Defines the Interface ExportStrategy
 ***********************************************************************/

package model.appmodel;

import java.io.File;
import java.util.*;

import model.datamodel.WorkspaceComponent;

public interface ExportStrategy {
   /** @param w */
  public File exportComponent(WorkspaceComponent w);

}