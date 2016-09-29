/*
 * 
 */
package rmm.diagram.providers;

import org.eclipse.gmf.tooling.runtime.providers.DefaultEditPartProvider;

import rmm.diagram.edit.parts.RmmEditPartFactory;
import rmm.diagram.edit.parts.SchemaEditPart;
import rmm.diagram.part.RmmVisualIDRegistry;

/**
 * @generated
 */
public class RmmEditPartProvider extends DefaultEditPartProvider {

	/**
	 * @generated
	 */
	public RmmEditPartProvider() {
		super(new RmmEditPartFactory(), RmmVisualIDRegistry.TYPED_INSTANCE,
				SchemaEditPart.MODEL_ID);
	}

}
