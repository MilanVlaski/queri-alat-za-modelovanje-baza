package controller.executablecommand;

import javax.swing.JOptionPane;

import model.appmodel.ApplicationModel;
import model.appmodel.ModelType;
import view.menubar.menu.AddMenu;
import view.menubar.menu.FileMenu;
import view.menubar.menu.NewModelMenu;
/** 
 * Komanda koja omogućava kreiranje novog modela.
 * 
 * @see NewModelMenu
 * @author Grupa 1
 * @version 1.0
 */
public class NewModel extends AbstractExecutableCommand{

	private ApplicationModel appModel;
	private ModelType type;
	
	public NewModel(ApplicationModel appModel, ModelType type) {
		super();
		this.appModel = appModel;
		this.type = type;
	}

	@Override
	public boolean execute() {
		//Prikazivanje dijaloga za unos imena modela
		String name = JOptionPane.showInputDialog("Enter Model name:");
		if(name.isEmpty())
			return false;
		appModel.newModel(type, name);
		return true;
	}
}
