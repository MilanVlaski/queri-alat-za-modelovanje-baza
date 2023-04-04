/***********************************************************************
 * Module:  HelpMenu.java
 * Author:  fejzo_000
 * Purpose: Defines the Class HelpMenu
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
* Prilagođeni Help meni. 
* Nasljeđuje klasu Menu.
* 
* @see Menu
* @see DefaultMenuBar
* @author Grupa1
* @version 1.0
*/
public class HelpMenu extends Menu {

	/**
	 * 
	 */
	private static final long serialVersionUID = 8869264213304737629L;
	private MenuItem onlineHelpMenuItem;
	private MenuItem aplicationMenuItem;
	private MenuItem faqMenuItem;

	public HelpMenu() {
		// postavljanje osnovnih parametara
		setText("Help");
		setMnemonic(KeyEvent.VK_H);

		Toolkit toolkit = Toolkit.getDefaultToolkit();

		// konfiguracija pojedinacne stavke menija
		onlineHelpMenuItem = new MenuItem("Online help");
		Image helpIcon = toolkit.getImage("images/question-frame.png");
		onlineHelpMenuItem.setIcon(new ImageIcon(helpIcon));
		onlineHelpMenuItem.setMnemonic(KeyEvent.VK_H);
		add(onlineHelpMenuItem);

		faqMenuItem = new MenuItem("FAQ");
		Image faqIcon = toolkit.getImage("images/faq.png");
		faqMenuItem.setIcon(new ImageIcon(faqIcon));
		faqMenuItem.setMnemonic(KeyEvent.VK_F);
		add(faqMenuItem);

		aplicationMenuItem = new MenuItem("About queri...");
		Image appIcon = toolkit.getImage("images/logoKropovan.png");
		appIcon = appIcon.getScaledInstance(16, 16, Image.SCALE_SMOOTH);
		aplicationMenuItem.setIcon(new ImageIcon(appIcon));
		aplicationMenuItem.setMnemonic(KeyEvent.VK_Q);
		add(aplicationMenuItem);
	}
}