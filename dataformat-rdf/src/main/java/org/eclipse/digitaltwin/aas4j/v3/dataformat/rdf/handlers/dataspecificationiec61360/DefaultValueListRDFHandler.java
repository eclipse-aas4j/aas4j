package org.eclipse.digitaltwin.aas4j.v3.dataformat.rdf.handlers.dataspecificationiec61360;

import org.apache.jena.rdf.model.*;
import org.apache.jena.vocabulary.RDF;
import org.eclipse.digitaltwin.aas4j.v3.dataformat.rdf.*;
import org.eclipse.digitaltwin.aas4j.v3.model.ValueList;
import org.eclipse.digitaltwin.aas4j.v3.model.ValueReferencePair;
import org.eclipse.digitaltwin.aas4j.v3.model.impl.DefaultValueList;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DefaultValueListRDFHandler implements RDFHandler<ValueList> {
    @Override
    public RDFSerializationResult toModel(ValueList object) {
        Model model = ModelFactory.createDefaultModel();
        if (object == null) {
            return new DefaultRDFHandlerResult(model, ResourceFactory.createResource());
        }
        Resource subject = model.createResource();
        model.add(subject, RDF.type, AASNamespace.Types.ValueList);
        if (object.getValueReferencePairs() != null && object.getValueReferencePairs().isEmpty() == false) {
            int index = 0;
            for (ValueReferencePair valueReferencePair : object.getValueReferencePairs()) {
                RDFSerializationResult valueReferencePairSerializationResult = new DefaultValueReferencePairRDFHandler().toModel(valueReferencePair);
                model.add(subject, AASNamespace.ValueList.valueReferencePairs, valueReferencePairSerializationResult.getResource());
                model.addLiteral(valueReferencePairSerializationResult.getResource(), AASNamespace.index, index);
                model.add(valueReferencePairSerializationResult.getModel());
                index++;
            }
        }

        return new DefaultRDFHandlerResult(model, subject);
    }

    @Override
    public ValueList fromModel(Model model, Resource subjectToParse) throws IncompatibleTypeException {
        if (!model.contains(subjectToParse, RDF.type, AASNamespace.Types.ValueList)) {
            throw new IncompatibleTypeException("ValueList");
        }
        DefaultValueList.Builder builder = new DefaultValueList.Builder();
        if (model.contains(subjectToParse, AASNamespace.ValueList.valueReferencePairs)) {
            NodeIterator nodeIterator = model.listObjectsOfProperty(subjectToParse, AASNamespace.ValueList.valueReferencePairs);
            Map<Integer, ValueReferencePair> keysMap = new HashMap<>();
            nodeIterator.forEachRemaining(node -> {
                ValueReferencePair key = null;
                try {
                    key = new DefaultValueReferencePairRDFHandler().fromModel(model, node.asResource());
                } catch (IncompatibleTypeException e) {
                    throw new RuntimeException(e);
                }
                int index = model.getProperty(node.asResource(), AASNamespace.index).getInt();
                keysMap.put(index, key);
            });
            if (keysMap.isEmpty() == false) {
                List<ValueReferencePair> valueReferencePairList = new ArrayList<>();
                for (int index = 0; index < keysMap.keySet().size(); index++) {
                    valueReferencePairList.add(keysMap.get(index));
                }
                builder.valueReferencePairs(valueReferencePairList);
            }
        }
        return builder.build();
    }
}
