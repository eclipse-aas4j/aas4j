package org.eclipse.digitaltwin.aas4j.v3.dataformat.rdf.handlers;

import org.apache.jena.rdf.model.*;
import org.apache.jena.vocabulary.RDF;
import org.eclipse.digitaltwin.aas4j.v3.dataformat.rdf.*;
import org.eclipse.digitaltwin.aas4j.v3.dataformat.rdf.handlers.partial.DefaultHasDataSpecificationRDFPartialHandler;
import org.eclipse.digitaltwin.aas4j.v3.dataformat.rdf.handlers.partial.DefaultHasSemanticsRDFPartialHandler;
import org.eclipse.digitaltwin.aas4j.v3.dataformat.rdf.handlers.partial.DefaultQualifiableRDFPartialHandler;
import org.eclipse.digitaltwin.aas4j.v3.dataformat.rdf.handlers.partial.DefaultReferableRDFPartialHandler;
import org.eclipse.digitaltwin.aas4j.v3.model.Entity;
import org.eclipse.digitaltwin.aas4j.v3.model.SpecificAssetId;
import org.eclipse.digitaltwin.aas4j.v3.model.SubmodelElement;
import org.eclipse.digitaltwin.aas4j.v3.model.impl.DefaultEntity;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DefaultEntityRDFHandler implements RDFHandler<Entity> {
    @Override
    public RDFSerializationResult toModel(Entity object) {
        Model model = ModelFactory.createDefaultModel();
        if (object == null) {
            return new DefaultRDFHandlerResult(model, ResourceFactory.createResource());
        }
        Resource subject = model.createResource();
        model.add(subject, RDF.type, AASNamespace.Types.Entity);
        if (object.getEntityType() != null) {
            model.add(subject, AASNamespace.Entity.entityType, AASNamespace.EntityType.valueOf(object.getEntityType().name()));
        }
        if (object.getStatements() != null) {
            int index = 0;
            for (SubmodelElement item : object.getStatements()) {
                RDFSerializationResult resultItem = new DefaultSubmodelElementRDFHandler().toModel(item);
                resultItem.getResource().addLiteral(AASNamespace.index, index);
                model.add(subject, AASNamespace.Entity.statements, resultItem.getResource());
                // It is important where to put model.add
                model.add(resultItem.getModel());
                index = index + 1;
            }
        }
        if (object.getGlobalAssetId() != null) {
            model.add(subject, AASNamespace.Entity.globalAssetId, object.getGlobalAssetId());
        }
        if (object.getSpecificAssetIds() != null && object.getSpecificAssetIds().isEmpty() == false) {
            int index = 0;
            for (SpecificAssetId item : object.getSpecificAssetIds()) {
                RDFSerializationResult resultItem = new DefaultSpecificAssetIdRDFHandler().toModel(item);
                resultItem.getResource().addLiteral(AASNamespace.index, index);
                model.add(subject, AASNamespace.Entity.specificAssetIds, resultItem.getResource());
                // It is important where to put model.add
                model.add(resultItem.getModel());
                index = index + 1;
            }
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
    public Entity fromModel(Model model, Resource subjectToParse) throws IncompatibleTypeException {
        if (!model.contains(subjectToParse, RDF.type, AASNamespace.Types.Entity)) {
            throw new IncompatibleTypeException("Entity");
        }
        DefaultEntity.Builder builder = new DefaultEntity.Builder();
        if (model.contains(subjectToParse, AASNamespace.Entity.statements)) {
            NodeIterator nodeIterator = model.listObjectsOfProperty(subjectToParse, AASNamespace.Entity.statements);
            Map<Integer, SubmodelElement> keysMap = new HashMap<>();
            nodeIterator.forEachRemaining(node -> {
                SubmodelElement key = null;
                try {
                    key = new DefaultSubmodelElementRDFHandler().fromModel(model, node.asResource());
                    int index = model.getProperty(node.asResource(), AASNamespace.index).getInt();
                    keysMap.put(index, key);
                } catch (IncompatibleTypeException e) {
                    throw new RuntimeException(e);
                }
            });
            if (keysMap.isEmpty() == false) {
                List<SubmodelElement> submodelElements = new ArrayList<>();
                for (int index = 0; index < keysMap.keySet().size(); index++) {
                    submodelElements.add(keysMap.get(index));
                }
                builder.statements(submodelElements);
            }
        }
        if (model.contains(subjectToParse, AASNamespace.Entity.globalAssetId)) {
            builder.globalAssetId(model.getProperty(subjectToParse, AASNamespace.Entity.globalAssetId).getString());
        }
        if (model.contains(subjectToParse, AASNamespace.Entity.entityType)) {
            Resource resource = model.getProperty(subjectToParse, AASNamespace.Entity.entityType).getResource();
            builder.entityType(AASNamespace.EntityType.fromIRI(resource.getURI()));
        }
        if (model.contains(subjectToParse, AASNamespace.Entity.specificAssetIds)) {
            NodeIterator nodeIterator = model.listObjectsOfProperty(subjectToParse, AASNamespace.Entity.specificAssetIds);
            Map<Integer, SpecificAssetId> keysMap = new HashMap<>();
            nodeIterator.forEachRemaining(node -> {
                SpecificAssetId key = null;
                try {
                    key = new DefaultSpecificAssetIdRDFHandler().fromModel(model, node.asResource());
                    int index = model.getProperty(node.asResource(), AASNamespace.index).getInt();
                    keysMap.put(index, key);
                } catch (IncompatibleTypeException e) {
                    throw new RuntimeException(e);
                }
            });
            if (keysMap.isEmpty() == false) {
                List<SpecificAssetId> specificAssetIds = new ArrayList<>();
                for (int index = 0; index < keysMap.keySet().size(); index++) {
                    specificAssetIds.add(keysMap.get(index));
                }
                builder.specificAssetIds(specificAssetIds);
            }
        }
        Entity object = builder.build();
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
