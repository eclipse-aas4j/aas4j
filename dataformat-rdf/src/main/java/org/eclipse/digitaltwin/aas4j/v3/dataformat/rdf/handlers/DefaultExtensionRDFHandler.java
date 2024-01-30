package org.eclipse.digitaltwin.aas4j.v3.dataformat.rdf.handlers;

import org.apache.jena.rdf.model.*;
import org.apache.jena.vocabulary.RDF;
import org.eclipse.digitaltwin.aas4j.v3.dataformat.rdf.*;
import org.eclipse.digitaltwin.aas4j.v3.dataformat.rdf.handlers.dataspecificationiec61360.DefaultLangStringDefinitionTypeIec61360RDFHandler;
import org.eclipse.digitaltwin.aas4j.v3.dataformat.rdf.handlers.partial.DefaultHasSemanticsRDFPartialHandler;
import org.eclipse.digitaltwin.aas4j.v3.model.DataTypeDefXsd;
import org.eclipse.digitaltwin.aas4j.v3.model.Extension;
import org.eclipse.digitaltwin.aas4j.v3.model.LangStringDefinitionTypeIec61360;
import org.eclipse.digitaltwin.aas4j.v3.model.Reference;
import org.eclipse.digitaltwin.aas4j.v3.model.impl.DefaultExtension;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DefaultExtensionRDFHandler implements RDFHandler<Extension> {
    @Override
    public RDFSerializationResult toModel(Extension object) {
        Model model = ModelFactory.createDefaultModel();
        if (object == null) {
            return new DefaultRDFHandlerResult(model, ResourceFactory.createResource());
        }
        Resource subject = model.createResource();
        model.add(subject, RDF.type, AASNamespace.Types.Extension);
        if (object.getName() != null) {
            model.addLiteral(subject, AASNamespace.Extension.name, object.getName());
        }
        if (object.getValue() != null) {
            model.addLiteral(subject, AASNamespace.Extension.value, object.getValue());
        }
        if (object.getValueType() != null) {
            model.add(subject, AASNamespace.Extension.valueType,
                    AASNamespace.DataTypeDefXsd.valueOf(object.getValueType().name()));
        }
        if (object.getRefersTo() != null && object.getRefersTo().isEmpty() != false) {
            int index = 0;
            for (Reference reference : object.getRefersTo()) {
                RDFSerializationResult res = new DefaultReferenceRDFHandler().toModel(reference);
                model.add(subject, AASNamespace.Extension.refersTo, res.getResource());
                model.addLiteral(res.getResource(), AASNamespace.index, index);
                model.add(res.getModel());
                index++;
            }
        }
        //HasSemantics
        new DefaultHasSemanticsRDFPartialHandler().partialToModel(object, model, subject);
        return new DefaultRDFHandlerResult(model, subject);
    }

    @Override
    public Extension fromModel(Model model, Resource subjectToParse) throws IncompatibleTypeException {
        if (model.contains(subjectToParse, RDF.type, AASNamespace.Types.Extension) == false) {
            throw new IncompatibleTypeException("Extension");
        }
        DefaultExtension.Builder builder = new DefaultExtension.Builder();
        if(model.contains(subjectToParse,AASNamespace.Extension.name)){
            builder.name(model.getProperty(subjectToParse,AASNamespace.Extension.name).getString());
        }
        if(model.contains(subjectToParse,AASNamespace.Extension.value)){
            builder.value(model.getProperty(subjectToParse,AASNamespace.Extension.value).getString());
        }
        if(model.contains(subjectToParse,AASNamespace.Extension.valueType)){
            String valueType = model.getProperty(subjectToParse, AASNamespace.Extension.valueType).getResource().getURI();
            builder.valueType(AASNamespace.DataTypeDefXsd.fromIRI(valueType));
        }
        if(model.contains(subjectToParse,AASNamespace.Extension.refersTo)){
            NodeIterator nodeIterator = model.listObjectsOfProperty(subjectToParse, AASNamespace.Extension.refersTo);
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
            List<Reference> references = new ArrayList<>();
            for (int index = 0; index < keysMap.keySet().size(); index++) {
                references.add(keysMap.get(index));
            }
            builder.refersTo(references);
        }
        //HasSemantics
        Extension object = builder.build();
        new DefaultHasSemanticsRDFPartialHandler().partialFromModel(object, model, subjectToParse);
        return object;
    }
}
