/*
 * 
 */
package KragsteinMethod.diagram.edit.parts;

import org.eclipse.draw2d.IFigure;
import org.eclipse.gef.EditPart;
import org.eclipse.gef.EditPolicy;
import org.eclipse.gef.Request;
import org.eclipse.gmf.runtime.diagram.core.edithelpers.CreateElementRequestAdapter;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ShapeCompartmentEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.DragDropEditPolicy;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.ResizableCompartmentEditPolicy;
import org.eclipse.gmf.runtime.diagram.ui.figures.ResizableCompartmentFigure;
import org.eclipse.gmf.runtime.diagram.ui.requests.CreateUnspecifiedTypeConnectionRequest;
import org.eclipse.gmf.runtime.diagram.ui.requests.CreateViewAndElementRequest;
import org.eclipse.gmf.runtime.diagram.ui.requests.RequestConstants;
import org.eclipse.gmf.runtime.draw2d.ui.figures.ConstrainedToolbarLayout;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.tooling.runtime.edit.policies.reparent.CreationEditPolicyWithCustomReparent;

/**
 * @generated
 */
public class RouteRouteIconCompartment2EditPart extends
		ShapeCompartmentEditPart {

	/**
	 * @generated
	 */
	public static final int VISUAL_ID = 7004;

	/**
	 * @generated
	 */
	public RouteRouteIconCompartment2EditPart(View view) {
		super(view);
	}

	/**
	 * @generated
	 */
	public String getCompartmentName() {
		return KragsteinMethod.diagram.part.Messages.RouteRouteIconCompartment2EditPart_title;
	}

	/**
	 * @generated
	 */
	public IFigure createFigure() {
		ResizableCompartmentFigure result = (ResizableCompartmentFigure) super
				.createFigure();
		result.setTitleVisibility(false);
		return result;
	}

	/**
	 * @generated
	 */
	protected void createDefaultEditPolicies() {
		super.createDefaultEditPolicies();
		installEditPolicy(EditPolicy.PRIMARY_DRAG_ROLE,
				new ResizableCompartmentEditPolicy());
		installEditPolicy(
				EditPolicyRoles.SEMANTIC_ROLE,
				new KragsteinMethod.diagram.edit.policies.RouteRouteIconCompartment2ItemSemanticEditPolicy());
		installEditPolicy(
				EditPolicyRoles.CREATION_ROLE,
				new CreationEditPolicyWithCustomReparent(
						KragsteinMethod.diagram.part.KragsteinMethodVisualIDRegistry.TYPED_INSTANCE));
		installEditPolicy(EditPolicyRoles.DRAG_DROP_ROLE,
				new DragDropEditPolicy());
		installEditPolicy(
				EditPolicyRoles.CANONICAL_ROLE,
				new KragsteinMethod.diagram.edit.policies.RouteRouteIconCompartment2CanonicalEditPolicy());
	}

	/**
	 * @generated
	 */
	protected void setRatio(Double ratio) {
		if (getFigure().getParent().getLayoutManager() instanceof ConstrainedToolbarLayout) {
			super.setRatio(ratio);
		}
	}

	/**
	 * @generated
	 */
	public EditPart getTargetEditPart(Request request) {
		if (request instanceof CreateViewAndElementRequest) {
			CreateElementRequestAdapter adapter = ((CreateViewAndElementRequest) request)
					.getViewAndElementDescriptor()
					.getCreateElementRequestAdapter();
			IElementType type = (IElementType) adapter
					.getAdapter(IElementType.class);
			if (type == KragsteinMethod.diagram.providers.KragsteinMethodElementTypes.Action_3002) {
				return this;
			}
			if (type == KragsteinMethod.diagram.providers.KragsteinMethodElementTypes.Question_3003) {
				return this;
			}
			if (type == KragsteinMethod.diagram.providers.KragsteinMethodElementTypes.Choice_3004) {
				return this;
			}
			if (type == KragsteinMethod.diagram.providers.KragsteinMethodElementTypes.Headline_3006) {
				return this;
			}
			if (type == KragsteinMethod.diagram.providers.KragsteinMethodElementTypes.Adress_3007) {
				return this;
			}
			if (type == KragsteinMethod.diagram.providers.KragsteinMethodElementTypes.Insertion_3008) {
				return this;
			}
			if (type == KragsteinMethod.diagram.providers.KragsteinMethodElementTypes.Shelf_3009) {
				return this;
			}
			if (type == KragsteinMethod.diagram.providers.KragsteinMethodElementTypes.BeginLoop_3010) {
				return this;
			}
			if (type == KragsteinMethod.diagram.providers.KragsteinMethodElementTypes.EndLoop_3011) {
				return this;
			}
			if (type == KragsteinMethod.diagram.providers.KragsteinMethodElementTypes.Output_3012) {
				return this;
			}
			if (type == KragsteinMethod.diagram.providers.KragsteinMethodElementTypes.Input_3013) {
				return this;
			}
			if (type == KragsteinMethod.diagram.providers.KragsteinMethodElementTypes.LoopArrow_3014) {
				return this;
			}
			if (type == KragsteinMethod.diagram.providers.KragsteinMethodElementTypes.End_3016) {
				return this;
			}
			return getParent().getTargetEditPart(request);
		}
		if (request instanceof CreateUnspecifiedTypeConnectionRequest) {
			if (RequestConstants.REQ_CONNECTION_END.equals(request.getType())) {
				for (Object type : ((CreateUnspecifiedTypeConnectionRequest) request)
						.getElementTypes()) {
					if (type instanceof IElementType) {
						IElementType elementType = (IElementType) type;
						if (elementType
								.equals(KragsteinMethod.diagram.providers.KragsteinMethodElementTypes.IconConnection_4003))
							return super.getTargetEditPart(request);
					}
				}
			}
			return getParent().getTargetEditPart(request);
		}
		return super.getTargetEditPart(request);
	}

}