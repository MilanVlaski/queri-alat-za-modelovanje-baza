/***********************************************************************
 * Module:  Application.java
 * Author:  PC
 * Purpose: Defines the Class Application
 ***********************************************************************/

package model.appmodel;

import view.*;
import java.util.*;

import model.appmodel.ApplicationModel;
import model.datamodel.Model;
/** 
 * Osnovna klasa softverskog alata queri. 
 * 
 * @author Grupa 1
 * @version 1.0
 */

public class Application {
   private ApplicationView appView;
   private ApplicationModel appModel;
   
   public ApplicationModel getAppModel() {
	   return appModel;
	}
	public void setAppModel(ApplicationModel appModel) {
		this.appModel = appModel;
	}
	public ApplicationView getAppView() {
		return appView;
	}
	public void setAppView(ApplicationView appView) {
		this.appView = appView;
	}


   public Application() {
	   
	   this.appModel = new ApplicationModel();
	//   appModel.setCurrentState(new Idle());
	   this.appView = new ApplicationView(appModel);
	   
	   //dio namijenjen za attach svih observera (View komponenti) na AppModel
	   	for (ViewComponent comp : appView.getWindow().getViewComponents()) {
			appModel.attachObserver(comp);
		}
	   	
	   appModel.attachObserver((Frame)appView.getWindow()); //attach Frame observera
	   appModel.notifyAllObservers(); //notifikovanje svih observera prilikom startovanja softverskog alata
	}

}