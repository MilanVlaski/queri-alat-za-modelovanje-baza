package controller.executablecommand;

import javax.swing.JOptionPane;

import model.appmodel.ApplicationModel;
import model.appmodel.ModelType;
import model.datamodel.Project;
import view.menubar.menu.NewModelMenu;
/** 
 * Komanda koja omogućava kreiranje novog modela unutar postojećeg projekta.
 * 
 * @see view.tree.NewModelMenu
 * @author Grupa 1
 * @version 1.0
 */
public class NewModelInProject extends AbstractExecutableCommand {
	private ApplicationModel appModel;
	private ModelType type;
	private Project project;
	
	public NewModelInProject(ApplicationModel appModel, ModelType type, Project project) {
		super();
		this.appModel = appModel;
		this.type = type;
		this.project=project;
	}

	@Override
	public boolean execute() {
		//Prikazivanje dijaloga za unos imena modela
		String name = JOptionPane.showInputDialog("Enter Model name:");
		if(name.isEmpty())
			return false;
		appModel.newModelInProject(type, project, name);
		return true;
	}

}
