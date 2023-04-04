/***********************************************************************
 * Module:  WindowMenu.java
 * Author:  fejzo_000
 * Purpose: Defines the Class WindowMenu
 ***********************************************************************/

package view.menubar.menu;

import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;

import javax.swing.ImageIcon;

import view.Menu;
import view.MenuItem;
import view.menubar.DefaultMenuBar;

/**
* Prilagođeni Window meni. 
* Nasljedjuje klasu Menu.
* 
* @see Menu
* @see DefaultMenuBar
* @author Grupa1
* @version 1.0
*/
public class WindowMenu extends Menu {

	private static final long serialVersionUID = 6368683595118518020L;
	private MenuItem changeFontMenuItem;
	private Menu changeLanguageMenu;
	private Menu changeEditorMenu;

	public WindowMenu() {

		Toolkit toolkit = Toolkit.getDefaultToolkit();

		setText("Window");
		setMnemonic(KeyEvent.VK_W);

		// konfiguracija pojedinacne stavke menija
		changeFontMenuItem = new MenuItem("Font...");
		Image fontIcon = toolkit.getImage("images/font.png").getScaledInstance(18, 20, Image.SCALE_SMOOTH);
		changeFontMenuItem.setIcon(new ImageIcon(fontIcon));
		add(changeFontMenuItem);

		changeLanguageMenu = new LanguageMenu();
		Image languageIcon = toolkit.getImage("images/language.png").getScaledInstance(18, 20, Image.SCALE_SMOOTH);
		changeLanguageMenu.setIcon(new ImageIcon(languageIcon));
		add(changeLanguageMenu);

		changeEditorMenu = new EditorMenu();
		Image editorIcon = toolkit.getImage("images/editor.png").getScaledInstance(16, 16, Image.SCALE_SMOOTH);
		changeEditorMenu.setIcon(new ImageIcon(editorIcon));
		add(changeEditorMenu);

	}

}