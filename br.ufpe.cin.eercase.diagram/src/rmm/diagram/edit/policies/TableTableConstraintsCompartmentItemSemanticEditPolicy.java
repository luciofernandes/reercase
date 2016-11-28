/*
 * 
 */
package rmm.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

import rmm.diagram.edit.commands.AlternateKeyCreateCommand;
import rmm.diagram.edit.commands.CheckCreateCommand;
import rmm.diagram.edit.commands.ForeignKeyCreateCommand;
import rmm.diagram.edit.commands.PrimaryKeyCreateCommand;
import rmm.diagram.edit.commands.TriggerCreateCommand;
import rmm.diagram.providers.RmmElementTypes;

/**
 * @generated
 */
public class TableTableConstraintsCompartmentItemSemanticEditPolicy extends
		RmmBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public TableTableConstraintsCompartmentItemSemanticEditPolicy() {
		super(RmmElementTypes.Table_2004);
	}

	/**
	 * @generated
	 */
	protected Command getCreateCommand(CreateElementRequest req) {
		if (RmmElementTypes.PrimaryKey_3022 == req.getElementType()) {
			return getGEFWrapper(new PrimaryKeyCreateCommand(req));
		}
		if (RmmElementTypes.AlternateKey_3027 == req.getElementType()) {
			return getGEFWrapper(new AlternateKeyCreateCommand(req));
		}
		if (RmmElementTypes.ForeignKey_3024 == req.getElementType()) {
			return getGEFWrapper(new ForeignKeyCreateCommand(req));
		}
		if (RmmElementTypes.Check_3025 == req.getElementType()) {
			return getGEFWrapper(new CheckCreateCommand(req));
		}
		if (RmmElementTypes.Trigger_3026 == req.getElementType()) {
			return getGEFWrapper(new TriggerCreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

}
