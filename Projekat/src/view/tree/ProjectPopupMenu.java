package view.tree;

import java.awt.Image;
import java.awt.Toolkit;


import javax.swing.ImageIcon;
import javax.swing.JMenuItem;
import javax.swing.JPopupMenu;

import javax.swing.tree.DefaultMutableTreeNode;

import model.appmodel.ApplicationModel;

import model.datamodel.Project;



/**
* Prilagođeni kontekstni meni za rad sa projektima.
* 
* @see CustomTreeMouseListener
* @author Grupa1
* @version 1.0
*/
public class ProjectPopupMenu extends JPopupMenu {

	private static final long serialVersionUID = -1831317213422198521L;
	private NewModelMenu newModelMenu;
	private JMenuItem deleteMenuItem;
	

	public ProjectPopupMenu(ApplicationModel appModel, Project project) {
	

		Toolkit toolkit = Toolkit.getDefaultToolkit();

		// konfiguracija stavke menija
		newModelMenu = new NewModelMenu(appModel,project) ;
		Image modelIcon = toolkit.getImage("images/plus.png").getScaledInstance(16, 16, Image.SCALE_SMOOTH);
		newModelMenu.setIcon(new ImageIcon(modelIcon));
		add(newModelMenu);
		
		
		deleteMenuItem = new JMenuItem("Delete");
		Image deleteIcon = toolkit.getImage("images/cross.png");
		deleteMenuItem.setIcon(new ImageIcon(deleteIcon));
		deleteMenuItem.addActionListener(e -> {
			DefaultMutableTreeNode root=(DefaultMutableTreeNode) project.getParent();
			root.remove(project);
			appModel.removeComponent(project);
			appModel.notifyAllObservers();
		});
		add(deleteMenuItem);
	}
}
