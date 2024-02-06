package org.eclipse.digitaltwin.aas4j.v3.dataformat.rdf.handlers.partial;

import org.apache.jena.rdf.model.Model;
import org.apache.jena.rdf.model.NodeIterator;
import org.apache.jena.rdf.model.Resource;
import org.eclipse.digitaltwin.aas4j.v3.dataformat.rdf.AASNamespace;
import org.eclipse.digitaltwin.aas4j.v3.dataformat.rdf.IncompatibleTypeException;
import org.eclipse.digitaltwin.aas4j.v3.dataformat.rdf.RDFPartialHandler;
import org.eclipse.digitaltwin.aas4j.v3.dataformat.rdf.RDFSerializationResult;
import org.eclipse.digitaltwin.aas4j.v3.dataformat.rdf.handlers.DefaultEmbeddedDataSpecificationRDFHandler;
import org.eclipse.digitaltwin.aas4j.v3.model.EmbeddedDataSpecification;
import org.eclipse.digitaltwin.aas4j.v3.model.HasDataSpecification;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DefaultHasDataSpecificationRDFPartialHandler implements RDFPartialHandler<HasDataSpecification> {
    @Override
    public void partialToModel(HasDataSpecification object, Model model, Resource parentNode) {
        if (object.getEmbeddedDataSpecifications() != null && !object.getEmbeddedDataSpecifications().isEmpty()) {
            int index = 0;
            for (EmbeddedDataSpecification item : object.getEmbeddedDataSpecifications()) {
                RDFSerializationResult resultItem = new DefaultEmbeddedDataSpecificationRDFHandler().toModel(item);
                resultItem.getResource().addLiteral(AASNamespace.index, index);
                parentNode.addProperty(AASNamespace.HasDataSpecification.embeddedDataSpecifications, resultItem.getResource());
                // It is important where to put model.add
                model.add(resultItem.getModel());
                index = index + 1;
            }
        }
    }

    @Override
    public HasDataSpecification partialFromModel(HasDataSpecification object, Model model, Resource subjectToParse) {
        if (model.contains(subjectToParse, AASNamespace.HasDataSpecification.embeddedDataSpecifications)) {
            Map<Integer, EmbeddedDataSpecification> keysMap = new HashMap<>();
            NodeIterator keysIterator = model.listObjectsOfProperty(subjectToParse,
                    AASNamespace.HasDataSpecification.embeddedDataSpecifications);
            keysIterator.forEachRemaining(node -> {
                EmbeddedDataSpecification key = null;
                try {
                    key = new DefaultEmbeddedDataSpecificationRDFHandler().fromModel(model, (Resource) node);
                } catch (IncompatibleTypeException e) {
                    throw new RuntimeException(e);
                }
                int index = model.getProperty((Resource) node, AASNamespace.index).getInt();
                keysMap.put(index, key);
            });
            List<EmbeddedDataSpecification> keys = new ArrayList<>();
            for (int index = 0; index < keysMap.keySet().size(); index++) {
                keys.add(keysMap.get(index));
            }
            object.setEmbeddedDataSpecifications(keys);
        }
        return object;
    }
}
