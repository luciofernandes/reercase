/*
 * 
 */
package rmm.diagram.part;

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

import rmm.Assertion;
import rmm.Attribute;
import rmm.Check;
import rmm.Constraint;
import rmm.Domain;
import rmm.ForeignKey;
import rmm.PrimaryKey;
import rmm.Relationship;
import rmm.RmmPackage;
import rmm.Schema;
import rmm.Table;
import rmm.diagram.edit.parts.AssertionEditPart;
import rmm.diagram.edit.parts.AttributeEditPart;
import rmm.diagram.edit.parts.Check2EditPart;
import rmm.diagram.edit.parts.CheckEditPart;
import rmm.diagram.edit.parts.DomainDomainConstraintCheckDomainCompartmentEditPart;
import rmm.diagram.edit.parts.DomainEditPart;
import rmm.diagram.edit.parts.ForeignKeyEditPart;
import rmm.diagram.edit.parts.PrimaryKeyEditPart;
import rmm.diagram.edit.parts.Relationship2EditPart;
import rmm.diagram.edit.parts.RelationshipEditPart;
import rmm.diagram.edit.parts.SchemaEditPart;
import rmm.diagram.edit.parts.TableEditPart;
import rmm.diagram.edit.parts.TableTableAttributesCompartmentEditPart;
import rmm.diagram.edit.parts.TableTableConstraintsCompartmentEditPart;
import rmm.diagram.edit.parts.TriggerEditPart;
import rmm.diagram.edit.parts.UniqueKeyEditPart;
import rmm.diagram.providers.RmmElementTypes;

/**
 * @generated
 */
public class RmmDiagramUpdater {

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
	public static List<RmmNodeDescriptor> getSemanticChildren(View view) {
		switch (RmmVisualIDRegistry.getVisualID(view)) {
		case SchemaEditPart.VISUAL_ID:
			return getSchema_1000SemanticChildren(view);
		case TableTableAttributesCompartmentEditPart.VISUAL_ID:
			return getTableTableAttributesCompartment_7004SemanticChildren(view);
		case TableTableConstraintsCompartmentEditPart.VISUAL_ID:
			return getTableTableConstraintsCompartment_7005SemanticChildren(view);
		case DomainDomainConstraintCheckDomainCompartmentEditPart.VISUAL_ID:
			return getDomainDomainConstraintCheckDomainCompartment_7006SemanticChildren(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<RmmNodeDescriptor> getSchema_1000SemanticChildren(
			View view) {
		if (!view.isSetElement()) {
			return Collections.emptyList();
		}
		Schema modelElement = (Schema) view.getElement();
		LinkedList<RmmNodeDescriptor> result = new LinkedList<RmmNodeDescriptor>();
		for (Iterator<?> it = modelElement.getTable().iterator(); it.hasNext();) {
			Table childElement = (Table) it.next();
			int visualID = RmmVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == TableEditPart.VISUAL_ID) {
				result.add(new RmmNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		for (Iterator<?> it = modelElement.getAssertion().iterator(); it
				.hasNext();) {
			Assertion childElement = (Assertion) it.next();
			int visualID = RmmVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == AssertionEditPart.VISUAL_ID) {
				result.add(new RmmNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		for (Iterator<?> it = modelElement.getDomain().iterator(); it.hasNext();) {
			Domain childElement = (Domain) it.next();
			int visualID = RmmVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == DomainEditPart.VISUAL_ID) {
				result.add(new RmmNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<RmmNodeDescriptor> getTableTableAttributesCompartment_7004SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		Table modelElement = (Table) containerView.getElement();
		LinkedList<RmmNodeDescriptor> result = new LinkedList<RmmNodeDescriptor>();
		for (Iterator<?> it = modelElement.getAttributes().iterator(); it
				.hasNext();) {
			Attribute childElement = (Attribute) it.next();
			int visualID = RmmVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == AttributeEditPart.VISUAL_ID) {
				result.add(new RmmNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<RmmNodeDescriptor> getTableTableConstraintsCompartment_7005SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		Table modelElement = (Table) containerView.getElement();
		LinkedList<RmmNodeDescriptor> result = new LinkedList<RmmNodeDescriptor>();
		for (Iterator<?> it = modelElement.getConstraints().iterator(); it
				.hasNext();) {
			Constraint childElement = (Constraint) it.next();
			int visualID = RmmVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == PrimaryKeyEditPart.VISUAL_ID) {
				result.add(new RmmNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == UniqueKeyEditPart.VISUAL_ID) {
				result.add(new RmmNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == ForeignKeyEditPart.VISUAL_ID) {
				result.add(new RmmNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == CheckEditPart.VISUAL_ID) {
				result.add(new RmmNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == TriggerEditPart.VISUAL_ID) {
				result.add(new RmmNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<RmmNodeDescriptor> getDomainDomainConstraintCheckDomainCompartment_7006SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		Domain modelElement = (Domain) containerView.getElement();
		LinkedList<RmmNodeDescriptor> result = new LinkedList<RmmNodeDescriptor>();
		for (Iterator<?> it = modelElement.getConstraintCheckDomain()
				.iterator(); it.hasNext();) {
			Check childElement = (Check) it.next();
			int visualID = RmmVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == Check2EditPart.VISUAL_ID) {
				result.add(new RmmNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<RmmLinkDescriptor> getContainedLinks(View view) {
		switch (RmmVisualIDRegistry.getVisualID(view)) {
		case SchemaEditPart.VISUAL_ID:
			return getSchema_1000ContainedLinks(view);
		case TableEditPart.VISUAL_ID:
			return getTable_2004ContainedLinks(view);
		case AssertionEditPart.VISUAL_ID:
			return getAssertion_2007ContainedLinks(view);
		case DomainEditPart.VISUAL_ID:
			return getDomain_2008ContainedLinks(view);
		case PrimaryKeyEditPart.VISUAL_ID:
			return getPrimaryKey_3022ContainedLinks(view);
		case UniqueKeyEditPart.VISUAL_ID:
			return getUniqueKey_3023ContainedLinks(view);
		case ForeignKeyEditPart.VISUAL_ID:
			return getForeignKey_3024ContainedLinks(view);
		case CheckEditPart.VISUAL_ID:
			return getCheck_3025ContainedLinks(view);
		case TriggerEditPart.VISUAL_ID:
			return getTrigger_3026ContainedLinks(view);
		case AttributeEditPart.VISUAL_ID:
			return getAttribute_3006ContainedLinks(view);
		case Check2EditPart.VISUAL_ID:
			return getCheck_3021ContainedLinks(view);
		case RelationshipEditPart.VISUAL_ID:
			return getRelationship_4002ContainedLinks(view);
		case Relationship2EditPart.VISUAL_ID:
			return getRelationship_4003ContainedLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<RmmLinkDescriptor> getIncomingLinks(View view) {
		switch (RmmVisualIDRegistry.getVisualID(view)) {
		case TableEditPart.VISUAL_ID:
			return getTable_2004IncomingLinks(view);
		case AssertionEditPart.VISUAL_ID:
			return getAssertion_2007IncomingLinks(view);
		case DomainEditPart.VISUAL_ID:
			return getDomain_2008IncomingLinks(view);
		case PrimaryKeyEditPart.VISUAL_ID:
			return getPrimaryKey_3022IncomingLinks(view);
		case UniqueKeyEditPart.VISUAL_ID:
			return getUniqueKey_3023IncomingLinks(view);
		case ForeignKeyEditPart.VISUAL_ID:
			return getForeignKey_3024IncomingLinks(view);
		case CheckEditPart.VISUAL_ID:
			return getCheck_3025IncomingLinks(view);
		case TriggerEditPart.VISUAL_ID:
			return getTrigger_3026IncomingLinks(view);
		case AttributeEditPart.VISUAL_ID:
			return getAttribute_3006IncomingLinks(view);
		case Check2EditPart.VISUAL_ID:
			return getCheck_3021IncomingLinks(view);
		case RelationshipEditPart.VISUAL_ID:
			return getRelationship_4002IncomingLinks(view);
		case Relationship2EditPart.VISUAL_ID:
			return getRelationship_4003IncomingLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<RmmLinkDescriptor> getOutgoingLinks(View view) {
		switch (RmmVisualIDRegistry.getVisualID(view)) {
		case TableEditPart.VISUAL_ID:
			return getTable_2004OutgoingLinks(view);
		case AssertionEditPart.VISUAL_ID:
			return getAssertion_2007OutgoingLinks(view);
		case DomainEditPart.VISUAL_ID:
			return getDomain_2008OutgoingLinks(view);
		case PrimaryKeyEditPart.VISUAL_ID:
			return getPrimaryKey_3022OutgoingLinks(view);
		case UniqueKeyEditPart.VISUAL_ID:
			return getUniqueKey_3023OutgoingLinks(view);
		case ForeignKeyEditPart.VISUAL_ID:
			return getForeignKey_3024OutgoingLinks(view);
		case CheckEditPart.VISUAL_ID:
			return getCheck_3025OutgoingLinks(view);
		case TriggerEditPart.VISUAL_ID:
			return getTrigger_3026OutgoingLinks(view);
		case AttributeEditPart.VISUAL_ID:
			return getAttribute_3006OutgoingLinks(view);
		case Check2EditPart.VISUAL_ID:
			return getCheck_3021OutgoingLinks(view);
		case RelationshipEditPart.VISUAL_ID:
			return getRelationship_4002OutgoingLinks(view);
		case Relationship2EditPart.VISUAL_ID:
			return getRelationship_4003OutgoingLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<RmmLinkDescriptor> getSchema_1000ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<RmmLinkDescriptor> getTable_2004ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<RmmLinkDescriptor> getAssertion_2007ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<RmmLinkDescriptor> getDomain_2008ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<RmmLinkDescriptor> getPrimaryKey_3022ContainedLinks(
			View view) {
		PrimaryKey modelElement = (PrimaryKey) view.getElement();
		LinkedList<RmmLinkDescriptor> result = new LinkedList<RmmLinkDescriptor>();
		result.addAll(getContainedTypeModelFacetLinks_Relationship_4002(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<RmmLinkDescriptor> getUniqueKey_3023ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<RmmLinkDescriptor> getForeignKey_3024ContainedLinks(
			View view) {
		ForeignKey modelElement = (ForeignKey) view.getElement();
		LinkedList<RmmLinkDescriptor> result = new LinkedList<RmmLinkDescriptor>();
		result.addAll(getContainedTypeModelFacetLinks_Relationship_4003(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<RmmLinkDescriptor> getCheck_3025ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<RmmLinkDescriptor> getTrigger_3026ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<RmmLinkDescriptor> getAttribute_3006ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<RmmLinkDescriptor> getCheck_3021ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<RmmLinkDescriptor> getRelationship_4002ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<RmmLinkDescriptor> getRelationship_4003ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<RmmLinkDescriptor> getTable_2004IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<RmmLinkDescriptor> getAssertion_2007IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<RmmLinkDescriptor> getDomain_2008IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<RmmLinkDescriptor> getPrimaryKey_3022IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<RmmLinkDescriptor> getUniqueKey_3023IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<RmmLinkDescriptor> getForeignKey_3024IncomingLinks(
			View view) {
		ForeignKey modelElement = (ForeignKey) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<RmmLinkDescriptor> result = new LinkedList<RmmLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_Relationship_4002(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Relationship_4003(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<RmmLinkDescriptor> getCheck_3025IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<RmmLinkDescriptor> getTrigger_3026IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<RmmLinkDescriptor> getAttribute_3006IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<RmmLinkDescriptor> getCheck_3021IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<RmmLinkDescriptor> getRelationship_4002IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<RmmLinkDescriptor> getRelationship_4003IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<RmmLinkDescriptor> getTable_2004OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<RmmLinkDescriptor> getAssertion_2007OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<RmmLinkDescriptor> getDomain_2008OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<RmmLinkDescriptor> getPrimaryKey_3022OutgoingLinks(
			View view) {
		PrimaryKey modelElement = (PrimaryKey) view.getElement();
		LinkedList<RmmLinkDescriptor> result = new LinkedList<RmmLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_Relationship_4002(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_Relationship_4003(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<RmmLinkDescriptor> getUniqueKey_3023OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<RmmLinkDescriptor> getForeignKey_3024OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<RmmLinkDescriptor> getCheck_3025OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<RmmLinkDescriptor> getTrigger_3026OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<RmmLinkDescriptor> getAttribute_3006OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<RmmLinkDescriptor> getCheck_3021OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<RmmLinkDescriptor> getRelationship_4002OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<RmmLinkDescriptor> getRelationship_4003OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	private static Collection<RmmLinkDescriptor> getContainedTypeModelFacetLinks_Relationship_4002(
			PrimaryKey container) {
		LinkedList<RmmLinkDescriptor> result = new LinkedList<RmmLinkDescriptor>();
		for (Iterator<?> links = container.getRelationship().iterator(); links
				.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof Relationship) {
				continue;
			}
			Relationship link = (Relationship) linkObject;
			if (RelationshipEditPart.VISUAL_ID != RmmVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			ForeignKey dst = link.getTarget();
			PrimaryKey src = link.getSource();
			result.add(new RmmLinkDescriptor(src, dst, link,
					RmmElementTypes.Relationship_4002,
					RelationshipEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<RmmLinkDescriptor> getContainedTypeModelFacetLinks_Relationship_4003(
			ForeignKey container) {
		LinkedList<RmmLinkDescriptor> result = new LinkedList<RmmLinkDescriptor>();
		for (Iterator<?> links = container.getRelationship().iterator(); links
				.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof Relationship) {
				continue;
			}
			Relationship link = (Relationship) linkObject;
			if (Relationship2EditPart.VISUAL_ID != RmmVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			ForeignKey dst = link.getTarget();
			PrimaryKey src = link.getSource();
			result.add(new RmmLinkDescriptor(src, dst, link,
					RmmElementTypes.Relationship_4003,
					Relationship2EditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<RmmLinkDescriptor> getIncomingTypeModelFacetLinks_Relationship_4002(
			ForeignKey target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<RmmLinkDescriptor> result = new LinkedList<RmmLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences
				.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() != RmmPackage.eINSTANCE
					.getRelationship_Target()
					|| false == setting.getEObject() instanceof Relationship) {
				continue;
			}
			Relationship link = (Relationship) setting.getEObject();
			if (RelationshipEditPart.VISUAL_ID != RmmVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			PrimaryKey src = link.getSource();
			result.add(new RmmLinkDescriptor(src, target, link,
					RmmElementTypes.Relationship_4002,
					RelationshipEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<RmmLinkDescriptor> getIncomingTypeModelFacetLinks_Relationship_4003(
			ForeignKey target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<RmmLinkDescriptor> result = new LinkedList<RmmLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences
				.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() != RmmPackage.eINSTANCE
					.getRelationship_Target()
					|| false == setting.getEObject() instanceof Relationship) {
				continue;
			}
			Relationship link = (Relationship) setting.getEObject();
			if (Relationship2EditPart.VISUAL_ID != RmmVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			PrimaryKey src = link.getSource();
			result.add(new RmmLinkDescriptor(src, target, link,
					RmmElementTypes.Relationship_4003,
					Relationship2EditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<RmmLinkDescriptor> getOutgoingTypeModelFacetLinks_Relationship_4002(
			PrimaryKey source) {
		PrimaryKey container = null;
		// Find container element for the link.
		// Climb up by containment hierarchy starting from the source
		// and return the first element that is instance of the container class.
		for (EObject element = source; element != null && container == null; element = element
				.eContainer()) {
			if (element instanceof PrimaryKey) {
				container = (PrimaryKey) element;
			}
		}
		if (container == null) {
			return Collections.emptyList();
		}
		LinkedList<RmmLinkDescriptor> result = new LinkedList<RmmLinkDescriptor>();
		for (Iterator<?> links = container.getRelationship().iterator(); links
				.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof Relationship) {
				continue;
			}
			Relationship link = (Relationship) linkObject;
			if (RelationshipEditPart.VISUAL_ID != RmmVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			ForeignKey dst = link.getTarget();
			PrimaryKey src = link.getSource();
			if (src != source) {
				continue;
			}
			result.add(new RmmLinkDescriptor(src, dst, link,
					RmmElementTypes.Relationship_4002,
					RelationshipEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<RmmLinkDescriptor> getOutgoingTypeModelFacetLinks_Relationship_4003(
			PrimaryKey source) {
		ForeignKey container = null;
		// Find container element for the link.
		// Climb up by containment hierarchy starting from the source
		// and return the first element that is instance of the container class.
		for (EObject element = source; element != null && container == null; element = element
				.eContainer()) {
			if (element instanceof ForeignKey) {
				container = (ForeignKey) element;
			}
		}
		if (container == null) {
			return Collections.emptyList();
		}
		LinkedList<RmmLinkDescriptor> result = new LinkedList<RmmLinkDescriptor>();
		for (Iterator<?> links = container.getRelationship().iterator(); links
				.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof Relationship) {
				continue;
			}
			Relationship link = (Relationship) linkObject;
			if (Relationship2EditPart.VISUAL_ID != RmmVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			ForeignKey dst = link.getTarget();
			PrimaryKey src = link.getSource();
			if (src != source) {
				continue;
			}
			result.add(new RmmLinkDescriptor(src, dst, link,
					RmmElementTypes.Relationship_4003,
					Relationship2EditPart.VISUAL_ID));
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
		public List<RmmNodeDescriptor> getSemanticChildren(View view) {
			return RmmDiagramUpdater.getSemanticChildren(view);
		}

		/**
		 * @generated
		 */
		@Override
		public List<RmmLinkDescriptor> getContainedLinks(View view) {
			return RmmDiagramUpdater.getContainedLinks(view);
		}

		/**
		 * @generated
		 */
		@Override
		public List<RmmLinkDescriptor> getIncomingLinks(View view) {
			return RmmDiagramUpdater.getIncomingLinks(view);
		}

		/**
		 * @generated
		 */
		@Override
		public List<RmmLinkDescriptor> getOutgoingLinks(View view) {
			return RmmDiagramUpdater.getOutgoingLinks(view);
		}
	};

}
