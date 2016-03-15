/*
 * 
 */
package reer.diagram.part;

import java.util.Collections;

import org.eclipse.gef.palette.PaletteContainer;
import org.eclipse.gef.palette.PaletteDrawer;
import org.eclipse.gef.palette.PaletteRoot;
import org.eclipse.gef.palette.ToolEntry;
import org.eclipse.gmf.tooling.runtime.part.DefaultLinkToolEntry;
import org.eclipse.gmf.tooling.runtime.part.DefaultNodeToolEntry;

import reer.diagram.providers.ReerElementTypes;

/**
 * @generated
 */
public class ReerPaletteFactory {

	/**
	 * @generated
	 */
	public void fillPalette(PaletteRoot paletteRoot) {
		paletteRoot.add(createObjects1Group());
		paletteRoot.add(createConnections2Group());
	}

	/**
	 * Creates "Objects" palette tool group
	 * @generated
	 */
	private PaletteContainer createObjects1Group() {
		PaletteDrawer paletteContainer = new PaletteDrawer(
				Messages.Objects1Group_title);
		paletteContainer.setId("createObjects1Group"); //$NON-NLS-1$
		paletteContainer.add(createAnnotation1CreationTool());
		paletteContainer.add(createAttribute2CreationTool());
		paletteContainer.add(createAttributeUniqueKey3CreationTool());
		paletteContainer.add(createTable4CreationTool());
		return paletteContainer;
	}

	/**
	 * Creates "Connections" palette tool group
	 * @generated
	 */
	private PaletteContainer createConnections2Group() {
		PaletteDrawer paletteContainer = new PaletteDrawer(
				Messages.Connections2Group_title);
		paletteContainer.setId("createConnections2Group"); //$NON-NLS-1$
		paletteContainer.add(createRelationship1CreationTool());
		return paletteContainer;
	}

	/**
	 * @generated
	 */
	private ToolEntry createAnnotation1CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(
				Messages.Annotation1CreationTool_title,
				Messages.Annotation1CreationTool_desc,
				Collections.singletonList(ReerElementTypes.Annotation_3003));
		entry.setId("createAnnotation1CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(ReerElementTypes
				.getImageDescriptor(ReerElementTypes.Annotation_3003));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createAttribute2CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(
				Messages.Attribute2CreationTool_title,
				Messages.Attribute2CreationTool_desc,
				Collections.singletonList(ReerElementTypes.Attribute_3001));
		entry.setId("createAttribute2CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(ReerElementTypes
				.getImageDescriptor(ReerElementTypes.Attribute_3001));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createAttributeUniqueKey3CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(
				Messages.AttributeUniqueKey3CreationTool_title,
				Messages.AttributeUniqueKey3CreationTool_desc,
				Collections
						.singletonList(ReerElementTypes.AttributeUniqueKey_3002));
		entry.setId("createAttributeUniqueKey3CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(ReerElementTypes
				.getImageDescriptor(ReerElementTypes.AttributeUniqueKey_3002));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createTable4CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(
				Messages.Table4CreationTool_title,
				Messages.Table4CreationTool_desc,
				Collections.singletonList(ReerElementTypes.Table_2001));
		entry.setId("createTable4CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(ReerElementTypes
				.getImageDescriptor(ReerElementTypes.Table_2001));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createRelationship1CreationTool() {
		DefaultLinkToolEntry entry = new DefaultLinkToolEntry(
				Messages.Relationship1CreationTool_title,
				Messages.Relationship1CreationTool_desc,
				Collections.singletonList(ReerElementTypes.Relationship_4001));
		entry.setId("createRelationship1CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(ReerElementTypes
				.getImageDescriptor(ReerElementTypes.Relationship_4001));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

}
