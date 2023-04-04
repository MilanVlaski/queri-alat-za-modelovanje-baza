/***********************************************************************
 * Module:  DiagramState.java
 * Author:  Yelja
 * Purpose: Defines the Interface DiagramState
 ***********************************************************************/

package model.datamodel;

import java.util.*;

public interface DiagramState {
   void addElement(Diagram context, int x, int y);
   void addLink(Diagram context, int x1, int y1, int x2, int y2);

}