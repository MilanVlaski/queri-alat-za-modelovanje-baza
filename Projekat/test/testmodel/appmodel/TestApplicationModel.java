package testmodel.appmodel;

import static org.junit.jupiter.api.Assertions.*;

import java.awt.Desktop;
import java.io.File;
import java.nio.file.FileSystem;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.Path;
import java.nio.file.Paths;

import javax.swing.filechooser.FileSystemView;

import org.junit.After;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import model.appmodel.AppFactory;
import model.appmodel.ApplicationModel;
import model.appmodel.ApplicationState;
import model.appmodel.ConAppFactory;
import model.appmodel.Idle;
import model.appmodel.ModelType;
import model.datamodel.ConceptualModel;
import model.datamodel.Model;
import model.datamodel.Project;

public class TestApplicationModel {
	ApplicationModel appModel;
	
	@BeforeEach
	void setup() {
		appModel = new ApplicationModel();
	}
	
	@Test

	public void shouldGetModelTypeNull() {
		assertEquals(null, appModel.getCurrentModelType());
	}

	@Test
	void shouldGetCurrentStateIdle() {
		
		ApplicationState idle = new Idle();
		assertEquals(idle.getClass(), appModel.getCurrentState().getClass());
	}
	
	@Test
	void shouldSetConAppFactoryOnAppModel() {
		AppFactory factory = new ConAppFactory();
		
		appModel.newModel(ModelType.CONCEPTUAL, "Model");

		assertEquals(factory.getClass(), appModel.getAppFactory().getClass());
	}
	
	@Test
	void shouldAddModelToComponents() {
		
		appModel.newModel(ModelType.CONCEPTUAL, "Model");

		assertEquals(1, appModel.getComponents().size());
	}
	
	@Test
	void shouldMakePqviFileAtDesktop() {
		String desktop = System.getProperty("user.home") + File.separator + "Desktop";
		
		appModel.createProjectFile(desktop, "TestingMkProj");
		
		assertTrue(Files.exists(Paths.get(desktop), LinkOption.NOFOLLOW_LINKS));
	}
	@AfterEach
	void deleteFile() {
		File file = new File(System.getProperty("user.home") + File.separator + "Desktop/TestingMkProj.pqvi");
		file.delete();
	}
	
	@Test
	void shouldAddNewProjectToComponents() {

		appModel.newProject( "");
		
		assertEquals(1, appModel.getComponents().size());
	}
	
	@Test
	void shouldRemoveProjectFromComponents() {

		Project p = new Project(null, null);
		appModel.addComponents(p);
		appModel.removeComponent(p);
		
		assertTrue(appModel.getComponents().isEmpty());
	}
	
	@Test
	void shouldAddModelToProject() {

		appModel.newProject("");
		Project project = (Project) appModel.getComponents().get(0);
		appModel.newModelInProject(ModelType.CONCEPTUAL, project, "Model");
		
		assertEquals(1, project.getModels().size());
	}
	
	
	@Test
	void shouldRemoveModelFromProject() {
		
		appModel.newProject( "");
		Project project = (Project) appModel.getComponents().get(0);
		appModel.newModelInProject(ModelType.CONCEPTUAL, project, "Model");
		Model model = (Model) project.getModels().get(0);
		appModel.removeModelFromProject(project, model);
		
		assertTrue(project.getModels().isEmpty());
	}

//	@Test
//	void shouldDeleteProjectFileFromDesktop() {
//		
//		String desktop = System.getProperty("user.home") + File.separator + "Desktop";
//		appModel.newProject(desktop, "TestingDelProj");
//		appModel.createProjectFile(desktop, "TestingDelProj");
//		
//		Project project = (Project) appModel.getComponents().get(0);
//		
//		File file = new File(desktop + "/TestingDelProj.pqvi");
//		appModel.deleteProject(project);
//		assertFalse(file.exists());
//	}
	@AfterEach
	void deleteFile1() {
		File file = new File(System.getProperty("user.home") + File.separator + "Desktop/TestingDelProj.pqvi");
		file.delete();
	}
	

}










