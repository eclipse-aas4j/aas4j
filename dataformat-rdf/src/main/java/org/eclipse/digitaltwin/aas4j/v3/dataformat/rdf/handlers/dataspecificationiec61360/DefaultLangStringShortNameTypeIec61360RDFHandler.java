package org.eclipse.digitaltwin.aas4j.v3.dataformat.rdf.handlers.dataspecificationiec61360;

import org.apache.jena.rdf.model.Model;
import org.apache.jena.rdf.model.ModelFactory;
import org.apache.jena.rdf.model.Resource;
import org.apache.jena.rdf.model.ResourceFactory;
import org.apache.jena.vocabulary.RDF;
import org.eclipse.digitaltwin.aas4j.v3.dataformat.rdf.*;
import org.eclipse.digitaltwin.aas4j.v3.model.LangStringShortNameTypeIec61360;
import org.eclipse.digitaltwin.aas4j.v3.model.impl.DefaultLangStringShortNameTypeIec61360;

public class DefaultLangStringShortNameTypeIec61360RDFHandler implements RDFHandler<LangStringShortNameTypeIec61360> {
    @Override
    public RDFSerializationResult toModel(LangStringShortNameTypeIec61360 object) {
        Model model = ModelFactory.createDefaultModel();
        if (object == null) {
            return new DefaultRDFHandlerResult(model, ResourceFactory.createResource());
        }
        Resource subject = model.createResource();
        model.add(subject, RDF.type, AASNamespace.Types.LangStringShortNameTypeIec61360);
        if (object.getLanguage() != null) {
            model.addLiteral(subject, AASNamespace.AbstractLangString.language, object.getLanguage());
        }
        if (object.getText() != null) {
            model.addLiteral(subject, AASNamespace.AbstractLangString.text, object.getText());
        }
        return new DefaultRDFHandlerResult(model, subject);
    }

    @Override
    public LangStringShortNameTypeIec61360 fromModel(Model model, Resource subjectToParse) throws IncompatibleTypeException {
        if (!model.contains(subjectToParse, RDF.type, AASNamespace.Types.LangStringShortNameTypeIec61360)) {
            throw new IncompatibleTypeException("LangStringShortNameTypeIec61360");
        }
        DefaultLangStringShortNameTypeIec61360.Builder builder = new DefaultLangStringShortNameTypeIec61360.Builder();
        if (model.contains(subjectToParse, AASNamespace.AbstractLangString.text)) {
            builder.text(model.getProperty(subjectToParse, AASNamespace.AbstractLangString.text).getString());
        }
        if (model.contains(subjectToParse, AASNamespace.AbstractLangString.language)) {
            builder.language(model.getProperty(subjectToParse, AASNamespace.AbstractLangString.language).getString());
        }
        return builder.build();
    }
}
