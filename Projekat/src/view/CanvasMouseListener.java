package view;

import java.awt.event.MouseAdapter;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.Iterator;
import java.util.List;

import model.appmodel.ApplicationModel;
import model.datamodel.AddingState;
import model.datamodel.objects.ConEntity;
import model.datamodel.objects.ConRelationship;
import view.objectbox.ConceptualObjectBox;
import view.StatusBar;

/**
 * Klasa koja prati pokrete miša i na osnovu korisničkih akcija izvršava određene metode.
 * 
 * @author Grupa 1
 * @version 1.0
 *
 */
public class CanvasMouseListener implements MouseListener {

	private ApplicationModel model;
	private Canvas canvas;
	private ConceptualObjectBox concObjBox;
	private List<ObjectBoxItem> objectBoxItems;
	private int startX, startY;
	protected static int x;
	protected static int y;
	
	public CanvasMouseListener(ApplicationModel model, Canvas canvas) {
		this.model = model;
		this.canvas = canvas;
		concObjBox = new ConceptualObjectBox(model);
		objectBoxItems = concObjBox.getObjectBoxItems();
	}
	
	@Override
	public void mouseClicked(MouseEvent e) {
		if (e.getButton() == MouseEvent.BUTTON1) {
			int x, y;
			x = e.getX();
			y = e.getY();
			
			if(canvas.getDiagram().getCurrentState() instanceof AddingState) {
				AddingState addingState = (AddingState) canvas.getDiagram().getCurrentState();
				if(addingState.isElement())
					canvas.getDiagram().addElement(x, y);
				}
			canvas.repaint();
		}
	}
	@Override
	public void mousePressed(MouseEvent e) {
		if (e.getButton() == MouseEvent.BUTTON1) {
			this.startX = e.getX();
			this.startY = e.getY();
		}

	}

	@Override
	public void mouseReleased(MouseEvent e) {
		if (e.getButton() == MouseEvent.BUTTON1) {
			int x = e.getX();
			int y = e.getY();
			
			if(canvas.getDiagram().getCurrentState() instanceof AddingState) {
				AddingState addingState = (AddingState) canvas.getDiagram().getCurrentState();
				if(!addingState.isElement())
					canvas.getDiagram().addLink(startX, startY, x, y);
			}
			canvas.repaint();
	}
}
	
	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub

	}

}
