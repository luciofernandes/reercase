/*
 * 
 */
package reer.diagram.edit.parts;

import org.eclipse.gef.EditPart;
import org.eclipse.gef.EditPartFactory;
import org.eclipse.gef.tools.CellEditorLocator;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ITextAwareEditPart;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.tooling.runtime.directedit.locator.CellEditorLocatorAccess;

import reer.diagram.part.ReerVisualIDRegistry;

/**
 * @generated
 */
public class ReerEditPartFactory implements EditPartFactory {

	/**
	 * @generated
	 */
	public EditPart createEditPart(EditPart context, Object model) {
		if (model instanceof View) {
			View view = (View) model;
			switch (ReerVisualIDRegistry.getVisualID(view)) {

			case SchemaEditPart.VISUAL_ID:
				return new SchemaEditPart(view);

			case TableEditPart.VISUAL_ID:
				return new TableEditPart(view);

			case TableNameEditPart.VISUAL_ID:
				return new TableNameEditPart(view);

			case AttributeEditPart.VISUAL_ID:
				return new AttributeEditPart(view);

			case AttributeNameEditPart.VISUAL_ID:
				return new AttributeNameEditPart(view);

			case AttributeUniqueKeyEditPart.VISUAL_ID:
				return new AttributeUniqueKeyEditPart(view);

			case AttributeUniqueKeyNameIdentityPositionEditPart.VISUAL_ID:
				return new AttributeUniqueKeyNameIdentityPositionEditPart(view);

			case AnnotationEditPart.VISUAL_ID:
				return new AnnotationEditPart(view);

			case AnnotationNameEditPart.VISUAL_ID:
				return new AnnotationNameEditPart(view);

			case TableTableAttributesCompartmentEditPart.VISUAL_ID:
				return new TableTableAttributesCompartmentEditPart(view);

			case TableTableAnnotattionCompartmentEditPart.VISUAL_ID:
				return new TableTableAnnotattionCompartmentEditPart(view);

			case RelationshipEditPart.VISUAL_ID:
				return new RelationshipEditPart(view);

			case RelationshipNameEditPart.VISUAL_ID:
				return new RelationshipNameEditPart(view);

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
