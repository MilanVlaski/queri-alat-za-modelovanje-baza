package view.menubar.menu;

import java.awt.Image;
import java.awt.Toolkit;

import java.awt.event.KeyEvent;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.KeyStroke;

import controller.executablecommand.NewModel;
import model.appmodel.ApplicationModel;
import model.appmodel.ModelType;
import view.Menu;
import view.MenuItem;

/**
* Prilagođeni podmeni za kreiranje novog modela.
* Nasljeđuje klasu Menu.
* 
* @see Menu
* @see FileMenu
* @author Grupa1
* @version 1.0
*/
public class NewModelMenu extends Menu {

	private static final long serialVersionUID = -3071431061110737163L;
	private MenuItem conceptualMenuItem;
	private MenuItem logicalMenuItem;
	private MenuItem physicalMenuItem;
	private ApplicationModel appModel;
	
	public NewModelMenu(ApplicationModel appModel) {
			this.appModel = appModel;
			setText("New Model...");
			setMnemonic(KeyEvent.VK_M);
			
			Toolkit toolkit = Toolkit.getDefaultToolkit();
			
			//konfiguracija pojedinacne stavke menija
			
			conceptualMenuItem = new MenuItem("Conceptual Model...");
			Image conceptualIcon = toolkit.getImage("images/conceptual.png");
			conceptualIcon=conceptualIcon.getScaledInstance(16,16,Image.SCALE_SMOOTH);
			conceptualMenuItem.setIcon(new ImageIcon(conceptualIcon));
			conceptualMenuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_C, KeyEvent.CTRL_DOWN_MASK | KeyEvent.ALT_DOWN_MASK));
			conceptualMenuItem.setMnemonic(KeyEvent.VK_C);
			conceptualMenuItem.addActionListener(e->{new NewModel(appModel, ModelType.CONCEPTUAL).execute();
			});
			add(conceptualMenuItem);
			
			logicalMenuItem = new MenuItem("Logical Model...");
			Image logicalIcon = toolkit.getImage("images/logic.png");
			logicalIcon=logicalIcon.getScaledInstance(16,16,Image.SCALE_SMOOTH);
			logicalMenuItem.setIcon(new ImageIcon(logicalIcon));
			logicalMenuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_L, KeyEvent.CTRL_DOWN_MASK | KeyEvent.ALT_DOWN_MASK));
			logicalMenuItem.setMnemonic(KeyEvent.VK_L);
			add(logicalMenuItem);
			
			physicalMenuItem = new MenuItem("Physical Model...");
			Image physicalicon = toolkit.getImage("images/physical model.png");
			physicalicon=physicalicon.getScaledInstance(16,16,Image.SCALE_SMOOTH);
			physicalMenuItem.setIcon(new ImageIcon(physicalicon));
			physicalMenuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_P, KeyEvent.CTRL_DOWN_MASK | KeyEvent.ALT_DOWN_MASK));
			physicalMenuItem.setMnemonic(KeyEvent.VK_P);
			add(physicalMenuItem);
		}
	

	}


