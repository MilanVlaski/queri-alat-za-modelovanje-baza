/***********************************************************************
 * Kreira object box za konceptualni model.
 * 
 * Module:  ConceptualObjectBox.java
 * Author:  fejzo_000
 * Purpose: Defines the Class ConceptualObjectBox
 * 
 * 
 ***********************************************************************/

package view.objectbox;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;

import model.appmodel.ApplicationModel;
import model.appmodel.Editing;
import model.datamodel.AddingState;
import model.datamodel.Diagram;
import model.datamodel.DiagramState;
import view.CanvasMouseListener;
import view.ObjectBoxItem;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Cursor;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Image;
import java.util.Vector;
/**
 * Definiše izgled i funckionalnosti konceptualnog object box-a.
 * 
 * @see AbstractObjectBox
 * @author Grupa 1
 * @version 1.0
 */
public class ConceptualObjectBox extends AbstractObjectBox  {

	private static final long serialVersionUID=1L;
	
	private ObjectBoxItem btnEntyty=null;
	private ObjectBoxItem btnRelationship=null;
	private ObjectBoxItem btnInheritance=null;
	private ObjectBoxItem btnAssociation=null;
	private ObjectBoxItem btnNode=null;
	private ObjectBoxItem btnAsocEntity=null;
	private ObjectBoxItem btnSelect=null;
	private ObjectBoxItem btnDelete=null;
	
	private JLabel lblObjectBoxTitle = null;
	private ApplicationModel appModel;
	
	public ConceptualObjectBox(ApplicationModel appModel) {
		this.appModel = appModel;
		objectBoxItems = new Vector<ObjectBoxItem>();
		
		lblObjectBoxTitle= new JLabel("Elements");
		lblObjectBoxTitle.setHorizontalTextPosition(JLabel.CENTER);
		lblObjectBoxTitle.setFont(new Font("Arial", Font.BOLD, 14));
		lblObjectBoxTitle.setPreferredSize(new Dimension(200, 20));
		
		btnEntyty = new ObjectBoxItem(new ImageIcon(toolkit.getImage("images/entity.png").getScaledInstance(28, 28, Image.SCALE_AREA_AVERAGING)));
		btnRelationship = new ObjectBoxItem(new ImageIcon(toolkit.getImage("images/relationship_icon_true.png").getScaledInstance(28, 28, Image.SCALE_AREA_AVERAGING)));
		btnAssociation = new ObjectBoxItem(new ImageIcon(toolkit.getImage("images/association_icon_true.png").getScaledInstance(28, 28, Image.SCALE_AREA_AVERAGING)));
		btnInheritance = new ObjectBoxItem(new ImageIcon(toolkit.getImage("images/inheritance_icon.png").getScaledInstance(28, 28, Image.SCALE_AREA_AVERAGING)));
		btnNode = new ObjectBoxItem(new ImageIcon(toolkit.getImage("images/node.png").getScaledInstance(28, 28, Image.SCALE_AREA_AVERAGING)));
		btnAsocEntity = new ObjectBoxItem(new ImageIcon(toolkit.getImage("images/association_entity.png").getScaledInstance(28, 28, Image.SCALE_AREA_AVERAGING)));
		btnSelect=new ObjectBoxItem(new ImageIcon(toolkit.getImage("images/circled-dot.png").getScaledInstance(28, 28, Image.SCALE_AREA_AVERAGING)));
		btnDelete=new ObjectBoxItem(new ImageIcon(toolkit.getImage("images/cross-mark-button-emoji.png").getScaledInstance(28, 28, Image.SCALE_AREA_AVERAGING)));
		
		btnEntyty.setToolTipText("Entity");
		btnRelationship.setToolTipText("Relationship");
		btnAssociation.setToolTipText("Association");
		btnInheritance.setToolTipText("Inheritance");
		btnAsocEntity.setToolTipText("Association entity");
		btnNode.setToolTipText("Node");
		btnSelect.setToolTipText("Select");
		btnDelete.setToolTipText("Delete");
		
		btnEntyty.setName("Entity");
		btnRelationship.setName("Relationship");
		btnAssociation.setName("Association");
		btnInheritance.setName("Inheritance");
		btnAsocEntity.setName("Association entity");
		btnNode.setName("Node");
		btnDelete.setName("Delete");
		btnSelect.setName("Select");
		
		btnEntyty.setCursor(new Cursor(Cursor.HAND_CURSOR));
		btnRelationship.setCursor(new Cursor(Cursor.HAND_CURSOR));
		btnAssociation.setCursor(new Cursor(Cursor.HAND_CURSOR));
		btnInheritance.setCursor(new Cursor(Cursor.HAND_CURSOR));
		btnAsocEntity.setCursor(new Cursor(Cursor.HAND_CURSOR));
		btnNode.setCursor(new Cursor(Cursor.HAND_CURSOR));
		btnDelete.setCursor(new Cursor(Cursor.HAND_CURSOR));
		btnSelect.setCursor(new Cursor(Cursor.HAND_CURSOR));
		
		btnEntyty.addActionListener(e->{
			appModel.getFocusedDiagram().setCurrentState(new AddingState("ENTITY", true));
			});
		btnRelationship.addActionListener(e->{
			appModel.getFocusedDiagram().setCurrentState(new AddingState("RELATIONSHIP", false));
			});
		btnAsocEntity.addActionListener(e->{
			appModel.getFocusedDiagram().setCurrentState(new AddingState("ASSOCIATIVE_ENTITY", true));
			});
		btnAssociation.addActionListener(e->{
			appModel.getFocusedDiagram().setCurrentState(new AddingState("ASSOCIATION_LINK", false));
			});
		btnInheritance.addActionListener(e->{
			appModel.getFocusedDiagram().setCurrentState(new AddingState("INHERITANCE_LINK", false));
			});
		btnNode.addActionListener(e->{
			appModel.getFocusedDiagram().setCurrentState(new AddingState("INHERITANCE_NODE", true));
			});
		btnSelect.addActionListener(e->{
			appModel.getFocusedDiagram().setCurrentState(new Editing());
		});
		
		
		this.setLayout(new BorderLayout());
		this.setLayout(new FlowLayout(FlowLayout.LEADING));
		this.setPreferredSize(new Dimension(200,300));
		this.setBackground(new Color(233, 245, 241));
		
//		addObjectBoxItems(btnAssociation);
		addObjectBoxItems(btnEntyty);
//		addObjectBoxItems(btnInheritance);
		addObjectBoxItems(btnRelationship);
		
//		add((Component) objectBoxItems);
		add(lblObjectBoxTitle);
		add(btnAssociation);
		add(btnEntyty);
		add(btnInheritance);
		add(btnRelationship);
		add(btnAsocEntity);
		add(btnNode);
		add(btnSelect);
		add(btnDelete);
		
	}
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);

		g.setColor(new Color(70,97,78));
		g.drawLine(0, 0, getWidth(), 0);
		
		g.setColor(new Color(70,97,78));
		g.drawLine(0, getHeight(), 0, 0);
	}
	
	public ObjectBoxItem getBtnEntyty() {
		return btnEntyty;
	}
	
	@Override
	public void update() {
		
	}
	
	
	
}