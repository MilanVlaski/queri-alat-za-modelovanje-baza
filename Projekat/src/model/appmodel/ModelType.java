package model.appmodel;

import model.datamodel.ConceptualModel;
import model.datamodel.LogicalModel;
import model.datamodel.Model;
import model.datamodel.PhysicalModel;
/**
 * Definiše vrste tipova modela.
 * 
 * @author Grupa 1
 * @version 1.0
 *
 */
public enum ModelType {

	
	CONCEPTUAL(ConceptualModel.class),
	LOGICAL(LogicalModel.class),
	PHYSICAL(PhysicalModel.class);
	
	public final Class<? extends Model> klasa;
	
	private ModelType(Class<? extends Model> klasa) {
		this.klasa = klasa;
	}
	
	public static ModelType valueOfModelClass(Class<? extends Model> klasa) {
		ModelType result = null;
		for (ModelType m : values())
			if(m.klasa.equals(klasa))
				result = m;
		
		return result;
	}
}
