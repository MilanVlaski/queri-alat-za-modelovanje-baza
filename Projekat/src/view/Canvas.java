/***********************************************************************
 * Module:  Canvas.java
 * Author:  fejzo_000
 * Purpose: Defines the Class Canvas
 ***********************************************************************/

package view;

import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.GridBagConstraints;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.MouseListener;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTabbedPane;

import model.appmodel.ApplicationModel;
import model.datamodel.Diagram;
/**
 * Klasa definiše prostor za iscrtavanje objekata.
 * 
 * @author Grupa 1
 * @version 1.0
 *
 */
public class Canvas extends JPanel {
	
	private static final long serialVersionUID = 1L;
	private boolean showGrid=true;
	private Diagram diagram;
	private ApplicationModel appModel;
	
	public Canvas(ApplicationModel appModel) {
		this.appModel = appModel;
		this.setSize(new Dimension(10000,10000));
		this.setBackground(Color.white);
		this.addMouseListener(new CanvasMouseListener(appModel, this));
		
		
		
	}
	
	public boolean isShowGrid() {
		return showGrid;
	}
	
	public void setShowGrid(boolean showGrid) {
		this.showGrid = showGrid;
	}
	
	
	@Override
	public void paint(Graphics g) {
		super.paint(g);
		Graphics2D g2d = (Graphics2D) g;
		
		if(showGrid)
			iscrtajGrid(g);
		else 
			obrisiGrid(g);
	
		diagram.drawDiagram(g2d);
	}
	
	public void iscrtajGrid(Graphics g) {
		for (int i = -10; i < getWidth(); i += 12) {
			for (int j = -10; j < getHeight(); j += 12) {
				g.drawRect(i, j, 1, 1);
			}
		}
	}
	
	public void obrisiGrid(Graphics g){
		for (int i = -10; i < getWidth(); i += 12) {
			for (int j = -10; j < getHeight(); j += 12) {
				g.clearRect(i, j, 1, 1);
			}
		}
	}

	public Diagram getDiagram() {
		return diagram;
	}

	public void setDiagram(Diagram diagram) {
		this.diagram = diagram;
	}
	
	public JPanel getTabHeader(String title) {
		Toolkit toolkit = Toolkit.getDefaultToolkit();
		Image closeTab = toolkit.getImage("images/close-option.png");
		closeTab=closeTab.getScaledInstance(16,16,Image.SCALE_SMOOTH);
		JPanel titlePanel = new JPanel(new FlowLayout(FlowLayout.LEFT, 0, 0));
		titlePanel.setOpaque(false);
		JLabel titleLbl = new JLabel(title);
		titleLbl.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 5));
		titlePanel.add(titleLbl);
		  
		JLabel btnX = new JLabel("x");
		btnX.setBorder(BorderFactory.createEmptyBorder(0, 6, 0, 0));
		btnX.setFont(new Font(btnX.getFont().getFontName(), Font.BOLD, btnX.getFont().getSize()+3));
		btnX.setOpaque(false);
		
			
		btnX.addMouseListener(new TabbedPaneHeaderMouseListener(appModel));
		titlePanel.add(btnX);
		return titlePanel;
	}
	
}