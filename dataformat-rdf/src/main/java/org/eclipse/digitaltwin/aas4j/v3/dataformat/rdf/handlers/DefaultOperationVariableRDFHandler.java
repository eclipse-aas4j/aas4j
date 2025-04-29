package org.eclipse.digitaltwin.aas4j.v3.dataformat.rdf.handlers;

import org.apache.jena.rdf.model.Model;
import org.apache.jena.rdf.model.ModelFactory;
import org.apache.jena.rdf.model.Resource;
import org.apache.jena.rdf.model.ResourceFactory;
import org.apache.jena.vocabulary.RDF;
import org.eclipse.digitaltwin.aas4j.v3.dataformat.rdf.*;
import org.eclipse.digitaltwin.aas4j.v3.model.OperationVariable;
import org.eclipse.digitaltwin.aas4j.v3.model.SubmodelElement;
import org.eclipse.digitaltwin.aas4j.v3.model.impl.DefaultOperationVariable;

public class DefaultOperationVariableRDFHandler implements RDFHandler<OperationVariable> {
    @Override
    public RDFSerializationResult toModel(OperationVariable object) {
        Model model = ModelFactory.createDefaultModel();
        if (object == null) {
            return new DefaultRDFHandlerResult(model, ResourceFactory.createResource());
        }
        Resource subject = model.createResource();
        model.add(subject, RDF.type, AASNamespace.Types.OperationVariable);
        if (object.getValue() != null) {
            RDFSerializationResult res = new DefaultSubmodelElementRDFHandler().toModel(object.getValue());
            model.add(subject, AASNamespace.OperationVariable.value, res.getResource());
            model.add(res.getModel());
        }
        return new DefaultRDFHandlerResult(model, subject);
    }

    @Override
    public OperationVariable fromModel(Model model, Resource subjectToParse) throws IncompatibleTypeException {
        if (!model.contains(subjectToParse, RDF.type, AASNamespace.Types.OperationVariable)) {
            throw new IncompatibleTypeException("OperationVariable");
        }
        DefaultOperationVariable.Builder builder = new DefaultOperationVariable.Builder();
        if (model.contains(subjectToParse, AASNamespace.OperationVariable.value)) {
            Resource resource = model.getProperty(subjectToParse, AASNamespace.OperationVariable.value).getResource();
            SubmodelElement submodelElement = new DefaultSubmodelElementRDFHandler().fromModel(model, resource);
            builder.value(submodelElement);
        }
        return builder.build();
    }
}
