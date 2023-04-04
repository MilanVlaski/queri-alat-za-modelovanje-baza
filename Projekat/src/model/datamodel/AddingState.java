/***********************************************************************
 * Module:  AddingState.java
 * Author:  Yelja
 * Purpose: Defines the Class AddingState
 ***********************************************************************/

package model.datamodel;

import java.util.*;

import model.datamodel.objects.Element;
import model.datamodel.objects.Link;
/**
 * Dodaje novo stanje dijagrama.
 * 
 * @see DiagramState
 * @author Grupa 1
 * @version 1.0
 *
 */
public class AddingState implements DiagramState {

	private String typeOfObject;
	private boolean isElement;

	public AddingState(String typeOfObject, boolean isElement) {
		super();
		this.typeOfObject = typeOfObject;
		this.isElement = isElement;
	}
	
	public boolean isElement() {
		return isElement;
	}

	@Override
	public void addElement(Diagram context, int x, int y) {
		
		   Element element = (Element) context.createObject(typeOfObject);
		   
		   element.setX(x);
		   element.setY(y);
		   
		   context.addObjects(element);
		   context.notifyAllObservers();
	}

	@Override
	public void addLink(Diagram context, int x1, int y1, int x2, int y2) {
		
		Link link = (Link) context.createObject(typeOfObject);
		   
		   link.setX1(x1);
		   link.setY1(y1);
		   link.setX2(x2);
		   link.setY2(y2);
		   
		   context.addObjects(link);
		   context.notifyAllObservers();
	}

}