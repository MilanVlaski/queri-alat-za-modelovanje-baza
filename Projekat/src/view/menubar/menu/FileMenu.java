/***********************************************************************
 * Module:  ProjectMenu.java
 * Author:  fejzo_000
 * Purpose: Defines the Class ProjectMenu
 ***********************************************************************/

package view.menubar.menu;

import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.KeyStroke;

import controller.executablecommand.NewModel;
import controller.executablecommand.NewProject;
import controller.executablecommand.SaveModel;
import model.appmodel.ApplicationModel;
import model.appmodel.ModelType;
import view.Menu;
import view.MenuItem;
import view.menubar.DefaultMenuBar;
/**
* Prilagođeni File meni. 
* Nasljeđuje klasu Menu.
* 
* @see Menu
* @see DefaultMenuBar
* @author Grupa1
* @version 1.0
*/
public class FileMenu extends Menu {

	private static final long serialVersionUID = 1160589017458578140L;

	private ApplicationModel appModel;
	private Menu newModelMenu;
	private MenuItem newProjectMenuItem;
	private MenuItem openMenuItem;
	private MenuItem saveMenuItem;
	private MenuItem saveAsMenuItem;
	private MenuItem printMenuItem;
	private MenuItem importMenuItem;
	private MenuItem exportMenuItem;
	private MenuItem exitMenuItem;

	public FileMenu(ApplicationModel appModel) {
		this.appModel = appModel;

		setText("File");
		setMnemonic(KeyEvent.VK_F);

		Toolkit toolkit = Toolkit.getDefaultToolkit();

		newModelMenu = new NewModelMenu(appModel);
		Image modelIcon = toolkit.getImage("images/plus.png").getScaledInstance(16, 16, Image.SCALE_SMOOTH);

		newModelMenu.setIcon(new ImageIcon(modelIcon));
		add(newModelMenu);

		// konfiguracija pojedinacne stavke menija

		newProjectMenuItem = new MenuItem("New Project...");
		Image projectIcon = toolkit.getImage("images/suitcase.png");
		projectIcon = projectIcon.getScaledInstance(16, 16, Image.SCALE_SMOOTH); // prilagodjavanje velicine slike
		newProjectMenuItem.setIcon(new ImageIcon(projectIcon));
		newProjectMenuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_P, KeyEvent.CTRL_DOWN_MASK));
		newProjectMenuItem.setMnemonic(KeyEvent.VK_P);
		newProjectMenuItem.addActionListener(e -> {
			new NewProject(appModel).execute();
		});
		add(newProjectMenuItem);

		openMenuItem = new MenuItem("Open...");
		Image openIcon = toolkit.getImage("images/folder_opened_icon.png");
		openIcon = openIcon.getScaledInstance(16, 16, Image.SCALE_SMOOTH);
		openMenuItem.setIcon(new ImageIcon(openIcon));
		openMenuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_O, KeyEvent.CTRL_DOWN_MASK));
		openMenuItem.setMnemonic(KeyEvent.VK_O);
//		openMenuItem.addActionListener(e->{JFileChooser fileChooser = new JFileChooser();
//											fileChooser.showOpenDialog(fileChooser);
//		});
		add(openMenuItem);

		addSeparator();

		saveMenuItem = new MenuItem("Save");
		Image saveIcon = toolkit.getImage("images/disk-black.png");
		saveMenuItem.setIcon(new ImageIcon(saveIcon));
		saveMenuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S, KeyEvent.CTRL_DOWN_MASK));
		saveMenuItem.setMnemonic(KeyEvent.VK_S);
		add(saveMenuItem);
		saveMenuItem.addActionListener(e->{
			new SaveModel(appModel).execute();
		});

		saveAsMenuItem = new MenuItem("Save As...");
		Image saveAsIcon = toolkit.getImage("images/disks-black.png");
		saveAsMenuItem.setIcon(new ImageIcon(saveAsIcon));
		saveAsMenuItem.setMnemonic(KeyEvent.VK_S);
		add(saveAsMenuItem);

		addSeparator();

		printMenuItem = new MenuItem("Print...");
		Image printIcon = toolkit.getImage("images/printer.png");
		printMenuItem.setIcon(new ImageIcon(printIcon));
		printMenuItem.setMnemonic(KeyEvent.VK_P);
		add(printMenuItem);

		addSeparator();

		importMenuItem = new MenuItem("Import...");
		Image importIcon = toolkit.getImage("images/import_save_down_storage_icon.png");
		importIcon = importIcon.getScaledInstance(16, 16, Image.SCALE_SMOOTH);
		importMenuItem.setIcon(new ImageIcon(importIcon));
		importMenuItem.setMnemonic(KeyEvent.VK_I);
		add(importMenuItem);

		exportMenuItem = new MenuItem("Export...");
		Image exportIcon = toolkit.getImage("images/export_share_upload_up_icon.png");
		exportIcon = exportIcon.getScaledInstance(16, 16, Image.SCALE_SMOOTH);
		exportMenuItem.setIcon(new ImageIcon(exportIcon));
		exportMenuItem.setMnemonic(KeyEvent.VK_E);
		add(exportMenuItem);

		addSeparator();

		exitMenuItem = new MenuItem("Exit");
		Image exitIcon = toolkit.getImage("images/exit.png");
		exitMenuItem.setIcon(new ImageIcon(exitIcon));
		exitMenuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_E, KeyEvent.CTRL_DOWN_MASK));
		exitMenuItem.setMnemonic(KeyEvent.VK_E);
		exitMenuItem.addActionListener(e -> System.exit(0));
		add(exitMenuItem);
	}
}