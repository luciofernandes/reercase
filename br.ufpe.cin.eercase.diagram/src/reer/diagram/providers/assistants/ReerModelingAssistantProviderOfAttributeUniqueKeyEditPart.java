/*
 * 
 */
package reer.diagram.providers.assistants;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;

import reer.diagram.edit.parts.AttributeEditPart;
import reer.diagram.edit.parts.AttributeUniqueKeyEditPart;
import reer.diagram.providers.ReerElementTypes;
import reer.diagram.providers.ReerModelingAssistantProvider;

/**
 * @generated
 */
public class ReerModelingAssistantProviderOfAttributeUniqueKeyEditPart extends
		ReerModelingAssistantProvider {

	/**
	 * @generated
	 */
	@Override
	public List<IElementType> getRelTypesOnSource(IAdaptable source) {
		IGraphicalEditPart sourceEditPart = (IGraphicalEditPart) source
				.getAdapter(IGraphicalEditPart.class);
		return doGetRelTypesOnSource((AttributeUniqueKeyEditPart) sourceEditPart);
	}

	/**
	 * @generated
	 */
	public List<IElementType> doGetRelTypesOnSource(
			AttributeUniqueKeyEditPart source) {
		List<IElementType> types = new ArrayList<IElementType>(1);
		types.add(ReerElementTypes.Relationship_4001);
		return types;
	}

	/**
	 * @generated
	 */
	@Override
	public List<IElementType> getRelTypesOnSourceAndTarget(IAdaptable source,
			IAdaptable target) {
		IGraphicalEditPart sourceEditPart = (IGraphicalEditPart) source
				.getAdapter(IGraphicalEditPart.class);
		IGraphicalEditPart targetEditPart = (IGraphicalEditPart) target
				.getAdapter(IGraphicalEditPart.class);
		return doGetRelTypesOnSourceAndTarget(
				(AttributeUniqueKeyEditPart) sourceEditPart, targetEditPart);
	}

	/**
	 * @generated
	 */
	public List<IElementType> doGetRelTypesOnSourceAndTarget(
			AttributeUniqueKeyEditPart source, IGraphicalEditPart targetEditPart) {
		List<IElementType> types = new LinkedList<IElementType>();
		if (targetEditPart instanceof AttributeEditPart) {
			types.add(ReerElementTypes.Relationship_4001);
		}
		if (targetEditPart instanceof AttributeUniqueKeyEditPart) {
			types.add(ReerElementTypes.Relationship_4001);
		}
		return types;
	}

	/**
	 * @generated
	 */
	@Override
	public List<IElementType> getTypesForTarget(IAdaptable source,
			IElementType relationshipType) {
		IGraphicalEditPart sourceEditPart = (IGraphicalEditPart) source
				.getAdapter(IGraphicalEditPart.class);
		return doGetTypesForTarget((AttributeUniqueKeyEditPart) sourceEditPart,
				relationshipType);
	}

	/**
	 * @generated
	 */
	public List<IElementType> doGetTypesForTarget(
			AttributeUniqueKeyEditPart source, IElementType relationshipType) {
		List<IElementType> types = new ArrayList<IElementType>();
		if (relationshipType == ReerElementTypes.Relationship_4001) {
			types.add(ReerElementTypes.Attribute_3001);
			types.add(ReerElementTypes.AttributeUniqueKey_3002);
		}
		return types;
	}

	/**
	 * @generated
	 */
	@Override
	public List<IElementType> getRelTypesOnTarget(IAdaptable target) {
		IGraphicalEditPart targetEditPart = (IGraphicalEditPart) target
				.getAdapter(IGraphicalEditPart.class);
		return doGetRelTypesOnTarget((AttributeUniqueKeyEditPart) targetEditPart);
	}

	/**
	 * @generated
	 */
	public List<IElementType> doGetRelTypesOnTarget(
			AttributeUniqueKeyEditPart target) {
		List<IElementType> types = new ArrayList<IElementType>(1);
		types.add(ReerElementTypes.Relationship_4001);
		return types;
	}

	/**
	 * @generated
	 */
	@Override
	public List<IElementType> getTypesForSource(IAdaptable target,
			IElementType relationshipType) {
		IGraphicalEditPart targetEditPart = (IGraphicalEditPart) target
				.getAdapter(IGraphicalEditPart.class);
		return doGetTypesForSource((AttributeUniqueKeyEditPart) targetEditPart,
				relationshipType);
	}

	/**
	 * @generated
	 */
	public List<IElementType> doGetTypesForSource(
			AttributeUniqueKeyEditPart target, IElementType relationshipType) {
		List<IElementType> types = new ArrayList<IElementType>();
		if (relationshipType == ReerElementTypes.Relationship_4001) {
			types.add(ReerElementTypes.Attribute_3001);
			types.add(ReerElementTypes.AttributeUniqueKey_3002);
		}
		return types;
	}

}
