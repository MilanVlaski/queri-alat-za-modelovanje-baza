package testmodel.appmodel;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import model.appmodel.ConAppFactory;
import model.datamodel.Model;

public class TestConAppFactory {

	@Test
	void shouldAddDiagramWhenCreateModel() {
		ConAppFactory conFactory = new ConAppFactory();
		Model model = conFactory.createModelWithName("Model");
		
		assertEquals(1, model.getDiagrams().size());
	}
	
}
