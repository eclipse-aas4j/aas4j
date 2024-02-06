package org.eclipse.digitaltwin.aas4j.v3.dataformat.rdf.handlers;

import org.apache.jena.rdf.model.Model;
import org.apache.jena.rdf.model.ModelFactory;
import org.apache.jena.rdf.model.Resource;
import org.apache.jena.rdf.model.ResourceFactory;
import org.apache.jena.vocabulary.RDF;
import org.eclipse.digitaltwin.aas4j.v3.dataformat.rdf.*;
import org.eclipse.digitaltwin.aas4j.v3.model.Property;
import org.eclipse.digitaltwin.aas4j.v3.model.impl.DefaultProperty;

public class DefaultPropertyRDFHandler implements RDFHandler<Property> {
    @Override
    public RDFSerializationResult toModel(Property object) {
        Model model = ModelFactory.createDefaultModel();
        if (object == null) {
            return new DefaultRDFHandlerResult(model, ResourceFactory.createResource());
        }
        Resource subject = model.createResource();
        return new DefaultRDFHandlerResult(model, subject);
    }

    @Override
    public Property fromModel(Model model, Resource subjectToParse) throws IncompatibleTypeException {
        if (model.contains(subjectToParse, RDF.type, AASNamespace.Types.Property) == false) {
            throw new IncompatibleTypeException("Property");
        }
        DefaultProperty.Builder builder = new DefaultProperty.Builder();


        return null;
    }
}
