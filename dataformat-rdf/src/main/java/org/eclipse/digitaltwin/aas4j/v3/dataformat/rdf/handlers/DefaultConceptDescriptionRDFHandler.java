package org.eclipse.digitaltwin.aas4j.v3.dataformat.rdf.handlers;

import org.apache.jena.rdf.model.*;
import org.apache.jena.vocabulary.RDF;
import org.eclipse.digitaltwin.aas4j.v3.dataformat.rdf.*;
import org.eclipse.digitaltwin.aas4j.v3.dataformat.rdf.handlers.partial.DefaultHasDataSpecificationRDFPartialHandler;
import org.eclipse.digitaltwin.aas4j.v3.dataformat.rdf.handlers.partial.DefaultIdentifiableRDFPartialHandler;
import org.eclipse.digitaltwin.aas4j.v3.model.ConceptDescription;
import org.eclipse.digitaltwin.aas4j.v3.model.Reference;
import org.eclipse.digitaltwin.aas4j.v3.model.impl.DefaultConceptDescription;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DefaultConceptDescriptionRDFHandler implements RDFHandler<ConceptDescription> {

    @Override
    public RDFSerializationResult toModel(ConceptDescription object) {
        Model model = ModelFactory.createDefaultModel();
        if (object == null) {
            return new DefaultRDFHandlerResult(model, ResourceFactory.createResource());
        }
        Resource conceptDescriptionResource = model.createResource(object.getId());
        model.add(conceptDescriptionResource, RDF.type, AASNamespace.Types.ConceptDescription);

        if (object.getIsCaseOf() != null && !object.getIsCaseOf().isEmpty()) {
            int index = 0;
            for (Reference item : object.getIsCaseOf()) {
                RDFSerializationResult resultItem = new DefaultReferenceRDFHandler().toModel(item);
                resultItem.getResource().addLiteral(AASNamespace.index, index);
                model.add(conceptDescriptionResource, AASNamespace.ConceptDescription.isCaseOf, resultItem.getResource());
                // It is important where to put model.add
                model.add(resultItem.getModel());
                index = index + 1;
            }
        }


        //Identifiable
        new DefaultIdentifiableRDFPartialHandler().partialToModel(object, model, conceptDescriptionResource);
        //HasDataSpecification
        new DefaultHasDataSpecificationRDFPartialHandler().partialToModel(object, model, conceptDescriptionResource);
        return new DefaultRDFHandlerResult(model, conceptDescriptionResource);
    }

    @Override
    public ConceptDescription fromModel(Model model, Resource subjectToParse) throws IncompatibleTypeException {
        if (!model.contains(subjectToParse, RDF.type, AASNamespace.Types.ConceptDescription)) {
            throw new IncompatibleTypeException();
        }
        DefaultConceptDescription.Builder builder = new DefaultConceptDescription.Builder();

        if (model.contains(subjectToParse, AASNamespace.ConceptDescription.isCaseOf)) {
            NodeIterator nodeIterator = model.listObjectsOfProperty(subjectToParse, AASNamespace.ConceptDescription.isCaseOf);
            Map<Integer, Reference> keysMap = new HashMap<>();
            nodeIterator.forEachRemaining(node -> {
                Reference key = null;
                try {
                    key = new DefaultReferenceRDFHandler().fromModel(model, node.asResource());
                } catch (IncompatibleTypeException e) {
                    throw new RuntimeException(e);
                }
                int index = model.getProperty(node.asResource(), AASNamespace.index).getInt();
                keysMap.put(index, key);
            });
            if (keysMap.isEmpty() == false) {
                List<Reference> references = new ArrayList<>();
                for (int index = 0; index < keysMap.keySet().size(); index++) {
                    references.add(keysMap.get(index));
                }
                builder.isCaseOf(references);
            }
        }
        ConceptDescription object = builder.build();
        //Identifiable
        new DefaultIdentifiableRDFPartialHandler().partialFromModel(object, model, subjectToParse);
        //HasDataSpecification
        new DefaultHasDataSpecificationRDFPartialHandler().partialFromModel(object, model, subjectToParse);
        return object;
    }
}
