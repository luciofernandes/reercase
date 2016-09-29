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
public class RmmModelingAssistantProviderOfSchemaEditPart extends
		RmmModelingAssistantProvider {

	/**
	 * @generated
	 */
	@Override
	public List<IElementType> getTypesForPopupBar(IAdaptable host) {
		List<IElementType> types = new ArrayList<IElementType>(3);
		types.add(RmmElementTypes.Table_2004);
		types.add(RmmElementTypes.Assertion_2007);
		types.add(RmmElementTypes.Domain_2008);
		return types;
	}

}
