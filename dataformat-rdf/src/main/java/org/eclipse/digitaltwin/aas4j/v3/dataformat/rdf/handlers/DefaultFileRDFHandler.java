package org.eclipse.digitaltwin.aas4j.v3.dataformat.rdf.handlers;

import org.apache.jena.rdf.model.Model;
import org.apache.jena.rdf.model.ModelFactory;
import org.apache.jena.rdf.model.Resource;
import org.apache.jena.rdf.model.ResourceFactory;
import org.apache.jena.vocabulary.RDF;
import org.eclipse.digitaltwin.aas4j.v3.dataformat.rdf.*;
import org.eclipse.digitaltwin.aas4j.v3.dataformat.rdf.handlers.partial.DefaultHasDataSpecificationRDFPartialHandler;
import org.eclipse.digitaltwin.aas4j.v3.dataformat.rdf.handlers.partial.DefaultHasSemanticsRDFPartialHandler;
import org.eclipse.digitaltwin.aas4j.v3.dataformat.rdf.handlers.partial.DefaultQualifiableRDFPartialHandler;
import org.eclipse.digitaltwin.aas4j.v3.dataformat.rdf.handlers.partial.DefaultReferableRDFPartialHandler;
import org.eclipse.digitaltwin.aas4j.v3.model.File;
import org.eclipse.digitaltwin.aas4j.v3.model.impl.DefaultFile;

public class DefaultFileRDFHandler implements RDFHandler<File> {
    @Override
    public RDFSerializationResult toModel(File object) {
        Model model = ModelFactory.createDefaultModel();
        if (object == null) {
            return new DefaultRDFHandlerResult(model, ResourceFactory.createResource());
        }
        Resource subject = model.createResource();
        model.add(subject, RDF.type, AASNamespace.Types.File);
        if (object.getValue() != null) {
            model.add(subject, AASNamespace.File.value, object.getValue());
        }
        if (object.getContentType() != null) {
            model.add(subject, AASNamespace.File.contentType, object.getContentType());
        }
        //HasDataSpecification
        new DefaultHasDataSpecificationRDFPartialHandler().partialToModel(object, model, subject);
        //HasSemantics
        new DefaultHasSemanticsRDFPartialHandler().partialToModel(object, model, subject);
        //Qualifiable
        new DefaultQualifiableRDFPartialHandler().partialToModel(object, model, subject);
        //Referable
        new DefaultReferableRDFPartialHandler().partialToModel(object, model, subject);
        return new DefaultRDFHandlerResult(model, subject);
    }

    @Override
    public File fromModel(Model model, Resource subjectToParse) throws IncompatibleTypeException {
        if (!model.contains(subjectToParse, RDF.type, AASNamespace.Types.File)) {
            throw new IncompatibleTypeException("File");
        }
        DefaultFile.Builder builder = new DefaultFile.Builder();

        if (model.contains(subjectToParse, AASNamespace.File.value)) {
            builder.value(model.getProperty(subjectToParse, AASNamespace.File.value).getString());
        }
        if (model.contains(subjectToParse, AASNamespace.File.contentType)) {
            builder.contentType(model.getProperty(subjectToParse, AASNamespace.File.contentType).getString());
        }
        File object = builder.build();
        //HasDataSpecification
        new DefaultHasDataSpecificationRDFPartialHandler().partialFromModel(object, model, subjectToParse);
        //HasSemantics
        new DefaultHasSemanticsRDFPartialHandler().partialFromModel(object, model, subjectToParse);
        //Qualifiable
        new DefaultQualifiableRDFPartialHandler().partialFromModel(object, model, subjectToParse);
        //Referable
        new DefaultReferableRDFPartialHandler().partialFromModel(object, model, subjectToParse);
        return object;
    }
}
