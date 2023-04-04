package testmodel.datamodel;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import model.appmodel.ApplicationModel;
import model.appmodel.ModelType;
import model.datamodel.Project;

class TestProject {
	ApplicationModel appModel;
	
	@BeforeEach
	public void setup() {
		appModel = new ApplicationModel();
	}

}
