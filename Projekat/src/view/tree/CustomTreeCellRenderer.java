package view.tree;

import java.awt.Color;
import java.awt.Component;
import java.awt.Image;
import java.awt.Toolkit;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JTree;
import javax.swing.tree.DefaultTreeCellRenderer;
import javax.swing.tree.TreeCellRenderer;

import model.datamodel.ConceptualDiagram;
import model.datamodel.ConceptualModel;
import model.datamodel.LogicalDiagram;
import model.datamodel.LogicalModel;
import model.datamodel.PhysicalDiagram;
import model.datamodel.PhysicalModel;
import model.datamodel.Project;
import model.datamodel.WorkspaceComponent;

/**
* Prilagođeni renderer koji definiše prikaz čvorova stabla.
* 
* @see Tree
* @author Grupa1
* @version 1.0
*/

public class CustomTreeCellRenderer extends JLabel implements TreeCellRenderer {

	private static final long serialVersionUID = 39033111199001424L;
	DefaultTreeCellRenderer defaultTreeCellRenderer = new DefaultTreeCellRenderer();
	
	@Override
	public Component getTreeCellRendererComponent(JTree tree, Object value, boolean selected, boolean expanded,
			boolean leaf, int row, boolean hasFocus) {
		this.setText(value.toString());

		Toolkit toolkit = Toolkit.getDefaultToolkit();

		//postavljanje slika u zavisnosti kojeg je tipa element stabla
		if (value instanceof Project) {
			Image projectIcon = toolkit.getImage("images/suitcase.png");
			this.setIcon(new ImageIcon(projectIcon.getScaledInstance(20, 20, Image.SCALE_SMOOTH)));
		}
		else if (value instanceof ConceptualModel) {
			Image conceptualIcon = toolkit.getImage("images/conceptual.png");
			this.setIcon(new ImageIcon(conceptualIcon.getScaledInstance(20, 20, Image.SCALE_SMOOTH)));
		}
		else if (value instanceof ConceptualDiagram) {
			Image concDiagram = toolkit.getImage("images/concDiagram.png");
			this.setIcon(new ImageIcon(concDiagram.getScaledInstance(20, 20, Image.SCALE_SMOOTH)));
		}
		else if (value instanceof LogicalModel) {
			Image logicalIcon = toolkit.getImage("images/logic.png");
			this.setIcon(new ImageIcon(logicalIcon.getScaledInstance(20, 20, Image.SCALE_SMOOTH)));
		}
		else if (value instanceof LogicalDiagram) {
			Image logDiagram = toolkit.getImage("images/logDiagram.png");
			this.setIcon(new ImageIcon(logDiagram.getScaledInstance(20, 20, Image.SCALE_SMOOTH)));
		}
		else if (value instanceof PhysicalModel) {
			Image physicalicon = toolkit.getImage("images/physical model.png");
			this.setIcon(new ImageIcon(physicalicon.getScaledInstance(20, 20, Image.SCALE_SMOOTH)));
		}
		else if (value instanceof PhysicalDiagram) {
			Image phyDiagram = toolkit.getImage("images/phyDiagram.png");
			this.setIcon(new ImageIcon(phyDiagram.getScaledInstance(20, 20, Image.SCALE_SMOOTH)));
		}
		this.setOpaque(true);
		
		//definisanje ponasanja prilikom selektovanja elementa stabla
		if(selected)
		{
			this.setBackground(Color.gray);
		}
		else
		{
			this.setBackground(Color.white);
		}

		return this;
	}

}
