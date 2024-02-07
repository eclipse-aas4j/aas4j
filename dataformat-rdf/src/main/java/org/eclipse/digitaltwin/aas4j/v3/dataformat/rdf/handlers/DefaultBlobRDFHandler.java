package org.eclipse.digitaltwin.aas4j.v3.dataformat.rdf.handlers;

import org.apache.jena.datatypes.xsd.XSDDatatype;
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
import org.eclipse.digitaltwin.aas4j.v3.model.Blob;
import org.eclipse.digitaltwin.aas4j.v3.model.impl.DefaultBlob;

import java.util.Base64;

public class DefaultBlobRDFHandler implements RDFHandler<Blob> {
    @Override
    public RDFSerializationResult toModel(Blob object) {
        Model model = ModelFactory.createDefaultModel();
        if (object == null) {
            return new DefaultRDFHandlerResult(model, ResourceFactory.createResource());
        }
        Resource subject = model.createResource();
        model.add(subject, RDF.type, AASNamespace.Types.Blob);
        if (object.getValue() != null) {
            byte[] encoded = Base64.getEncoder().encode(object.getValue());
            String contentBase64 = new String(encoded);//Convert the content of the file to base64
            model.add(subject, AASNamespace.Blob.value, contentBase64, XSDDatatype.XSDbase64Binary);
        }
        if (object.getContentType() != null) {
            model.add(subject, AASNamespace.Blob.contentType, object.getContentType());
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
    public Blob fromModel(Model model, Resource subjectToParse) throws IncompatibleTypeException {
        if (!model.contains(subjectToParse, RDF.type, AASNamespace.Types.Blob)) {
            throw new IncompatibleTypeException("Blob");
        }
        DefaultBlob.Builder builder = new DefaultBlob.Builder();
        if (model.contains(subjectToParse, AASNamespace.Blob.value)) {
            String base64BinaryContent = model.getProperty(subjectToParse, AASNamespace.Blob.value).getString();
            builder.value(Base64.getDecoder().decode(base64BinaryContent));
        }
        if (model.contains(subjectToParse, AASNamespace.Blob.contentType)) {
            builder.contentType(model.getProperty(subjectToParse, AASNamespace.Blob.contentType).getString());
        }
        Blob object = builder.build();
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
