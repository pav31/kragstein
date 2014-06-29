/**
 *
 * $Id$
 */
package KragsteinMethod.validation;

import KragsteinMethod.BranchConnection;
import KragsteinMethod.Route;
import org.eclipse.emf.common.util.EList;

/**
 * A sample validator interface for {@link KragsteinMethod.Branch}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface BranchValidator {
	boolean validate();

	boolean validateSourceBranchConnection(BranchConnection value);
	boolean validateTargetBranchConnection(BranchConnection value);
	boolean validateRoute(EList<Route> value);

	boolean validateRoute(Route value);
	boolean validateName(String value);
}
