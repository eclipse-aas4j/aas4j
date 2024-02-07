package org.eclipse.digitaltwin.aas4j.v3.dataformat.rdf.handlers;

import org.apache.jena.rdf.model.*;
import org.apache.jena.vocabulary.RDF;
import org.eclipse.digitaltwin.aas4j.v3.dataformat.rdf.*;
import org.eclipse.digitaltwin.aas4j.v3.dataformat.rdf.handlers.partial.DefaultHasDataSpecificationRDFPartialHandler;
import org.eclipse.digitaltwin.aas4j.v3.dataformat.rdf.handlers.partial.DefaultHasSemanticsRDFPartialHandler;
import org.eclipse.digitaltwin.aas4j.v3.dataformat.rdf.handlers.partial.DefaultQualifiableRDFPartialHandler;
import org.eclipse.digitaltwin.aas4j.v3.dataformat.rdf.handlers.partial.DefaultReferableRDFPartialHandler;
import org.eclipse.digitaltwin.aas4j.v3.model.LangStringTextType;
import org.eclipse.digitaltwin.aas4j.v3.model.MultiLanguageProperty;
import org.eclipse.digitaltwin.aas4j.v3.model.Reference;
import org.eclipse.digitaltwin.aas4j.v3.model.impl.DefaultMultiLanguageProperty;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DefaultMultiLanguagePropertyRDFHandler implements RDFHandler<MultiLanguageProperty> {
    @Override
    public RDFSerializationResult toModel(MultiLanguageProperty object) {
        Model model = ModelFactory.createDefaultModel();
        if (object == null) {
            return new DefaultRDFHandlerResult(model, ResourceFactory.createResource());
        }
        Resource subject = model.createResource();
        model.add(subject, RDF.type, AASNamespace.Types.MultiLanguageProperty);
        if (object.getValue() != null && object.getValue().isEmpty() == false) {
            int index = 0;
            for (LangStringTextType langString : object.getValue()) {
                RDFSerializationResult res = new DefaultLangStringTextTypeRDFHandler().toModel(langString);
                model.add(subject, AASNamespace.MultiLanguageProperty.value, res.getResource());
                model.addLiteral(res.getResource(), AASNamespace.index, index);
                model.add(res.getModel());
                index++;
            }
        }
        if (object.getValueId() != null) {
            RDFSerializationResult res = new DefaultReferenceRDFHandler().toModel(object.getValueId());
            model.add(subject, AASNamespace.MultiLanguageProperty.valueId, res.getResource());
            model.add(res.getModel());
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
    public MultiLanguageProperty fromModel(Model model, Resource subjectToParse) throws IncompatibleTypeException {
        if (!model.contains(subjectToParse, RDF.type, AASNamespace.Types.MultiLanguageProperty)) {
            throw new IncompatibleTypeException("MultiLanguageProperty");
        }
        DefaultMultiLanguageProperty.Builder builder = new DefaultMultiLanguageProperty.Builder();

        if (model.contains(subjectToParse, AASNamespace.MultiLanguageProperty.value)) {
            NodeIterator nodeIterator = model.listObjectsOfProperty(subjectToParse, AASNamespace.MultiLanguageProperty.value);
            Map<Integer, LangStringTextType> keysMap = new HashMap<>();
            nodeIterator.forEachRemaining(node -> {
                LangStringTextType key = null;
                try {
                    key = new DefaultLangStringTextTypeRDFHandler().fromModel(model, node.asResource());
                } catch (IncompatibleTypeException e) {
                    throw new RuntimeException(e);
                }
                int index = model.getProperty(node.asResource(), AASNamespace.index).getInt();
                keysMap.put(index, key);
            });
            List<LangStringTextType> langStringList = new ArrayList<>();
            for (int index = 0; index < keysMap.keySet().size(); index++) {
                langStringList.add(keysMap.get(index));
            }
            builder.value(langStringList);
        }
        if (model.contains(subjectToParse, AASNamespace.MultiLanguageProperty.valueId)) {
            Resource resource = model.getProperty(subjectToParse, AASNamespace.MultiLanguageProperty.valueId).getResource();
            Reference reference = new DefaultReferenceRDFHandler().fromModel(model, resource);
            builder.valueId(reference);
        }
        MultiLanguageProperty object = builder.build();
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
