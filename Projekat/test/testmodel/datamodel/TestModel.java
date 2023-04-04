package testmodel.datamodel;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import model.appmodel.ApplicationModel;
import model.appmodel.ModelType;
import model.datamodel.ConceptualModel;
import model.datamodel.Model;

public class TestModel {
	ApplicationModel appModel;
	
	@BeforeEach
	public void setup() {
		appModel = new ApplicationModel();
	}

	@Test
	void shouldAddNewDiagram() {
		ConceptualModel model = new ConceptualModel("TestM");
		
		model.newDiagram();
		
		assertEquals(1, model.getDiagrams().size());
	}
	
	@Test
	void shouldNotAddNewDiagramWhenSameName() {
		ConceptualModel model = new ConceptualModel("TestM");
		model.newDiagram();
		model.newDiagram();
		
		assertEquals(1, model.getDiagrams().size());
	}
	
	@Test
	void shouldDeleteDiagram() {
		
		ConceptualModel model = new ConceptualModel("TestM");
		model.newDiagram();
		model.newDiagram();
		model.deleteDiagram(model.getDiagrams().get(0));
		
		assertEquals(1, model.getDiagrams().size());
	}
	
	@Test
	void shouldNotDeleteLastDiagram() {
		
		ConceptualModel model = new ConceptualModel("TestM");
		model.newDiagram();
		model.deleteDiagram(model.getDiagrams().get(0));
		
		assertEquals(1, model.getDiagrams().size());
	}
	
	@Test
	void shouldNotRenameDiagramIfSameName() {
		
		ConceptualModel model = new ConceptualModel("TestM");
		model.newDiagram();
		model.newDiagram();
		model.renameDiagram(model.getDiagrams().get(0), "TestDiagram");
	
		assertEquals("ConceptualDiagram1", model.getDiagrams().get(0).getName());
	}
}
