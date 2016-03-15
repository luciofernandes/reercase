/*
 * 
 */
package reer.diagram.providers;

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

import reer.ReerPackage;
import reer.diagram.edit.parts.AnnotationEditPart;
import reer.diagram.edit.parts.AttributeEditPart;
import reer.diagram.edit.parts.AttributeUniqueKeyEditPart;
import reer.diagram.edit.parts.RelationshipEditPart;
import reer.diagram.edit.parts.SchemaEditPart;
import reer.diagram.edit.parts.TableEditPart;
import reer.diagram.part.ReerDiagramEditorPlugin;

/**
 * @generated
 */
public class ReerElementTypes {

	/**
	 * @generated
	 */
	private ReerElementTypes() {
	}

	/**
	 * @generated
	 */
	private static Map<IElementType, ENamedElement> elements;

	/**
	 * @generated
	 */
	private static DiagramElementTypeImages elementTypeImages = new DiagramElementTypeImages(
			ReerDiagramEditorPlugin.getInstance()
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
	public static final IElementType Table_2001 = getElementType("br.ufpe.cin.eercase.diagram.Table_2001"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Attribute_3001 = getElementType("br.ufpe.cin.eercase.diagram.Attribute_3001"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType AttributeUniqueKey_3002 = getElementType("br.ufpe.cin.eercase.diagram.AttributeUniqueKey_3002"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Annotation_3003 = getElementType("br.ufpe.cin.eercase.diagram.Annotation_3003"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Relationship_4001 = getElementType("br.ufpe.cin.eercase.diagram.Relationship_4001"); //$NON-NLS-1$

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

			elements.put(Schema_1000, ReerPackage.eINSTANCE.getSchema());

			elements.put(Table_2001, ReerPackage.eINSTANCE.getTable());

			elements.put(Attribute_3001, ReerPackage.eINSTANCE.getAttribute());

			elements.put(AttributeUniqueKey_3002,
					ReerPackage.eINSTANCE.getAttributeUniqueKey());

			elements.put(Annotation_3003, ReerPackage.eINSTANCE.getAnnotation());

			elements.put(Relationship_4001,
					ReerPackage.eINSTANCE.getRelationship());
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
			KNOWN_ELEMENT_TYPES.add(Table_2001);
			KNOWN_ELEMENT_TYPES.add(Attribute_3001);
			KNOWN_ELEMENT_TYPES.add(AttributeUniqueKey_3002);
			KNOWN_ELEMENT_TYPES.add(Annotation_3003);
			KNOWN_ELEMENT_TYPES.add(Relationship_4001);
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
			return Table_2001;
		case AttributeEditPart.VISUAL_ID:
			return Attribute_3001;
		case AttributeUniqueKeyEditPart.VISUAL_ID:
			return AttributeUniqueKey_3002;
		case AnnotationEditPart.VISUAL_ID:
			return Annotation_3003;
		case RelationshipEditPart.VISUAL_ID:
			return Relationship_4001;
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
			return reer.diagram.providers.ReerElementTypes
					.isKnownElementType(elementType);
		}

		/**
		 * @generated
		 */
		@Override
		public IElementType getElementTypeForVisualId(int visualID) {
			return reer.diagram.providers.ReerElementTypes
					.getElementType(visualID);
		}

		/**
		 * @generated
		 */
		@Override
		public ENamedElement getDefiningNamedElement(
				IAdaptable elementTypeAdapter) {
			return reer.diagram.providers.ReerElementTypes
					.getElement(elementTypeAdapter);
		}
	};

}
