/*
 * 
 */
package rmm.diagram.providers;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.common.core.service.AbstractProvider;
import org.eclipse.gmf.runtime.common.core.service.IOperation;
import org.eclipse.gmf.runtime.common.ui.services.parser.GetParserOperation;
import org.eclipse.gmf.runtime.common.ui.services.parser.IParser;
import org.eclipse.gmf.runtime.common.ui.services.parser.IParserProvider;
import org.eclipse.gmf.runtime.common.ui.services.parser.ParserService;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.emf.ui.services.parser.ParserHintAdapter;
import org.eclipse.gmf.runtime.notation.View;

import rmm.RmmPackage;
import rmm.diagram.edit.parts.AssertionNameEditPart;
import rmm.diagram.edit.parts.AttributeNameDataTypeEditPart;
import rmm.diagram.edit.parts.CheckIDName2EditPart;
import rmm.diagram.edit.parts.CheckIDNameEditPart;
import rmm.diagram.edit.parts.DomainNameEditPart;
import rmm.diagram.edit.parts.ForeignKeyIDNameEditPart;
import rmm.diagram.edit.parts.PrimaryKeyIDNameEditPart;
import rmm.diagram.edit.parts.RelationshipNameEditPart;
import rmm.diagram.edit.parts.TableNameEditPart;
import rmm.diagram.edit.parts.TriggerIDNameEditPart;
import rmm.diagram.edit.parts.UniqueKeyIDNameEditPart;
import rmm.diagram.parsers.MessageFormatParser;
import rmm.diagram.part.RmmVisualIDRegistry;

/**
 * @generated
 */
public class RmmParserProvider extends AbstractProvider implements
		IParserProvider {

	/**
	 * @generated
	 */
	private IParser tableName_5012Parser;

	/**
	 * @generated
	 */
	private IParser getTableName_5012Parser() {
		if (tableName_5012Parser == null) {
			EAttribute[] features = new EAttribute[] { RmmPackage.eINSTANCE
					.getTable_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			tableName_5012Parser = parser;
		}
		return tableName_5012Parser;
	}

	/**
	 * @generated
	 */
	private IParser assertionName_5018Parser;

	/**
	 * @generated
	 */
	private IParser getAssertionName_5018Parser() {
		if (assertionName_5018Parser == null) {
			EAttribute[] features = new EAttribute[] { RmmPackage.eINSTANCE
					.getAssertion_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			assertionName_5018Parser = parser;
		}
		return assertionName_5018Parser;
	}

	/**
	 * @generated
	 */
	private IParser domainName_5019Parser;

	/**
	 * @generated
	 */
	private IParser getDomainName_5019Parser() {
		if (domainName_5019Parser == null) {
			EAttribute[] features = new EAttribute[] { RmmPackage.eINSTANCE
					.getDomain_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			domainName_5019Parser = parser;
		}
		return domainName_5019Parser;
	}

	/**
	 * @generated
	 */
	private IParser primaryKeyIDName_5030Parser;

	/**
	 * @generated
	 */
	private IParser getPrimaryKeyIDName_5030Parser() {
		if (primaryKeyIDName_5030Parser == null) {
			EAttribute[] features = new EAttribute[] {
					RmmPackage.eINSTANCE.getConstraint_ID(),
					RmmPackage.eINSTANCE.getConstraint_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			parser.setViewPattern("{0}:{1}"); //$NON-NLS-1$
			parser.setEditorPattern("{0}:{1}"); //$NON-NLS-1$
			parser.setEditPattern("{0}:{1}"); //$NON-NLS-1$
			primaryKeyIDName_5030Parser = parser;
		}
		return primaryKeyIDName_5030Parser;
	}

	/**
	 * @generated
	 */
	private IParser uniqueKeyIDName_5031Parser;

	/**
	 * @generated
	 */
	private IParser getUniqueKeyIDName_5031Parser() {
		if (uniqueKeyIDName_5031Parser == null) {
			EAttribute[] features = new EAttribute[] {
					RmmPackage.eINSTANCE.getConstraint_ID(),
					RmmPackage.eINSTANCE.getConstraint_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			parser.setViewPattern("{0}:{1}"); //$NON-NLS-1$
			parser.setEditorPattern("{0}:{1}"); //$NON-NLS-1$
			parser.setEditPattern("{0}:{1}"); //$NON-NLS-1$
			uniqueKeyIDName_5031Parser = parser;
		}
		return uniqueKeyIDName_5031Parser;
	}

	/**
	 * @generated
	 */
	private IParser foreignKeyIDName_5032Parser;

	/**
	 * @generated
	 */
	private IParser getForeignKeyIDName_5032Parser() {
		if (foreignKeyIDName_5032Parser == null) {
			EAttribute[] features = new EAttribute[] {
					RmmPackage.eINSTANCE.getConstraint_ID(),
					RmmPackage.eINSTANCE.getConstraint_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			parser.setViewPattern("{0}:{1}"); //$NON-NLS-1$
			parser.setEditorPattern("{0}:{1}"); //$NON-NLS-1$
			parser.setEditPattern("{0}:{1}"); //$NON-NLS-1$
			foreignKeyIDName_5032Parser = parser;
		}
		return foreignKeyIDName_5032Parser;
	}

	/**
	 * @generated
	 */
	private IParser checkIDName_5033Parser;

	/**
	 * @generated
	 */
	private IParser getCheckIDName_5033Parser() {
		if (checkIDName_5033Parser == null) {
			EAttribute[] features = new EAttribute[] {
					RmmPackage.eINSTANCE.getConstraint_ID(),
					RmmPackage.eINSTANCE.getConstraint_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			parser.setViewPattern("{0}:{1}"); //$NON-NLS-1$
			parser.setEditorPattern("{0}:{1}"); //$NON-NLS-1$
			parser.setEditPattern("{0}:{1}"); //$NON-NLS-1$
			checkIDName_5033Parser = parser;
		}
		return checkIDName_5033Parser;
	}

	/**
	 * @generated
	 */
	private IParser triggerIDName_5034Parser;

	/**
	 * @generated
	 */
	private IParser getTriggerIDName_5034Parser() {
		if (triggerIDName_5034Parser == null) {
			EAttribute[] features = new EAttribute[] {
					RmmPackage.eINSTANCE.getConstraint_ID(),
					RmmPackage.eINSTANCE.getConstraint_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			parser.setViewPattern("{0}:{1}"); //$NON-NLS-1$
			parser.setEditorPattern("{0}:{1}"); //$NON-NLS-1$
			parser.setEditPattern("{0}:{1}"); //$NON-NLS-1$
			triggerIDName_5034Parser = parser;
		}
		return triggerIDName_5034Parser;
	}

	/**
	 * @generated
	 */
	private IParser attributeNameDataType_5009Parser;

	/**
	 * @generated
	 */
	private IParser getAttributeNameDataType_5009Parser() {
		if (attributeNameDataType_5009Parser == null) {
			EAttribute[] features = new EAttribute[] {
					RmmPackage.eINSTANCE.getAttribute_Name(),
					RmmPackage.eINSTANCE.getAttribute_DataType() };
			MessageFormatParser parser = new MessageFormatParser(features);
			parser.setViewPattern("{0}:{1}"); //$NON-NLS-1$
			parser.setEditorPattern("{0}:{1}"); //$NON-NLS-1$
			parser.setEditPattern("{0}:{1}"); //$NON-NLS-1$
			attributeNameDataType_5009Parser = parser;
		}
		return attributeNameDataType_5009Parser;
	}

	/**
	 * @generated
	 */
	private IParser checkIDName_5029Parser;

	/**
	 * @generated
	 */
	private IParser getCheckIDName_5029Parser() {
		if (checkIDName_5029Parser == null) {
			EAttribute[] features = new EAttribute[] {
					RmmPackage.eINSTANCE.getConstraint_ID(),
					RmmPackage.eINSTANCE.getConstraint_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			parser.setViewPattern("{0}:{1}"); //$NON-NLS-1$
			parser.setEditorPattern("{0}:{1}"); //$NON-NLS-1$
			parser.setEditPattern("{0}:{1}"); //$NON-NLS-1$
			checkIDName_5029Parser = parser;
		}
		return checkIDName_5029Parser;
	}

	/**
	 * @generated
	 */
	private IParser relationshipName_6003Parser;

	/**
	 * @generated
	 */
	private IParser getRelationshipName_6003Parser() {
		if (relationshipName_6003Parser == null) {
			EAttribute[] features = new EAttribute[] { RmmPackage.eINSTANCE
					.getRelationship_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			relationshipName_6003Parser = parser;
		}
		return relationshipName_6003Parser;
	}

	/**
	 * @generated
	 */
	protected IParser getParser(int visualID) {
		switch (visualID) {
		case TableNameEditPart.VISUAL_ID:
			return getTableName_5012Parser();
		case AssertionNameEditPart.VISUAL_ID:
			return getAssertionName_5018Parser();
		case DomainNameEditPart.VISUAL_ID:
			return getDomainName_5019Parser();
		case PrimaryKeyIDNameEditPart.VISUAL_ID:
			return getPrimaryKeyIDName_5030Parser();
		case UniqueKeyIDNameEditPart.VISUAL_ID:
			return getUniqueKeyIDName_5031Parser();
		case ForeignKeyIDNameEditPart.VISUAL_ID:
			return getForeignKeyIDName_5032Parser();
		case CheckIDNameEditPart.VISUAL_ID:
			return getCheckIDName_5033Parser();
		case TriggerIDNameEditPart.VISUAL_ID:
			return getTriggerIDName_5034Parser();
		case AttributeNameDataTypeEditPart.VISUAL_ID:
			return getAttributeNameDataType_5009Parser();
		case CheckIDName2EditPart.VISUAL_ID:
			return getCheckIDName_5029Parser();
		case RelationshipNameEditPart.VISUAL_ID:
			return getRelationshipName_6003Parser();
		}
		return null;
	}

	/**
	 * Utility method that consults ParserService
	 * @generated
	 */
	public static IParser getParser(IElementType type, EObject object,
			String parserHint) {
		return ParserService.getInstance().getParser(
				new HintAdapter(type, object, parserHint));
	}

	/**
	 * @generated
	 */
	public IParser getParser(IAdaptable hint) {
		String vid = (String) hint.getAdapter(String.class);
		if (vid != null) {
			return getParser(RmmVisualIDRegistry.getVisualID(vid));
		}
		View view = (View) hint.getAdapter(View.class);
		if (view != null) {
			return getParser(RmmVisualIDRegistry.getVisualID(view));
		}
		return null;
	}

	/**
	 * @generated
	 */
	public boolean provides(IOperation operation) {
		if (operation instanceof GetParserOperation) {
			IAdaptable hint = ((GetParserOperation) operation).getHint();
			if (RmmElementTypes.getElement(hint) == null) {
				return false;
			}
			return getParser(hint) != null;
		}
		return false;
	}

	/**
	 * @generated
	 */
	private static class HintAdapter extends ParserHintAdapter {

		/**
		 * @generated
		 */
		private final IElementType elementType;

		/**
		 * @generated
		 */
		public HintAdapter(IElementType type, EObject object, String parserHint) {
			super(object, parserHint);
			assert type != null;
			elementType = type;
		}

		/**
		 * @generated
		 */
		public Object getAdapter(Class adapter) {
			if (IElementType.class.equals(adapter)) {
				return elementType;
			}
			return super.getAdapter(adapter);
		}
	}

}
