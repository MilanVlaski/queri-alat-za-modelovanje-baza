package view.tree;

import java.awt.Component;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JTree;
import javax.swing.SwingUtilities;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.TreePath;
import controller.executablecommand.OpenDiagram;
import model.appmodel.ApplicationModel;
import model.datamodel.Diagram;
import model.datamodel.Model;
import model.datamodel.Project;
import view.Frame;
/**
* Prilagođeni MouseListener koji osluškuje događaje na stablu.
* Obezbjeđuje otvaranje kontekstnih menija i direktno otvaranje dijagrama.
* 
* @see Tree
* @author Grupa1
* @version 1.0
*/
public class CustomTreeMouseListener implements MouseListener {
	
	private ApplicationModel appModel;
	
	public CustomTreeMouseListener(ApplicationModel appModel) {
		this.appModel=appModel;
	}

	@Override
	public void mouseClicked(MouseEvent e) {

		JTree tree = (JTree) e.getSource();

		TreePath treePath = tree.getPathForLocation(e.getX(), e.getY());
		DefaultMutableTreeNode node = (DefaultMutableTreeNode) treePath.getLastPathComponent();

		if (e.getClickCount() == 1 && e.getButton() == MouseEvent.BUTTON3) {

			if (node instanceof Project) {
				// otvaranje kontekstnog menija za rad sa projektom
				ProjectPopupMenu popupMenu = new ProjectPopupMenu(appModel,(Project)node);
				popupMenu.show(e.getComponent(), e.getX(), e.getY());

			} else if (node instanceof Model) {
				// otvaranje kontekstnog menija za rad sa modelom
				ModelPopupMenu popupMenu = new ModelPopupMenu(appModel,(Model)node,tree);
				popupMenu.show(e.getComponent(), e.getX(), e.getY());
			} else if (node.isLeaf()) {
				// kontekstni meni za otvaranje dijagrama
				Frame mainFrame = (Frame) SwingUtilities.getWindowAncestor((Component) e.getSource());
				DiagramPopupMenu popupMenu = new DiagramPopupMenu(appModel,(Diagram)node,mainFrame);
				popupMenu.show(e.getComponent(), e.getX(), e.getY());
			}

		} else if (e.getClickCount() == 2 && e.getButton() == MouseEvent.BUTTON1) {
			if (node.isLeaf()) {
				Frame mainFrame = (Frame) SwingUtilities.getWindowAncestor((Component) e.getSource());

				if (!((Diagram) node).isOpen()) { //ispituje da li je dijagram već otvoren
					new OpenDiagram((Diagram) node, mainFrame);

				}
			}
		}

	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub

	}

}
