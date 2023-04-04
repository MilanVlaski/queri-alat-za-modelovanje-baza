package controller.executablecommand;

import javax.swing.JOptionPane;

import model.appmodel.ApplicationModel;
import model.datamodel.Model;
import view.tree.ModelPopupMenu;
import view.tree.NewModelMenu;
/** 
 * Komanda koja omogućava kreiranje novog dijagrama unutar modela.
 * 
 * @see ModelPopupMenu
 * @author Grupa 1
 * @version 1.0
 */
public class NewDiagramInModel extends AbstractExecutableCommand {

	private Model model;
	private ApplicationModel appModel;
	
	public NewDiagramInModel(ApplicationModel appModel,Model model) {
		this.model=model;
		this.appModel=appModel;
	}
	
	@Override
	public boolean execute() {
		//Prikazivanje dijaloga za unos imena dijagrama
		String name = JOptionPane.showInputDialog("Enter Diagram name:");
		if(name.isEmpty())
			return false;
		model.addDiagram(model.createDiagram(name));
		appModel.notifyAllObservers();
		
		return true;
	}
}
