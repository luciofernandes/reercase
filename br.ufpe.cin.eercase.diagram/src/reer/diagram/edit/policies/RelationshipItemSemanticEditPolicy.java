/*
 * 
 */
package reer.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.commands.DestroyElementCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyElementRequest;

import reer.diagram.providers.ReerElementTypes;

/**
 * @generated
 */
public class RelationshipItemSemanticEditPolicy extends
		ReerBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public RelationshipItemSemanticEditPolicy() {
		super(ReerElementTypes.Relationship_4001);
	}

	/**
	 * @generated
	 */
	protected Command getDestroyElementCommand(DestroyElementRequest req) {
		return getGEFWrapper(new DestroyElementCommand(req));
	}

}
