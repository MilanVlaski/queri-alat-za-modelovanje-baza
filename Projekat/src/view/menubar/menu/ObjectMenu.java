/***********************************************************************
 * Module:  DiagramMenu.java
 * Author:  fejzo_000
 * Purpose: Defines the Class DiagramMenu
 ***********************************************************************/

package view.menubar.menu;

import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;

import javax.swing.ImageIcon;

import view.Menu;
import view.MenuItem;
import view.menubar.ConceptualMenuBar;

/**
* Prilagođeni Object meni.
* Nasljeđuje klasu Menu.
* 
* @see Menu
* @see ConceptualMenuBar
* @author Grupa1
* @version 1.0
*/
public class ObjectMenu extends Menu {
	
	private static final long serialVersionUID = -4733983205415029185L;
	private MenuItem formatMenuItem;
	private MenuItem getFormatMenuItem;
	private MenuItem applyFormatMenuItem;
	private MenuItem restoreFormatMenuItem;
	private Menu addMenu;

	public ObjectMenu() {
		setText("Object");
		setMnemonic(KeyEvent.VK_O);
		
		Toolkit toolkit = Toolkit.getDefaultToolkit();

		// konfiguracija pojedinacne stavke menija
		formatMenuItem = new MenuItem("Format...");
		formatMenuItem.setMnemonic(KeyEvent.VK_F);
		add(formatMenuItem);

		getFormatMenuItem = new MenuItem("Get Format");
		Image getFormatIcon = toolkit.getImage("images/pipette.png");
		getFormatIcon=getFormatIcon.getScaledInstance(16,16,Image.SCALE_SMOOTH);
		getFormatMenuItem.setIcon(new ImageIcon(getFormatIcon));
		getFormatMenuItem.setMnemonic(KeyEvent.VK_G);
		add(getFormatMenuItem);

		applyFormatMenuItem = new MenuItem("Apply Format");
		Image applyFormatIcon = toolkit.getImage("images/dropper.png");
		applyFormatIcon=applyFormatIcon.getScaledInstance(16,16,Image.SCALE_SMOOTH);
		applyFormatMenuItem.setIcon(new ImageIcon(applyFormatIcon));
		applyFormatMenuItem.setMnemonic(KeyEvent.VK_A);
		add(applyFormatMenuItem);

		restoreFormatMenuItem = new MenuItem("Restore Format");
		restoreFormatMenuItem.setMnemonic(KeyEvent.VK_R);
		add(restoreFormatMenuItem);

		addSeparator();

		addMenu = new AddMenu();
		addMenu.setMnemonic(KeyEvent.VK_A);
		add(addMenu);

	}

}