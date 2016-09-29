/*
 * 
 */
package rmm.diagram.edit.policies;

import java.util.Iterator;

import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.diagram.core.commands.DeleteCommand;
import org.eclipse.gmf.runtime.emf.commands.core.command.CompositeTransactionalCommand;
import org.eclipse.gmf.runtime.emf.type.core.commands.DestroyElementCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateRelationshipRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyElementRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.ReorientRelationshipRequest;
import org.eclipse.gmf.runtime.notation.Edge;
import org.eclipse.gmf.runtime.notation.View;

import rmm.diagram.edit.commands.Relationship2CreateCommand;
import rmm.diagram.edit.commands.Relationship2ReorientCommand;
import rmm.diagram.edit.commands.RelationshipCreateCommand;
import rmm.diagram.edit.commands.RelationshipReorientCommand;
import rmm.diagram.edit.parts.Relationship2EditPart;
import rmm.diagram.edit.parts.RelationshipEditPart;
import rmm.diagram.part.RmmVisualIDRegistry;
import rmm.diagram.providers.RmmElementTypes;

/**
 * @generated
 */
public class PrimaryKeyItemSemanticEditPolicy extends
		RmmBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public PrimaryKeyItemSemanticEditPolicy() {
		super(RmmElementTypes.PrimaryKey_3022);
	}

	/**
	 * @generated
	 */
	protected Command getDestroyElementCommand(DestroyElementRequest req) {
		View view = (View) getHost().getModel();
		CompositeTransactionalCommand cmd = new CompositeTransactionalCommand(
				getEditingDomain(), null);
		cmd.setTransactionNestingEnabled(false);
		for (Iterator<?> it = view.getSourceEdges().iterator(); it.hasNext();) {
			Edge outgoingLink = (Edge) it.next();
			if (RmmVisualIDRegistry.getVisualID(outgoingLink) == RelationshipEditPart.VISUAL_ID) {
				DestroyElementRequest r = new DestroyElementRequest(
						outgoingLink.getElement(), false);
				cmd.add(new DestroyElementCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), outgoingLink));
				continue;
			}
			if (RmmVisualIDRegistry.getVisualID(outgoingLink) == Relationship2EditPart.VISUAL_ID) {
				DestroyElementRequest r = new DestroyElementRequest(
						outgoingLink.getElement(), false);
				cmd.add(new DestroyElementCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), outgoingLink));
				continue;
			}
		}
		EAnnotation annotation = view.getEAnnotation("Shortcut"); //$NON-NLS-1$
		if (annotation == null) {
			// there are indirectly referenced children, need extra commands: false
			addDestroyShortcutsCommand(cmd, view);
			// delete host element
			cmd.add(new DestroyElementCommand(req));
		} else {
			cmd.add(new DeleteCommand(getEditingDomain(), view));
		}
		return getGEFWrapper(cmd.reduce());
	}

	/**
	 * @generated
	 */
	protected Command getCreateRelationshipCommand(CreateRelationshipRequest req) {
		Command command = req.getTarget() == null ? getStartCreateRelationshipCommand(req)
				: getCompleteCreateRelationshipCommand(req);
		return command != null ? command : super
				.getCreateRelationshipCommand(req);
	}

	/**
	 * @generated
	 */
	protected Command getStartCreateRelationshipCommand(
			CreateRelationshipRequest req) {
		if (RmmElementTypes.Relationship_4002 == req.getElementType()) {
			return getGEFWrapper(new RelationshipCreateCommand(req,
					req.getSource(), req.getTarget()));
		}
		if (RmmElementTypes.Relationship_4003 == req.getElementType()) {
			return getGEFWrapper(new Relationship2CreateCommand(req,
					req.getSource(), req.getTarget()));
		}
		return null;
	}

	/**
	 * @generated
	 */
	protected Command getCompleteCreateRelationshipCommand(
			CreateRelationshipRequest req) {
		if (RmmElementTypes.Relationship_4002 == req.getElementType()) {
			return getGEFWrapper(new RelationshipCreateCommand(req,
					req.getTarget(), req.getSource()));
		}
		if (RmmElementTypes.Relationship_4003 == req.getElementType()) {
			return null;
		}
		return null;
	}

	/**
	 * Returns command to reorient EClass based link. New link target or source
	 * should be the domain model element associated with this node.
	 * 
	 * @generated
	 */
	protected Command getReorientRelationshipCommand(
			ReorientRelationshipRequest req) {
		switch (getVisualID(req)) {
		case RelationshipEditPart.VISUAL_ID:
			return getGEFWrapper(new RelationshipReorientCommand(req));
		case Relationship2EditPart.VISUAL_ID:
			return getGEFWrapper(new Relationship2ReorientCommand(req));
		}
		return super.getReorientRelationshipCommand(req);
	}

}