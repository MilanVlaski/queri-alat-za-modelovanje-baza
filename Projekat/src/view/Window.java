/***********************************************************************
 * Module:  Window.java
 * Author:  PC
 * Purpose: Defines the Class Window
 ***********************************************************************/

package view;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.Image;
import java.awt.Toolkit;
import java.util.*;

import javax.swing.JFrame;

import model.appmodel.Application;
import observer.Observer;
import view.menubar.DefaultMenuBar;

/** 
 * Klasa za definisanje izgleda svih prozora.
 * Pojedinačni prozori je nasljeđuju.
 * 
 * @see JFrame
 * @author Grupa 1
 * @version 1.0
 */
public class Window extends JFrame{
	
	protected Container contentPane = null;
	protected Vector<ViewComponent> viewComponents;
	protected DefaultMenuBar menuBar;

	
	public Vector<ViewComponent> getViewComponents() {
		return viewComponents;
	}

	public void addViewComponent(ViewComponent viewComponent) {
		viewComponents.add(viewComponent);
	}

	public void removeViewComponent(ViewComponent viewComponent) {
		viewComponents.remove(viewComponent);
	}
	
	
	public Window() {
		this.viewComponents = new Vector<>();
		// Podesavanja ikonice		
		Toolkit toolkit = Toolkit.getDefaultToolkit();
		Image iconImage = toolkit.getImage("images/logoKropovan2.png").getScaledInstance(800, 800,
				Image.SCALE_SMOOTH);
		setIconImage(iconImage);
		
		// postavljanje osnovnih parametara
		setTitle("queri");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		// postavljanje dimenzija
		Dimension screenSize = toolkit.getScreenSize();
		Dimension frameSize = new Dimension(1000, 700);
		setSize(frameSize);
		setLocationRelativeTo(null);
		setMinimumSize(frameSize);
		setExtendedState(MAXIMIZED_BOTH);
		contentPane = getContentPane();
		contentPane.setLayout(new BorderLayout());
	}

}