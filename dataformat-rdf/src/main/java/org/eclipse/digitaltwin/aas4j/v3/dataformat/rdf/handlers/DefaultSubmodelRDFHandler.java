package org.eclipse.digitaltwin.aas4j.v3.dataformat.rdf.handlers;

import org.apache.jena.rdf.model.*;
import org.apache.jena.vocabulary.RDF;
import org.eclipse.digitaltwin.aas4j.v3.dataformat.rdf.*;
import org.eclipse.digitaltwin.aas4j.v3.dataformat.rdf.handlers.partial.DefaultHasDataSpecificationRDFPartialHandler;
import org.eclipse.digitaltwin.aas4j.v3.dataformat.rdf.handlers.partial.DefaultHasSemanticsRDFPartialHandler;
import org.eclipse.digitaltwin.aas4j.v3.dataformat.rdf.handlers.partial.DefaultIdentifiableRDFPartialHandler;
import org.eclipse.digitaltwin.aas4j.v3.dataformat.rdf.handlers.partial.DefaultQualifiableRDFPartialHandler;
import org.eclipse.digitaltwin.aas4j.v3.model.Submodel;
import org.eclipse.digitaltwin.aas4j.v3.model.SubmodelElement;
import org.eclipse.digitaltwin.aas4j.v3.model.impl.DefaultSubmodel;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DefaultSubmodelRDFHandler implements RDFHandler<Submodel> {
    @Override
    public RDFSerializationResult toModel(Submodel object) {
        Model model = ModelFactory.createDefaultModel();
        if (object == null) {
            return new DefaultRDFHandlerResult(model, ResourceFactory.createResource());
        }
        Resource subject = model.createResource(object.getId());
        model.add(subject, RDF.type, AASNamespace.Types.Submodel);
        if (object.getSubmodelElements() != null && object.getSubmodelElements().isEmpty() == false) {
            int index = 0;
            for (SubmodelElement item : object.getSubmodelElements()) {
                RDFSerializationResult resultItem = new DefaultSubmodelElementRDFHandler().toModel(item);
                resultItem.getResource().addLiteral(AASNamespace.index, index);
                subject.addProperty(AASNamespace.Submodel.submodelElements, resultItem.getResource());
                // It is important where to put model.add
                model.add(resultItem.getModel());
                index = index + 1;
            }
        }
        //HasKind
        if (object.getKind() != null) {
            model.add(subject, AASNamespace.HasKind.kind, AASNamespace.ModellingKind.valueOf(object.getKind().name()));
        }
        //HasDataSpecification
        new DefaultHasDataSpecificationRDFPartialHandler().partialToModel(object, model, subject);
        //HasSemantics
        new DefaultHasSemanticsRDFPartialHandler().partialToModel(object, model, subject);
        //Qualifiable
        new DefaultQualifiableRDFPartialHandler().partialToModel(object, model, subject);
        //Identifiable
        new DefaultIdentifiableRDFPartialHandler().partialToModel(object, model, subject);
        return new DefaultRDFHandlerResult(model, subject);
    }

    @Override
    public Submodel fromModel(Model model, Resource subjectToParse) throws IncompatibleTypeException {
        if (!model.contains(subjectToParse, RDF.type, AASNamespace.Types.Submodel)) {
            throw new IncompatibleTypeException("Submodel");
        }
        DefaultSubmodel.Builder builder = new DefaultSubmodel.Builder();
        if (model.contains(subjectToParse, AASNamespace.Submodel.submodelElements)) {
            NodeIterator nodeIterator = model.listObjectsOfProperty(subjectToParse, AASNamespace.Submodel.submodelElements);
            Map<Integer, SubmodelElement> keysMap = new HashMap<>();
            nodeIterator.forEachRemaining(node -> {
                SubmodelElement key = null;
                try {
                    key = new DefaultSubmodelElementRDFHandler().fromModel(model, node.asResource());
                } catch (IncompatibleTypeException e) {
                    throw new RuntimeException(e);
                }
                int index = model.getProperty(node.asResource(), AASNamespace.index).getInt();
                keysMap.put(index, key);
            });
            if (keysMap.isEmpty() == false) {
                List<SubmodelElement> submodelElements = new ArrayList<>();
                for (int index = 0; index < keysMap.keySet().size(); index++) {
                    submodelElements.add(keysMap.get(index));
                }
                builder.submodelElements(submodelElements);
            }
        }
        //HasKind
        if (model.contains(subjectToParse, AASNamespace.HasKind.kind)) {
            Resource resource = model.getProperty(subjectToParse, AASNamespace.HasKind.kind).getResource();
            builder.kind(AASNamespace.ModellingKind.fromIRI(resource.getURI()));
        }
        Submodel object = builder.build();
        //HasDataSpecification
        new DefaultHasDataSpecificationRDFPartialHandler().partialFromModel(object, model, subjectToParse);
        //HasSemantics
        new DefaultHasSemanticsRDFPartialHandler().partialFromModel(object, model, subjectToParse);
        //Qualifiable
        new DefaultQualifiableRDFPartialHandler().partialFromModel(object, model, subjectToParse);
        //Identifiable
        new DefaultIdentifiableRDFPartialHandler().partialFromModel(object, model, subjectToParse);
        return object;
    }
}
