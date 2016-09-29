/*
 * 
 */
package rmm.diagram.part;

import org.eclipse.core.runtime.Platform;
import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.notation.Diagram;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.tooling.runtime.structure.DiagramStructure;

import rmm.RmmPackage;
import rmm.Schema;
import rmm.diagram.edit.parts.AssertionEditPart;
import rmm.diagram.edit.parts.AssertionNameEditPart;
import rmm.diagram.edit.parts.AttributeEditPart;
import rmm.diagram.edit.parts.AttributeNameDataTypeEditPart;
import rmm.diagram.edit.parts.Check2EditPart;
import rmm.diagram.edit.parts.CheckEditPart;
import rmm.diagram.edit.parts.CheckIDName2EditPart;
import rmm.diagram.edit.parts.CheckIDNameEditPart;
import rmm.diagram.edit.parts.DomainDomainConstraintCheckDomainCompartmentEditPart;
import rmm.diagram.edit.parts.DomainEditPart;
import rmm.diagram.edit.parts.DomainNameEditPart;
import rmm.diagram.edit.parts.ForeignKeyEditPart;
import rmm.diagram.edit.parts.ForeignKeyIDNameEditPart;
import rmm.diagram.edit.parts.PrimaryKeyEditPart;
import rmm.diagram.edit.parts.PrimaryKeyIDNameEditPart;
import rmm.diagram.edit.parts.Relationship2EditPart;
import rmm.diagram.edit.parts.RelationshipEditPart;
import rmm.diagram.edit.parts.RelationshipNameEditPart;
import rmm.diagram.edit.parts.SchemaEditPart;
import rmm.diagram.edit.parts.TableEditPart;
import rmm.diagram.edit.parts.TableNameEditPart;
import rmm.diagram.edit.parts.TableTableAttributesCompartmentEditPart;
import rmm.diagram.edit.parts.TableTableConstraintsCompartmentEditPart;
import rmm.diagram.edit.parts.TriggerEditPart;
import rmm.diagram.edit.parts.TriggerIDNameEditPart;
import rmm.diagram.edit.parts.UniqueKeyEditPart;
import rmm.diagram.edit.parts.UniqueKeyIDNameEditPart;

/**
 * This registry is used to determine which type of visual object should be
 * created for the corresponding Diagram, Node, ChildNode or Link represented
 * by a domain model object.
 * 
 * @generated
 */
public class RmmVisualIDRegistry {

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
		return rmm.diagram.part.RmmVisualIDRegistry.getVisualID(view.getType());
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
				RmmDiagramEditorPlugin.getInstance().logError(
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
		if (RmmPackage.eINSTANCE.getSchema().isSuperTypeOf(
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
		String containerModelID = rmm.diagram.part.RmmVisualIDRegistry
				.getModelID(containerView);
		if (!SchemaEditPart.MODEL_ID.equals(containerModelID)
				&& !"rmm".equals(containerModelID)) { //$NON-NLS-1$
			return -1;
		}
		int containerVisualID;
		if (SchemaEditPart.MODEL_ID.equals(containerModelID)) {
			containerVisualID = rmm.diagram.part.RmmVisualIDRegistry
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
			if (RmmPackage.eINSTANCE.getTable().isSuperTypeOf(
					domainElement.eClass())) {
				return TableEditPart.VISUAL_ID;
			}
			if (RmmPackage.eINSTANCE.getAssertion().isSuperTypeOf(
					domainElement.eClass())) {
				return AssertionEditPart.VISUAL_ID;
			}
			if (RmmPackage.eINSTANCE.getDomain().isSuperTypeOf(
					domainElement.eClass())) {
				return DomainEditPart.VISUAL_ID;
			}
			break;
		case TableTableAttributesCompartmentEditPart.VISUAL_ID:
			if (RmmPackage.eINSTANCE.getAttribute().isSuperTypeOf(
					domainElement.eClass())) {
				return AttributeEditPart.VISUAL_ID;
			}
			break;
		case TableTableConstraintsCompartmentEditPart.VISUAL_ID:
			if (RmmPackage.eINSTANCE.getPrimaryKey().isSuperTypeOf(
					domainElement.eClass())) {
				return PrimaryKeyEditPart.VISUAL_ID;
			}
			if (RmmPackage.eINSTANCE.getUniqueKey().isSuperTypeOf(
					domainElement.eClass())) {
				return UniqueKeyEditPart.VISUAL_ID;
			}
			if (RmmPackage.eINSTANCE.getForeignKey().isSuperTypeOf(
					domainElement.eClass())) {
				return ForeignKeyEditPart.VISUAL_ID;
			}
			if (RmmPackage.eINSTANCE.getCheck().isSuperTypeOf(
					domainElement.eClass())) {
				return CheckEditPart.VISUAL_ID;
			}
			if (RmmPackage.eINSTANCE.getTrigger().isSuperTypeOf(
					domainElement.eClass())) {
				return TriggerEditPart.VISUAL_ID;
			}
			break;
		case DomainDomainConstraintCheckDomainCompartmentEditPart.VISUAL_ID:
			if (RmmPackage.eINSTANCE.getCheck().isSuperTypeOf(
					domainElement.eClass())) {
				return Check2EditPart.VISUAL_ID;
			}
			break;
		}
		return -1;
	}

	/**
	 * @generated
	 */
	public static boolean canCreateNode(View containerView, int nodeVisualID) {
		String containerModelID = rmm.diagram.part.RmmVisualIDRegistry
				.getModelID(containerView);
		if (!SchemaEditPart.MODEL_ID.equals(containerModelID)
				&& !"rmm".equals(containerModelID)) { //$NON-NLS-1$
			return false;
		}
		int containerVisualID;
		if (SchemaEditPart.MODEL_ID.equals(containerModelID)) {
			containerVisualID = rmm.diagram.part.RmmVisualIDRegistry
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
			if (AssertionEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (DomainEditPart.VISUAL_ID == nodeVisualID) {
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
			if (TableTableConstraintsCompartmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case AssertionEditPart.VISUAL_ID:
			if (AssertionNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case DomainEditPart.VISUAL_ID:
			if (DomainNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (DomainDomainConstraintCheckDomainCompartmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case PrimaryKeyEditPart.VISUAL_ID:
			if (PrimaryKeyIDNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case UniqueKeyEditPart.VISUAL_ID:
			if (UniqueKeyIDNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ForeignKeyEditPart.VISUAL_ID:
			if (ForeignKeyIDNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case CheckEditPart.VISUAL_ID:
			if (CheckIDNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case TriggerEditPart.VISUAL_ID:
			if (TriggerIDNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case AttributeEditPart.VISUAL_ID:
			if (AttributeNameDataTypeEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case Check2EditPart.VISUAL_ID:
			if (CheckIDName2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case TableTableAttributesCompartmentEditPart.VISUAL_ID:
			if (AttributeEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case TableTableConstraintsCompartmentEditPart.VISUAL_ID:
			if (PrimaryKeyEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (UniqueKeyEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ForeignKeyEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (CheckEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (TriggerEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case DomainDomainConstraintCheckDomainCompartmentEditPart.VISUAL_ID:
			if (Check2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case Relationship2EditPart.VISUAL_ID:
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
		if (RmmPackage.eINSTANCE.getRelationship().isSuperTypeOf(
				domainElement.eClass())) {
			return RelationshipEditPart.VISUAL_ID;
		}
		if (RmmPackage.eINSTANCE.getRelationship().isSuperTypeOf(
				domainElement.eClass())) {
			return Relationship2EditPart.VISUAL_ID;
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
		case TableTableConstraintsCompartmentEditPart.VISUAL_ID:
		case DomainDomainConstraintCheckDomainCompartmentEditPart.VISUAL_ID:
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
		case AssertionEditPart.VISUAL_ID:
		case AttributeEditPart.VISUAL_ID:
		case Check2EditPart.VISUAL_ID:
		case PrimaryKeyEditPart.VISUAL_ID:
		case UniqueKeyEditPart.VISUAL_ID:
		case ForeignKeyEditPart.VISUAL_ID:
		case CheckEditPart.VISUAL_ID:
		case TriggerEditPart.VISUAL_ID:
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
			return rmm.diagram.part.RmmVisualIDRegistry.getVisualID(view);
		}

		/**
		 * @generated
		 */
		@Override
		public String getModelID(View view) {
			return rmm.diagram.part.RmmVisualIDRegistry.getModelID(view);
		}

		/**
		 * @generated
		 */
		@Override
		public int getNodeVisualID(View containerView, EObject domainElement) {
			return rmm.diagram.part.RmmVisualIDRegistry.getNodeVisualID(
					containerView, domainElement);
		}

		/**
		 * @generated
		 */
		@Override
		public boolean checkNodeVisualID(View containerView,
				EObject domainElement, int candidate) {
			return rmm.diagram.part.RmmVisualIDRegistry.checkNodeVisualID(
					containerView, domainElement, candidate);
		}

		/**
		 * @generated
		 */
		@Override
		public boolean isCompartmentVisualID(int visualID) {
			return rmm.diagram.part.RmmVisualIDRegistry
					.isCompartmentVisualID(visualID);
		}

		/**
		 * @generated
		 */
		@Override
		public boolean isSemanticLeafVisualID(int visualID) {
			return rmm.diagram.part.RmmVisualIDRegistry
					.isSemanticLeafVisualID(visualID);
		}
	};

}
