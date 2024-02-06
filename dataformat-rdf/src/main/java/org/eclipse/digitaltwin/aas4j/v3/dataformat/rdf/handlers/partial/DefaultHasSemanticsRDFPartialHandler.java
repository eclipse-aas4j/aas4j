package org.eclipse.digitaltwin.aas4j.v3.dataformat.rdf.handlers.partial;

import org.apache.jena.rdf.model.Model;
import org.apache.jena.rdf.model.NodeIterator;
import org.apache.jena.rdf.model.Resource;
import org.eclipse.digitaltwin.aas4j.v3.dataformat.rdf.AASNamespace;
import org.eclipse.digitaltwin.aas4j.v3.dataformat.rdf.IncompatibleTypeException;
import org.eclipse.digitaltwin.aas4j.v3.dataformat.rdf.RDFPartialHandler;
import org.eclipse.digitaltwin.aas4j.v3.dataformat.rdf.RDFSerializationResult;
import org.eclipse.digitaltwin.aas4j.v3.dataformat.rdf.handlers.DefaultReferenceRDFHandler;
import org.eclipse.digitaltwin.aas4j.v3.model.HasSemantics;
import org.eclipse.digitaltwin.aas4j.v3.model.Reference;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DefaultHasSemanticsRDFPartialHandler implements RDFPartialHandler<HasSemantics> {

    @Override
    public void partialToModel(HasSemantics object, Model model, Resource parentNode) {
        if (object.getSemanticId() != null) {
            RDFSerializationResult res = new DefaultReferenceRDFHandler().toModel(object.getSemanticId());
            model.add(parentNode, AASNamespace.HasSemantics.semanticId, res.getResource());
            model.add(res.getModel());
        }
        if (object.getSupplementalSemanticIds() != null && !object.getSupplementalSemanticIds().isEmpty()) {
            int index = 0;
            for (Reference item : object.getSupplementalSemanticIds()) {
                RDFSerializationResult resultItem = new DefaultReferenceRDFHandler().toModel(item);
                resultItem.getResource().addLiteral(AASNamespace.index, index);
                parentNode.addProperty(AASNamespace.HasSemantics.supplementalSemanticIds, resultItem.getResource());
                // It is important where to put model.add
                model.add(resultItem.getModel());
                index = index + 1;
            }
        }
    }

    @Override
    public HasSemantics partialFromModel(HasSemantics object, Model model, Resource subjectToParse) throws IncompatibleTypeException {
        if (model.contains(subjectToParse, AASNamespace.HasSemantics.semanticId)) {
            Reference reference = new DefaultReferenceRDFHandler().fromModel(model, model.getProperty(subjectToParse,
                    AASNamespace.HasSemantics.semanticId).getResource());
            object.setSemanticId(reference);
        }
        if (model.contains(subjectToParse, AASNamespace.HasSemantics.supplementalSemanticIds)) {
            NodeIterator nodeIterator = model.listObjectsOfProperty(subjectToParse, AASNamespace.HasSemantics.supplementalSemanticIds);
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
            object.setSupplementalSemanticIds(langStringList);
        }
        return object;
    }
}
