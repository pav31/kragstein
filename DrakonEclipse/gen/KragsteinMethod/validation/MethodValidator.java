/**
 *
 * $Id$
 */
package KragsteinMethod.validation;

import KragsteinMethod.Branch;
import KragsteinMethod.Header;

import org.eclipse.emf.common.util.EList;

/**
 * A sample validator interface for {@link KragsteinMethod.Method}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface MethodValidator {
	boolean validate();

	boolean validateName(String value);
	boolean validateHeader(Header value);
	boolean validateBranch(EList<Branch> value);
}