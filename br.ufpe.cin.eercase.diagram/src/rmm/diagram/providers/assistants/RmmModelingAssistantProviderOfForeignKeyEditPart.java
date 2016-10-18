/*
 * 
 */
package rmm.diagram.providers.assistants;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;

import rmm.diagram.edit.parts.ForeignKeyEditPart;
import rmm.diagram.providers.RmmElementTypes;
import rmm.diagram.providers.RmmModelingAssistantProvider;

/**
 * @generated
 */
public class RmmModelingAssistantProviderOfForeignKeyEditPart extends
		RmmModelingAssistantProvider {

	/**
	 * @generated
	 */
	@Override
	public List<IElementType> getRelTypesOnTarget(IAdaptable target) {
		IGraphicalEditPart targetEditPart = (IGraphicalEditPart) target
				.getAdapter(IGraphicalEditPart.class);
		return doGetRelTypesOnTarget((ForeignKeyEditPart) targetEditPart);
	}

	/**
	 * @generated
	 */
	public List<IElementType> doGetRelTypesOnTarget(ForeignKeyEditPart target) {
		List<IElementType> types = new ArrayList<IElementType>(1);
		types.add(RmmElementTypes.Relationship_4002);
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
		return doGetTypesForSource((ForeignKeyEditPart) targetEditPart,
				relationshipType);
	}

	/**
	 * @generated
	 */
	public List<IElementType> doGetTypesForSource(ForeignKeyEditPart target,
			IElementType relationshipType) {
		List<IElementType> types = new ArrayList<IElementType>();
		if (relationshipType == RmmElementTypes.Relationship_4002) {
			types.add(RmmElementTypes.PrimaryKey_3022);
		}
		return types;
	}

}
