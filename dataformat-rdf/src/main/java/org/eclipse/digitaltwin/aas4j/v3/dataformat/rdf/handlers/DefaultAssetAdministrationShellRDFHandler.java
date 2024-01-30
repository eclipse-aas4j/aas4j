package org.eclipse.digitaltwin.aas4j.v3.dataformat.rdf.handlers;

import org.apache.jena.rdf.model.Model;
import org.apache.jena.rdf.model.ModelFactory;
import org.apache.jena.rdf.model.Resource;
import org.apache.jena.rdf.model.ResourceFactory;
import org.apache.jena.vocabulary.RDF;
import org.eclipse.digitaltwin.aas4j.v3.dataformat.rdf.*;
import org.eclipse.digitaltwin.aas4j.v3.model.AssetAdministrationShell;

public class DefaultAssetAdministrationShellRDFHandler implements RDFHandler<AssetAdministrationShell> {
    @Override
    public RDFSerializationResult toModel(AssetAdministrationShell object) {
        Model model = ModelFactory.createDefaultModel();
        if (object == null) {
            return new DefaultRDFHandlerResult(model, ResourceFactory.createResource());
        }
        Resource subject = model.createResource();
        return new DefaultRDFHandlerResult(model, subject);
    }

    @Override
    public AssetAdministrationShell fromModel(Model model, Resource subjectToParse) throws IncompatibleTypeException {
        if (model.contains(subjectToParse, RDF.type, AASNamespace.Types.AdministrativeInformation) == false){
            throw new IncompatibleTypeException("AssetAdministrationShell");
        }

        return null;
    }

}
