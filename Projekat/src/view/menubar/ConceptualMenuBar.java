/***********************************************************************
 * Module:  ConceptualMenuBar.java
 * Author:  fejzo_000
 * Purpose: Defines the Class ConceptualMenuBar
 ***********************************************************************/

package view.menubar;

import model.appmodel.ApplicationModel;
import view.Frame;
import view.menubar.menu.ModelMenu;
import view.menubar.menu.ObjectMenu;

/** 
 * Klasa za definisanje konceptualnog MenuBar-a.
 * Predstavlja komponentu prikaza.
 * Svojevrsna je "nadogradnja" Default-nog MenuBar-a.
 * 
 * @see DefaultMenuBar
 * @see Frame
 * @author Grupa 1
 * @version 1.0
 */
public class ConceptualMenuBar extends DefaultMenuBar {
	
	private static final long serialVersionUID = -1770298361793138245L;
	private ModelMenu modelMenu;
	private ObjectMenu objectMenu;

	public ConceptualMenuBar(ApplicationModel appModel) {
		super(appModel);

		modelMenu = new ModelMenu();
		objectMenu = new ObjectMenu();

		menus.remove(windowMenu);
		menus.remove(helpMenu);

		menus.add(modelMenu);
		menus.add(objectMenu);
		menus.add(windowMenu);
		menus.add(helpMenu);

		initializeMenus();
	}

	@Override
	public void update() {
		// TODO Auto-generated method stub

	}

}