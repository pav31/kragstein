package kragstein.diagram.providers.assistants;

import java.util.ArrayList;
import java.util.List;

import kragstein.diagram.providers.KragsteinElementTypes;
import kragstein.diagram.providers.KragsteinModelingAssistantProvider;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;

/**
 * @generated
 */
public class KragsteinModelingAssistantProviderOfPackageEditPart extends
		KragsteinModelingAssistantProvider {

	/**
	 * @generated
	 */
	@Override
	public List<IElementType> getTypesForPopupBar(IAdaptable host) {
		List<IElementType> types = new ArrayList<IElementType>(1);
		types.add(KragsteinElementTypes.Class_2001);
		return types;
	}

}
