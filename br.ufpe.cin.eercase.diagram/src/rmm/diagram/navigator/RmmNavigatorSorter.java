/*
 * 
 */
package rmm.diagram.navigator;

import org.eclipse.jface.viewers.ViewerSorter;

import rmm.diagram.part.RmmVisualIDRegistry;

/**
 * @generated
 */
public class RmmNavigatorSorter extends ViewerSorter {

	/**
	 * @generated
	 */
	private static final int GROUP_CATEGORY = 7008;

	/**
	 * @generated
	 */
	private static final int SHORTCUTS_CATEGORY = 7007;

	/**
	 * @generated
	 */
	public int category(Object element) {
		if (element instanceof RmmNavigatorItem) {
			RmmNavigatorItem item = (RmmNavigatorItem) element;
			if (item.getView().getEAnnotation("Shortcut") != null) { //$NON-NLS-1$
				return SHORTCUTS_CATEGORY;
			}
			return RmmVisualIDRegistry.getVisualID(item.getView());
		}
		return GROUP_CATEGORY;
	}

}
