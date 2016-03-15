/*
 * 
 */
package reer.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

import reer.diagram.edit.commands.AttributeCreateCommand;
import reer.diagram.edit.commands.AttributeUniqueKeyCreateCommand;
import reer.diagram.providers.ReerElementTypes;

/**
 * @generated
 */
public class TableTableAttributesCompartmentItemSemanticEditPolicy extends
		ReerBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public TableTableAttributesCompartmentItemSemanticEditPolicy() {
		super(ReerElementTypes.Table_2001);
	}

	/**
	 * @generated
	 */
	protected Command getCreateCommand(CreateElementRequest req) {
		if (ReerElementTypes.Attribute_3001 == req.getElementType()) {
			return getGEFWrapper(new AttributeCreateCommand(req));
		}
		if (ReerElementTypes.AttributeUniqueKey_3002 == req.getElementType()) {
			return getGEFWrapper(new AttributeUniqueKeyCreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

}
