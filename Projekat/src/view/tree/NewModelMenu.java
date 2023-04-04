package view.tree;

import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;

import javax.swing.ImageIcon;
import javax.swing.JMenu;
import javax.swing.KeyStroke;

import controller.executablecommand.NewModel;
import controller.executablecommand.NewModelInProject;
import model.appmodel.ApplicationModel;
import model.appmodel.ModelType;
import model.datamodel.Project;
import view.MenuItem;

/**
* Prilagođeni podmeni kontekstnog menija za rad sa projektima.
* 
* @see ProjectPopupMenu
* @author Grupa1
* @version 1.0
*/
public class NewModelMenu extends JMenu {

	private static final long serialVersionUID = 2239021857814031078L;

	private MenuItem conceptualMenuItem;
	private MenuItem logicalMenuItem;
	private MenuItem physicalMenuItem;
	
	public NewModelMenu(ApplicationModel appModel, Project project) {

			setText("New Model...");
			
			Toolkit toolkit = Toolkit.getDefaultToolkit();
			
			//konfiguracija pojedinacne stavke menija
			
			conceptualMenuItem = new MenuItem("Conceptual Model...");
			Image conceptualIcon = toolkit.getImage("images/conceptual.png");
			conceptualIcon=conceptualIcon.getScaledInstance(16,16,Image.SCALE_SMOOTH);
			conceptualMenuItem.setIcon(new ImageIcon(conceptualIcon));
			
			conceptualMenuItem.addActionListener(e->{new NewModelInProject(appModel, ModelType.CONCEPTUAL,project).execute();
			});
			add(conceptualMenuItem);
			
			logicalMenuItem = new MenuItem("Logical Model...");
			Image logicalIcon = toolkit.getImage("images/logic.png");
			logicalIcon=logicalIcon.getScaledInstance(16,16,Image.SCALE_SMOOTH);
			logicalMenuItem.setIcon(new ImageIcon(logicalIcon));
			add(logicalMenuItem);
			
			physicalMenuItem = new MenuItem("Physical Model...");
			Image physicalicon = toolkit.getImage("images/physical model.png");
			physicalicon=physicalicon.getScaledInstance(16,16,Image.SCALE_SMOOTH);
			physicalMenuItem.setIcon(new ImageIcon(physicalicon));
			add(physicalMenuItem);
		}
	

}
