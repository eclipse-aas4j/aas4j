package org.eclipse.digitaltwin.aas4j.v3.dataformat.rdf.handlers;

import org.apache.jena.rdf.model.Model;
import org.apache.jena.rdf.model.ModelFactory;
import org.apache.jena.rdf.model.Resource;
import org.apache.jena.rdf.model.ResourceFactory;
import org.apache.jena.vocabulary.RDF;
import org.eclipse.digitaltwin.aas4j.v3.dataformat.rdf.*;
import org.eclipse.digitaltwin.aas4j.v3.dataformat.rdf.handlers.partial.DefaultHasSemanticsRDFPartialHandler;
import org.eclipse.digitaltwin.aas4j.v3.model.Qualifier;
import org.eclipse.digitaltwin.aas4j.v3.model.Reference;
import org.eclipse.digitaltwin.aas4j.v3.model.impl.DefaultQualifier;

public class DefaultQualifierRDFHandler implements RDFHandler<Qualifier> {
    @Override
    public RDFSerializationResult toModel(Qualifier object) {
        Model model = ModelFactory.createDefaultModel();
        if (object == null) {
            return new DefaultRDFHandlerResult(model, ResourceFactory.createResource());
        }
        Resource subject = model.createResource();
        model.add(subject, RDF.type, AASNamespace.Types.Qualifier);
        if (object.getKind() != null) {
            model.add(subject, AASNamespace.Qualifier.kind,
                    AASNamespace.QualifierKind.valueOf(object.getKind().name()));
        }
        if (object.getType() != null) {
            model.add(subject, AASNamespace.Qualifier.type, object.getType());
        }
        if (object.getValue() != null) {
            model.add(subject, AASNamespace.Qualifier.value, object.getValue());
        }
        if (object.getValueId() != null) {
            RDFSerializationResult res = new DefaultReferenceRDFHandler().toModel(object.getValueId());
            model.add(subject, AASNamespace.Qualifier.valueId, res.getResource());
            model.add(res.getModel());
        }
        if (object.getValueType() != null) {
            model.add(subject, AASNamespace.Qualifier.valueType,
                    AASNamespace.DataTypeDefXsd.valueOf(object.getValueType().name()));
        }

        //HasSemantics
        new DefaultHasSemanticsRDFPartialHandler().partialToModel(object, model, subject);

        return new DefaultRDFHandlerResult(model, subject);
    }

    @Override
    public Qualifier fromModel(Model model, Resource subjectToParse) throws IncompatibleTypeException {
        if (!model.contains(subjectToParse, RDF.type, AASNamespace.Types.Qualifier)) {
            throw new IncompatibleTypeException("Qualifier");
        }
        DefaultQualifier.Builder builder = new DefaultQualifier.Builder();
        if (model.contains(subjectToParse, AASNamespace.Qualifier.kind)) {
            Resource resource = model.getProperty(subjectToParse, AASNamespace.Qualifier.kind).getResource();
            builder.kind(AASNamespace.QualifierKind.fromIRI(resource.getURI()));
        }
        if (model.contains(subjectToParse, AASNamespace.Qualifier.type)) {
            builder.type(model.getProperty(subjectToParse, AASNamespace.Qualifier.type).getString());
        }
        if (model.contains(subjectToParse, AASNamespace.Qualifier.value)) {
            builder.value(model.getProperty(subjectToParse, AASNamespace.Qualifier.value).getString());
        }
        if (model.contains(subjectToParse, AASNamespace.Qualifier.valueId)) {
            Resource resource = model.getProperty(subjectToParse, AASNamespace.Qualifier.valueId).getResource();
            Reference reference = new DefaultReferenceRDFHandler().fromModel(model, resource);
            builder.valueId(reference);
        }
        if (model.contains(subjectToParse, AASNamespace.Qualifier.valueType)) {
            Resource resource = model.getProperty(subjectToParse, AASNamespace.Qualifier.valueType).getResource();
            builder.valueType(AASNamespace.DataTypeDefXsd.fromIRI(resource.getURI()));
        }
        //HasSemantics
        Qualifier object = builder.build();
        new DefaultHasSemanticsRDFPartialHandler().partialFromModel(object, model, subjectToParse);
        return object;
    }
}
