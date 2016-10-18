/*
 * 
 */
package rmm.diagram.part;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.gmf.runtime.diagram.core.preferences.PreferencesHint;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.tooling.runtime.part.DefaultElementChooserDialog;
import org.eclipse.jface.viewers.ITreeContentProvider;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.model.BaseWorkbenchContentProvider;

/**
 * @generated
 */
public class RmmElementChooserDialog extends DefaultElementChooserDialog {

	/**
	 * @generated
	 */
	public RmmElementChooserDialog(Shell parentShell, View view) {
		this(parentShell, view, false);
	}

	/**
	 * @generated
	 */
	public RmmElementChooserDialog(Shell parentShell, View view,
			boolean allowMultiSelection) {
		super(parentShell, view, new RmmElementChooserDialogContextImpl(
				allowMultiSelection));
	}

	/**
	 * @generated
	 */
	private static class RmmElementChooserDialogContextImpl implements
			DefaultElementChooserDialog.Context {

		/**
		 * @generated
		 */
		private static final String[] FILE_EXTENSIONS = new String[] { "rmm" };

		/**
		 * @generated
		 */
		private final boolean myAllowMultiSelection;

		/**
		 * @generated
		 */
		private RmmElementChooserDialogContextImpl(boolean allowMultiSelection) {
			myAllowMultiSelection = allowMultiSelection;
		}

		/**
		 * @generated
		 */
		@Override
		public AdapterFactory getAdapterFactory() {
			return RmmDiagramEditorPlugin.getInstance()
					.getItemProvidersAdapterFactory();
		}

		/**
		 * @generated
		 */
		@Override
		public PreferencesHint getPreferenceHint() {
			return RmmDiagramEditorPlugin.DIAGRAM_PREFERENCES_HINT;
		}

		/**
		 * @generated
		 */
		@Override
		public String[] getFileExtesions() {
			return FILE_EXTENSIONS.clone();
		}

		/**
		 * @generated
		 */
		@Override
		public String getDialogTitle() {
			return Messages.RmmElementChooserDialog_SelectModelElementTitle;
		}

		/**
		 * @generated
		 */
		@Override
		public ITreeContentProvider getTreeContentProvider() {
			return new BaseWorkbenchContentProvider();
		}

		/**
		 * @generated
		 */
		public boolean allowMultiSelection() {
			return myAllowMultiSelection;
		}

	}

}
