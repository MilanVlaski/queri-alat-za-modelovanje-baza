package view.toolbar;

import java.awt.Image;
import java.awt.Toolkit;
import java.util.Vector;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JToolBar;
/**
 * Definiše Window traku sa alatima.
 * Predstavljene su sve funkcionalnosti menija Window.
 * 
 * @see ToolBar
 * @author Grupa 1
 * @version 1.0
 */
public class WindowToolBar extends ToolBar {
	private JButton changeFont;
	private JButton changeLanguage;
	private JButton changeEditor;
	
	public WindowToolBar() {
		
		changeFont = new JButton(new ImageIcon(toolkit.getImage("images/font.png")
				.getScaledInstance(22, 22, Image.SCALE_AREA_AVERAGING)));
		changeLanguage = new JButton(new ImageIcon(toolkit.getImage("images/language.png")
				.getScaledInstance(22, 22, Image.SCALE_AREA_AVERAGING)));
		changeEditor = new JButton(new ImageIcon(toolkit.getImage("images/editor.png")
				.getScaledInstance(22, 22, Image.SCALE_AREA_AVERAGING)));
		
		changeFont.setToolTipText("Change Font");
		changeLanguage.setToolTipText("Change Language");
		changeEditor.setToolTipText("Change Editor");
		
		buttons.add(changeFont);
		buttons.add(changeLanguage);
		buttons.add(changeEditor);
	}
	
	
}
