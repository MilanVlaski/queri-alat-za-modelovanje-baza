/***********************************************************************
 * Module:  Tree.java
 * Author:  PC
 * Purpose: Defines the Class Tree
 ***********************************************************************/

package view.tree;

import java.awt.Color;
import java.awt.Dimension;

import javax.swing.BorderFactory;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTree;
import javax.swing.tree.DefaultTreeModel;
import javax.swing.tree.TreeModel;
import javax.swing.tree.TreeSelectionModel;

import model.appmodel.ApplicationModel;
import model.datamodel.ConceptualDiagram;
import model.datamodel.ConceptualModel;
import model.datamodel.Diagram;
import model.datamodel.LogicalDiagram;
import model.datamodel.LogicalModel;
import model.datamodel.Model;
import model.datamodel.PhysicalDiagram;
import model.datamodel.PhysicalModel;
import model.datamodel.Project;
import view.Frame;
import view.TreeContextMenu;
import view.ViewComponent;
/**
* Panel na kojem se iscrtava stablo sa Workspace komponentama.
* 
* @see Frame
* @author Grupa1
* @version 1.0
*/
public class Tree extends JPanel implements ViewComponent {

	private static final long serialVersionUID = -3572702758475625202L;
	private TreeContextMenu treeContextMenu;
	private ApplicationModel appModel;
	private JTree tree;
	private Dimension size;

	public Tree(ApplicationModel appModel) {
		this.appModel = appModel;
		// postavljanje osnovnih parametara
				setBackground(Color.white);
				size = new Dimension(200, 750);
				setPreferredSize(size);
				
				initialiseTree(size);
	}

	@Override
	public void update() {
		this.removeAll();
		initialiseTree(size);
		this.revalidate();
		this.repaint();
	}

	
/** Metoda koja kreira stablo.*/
	private void initialiseTree(Dimension size) {
		

		// kreiranje stabla na panelu i postavljanje osnovnih parametara stabla

		tree = new JTree(new CustomTreeModel(appModel));
		tree.setRootVisible(false);
		tree.setShowsRootHandles(true);
		tree.setPreferredSize(size);
		tree.setBorder(BorderFactory.createEmptyBorder(5, 10, 5, 5));
		tree.getSelectionModel().setSelectionMode(TreeSelectionModel.SINGLE_TREE_SELECTION);
		tree.setCellRenderer(new CustomTreeCellRenderer()); // ovim se podesavaju ikonice
		tree.addMouseListener(new CustomTreeMouseListener(appModel)); // ovim se treba omoguciti otvaranje dijagrama
		tree.setRowHeight(22);

		add(tree);
		
	}
}