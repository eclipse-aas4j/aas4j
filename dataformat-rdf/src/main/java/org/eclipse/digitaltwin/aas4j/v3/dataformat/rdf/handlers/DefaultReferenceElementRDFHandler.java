package org.eclipse.digitaltwin.aas4j.v3.dataformat.rdf.handlers;

import org.apache.jena.rdf.model.Model;
import org.apache.jena.rdf.model.Resource;
import org.eclipse.digitaltwin.aas4j.v3.dataformat.rdf.IncompatibleTypeException;
import org.eclipse.digitaltwin.aas4j.v3.dataformat.rdf.RDFHandler;
import org.eclipse.digitaltwin.aas4j.v3.dataformat.rdf.RDFSerializationResult;
import org.eclipse.digitaltwin.aas4j.v3.model.ReferenceElement;

public class DefaultReferenceElementRDFHandler implements RDFHandler<ReferenceElement> {
    @Override
    public RDFSerializationResult toModel(ReferenceElement object) {
        return null;
    }

    @Override
    public ReferenceElement fromModel(Model model, Resource subjectToParse) throws IncompatibleTypeException {
        return null;
    }
}
