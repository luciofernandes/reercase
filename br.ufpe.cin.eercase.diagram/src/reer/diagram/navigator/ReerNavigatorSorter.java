/*
 * 
 */
package reer.diagram.navigator;

import org.eclipse.jface.viewers.ViewerSorter;

import reer.diagram.part.ReerVisualIDRegistry;

/**
 * @generated
 */
public class ReerNavigatorSorter extends ViewerSorter {

	/**
	 * @generated
	 */
	private static final int GROUP_CATEGORY = 7004;

	/**
	 * @generated
	 */
	private static final int SHORTCUTS_CATEGORY = 7003;

	/**
	 * @generated
	 */
	public int category(Object element) {
		if (element instanceof ReerNavigatorItem) {
			ReerNavigatorItem item = (ReerNavigatorItem) element;
			if (item.getView().getEAnnotation("Shortcut") != null) { //$NON-NLS-1$
				return SHORTCUTS_CATEGORY;
			}
			return ReerVisualIDRegistry.getVisualID(item.getView());
		}
		return GROUP_CATEGORY;
	}

}
