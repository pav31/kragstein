package kragstein.diagram.edit.parts;

import kragstein.diagram.edit.policies.CompositionItemSemanticEditPolicy;

import org.eclipse.draw2d.Connection;
import org.eclipse.gef.EditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ConnectionNodeEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ITreeBranchEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles;
import org.eclipse.gmf.runtime.draw2d.ui.figures.PolylineConnectionEx;
import org.eclipse.gmf.runtime.draw2d.ui.figures.WrappingLabel;
import org.eclipse.gmf.runtime.notation.View;

/**
 * @generated
 */
public class CompositionEditPart extends ConnectionNodeEditPart implements
		ITreeBranchEditPart {

	/**
	 * @generated
	 */
	public static final int VISUAL_ID = 4001;

	/**
	 * @generated
	 */
	public CompositionEditPart(View view) {
		super(view);
	}

	/**
	 * @generated
	 */
	protected void createDefaultEditPolicies() {
		super.createDefaultEditPolicies();
		installEditPolicy(EditPolicyRoles.SEMANTIC_ROLE,
				new CompositionItemSemanticEditPolicy());
	}

	/**
	 * @generated
	 */
	protected boolean addFixedChild(EditPart childEditPart) {
		if (childEditPart instanceof CompositionNameEditPart) {
			((CompositionNameEditPart) childEditPart)
					.setLabel(getPrimaryShape()
							.getFigureCompositionNameFigure());
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
		super.addChildVisual(childEditPart, index);
	}

	/**
	 * @generated
	 */
	protected boolean removeFixedChild(EditPart childEditPart) {
		if (childEditPart instanceof CompositionNameEditPart) {
			return true;
		}
		return false;
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
	 * Creates figure for this edit part.
	 * 
	 * Body of this method does not depend on settings in generation model
	 * so you may safely remove <i>generated</i> tag and modify it.
	 * 
	 * @generated
	 */

	protected Connection createConnectionFigure() {
		return new CompositionFigure();
	}

	/**
	 * @generated
	 */
	public CompositionFigure getPrimaryShape() {
		return (CompositionFigure) getFigure();
	}

	/**
	 * @generated
	 */
	public class CompositionFigure extends PolylineConnectionEx {

		/**
		 * @generated
		 */
		private WrappingLabel fFigureCompositionNameFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureCompositionLowerBoundFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureCompositionUpperBoundFigure;

		/**
		 * @generated
		 */
		public CompositionFigure() {

			createContents();
		}

		/**
		 * @generated
		 */
		private void createContents() {

			fFigureCompositionNameFigure = new WrappingLabel();

			fFigureCompositionNameFigure.setText("<...>");

			this.add(fFigureCompositionNameFigure);

			fFigureCompositionLowerBoundFigure = new WrappingLabel();

			fFigureCompositionLowerBoundFigure.setText("<...>");

			this.add(fFigureCompositionLowerBoundFigure);

			fFigureCompositionUpperBoundFigure = new WrappingLabel();

			fFigureCompositionUpperBoundFigure.setText("<...>");

			this.add(fFigureCompositionUpperBoundFigure);

		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureCompositionNameFigure() {
			return fFigureCompositionNameFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureCompositionLowerBoundFigure() {
			return fFigureCompositionLowerBoundFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureCompositionUpperBoundFigure() {
			return fFigureCompositionUpperBoundFigure;
		}

	}

}
