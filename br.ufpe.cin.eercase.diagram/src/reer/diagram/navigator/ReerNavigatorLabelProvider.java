/*
 * 
 */
package reer.diagram.navigator;

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

import reer.diagram.edit.parts.AnnotationEditPart;
import reer.diagram.edit.parts.AnnotationNameEditPart;
import reer.diagram.edit.parts.AttributeEditPart;
import reer.diagram.edit.parts.AttributeNameEditPart;
import reer.diagram.edit.parts.AttributeUniqueKeyEditPart;
import reer.diagram.edit.parts.AttributeUniqueKeyNameIdentityPositionEditPart;
import reer.diagram.edit.parts.RelationshipEditPart;
import reer.diagram.edit.parts.RelationshipNameEditPart;
import reer.diagram.edit.parts.SchemaEditPart;
import reer.diagram.edit.parts.TableEditPart;
import reer.diagram.edit.parts.TableNameEditPart;
import reer.diagram.part.ReerDiagramEditorPlugin;
import reer.diagram.part.ReerVisualIDRegistry;
import reer.diagram.providers.ReerElementTypes;
import reer.diagram.providers.ReerParserProvider;

/**
 * @generated
 */
public class ReerNavigatorLabelProvider extends LabelProvider implements
		ICommonLabelProvider, ITreePathLabelProvider {

	/**
	 * @generated
	 */
	static {
		ReerDiagramEditorPlugin
				.getInstance()
				.getImageRegistry()
				.put("Navigator?UnknownElement", ImageDescriptor.getMissingImageDescriptor()); //$NON-NLS-1$
		ReerDiagramEditorPlugin
				.getInstance()
				.getImageRegistry()
				.put("Navigator?ImageNotFound", ImageDescriptor.getMissingImageDescriptor()); //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	public void updateLabel(ViewerLabel label, TreePath elementPath) {
		Object element = elementPath.getLastSegment();
		if (element instanceof ReerNavigatorItem
				&& !isOwnView(((ReerNavigatorItem) element).getView())) {
			return;
		}
		label.setText(getText(element));
		label.setImage(getImage(element));
	}

	/**
	 * @generated
	 */
	public Image getImage(Object element) {
		if (element instanceof ReerNavigatorGroup) {
			ReerNavigatorGroup group = (ReerNavigatorGroup) element;
			return ReerDiagramEditorPlugin.getInstance().getBundledImage(
					group.getIcon());
		}

		if (element instanceof ReerNavigatorItem) {
			ReerNavigatorItem navigatorItem = (ReerNavigatorItem) element;
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
		switch (ReerVisualIDRegistry.getVisualID(view)) {
		case SchemaEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Diagram?reer?Schema", ReerElementTypes.Schema_1000); //$NON-NLS-1$
		case TableEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?reer?Table", ReerElementTypes.Table_2001); //$NON-NLS-1$
		case AttributeEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?reer?Attribute", ReerElementTypes.Attribute_3001); //$NON-NLS-1$
		case AttributeUniqueKeyEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?reer?AttributeUniqueKey", ReerElementTypes.AttributeUniqueKey_3002); //$NON-NLS-1$
		case AnnotationEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?reer?Annotation", ReerElementTypes.Annotation_3003); //$NON-NLS-1$
		case RelationshipEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?reer?Relationship", ReerElementTypes.Relationship_4001); //$NON-NLS-1$
		}
		return getImage("Navigator?UnknownElement", null); //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private Image getImage(String key, IElementType elementType) {
		ImageRegistry imageRegistry = ReerDiagramEditorPlugin.getInstance()
				.getImageRegistry();
		Image image = imageRegistry.get(key);
		if (image == null && elementType != null
				&& ReerElementTypes.isKnownElementType(elementType)) {
			image = ReerElementTypes.getImage(elementType);
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
		if (element instanceof ReerNavigatorGroup) {
			ReerNavigatorGroup group = (ReerNavigatorGroup) element;
			return group.getGroupName();
		}

		if (element instanceof ReerNavigatorItem) {
			ReerNavigatorItem navigatorItem = (ReerNavigatorItem) element;
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
		switch (ReerVisualIDRegistry.getVisualID(view)) {
		case SchemaEditPart.VISUAL_ID:
			return getSchema_1000Text(view);
		case TableEditPart.VISUAL_ID:
			return getTable_2001Text(view);
		case AttributeEditPart.VISUAL_ID:
			return getAttribute_3001Text(view);
		case AttributeUniqueKeyEditPart.VISUAL_ID:
			return getAttributeUniqueKey_3002Text(view);
		case AnnotationEditPart.VISUAL_ID:
			return getAnnotation_3003Text(view);
		case RelationshipEditPart.VISUAL_ID:
			return getRelationship_4001Text(view);
		}
		return getUnknownElementText(view);
	}

	/**
	 * @generated
	 */
	private String getSchema_1000Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getTable_2001Text(View view) {
		IParser parser = ReerParserProvider.getParser(
				ReerElementTypes.Table_2001,
				view.getElement() != null ? view.getElement() : view,
				ReerVisualIDRegistry.getType(TableNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			ReerDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5004); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getAttribute_3001Text(View view) {
		IParser parser = ReerParserProvider.getParser(
				ReerElementTypes.Attribute_3001,
				view.getElement() != null ? view.getElement() : view,
				ReerVisualIDRegistry.getType(AttributeNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			ReerDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5001); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getAttributeUniqueKey_3002Text(View view) {
		IParser parser = ReerParserProvider
				.getParser(
						ReerElementTypes.AttributeUniqueKey_3002,
						view.getElement() != null ? view.getElement() : view,
						ReerVisualIDRegistry
								.getType(AttributeUniqueKeyNameIdentityPositionEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			ReerDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5002); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getAnnotation_3003Text(View view) {
		IParser parser = ReerParserProvider.getParser(
				ReerElementTypes.Annotation_3003,
				view.getElement() != null ? view.getElement() : view,
				ReerVisualIDRegistry.getType(AnnotationNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			ReerDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5003); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getRelationship_4001Text(View view) {
		IParser parser = ReerParserProvider.getParser(
				ReerElementTypes.Relationship_4001,
				view.getElement() != null ? view.getElement() : view,
				ReerVisualIDRegistry
						.getType(RelationshipNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			ReerDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 6001); //$NON-NLS-1$
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
		return SchemaEditPart.MODEL_ID.equals(ReerVisualIDRegistry
				.getModelID(view));
	}

}
