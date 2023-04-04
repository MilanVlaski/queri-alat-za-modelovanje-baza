package view;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JLabel;
import javax.swing.JTabbedPane;

import model.appmodel.Active;
import model.appmodel.ApplicationModel;
import model.datamodel.Diagram;
/**
 * Prati akcije miša od strane korisnika na canvasu.
 * 
 * @author Grupa 1
 * @version 1.0
 *
 */

public class TabbedPaneHeaderMouseListener implements MouseListener {

	ApplicationModel appModel;
	
	public TabbedPaneHeaderMouseListener(ApplicationModel appModel) {
		super();
		this.appModel = appModel;
	}
	
	@Override
	public void mouseClicked(MouseEvent e) {
		JLabel btnX = (JLabel) e.getSource();
		Editor tabbedPane = (Editor) btnX.getParent().getParent().getParent();
		Canvas canvas = tabbedPane.getCanvasByIndex(tabbedPane.getSelectedIndex());
		Diagram diagram = canvas.getDiagram();
		diagram.close();
		tabbedPane.removeCanvas(canvas);

		if(tabbedPane.getTabCount()>=1)
			tabbedPane.remove(tabbedPane.getSelectedComponent());
		
		if(tabbedPane.getTabCount() == 0)
			appModel.setCurrentState(new Active());
		
		appModel.notifyAllObservers();
	}

	@Override
	public void mouseEntered(MouseEvent arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseExited(MouseEvent arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mousePressed(MouseEvent arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseReleased(MouseEvent arg0) {
		// TODO Auto-generated method stub

	}

}
