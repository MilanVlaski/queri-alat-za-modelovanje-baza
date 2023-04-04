/***********************************************************************
 * Module:  Editor.java
 * Author:  PC
 * Purpose: Defines the Class Editor
 ***********************************************************************/

package view;

import java.util.*;

import javax.swing.JScrollPane;
import javax.swing.JTabbedPane;
/**
 * Klasa za kreiranje editora.
 * 
 * @author Grupa 1
 * @version 1.0
 *
 */
public class Editor extends JTabbedPane implements ViewComponent {
   
	private static final long serialVersionUID = 1L;
	private EditorContextMenu editorContextMenu;
	private List<Canvas> canvas;


	public EditorContextMenu getEditorContextMenu() {
		return editorContextMenu;
	}

	public void setEditorContextMenu(EditorContextMenu editorContextMenu) {
		this.editorContextMenu = editorContextMenu;
	}

	@Override
	public void update() {
		
	}
	
	public void addCanvas(Canvas canvas) {
		JScrollPane scrollPane = new JScrollPane(canvas);
		scrollPane.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
		scrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);

		this.canvas.add(canvas);
		if(canvas.getDiagram().getName()!=null) {
		this.add(canvas.getDiagram().getName(),scrollPane);
		this.setTabComponentAt(this.indexOfComponent(scrollPane), canvas.getTabHeader(canvas.getDiagram().getName()));
		}
		else
			this.add("Tab",canvas);
	}
	
	public List<Canvas> getCanvas() {
		return canvas;
	}
	
	public Canvas getCanvasByIndex(int index) {
		return canvas.get(index);
	}
	
	public void addArrayOfCanvas(List<Canvas> newCanvas) {
		for (Canvas canvas2 : newCanvas) {
			if(canvas2.getDiagram().getName()!=null)
			this.add(canvas2.getDiagram().getName(),canvas2);
			else
				this.add("Tab",canvas2);
		}
	}
	
	public void removeCanvas(Canvas canvas) {
		this.canvas.remove(canvas);
	}
	
	public Editor createEditor() {
		this.canvas = new Vector<Canvas>();
		
		return this;
	}
}