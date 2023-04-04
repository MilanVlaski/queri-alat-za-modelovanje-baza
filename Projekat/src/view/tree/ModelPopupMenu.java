package view.tree;

import java.awt.Image;
import java.awt.Toolkit;

import javax.swing.ImageIcon;

import javax.swing.JMenuItem;
import javax.swing.JPopupMenu;
import javax.swing.JTree;
import javax.swing.tree.DefaultMutableTreeNode;


import controller.executablecommand.NewDiagramInModel;

import model.appmodel.ApplicationModel;

import model.datamodel.Model;
import model.datamodel.Project;
import view.MenuItem;

/**
* Prilagođeni kontekstni meni za rad sa modelima.
* 
* @see CustomTreeMouseListener
* @author Grupa1
* @version 1.0
*/
public class ModelPopupMenu extends JPopupMenu {

	private static final long serialVersionUID = -6571302288862159789L;

	private JMenuItem newDiagram;
	private JMenuItem deleteMenuItem;

	public ModelPopupMenu(ApplicationModel appModel, Model model,JTree tree) {

		Toolkit toolkit = Toolkit.getDefaultToolkit();

		// konfiguracija stavke menija
		newDiagram = new MenuItem("New Diagram");
		Image newDiagramIcon = toolkit.getImage("images/diagram.png");
		newDiagramIcon = newDiagramIcon.getScaledInstance(16, 16, Image.SCALE_SMOOTH);
		newDiagram.setIcon(new ImageIcon(newDiagramIcon));
		newDiagram.addActionListener(e -> {
			new NewDiagramInModel(appModel, model).execute();
		});
		add(newDiagram);

		deleteMenuItem = new JMenuItem("Delete");
		Image deleteIcon = toolkit.getImage("images/cross.png");
		deleteMenuItem.setIcon(new ImageIcon(deleteIcon));
		deleteMenuItem.addActionListener(e -> {
			DefaultMutableTreeNode project = (DefaultMutableTreeNode) (model.getParent());
			project.remove(model);
			if (project.isRoot()) {
				appModel.removeComponent(model);
			
			} else {
				((Project)project).removeModels(model);
			}
			appModel.notifyAllObservers();
		});
		add(deleteMenuItem);
	}
}
