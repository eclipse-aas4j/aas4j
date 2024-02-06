package org.eclipse.digitaltwin.aas4j.v3.dataformat.rdf.handlers;

import org.apache.jena.rdf.model.*;
import org.apache.jena.vocabulary.RDF;
import org.eclipse.digitaltwin.aas4j.v3.dataformat.rdf.*;
import org.eclipse.digitaltwin.aas4j.v3.dataformat.rdf.handlers.partial.DefaultHasDataSpecificationRDFPartialHandler;
import org.eclipse.digitaltwin.aas4j.v3.dataformat.rdf.handlers.partial.DefaultIdentifiableRDFPartialHandler;
import org.eclipse.digitaltwin.aas4j.v3.model.AssetAdministrationShell;
import org.eclipse.digitaltwin.aas4j.v3.model.AssetInformation;
import org.eclipse.digitaltwin.aas4j.v3.model.Reference;
import org.eclipse.digitaltwin.aas4j.v3.model.impl.DefaultAssetAdministrationShell;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DefaultAssetAdministrationShellRDFHandler implements RDFHandler<AssetAdministrationShell> {
    @Override
    public RDFSerializationResult toModel(AssetAdministrationShell object) {
        Model model = ModelFactory.createDefaultModel();
        if (object == null) {
            return new DefaultRDFHandlerResult(model, ResourceFactory.createResource());
        }
        Resource subject = model.createResource();
        model.add(subject, RDF.type, AASNamespace.Types.AssetAdministrationShell);
        if (object.getAssetInformation() != null) {
            RDFSerializationResult res = new DefaultAssetInformationRDFHandler().toModel(object.getAssetInformation());
            model.add(subject, AASNamespace.AssetAdministrationShell.assetInformation, res.getResource());
            model.add(res.getModel());
        }
        if (object.getSubmodels() != null && !object.getSubmodels().isEmpty()) {
            int index = 0;
            for (Reference item : object.getSubmodels()) {
                RDFSerializationResult resultItem = new DefaultReferenceRDFHandler().toModel(item);
                resultItem.getResource().addLiteral(AASNamespace.index, index);
                subject.addProperty(AASNamespace.AssetAdministrationShell.submodels, resultItem.getResource());
                // It is important where to put model.add
                model.add(resultItem.getModel());
                index = index + 1;
            }
        }
        if (object.getDerivedFrom() != null) {
            RDFSerializationResult res = new DefaultReferenceRDFHandler().toModel(object.getDerivedFrom());
            model.add(subject, AASNamespace.AssetAdministrationShell.derivedFrom, res.getResource());
            model.add(res.getModel());
        }
        //Identifiable
        new DefaultIdentifiableRDFPartialHandler().partialToModel(object, model, subject);
        //HasDataSpecification
        new DefaultHasDataSpecificationRDFPartialHandler().partialToModel(object, model, subject);
        return new DefaultRDFHandlerResult(model, subject);
    }

    @Override
    public AssetAdministrationShell fromModel(Model model, Resource subjectToParse) throws IncompatibleTypeException {
        if (!model.contains(subjectToParse, RDF.type, AASNamespace.Types.AssetAdministrationShell)) {
            throw new IncompatibleTypeException("AssetAdministrationShell");
        }
        DefaultAssetAdministrationShell.Builder builder = new DefaultAssetAdministrationShell.Builder();
        if (model.contains(subjectToParse, AASNamespace.AssetAdministrationShell.assetInformation)) {
            Resource resource = model.getProperty(subjectToParse, AASNamespace.AssetAdministrationShell.assetInformation).getResource();
            AssetInformation assetInformation = new DefaultAssetInformationRDFHandler().fromModel(model, resource);
            builder.assetInformation(assetInformation);
        }
        if (model.contains(subjectToParse, AASNamespace.AssetAdministrationShell.submodels)) {
            NodeIterator nodeIterator = model.listObjectsOfProperty(subjectToParse, AASNamespace.AssetAdministrationShell.submodels);
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
            List<Reference> langStringList = new ArrayList<>();
            for (int index = 0; index < keysMap.keySet().size(); index++) {
                langStringList.add(keysMap.get(index));
            }
            builder.submodels(langStringList);
        }
        if (model.contains(subjectToParse, AASNamespace.AssetAdministrationShell.derivedFrom)) {
            Resource resource = model.getProperty(subjectToParse, AASNamespace.AssetAdministrationShell.derivedFrom).getResource();
            Reference derivedFrom = new DefaultReferenceRDFHandler().fromModel(model, resource);
            builder.derivedFrom(derivedFrom);
        }
        AssetAdministrationShell object = builder.build();
        //Identifiable
        new DefaultIdentifiableRDFPartialHandler().partialFromModel(object, model, subjectToParse);
        //HasDataSpecification
        new DefaultHasDataSpecificationRDFPartialHandler().partialFromModel(object, model, subjectToParse);
        return object;
    }

}
