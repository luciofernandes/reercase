/*
 * 
 */
package rmm.diagram.edit.commands;

import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.common.core.command.CommandResult;
import org.eclipse.gmf.runtime.emf.type.core.commands.EditElementCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.ReorientRelationshipRequest;

import rmm.ForeignKey;
import rmm.PrimaryKey;
import rmm.Relationship;
import rmm.diagram.edit.policies.RmmBaseItemSemanticEditPolicy;

/**
 * @generated
 */
public class Relationship2ReorientCommand extends EditElementCommand {

	/**
	 * @generated
	 */
	private final int reorientDirection;

	/**
	 * @generated
	 */
	private final EObject oldEnd;

	/**
	 * @generated
	 */
	private final EObject newEnd;

	/**
	 * @generated
	 */
	public Relationship2ReorientCommand(ReorientRelationshipRequest request) {
		super(request.getLabel(), request.getRelationship(), request);
		reorientDirection = request.getDirection();
		oldEnd = request.getOldRelationshipEnd();
		newEnd = request.getNewRelationshipEnd();
	}

	/**
	 * @generated
	 */
	public boolean canExecute() {
		if (false == getElementToEdit() instanceof Relationship) {
			return false;
		}
		if (reorientDirection == ReorientRelationshipRequest.REORIENT_SOURCE) {
			return canReorientSource();
		}
		if (reorientDirection == ReorientRelationshipRequest.REORIENT_TARGET) {
			return canReorientTarget();
		}
		return false;
	}

	/**
	 * @generated
	 */
	protected boolean canReorientSource() {
		if (!(oldEnd instanceof PrimaryKey && newEnd instanceof PrimaryKey)) {
			return false;
		}
		ForeignKey target = getLink().getTarget();
		if (!(getLink().eContainer() instanceof PrimaryKey)) {
			return false;
		}
		PrimaryKey container = (PrimaryKey) getLink().eContainer();
		return RmmBaseItemSemanticEditPolicy.getLinkConstraints()
				.canExistRelationship_4003(container, getLink(),
						getNewSource(), target);
	}

	/**
	 * @generated
	 */
	protected boolean canReorientTarget() {
		if (!(oldEnd instanceof ForeignKey && newEnd instanceof ForeignKey)) {
			return false;
		}
		PrimaryKey source = getLink().getSource();
		if (!(getLink().eContainer() instanceof PrimaryKey)) {
			return false;
		}
		PrimaryKey container = (PrimaryKey) getLink().eContainer();
		return RmmBaseItemSemanticEditPolicy.getLinkConstraints()
				.canExistRelationship_4003(container, getLink(), source,
						getNewTarget());
	}

	/**
	 * @generated
	 */
	protected CommandResult doExecuteWithResult(IProgressMonitor monitor,
			IAdaptable info) throws ExecutionException {
		if (!canExecute()) {
			throw new ExecutionException(
					"Invalid arguments in reorient link command"); //$NON-NLS-1$
		}
		if (reorientDirection == ReorientRelationshipRequest.REORIENT_SOURCE) {
			return reorientSource();
		}
		if (reorientDirection == ReorientRelationshipRequest.REORIENT_TARGET) {
			return reorientTarget();
		}
		throw new IllegalStateException();
	}

	/**
	 * @generated
	 */
	protected CommandResult reorientSource() throws ExecutionException {
		getLink().setSource(getNewSource());
		return CommandResult.newOKCommandResult(getLink());
	}

	/**
	 * @generated
	 */
	protected CommandResult reorientTarget() throws ExecutionException {
		getLink().setTarget(getNewTarget());
		return CommandResult.newOKCommandResult(getLink());
	}

	/**
	 * @generated
	 */
	protected Relationship getLink() {
		return (Relationship) getElementToEdit();
	}

	/**
	 * @generated
	 */
	protected PrimaryKey getOldSource() {
		return (PrimaryKey) oldEnd;
	}

	/**
	 * @generated
	 */
	protected PrimaryKey getNewSource() {
		return (PrimaryKey) newEnd;
	}

	/**
	 * @generated
	 */
	protected ForeignKey getOldTarget() {
		return (ForeignKey) oldEnd;
	}

	/**
	 * @generated
	 */
	protected ForeignKey getNewTarget() {
		return (ForeignKey) newEnd;
	}
}
