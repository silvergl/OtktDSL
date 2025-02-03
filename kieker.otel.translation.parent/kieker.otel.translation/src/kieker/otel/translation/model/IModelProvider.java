package kieker.otel.translation.model;

import kiekerrecord.NamedElement;



/**
 * 
 * @author Serafim Simonov  Initial contribution (Derived from https://www.oiloftrop.de/code-research/introducing-type-systems-in-xtext-languages/)
 * @since 1.0
 */


public interface IModelProvider {
	/**
     * Find a model element by its fully qualified name, which is its  normal name.
     *
     * @param name
     *            of a model to resolve
     *
     * @return the found {@link Type} or null if no such model could be found.
     */
    NamedElement findModelByName(String name);
    /**
     * Find a  model element by its fully qualified name.
     *
     * @param name
     *            of a model element to resolve
     *
     * @return the found {@link Type} or null if no such element could be found.
     */
    Iterable<NamedElement> getAllElements();

}
