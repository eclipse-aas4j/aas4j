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
        if (object.getValue() != null) {
            model.add(subject, AASNamespace.ValueReferencePair.value, object.getValue());
        }
        if (object.getValueId() != null) {
            RDFSerializationResult referenceSerializationResult = new DefaultReferenceRDFHandler().toModel(object.getValueId());
            model.add(subject, AASNamespace.ValueReferencePair.valueId, referenceSerializationResult.getResource());
            model.add(referenceSerializationResult.getModel());
        }
        return new DefaultRDFHandlerResult(model, subject);
    }

    @Override
    public ValueReferencePair fromModel(Model model, Resource subjectToParse) throws IncompatibleTypeException {
        if (!model.contains(subjectToParse, RDF.type, AASNamespace.Types.ValueReferencePair)) {
            throw new IncompatibleTypeException("ValueReferencePair");
        }
        DefaultValueReferencePair.Builder builder = new DefaultValueReferencePair.Builder();
        if (model.contains(subjectToParse, AASNamespace.ValueReferencePair.valueId)) {
            Reference reference = new DefaultReferenceRDFHandler().fromModel(model,
                    model.getProperty(subjectToParse, AASNamespace.ValueReferencePair.valueId).getResource());
            builder.valueId(reference);
        }
        if (model.contains(subjectToParse, AASNamespace.ValueReferencePair.value)) {
            builder.value(model.getProperty(subjectToParse, AASNamespace.ValueReferencePair.value).getString());
        }
        return builder.build();
    }
}
