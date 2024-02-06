package org.eclipse.digitaltwin.aas4j.v3.dataformat.rdf.handlers;

import org.apache.jena.rdf.model.Model;
import org.apache.jena.rdf.model.ModelFactory;
import org.apache.jena.rdf.model.Resource;
import org.apache.jena.rdf.model.ResourceFactory;
import org.apache.jena.vocabulary.RDF;
import org.eclipse.digitaltwin.aas4j.v3.dataformat.rdf.*;
import org.eclipse.digitaltwin.aas4j.v3.model.LangStringTextType;
import org.eclipse.digitaltwin.aas4j.v3.model.impl.DefaultLangStringTextType;

public class DefaultLangStringTextTypeRDFHandler implements RDFHandler<LangStringTextType> {
    @Override
    public RDFSerializationResult toModel(LangStringTextType object) {
        Model model = ModelFactory.createDefaultModel();
        if (object == null) {
            return new DefaultRDFHandlerResult(model, ResourceFactory.createResource());
        }
        Resource subject = model.createResource();
        model.add(subject, RDF.type, AASNamespace.Types.LangStringTextType);
        if (object.getLanguage() != null) {
            model.addLiteral(subject, AASNamespace.AbstractLangString.language, object.getLanguage());
        }
        if (object.getText() != null) {
            model.addLiteral(subject, AASNamespace.AbstractLangString.text, object.getText());
        }
        return new DefaultRDFHandlerResult(model, subject);
    }

    @Override
    public LangStringTextType fromModel(Model model, Resource subjectToParse) throws IncompatibleTypeException {
        if (!model.contains(subjectToParse, RDF.type, AASNamespace.Types.LangStringTextType)) {
            throw new IllegalArgumentException("Provided Resource is not a LangStringTextType");
        }
        DefaultLangStringTextType.Builder builder = new DefaultLangStringTextType.Builder();
        if (model.contains(subjectToParse, AASNamespace.AbstractLangString.text)) {
            builder.text(model.getProperty(subjectToParse, AASNamespace.AbstractLangString.text).getString());
        }
        if (model.contains(subjectToParse, AASNamespace.AbstractLangString.language)) {
            builder.language(model.getProperty(subjectToParse, AASNamespace.AbstractLangString.language).getString());
        }
        return builder.build();
    }
}
