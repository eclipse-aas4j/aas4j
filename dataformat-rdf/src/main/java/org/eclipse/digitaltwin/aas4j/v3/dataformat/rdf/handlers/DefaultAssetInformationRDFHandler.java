package org.eclipse.digitaltwin.aas4j.v3.dataformat.rdf.handlers;

import org.apache.jena.rdf.model.*;
import org.apache.jena.vocabulary.RDF;
import org.eclipse.digitaltwin.aas4j.v3.dataformat.rdf.*;
import org.eclipse.digitaltwin.aas4j.v3.model.AssetInformation;
import org.eclipse.digitaltwin.aas4j.v3.model.Extension;
import org.eclipse.digitaltwin.aas4j.v3.model.LangStringTextType;
import org.eclipse.digitaltwin.aas4j.v3.model.SpecificAssetId;
import org.eclipse.digitaltwin.aas4j.v3.model.impl.DefaultAssetInformation;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DefaultAssetInformationRDFHandler implements RDFHandler<AssetInformation> {
    @Override
    public RDFSerializationResult toModel(AssetInformation object) {
        Model model = ModelFactory.createDefaultModel();
        if (object == null) {
            return new DefaultRDFHandlerResult(model, ResourceFactory.createResource());
        }
        Resource subject = model.createResource();
        model.add(subject,RDF.type,AASNamespace.Types.AssetInformation);
        if(object.getAssetKind()!=null){
            model.add(subject,AASNamespace.AssetInformation.assetKind,
                    AASNamespace.AssetKind.valueOf(object.getAssetKind().name()));
        }
        if(object.getAssetType()!=null){
            model.add(subject,AASNamespace.AssetInformation.assetType,
                    object.getAssetType());
        }
        if(object.getDefaultThumbnail()!=null){
            RDFSerializationResult res = new DefaultResourceRDFHandler().toModel(object.getDefaultThumbnail());
            model.add(subject,AASNamespace.AssetInformation.defaultThumbnail,
                    res.getResource());
            model.add(res.getModel());
        }
        if(object.getGlobalAssetId()!=null){
            model.add(subject,AASNamespace.AssetInformation.globalAssetId,
                    object.getGlobalAssetId());
        }
        if(object.getSpecificAssetIds()!=null && object.getSpecificAssetIds().isEmpty() == false){
            int index = 0;
            for (SpecificAssetId item : object.getSpecificAssetIds()) {
                RDFSerializationResult resultItem = new DefaultSpecificAssetIdRDFHandler().toModel(item);
                resultItem.getResource().addLiteral(AASNamespace.index, index);
                model.add(subject, AASNamespace.AssetInformation.specificAssetIds, resultItem.getResource());
                // It is important where to put model.add
                model.add(resultItem.getModel());
                index = index + 1;
            }
        }
        return new DefaultRDFHandlerResult(model, subject);
    }

    @Override
    public AssetInformation fromModel(Model model, Resource subjectToParse) throws IncompatibleTypeException {
        if (model.contains(subjectToParse, RDF.type, AASNamespace.Types.AssetInformation) == false){
            throw new IncompatibleTypeException("AssetInformation");
        }
        DefaultAssetInformation.Builder builder = new DefaultAssetInformation.Builder();
        if (model.contains(subjectToParse, AASNamespace.AssetInformation.assetKind)){
            Resource resource = model.getProperty(subjectToParse, AASNamespace.AssetInformation.assetKind).getResource();
            builder.assetKind(AASNamespace.AssetKind.fromIRI(resource.getURI()));
        }
        if (model.contains(subjectToParse, AASNamespace.AssetInformation.assetType)){
            builder.assetType(model.getProperty(subjectToParse,
                    AASNamespace.AssetInformation.assetType).getString());
        }
        if (model.contains(subjectToParse, AASNamespace.AssetInformation.defaultThumbnail)){
            Resource resource = model.getProperty(subjectToParse, AASNamespace.AssetInformation.defaultThumbnail).getResource();

            org.eclipse.digitaltwin.aas4j.v3.model.Resource res = new DefaultResourceRDFHandler().fromModel(model, resource);
            builder.defaultThumbnail(res);
        }
        if (model.contains(subjectToParse, AASNamespace.AssetInformation.globalAssetId)){
            builder.globalAssetId(model.getProperty(subjectToParse,
                    AASNamespace.AssetInformation.globalAssetId).getString());
        }
        if (model.contains(subjectToParse, AASNamespace.AssetInformation.specificAssetIds)){
            NodeIterator nodeIterator = model.listObjectsOfProperty(subjectToParse, AASNamespace.AssetInformation.specificAssetIds);
            Map<Integer, SpecificAssetId> keysMap = new HashMap<>();
            nodeIterator.forEachRemaining(node -> {
                SpecificAssetId key = null;
                try {
                    key = new DefaultSpecificAssetIdRDFHandler().fromModel(model, node.asResource());
                } catch (IncompatibleTypeException e) {
                    throw new RuntimeException(e);
                }
                int index = model.getProperty(node.asResource(), AASNamespace.index).getInt();
                keysMap.put(index, key);
            });
            List<SpecificAssetId> specificAssetIds = new ArrayList<>();
            for (int index = 0; index < keysMap.keySet().size(); index++) {
                specificAssetIds.add(keysMap.get(index));
            }
            builder.specificAssetIds(specificAssetIds);
        }
        return builder.build();
    }
}
