/***********************************************************************
 * Module:  StatusBar.java
 * Author:  fejzo_000
 * Purpose: Defines the Class StatusBar
 ***********************************************************************/

package view;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Graphics;
import java.util.*;

import javax.swing.JComponent;
import javax.swing.JLabel;
import javax.swing.JPanel;

import model.appmodel.ApplicationModel;
import model.appmodel.ApplicationState;
import model.appmodel.Idle;
import observer.Subject;
import view.statusbar.SeparatorPanel;
import view.statusbar.TimerThread;
import view.CanvasMouseListener;
/**
 * Definiše statusnu traku koja prati stanja aplikacije, datum i vrijeme
 * te koordinate pokreta miša.
 * 
 * @author Grupa 1
 * @version 1.0
 *
 */
public class StatusBar extends JPanel implements ViewComponent {

	private static final long serialVersionUID=1L;
	
	protected JPanel leftPanel;
	protected JPanel centerPanel;
	protected JPanel rightPanel;
	private static TimerThread thread=null;
	private JLabel leftLabel=null;
	private JLabel coordinates=null;
	private ApplicationModel applicationModel;

	
	
	public static void terminateTimeThread() {
		if(thread!=null)
			thread.setRunning(false);
	}
	
	public StatusBar(ApplicationModel applicationModel) {
		createPartControl();
		this.applicationModel=applicationModel;
		
		final JLabel dateLabel=new JLabel();
		dateLabel.setFont(new Font("Arial", Font.BOLD, 10));
		dateLabel.setForeground(Color.GRAY);
		dateLabel.setHorizontalAlignment(JLabel.CENTER);
		this.addRightComponent(dateLabel);
		
		final JLabel timeLabel = new JLabel();
		timeLabel.setFont(new Font("Arila", Font.BOLD, 10));
		timeLabel.setForeground(Color.GRAY);
		timeLabel.setHorizontalAlignment(JLabel.CENTER);
		this.addRightComponent(timeLabel);
		
		thread=new TimerThread(dateLabel, timeLabel);
		thread.start();
		update();
	}
	
	protected void createPartControl(){
		setLayout(new BorderLayout());
		setPreferredSize(new Dimension(getWidth(), 23));
		
		leftPanel=new JPanel(new FlowLayout(FlowLayout.LEADING, 5, 3));
		leftPanel.setOpaque(false);
		add(leftPanel, BorderLayout.WEST);
		
		centerPanel=new JPanel(new FlowLayout(FlowLayout.LEADING, 5, 3));
		centerPanel.setOpaque(false);
		add(centerPanel, BorderLayout.CENTER);
		
		rightPanel=new JPanel(new FlowLayout(FlowLayout.LEADING, 5, 3));
		rightPanel.setOpaque(false);
		add(rightPanel, BorderLayout.EAST);
	}
	
	public void setLeftComponent(JComponent component) {
		leftPanel.removeAll();
		leftPanel.add(component);
	}
	
	public void setCenterComponent(JComponent component) {
		
		
		JPanel panel=new JPanel(new FlowLayout(FlowLayout.LEADING, 5, 0));
		panel.add(new SeparatorPanel(Color.GRAY, Color.WHITE));
		panel.add(component);
		
		centerPanel.removeAll();
		centerPanel.add(panel);
	}
	
	public void addRightComponent(JComponent component) {
		JPanel panel=new JPanel(new FlowLayout(FlowLayout.LEADING, 5, 0));
		panel.add(new SeparatorPanel(Color.GRAY, Color.WHITE));
		panel.add(component);
		rightPanel.add(panel);
	}
	
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);

		int y = 0;
		g.setColor(new Color(70,97,78));
		g.drawLine(0, y, getWidth(), y);
		y++;

		g.setColor(new Color(180, 248, 200));
		g.drawLine(0, y, getWidth(), y);
		y++;

		g.setColor(new Color(180, 248, 200));
		g.drawLine(0, y, getWidth(), y);
		y++;

		g.setColor(new Color(180,248, 200));
		g.drawLine(0, y, getWidth(), y);

		y = getHeight() - 3;

		g.setColor(new Color(180,248, 200));
		g.drawLine(0, y, getWidth(), y);
		y++;

		g.setColor(new Color(180,248, 200));
		g.drawLine(0, y, getWidth(), y);
		y++;

		g.setColor(new Color(70, 97, 78));
		g.drawLine(0, y, getWidth(), y);
	}
	
	@Override
	public void update() {
		
		leftLabel = new JLabel();
		leftLabel.setText(applicationModel.getCurrentState().getNameOfState());
		leftLabel.setFont(new Font("Arial", Font.BOLD, 10));
		leftLabel.setForeground(Color.GRAY);
		this.setLeftComponent(leftLabel);
		
		coordinates=new JLabel("Coordinates: ");
		coordinates.setFont(new Font("Arial", Font.BOLD, 10));
		coordinates.setForeground(Color.GRAY);
		this.setCenterComponent(coordinates);
	}
}