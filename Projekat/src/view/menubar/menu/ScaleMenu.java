package view.menubar.menu;

import java.awt.event.KeyEvent;


import view.Menu;
import view.MenuItem;

/**
* Prilagođeni podmeni za izbor nivoa približenosti pogleda.
* Nasljeđuje klasu Menu.
* 
* @see Menu
* @see ViewMenu
* @author Grupa1
* @version 1.0
*/
public class ScaleMenu extends Menu {

	private static final long serialVersionUID = 2762176406194425385L;
	private MenuItem percent25MenuItem;
	private MenuItem percent33MenuItem;
	private MenuItem percent50MenuItem;
	private MenuItem percent60MenuItem;
	private MenuItem percent75MenuItem;
	private MenuItem percent100MenuItem;
	private MenuItem percent125MenuItem;
	private MenuItem percent150MenuItem;
	private MenuItem percent175MenuItem;
	private MenuItem percent200MenuItem;
	private MenuItem percent400MenuItem;

	public ScaleMenu() {

		setText("Scale");
		setMnemonic(KeyEvent.VK_S);

		percent25MenuItem = new MenuItem("25%");
		add(percent25MenuItem);

		percent33MenuItem = new MenuItem("33%");
		add(percent33MenuItem);

		percent50MenuItem = new MenuItem("50%");
		add(percent50MenuItem);

		percent60MenuItem = new MenuItem("60%");
		add(percent60MenuItem);

		percent75MenuItem = new MenuItem("75%");
		add(percent75MenuItem);

		addSeparator();

		percent100MenuItem = new MenuItem("100%");
		add(percent100MenuItem);

		addSeparator();

		percent125MenuItem = new MenuItem("125%");
		add(percent125MenuItem);

		percent150MenuItem = new MenuItem("150%");
		add(percent150MenuItem);

		percent175MenuItem = new MenuItem("175%");
		add(percent175MenuItem);

		percent200MenuItem = new MenuItem("200%");
		add(percent200MenuItem);

		percent400MenuItem = new MenuItem("400%");
		add(percent400MenuItem);
	}
}
