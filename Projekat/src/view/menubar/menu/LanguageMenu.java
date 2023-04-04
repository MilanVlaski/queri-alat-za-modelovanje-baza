package view.menubar.menu;

import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;

import javax.swing.ImageIcon;


import view.Menu;
import view.MenuItem;

/**
* Prilagođeni podmeni za izbor jezika.
* Nasljeđuje klasu Menu.
* 
* @see Menu
* @see WindowMenu
* @author Grupa1
* @version 1.0
*/
public class LanguageMenu extends Menu {

	private static final long serialVersionUID = 6468276455723618413L;
	private MenuItem bhsMenuItem;
	private MenuItem englishMenuItem;
	
	public LanguageMenu() {
		setText("Language...");
		setMnemonic(KeyEvent.VK_L);
		
		Toolkit toolkit = Toolkit.getDefaultToolkit();
		
		//konfiguracija pojedinacne stavke menija
		
		bhsMenuItem = new MenuItem("BHS");
		Image bhsIcon = toolkit.getImage("images/bosnia-and-herzegovina.png");
		bhsIcon=bhsIcon.getScaledInstance(16,16,Image.SCALE_SMOOTH);
		bhsMenuItem.setIcon(new ImageIcon(bhsIcon));
		add(bhsMenuItem);
		
		englishMenuItem = new MenuItem("English");
		Image englishIcon = toolkit.getImage("images/united-kingdom.png");
		englishIcon=englishIcon.getScaledInstance(16,16,Image.SCALE_SMOOTH);
		englishMenuItem.setIcon(new ImageIcon(englishIcon));
		add(englishMenuItem);
	}
	
}
