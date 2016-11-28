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
public class RmmModelingAssistantProviderOfTableEditPart extends
		RmmModelingAssistantProvider {

	/**
	 * @generated
	 */
	@Override
	public List<IElementType> getTypesForPopupBar(IAdaptable host) {
		List<IElementType> types = new ArrayList<IElementType>(6);
		types.add(RmmElementTypes.Attribute_3006);
		types.add(RmmElementTypes.PrimaryKey_3022);
		types.add(RmmElementTypes.AlternateKey_3027);
		types.add(RmmElementTypes.ForeignKey_3024);
		types.add(RmmElementTypes.Check_3025);
		types.add(RmmElementTypes.Trigger_3026);
		return types;
	}

}
