package kieker.otel.translation.model;

import org.eclipse.xtext.resource.IEObjectDescription;
import org.eclipse.xtext.scoping.IScope;
import org.eclipse.xtext.scoping.impl.AbstractScope;

import java.util.Collections;
import java.util.List;
import java.util.Set;

import com.google.common.base.Predicate;
import com.google.common.collect.Iterables;
import com.google.common.collect.Lists;


import kiekerrecord.KiekerrecordFactory;
import kiekerrecord.NamedElement;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.xtext.common.types.JvmIdentifiableElement;
import org.eclipse.xtext.naming.IQualifiedNameConverter;
import org.eclipse.xtext.naming.QualifiedName;
import org.eclipse.xtext.resource.EObjectDescription;
import org.eclipse.xtext.resource.IEObjectDescription;
import org.eclipse.xtext.scoping.IScope;
import org.eclipse.xtext.scoping.impl.AbstractScope;

/**
 * Model scope provider.
 *
 * @author Serafim Simonov (Derived from https://www.oiloftrop.de/code-research/introducing-type-systems-in-xtext-languages/)
 * @since 1.0
 */
public class ModelScope extends AbstractScope {

	private final IModelProvider modelProvider;

    private final IQualifiedNameConverter qualifiedNameConverter;

    private final Predicate<IEObjectDescription> filter;

    public ModelScope(final IModelProvider modelProvider,
            final IQualifiedNameConverter qualifiedNameConverter,
            final Predicate<IEObjectDescription> filter) {
        super(IScope.NULLSCOPE, false);
        this.modelProvider = modelProvider;
        this.qualifiedNameConverter = qualifiedNameConverter;
        this.filter = filter;
    }




    @Override
    protected Iterable<IEObjectDescription> getAllLocalElements() {
        throw new UnsupportedOperationException();
    }

    @Override
    public String toString() {
        return this.getClass().getSimpleName();
    }

    @Override
    public IEObjectDescription getSingleElement(final QualifiedName name) {
        final NamedElement model = this.modelProvider
                .findModelByName(this.qualifiedNameConverter.toString(name));
        if (model == null) {
            return null;
        }
        final IEObjectDescription result = EObjectDescription.create(name, model);
        if ((this.filter != null) && !this.filter.apply(result)) {
            return null;
        }
        return result;
    }

    @Override
    public Iterable<IEObjectDescription> getElements(final QualifiedName name) {
        final IEObjectDescription result = this.getSingleElement(name);
        if (result != null) {
            return Collections.singleton(result);
        }
        return Collections.emptySet();
    }

    @Override
    public Iterable<IEObjectDescription> getElements(final EObject object) {
        if (object instanceof JvmIdentifiableElement) {
            final Set<IEObjectDescription> result = Collections.singleton(EObjectDescription
                    .create(this.qualifiedNameConverter
                            .toQualifiedName(((JvmIdentifiableElement) object)
                                    .getQualifiedName()),
                            object));
            return this.filterResult(result);
        }
        return Collections.emptySet();
    }

    /**
     * Filter result.
     *
     * @param unfiltered
     *            list of unfiltered results
     * @return Returns the filtered results
     */
    protected Iterable<IEObjectDescription> filterResult(
            final Iterable<IEObjectDescription> unfiltered) {
        if (this.filter == null) {
            return unfiltered;
        }
        return Iterables.filter(unfiltered, this.filter);
    }

    @Override
    public Iterable<IEObjectDescription> getAllElements() {
        return this.filterResult(this.internalGetAllElements());
    }

    /**
     * Get all types.
     *
     * @return Returns the list all types of the scope.
     */
    protected Iterable<IEObjectDescription> internalGetAllElements() {
        final List<IEObjectDescription> elements = Lists.newArrayList();

        for (final NamedElement t : this.modelProvider.getAllElements()) {
            elements.add(this.createScopedElement(t.getName()));
        }



        return elements;
    }

    /**
     * Create scoped element.
     *
     * @param fullyQualifiedName
     *            name of the element
     *
     * @return Returns the scoped element
     */
    protected IEObjectDescription createScopedElement(final String fullyQualifiedName) {
        final InternalEObject proxy = this.createProxy(fullyQualifiedName);
        final IEObjectDescription eObjectDescription = EObjectDescription.create(
                this.qualifiedNameConverter.toQualifiedName(fullyQualifiedName),
                proxy);
        return eObjectDescription;
    }

    /**
     * Create a proxy element.
     *
     * @param fullyQualifiedName
     *            name of element
     * @return Returns the proxy element
     */
    protected InternalEObject createProxy(final String fullyQualifiedName) {
        final URI uri = ModelProvider.getFullURIForClass(fullyQualifiedName);
        final InternalEObject proxy = (InternalEObject) KiekerrecordFactory.eINSTANCE.createKiekerRecordModel();
        proxy.eSetProxyURI(uri);
        return proxy;
    }





}


