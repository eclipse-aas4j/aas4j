package org.eclipse.digitaltwin.aas4j.v3.dataformat.rdf.handlers.dataspecificationiec61360;

import org.apache.jena.rdf.model.Model;
import org.apache.jena.rdf.model.ModelFactory;
import org.apache.jena.rdf.model.Resource;
import org.apache.jena.rdf.model.ResourceFactory;
import org.apache.jena.vocabulary.RDF;
import org.eclipse.digitaltwin.aas4j.v3.dataformat.rdf.*;
import org.eclipse.digitaltwin.aas4j.v3.model.LangStringDefinitionTypeIec61360;
import org.eclipse.digitaltwin.aas4j.v3.model.impl.DefaultLangStringDefinitionTypeIec61360;

public class DefaultLangStringDefinitionTypeIec61360RDFHandler implements RDFHandler<LangStringDefinitionTypeIec61360> {
    @Override
    public RDFSerializationResult toModel(LangStringDefinitionTypeIec61360 object) {
        Model model = ModelFactory.createDefaultModel();
        if (object == null) {
            return new DefaultRDFHandlerResult(model, ResourceFactory.createResource());
        }
        Resource subject = model.createResource();
        model.add(subject, RDF.type, AASNamespace.Types.LangStringDefinitionTypeIec61360);
        model.addLiteral(subject, AASNamespace.AbstractLangString.language, object.getLanguage());
        model.addLiteral(subject, AASNamespace.AbstractLangString.text, object.getText());
        return new DefaultRDFHandlerResult(model, subject);
    }

    @Override
    public LangStringDefinitionTypeIec61360 fromModel(Model model, Resource subjectToParse) throws IncompatibleTypeException {
        if (model.contains(subjectToParse, RDF.type, AASNamespace.Types.LangStringDefinitionTypeIec61360) == false) {
            throw new IllegalArgumentException("Provided Resource is not a LangStringDefinitionTypeIec61360");
        }

        return new DefaultLangStringDefinitionTypeIec61360.Builder()
                .text(model.getProperty(subjectToParse, AASNamespace.AbstractLangString.text).getString())
                .language(model.getProperty(subjectToParse, AASNamespace.AbstractLangString.language).getString())
                .build();
    }
}