package org.eclipse.digitaltwin.aas4j.v3.dataformat.rdf.handlers;

import org.apache.jena.rdf.model.Model;
import org.apache.jena.rdf.model.Resource;
import org.eclipse.digitaltwin.aas4j.v3.dataformat.rdf.IncompatibleTypeException;
import org.eclipse.digitaltwin.aas4j.v3.dataformat.rdf.RDFHandler;
import org.eclipse.digitaltwin.aas4j.v3.dataformat.rdf.RDFSerializationResult;
import org.eclipse.digitaltwin.aas4j.v3.model.Operation;

public class DefaultOperationRDFHandler implements RDFHandler<Operation> {
    @Override
    public RDFSerializationResult toModel(Operation object) {
        return null;
    }

    @Override
    public Operation fromModel(Model model, Resource subjectToParse) throws IncompatibleTypeException {
        return null;
    }
}