package org.eclipse.digitaltwin.aas4j.v3.dataformat.rdf.handlers.dataspecificationiec61360;

import org.apache.jena.rdf.model.Model;
import org.apache.jena.rdf.model.ModelFactory;
import org.apache.jena.rdf.model.Resource;
import org.apache.jena.rdf.model.ResourceFactory;
import org.apache.jena.vocabulary.RDF;
import org.eclipse.digitaltwin.aas4j.v3.dataformat.rdf.*;
import org.eclipse.digitaltwin.aas4j.v3.model.LangStringPreferredNameTypeIec61360;
import org.eclipse.digitaltwin.aas4j.v3.model.impl.DefaultLangStringPreferredNameTypeIec61360;

public class DefaultLangStringPreferredNameTypeIec61360RDFHandler implements RDFHandler<LangStringPreferredNameTypeIec61360> {
    @Override
    public RDFSerializationResult toModel(LangStringPreferredNameTypeIec61360 object) {
        Model model = ModelFactory.createDefaultModel();
        if (object == null) {
            return new DefaultRDFHandlerResult(model, ResourceFactory.createResource());
        }
        Resource subject = model.createResource();
        model.add(subject, RDF.type, AASNamespace.Types.LangStringPreferredNameTypeIec61360);
        model.addLiteral(subject, AASNamespace.AbstractLangString.language, object.getLanguage());
        model.addLiteral(subject, AASNamespace.AbstractLangString.text, object.getText());
        return new DefaultRDFHandlerResult(model, subject);
    }

    @Override
    public LangStringPreferredNameTypeIec61360 fromModel(Model model, Resource subjectToParse) throws IncompatibleTypeException {
        if (model.contains(subjectToParse, RDF.type, AASNamespace.Types.LangStringPreferredNameTypeIec61360) == false) {
            throw new IllegalArgumentException("Provided Resource is not a LangStringPreferredNameTypeIec61360");
        }

        return new DefaultLangStringPreferredNameTypeIec61360.Builder()
                .text(model.getProperty(subjectToParse, AASNamespace.AbstractLangString.text).getString())
                .language(model.getProperty(subjectToParse, AASNamespace.AbstractLangString.language).getString())
                .build();
    }
}
