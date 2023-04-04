package controller.executablecommand;

import java.io.File;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import javax.swing.JFileChooser;

import model.appmodel.ApplicationModel;
import model.appmodel.ModelType;
import model.datamodel.Project;
/**
 * Klasa koja izvršava opciju čuvanja projekta i modela.
 * 
 * @see AbstractExecutableCommand
 * @author Grupa 1
 * @version 1.0
 */
public class SaveModel extends AbstractExecutableCommand {

	private ApplicationModel appModel;
	private ModelType type;
	
	public SaveModel(ApplicationModel appModel) {
		// TODO Auto-generated constructor stub
		super();
		this.appModel = appModel;
	}
	
	@Override
	public boolean execute() {
		  JFileChooser fileChooser= new JFileChooser();
	      int choice =fileChooser.showSaveDialog(fileChooser);
	      if (choice != JFileChooser.APPROVE_OPTION)
	    	  return false;
	      else {
	      try {
	      ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(fileChooser.getSelectedFile()));
	      out.writeObject(fileChooser);
	      out.close();
	      File outputFile=fileChooser.getSelectedFile();
	      System.out.println("Dijagram je sacuvan u "+fileChooser.getSelectedFile().getName());
	      }catch (Exception e1) {
			System.err.println("Greska pri cuvanju dijagrama: "+e1.getMessage());	
		}
	      return true;
		}
	}
}
