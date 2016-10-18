/*
 * 
 */
package rmm.diagram.edit.parts;

import org.eclipse.gef.EditPart;
import org.eclipse.gef.EditPartFactory;
import org.eclipse.gef.tools.CellEditorLocator;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ITextAwareEditPart;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.tooling.runtime.directedit.locator.CellEditorLocatorAccess;

import rmm.diagram.part.RmmVisualIDRegistry;

/**
 * @generated
 */
public class RmmEditPartFactory implements EditPartFactory {

	/**
	 * @generated
	 */
	public EditPart createEditPart(EditPart context, Object model) {
		if (model instanceof View) {
			View view = (View) model;
			switch (RmmVisualIDRegistry.getVisualID(view)) {

			case SchemaEditPart.VISUAL_ID:
				return new SchemaEditPart(view);

			case TableEditPart.VISUAL_ID:
				return new TableEditPart(view);

			case TableNameEditPart.VISUAL_ID:
				return new TableNameEditPart(view);

			case AssertionEditPart.VISUAL_ID:
				return new AssertionEditPart(view);

			case AssertionNameEditPart.VISUAL_ID:
				return new AssertionNameEditPart(view);

			case DomainEditPart.VISUAL_ID:
				return new DomainEditPart(view);

			case DomainNameEditPart.VISUAL_ID:
				return new DomainNameEditPart(view);

			case PrimaryKeyEditPart.VISUAL_ID:
				return new PrimaryKeyEditPart(view);

			case PrimaryKeyIDNameEditPart.VISUAL_ID:
				return new PrimaryKeyIDNameEditPart(view);

			case UniqueKeyEditPart.VISUAL_ID:
				return new UniqueKeyEditPart(view);

			case UniqueKeyIDNameEditPart.VISUAL_ID:
				return new UniqueKeyIDNameEditPart(view);

			case ForeignKeyEditPart.VISUAL_ID:
				return new ForeignKeyEditPart(view);

			case ForeignKeyIDNameEditPart.VISUAL_ID:
				return new ForeignKeyIDNameEditPart(view);

			case CheckEditPart.VISUAL_ID:
				return new CheckEditPart(view);

			case CheckIDNameEditPart.VISUAL_ID:
				return new CheckIDNameEditPart(view);

			case TriggerEditPart.VISUAL_ID:
				return new TriggerEditPart(view);

			case TriggerIDNameEditPart.VISUAL_ID:
				return new TriggerIDNameEditPart(view);

			case AttributeEditPart.VISUAL_ID:
				return new AttributeEditPart(view);

			case AttributeNameDataTypeEditPart.VISUAL_ID:
				return new AttributeNameDataTypeEditPart(view);

			case Check2EditPart.VISUAL_ID:
				return new Check2EditPart(view);

			case CheckIDName2EditPart.VISUAL_ID:
				return new CheckIDName2EditPart(view);

			case TableTableAttributesCompartmentEditPart.VISUAL_ID:
				return new TableTableAttributesCompartmentEditPart(view);

			case TableTableConstraintsCompartmentEditPart.VISUAL_ID:
				return new TableTableConstraintsCompartmentEditPart(view);

			case DomainDomainConstraintCheckDomainCompartmentEditPart.VISUAL_ID:
				return new DomainDomainConstraintCheckDomainCompartmentEditPart(
						view);

			case RelationshipEditPart.VISUAL_ID:
				return new RelationshipEditPart(view);

			case RelationshipNameUpdateDeleteEditPart.VISUAL_ID:
				return new RelationshipNameUpdateDeleteEditPart(view);

			}
		}
		return createUnrecognizedEditPart(context, model);
	}

	/**
	 * @generated
	 */
	private EditPart createUnrecognizedEditPart(EditPart context, Object model) {
		// Handle creation of unrecognized child node EditParts here
		return null;
	}

	/**
	 * @generated
	 */
	public static CellEditorLocator getTextCellEditorLocator(
			ITextAwareEditPart source) {
		return CellEditorLocatorAccess.INSTANCE
				.getTextCellEditorLocator(source);
	}

}
