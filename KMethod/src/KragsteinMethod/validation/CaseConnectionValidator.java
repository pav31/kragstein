/**
 *
 * $Id$
 */
package KragsteinMethod.validation;

import KragsteinMethod.Case;

/**
 * A sample validator interface for {@link KragsteinMethod.CaseConnection}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface CaseConnectionValidator {
	boolean validate();

	boolean validateSource(Case value);
	boolean validateTarget(Case value);
	boolean validateTargetCase(String value);
}
