/***********************************************************************
 * Module:  AbstractMenuBar.java
 * Author:  PC
 * Purpose: Defines the Class AbstractMenuBar
 ***********************************************************************/

package view.menubar;



import java.util.List;
import java.util.Vector;

import javax.swing.JMenuBar;

import model.appmodel.ApplicationModel;
import view.Frame;
import view.Menu;
import view.ViewComponent;
import view.menubar.menu.*;
/** 
 * Klasa za definisanje izgleda MenuBar-a u osnovnom (idle) stanju pri porketanju softverskog alata.
 * Predstavlja komponentu prikaza.
 * 
 * @see Frame
 * @author Grupa 1
 * @version 1.0
 */
public class DefaultMenuBar extends JMenuBar implements ViewComponent {

	private static final long serialVersionUID = 1L;
	protected java.util.List<Menu> menus;
	protected FileMenu fileMenu;
	protected EditMenu editMenu;
	protected ViewMenu viewMenu;
	protected WindowMenu windowMenu;
	protected HelpMenu helpMenu;
	private ApplicationModel appModel;
	

	/** @pdGenerated default getter */
	public java.util.List<Menu> getMenus() {
		if (menus == null)
			menus = new java.util.Vector<Menu>();
		return menus;
	}

	/** @pdGenerated default iterator getter */
	public java.util.Iterator getIteratorMenus() {
		if (menus == null)
			menus = new java.util.Vector<Menu>();
		return menus.iterator();
	}

	/**
	 * @pdGenerated default setter
	 * @param newMenus
	 */
	public void setMenus(java.util.List<Menu> newMenus) {
		removeAllMenus();
		for (java.util.Iterator iter = newMenus.iterator(); iter.hasNext();)
			addMenus((Menu) iter.next());
	}

	/**
	 * @pdGenerated default add
	 * @param newMenu
	 */
	public void addMenus(Menu newMenu) {
		if (newMenu == null)
			return;
		if (this.menus == null)
			this.menus = new java.util.Vector<Menu>();
		if (!this.menus.contains(newMenu))
			this.menus.add(newMenu);
	}

	/**
	 * @pdGenerated default remove
	 * @param oldMenu
	 */
	public void removeMenus(Menu oldMenu) {
		if (oldMenu == null)
			return;
		if (this.menus != null)
			if (this.menus.contains(oldMenu))
				this.menus.remove(oldMenu);
	}

	/** @pdGenerated default removeAll */
	public void removeAllMenus() {
		if (menus != null)
			menus.clear();
	}

	public DefaultMenuBar(ApplicationModel appModel) {
		this.appModel = appModel;
		
		fileMenu = new FileMenu(appModel);
		editMenu = new EditMenu();
		viewMenu = new ViewMenu();
		windowMenu = new WindowMenu();
		helpMenu = new HelpMenu();

		menus=new Vector<Menu>();
		
		menus.add(fileMenu);
		menus.add(editMenu);
		menus.add(viewMenu);
		menus.add(windowMenu);
		menus.add(helpMenu);
		
		initializeMenus();
	}
	
	public void initializeMenus() {
		
		for (Menu menu : menus) {
			this.add(menu);
		}
	}
	
	@Override
	public void update() {
		// TODO Auto-generated method stub
		
	}

}