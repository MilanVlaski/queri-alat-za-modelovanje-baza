/***********************************************************************
 * Module:  EditMenu.java
 * Author:  fejzo_000
 * Purpose: Defines the Class EditMenu
 ***********************************************************************/

package view.menubar.menu;

import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;


import javax.swing.ImageIcon;

import javax.swing.KeyStroke;

import view.Menu;
import view.MenuItem;
import view.menubar.DefaultMenuBar;
/**
* Prilagođeni Edit meni. 
* Nasljeđuje klasu Menu.
* 
* @see Menu
* @see DefaultMenuBar
* @author Grupa1
* @version 1.0
*/
public class EditMenu extends Menu {

	private static final long serialVersionUID = 1L;

	private MenuItem undoMenuItem;
	private MenuItem redoMenuItem;
	private MenuItem cutMenuItem;
	private MenuItem copyMenuItem;
	private MenuItem pasteMenuItem;
	private MenuItem selectAllMenuItem;
	private MenuItem deleteSelectedMenuItem;
	private MenuItem modifyMenuItem;

	public EditMenu() {
		// postavljanje osnovnih parametara
		setText("Edit");
		setMnemonic(KeyEvent.VK_E);

		Toolkit toolkit = Toolkit.getDefaultToolkit();

		// konfiguracija pojedinacne stavke menija
		undoMenuItem = new MenuItem("Undo");
		Image undoIcon = toolkit.getImage("images/arrow-curve-180-left.png");
		undoMenuItem.setIcon(new ImageIcon(undoIcon));
		undoMenuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_Z, KeyEvent.CTRL_DOWN_MASK));
		undoMenuItem.setMnemonic(KeyEvent.VK_U);
		add(undoMenuItem);

		redoMenuItem = new MenuItem("Redo");
		Image redoIcon = toolkit.getImage("images/arrow-curve.png");
		redoMenuItem.setIcon(new ImageIcon(redoIcon));
		redoMenuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_Y, KeyEvent.CTRL_DOWN_MASK));
		redoMenuItem.setMnemonic(KeyEvent.VK_R);
		add(redoMenuItem);

		addSeparator();

		cutMenuItem = new MenuItem("Cut");
		Image cutIcon = toolkit.getImage("images/scissors.png");
		cutMenuItem.setIcon(new ImageIcon(cutIcon));
		cutMenuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_X, KeyEvent.CTRL_DOWN_MASK));
		cutMenuItem.setMnemonic(KeyEvent.VK_C);
		add(cutMenuItem);

		copyMenuItem = new MenuItem("Copy");
		Image copyIcon = toolkit.getImage("images/document-copy.png");
		copyMenuItem.setIcon(new ImageIcon(copyIcon));
		copyMenuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_C, KeyEvent.CTRL_DOWN_MASK));
		copyMenuItem.setMnemonic(KeyEvent.VK_C);
		add(copyMenuItem);

		pasteMenuItem = new MenuItem("Paste");
		Image pasteIcon = toolkit.getImage("images/clipboard-paste.png");
		pasteMenuItem.setIcon(new ImageIcon(pasteIcon));
		pasteMenuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_V, KeyEvent.CTRL_DOWN_MASK));
		pasteMenuItem.setMnemonic(KeyEvent.VK_P);
		add(pasteMenuItem);

		selectAllMenuItem = new MenuItem("Select All");
		Image selectAllIcon = toolkit.getImage("images/selectAll.png").getScaledInstance(16, 16,
				Image.SCALE_AREA_AVERAGING);
		selectAllMenuItem.setIcon(new ImageIcon(selectAllIcon));
		selectAllMenuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_ESCAPE, KeyEvent.CTRL_DOWN_MASK));
		selectAllMenuItem.setMnemonic(KeyEvent.VK_S);
		add(selectAllMenuItem);

		addSeparator();

		deleteSelectedMenuItem = new MenuItem("Delete Selected Object");
		Image deleteSelectedIcon = toolkit.getImage("images/delete.png");
		deleteSelectedIcon = deleteSelectedIcon.getScaledInstance(16, 16, Image.SCALE_SMOOTH);
		deleteSelectedMenuItem.setIcon(new ImageIcon(deleteSelectedIcon));
		selectAllMenuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_D, KeyEvent.CTRL_DOWN_MASK));
		deleteSelectedMenuItem.setMnemonic(KeyEvent.VK_D);
		add(deleteSelectedMenuItem);

		modifyMenuItem = new MenuItem("Edit Object");
		Image modifyIcon = toolkit.getImage("images/modify_tool_edit_pen_icon.png");
		modifyIcon = modifyIcon.getScaledInstance(16, 16, Image.SCALE_SMOOTH);
		modifyMenuItem.setIcon(new ImageIcon(modifyIcon));
		modifyMenuItem.setMnemonic(KeyEvent.VK_E);
		add(modifyMenuItem);

	}

}