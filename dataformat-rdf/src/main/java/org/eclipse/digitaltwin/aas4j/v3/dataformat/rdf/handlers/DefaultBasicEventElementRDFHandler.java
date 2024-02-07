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
import org.eclipse.digitaltwin.aas4j.v3.model.BasicEventElement;
import org.eclipse.digitaltwin.aas4j.v3.model.Reference;
import org.eclipse.digitaltwin.aas4j.v3.model.impl.DefaultBasicEventElement;

public class DefaultBasicEventElementRDFHandler implements RDFHandler<BasicEventElement> {
    @Override
    public RDFSerializationResult toModel(BasicEventElement object) {
        Model model = ModelFactory.createDefaultModel();
        if (object == null) {
            return new DefaultRDFHandlerResult(model, ResourceFactory.createResource());
        }
        Resource subject = model.createResource();
        model.add(subject, RDF.type, AASNamespace.Types.BasicEventElement);
        if (object.getDirection() != null) {
            model.add(subject, AASNamespace.BasicEventElement.direction,
                    AASNamespace.Direction.valueOf(object.getDirection().name()));
        }
        if (object.getLastUpdate() != null) {
            model.add(subject, AASNamespace.BasicEventElement.lastUpdate, object.getLastUpdate());
        }
        if (object.getMaxInterval() != null) {
            model.add(subject, AASNamespace.BasicEventElement.maxInterval, object.getMaxInterval());
        }
        if (object.getMinInterval() != null) {
            model.add(subject, AASNamespace.BasicEventElement.minInterval, object.getMinInterval());
        }
        if (object.getMessageTopic() != null) {
            model.add(subject, AASNamespace.BasicEventElement.messageTopic, object.getMessageTopic());
        }
        if (object.getMessageBroker() != null) {
            RDFSerializationResult res = new DefaultReferenceRDFHandler().toModel(object.getMessageBroker());
            model.add(subject, AASNamespace.BasicEventElement.messageBroker, res.getResource());
            model.add(res.getModel());
        }
        if (object.getState() != null) {
            model.add(subject, AASNamespace.BasicEventElement.state,
                    AASNamespace.StateOfEvent.valueOf(object.getState().name()));
        }
        if (object.getObserved() != null) {
            RDFSerializationResult res = new DefaultReferenceRDFHandler().toModel(object.getObserved());
            model.add(subject, AASNamespace.BasicEventElement.observed, res.getResource());
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
    public BasicEventElement fromModel(Model model, Resource subjectToParse) throws IncompatibleTypeException {
        if (!model.contains(subjectToParse, RDF.type, AASNamespace.Types.BasicEventElement)) {
            throw new IncompatibleTypeException("Capability");
        }
        DefaultBasicEventElement.Builder builder = new DefaultBasicEventElement.Builder();
        if (model.contains(subjectToParse, AASNamespace.BasicEventElement.state)) {
            Resource resource = model.getProperty(subjectToParse, AASNamespace.BasicEventElement.state).getResource();
            builder.state(AASNamespace.StateOfEvent.fromIRI(resource.getURI()));
        }
        if (model.contains(subjectToParse, AASNamespace.BasicEventElement.observed)) {
            Resource resource = model.getProperty(subjectToParse, AASNamespace.BasicEventElement.observed).getResource();
            Reference reference = new DefaultReferenceRDFHandler().fromModel(model, resource);
            builder.observed(reference);
        }
        if (model.contains(subjectToParse, AASNamespace.BasicEventElement.messageBroker)) {
            Resource resource = model.getProperty(subjectToParse, AASNamespace.BasicEventElement.messageBroker).getResource();
            Reference reference = new DefaultReferenceRDFHandler().fromModel(model, resource);
            builder.messageBroker(reference);
        }
        if (model.contains(subjectToParse, AASNamespace.BasicEventElement.messageTopic)) {
            builder.messageTopic(model.getProperty(subjectToParse, AASNamespace.BasicEventElement.messageTopic).getString());
        }
        if (model.contains(subjectToParse, AASNamespace.BasicEventElement.direction)) {
            Resource resource = model.getProperty(subjectToParse, AASNamespace.BasicEventElement.direction).getResource();
            builder.direction(AASNamespace.Direction.fromIRI(resource.getURI()));
        }
        if (model.contains(subjectToParse, AASNamespace.BasicEventElement.minInterval)) {
            builder.minInterval(model.getProperty(subjectToParse, AASNamespace.BasicEventElement.minInterval).getString());
        }
        if (model.contains(subjectToParse, AASNamespace.BasicEventElement.maxInterval)) {
            builder.maxInterval(model.getProperty(subjectToParse, AASNamespace.BasicEventElement.maxInterval).getString());
        }
        if (model.contains(subjectToParse, AASNamespace.BasicEventElement.lastUpdate)) {
            builder.lastUpdate(model.getProperty(subjectToParse, AASNamespace.BasicEventElement.lastUpdate).getString());
        }
        BasicEventElement object = builder.build();
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
