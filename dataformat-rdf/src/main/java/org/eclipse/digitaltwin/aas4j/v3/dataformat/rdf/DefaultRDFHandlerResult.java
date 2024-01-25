package org.eclipse.digitaltwin.aas4j.v3.dataformat.rdf;

import org.apache.jena.rdf.model.Model;
import org.apache.jena.rdf.model.Resource;
import org.eclipse.digitaltwin.aas4j.v3.dataformat.rdf.RDFSerializationResult;

public class DefaultRDFHandlerResult implements RDFSerializationResult {
    private final Model model;
    private final Resource resource;

    public DefaultRDFHandlerResult(Model model, Resource resource) {
        if (model == null) {
            throw new IllegalArgumentException("Model can't be null");
        }
        if (resource == null) {
            throw new IllegalArgumentException("Resource can't be null");
        }
        this.model = model;
        this.resource = resource;
    }

    @Override
    public Model getModel() {
        return model;
    }

    @Override
    public Resource getResource() {
        return resource;
    }
}
