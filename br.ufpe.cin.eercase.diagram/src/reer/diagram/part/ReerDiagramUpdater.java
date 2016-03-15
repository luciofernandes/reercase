/*
 * 
 */
package reer.diagram.part;

import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.tooling.runtime.update.DiagramUpdater;

import reer.Annotation;
import reer.Attribute;
import reer.AttributeUniqueKey;
import reer.Column;
import reer.ReerPackage;
import reer.Relationship;
import reer.Schema;
import reer.Table;
import reer.diagram.edit.parts.AnnotationEditPart;
import reer.diagram.edit.parts.AttributeEditPart;
import reer.diagram.edit.parts.AttributeUniqueKeyEditPart;
import reer.diagram.edit.parts.RelationshipEditPart;
import reer.diagram.edit.parts.SchemaEditPart;
import reer.diagram.edit.parts.TableEditPart;
import reer.diagram.edit.parts.TableTableAnnotattionCompartmentEditPart;
import reer.diagram.edit.parts.TableTableAttributesCompartmentEditPart;
import reer.diagram.providers.ReerElementTypes;

/**
 * @generated
 */
public class ReerDiagramUpdater {

	/**
	 * @generated
	 */
	public static boolean isShortcutOrphaned(View view) {
		return !view.isSetElement() || view.getElement() == null
				|| view.getElement().eIsProxy();
	}

	/**
	 * @generated
	 */
	public static List<ReerNodeDescriptor> getSemanticChildren(View view) {
		switch (ReerVisualIDRegistry.getVisualID(view)) {
		case SchemaEditPart.VISUAL_ID:
			return getSchema_1000SemanticChildren(view);
		case TableTableAttributesCompartmentEditPart.VISUAL_ID:
			return getTableTableAttributesCompartment_7001SemanticChildren(view);
		case TableTableAnnotattionCompartmentEditPart.VISUAL_ID:
			return getTableTableAnnotattionCompartment_7002SemanticChildren(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ReerNodeDescriptor> getSchema_1000SemanticChildren(
			View view) {
		if (!view.isSetElement()) {
			return Collections.emptyList();
		}
		Schema modelElement = (Schema) view.getElement();
		LinkedList<ReerNodeDescriptor> result = new LinkedList<ReerNodeDescriptor>();
		for (Iterator<?> it = modelElement.getTable().iterator(); it.hasNext();) {
			Table childElement = (Table) it.next();
			int visualID = ReerVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == TableEditPart.VISUAL_ID) {
				result.add(new ReerNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ReerNodeDescriptor> getTableTableAttributesCompartment_7001SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		Table modelElement = (Table) containerView.getElement();
		LinkedList<ReerNodeDescriptor> result = new LinkedList<ReerNodeDescriptor>();
		for (Iterator<?> it = modelElement.getAttributes().iterator(); it
				.hasNext();) {
			Column childElement = (Column) it.next();
			int visualID = ReerVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == AttributeEditPart.VISUAL_ID) {
				result.add(new ReerNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == AttributeUniqueKeyEditPart.VISUAL_ID) {
				result.add(new ReerNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ReerNodeDescriptor> getTableTableAnnotattionCompartment_7002SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		Table modelElement = (Table) containerView.getElement();
		LinkedList<ReerNodeDescriptor> result = new LinkedList<ReerNodeDescriptor>();
		for (Iterator<?> it = modelElement.getAnnotattion().iterator(); it
				.hasNext();) {
			Annotation childElement = (Annotation) it.next();
			int visualID = ReerVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == AnnotationEditPart.VISUAL_ID) {
				result.add(new ReerNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ReerLinkDescriptor> getContainedLinks(View view) {
		switch (ReerVisualIDRegistry.getVisualID(view)) {
		case SchemaEditPart.VISUAL_ID:
			return getSchema_1000ContainedLinks(view);
		case TableEditPart.VISUAL_ID:
			return getTable_2001ContainedLinks(view);
		case AttributeEditPart.VISUAL_ID:
			return getAttribute_3001ContainedLinks(view);
		case AttributeUniqueKeyEditPart.VISUAL_ID:
			return getAttributeUniqueKey_3002ContainedLinks(view);
		case AnnotationEditPart.VISUAL_ID:
			return getAnnotation_3003ContainedLinks(view);
		case RelationshipEditPart.VISUAL_ID:
			return getRelationship_4001ContainedLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ReerLinkDescriptor> getIncomingLinks(View view) {
		switch (ReerVisualIDRegistry.getVisualID(view)) {
		case TableEditPart.VISUAL_ID:
			return getTable_2001IncomingLinks(view);
		case AttributeEditPart.VISUAL_ID:
			return getAttribute_3001IncomingLinks(view);
		case AttributeUniqueKeyEditPart.VISUAL_ID:
			return getAttributeUniqueKey_3002IncomingLinks(view);
		case AnnotationEditPart.VISUAL_ID:
			return getAnnotation_3003IncomingLinks(view);
		case RelationshipEditPart.VISUAL_ID:
			return getRelationship_4001IncomingLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ReerLinkDescriptor> getOutgoingLinks(View view) {
		switch (ReerVisualIDRegistry.getVisualID(view)) {
		case TableEditPart.VISUAL_ID:
			return getTable_2001OutgoingLinks(view);
		case AttributeEditPart.VISUAL_ID:
			return getAttribute_3001OutgoingLinks(view);
		case AttributeUniqueKeyEditPart.VISUAL_ID:
			return getAttributeUniqueKey_3002OutgoingLinks(view);
		case AnnotationEditPart.VISUAL_ID:
			return getAnnotation_3003OutgoingLinks(view);
		case RelationshipEditPart.VISUAL_ID:
			return getRelationship_4001OutgoingLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ReerLinkDescriptor> getSchema_1000ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ReerLinkDescriptor> getTable_2001ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ReerLinkDescriptor> getAttribute_3001ContainedLinks(
			View view) {
		Attribute modelElement = (Attribute) view.getElement();
		LinkedList<ReerLinkDescriptor> result = new LinkedList<ReerLinkDescriptor>();
		result.addAll(getContainedTypeModelFacetLinks_Relationship_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ReerLinkDescriptor> getAttributeUniqueKey_3002ContainedLinks(
			View view) {
		AttributeUniqueKey modelElement = (AttributeUniqueKey) view
				.getElement();
		LinkedList<ReerLinkDescriptor> result = new LinkedList<ReerLinkDescriptor>();
		result.addAll(getContainedTypeModelFacetLinks_Relationship_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ReerLinkDescriptor> getAnnotation_3003ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ReerLinkDescriptor> getRelationship_4001ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ReerLinkDescriptor> getTable_2001IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ReerLinkDescriptor> getAttribute_3001IncomingLinks(
			View view) {
		Attribute modelElement = (Attribute) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<ReerLinkDescriptor> result = new LinkedList<ReerLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_Relationship_4001(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ReerLinkDescriptor> getAttributeUniqueKey_3002IncomingLinks(
			View view) {
		AttributeUniqueKey modelElement = (AttributeUniqueKey) view
				.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<ReerLinkDescriptor> result = new LinkedList<ReerLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_Relationship_4001(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ReerLinkDescriptor> getAnnotation_3003IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ReerLinkDescriptor> getRelationship_4001IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ReerLinkDescriptor> getTable_2001OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ReerLinkDescriptor> getAttribute_3001OutgoingLinks(
			View view) {
		Attribute modelElement = (Attribute) view.getElement();
		LinkedList<ReerLinkDescriptor> result = new LinkedList<ReerLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_Relationship_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ReerLinkDescriptor> getAttributeUniqueKey_3002OutgoingLinks(
			View view) {
		AttributeUniqueKey modelElement = (AttributeUniqueKey) view
				.getElement();
		LinkedList<ReerLinkDescriptor> result = new LinkedList<ReerLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_Relationship_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ReerLinkDescriptor> getAnnotation_3003OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ReerLinkDescriptor> getRelationship_4001OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	private static Collection<ReerLinkDescriptor> getContainedTypeModelFacetLinks_Relationship_4001(
			Column container) {
		LinkedList<ReerLinkDescriptor> result = new LinkedList<ReerLinkDescriptor>();
		for (Iterator<?> links = container.getRelationship().iterator(); links
				.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof Relationship) {
				continue;
			}
			Relationship link = (Relationship) linkObject;
			if (RelationshipEditPart.VISUAL_ID != ReerVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			Column dst = link.getTarget();
			Column src = link.getSource();
			result.add(new ReerLinkDescriptor(src, dst, link,
					ReerElementTypes.Relationship_4001,
					RelationshipEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<ReerLinkDescriptor> getIncomingTypeModelFacetLinks_Relationship_4001(
			Column target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<ReerLinkDescriptor> result = new LinkedList<ReerLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences
				.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() != ReerPackage.eINSTANCE
					.getRelationship_Target()
					|| false == setting.getEObject() instanceof Relationship) {
				continue;
			}
			Relationship link = (Relationship) setting.getEObject();
			if (RelationshipEditPart.VISUAL_ID != ReerVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			Column src = link.getSource();
			result.add(new ReerLinkDescriptor(src, target, link,
					ReerElementTypes.Relationship_4001,
					RelationshipEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<ReerLinkDescriptor> getOutgoingTypeModelFacetLinks_Relationship_4001(
			Column source) {
		Column container = null;
		// Find container element for the link.
		// Climb up by containment hierarchy starting from the source
		// and return the first element that is instance of the container class.
		for (EObject element = source; element != null && container == null; element = element
				.eContainer()) {
			if (element instanceof Column) {
				container = (Column) element;
			}
		}
		if (container == null) {
			return Collections.emptyList();
		}
		LinkedList<ReerLinkDescriptor> result = new LinkedList<ReerLinkDescriptor>();
		for (Iterator<?> links = container.getRelationship().iterator(); links
				.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof Relationship) {
				continue;
			}
			Relationship link = (Relationship) linkObject;
			if (RelationshipEditPart.VISUAL_ID != ReerVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			Column dst = link.getTarget();
			Column src = link.getSource();
			if (src != source) {
				continue;
			}
			result.add(new ReerLinkDescriptor(src, dst, link,
					ReerElementTypes.Relationship_4001,
					RelationshipEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static final DiagramUpdater TYPED_INSTANCE = new DiagramUpdater() {
		/**
		 * @generated
		 */
		@Override
		public List<ReerNodeDescriptor> getSemanticChildren(View view) {
			return ReerDiagramUpdater.getSemanticChildren(view);
		}

		/**
		 * @generated
		 */
		@Override
		public List<ReerLinkDescriptor> getContainedLinks(View view) {
			return ReerDiagramUpdater.getContainedLinks(view);
		}

		/**
		 * @generated
		 */
		@Override
		public List<ReerLinkDescriptor> getIncomingLinks(View view) {
			return ReerDiagramUpdater.getIncomingLinks(view);
		}

		/**
		 * @generated
		 */
		@Override
		public List<ReerLinkDescriptor> getOutgoingLinks(View view) {
			return ReerDiagramUpdater.getOutgoingLinks(view);
		}
	};

}
