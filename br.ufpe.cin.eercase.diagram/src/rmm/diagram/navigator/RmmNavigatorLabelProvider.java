/*
 * 
 */
package rmm.diagram.navigator;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.gmf.runtime.common.ui.services.parser.IParser;
import org.eclipse.gmf.runtime.common.ui.services.parser.ParserOptions;
import org.eclipse.gmf.runtime.emf.core.util.EObjectAdapter;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.resource.ImageRegistry;
import org.eclipse.jface.viewers.ITreePathLabelProvider;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.jface.viewers.TreePath;
import org.eclipse.jface.viewers.ViewerLabel;
import org.eclipse.swt.graphics.Image;
import org.eclipse.ui.IMemento;
import org.eclipse.ui.navigator.ICommonContentExtensionSite;
import org.eclipse.ui.navigator.ICommonLabelProvider;

import rmm.Relationship;
import rmm.Schema;
import rmm.diagram.edit.parts.AlternateKeyEditPart;
import rmm.diagram.edit.parts.AlternateKeyIDNameEditPart;
import rmm.diagram.edit.parts.AssertionEditPart;
import rmm.diagram.edit.parts.AssertionNameEditPart;
import rmm.diagram.edit.parts.AttributeEditPart;
import rmm.diagram.edit.parts.AttributeNameDataTypeEditPart;
import rmm.diagram.edit.parts.Check2EditPart;
import rmm.diagram.edit.parts.CheckEditPart;
import rmm.diagram.edit.parts.CheckIDName2EditPart;
import rmm.diagram.edit.parts.CheckIDNameEditPart;
import rmm.diagram.edit.parts.DomainEditPart;
import rmm.diagram.edit.parts.DomainNameEditPart;
import rmm.diagram.edit.parts.ForeignKeyEditPart;
import rmm.diagram.edit.parts.ForeignKeyIDNameEditPart;
import rmm.diagram.edit.parts.PrimaryKeyEditPart;
import rmm.diagram.edit.parts.PrimaryKeyIDNameEditPart;
import rmm.diagram.edit.parts.RelationshipEditPart;
import rmm.diagram.edit.parts.RelationshipNameEditPart;
import rmm.diagram.edit.parts.RelationshipNameUpdateDeleteEditPart;
import rmm.diagram.edit.parts.SchemaEditPart;
import rmm.diagram.edit.parts.TableEditPart;
import rmm.diagram.edit.parts.TableNameEditPart;
import rmm.diagram.edit.parts.TriggerEditPart;
import rmm.diagram.edit.parts.TriggerIDNameEditPart;
import rmm.diagram.part.RmmDiagramEditorPlugin;
import rmm.diagram.part.RmmVisualIDRegistry;
import rmm.diagram.providers.RmmElementTypes;
import rmm.diagram.providers.RmmParserProvider;

/**
 * @generated
 */
public class RmmNavigatorLabelProvider extends LabelProvider implements
		ICommonLabelProvider, ITreePathLabelProvider {

	/**
	 * @generated
	 */
	static {
		RmmDiagramEditorPlugin
				.getInstance()
				.getImageRegistry()
				.put("Navigator?UnknownElement", ImageDescriptor.getMissingImageDescriptor()); //$NON-NLS-1$
		RmmDiagramEditorPlugin
				.getInstance()
				.getImageRegistry()
				.put("Navigator?ImageNotFound", ImageDescriptor.getMissingImageDescriptor()); //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	public void updateLabel(ViewerLabel label, TreePath elementPath) {
		Object element = elementPath.getLastSegment();
		if (element instanceof RmmNavigatorItem
				&& !isOwnView(((RmmNavigatorItem) element).getView())) {
			return;
		}
		label.setText(getText(element));
		label.setImage(getImage(element));
	}

	/**
	 * @generated
	 */
	public Image getImage(Object element) {
		if (element instanceof RmmNavigatorGroup) {
			RmmNavigatorGroup group = (RmmNavigatorGroup) element;
			return RmmDiagramEditorPlugin.getInstance().getBundledImage(
					group.getIcon());
		}

		if (element instanceof RmmNavigatorItem) {
			RmmNavigatorItem navigatorItem = (RmmNavigatorItem) element;
			if (!isOwnView(navigatorItem.getView())) {
				return super.getImage(element);
			}
			return getImage(navigatorItem.getView());
		}

		// Due to plugin.xml content will be called only for "own" views
		if (element instanceof IAdaptable) {
			View view = (View) ((IAdaptable) element).getAdapter(View.class);
			if (view != null && isOwnView(view)) {
				return getImage(view);
			}
		}

		return super.getImage(element);
	}

	/**
	 * @generated
	 */
	public Image getImage(View view) {
		switch (RmmVisualIDRegistry.getVisualID(view)) {
		case SchemaEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Diagram?rmm?Schema", RmmElementTypes.Schema_1000); //$NON-NLS-1$
		case TableEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?rmm?Table", RmmElementTypes.Table_2004); //$NON-NLS-1$
		case AssertionEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?rmm?Assertion", RmmElementTypes.Assertion_2007); //$NON-NLS-1$
		case DomainEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?rmm?Domain", RmmElementTypes.Domain_2008); //$NON-NLS-1$
		case AttributeEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?rmm?Attribute", RmmElementTypes.Attribute_3006); //$NON-NLS-1$
		case Check2EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?rmm?Check", RmmElementTypes.Check_3021); //$NON-NLS-1$
		case PrimaryKeyEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?rmm?PrimaryKey", RmmElementTypes.PrimaryKey_3022); //$NON-NLS-1$
		case ForeignKeyEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?rmm?ForeignKey", RmmElementTypes.ForeignKey_3024); //$NON-NLS-1$
		case CheckEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?rmm?Check", RmmElementTypes.Check_3025); //$NON-NLS-1$
		case TriggerEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?rmm?Trigger", RmmElementTypes.Trigger_3026); //$NON-NLS-1$
		case AlternateKeyEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?rmm?AlternateKey", RmmElementTypes.AlternateKey_3027); //$NON-NLS-1$
		case RelationshipEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?rmm?Relationship", RmmElementTypes.Relationship_4002); //$NON-NLS-1$
		}
		return getImage("Navigator?UnknownElement", null); //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private Image getImage(String key, IElementType elementType) {
		ImageRegistry imageRegistry = RmmDiagramEditorPlugin.getInstance()
				.getImageRegistry();
		Image image = imageRegistry.get(key);
		if (image == null && elementType != null
				&& RmmElementTypes.isKnownElementType(elementType)) {
			image = RmmElementTypes.getImage(elementType);
			imageRegistry.put(key, image);
		}

		if (image == null) {
			image = imageRegistry.get("Navigator?ImageNotFound"); //$NON-NLS-1$
			imageRegistry.put(key, image);
		}
		return image;
	}

	/**
	 * @generated
	 */
	public String getText(Object element) {
		if (element instanceof RmmNavigatorGroup) {
			RmmNavigatorGroup group = (RmmNavigatorGroup) element;
			return group.getGroupName();
		}

		if (element instanceof RmmNavigatorItem) {
			RmmNavigatorItem navigatorItem = (RmmNavigatorItem) element;
			if (!isOwnView(navigatorItem.getView())) {
				return null;
			}
			return getText(navigatorItem.getView());
		}

		// Due to plugin.xml content will be called only for "own" views
		if (element instanceof IAdaptable) {
			View view = (View) ((IAdaptable) element).getAdapter(View.class);
			if (view != null && isOwnView(view)) {
				return getText(view);
			}
		}

		return super.getText(element);
	}

	/**
	 * @generated
	 */
	public String getText(View view) {
		if (view.getElement() != null && view.getElement().eIsProxy()) {
			return getUnresolvedDomainElementProxyText(view);
		}
		switch (RmmVisualIDRegistry.getVisualID(view)) {
		case SchemaEditPart.VISUAL_ID:
			return getSchema_1000Text(view);
		case TableEditPart.VISUAL_ID:
			return getTable_2004Text(view);
		case AssertionEditPart.VISUAL_ID:
			return getAssertion_2007Text(view);
		case DomainEditPart.VISUAL_ID:
			return getDomain_2008Text(view);
		case AttributeEditPart.VISUAL_ID:
			return getAttribute_3006Text(view);
		case Check2EditPart.VISUAL_ID:
			return getCheck_3021Text(view);
		case PrimaryKeyEditPart.VISUAL_ID:
			return getPrimaryKey_3022Text(view);
		case ForeignKeyEditPart.VISUAL_ID:
			return getForeignKey_3024Text(view);
		case CheckEditPart.VISUAL_ID:
			return getCheck_3025Text(view);
		case TriggerEditPart.VISUAL_ID:
			return getTrigger_3026Text(view);
		case AlternateKeyEditPart.VISUAL_ID:
			return getAlternateKey_3027Text(view);
		case RelationshipEditPart.VISUAL_ID:
			return getRelationship_4002Text(view);
		}
		return getUnknownElementText(view);
	}

	/**
	 * @generated
	 */
	private String getSchema_1000Text(View view) {
		Schema domainModelElement = (Schema) view.getElement();
		if (domainModelElement != null) {
			return domainModelElement.getName();
		} else {
			RmmDiagramEditorPlugin.getInstance().logError(
					"No domain element for view with visualID = " + 1000); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getTable_2004Text(View view) {
		IParser parser = RmmParserProvider.getParser(
				RmmElementTypes.Table_2004,
				view.getElement() != null ? view.getElement() : view,
				RmmVisualIDRegistry.getType(TableNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			RmmDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5012); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getAssertion_2007Text(View view) {
		IParser parser = RmmParserProvider.getParser(
				RmmElementTypes.Assertion_2007,
				view.getElement() != null ? view.getElement() : view,
				RmmVisualIDRegistry.getType(AssertionNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			RmmDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5018); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getDomain_2008Text(View view) {
		IParser parser = RmmParserProvider.getParser(
				RmmElementTypes.Domain_2008,
				view.getElement() != null ? view.getElement() : view,
				RmmVisualIDRegistry.getType(DomainNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			RmmDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5019); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getAttribute_3006Text(View view) {
		IParser parser = RmmParserProvider.getParser(
				RmmElementTypes.Attribute_3006,
				view.getElement() != null ? view.getElement() : view,
				RmmVisualIDRegistry
						.getType(AttributeNameDataTypeEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			RmmDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5009); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getCheck_3021Text(View view) {
		IParser parser = RmmParserProvider.getParser(
				RmmElementTypes.Check_3021,
				view.getElement() != null ? view.getElement() : view,
				RmmVisualIDRegistry.getType(CheckIDName2EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			RmmDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5029); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getPrimaryKey_3022Text(View view) {
		IParser parser = RmmParserProvider
				.getParser(RmmElementTypes.PrimaryKey_3022,
						view.getElement() != null ? view.getElement() : view,
						RmmVisualIDRegistry
								.getType(PrimaryKeyIDNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			RmmDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5030); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getForeignKey_3024Text(View view) {
		IParser parser = RmmParserProvider
				.getParser(RmmElementTypes.ForeignKey_3024,
						view.getElement() != null ? view.getElement() : view,
						RmmVisualIDRegistry
								.getType(ForeignKeyIDNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			RmmDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5032); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getCheck_3025Text(View view) {
		IParser parser = RmmParserProvider.getParser(
				RmmElementTypes.Check_3025,
				view.getElement() != null ? view.getElement() : view,
				RmmVisualIDRegistry.getType(CheckIDNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			RmmDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5033); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getTrigger_3026Text(View view) {
		IParser parser = RmmParserProvider.getParser(
				RmmElementTypes.Trigger_3026,
				view.getElement() != null ? view.getElement() : view,
				RmmVisualIDRegistry.getType(TriggerIDNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			RmmDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5034); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getAlternateKey_3027Text(View view) {
		IParser parser = RmmParserProvider.getParser(
				RmmElementTypes.AlternateKey_3027,
				view.getElement() != null ? view.getElement() : view,
				RmmVisualIDRegistry
						.getType(AlternateKeyIDNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			RmmDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5035); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getRelationship_4002Text(View view) {
		IParser parser = RmmParserProvider
				.getParser(
						RmmElementTypes.Relationship_4002,
						view.getElement() != null ? view.getElement() : view,
						RmmVisualIDRegistry
								.getType(RelationshipNameUpdateDeleteEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			RmmDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 6006); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getUnknownElementText(View view) {
		return "<UnknownElement Visual_ID = " + view.getType() + ">"; //$NON-NLS-1$  //$NON-NLS-2$
	}

	/**
	 * @generated
	 */
	private String getUnresolvedDomainElementProxyText(View view) {
		return "<Unresolved domain element Visual_ID = " + view.getType() + ">"; //$NON-NLS-1$  //$NON-NLS-2$
	}

	/**
	 * @generated
	 */
	public void init(ICommonContentExtensionSite aConfig) {
	}

	/**
	 * @generated
	 */
	public void restoreState(IMemento aMemento) {
	}

	/**
	 * @generated
	 */
	public void saveState(IMemento aMemento) {
	}

	/**
	 * @generated
	 */
	public String getDescription(Object anElement) {
		return null;
	}

	/**
	 * @generated
	 */
	private boolean isOwnView(View view) {
		return SchemaEditPart.MODEL_ID.equals(RmmVisualIDRegistry
				.getModelID(view));
	}

}
