/***********************************************************************
 * Module:  ModelMenu.java
 * Author:  fejzo_000
 * Purpose: Defines the Class ModelMenu
 ***********************************************************************/

package view.menubar.menu;

import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;

import javax.swing.ImageIcon;

import view.Menu;
import view.MenuItem;
import view.menubar.ConceptualMenuBar;
import view.menubar.DefaultMenuBar;
/**
* Prilagođeni Model meni.
* Nasljeđuje klasu Menu.
* 
* @see Menu
* @see ConceptualMenuBar
* @author Grupa1
* @version 1.0
*/
public class ModelMenu extends Menu {

	private static final long serialVersionUID = -2489933360367537988L;

	private MenuItem newDiagramMenuItem;
	private MenuItem generateLogicalMenuItem;
	private MenuItem generatePhysicalMenuItem;

	public ModelMenu() {
		setText("Model");
		setMnemonic(KeyEvent.VK_M);

		Toolkit toolkit = Toolkit.getDefaultToolkit();

		// konfiguracija pojedinacne stavke menija
		newDiagramMenuItem = new MenuItem("New Diagram...");
		Image newDiagramIcon = toolkit.getImage("images/diagram.png");
		newDiagramIcon=newDiagramIcon.getScaledInstance(16,16,Image.SCALE_SMOOTH);
		newDiagramMenuItem.setIcon(new ImageIcon(newDiagramIcon));
		newDiagramMenuItem.setMnemonic(KeyEvent.VK_D);
		add(newDiagramMenuItem);

		addSeparator();

		generateLogicalMenuItem = new MenuItem("Generate Logical Model...");
		generateLogicalMenuItem.setMnemonic(KeyEvent.VK_L);
		add(generateLogicalMenuItem);

		generatePhysicalMenuItem = new MenuItem("Generate Physical Model...");
		generatePhysicalMenuItem.setMnemonic(KeyEvent.VK_P);
		add(generatePhysicalMenuItem);

	}

}