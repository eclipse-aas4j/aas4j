package org.eclipse.digitaltwin.aas4j.v3.dataformat.rdf.handlers;

import org.apache.jena.rdf.model.*;
import org.apache.jena.vocabulary.RDF;
import org.eclipse.digitaltwin.aas4j.v3.dataformat.rdf.*;
import org.eclipse.digitaltwin.aas4j.v3.dataformat.rdf.handlers.partial.DefaultHasDataSpecificationRDFPartialHandler;
import org.eclipse.digitaltwin.aas4j.v3.dataformat.rdf.handlers.partial.DefaultHasSemanticsRDFPartialHandler;
import org.eclipse.digitaltwin.aas4j.v3.dataformat.rdf.handlers.partial.DefaultQualifiableRDFPartialHandler;
import org.eclipse.digitaltwin.aas4j.v3.dataformat.rdf.handlers.partial.DefaultReferableRDFPartialHandler;
import org.eclipse.digitaltwin.aas4j.v3.model.Operation;
import org.eclipse.digitaltwin.aas4j.v3.model.OperationVariable;
import org.eclipse.digitaltwin.aas4j.v3.model.impl.DefaultOperation;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DefaultOperationRDFHandler implements RDFHandler<Operation> {
    @Override
    public RDFSerializationResult toModel(Operation object) {
        Model model = ModelFactory.createDefaultModel();
        if (object == null) {
            return new DefaultRDFHandlerResult(model, ResourceFactory.createResource());
        }
        Resource subject = model.createResource();
        model.add(subject, RDF.type, AASNamespace.Types.Operation);
        if (object.getInoutputVariables() != null && object.getInoutputVariables().isEmpty() == false) {
            int index = 0;
            for (OperationVariable item : object.getInoutputVariables()) {
                RDFSerializationResult resultItem = new DefaultOperationVariableRDFHandler().toModel(item);
                resultItem.getResource().addLiteral(AASNamespace.index, index);
                model.add(subject, AASNamespace.Operation.inoutputVariables, resultItem.getResource());
                // It is important where to put model.add
                model.add(resultItem.getModel());
                index = index + 1;
            }
        }
        if (object.getInputVariables() != null && object.getInputVariables().isEmpty() == false) {
            int index = 0;
            for (OperationVariable item : object.getInputVariables()) {
                RDFSerializationResult resultItem = new DefaultOperationVariableRDFHandler().toModel(item);
                resultItem.getResource().addLiteral(AASNamespace.index, index);
                model.add(subject, AASNamespace.Operation.inputVariables, resultItem.getResource());
                // It is important where to put model.add
                model.add(resultItem.getModel());
                index = index + 1;
            }
        }
        if (object.getOutputVariables() != null && object.getOutputVariables().isEmpty() == false) {
            int index = 0;
            for (OperationVariable item : object.getOutputVariables()) {
                RDFSerializationResult resultItem = new DefaultOperationVariableRDFHandler().toModel(item);
                resultItem.getResource().addLiteral(AASNamespace.index, index);
                model.add(subject, AASNamespace.Operation.outputVariables, resultItem.getResource());
                // It is important where to put model.add
                model.add(resultItem.getModel());
                index = index + 1;
            }
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
    public Operation fromModel(Model model, Resource subjectToParse) throws IncompatibleTypeException {
        if (!model.contains(subjectToParse, RDF.type, AASNamespace.Types.Operation)) {
            throw new IncompatibleTypeException("Operation");
        }
        DefaultOperation.Builder builder = new DefaultOperation.Builder();
        if (model.contains(subjectToParse, AASNamespace.Operation.inoutputVariables)) {
            NodeIterator nodeIterator = model.listObjectsOfProperty(subjectToParse, AASNamespace.Operation.inoutputVariables);
            Map<Integer, OperationVariable> keysMap = new HashMap<>();
            nodeIterator.forEachRemaining(node -> {
                OperationVariable key = null;
                try {
                    key = new DefaultOperationVariableRDFHandler().fromModel(model, node.asResource());
                } catch (IncompatibleTypeException e) {
                    throw new RuntimeException(e);
                }
                int index = model.getProperty(node.asResource(), AASNamespace.index).getInt();
                keysMap.put(index, key);
            });
            if (keysMap.isEmpty() == false) {
                List<OperationVariable> operationVariables = new ArrayList<>();
                for (int index = 0; index < keysMap.keySet().size(); index++) {
                    operationVariables.add(keysMap.get(index));
                }
                builder.inoutputVariables(operationVariables);
            }
        }
        if (model.contains(subjectToParse, AASNamespace.Operation.inputVariables)) {
            NodeIterator nodeIterator = model.listObjectsOfProperty(subjectToParse, AASNamespace.Operation.inputVariables);
            Map<Integer, OperationVariable> keysMap = new HashMap<>();
            nodeIterator.forEachRemaining(node -> {
                OperationVariable key = null;
                try {
                    key = new DefaultOperationVariableRDFHandler().fromModel(model, node.asResource());
                } catch (IncompatibleTypeException e) {
                    throw new RuntimeException(e);
                }
                int index = model.getProperty(node.asResource(), AASNamespace.index).getInt();
                keysMap.put(index, key);
            });
            if (keysMap.isEmpty() == false) {
                List<OperationVariable> operationVariables = new ArrayList<>();
                for (int index = 0; index < keysMap.keySet().size(); index++) {
                    operationVariables.add(keysMap.get(index));
                }
                builder.inputVariables(operationVariables);
            }
        }
        if (model.contains(subjectToParse, AASNamespace.Operation.outputVariables)) {
            NodeIterator nodeIterator = model.listObjectsOfProperty(subjectToParse, AASNamespace.Operation.outputVariables);
            Map<Integer, OperationVariable> keysMap = new HashMap<>();
            nodeIterator.forEachRemaining(node -> {
                OperationVariable key = null;
                try {
                    key = new DefaultOperationVariableRDFHandler().fromModel(model, node.asResource());
                } catch (IncompatibleTypeException e) {
                    throw new RuntimeException(e);
                }
                int index = model.getProperty(node.asResource(), AASNamespace.index).getInt();
                keysMap.put(index, key);
            });
            if (keysMap.isEmpty() == false) {
                List<OperationVariable> operationVariables = new ArrayList<>();
                for (int index = 0; index < keysMap.keySet().size(); index++) {
                    operationVariables.add(keysMap.get(index));
                }
                builder.outputVariables(operationVariables);
            }
        }
        Operation object = builder.build();
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
