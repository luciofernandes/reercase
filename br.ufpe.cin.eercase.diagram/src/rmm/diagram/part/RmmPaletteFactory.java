/*
 * 
 */
package rmm.diagram.part;

import java.util.ArrayList;
import java.util.Collections;

import org.eclipse.gef.palette.PaletteContainer;
import org.eclipse.gef.palette.PaletteDrawer;
import org.eclipse.gef.palette.PaletteRoot;
import org.eclipse.gef.palette.ToolEntry;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.tooling.runtime.part.DefaultLinkToolEntry;
import org.eclipse.gmf.tooling.runtime.part.DefaultNodeToolEntry;

import rmm.diagram.providers.RmmElementTypes;

/**
 * @generated
 */
public class RmmPaletteFactory {

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
		paletteContainer.add(createAssertion1CreationTool());
		paletteContainer.add(createAttribute2CreationTool());
		paletteContainer.add(createCheck3CreationTool());
		paletteContainer.add(createDomain4CreationTool());
		paletteContainer.add(createForeignKey5CreationTool());
		paletteContainer.add(createPrimaryKey6CreationTool());
		paletteContainer.add(createTable7CreationTool());
		paletteContainer.add(createTrigger8CreationTool());
		paletteContainer.add(createUniqueKey9CreationTool());
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
	private ToolEntry createAssertion1CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(
				Messages.Assertion1CreationTool_title,
				Messages.Assertion1CreationTool_desc,
				Collections.singletonList(RmmElementTypes.Assertion_2007));
		entry.setId("createAssertion1CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(RmmElementTypes
				.getImageDescriptor(RmmElementTypes.Assertion_2007));
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
				Collections.singletonList(RmmElementTypes.Attribute_3006));
		entry.setId("createAttribute2CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(RmmElementTypes
				.getImageDescriptor(RmmElementTypes.Attribute_3006));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createCheck3CreationTool() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(2);
		types.add(RmmElementTypes.Check_3025);
		types.add(RmmElementTypes.Check_3021);
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(
				Messages.Check3CreationTool_title,
				Messages.Check3CreationTool_desc, types);
		entry.setId("createCheck3CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(RmmElementTypes
				.getImageDescriptor(RmmElementTypes.Check_3025));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createDomain4CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(
				Messages.Domain4CreationTool_title,
				Messages.Domain4CreationTool_desc,
				Collections.singletonList(RmmElementTypes.Domain_2008));
		entry.setId("createDomain4CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(RmmElementTypes
				.getImageDescriptor(RmmElementTypes.Domain_2008));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createForeignKey5CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(
				Messages.ForeignKey5CreationTool_title,
				Messages.ForeignKey5CreationTool_desc,
				Collections.singletonList(RmmElementTypes.ForeignKey_3024));
		entry.setId("createForeignKey5CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(RmmElementTypes
				.getImageDescriptor(RmmElementTypes.ForeignKey_3024));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createPrimaryKey6CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(
				Messages.PrimaryKey6CreationTool_title,
				Messages.PrimaryKey6CreationTool_desc,
				Collections.singletonList(RmmElementTypes.PrimaryKey_3022));
		entry.setId("createPrimaryKey6CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(RmmElementTypes
				.getImageDescriptor(RmmElementTypes.PrimaryKey_3022));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createTable7CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(
				Messages.Table7CreationTool_title,
				Messages.Table7CreationTool_desc,
				Collections.singletonList(RmmElementTypes.Table_2004));
		entry.setId("createTable7CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(RmmElementTypes
				.getImageDescriptor(RmmElementTypes.Table_2004));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createTrigger8CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(
				Messages.Trigger8CreationTool_title,
				Messages.Trigger8CreationTool_desc,
				Collections.singletonList(RmmElementTypes.Trigger_3026));
		entry.setId("createTrigger8CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(RmmElementTypes
				.getImageDescriptor(RmmElementTypes.Trigger_3026));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createUniqueKey9CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(
				Messages.UniqueKey9CreationTool_title,
				Messages.UniqueKey9CreationTool_desc,
				Collections.singletonList(RmmElementTypes.UniqueKey_3023));
		entry.setId("createUniqueKey9CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(RmmElementTypes
				.getImageDescriptor(RmmElementTypes.UniqueKey_3023));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createRelationship1CreationTool() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(2);
		types.add(RmmElementTypes.Relationship_4002);
		types.add(RmmElementTypes.Relationship_4003);
		DefaultLinkToolEntry entry = new DefaultLinkToolEntry(
				Messages.Relationship1CreationTool_title,
				Messages.Relationship1CreationTool_desc, types);
		entry.setId("createRelationship1CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(RmmElementTypes
				.getImageDescriptor(RmmElementTypes.Relationship_4002));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

}
