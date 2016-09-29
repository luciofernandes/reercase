/*
 * 
 */
package rmm.diagram.providers;

import rmm.diagram.part.RmmDiagramEditorPlugin;

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
		ElementInitializers cached = RmmDiagramEditorPlugin.getInstance()
				.getElementInitializers();
		if (cached == null) {
			RmmDiagramEditorPlugin.getInstance().setElementInitializers(
					cached = new ElementInitializers());
		}
		return cached;
	}
}
