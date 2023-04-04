package view.tree;



import javax.swing.tree.DefaultMutableTreeNode;


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
import model.datamodel.WorkspaceComponent;

/**
* Prilagođeni model stabla.
* Sadrži logiku za popunjavanje stabla.
* 
* @see Tree
* @author Grupa1
* @version 1.0
*/
public class CustomTreeModel extends DefaultMutableTreeNode {

	private static final long serialVersionUID = 7758929802989056281L;
	private ApplicationModel appModel;

	public CustomTreeModel(ApplicationModel appModel) {
		super("Workspace Components");
		this.appModel = appModel;

		
		// potrebno je prolaziti kroz Workspace komponente appModela i puniti stablo
		readComponents();
	}
	
	/** Metoda za dodavanje čvorova stabla*/
	public void readComponents() {
		for (WorkspaceComponent component : appModel.getComponents()) {
			if (component instanceof Project) {
				// dodavanje cvora za projekat
				add(component);
				for (WorkspaceComponent model : ((Project) component).getModels()) {
					if (model instanceof Model) {
						// dodavanje cvora za model
						component.add(model);
						for (Diagram diagram : ((Model) model).getDiagrams()) {
							// dodavanje cvora za dijagram
							model.add(diagram);
						}
					}
				}
			} else {
				// dodavanje cvora za model
				add(component);
				for (Diagram diagram : ((Model)component).getDiagrams()) {
					// dodavanje cvora za dijagram
					component.add(diagram);
				}
			}
		}
	}
	
}
