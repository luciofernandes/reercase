/*
 * 
 */
package rmm.diagram.providers.assistants;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;

import rmm.diagram.providers.RmmElementTypes;
import rmm.diagram.providers.RmmModelingAssistantProvider;

/**
 * @generated
 */
public class RmmModelingAssistantProviderOfDomainEditPart extends
		RmmModelingAssistantProvider {

	/**
	 * @generated
	 */
	@Override
	public List<IElementType> getTypesForPopupBar(IAdaptable host) {
		List<IElementType> types = new ArrayList<IElementType>(1);
		types.add(RmmElementTypes.Check_3021);
		return types;
	}

}
