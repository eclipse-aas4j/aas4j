package org.eclipse.digitaltwin.aas4j.v3.dataformat.rdf.handlers;

import org.apache.jena.rdf.model.Model;
import org.apache.jena.rdf.model.Resource;
import org.eclipse.digitaltwin.aas4j.v3.dataformat.rdf.RDFHandler;
import org.eclipse.digitaltwin.aas4j.v3.dataformat.rdf.RDFSerializationResult;
import org.eclipse.digitaltwin.aas4j.v3.model.AdministrativeInformation;

public class DefaultAdministrativeInformationRDFHandler implements RDFHandler<AdministrativeInformation> {
    @Override
    public RDFSerializationResult toModel(AdministrativeInformation key) {
        return null;
    }

    @Override
    public AdministrativeInformation fromModel(Model model, Resource subjectToParse) {
        return null;
    }
}
