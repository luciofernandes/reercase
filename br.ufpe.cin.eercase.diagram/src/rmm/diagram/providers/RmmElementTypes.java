/*
 * 
 */
package rmm.diagram.providers;

import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.Map;
import java.util.Set;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.emf.ecore.ENamedElement;
import org.eclipse.gmf.runtime.emf.type.core.ElementTypeRegistry;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.tooling.runtime.providers.DiagramElementTypeImages;
import org.eclipse.gmf.tooling.runtime.providers.DiagramElementTypes;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.swt.graphics.Image;

import rmm.RmmPackage;
import rmm.diagram.edit.parts.AssertionEditPart;
import rmm.diagram.edit.parts.AttributeEditPart;
import rmm.diagram.edit.parts.Check2EditPart;
import rmm.diagram.edit.parts.CheckEditPart;
import rmm.diagram.edit.parts.DomainEditPart;
import rmm.diagram.edit.parts.ForeignKeyEditPart;
import rmm.diagram.edit.parts.PrimaryKeyEditPart;
import rmm.diagram.edit.parts.Relationship2EditPart;
import rmm.diagram.edit.parts.RelationshipEditPart;
import rmm.diagram.edit.parts.SchemaEditPart;
import rmm.diagram.edit.parts.TableEditPart;
import rmm.diagram.edit.parts.TriggerEditPart;
import rmm.diagram.edit.parts.UniqueKeyEditPart;
import rmm.diagram.part.RmmDiagramEditorPlugin;

/**
 * @generated
 */
public class RmmElementTypes {

	/**
	 * @generated
	 */
	private RmmElementTypes() {
	}

	/**
	 * @generated
	 */
	private static Map<IElementType, ENamedElement> elements;

	/**
	 * @generated
	 */
	private static DiagramElementTypeImages elementTypeImages = new DiagramElementTypeImages(
			RmmDiagramEditorPlugin.getInstance()
					.getItemProvidersAdapterFactory());

	/**
	 * @generated
	 */
	private static Set<IElementType> KNOWN_ELEMENT_TYPES;

	/**
	 * @generated
	 */
	public static final IElementType Schema_1000 = getElementType("br.ufpe.cin.eercase.diagram.Schema_1000"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Table_2004 = getElementType("br.ufpe.cin.eercase.diagram.Table_2004"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Assertion_2007 = getElementType("br.ufpe.cin.eercase.diagram.Assertion_2007"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Domain_2008 = getElementType("br.ufpe.cin.eercase.diagram.Domain_2008"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType PrimaryKey_3022 = getElementType("br.ufpe.cin.eercase.diagram.PrimaryKey_3022"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType UniqueKey_3023 = getElementType("br.ufpe.cin.eercase.diagram.UniqueKey_3023"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType ForeignKey_3024 = getElementType("br.ufpe.cin.eercase.diagram.ForeignKey_3024"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Check_3025 = getElementType("br.ufpe.cin.eercase.diagram.Check_3025"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Trigger_3026 = getElementType("br.ufpe.cin.eercase.diagram.Trigger_3026"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Attribute_3006 = getElementType("br.ufpe.cin.eercase.diagram.Attribute_3006"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Check_3021 = getElementType("br.ufpe.cin.eercase.diagram.Check_3021"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Relationship_4002 = getElementType("br.ufpe.cin.eercase.diagram.Relationship_4002"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Relationship_4003 = getElementType("br.ufpe.cin.eercase.diagram.Relationship_4003"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static ImageDescriptor getImageDescriptor(ENamedElement element) {
		return elementTypeImages.getImageDescriptor(element);
	}

	/**
	 * @generated
	 */
	public static Image getImage(ENamedElement element) {
		return elementTypeImages.getImage(element);
	}

	/**
	 * @generated
	 */
	public static ImageDescriptor getImageDescriptor(IAdaptable hint) {
		return getImageDescriptor(getElement(hint));
	}

	/**
	 * @generated
	 */
	public static Image getImage(IAdaptable hint) {
		return getImage(getElement(hint));
	}

	/**
	 * Returns 'type' of the ecore object associated with the hint.
	 * 
	 * @generated
	 */
	public static ENamedElement getElement(IAdaptable hint) {
		Object type = hint.getAdapter(IElementType.class);
		if (elements == null) {
			elements = new IdentityHashMap<IElementType, ENamedElement>();

			elements.put(Schema_1000, RmmPackage.eINSTANCE.getSchema());

			elements.put(Table_2004, RmmPackage.eINSTANCE.getTable());

			elements.put(Assertion_2007, RmmPackage.eINSTANCE.getAssertion());

			elements.put(Domain_2008, RmmPackage.eINSTANCE.getDomain());

			elements.put(PrimaryKey_3022, RmmPackage.eINSTANCE.getPrimaryKey());

			elements.put(UniqueKey_3023, RmmPackage.eINSTANCE.getUniqueKey());

			elements.put(ForeignKey_3024, RmmPackage.eINSTANCE.getForeignKey());

			elements.put(Check_3025, RmmPackage.eINSTANCE.getCheck());

			elements.put(Trigger_3026, RmmPackage.eINSTANCE.getTrigger());

			elements.put(Attribute_3006, RmmPackage.eINSTANCE.getAttribute());

			elements.put(Check_3021, RmmPackage.eINSTANCE.getCheck());

			elements.put(Relationship_4002,
					RmmPackage.eINSTANCE.getRelationship());

			elements.put(Relationship_4003,
					RmmPackage.eINSTANCE.getRelationship());
		}
		return (ENamedElement) elements.get(type);
	}

	/**
	 * @generated
	 */
	private static IElementType getElementType(String id) {
		return ElementTypeRegistry.getInstance().getType(id);
	}

	/**
	 * @generated
	 */
	public static boolean isKnownElementType(IElementType elementType) {
		if (KNOWN_ELEMENT_TYPES == null) {
			KNOWN_ELEMENT_TYPES = new HashSet<IElementType>();
			KNOWN_ELEMENT_TYPES.add(Schema_1000);
			KNOWN_ELEMENT_TYPES.add(Table_2004);
			KNOWN_ELEMENT_TYPES.add(Assertion_2007);
			KNOWN_ELEMENT_TYPES.add(Domain_2008);
			KNOWN_ELEMENT_TYPES.add(PrimaryKey_3022);
			KNOWN_ELEMENT_TYPES.add(UniqueKey_3023);
			KNOWN_ELEMENT_TYPES.add(ForeignKey_3024);
			KNOWN_ELEMENT_TYPES.add(Check_3025);
			KNOWN_ELEMENT_TYPES.add(Trigger_3026);
			KNOWN_ELEMENT_TYPES.add(Attribute_3006);
			KNOWN_ELEMENT_TYPES.add(Check_3021);
			KNOWN_ELEMENT_TYPES.add(Relationship_4002);
			KNOWN_ELEMENT_TYPES.add(Relationship_4003);
		}
		return KNOWN_ELEMENT_TYPES.contains(elementType);
	}

	/**
	 * @generated
	 */
	public static IElementType getElementType(int visualID) {
		switch (visualID) {
		case SchemaEditPart.VISUAL_ID:
			return Schema_1000;
		case TableEditPart.VISUAL_ID:
			return Table_2004;
		case AssertionEditPart.VISUAL_ID:
			return Assertion_2007;
		case DomainEditPart.VISUAL_ID:
			return Domain_2008;
		case PrimaryKeyEditPart.VISUAL_ID:
			return PrimaryKey_3022;
		case UniqueKeyEditPart.VISUAL_ID:
			return UniqueKey_3023;
		case ForeignKeyEditPart.VISUAL_ID:
			return ForeignKey_3024;
		case CheckEditPart.VISUAL_ID:
			return Check_3025;
		case TriggerEditPart.VISUAL_ID:
			return Trigger_3026;
		case AttributeEditPart.VISUAL_ID:
			return Attribute_3006;
		case Check2EditPart.VISUAL_ID:
			return Check_3021;
		case RelationshipEditPart.VISUAL_ID:
			return Relationship_4002;
		case Relationship2EditPart.VISUAL_ID:
			return Relationship_4003;
		}
		return null;
	}

	/**
	 * @generated
	 */
	public static final DiagramElementTypes TYPED_INSTANCE = new DiagramElementTypes(
			elementTypeImages) {

		/**
		 * @generated
		 */
		@Override
		public boolean isKnownElementType(IElementType elementType) {
			return rmm.diagram.providers.RmmElementTypes
					.isKnownElementType(elementType);
		}

		/**
		 * @generated
		 */
		@Override
		public IElementType getElementTypeForVisualId(int visualID) {
			return rmm.diagram.providers.RmmElementTypes
					.getElementType(visualID);
		}

		/**
		 * @generated
		 */
		@Override
		public ENamedElement getDefiningNamedElement(
				IAdaptable elementTypeAdapter) {
			return rmm.diagram.providers.RmmElementTypes
					.getElement(elementTypeAdapter);
		}
	};

}
