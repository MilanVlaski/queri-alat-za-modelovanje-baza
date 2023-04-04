package view.toolbar;

import java.awt.Color;
import java.awt.Image;
import java.awt.Toolkit;
import java.util.Vector;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JToolBar;

import controller.executablecommand.NewModel;
import controller.executablecommand.NewProject;
import controller.executablecommand.SaveModel;
import model.appmodel.ApplicationModel;
import model.appmodel.ModelType;
/**
 * Definiše traku sa alatima za rad sa projektom.
 * Predstavljene su sve funkcionalnosti menija za rad sa projektom.
 * 
 * @see ToolBar
 * @author Grupa 1
 * @version 1.0
 */
public class ProjectToolBar extends ToolBar {
	private ApplicationModel appModel;
	private JButton kreiranjeNovogProjekta = null;
	private JButton kreiranjeNovogConceptualnoModel = null;
	private JButton kreiranjeNovogLogickogModel = null;
	private JButton kreiranjeNovogFizickogModel = null;
	private JButton otvaranjeProjekta = null;
	private JButton cuvanjeProjekta = null;
	private JButton cuvanjeKaoProjekta = null;
	private JButton brisanjeProjekta = null;
	private JButton zatvaranjeProjekta = null;
	
	
	public ProjectToolBar(ApplicationModel appModel) {
		this.appModel = appModel;
		kreiranjeNovogProjekta = new JButton(new ImageIcon(toolkit.getImage("images/suitcase.png")
				.getScaledInstance(22, 22, Image.SCALE_AREA_AVERAGING)));
		kreiranjeNovogConceptualnoModel = new JButton(new ImageIcon(toolkit.getImage("images/conceptual.png")
				.getScaledInstance(22, 22, Image.SCALE_AREA_AVERAGING)));
		kreiranjeNovogLogickogModel = new JButton(new ImageIcon(toolkit.getImage("images/logic.png")
				.getScaledInstance(22, 22, Image.SCALE_AREA_AVERAGING)));
		kreiranjeNovogFizickogModel = new JButton(new ImageIcon(toolkit.getImage("images/physical model.png")
				.getScaledInstance(22, 22, Image.SCALE_AREA_AVERAGING)));
		otvaranjeProjekta = new JButton(new ImageIcon(toolkit.getImage("images/open.png")
				.getScaledInstance(22, 22, Image.SCALE_AREA_AVERAGING)));
		cuvanjeProjekta	= new JButton(new ImageIcon(toolkit.getImage("images/disk-black.png")
				.getScaledInstance(22, 22, Image.SCALE_AREA_AVERAGING)));
		cuvanjeKaoProjekta = new JButton(new ImageIcon(toolkit.getImage("images/disks-black.png")
				.getScaledInstance(22, 22, Image.SCALE_AREA_AVERAGING)));
		brisanjeProjekta = new JButton(new ImageIcon(toolkit.getImage("images/delete.png")
				.getScaledInstance(22, 22, Image.SCALE_AREA_AVERAGING)));
		zatvaranjeProjekta = new JButton(new ImageIcon(toolkit.getImage("images/exit.png")
				.getScaledInstance(22, 22, Image.SCALE_AREA_AVERAGING)));
		
		kreiranjeNovogProjekta.setToolTipText("Create New Project");
		kreiranjeNovogConceptualnoModel.setToolTipText("Create New Conceptual Model");
		kreiranjeNovogLogickogModel.setToolTipText("Create New Logical Model");
		kreiranjeNovogFizickogModel.setToolTipText("Create New Physical Model");
		otvaranjeProjekta.setToolTipText("Open Project");
		cuvanjeProjekta.setToolTipText("Save Project");
		cuvanjeKaoProjekta.setToolTipText("Save As Project");
		brisanjeProjekta.setToolTipText("Delete Project");
		zatvaranjeProjekta.setToolTipText("Close Project");
		
		kreiranjeNovogProjekta.addActionListener(e -> {
			new NewProject(appModel).execute();
		});
		kreiranjeNovogConceptualnoModel.addActionListener(e->{new NewModel(appModel, ModelType.CONCEPTUAL).execute();
		});
		zatvaranjeProjekta.addActionListener(e->System.exit(0));
		cuvanjeProjekta.addActionListener(e->{
			new SaveModel(appModel).execute();
		});
		
		buttons.add(kreiranjeNovogProjekta);
		buttons.add(kreiranjeNovogConceptualnoModel);
		buttons.add(kreiranjeNovogLogickogModel);
		buttons.add(kreiranjeNovogFizickogModel);
		buttons.add(otvaranjeProjekta);
		buttons.add(cuvanjeProjekta);
		buttons.add(cuvanjeKaoProjekta);
		buttons.add(brisanjeProjekta);
		buttons.add(zatvaranjeProjekta);
		
	}

}
