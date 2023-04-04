/***********************************************************************
 * Module:  WorkspaceComponent.java
 * Author:  Yelja
 * Purpose: Defines the Class WorkspaceComponent
 ***********************************************************************/

package model.datamodel;

import java.nio.file.Path;
import java.util.*;


import javax.swing.tree.DefaultMutableTreeNode;
/**
 * Definiše rad sa workspace komponentama.
 * 
 * @see DefaultMutableTreeNode
 * @author Grupa 1
 * @version 1.0
 *
 */
public abstract class WorkspaceComponent extends DefaultMutableTreeNode {
	private String name;
	private String location;

	public WorkspaceComponent(String name) {
		super(name);
		this.name = name;
	}

	public WorkspaceComponent(String name, String location) {

		this.name = name;
		this.location = location;
	}

	public String getLocation() {
		return location;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public abstract void save();

	public abstract void saveAs();
 }
