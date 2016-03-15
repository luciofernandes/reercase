/*
 * 
 */
package reer.diagram.providers;

import org.eclipse.gmf.tooling.runtime.providers.DefaultEditPartProvider;

import reer.diagram.edit.parts.ReerEditPartFactory;
import reer.diagram.edit.parts.SchemaEditPart;
import reer.diagram.part.ReerVisualIDRegistry;

/**
 * @generated
 */
public class ReerEditPartProvider extends DefaultEditPartProvider {

	/**
	 * @generated
	 */
	public ReerEditPartProvider() {
		super(new ReerEditPartFactory(), ReerVisualIDRegistry.TYPED_INSTANCE,
				SchemaEditPart.MODEL_ID);
	}

}
