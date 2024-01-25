package org.eclipse.digitaltwin.aas4j.v3.dataformat.rdf.handlers;

import org.apache.jena.rdf.model.Model;
import org.apache.jena.rdf.model.Resource;
import org.eclipse.digitaltwin.aas4j.v3.dataformat.rdf.IncompatibleTypeException;
import org.eclipse.digitaltwin.aas4j.v3.dataformat.rdf.RDFHandler;
import org.eclipse.digitaltwin.aas4j.v3.dataformat.rdf.RDFSerializationResult;
import org.eclipse.digitaltwin.aas4j.v3.model.DataSpecificationIec61360;

public class DefaultDataSpecificationIEC61360RDFHandler implements RDFHandler<DataSpecificationIec61360> {
    @Override
    public RDFSerializationResult toModel(DataSpecificationIec61360 object) {
        return null;
    }

    @Override
    public DataSpecificationIec61360 fromModel(Model model, Resource subjectToParse) throws IncompatibleTypeException {
        return null;
    }
}
