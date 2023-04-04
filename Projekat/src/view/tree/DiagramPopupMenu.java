package view.tree;

import java.awt.Component;
import java.awt.Image;
import java.awt.Toolkit;

import javax.swing.ImageIcon;
import javax.swing.JMenuItem;
import javax.swing.JPopupMenu;
import javax.swing.SwingUtilities;

import controller.executablecommand.NewDiagramInModel;
import controller.executablecommand.OpenDiagram;
import model.appmodel.ApplicationModel;
import model.datamodel.Diagram;
import model.datamodel.Model;
import view.Frame;
import view.MenuItem;

/**
* Prilagođeni kontekstni meni za rad sa dijagramima.
* 
* @see CustomTreeMouseListener
* @author Grupa1
* @version 1.0
*/
public class DiagramPopupMenu extends JPopupMenu {

	private static final long serialVersionUID = -2647375988000148985L;
	private JMenuItem openDiagramMenuItem;
	private JMenuItem deleteMenuItem;
	
	public DiagramPopupMenu(ApplicationModel appModel,Diagram diagram,Frame mainFrame) {
		Toolkit toolkit = Toolkit.getDefaultToolkit();

		// konfiguracija stavke menija
		openDiagramMenuItem = new MenuItem("Open Diagram");
		openDiagramMenuItem.addActionListener(e -> {

			if (!(diagram.isOpen())) { //ispituje da li je dijagram već otvoren
				new OpenDiagram(diagram, mainFrame);

			}
		});
		add(openDiagramMenuItem);
		
		

		deleteMenuItem = new JMenuItem("Delete");
		Image deleteIcon = toolkit.getImage("images/cross.png");
		deleteMenuItem.setIcon(new ImageIcon(deleteIcon));
		deleteMenuItem.addActionListener(e -> {
		Model model=(Model)(diagram.getParent());
		model.remove(diagram);
		model.removeDiagrams(diagram);
		appModel.notifyAllObservers();	
		});
		add(deleteMenuItem);
		
		
	}

}
