package org.eclipse.digitaltwin.aas4j.v3.dataformat.rdf.handlers;

import org.apache.jena.rdf.model.Model;
import org.apache.jena.rdf.model.ModelFactory;
import org.apache.jena.rdf.model.Resource;
import org.apache.jena.rdf.model.ResourceFactory;
import org.apache.jena.vocabulary.RDF;
import org.eclipse.digitaltwin.aas4j.v3.dataformat.rdf.*;
import org.eclipse.digitaltwin.aas4j.v3.model.Key;
import org.eclipse.digitaltwin.aas4j.v3.model.KeyTypes;
import org.eclipse.digitaltwin.aas4j.v3.model.impl.DefaultKey;

public class DefaultKeyRDFHandler implements RDFHandler<Key> {
    public RDFSerializationResult toModel(Key key) {
        Model model = ModelFactory.createDefaultModel();
        if (key == null) {
            return new DefaultRDFHandlerResult(model, ResourceFactory.createResource());
        }
        Resource subject = model.createResource();
        subject.addProperty(RDF.type, AASNamespace.Types.Key);
        if (key.getValue() != null) {
            subject.addProperty(AASNamespace.Key.value, key.getValue());
        }
        if (key.getType() != null) {
            subject.addProperty(AASNamespace.Key.type, AASNamespace.KeyTypes.valueOf(key.getType().name()));
        }
        return new DefaultRDFHandlerResult(model, subject);
    }

    public Key fromModel(Model model, Resource subjectToParse) throws IncompatibleTypeException {
        if (!model.contains(subjectToParse, RDF.type, AASNamespace.Types.Key)) {
            throw new IncompatibleTypeException("Key");
        }
        DefaultKey.Builder builder = new DefaultKey.Builder();
        if (model.contains(subjectToParse, AASNamespace.Key.value)) {
            String value = model.getProperty(subjectToParse, AASNamespace.Key.value).getString();
            builder.value(value);
        }
        if (model.contains(subjectToParse, AASNamespace.Key.type)) {
            KeyTypes type = AASNamespace.KeyTypes.fromIRI(model.getProperty(subjectToParse, AASNamespace.Key.type).getResource().getURI());
            builder.type(type);
        }
        //Todo: in future instead of specific builder we can use a generic builder instantiator
        return builder.build();
    }
}
