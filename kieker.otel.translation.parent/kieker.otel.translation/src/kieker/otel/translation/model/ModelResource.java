package kieker.otel.translation.model;


import java.io.IOException;
import java.io.InputStream;
import java.util.Map;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.impl.ResourceImpl;

import kieker.otel.translation.specification.*;
import kiekerrecord.Attribute;
import kiekerrecord.KiekerRecord;
import kiekerrecord.KiekerRecordModel;
import kiekerrecord.KiekerrecordPackage;
import kiekerrecord.NamedElement;

/**
 * 
 * @author Serafim Simonov  Initial contribution (Derived from https://www.oiloftrop.de/code-research/introducing-type-systems-in-xtext-languages/)
 * @since 1.0
 */


public class ModelResource extends ResourceImpl {



    public ModelResource(final URI uri) {
        super(uri);



    }

    @Override
    public EObject getEObject(final String uriFragment) {



        if (this.getContents().size() == 0) {
            final KiekerRecordModel model = new KiekerRecordSpecification().getKiekerRecordModel();
            // TODO Resource contents is empty, this should not happen.
            /*
             * I debugged this issue, but could not find the cause of it. I wondered that
             * multiple TypeProvider instances are used and therefore multiple
             * TypeResources. However, the problem occurs after the creation of a new
             * TypeResource when the old is accessed again. Then the contents of the
             * resource is gone. Debugging did not provide signification insight in what and
             * where the contents is emptied or replaced.
             *
             * However, to circumvent this bug, the following code refills the content.
             */

            this.getContents().add(model);
            this.getContents().addAll(model.getRecords());
//            int count=0;
            for(final KiekerRecord record:model.getRecords()) {
            	this.getContents().addAll(record.getAttributes());

            }
        }


        for (final EObject obj : this.getContents()) {
            if (uriFragment.equals(this.getURIFragment(obj))) {
                return obj;
            }
        }
        return super.getEObject(uriFragment);
    }

    @Override
    public String getURIFragment(final EObject eObject) {
        if (KiekerrecordPackage.eINSTANCE.getNamedElement().isInstance(eObject)) {
            return ((NamedElement) eObject).getName();
        } else {
            return super.getURIFragment(eObject);
        }
    }

    @Override
    public void load(final Map<?, ?> options) throws IOException {
        if (!this.isLoaded) {
            this.load(null, options);
        }
    }

    @Override
    public void save(final Map<?, ?> options) throws IOException {
        throw new UnsupportedOperationException();
    }

    /**
     * This routine is called from ResourceImpl load after the load method above is triggered.
     * It initializes the primitive type mirror.
     *
     * The input stream is always empty in this context and the options are ignored.
     *
     * @param inputStream
     *            the field is ignored, as this resource is an in memory resource.
     * @param options
     *            ignored field, as the resource is an in memory resource.
     * @throws IOException
     *             when the URI is malformed.
     */
    @Override
    protected void doLoad(final InputStream inputStream, final Map<?, ?> options) throws IOException {


        if (this.getURI() != null) {
            final KiekerRecordModel model = new KiekerRecordSpecification().getKiekerRecordModel();
            this.getContents().add(model);
            this.getContents().addAll(model.getRecords());
            for(final KiekerRecord recort:model.getRecords()) {
           // 	this.getContents().add(recort);
                this.getContents().addAll(recort.getAttributes());
            }
        }
        else {
            try {
                throw new IOException("Malformed URI in TypeResource.onLoad");
            } catch (final IOException e) {
                e.printStackTrace();
            }
        }
    }
}


