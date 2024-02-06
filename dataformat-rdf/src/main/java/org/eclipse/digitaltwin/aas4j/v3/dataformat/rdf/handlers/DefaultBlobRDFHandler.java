package org.eclipse.digitaltwin.aas4j.v3.dataformat.rdf.handlers;

import org.apache.jena.rdf.model.Model;
import org.apache.jena.rdf.model.ModelFactory;
import org.apache.jena.rdf.model.Resource;
import org.apache.jena.rdf.model.ResourceFactory;
import org.eclipse.digitaltwin.aas4j.v3.dataformat.rdf.DefaultRDFHandlerResult;
import org.eclipse.digitaltwin.aas4j.v3.dataformat.rdf.IncompatibleTypeException;
import org.eclipse.digitaltwin.aas4j.v3.dataformat.rdf.RDFHandler;
import org.eclipse.digitaltwin.aas4j.v3.dataformat.rdf.RDFSerializationResult;
import org.eclipse.digitaltwin.aas4j.v3.model.Blob;

public class DefaultBlobRDFHandler implements RDFHandler<Blob> {
    @Override
    public RDFSerializationResult toModel(Blob object) {
        Model model = ModelFactory.createDefaultModel();
        if (object == null) {
            return new DefaultRDFHandlerResult(model, ResourceFactory.createResource());
        }
        Resource subject = model.createResource();
        return new DefaultRDFHandlerResult(model, subject);
    }

    @Override
    public Blob fromModel(Model model, Resource subjectToParse) throws IncompatibleTypeException {
        return null;
    }
}
