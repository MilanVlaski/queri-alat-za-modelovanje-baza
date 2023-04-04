/***********************************************************************
 * Module:  ApplicationView.java
 * Author:  PC
 * Purpose: Defines the Class ApplicationView
 ***********************************************************************/

package view;



import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

import model.appmodel.Application;
import model.appmodel.ApplicationModel;
import observer.Observer;

/** 
 * Klasa za definisanje GUI/LookAndFeel-a.
 * Inicijalizuje prozor softverskog alata. 
 * 
 * @see Application
 * @author Grupa 1
 * @version 1.0
 */
public class ApplicationView implements Observer {
	private Window window;
	private ApplicationModel appModel;

	public ApplicationView(ApplicationModel appModel) {

		try {
			UIManager.setLookAndFeel("com.jtattoo.plaf.mint.MintLookAndFeel");
			
		} catch (ClassNotFoundException | InstantiationException | IllegalAccessException
				| UnsupportedLookAndFeelException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		this.appModel = appModel;
		window = new Frame(appModel);
	}

	public Window getWindow() {
		return window;
	}

	public ApplicationModel getAppModel() {
		return appModel;
	}

	@Override
	public void update() {
		// TODO Auto-generated method stub

	}

}