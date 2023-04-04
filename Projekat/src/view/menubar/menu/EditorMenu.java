package view.menubar.menu;

import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;

import javax.swing.ImageIcon;

import view.Menu;
import view.MenuItem;

/**
* Prilagođeni podmeni za podešavanje editora.
* Nasljeđuje klasu Menu.
* 
* @see Menu
* @see WindowMenu
* @author Grupa1
* @version 1.0
*/
public class EditorMenu extends Menu {

	private static final long serialVersionUID = -4531728163527764618L;
	private MenuItem resizeMenuItem;
	private MenuItem colorMenuItem;
	
	public EditorMenu() {
		setText("Editor...");
		setMnemonic(KeyEvent.VK_E);
		
		Toolkit toolkit = Toolkit.getDefaultToolkit();
		
		//konfiguracija pojedinacne stavke menija
		
		resizeMenuItem = new MenuItem("Resize");
		Image resizeIcon = toolkit.getImage("images/full-screen.png");
		resizeIcon=resizeIcon.getScaledInstance(16,16,Image.SCALE_SMOOTH);
		resizeMenuItem.setIcon(new ImageIcon(resizeIcon));
		add(resizeMenuItem);
		
		colorMenuItem = new MenuItem("Color");
		Image colorIcon = toolkit.getImage("images/colorwheel.png");
		colorIcon=colorIcon.getScaledInstance(16,16,Image.SCALE_SMOOTH);
		colorMenuItem.setIcon(new ImageIcon(colorIcon));
		add(colorMenuItem);
	}

}
