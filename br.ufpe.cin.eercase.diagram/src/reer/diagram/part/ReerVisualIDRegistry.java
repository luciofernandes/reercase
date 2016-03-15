/*
 * 
 */
package reer.diagram.part;

import org.eclipse.core.runtime.Platform;
import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.notation.Diagram;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.tooling.runtime.structure.DiagramStructure;

import reer.ReerPackage;
import reer.Schema;
import reer.diagram.edit.parts.AnnotationEditPart;
import reer.diagram.edit.parts.AnnotationNameEditPart;
import reer.diagram.edit.parts.AttributeEditPart;
import reer.diagram.edit.parts.AttributeNameEditPart;
import reer.diagram.edit.parts.AttributeUniqueKeyEditPart;
import reer.diagram.edit.parts.AttributeUniqueKeyNameIdentityPositionEditPart;
import reer.diagram.edit.parts.RelationshipEditPart;
import reer.diagram.edit.parts.RelationshipNameEditPart;
import reer.diagram.edit.parts.SchemaEditPart;
import reer.diagram.edit.parts.TableEditPart;
import reer.diagram.edit.parts.TableNameEditPart;
import reer.diagram.edit.parts.TableTableAnnotattionCompartmentEditPart;
import reer.diagram.edit.parts.TableTableAttributesCompartmentEditPart;

/**
 * This registry is used to determine which type of visual object should be
 * created for the corresponding Diagram, Node, ChildNode or Link represented
 * by a domain model object.
 * 
 * @generated
 */
public class ReerVisualIDRegistry {

	/**
	 * @generated
	 */
	private static final String DEBUG_KEY = "br.ufpe.cin.eercase.diagram/debug/visualID"; //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static int getVisualID(View view) {
		if (view instanceof Diagram) {
			if (SchemaEditPart.MODEL_ID.equals(view.getType())) {
				return SchemaEditPart.VISUAL_ID;
			} else {
				return -1;
			}
		}
		return reer.diagram.part.ReerVisualIDRegistry.getVisualID(view
				.getType());
	}

	/**
	 * @generated
	 */
	public static String getModelID(View view) {
		View diagram = view.getDiagram();
		while (view != diagram) {
			EAnnotation annotation = view.getEAnnotation("Shortcut"); //$NON-NLS-1$
			if (annotation != null) {
				return (String) annotation.getDetails().get("modelID"); //$NON-NLS-1$
			}
			view = (View) view.eContainer();
		}
		return diagram != null ? diagram.getType() : null;
	}

	/**
	 * @generated
	 */
	public static int getVisualID(String type) {
		try {
			return Integer.parseInt(type);
		} catch (NumberFormatException e) {
			if (Boolean.TRUE.toString().equalsIgnoreCase(
					Platform.getDebugOption(DEBUG_KEY))) {
				ReerDiagramEditorPlugin.getInstance().logError(
						"Unable to parse view type as a visualID number: "
								+ type);
			}
		}
		return -1;
	}

	/**
	 * @generated
	 */
	public static String getType(int visualID) {
		return Integer.toString(visualID);
	}

	/**
	 * @generated
	 */
	public static int getDiagramVisualID(EObject domainElement) {
		if (domainElement == null) {
			return -1;
		}
		if (ReerPackage.eINSTANCE.getSchema().isSuperTypeOf(
				domainElement.eClass())
				&& isDiagram((Schema) domainElement)) {
			return SchemaEditPart.VISUAL_ID;
		}
		return -1;
	}

	/**
	 * @generated
	 */
	public static int getNodeVisualID(View containerView, EObject domainElement) {
		if (domainElement == null) {
			return -1;
		}
		String containerModelID = reer.diagram.part.ReerVisualIDRegistry
				.getModelID(containerView);
		if (!SchemaEditPart.MODEL_ID.equals(containerModelID)
				&& !"reer".equals(containerModelID)) { //$NON-NLS-1$
			return -1;
		}
		int containerVisualID;
		if (SchemaEditPart.MODEL_ID.equals(containerModelID)) {
			containerVisualID = reer.diagram.part.ReerVisualIDRegistry
					.getVisualID(containerView);
		} else {
			if (containerView instanceof Diagram) {
				containerVisualID = SchemaEditPart.VISUAL_ID;
			} else {
				return -1;
			}
		}
		switch (containerVisualID) {
		case SchemaEditPart.VISUAL_ID:
			if (ReerPackage.eINSTANCE.getTable().isSuperTypeOf(
					domainElement.eClass())) {
				return TableEditPart.VISUAL_ID;
			}
			break;
		case TableTableAttributesCompartmentEditPart.VISUAL_ID:
			if (ReerPackage.eINSTANCE.getAttribute().isSuperTypeOf(
					domainElement.eClass())) {
				return AttributeEditPart.VISUAL_ID;
			}
			if (ReerPackage.eINSTANCE.getAttributeUniqueKey().isSuperTypeOf(
					domainElement.eClass())) {
				return AttributeUniqueKeyEditPart.VISUAL_ID;
			}
			break;
		case TableTableAnnotattionCompartmentEditPart.VISUAL_ID:
			if (ReerPackage.eINSTANCE.getAnnotation().isSuperTypeOf(
					domainElement.eClass())) {
				return AnnotationEditPart.VISUAL_ID;
			}
			break;
		}
		return -1;
	}

	/**
	 * @generated
	 */
	public static boolean canCreateNode(View containerView, int nodeVisualID) {
		String containerModelID = reer.diagram.part.ReerVisualIDRegistry
				.getModelID(containerView);
		if (!SchemaEditPart.MODEL_ID.equals(containerModelID)
				&& !"reer".equals(containerModelID)) { //$NON-NLS-1$
			return false;
		}
		int containerVisualID;
		if (SchemaEditPart.MODEL_ID.equals(containerModelID)) {
			containerVisualID = reer.diagram.part.ReerVisualIDRegistry
					.getVisualID(containerView);
		} else {
			if (containerView instanceof Diagram) {
				containerVisualID = SchemaEditPart.VISUAL_ID;
			} else {
				return false;
			}
		}
		switch (containerVisualID) {
		case SchemaEditPart.VISUAL_ID:
			if (TableEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case TableEditPart.VISUAL_ID:
			if (TableNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (TableTableAttributesCompartmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (TableTableAnnotattionCompartmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case AttributeEditPart.VISUAL_ID:
			if (AttributeNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case AttributeUniqueKeyEditPart.VISUAL_ID:
			if (AttributeUniqueKeyNameIdentityPositionEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case AnnotationEditPart.VISUAL_ID:
			if (AnnotationNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case TableTableAttributesCompartmentEditPart.VISUAL_ID:
			if (AttributeEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (AttributeUniqueKeyEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case TableTableAnnotattionCompartmentEditPart.VISUAL_ID:
			if (AnnotationEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case RelationshipEditPart.VISUAL_ID:
			if (RelationshipNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		}
		return false;
	}

	/**
	 * @generated
	 */
	public static int getLinkWithClassVisualID(EObject domainElement) {
		if (domainElement == null) {
			return -1;
		}
		if (ReerPackage.eINSTANCE.getRelationship().isSuperTypeOf(
				domainElement.eClass())) {
			return RelationshipEditPart.VISUAL_ID;
		}
		return -1;
	}

	/**
	 * User can change implementation of this method to handle some specific
	 * situations not covered by default logic.
	 * 
	 * @generated
	 */
	private static boolean isDiagram(Schema element) {
		return true;
	}

	/**
	 * @generated
	 */
	public static boolean checkNodeVisualID(View containerView,
			EObject domainElement, int candidate) {
		if (candidate == -1) {
			//unrecognized id is always bad
			return false;
		}
		int basic = getNodeVisualID(containerView, domainElement);
		return basic == candidate;
	}

	/**
	 * @generated
	 */
	public static boolean isCompartmentVisualID(int visualID) {
		switch (visualID) {
		case TableTableAttributesCompartmentEditPart.VISUAL_ID:
		case TableTableAnnotattionCompartmentEditPart.VISUAL_ID:
			return true;
		default:
			break;
		}
		return false;
	}

	/**
	 * @generated
	 */
	public static boolean isSemanticLeafVisualID(int visualID) {
		switch (visualID) {
		case SchemaEditPart.VISUAL_ID:
			return false;
		case AttributeEditPart.VISUAL_ID:
		case AttributeUniqueKeyEditPart.VISUAL_ID:
		case AnnotationEditPart.VISUAL_ID:
			return true;
		default:
			break;
		}
		return false;
	}

	/**
	 * @generated
	 */
	public static final DiagramStructure TYPED_INSTANCE = new DiagramStructure() {
		/**
		 * @generated
		 */
		@Override
		public int getVisualID(View view) {
			return reer.diagram.part.ReerVisualIDRegistry.getVisualID(view);
		}

		/**
		 * @generated
		 */
		@Override
		public String getModelID(View view) {
			return reer.diagram.part.ReerVisualIDRegistry.getModelID(view);
		}

		/**
		 * @generated
		 */
		@Override
		public int getNodeVisualID(View containerView, EObject domainElement) {
			return reer.diagram.part.ReerVisualIDRegistry.getNodeVisualID(
					containerView, domainElement);
		}

		/**
		 * @generated
		 */
		@Override
		public boolean checkNodeVisualID(View containerView,
				EObject domainElement, int candidate) {
			return reer.diagram.part.ReerVisualIDRegistry.checkNodeVisualID(
					containerView, domainElement, candidate);
		}

		/**
		 * @generated
		 */
		@Override
		public boolean isCompartmentVisualID(int visualID) {
			return reer.diagram.part.ReerVisualIDRegistry
					.isCompartmentVisualID(visualID);
		}

		/**
		 * @generated
		 */
		@Override
		public boolean isSemanticLeafVisualID(int visualID) {
			return reer.diagram.part.ReerVisualIDRegistry
					.isSemanticLeafVisualID(visualID);
		}
	};

}
