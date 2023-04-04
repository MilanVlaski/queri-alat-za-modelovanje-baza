/***********************************************************************
 * Module:  ToolBar.java
 * Author:  PC
 * Purpose: Defines the Class ToolBar
 ***********************************************************************/

package view.toolbar;

import java.awt.Toolkit;
import java.util.*;

import javax.swing.JButton;
import javax.swing.JToolBar;

import model.appmodel.ApplicationModel;
import model.appmodel.ApplicationState;
import view.ViewComponent;
/**
 * Generalni izgled trake sa alatima na kojoj su smještene pojedinačne trake sa alatima.
 * 
 * @see JToolBar
 * @see ViewComponent
 * @author Grupa 1
 * @version 1.0
 *
 */
public class ToolBar extends JToolBar implements ViewComponent{
  
	private static final long serialVersionUID = 1L;
	protected Vector<JButton> buttons = null;
	protected Toolkit toolkit;
	ApplicationModel appModel;
	private ProjectToolBar projectToolBar;
	private EditToolBar editToolBar;
	private ViewToolBar viewToolBar;
	private WindowToolBar windowToolBar;
	private HelpToolBar helpToolBar;
	
	public ToolBar() {
		buttons = new Vector<JButton>();
		toolkit = Toolkit.getDefaultToolkit();
	}
   
	public ToolBar createToolBar(ApplicationModel appModel) {
		projectToolBar = new ProjectToolBar(appModel);
		editToolBar = new EditToolBar();
		viewToolBar = new ViewToolBar();
		windowToolBar = new WindowToolBar();
		helpToolBar = new HelpToolBar();
		
		add(projectToolBar.addButtons(projectToolBar.getButtons()));
		add(editToolBar.addButtons(editToolBar.getButtons()));
		add(viewToolBar.addButtons(viewToolBar.getButtons()));
		add(windowToolBar.addButtons(windowToolBar.getButtons()));
		add(helpToolBar.addButtons(helpToolBar.getButtons()));
		
		this.appModel = appModel;
		update();
		
		
		return this;
	}

	public Vector<JButton> getButtons() {
		return buttons;
	}
	
	public ToolBar addButtons(Vector<JButton> buttons) {
		   for (JButton jButton : buttons) {
				this.add(jButton);
			}
		   this.addSeparator();
		   return this;
	   }
	
	 public void disableButtons(Vector<JButton> buttons) {
			for (JButton jButton : buttons) {
				jButton.setEnabled(false);
			}
		}
		
	public void enableButtons(Vector<JButton> buttons) {
			for (JButton jButton : buttons) {
				jButton.setEnabled(true);
			}
		}
		
	@Override
	public void update() {
		
		if(appModel.getCurrentState().getNameOfState() == "Idle") {
			editToolBar.disable();
			viewToolBar.disable();
		}
		else if(appModel.getCurrentState().getNameOfState() == "Active" || appModel.getCurrentState().getNameOfState() == "Editing") {
			editToolBar.enable();
			viewToolBar.enable();
		} 
			
		
	}
}