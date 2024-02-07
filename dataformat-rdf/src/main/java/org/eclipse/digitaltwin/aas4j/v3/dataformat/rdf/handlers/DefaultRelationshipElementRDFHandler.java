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
import org.eclipse.digitaltwin.aas4j.v3.model.Reference;
import org.eclipse.digitaltwin.aas4j.v3.model.RelationshipElement;
import org.eclipse.digitaltwin.aas4j.v3.model.impl.DefaultRelationshipElement;

public class DefaultRelationshipElementRDFHandler implements RDFHandler<RelationshipElement> {
    @Override
    public RDFSerializationResult toModel(RelationshipElement object) {
        Model model = ModelFactory.createDefaultModel();
        if (object == null) {
            return new DefaultRDFHandlerResult(model, ResourceFactory.createResource());
        }
        Resource subject = model.createResource();
        model.add(subject, RDF.type, AASNamespace.Types.RelationshipElement);
        if (object.getFirst() != null) {
            RDFSerializationResult res = new DefaultReferenceRDFHandler().toModel(object.getFirst());
            model.add(subject, AASNamespace.RelationshipElement.first, res.getResource());
            model.add(res.getModel());
        }
        if (object.getSecond() != null) {
            RDFSerializationResult res = new DefaultReferenceRDFHandler().toModel(object.getSecond());
            model.add(subject, AASNamespace.RelationshipElement.second, res.getResource());
            model.add(res.getModel());
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
    public RelationshipElement fromModel(Model model, Resource subjectToParse) throws IncompatibleTypeException {
        if (!model.contains(subjectToParse, RDF.type, AASNamespace.Types.RelationshipElement)) {
            throw new IncompatibleTypeException("Capability");
        }
        DefaultRelationshipElement.Builder builder = new DefaultRelationshipElement.Builder();
        if (model.contains(subjectToParse, AASNamespace.RelationshipElement.second)) {
            Resource resource = model.getProperty(subjectToParse, AASNamespace.RelationshipElement.first).getResource();
            Reference reference = new DefaultReferenceRDFHandler().fromModel(model, resource);
            builder.first(reference);
        }
        if (model.contains(subjectToParse, AASNamespace.RelationshipElement.second)) {
            Resource resource = model.getProperty(subjectToParse, AASNamespace.RelationshipElement.second).getResource();
            Reference reference = new DefaultReferenceRDFHandler().fromModel(model, resource);
            builder.second(reference);
        }
        RelationshipElement object = builder.build();
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
