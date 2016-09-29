/*
 * 
 */
package rmm.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.commands.DestroyElementCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyElementRequest;

import rmm.diagram.providers.RmmElementTypes;

/**
 * @generated
 */
public class RelationshipItemSemanticEditPolicy extends
		RmmBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public RelationshipItemSemanticEditPolicy() {
		super(RmmElementTypes.Relationship_4002);
	}

	/**
	 * @generated
	 */
	protected Command getDestroyElementCommand(DestroyElementRequest req) {
		return getGEFWrapper(new DestroyElementCommand(req));
	}

}
