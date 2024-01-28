package org.eclipse.digitaltwin.aas4j.v3.dataformat.rdf.handlers;

import org.apache.jena.rdf.model.Model;
import org.apache.jena.rdf.model.ModelFactory;
import org.apache.jena.rdf.model.Resource;
import org.apache.jena.rdf.model.ResourceFactory;
import org.apache.jena.vocabulary.RDF;
import org.eclipse.digitaltwin.aas4j.v3.dataformat.rdf.*;
import org.eclipse.digitaltwin.aas4j.v3.model.LangStringNameType;
import org.eclipse.digitaltwin.aas4j.v3.model.impl.DefaultLangStringNameType;

public class DefaultLangStringNameTypeRDFHandler implements RDFHandler<LangStringNameType> {

    @Override
    public RDFSerializationResult toModel(LangStringNameType object) {
        Model model = ModelFactory.createDefaultModel();
        if (object == null) {
            return new DefaultRDFHandlerResult(model, ResourceFactory.createResource());
        }
        Resource subject = model.createResource();
        model.add(subject, RDF.type, AASNamespace.Types.LangStringNameType);
        model.addLiteral(subject, AASNamespace.AbstractLangString.language, object.getLanguage());
        model.addLiteral(subject, AASNamespace.AbstractLangString.text, object.getText());
        return new DefaultRDFHandlerResult(model, subject);
    }

    @Override
    public LangStringNameType fromModel(Model model, Resource subjectToParse) throws IncompatibleTypeException {
        if (model.contains(subjectToParse, RDF.type, AASNamespace.Types.LangStringNameType) == false) {
            throw new IllegalArgumentException("Provided Resource is not a LangStringNameType");
        }

        return new DefaultLangStringNameType.Builder()
                .text(model.getProperty(subjectToParse, AASNamespace.AbstractLangString.text).getString())
                .language(model.getProperty(subjectToParse, AASNamespace.AbstractLangString.language).getString())
                .build();
    }
}