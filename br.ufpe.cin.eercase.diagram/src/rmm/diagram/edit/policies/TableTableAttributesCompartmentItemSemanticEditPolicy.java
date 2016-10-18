/*
 * 
 */
package rmm.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

import rmm.diagram.edit.commands.AttributeCreateCommand;
import rmm.diagram.providers.RmmElementTypes;

/**
 * @generated
 */
public class TableTableAttributesCompartmentItemSemanticEditPolicy extends
		RmmBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public TableTableAttributesCompartmentItemSemanticEditPolicy() {
		super(RmmElementTypes.Table_2004);
	}

	/**
	 * @generated
	 */
	protected Command getCreateCommand(CreateElementRequest req) {
		if (RmmElementTypes.Attribute_3006 == req.getElementType()) {
			return getGEFWrapper(new AttributeCreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

}
