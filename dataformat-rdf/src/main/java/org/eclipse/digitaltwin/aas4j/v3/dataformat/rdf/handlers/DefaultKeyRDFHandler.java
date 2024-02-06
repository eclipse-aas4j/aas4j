package org.eclipse.digitaltwin.aas4j.v3.dataformat.rdf.handlers;

import org.apache.jena.rdf.model.Model;
import org.apache.jena.rdf.model.ModelFactory;
import org.apache.jena.rdf.model.Resource;
import org.apache.jena.rdf.model.ResourceFactory;
import org.apache.jena.vocabulary.RDF;
import org.eclipse.digitaltwin.aas4j.v3.dataformat.rdf.AASNamespace;
import org.eclipse.digitaltwin.aas4j.v3.dataformat.rdf.DefaultRDFHandlerResult;
import org.eclipse.digitaltwin.aas4j.v3.dataformat.rdf.RDFHandler;
import org.eclipse.digitaltwin.aas4j.v3.dataformat.rdf.RDFSerializationResult;
import org.eclipse.digitaltwin.aas4j.v3.model.Key;
import org.eclipse.digitaltwin.aas4j.v3.model.KeyTypes;
import org.eclipse.digitaltwin.aas4j.v3.model.builder.KeyBuilder;
import org.eclipse.digitaltwin.aas4j.v3.model.impl.DefaultKey;

public class DefaultKeyRDFHandler implements RDFHandler<Key> {
    public RDFSerializationResult toModel(Key key) {
        Model model = ModelFactory.createDefaultModel();
        if (key == null) {
            return new DefaultRDFHandlerResult(model, ResourceFactory.createResource());
        }
        Resource subject = model.createResource();
        subject.addProperty(RDF.type, AASNamespace.Types.Key);
        subject.addProperty(AASNamespace.Key.value, key.getValue());
        subject.addProperty(AASNamespace.Key.type, AASNamespace.KeyTypes.valueOf(key.getType().name()));
        return new DefaultRDFHandlerResult(model, subject);
    }

    public Key fromModel(Model model, Resource subjectToParse) {
        if (model.contains(subjectToParse, RDF.type, AASNamespace.Types.Key) == false) {
            throw new IllegalArgumentException("Provided Resource is not a Key");
        }
        String value = model.getProperty(subjectToParse, AASNamespace.Key.value).getString();
        KeyTypes type = AASNamespace.KeyTypes.fromIRI(model.getProperty(subjectToParse, AASNamespace.Key.type).getResource().getURI());
        KeyBuilder<DefaultKey, DefaultKey.Builder> builder = new DefaultKey.Builder();
        //Todo: in future instead of specific builder we can use a generic builder instantiator
        return builder.type(type)
                .value(value)
                .build();
    }
}
