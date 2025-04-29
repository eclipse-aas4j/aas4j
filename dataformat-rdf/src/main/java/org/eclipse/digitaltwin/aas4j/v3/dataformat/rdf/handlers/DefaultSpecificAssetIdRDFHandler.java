package org.eclipse.digitaltwin.aas4j.v3.dataformat.rdf.handlers;

import org.apache.jena.rdf.model.Model;
import org.apache.jena.rdf.model.ModelFactory;
import org.apache.jena.rdf.model.Resource;
import org.apache.jena.rdf.model.ResourceFactory;
import org.apache.jena.vocabulary.RDF;
import org.eclipse.digitaltwin.aas4j.v3.dataformat.rdf.*;
import org.eclipse.digitaltwin.aas4j.v3.dataformat.rdf.handlers.partial.DefaultHasSemanticsRDFPartialHandler;
import org.eclipse.digitaltwin.aas4j.v3.model.Reference;
import org.eclipse.digitaltwin.aas4j.v3.model.SpecificAssetId;
import org.eclipse.digitaltwin.aas4j.v3.model.impl.DefaultSpecificAssetId;

public class DefaultSpecificAssetIdRDFHandler implements RDFHandler<SpecificAssetId> {
    @Override
    public RDFSerializationResult toModel(SpecificAssetId object) {
        Model model = ModelFactory.createDefaultModel();
        if (object == null) {
            return new DefaultRDFHandlerResult(model, ResourceFactory.createResource());
        }
        Resource subject = model.createResource();
        model.add(subject, RDF.type, AASNamespace.Types.SpecificAssetId);
        if (object.getName() != null) {
            model.add(subject, AASNamespace.SpecificAssetId.name, object.getName());
        }
        if (object.getValue() != null) {
            model.add(subject, AASNamespace.SpecificAssetId.value, object.getValue());
        }
        if (object.getExternalSubjectId() != null) {
            RDFSerializationResult res = new DefaultReferenceRDFHandler().toModel(object.getExternalSubjectId());
            model.add(subject, AASNamespace.SpecificAssetId.externalSubjectId, res.getResource());
            model.add(res.getModel());
        }
        //HasSemantics
        new DefaultHasSemanticsRDFPartialHandler().partialToModel(object, model, subject);
        return new DefaultRDFHandlerResult(model, subject);
    }

    @Override
    public SpecificAssetId fromModel(Model model, Resource subjectToParse) throws IncompatibleTypeException {
        if (!model.contains(subjectToParse, RDF.type, AASNamespace.Types.SpecificAssetId)) {
            throw new IncompatibleTypeException("SpecificAssetId");
        }
        DefaultSpecificAssetId.Builder builder = new DefaultSpecificAssetId.Builder();
        if (model.contains(subjectToParse, AASNamespace.SpecificAssetId.name)) {
            builder.name(model.getProperty(subjectToParse,
                    AASNamespace.SpecificAssetId.name).getString());
        }
        if (model.contains(subjectToParse, AASNamespace.SpecificAssetId.value)) {
            builder.value(model.getProperty(subjectToParse,
                    AASNamespace.SpecificAssetId.value).getString());
        }
        if (model.contains(subjectToParse, AASNamespace.SpecificAssetId.externalSubjectId)) {
            Resource resource = model.getProperty(subjectToParse,
                    AASNamespace.SpecificAssetId.externalSubjectId).getResource();
            Reference reference = new DefaultReferenceRDFHandler().fromModel(model, resource);
            builder.externalSubjectId(reference);
        }
        //HasSemantics
        SpecificAssetId object = builder.build();
        new DefaultHasSemanticsRDFPartialHandler().partialFromModel(object, model, subjectToParse);
        return object;
    }
}
