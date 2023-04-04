package view.toolbar;

import java.awt.Image;
import java.awt.Toolkit;
import java.util.Vector;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JToolBar;
/**
 * Definiše Edit traku sa alatima.
 * Predstavljene su sve funkcionalnosti menija Edit.
 * 
 * @see ToolBar
 * @author Grupa 1
 * @version 1.0
 *
 */
public class EditToolBar extends ToolBar {
	private JButton undoBtn = null;
	private JButton redoBtn = null;
	private JButton copyBtn = null;
	private JButton cutBtn = null;
	private JButton pasteBtn = null;
	private JButton selectAllBtn = null;
	private Vector<JButton> editButtons = null; 
	
	public EditToolBar() {
		editButtons = new Vector<JButton>();
		undoBtn = new JButton(new ImageIcon(toolkit.getImage("images/arrow-curve-180-left.png")
				.getScaledInstance(22, 22, Image.SCALE_AREA_AVERAGING)));
		redoBtn = new JButton(new ImageIcon(toolkit.getImage("images/arrow-curve.png")
				.getScaledInstance(22, 22, Image.SCALE_AREA_AVERAGING)));
		copyBtn	= new JButton(new ImageIcon(toolkit.getImage("images/document-copy.png")
				.getScaledInstance(22, 22, Image.SCALE_AREA_AVERAGING)));
		cutBtn = new JButton(new ImageIcon(toolkit.getImage("images/scissors.png")
				.getScaledInstance(22, 22, Image.SCALE_AREA_AVERAGING)));
		pasteBtn = new JButton(new ImageIcon(toolkit.getImage("images/clipboard-paste.png")
				.getScaledInstance(22, 22, Image.SCALE_AREA_AVERAGING)));
		selectAllBtn = new JButton(new ImageIcon(toolkit.getImage("images/selectAll.png")
				.getScaledInstance(22, 22, Image.SCALE_AREA_AVERAGING)));
		
		undoBtn.setToolTipText("Undo");
		redoBtn.setToolTipText("Redo");
		copyBtn.setToolTipText("Copy");
		cutBtn.setToolTipText("Cut");
		pasteBtn.setToolTipText("Paste");
		selectAllBtn.setToolTipText("Select All");
		
		editButtons.add(undoBtn);
		editButtons.add(redoBtn);
		editButtons.add(copyBtn);
		editButtons.add(cutBtn);
		editButtons.add(pasteBtn);
		editButtons.add(selectAllBtn);
		
		
	}
	
	//morao sam i ovu metodu dodati, da bi prikazao buttonse
	public Vector<JButton> getButtons() {
		return editButtons;
	}
	public void disable() {
		disableButtons(editButtons);
	}
	public void enable() {
		enableButtons(editButtons);
	}
}
