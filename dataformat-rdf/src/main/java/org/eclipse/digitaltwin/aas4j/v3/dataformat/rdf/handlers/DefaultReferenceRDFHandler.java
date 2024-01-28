package org.eclipse.digitaltwin.aas4j.v3.dataformat.rdf.handlers;

import org.apache.jena.rdf.model.*;
import org.apache.jena.vocabulary.RDF;
import org.eclipse.digitaltwin.aas4j.v3.dataformat.rdf.*;
import org.eclipse.digitaltwin.aas4j.v3.model.Key;
import org.eclipse.digitaltwin.aas4j.v3.model.Reference;
import org.eclipse.digitaltwin.aas4j.v3.model.impl.DefaultReference;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DefaultReferenceRDFHandler implements RDFHandler<Reference> {
    @Override
    public RDFSerializationResult toModel(Reference key) {
        Model model = ModelFactory.createDefaultModel();
        if (key == null) {
            return new DefaultRDFHandlerResult(model, ResourceFactory.createResource());
        }
        Resource subject = model.createResource();
        subject.addProperty(RDF.type,AASNamespace.Types.Reference);
        subject.addProperty(AASNamespace.Reference.type,AASNamespace.ReferenceTypes.valueOf(key.getType().name()));
        int index = 0;
        for (Key item : key.getKeys()) {
            RDFSerializationResult resultItem = new DefaultKeyRDFHandler().toModel(item);
            resultItem.getResource().addLiteral(AASNamespace.index,index);
            subject.addProperty(AASNamespace.Reference.keys,resultItem.getResource());
            // It is important where to put model.add
            model.add(resultItem.getModel());
            index = index + 1;
        }

        return new DefaultRDFHandlerResult(model, subject);
    }

    @Override
    public Reference fromModel(Model model, Resource subjectToParse) throws IncompatibleTypeException {
        if (model.contains(subjectToParse, RDF.type, AASNamespace.Types.Reference) == false){
            throw new IncompatibleTypeException();
        }
        String typeString = model.getProperty(subjectToParse, AASNamespace.Reference.type).getResource().getURI();
        Map<Integer, Key> keysMap = new HashMap<>();
        NodeIterator keysIterator = model.listObjectsOfProperty(subjectToParse,AASNamespace.Reference.keys);
        keysIterator.forEachRemaining(node->{
            Key key = new DefaultKeyRDFHandler().fromModel(model, (Resource) node);
            int index = model.getProperty((Resource) node, AASNamespace.index).getInt();
            keysMap.put(index,key);
        });
        List<Key> keys = new ArrayList<>();
        for(int index=0;index<keysMap.keySet().size();index++){
            keys.add(keysMap.get(index));
        }
        return new DefaultReference.Builder()
                .type(AASNamespace.ReferenceTypes.fromIRI(typeString))
                .keys(keys)
                .build();
    }
}
