package org.eclipse.digitaltwin.aas4j.v3.dataformat.rdf.handlers.dataspecificationiec61360;

import org.apache.jena.rdf.model.Model;
import org.apache.jena.rdf.model.ModelFactory;
import org.apache.jena.rdf.model.Resource;
import org.apache.jena.rdf.model.ResourceFactory;
import org.apache.jena.vocabulary.RDF;
import org.eclipse.digitaltwin.aas4j.v3.dataformat.rdf.*;
import org.eclipse.digitaltwin.aas4j.v3.dataformat.rdf.handlers.DefaultReferenceRDFHandler;
import org.eclipse.digitaltwin.aas4j.v3.model.Reference;
import org.eclipse.digitaltwin.aas4j.v3.model.ValueReferencePair;
import org.eclipse.digitaltwin.aas4j.v3.model.impl.DefaultValueReferencePair;

public class DefaultValueReferencePairRDFHandler implements RDFHandler<ValueReferencePair> {
    @Override
    public RDFSerializationResult toModel(ValueReferencePair object) {
        Model model = ModelFactory.createDefaultModel();
        if (object == null) {
            return new DefaultRDFHandlerResult(model, ResourceFactory.createResource());
        }
        Resource subject = model.createResource();
        model.add(subject, RDF.type, AASNamespace.Types.ValueReferencePair);
        model.add(subject, AASNamespace.ValueReferencePair.value, object.getValue());
        RDFSerializationResult referenceSerializationResult = new DefaultReferenceRDFHandler().toModel(object.getValueId());
        model.add(referenceSerializationResult.getModel());
        model.add(subject, AASNamespace.ValueReferencePair.valueId, referenceSerializationResult.getResource());
        return new DefaultRDFHandlerResult(model, subject);
    }

    @Override
    public ValueReferencePair fromModel(Model model, Resource subjectToParse) throws IncompatibleTypeException {
        if (model.contains(subjectToParse, RDF.type, AASNamespace.Types.ValueReferencePair) == false) {
            throw new IncompatibleTypeException("ValueReferencePair");
        }

        Reference reference = new DefaultReferenceRDFHandler().fromModel(model, model.getProperty(subjectToParse, AASNamespace.ValueReferencePair.valueId).getResource());
        return new DefaultValueReferencePair.Builder()
                .value(model.getProperty(subjectToParse, AASNamespace.ValueReferencePair.value).getString())
                .valueId(reference)
                .build();
    }
}
