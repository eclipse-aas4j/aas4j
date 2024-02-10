package org.eclipse.digitaltwin.aas4j.v3.dataformat.rdf.handlers;

import org.apache.jena.rdf.model.*;
import org.apache.jena.vocabulary.RDF;
import org.eclipse.digitaltwin.aas4j.v3.dataformat.rdf.*;
import org.eclipse.digitaltwin.aas4j.v3.dataformat.rdf.handlers.partial.DefaultHasDataSpecificationRDFPartialHandler;
import org.eclipse.digitaltwin.aas4j.v3.dataformat.rdf.handlers.partial.DefaultHasSemanticsRDFPartialHandler;
import org.eclipse.digitaltwin.aas4j.v3.dataformat.rdf.handlers.partial.DefaultQualifiableRDFPartialHandler;
import org.eclipse.digitaltwin.aas4j.v3.dataformat.rdf.handlers.partial.DefaultReferableRDFPartialHandler;
import org.eclipse.digitaltwin.aas4j.v3.model.AnnotatedRelationshipElement;
import org.eclipse.digitaltwin.aas4j.v3.model.DataElement;
import org.eclipse.digitaltwin.aas4j.v3.model.Reference;
import org.eclipse.digitaltwin.aas4j.v3.model.impl.DefaultAnnotatedRelationshipElement;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DefaultAnnotatedRelationshipElementRDFHandler implements RDFHandler<AnnotatedRelationshipElement> {
    @Override
    public RDFSerializationResult toModel(AnnotatedRelationshipElement object) {
        Model model = ModelFactory.createDefaultModel();
        if (object == null) {
            return new DefaultRDFHandlerResult(model, ResourceFactory.createResource());
        }
        Resource subject = model.createResource();
        model.add(subject, RDF.type, AASNamespace.Types.AnnotatedRelationshipElement);

        if (object.getAnnotations() != null && object.getAnnotations().isEmpty() == false) {
            int index = 0;
            for (DataElement item : object.getAnnotations()) {
                RDFSerializationResult resultItem = new DefaultSubmodelElementRDFHandler().toModel(item);
                resultItem.getResource().addLiteral(AASNamespace.index, index);
                model.add(subject, AASNamespace.AnnotatedRelationshipElement.annotations, resultItem.getResource());
                // It is important where to put model.add
                model.add(resultItem.getModel());
                index = index + 1;
            }
        }
        //RelationshipElement
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
    public AnnotatedRelationshipElement fromModel(Model model, Resource subjectToParse) throws IncompatibleTypeException {
        if (!model.contains(subjectToParse, RDF.type, AASNamespace.Types.AnnotatedRelationshipElement)) {
            throw new IncompatibleTypeException("AnnotatedRelationshipElement");
        }
        DefaultAnnotatedRelationshipElement.Builder builder = new DefaultAnnotatedRelationshipElement.Builder();

        if (model.contains(subjectToParse, AASNamespace.AnnotatedRelationshipElement.annotations)) {
            NodeIterator nodeIterator = model.listObjectsOfProperty(subjectToParse, AASNamespace.AnnotatedRelationshipElement.annotations);
            Map<Integer, DataElement> keysMap = new HashMap<>();
            nodeIterator.forEachRemaining(node -> {
                DataElement key = null;
                try {
                    //TODO: catch exception for cast or introduce new RDF handler
                    key = (DataElement) new DefaultSubmodelElementRDFHandler().fromModel(model, node.asResource());
                } catch (IncompatibleTypeException e) {
                    throw new RuntimeException(e);
                }
                int index = model.getProperty(node.asResource(), AASNamespace.index).getInt();
                keysMap.put(index, key);
            });
            if (keysMap.isEmpty() == false) {
                List<DataElement> dataElements = new ArrayList<>();
                for (int index = 0; index < keysMap.keySet().size(); index++) {
                    dataElements.add(keysMap.get(index));
                }
                builder.annotations(dataElements);
            }
        }
        //RelationshipElement
        if (model.contains(subjectToParse, AASNamespace.RelationshipElement.first)) {
            Resource resource = model.getProperty(subjectToParse, AASNamespace.RelationshipElement.first).getResource();
            Reference reference = new DefaultReferenceRDFHandler().fromModel(model, resource);
            builder.first(reference);
        }
        if (model.contains(subjectToParse, AASNamespace.RelationshipElement.second)) {
            Resource resource = model.getProperty(subjectToParse, AASNamespace.RelationshipElement.second).getResource();
            Reference reference = new DefaultReferenceRDFHandler().fromModel(model, resource);
            builder.second(reference);
        }
        AnnotatedRelationshipElement object = builder.build();
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
