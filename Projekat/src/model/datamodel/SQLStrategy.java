/***********************************************************************
 * Module:  SQLStrategy.java
 * Author:  Yelja
 * Purpose: Defines the Interface SQLStrategy
 ***********************************************************************/

package model.datamodel;

import java.io.File;
import java.util.*;

public interface SQLStrategy {
   File generateScript();

}