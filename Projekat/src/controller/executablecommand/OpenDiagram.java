package controller.executablecommand;

import model.appmodel.Editing;
import model.datamodel.Diagram;
import view.Canvas;
import view.Editor;
import view.Frame;
import view.tree.CustomTreeMouseListener;
import view.tree.NewModelMenu;

/** 
 * Komanda koja omogućava otvaranje kreiranog dijagrama na radnoj površini.
 * 
 * @see DiagramPopupMenu
 * @see CustomTreeMouseListener
 * @author Grupa 1
 * @version 1.0
 */
public class OpenDiagram {

	public OpenDiagram(Diagram diagram, Frame mainFrame) {
		Editor editor = mainFrame.getEditor();
		Canvas canvas = new Canvas(mainFrame.getAppModel());
		canvas.setDiagram(diagram);
		
		
		mainFrame.getAppModel().setCurrentState(new Editing());
		mainFrame.getAppModel().setFocusedDiagram(diagram);
		
		editor.addCanvas(canvas);
		mainFrame.setEditor(editor);
		mainFrame.invalidate();
		mainFrame.validate();
		mainFrame.repaint();
		diagram.open();
	}
}