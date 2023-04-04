package view.toolbar;

import java.awt.Image;
import java.awt.Toolkit;
import java.util.Vector;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JToolBar;
/**
 * Definiše Help traku sa alatima.
 * Predstavljene su sve funkcionalnosti menija Help.
 * 
 * @see ToolBar
 * @author Grupa 1
 * @version 1.0
 */
public class HelpToolBar extends ToolBar{
	private JButton onlineHelpBtn = null;
	private JButton faqBtn = null;
	private JButton aboutAplicationBtn = null;
	
	public HelpToolBar() {		
		
		onlineHelpBtn = new JButton(new ImageIcon(toolkit.getImage("images/question-frame.png")
				.getScaledInstance(22, 22, Image.SCALE_AREA_AVERAGING)));
		faqBtn = new JButton(new ImageIcon(toolkit.getImage("images/faq.png")
				.getScaledInstance(22, 22, Image.SCALE_AREA_AVERAGING)));
		aboutAplicationBtn = new JButton(new ImageIcon(toolkit.getImage("images/logoKropovan2.png")
				.getScaledInstance(22, 22, Image.SCALE_AREA_AVERAGING)));
		
		onlineHelpBtn.setToolTipText("Online Help");
		faqBtn.setToolTipText("Frequently Asked Questions");
		aboutAplicationBtn.setToolTipText("About Application Queri");
		
		buttons.add(onlineHelpBtn);
		buttons.add(faqBtn);
		buttons.add(aboutAplicationBtn);
	}
}
