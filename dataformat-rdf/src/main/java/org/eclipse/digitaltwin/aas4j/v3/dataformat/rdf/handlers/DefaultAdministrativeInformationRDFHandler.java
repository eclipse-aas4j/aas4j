package org.eclipse.digitaltwin.aas4j.v3.dataformat.rdf.handlers;

import org.apache.jena.rdf.model.Model;
import org.apache.jena.rdf.model.ModelFactory;
import org.apache.jena.rdf.model.Resource;
import org.apache.jena.rdf.model.ResourceFactory;
import org.apache.jena.vocabulary.RDF;
import org.eclipse.digitaltwin.aas4j.v3.dataformat.rdf.AASNamespace;
import org.eclipse.digitaltwin.aas4j.v3.dataformat.rdf.DefaultRDFHandlerResult;
import org.eclipse.digitaltwin.aas4j.v3.dataformat.rdf.RDFHandler;
import org.eclipse.digitaltwin.aas4j.v3.dataformat.rdf.RDFSerializationResult;
import org.eclipse.digitaltwin.aas4j.v3.model.AdministrativeInformation;

public class DefaultAdministrativeInformationRDFHandler implements RDFHandler<AdministrativeInformation> {
    @Override
    public RDFSerializationResult toModel(AdministrativeInformation key) {
        Model model = ModelFactory.createDefaultModel();
        if (key == null) {
            return new DefaultRDFHandlerResult(model, ResourceFactory.createResource());
        }
        Resource subject = model.createResource();
        return new DefaultRDFHandlerResult(model, subject);
    }

    @Override
    public AdministrativeInformation fromModel(Model model, Resource subjectToParse) {
        if (model.contains(subjectToParse, RDF.type, AASNamespace.Types.Key) == false){
            throw new IllegalArgumentException("Provided Resource is not a _");
        }

        return null;
    }
}
