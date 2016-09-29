/*
 * 
 */
package rmm.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

import rmm.diagram.edit.commands.Check2CreateCommand;
import rmm.diagram.providers.RmmElementTypes;

/**
 * @generated
 */
public class DomainDomainConstraintCheckDomainCompartmentItemSemanticEditPolicy
		extends RmmBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public DomainDomainConstraintCheckDomainCompartmentItemSemanticEditPolicy() {
		super(RmmElementTypes.Domain_2008);
	}

	/**
	 * @generated
	 */
	protected Command getCreateCommand(CreateElementRequest req) {
		if (RmmElementTypes.Check_3021 == req.getElementType()) {
			return getGEFWrapper(new Check2CreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

}
