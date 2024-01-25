package org.eclipse.digitaltwin.aas4j.v3.dataformat.rdf.handlers;

import org.apache.jena.rdf.model.Model;
import org.eclipse.digitaltwin.aas4j.v3.dataformat.rdf.IncompatibleTypeException;
import org.eclipse.digitaltwin.aas4j.v3.dataformat.rdf.RDFHandler;
import org.eclipse.digitaltwin.aas4j.v3.dataformat.rdf.RDFSerializationResult;
import org.eclipse.digitaltwin.aas4j.v3.model.Resource;

public class DefaultResrouceRDFHandler implements RDFHandler<Resource> {
    @Override
    public RDFSerializationResult toModel(Resource object) {
        return null;
    }

    @Override
    public Resource fromModel(Model model, org.apache.jena.rdf.model.Resource subjectToParse) throws IncompatibleTypeException {
        return null;
    }
}
