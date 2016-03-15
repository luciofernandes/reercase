/*
 * 
 */
package reer.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

import reer.diagram.edit.commands.AnnotationCreateCommand;
import reer.diagram.providers.ReerElementTypes;

/**
 * @generated
 */
public class TableTableAnnotattionCompartmentItemSemanticEditPolicy extends
		ReerBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public TableTableAnnotattionCompartmentItemSemanticEditPolicy() {
		super(ReerElementTypes.Table_2001);
	}

	/**
	 * @generated
	 */
	protected Command getCreateCommand(CreateElementRequest req) {
		if (ReerElementTypes.Annotation_3003 == req.getElementType()) {
			return getGEFWrapper(new AnnotationCreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

}
