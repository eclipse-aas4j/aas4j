package org.eclipse.digitaltwin.aas4j.v3.dataformat.rdf.handlers;

import org.apache.jena.rdf.model.Model;
import org.apache.jena.rdf.model.ModelFactory;
import org.apache.jena.rdf.model.Resource;
import org.apache.jena.rdf.model.ResourceFactory;
import org.eclipse.digitaltwin.aas4j.v3.dataformat.rdf.RDFSerializationResult;
import org.eclipse.digitaltwin.aas4j.v3.dataformat.rdf.RDFHandler;
import org.eclipse.digitaltwin.aas4j.v3.dataformat.rdf.DefaultRDFHandlerResult;
import org.eclipse.digitaltwin.aas4j.v3.model.AssetAdministrationShell;

public class DefaultAssetAdministrationShellRDFHandler implements RDFHandler<AssetAdministrationShell> {
    @Override
    public RDFSerializationResult toModel(AssetAdministrationShell key) {
        Model model = ModelFactory.createDefaultModel();
        if (key == null) {
            return new DefaultRDFHandlerResult(model, ResourceFactory.createResource());
        }
        return null;
    }

    @Override
    public AssetAdministrationShell fromModel(Model model, Resource subjectToParse) {
        return null;
    }
}
