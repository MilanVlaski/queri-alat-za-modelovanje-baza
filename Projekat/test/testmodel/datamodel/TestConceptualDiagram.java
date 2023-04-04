package testmodel.datamodel;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import model.datamodel.ConceptualDiagram;
import model.datamodel.Diagram;
import model.datamodel.objects.ConEntity;

class TestConceptualDiagram {

	@Test
	void shouldReturnEntityObject() {
		Diagram d = new ConceptualDiagram();
		
		assertInstanceOf(ConEntity.class, d.createObject("ENTITY"));
	}

	@Test
	void shouldThrowArgExceptionWhenWrongString() {
		Diagram d = new ConceptualDiagram();
	    IllegalArgumentException thrown = assertThrows(
	            IllegalArgumentException.class,
	            () -> d.createObject("TABLE"),
	            "Expected createObject() to throw, but it didn't"
	     );

	     assertTrue(thrown.getMessage().contentEquals("Unexpected value: TABLE"));
	 }
}

