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
		paletteContainer.add(createAlternateKey1CreationTool());
		paletteContainer.add(createAssertion2CreationTool());
		paletteContainer.add(createAttribute3CreationTool());
		paletteContainer.add(createCheck4CreationTool());
		paletteContainer.add(createDomain5CreationTool());
		paletteContainer.add(createForeignKey6CreationTool());
		paletteContainer.add(createPrimaryKey7CreationTool());
		paletteContainer.add(createTable8CreationTool());
		paletteContainer.add(createTrigger9CreationTool());
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
	private ToolEntry createAlternateKey1CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(
				Messages.AlternateKey1CreationTool_title,
				Messages.AlternateKey1CreationTool_desc,
				Collections.singletonList(RmmElementTypes.AlternateKey_3027));
		entry.setId("createAlternateKey1CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(RmmElementTypes
				.getImageDescriptor(RmmElementTypes.AlternateKey_3027));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createAssertion2CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(
				Messages.Assertion2CreationTool_title,
				Messages.Assertion2CreationTool_desc,
				Collections.singletonList(RmmElementTypes.Assertion_2007));
		entry.setId("createAssertion2CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(RmmElementTypes
				.getImageDescriptor(RmmElementTypes.Assertion_2007));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createAttribute3CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(
				Messages.Attribute3CreationTool_title,
				Messages.Attribute3CreationTool_desc,
				Collections.singletonList(RmmElementTypes.Attribute_3006));
		entry.setId("createAttribute3CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(RmmElementTypes
				.getImageDescriptor(RmmElementTypes.Attribute_3006));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createCheck4CreationTool() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(2);
		types.add(RmmElementTypes.Check_3025);
		types.add(RmmElementTypes.Check_3021);
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(
				Messages.Check4CreationTool_title,
				Messages.Check4CreationTool_desc, types);
		entry.setId("createCheck4CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(RmmElementTypes
				.getImageDescriptor(RmmElementTypes.Check_3025));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createDomain5CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(
				Messages.Domain5CreationTool_title,
				Messages.Domain5CreationTool_desc,
				Collections.singletonList(RmmElementTypes.Domain_2008));
		entry.setId("createDomain5CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(RmmElementTypes
				.getImageDescriptor(RmmElementTypes.Domain_2008));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createForeignKey6CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(
				Messages.ForeignKey6CreationTool_title,
				Messages.ForeignKey6CreationTool_desc,
				Collections.singletonList(RmmElementTypes.ForeignKey_3024));
		entry.setId("createForeignKey6CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(RmmElementTypes
				.getImageDescriptor(RmmElementTypes.ForeignKey_3024));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createPrimaryKey7CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(
				Messages.PrimaryKey7CreationTool_title,
				Messages.PrimaryKey7CreationTool_desc,
				Collections.singletonList(RmmElementTypes.PrimaryKey_3022));
		entry.setId("createPrimaryKey7CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(RmmElementTypes
				.getImageDescriptor(RmmElementTypes.PrimaryKey_3022));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createTable8CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(
				Messages.Table8CreationTool_title,
				Messages.Table8CreationTool_desc,
				Collections.singletonList(RmmElementTypes.Table_2004));
		entry.setId("createTable8CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(RmmElementTypes
				.getImageDescriptor(RmmElementTypes.Table_2004));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createTrigger9CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(
				Messages.Trigger9CreationTool_title,
				Messages.Trigger9CreationTool_desc,
				Collections.singletonList(RmmElementTypes.Trigger_3026));
		entry.setId("createTrigger9CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(RmmElementTypes
				.getImageDescriptor(RmmElementTypes.Trigger_3026));
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
				Collections.singletonList(RmmElementTypes.Relationship_4002));
		entry.setId("createRelationship1CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(RmmElementTypes
				.getImageDescriptor(RmmElementTypes.Relationship_4002));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

}
