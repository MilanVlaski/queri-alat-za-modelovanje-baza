package controller.executablecommand;

import java.awt.Point;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
/**
 * Klasa za dodavanje entiteta na editor u preciziranoj tački.
 * 
 * @see AbstractExecutableCommand
 * @author Grupa 1
 * @version 1.0
 */
public class AddNewEntity extends AbstractExecutableCommand implements MouseListener{

	@Override
	public boolean execute() {
		return true;
	}
	
	@Override
	public void mouseClicked(MouseEvent e) {
		 	Point p = e.getPoint();
	        int x = (int) p.getX();
	        int y = (int) p.getY();
		
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
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
