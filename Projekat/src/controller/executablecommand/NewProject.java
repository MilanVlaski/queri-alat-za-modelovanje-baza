package controller.executablecommand;

import javax.swing.JOptionPane;

import model.appmodel.ApplicationModel;
import view.menubar.menu.FileMenu;
import view.tree.NewModelMenu;
/** 
 * Komanda koja omogućava kreiranje novog projekta.
 * 
 * @see FileMenu
 * @author Grupa 1
 * @version 1.0
 */
public class NewProject extends AbstractExecutableCommand {
	private ApplicationModel appModel;
	
	public NewProject(ApplicationModel appModel) {
		super();
		this.appModel = appModel;
	}

	@Override
	public boolean execute() {
		//Prikazivanje dijaloga za unos imena projekta
		String name = JOptionPane.showInputDialog("Enter Project name:");
		if(name.isEmpty())
			return false;
		appModel.newProject( name);
		return true;
	}
}
