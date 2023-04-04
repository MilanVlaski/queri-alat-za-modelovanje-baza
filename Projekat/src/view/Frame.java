/***********************************************************************
 * Module:  Frame.java
 * Author:  fejzo_000
 * Purpose: Defines the Class Frame
 ***********************************************************************/

package view;

import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.Image;
import java.awt.Point;
import java.awt.Toolkit;
import java.util.*;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JToolBar;

import view.tree.Tree;
import model.appmodel.Active;
import model.appmodel.Application;
import model.appmodel.ApplicationModel;
import model.appmodel.Editing;
import model.appmodel.Idle;
import model.appmodel.ModelType;
import observer.Observer;
import view.menubar.ConceptualMenuBar;
import view.menubar.DefaultMenuBar;
import view.objectbox.AbstractObjectBox;
import view.objectbox.ConceptualObjectBox;
import view.toolbar.EditToolBar;
import view.toolbar.HelpToolBar;
import view.toolbar.ProjectToolBar;

import view.toolbar.ToolBar;

/** 
 * Klasa za definisanje glavnog prozora sa svim komponentama prikaza. 
 * 
 * @see Window
 * @author Grupa 1
 * @version 1.0
 */
public class Frame extends Window implements Observer {
	private ApplicationModel appModel;


	private Editor editor;
	
	public Frame(ApplicationModel appModel) {
		super();
		this.appModel = appModel;
		
		appModel.setCurrentModelType(ModelType.CONCEPTUAL);//PRIVREMENO!
		appModel.setCurrentState(new Idle());//PRIVREMENO! RADI TESTIRANJA RADA KONCEPTUALNOG PRIKAZA
		
		Tree tree = new Tree(appModel);
		
		ToolBar toolBar = new ToolBar().createToolBar(appModel);//mora biti i ova linija, jer se inicijalizuje lista buttona u konstruktoru i toolbar
		editor = new Editor().createEditor();
		
		StatusBar statusBar=new StatusBar(appModel);
		
		contentPane.add(toolBar, BorderLayout.NORTH);
		contentPane.add(editor, BorderLayout.CENTER);
		contentPane.add(statusBar, BorderLayout.SOUTH);
		
		JScrollPane scrollPane = new JScrollPane(tree);
	    scrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);  
	    scrollPane.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
	    add(scrollPane, BorderLayout.WEST);
	
	    //dodavanje komponenti prikaza
	    addViewComponent(editor);
	    addViewComponent(toolBar);
	    addViewComponent(tree);
	   
		System.out.println(appModel.getCurrentState().getNameOfState());
		
	    //dodavanje scroll panela na glavni panel


//		addWindowListener(new CustomWindowListener()); // dodavanje prilagodjenog listener-a

		
		
		setVisible(true); // prozor vidljiv

	}

	@Override
	public void update() {
		//dodavanje MenuBar-a
		DefaultMenuBar menuBar = appModel.createMenuBar();
		setJMenuBar(menuBar);
	
		//dodavanje ObjectBox-a u zavisnosti od trenutnog stanja
		if(appModel.getCurrentState() instanceof Active || appModel.getCurrentState() instanceof Editing) {
			AbstractObjectBox objectBox = new ConceptualObjectBox(appModel);
			contentPane.add(objectBox, BorderLayout.EAST);
		}
		
		// osvje�avanje izgleda
		invalidate();
		validate();
		repaint();
	}

	public Editor getEditor() {
		return editor;
	}

	public void setEditor(Editor editor) {
		this.editor = editor;
	}
	
	public ApplicationModel getAppModel() {
		return appModel;
	}
	
}