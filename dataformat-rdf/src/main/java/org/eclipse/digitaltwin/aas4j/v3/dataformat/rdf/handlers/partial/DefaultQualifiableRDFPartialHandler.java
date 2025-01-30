package org.eclipse.digitaltwin.aas4j.v3.dataformat.rdf.handlers.partial;

import org.apache.jena.rdf.model.Model;
import org.apache.jena.rdf.model.NodeIterator;
import org.apache.jena.rdf.model.Resource;
import org.eclipse.digitaltwin.aas4j.v3.dataformat.rdf.AASNamespace;
import org.eclipse.digitaltwin.aas4j.v3.dataformat.rdf.IncompatibleTypeException;
import org.eclipse.digitaltwin.aas4j.v3.dataformat.rdf.RDFPartialHandler;
import org.eclipse.digitaltwin.aas4j.v3.dataformat.rdf.RDFSerializationResult;
import org.eclipse.digitaltwin.aas4j.v3.dataformat.rdf.handlers.DefaultQualifierRDFHandler;
import org.eclipse.digitaltwin.aas4j.v3.model.Qualifiable;
import org.eclipse.digitaltwin.aas4j.v3.model.Qualifier;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DefaultQualifiableRDFPartialHandler implements RDFPartialHandler<Qualifiable> {
    @Override
    public void partialToModel(Qualifiable object, Model model, Resource parentNode) {
        if (object.getQualifiers() != null && !object.getQualifiers().isEmpty()) {
            int index = 0;
            for (Qualifier item : object.getQualifiers()) {
                RDFSerializationResult resultItem = new DefaultQualifierRDFHandler().toModel(item);
                resultItem.getResource().addLiteral(AASNamespace.index, index);
                parentNode.addProperty(AASNamespace.Qualifiable.qualifiers, resultItem.getResource());
                // It is important where to put model.add
                model.add(resultItem.getModel());
                index = index + 1;
            }
        }
    }

    @Override
    public Qualifiable partialFromModel(Qualifiable object, Model model, Resource subjectToParse) throws IncompatibleTypeException {
        if (model.contains(subjectToParse, AASNamespace.Qualifiable.qualifiers)) {
            NodeIterator nodeIterator = model.listObjectsOfProperty(subjectToParse, AASNamespace.Qualifiable.qualifiers);
            Map<Integer, Qualifier> keysMap = new HashMap<>();
            nodeIterator.forEachRemaining(node -> {
                Qualifier key = null;
                try {
                    key = new DefaultQualifierRDFHandler().fromModel(model, node.asResource());
                } catch (IncompatibleTypeException e) {
                    throw new RuntimeException(e);
                }
                int index = model.getProperty(node.asResource(), AASNamespace.index).getInt();
                keysMap.put(index, key);
            });
            if (keysMap.isEmpty() == false) {
                List<Qualifier> qualifiers = new ArrayList<>();
                for (int index = 0; index < keysMap.keySet().size(); index++) {
                    qualifiers.add(keysMap.get(index));
                }
                object.setQualifiers(qualifiers);
            }
        }
        return object;
    }
}
