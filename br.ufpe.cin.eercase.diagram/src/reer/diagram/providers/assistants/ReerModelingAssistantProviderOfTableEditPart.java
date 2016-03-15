/*
 * 
 */
package reer.diagram.providers.assistants;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;

import reer.diagram.providers.ReerElementTypes;
import reer.diagram.providers.ReerModelingAssistantProvider;

/**
 * @generated
 */
public class ReerModelingAssistantProviderOfTableEditPart extends
		ReerModelingAssistantProvider {

	/**
	 * @generated
	 */
	@Override
	public List<IElementType> getTypesForPopupBar(IAdaptable host) {
		List<IElementType> types = new ArrayList<IElementType>(3);
		types.add(ReerElementTypes.Attribute_3001);
		types.add(ReerElementTypes.AttributeUniqueKey_3002);
		types.add(ReerElementTypes.Annotation_3003);
		return types;
	}

}
