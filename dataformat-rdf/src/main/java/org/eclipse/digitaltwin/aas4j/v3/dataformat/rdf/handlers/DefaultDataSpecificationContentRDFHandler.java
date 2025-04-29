package org.eclipse.digitaltwin.aas4j.v3.dataformat.rdf.handlers;

import org.apache.jena.rdf.model.Model;
import org.apache.jena.rdf.model.Resource;
import org.apache.jena.rdf.model.Statement;
import org.apache.jena.vocabulary.RDF;
import org.eclipse.digitaltwin.aas4j.v3.dataformat.rdf.AASNamespace;
import org.eclipse.digitaltwin.aas4j.v3.dataformat.rdf.IncompatibleTypeException;
import org.eclipse.digitaltwin.aas4j.v3.dataformat.rdf.RDFHandler;
import org.eclipse.digitaltwin.aas4j.v3.dataformat.rdf.RDFSerializationResult;
import org.eclipse.digitaltwin.aas4j.v3.model.DataSpecificationContent;
import org.eclipse.digitaltwin.aas4j.v3.model.DataSpecificationIec61360;

public class DefaultDataSpecificationContentRDFHandler implements RDFHandler<DataSpecificationContent> {
    @Override
    public RDFSerializationResult toModel(DataSpecificationContent object) {
        if (object instanceof DataSpecificationIec61360) {
            return new DefaultDataSpecificationIEC61360RDFHandler().toModel((DataSpecificationIec61360) object);
        }

        throw new IllegalArgumentException("Provided object " +
                object.getClass() +
                " is not a known DataSpecificationContent");
    }

    @Override
    public DataSpecificationContent fromModel(Model model, Resource subjectToParse) throws IncompatibleTypeException {
        Statement typeStatement = model.getProperty(subjectToParse, RDF.type);
        if (typeStatement.getResource().equals(AASNamespace.Types.DataSpecificationIec61360)) {
            return new DefaultDataSpecificationIEC61360RDFHandler().fromModel(model, subjectToParse);
        }
        //Other data specification content should be discriminated here.
        throw new IllegalArgumentException("Provided Resource " +
                typeStatement.getResource().getURI() +
                " is not a known DataSpecificationContent");
    }
}
