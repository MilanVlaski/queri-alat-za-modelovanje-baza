package view.toolbar;

import java.awt.Image;
import java.awt.Toolkit;
import java.util.Vector;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JToolBar;
/**
 * Definiše View traku sa alatima.
 * Predstavljene su sve funkcionalnosti menija View.
 * 
 * @see ToolBar
 * @author Grupa 1
 * @version 1.0
 */
public class ViewToolBar extends ToolBar{

	private JButton zoomInBtn = null;
	private JButton zoomOutBtn = null;
	private JButton gridLine = null;
	private Vector<JButton> viewButtons = null;
	
	public ViewToolBar() {
		viewButtons = new Vector<JButton>();
		zoomInBtn = new JButton(new ImageIcon(toolkit.getImage("images/zoomIn.png")
				.getScaledInstance(22, 22, Image.SCALE_AREA_AVERAGING)));
		zoomOutBtn = new JButton(new ImageIcon(toolkit.getImage("images/zoomOut.png")
				.getScaledInstance(22, 22, Image.SCALE_AREA_AVERAGING)));
		gridLine = new JButton(new ImageIcon(toolkit.getImage("images/gridIcon.png")
				.getScaledInstance(22, 22, Image.SCALE_AREA_AVERAGING)));
		
		zoomInBtn.setToolTipText("Zoom In");
		zoomOutBtn.setToolTipText("Zoom Out");
		gridLine.setToolTipText("Grid Lines");
		
		viewButtons.add(zoomInBtn);
		viewButtons.add(zoomOutBtn);
		viewButtons.add(gridLine);
//		disableButtons(viewButtons);
	}
	
	public Vector<JButton> getButtons() {
		return viewButtons;
	}
	public void disable() {
		disableButtons(viewButtons);
	}
	public void enable() {
		enableButtons(viewButtons);
	}
}
