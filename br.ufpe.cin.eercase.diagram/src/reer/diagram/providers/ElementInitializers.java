/*
 * 
 */
package reer.diagram.providers;

import reer.diagram.part.ReerDiagramEditorPlugin;

/**
 * @generated
 */
public class ElementInitializers {

	protected ElementInitializers() {
		// use #getInstance to access cached instance
	}

	/**
	 * @generated
	 */
	public static ElementInitializers getInstance() {
		ElementInitializers cached = ReerDiagramEditorPlugin.getInstance()
				.getElementInitializers();
		if (cached == null) {
			ReerDiagramEditorPlugin.getInstance().setElementInitializers(
					cached = new ElementInitializers());
		}
		return cached;
	}
}
