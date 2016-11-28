/*
 * 
 */
package rmm.diagram.edit.parts;

import java.util.List;

import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.RectangleFigure;
import org.eclipse.draw2d.Shape;
import org.eclipse.draw2d.StackLayout;
import org.eclipse.draw2d.geometry.Dimension;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.gef.EditPart;
import org.eclipse.gef.EditPolicy;
import org.eclipse.gef.Request;
import org.eclipse.gef.commands.Command;
import org.eclipse.gef.editpolicies.LayoutEditPolicy;
import org.eclipse.gef.editpolicies.NonResizableEditPolicy;
import org.eclipse.gef.requests.CreateRequest;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ShapeNodeEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles;
import org.eclipse.gmf.runtime.draw2d.ui.figures.ConstrainedToolbarLayout;
import org.eclipse.gmf.runtime.draw2d.ui.figures.WrappingLabel;
import org.eclipse.gmf.runtime.gef.ui.figures.DefaultSizeNodeFigure;
import org.eclipse.gmf.runtime.gef.ui.figures.NodeFigure;
import org.eclipse.gmf.runtime.notation.Node;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.swt.graphics.Color;

import rmm.AlternateKey;
import rmm.UniqueKey;
import rmm.diagram.edit.policies.AlternateKeyItemSemanticEditPolicy;
import rmm.diagram.part.RmmVisualIDRegistry;

/**
 * @generated
 */
public class AlternateKeyEditPart extends ShapeNodeEditPart {

	/**
	 * @generated
	 */
	public static final int VISUAL_ID = 3027;

	/**
	 * @generated
	 */
	protected IFigure contentPane;

	/**
	 * @generated
	 */
	protected IFigure primaryShape;

	/**
	 * @generated
	 */
	public AlternateKeyEditPart(View view) {
		super(view);
	}

	/**
	 * @generated
	 */
	protected void createDefaultEditPolicies() {
		super.createDefaultEditPolicies();
		installEditPolicy(EditPolicyRoles.SEMANTIC_ROLE,
				new AlternateKeyItemSemanticEditPolicy());
		installEditPolicy(EditPolicy.LAYOUT_ROLE, createLayoutEditPolicy());
		// XXX need an SCR to runtime to have another abstract superclass that would let children add reasonable editpolicies
		// removeEditPolicy(org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles.CONNECTION_HANDLES_ROLE);
	}

	/**
	 * @generated
	 */
	protected LayoutEditPolicy createLayoutEditPolicy() {
		org.eclipse.gmf.runtime.diagram.ui.editpolicies.LayoutEditPolicy lep = new org.eclipse.gmf.runtime.diagram.ui.editpolicies.LayoutEditPolicy() {

			protected EditPolicy createChildEditPolicy(EditPart child) {
				EditPolicy result = child
						.getEditPolicy(EditPolicy.PRIMARY_DRAG_ROLE);
				if (result == null) {
					result = new NonResizableEditPolicy();
				}
				return result;
			}

			protected Command getMoveChildrenCommand(Request request) {
				return null;
			}

			protected Command getCreateCommand(CreateRequest request) {
				return null;
			}
		};
		return lep;
	}

	/**
	 * @generated
	 */
	protected IFigure createNodeShape() {
		return primaryShape = new AlternateKeyFigure();
	}

	/**
	 * @generated
	 */
	public AlternateKeyFigure getPrimaryShape() {
		return (AlternateKeyFigure) primaryShape;
	}

	/**
	 * @generated
	 */
	protected boolean addFixedChild(EditPart childEditPart) {
		if (childEditPart instanceof AlternateKeyIDNameEditPart) {
			((AlternateKeyIDNameEditPart) childEditPart)
					.setLabel(getPrimaryShape()
							.getFigureAlternateKeyLabelFigure());
			return true;
		}
		return false;
	}

	/**
	 * @generated
	 */
	protected boolean removeFixedChild(EditPart childEditPart) {
		if (childEditPart instanceof AlternateKeyIDNameEditPart) {
			return true;
		}
		return false;
	}

	/**
	 * @generated
	 */
	protected void addChildVisual(EditPart childEditPart, int index) {
		if (addFixedChild(childEditPart)) {
			return;
		}
		super.addChildVisual(childEditPart, -1);
	}

	/**
	 * @generated
	 */
	protected void removeChildVisual(EditPart childEditPart) {
		if (removeFixedChild(childEditPart)) {
			return;
		}
		super.removeChildVisual(childEditPart);
	}

	/**
	 * @generated
	 */
	protected IFigure getContentPaneFor(IGraphicalEditPart editPart) {
		return getContentPane();
	}

	/**
	 * @generated
	 */
	protected NodeFigure createNodePlate() {
		DefaultSizeNodeFigure result = new DefaultSizeNodeFigure(150, 16);
		return result;
	}

	/**
	 * Creates figure for this edit part.
	 * 
	 * Body of this method does not depend on settings in generation model
	 * so you may safely remove <i>generated</i> tag and modify it.
	 * 
	 * @generated
	 */
	protected NodeFigure createNodeFigure() {
		NodeFigure figure = createNodePlate();
		figure.setLayoutManager(new StackLayout());
		IFigure shape = createNodeShape();
		figure.add(shape);
		contentPane = setupContentPane(shape);
		return figure;
	}

	/**
	 * Default implementation treats passed figure as content pane.
	 * Respects layout one may have set for generated figure.
	 * @param nodeShape instance of generated figure class
	 * @generated
	 */
	protected IFigure setupContentPane(IFigure nodeShape) {
		if (nodeShape.getLayoutManager() == null) {
			ConstrainedToolbarLayout layout = new ConstrainedToolbarLayout();
			layout.setSpacing(5);
			nodeShape.setLayoutManager(layout);
		}
		return nodeShape; // use nodeShape itself as contentPane
	}

	/**
	 * @generated
	 */
	public IFigure getContentPane() {
		if (contentPane != null) {
			return contentPane;
		}
		return super.getContentPane();
	}

	/**
	 * @generated
	 */
	protected void setForegroundColor(Color color) {
		if (primaryShape != null) {
			primaryShape.setForegroundColor(color);
		}
	}

	/**
	 * @generated
	 */
	protected void setBackgroundColor(Color color) {
		if (primaryShape != null) {
			primaryShape.setBackgroundColor(color);
		}
	}

	/**
	 * @generated
	 */
	protected void setLineWidth(int width) {
		if (primaryShape instanceof Shape) {
			((Shape) primaryShape).setLineWidth(width);
		}
	}

	/**
	 * @generated
	 */
	protected void setLineType(int style) {
		if (primaryShape instanceof Shape) {
			((Shape) primaryShape).setLineStyle(style);
		}
	}

	/**
	 * @generated
	 */
	public EditPart getPrimaryChildEditPart() {
		return getChildBySemanticHint(RmmVisualIDRegistry
				.getType(AlternateKeyIDNameEditPart.VISUAL_ID));
	}

	/**
	 * @generated not
	 * @author Lucio
	 * @since 12/03/2016 Interceptar o evento de mudar o tipo do atributo e faz
	 *        com que o atributo seja redesenhado.
	 */
	protected void handleNotificationEvent(Notification event) {
		if ((event.getEventType() == Notification.ADD)
				|| (event.getEventType() == Notification.REMOVE)
				|| (event.getEventType() == Notification.REMOVE_MANY)
				|| (event.getEventType() == Notification.ADD_MANY)) {
			TableTableAttributesCompartmentEditPart e = (TableTableAttributesCompartmentEditPart) this
					.getParent().getParent().getChildren().get(1);
			List<AttributeEditPart> att = e.getChildren();
			for (AttributeEditPart attributeEditPart : att) {
				attributeEditPart.addNotify();
			}

			getPrimaryShape().repaint();

		}
		if (event.getNotifier() == getModel()
				&& EcorePackage.eINSTANCE.getEModelElement_EAnnotations()
						.equals(event.getFeature())) {
			handleMajorSemanticChange();
		} else {
			super.handleNotificationEvent(event);
		}
	}

	/**
	 * @generated
	 */
	public class AlternateKeyFigure extends RectangleFigure {

		/**
		 * @generated
		 */
		private WrappingLabel fFigureAlternateKeyLabelFigure;

		/**
		 * @generated
		 */
		public AlternateKeyFigure() {
			this.setOutline(false);
			this.setLineWidth(0);
			this.setPreferredSize(new Dimension(getMapMode().DPtoLP(150),
					getMapMode().DPtoLP(16)));
			createContents();
		}

		/**
		 * @generated not
		 */
		private void createContents() {

			AlternateKey uniqueKey = ((AlternateKey) ((Node) AlternateKeyEditPart.this
					.getModel()).getElement());

			if (fFigureAlternateKeyLabelFigure == null) {

				Integer id = 1;

				if (AlternateKeyEditPart.this.getParent() != null) {

					id = 0;
					List<?> children = AlternateKeyEditPart.this.getParent()
							.getChildren();

					if (children != null) {
						for (Object object : children) {
							if (object instanceof AlternateKeyEditPart) {
								id++;
							}
						}
					}
				}

				String fk_name = uniqueKey.getName();

				if (uniqueKey.getName() == null) {
					fk_name = "AlternateKey";
				}

				if (uniqueKey.getID() == null) {
					uniqueKey.eSetDeliver(false);
					uniqueKey.setID(ACRONOMO + id);
					uniqueKey.eSetDeliver(true);
				}

				fFigureAlternateKeyLabelFigure = new WrappingLabel();
				fFigureAlternateKeyLabelFigure.setText(uniqueKey.getID() + ":"
						+ fk_name);
				this.add(fFigureAlternateKeyLabelFigure);
			}

		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureAlternateKeyLabelFigure() {
			return fFigureAlternateKeyLabelFigure;
		}

	}

	private static final String ACRONOMO = "AK";
}
