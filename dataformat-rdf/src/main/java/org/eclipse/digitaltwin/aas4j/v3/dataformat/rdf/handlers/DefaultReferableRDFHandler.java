package org.eclipse.digitaltwin.aas4j.v3.dataformat.rdf.handlers;

import org.apache.jena.rdf.model.Model;
import org.apache.jena.rdf.model.Resource;
import org.apache.jena.rdf.model.Statement;
import org.apache.jena.vocabulary.RDF;
import org.eclipse.digitaltwin.aas4j.v3.dataformat.rdf.AASNamespace;
import org.eclipse.digitaltwin.aas4j.v3.dataformat.rdf.IncompatibleTypeException;
import org.eclipse.digitaltwin.aas4j.v3.dataformat.rdf.RDFHandler;
import org.eclipse.digitaltwin.aas4j.v3.dataformat.rdf.RDFSerializationResult;
import org.eclipse.digitaltwin.aas4j.v3.model.*;

public class DefaultReferableRDFHandler implements RDFHandler<Referable> {
    @Override
    public RDFSerializationResult toModel(Referable object) {
        if (object instanceof AssetAdministrationShell) {
            return new DefaultAssetAdministrationShellRDFHandler().toModel((AssetAdministrationShell) object);
        }
        if (object instanceof Submodel) {
            return new DefaultSubmodelRDFHandler().toModel((Submodel) object);
        }
        if (object instanceof ConceptDescription) {
            return new DefaultConceptDescriptionRDFHandler().toModel((ConceptDescription) object);
        }
        if (object instanceof SubmodelElement) {
            return new DefaultSubmodelElementRDFHandler().toModel((SubmodelElement) object);
        }
        throw new IllegalArgumentException("Provided object " +
                object.getClass() +
                " is not a known Referable");
    }

    @Override
    public Referable fromModel(Model model, Resource subjectToParse) throws IncompatibleTypeException {
        Statement typeStatement = model.getProperty(subjectToParse, RDF.type);
        // Discriminate on the RDF.type value.
        if (typeStatement.getResource().equals(AASNamespace.Types.AssetAdministrationShell)) {
            return new DefaultAssetAdministrationShellRDFHandler().fromModel(model, subjectToParse);
        }
        if (typeStatement.getResource().equals(AASNamespace.Types.Submodel)) {
            return new DefaultSubmodelRDFHandler().fromModel(model, subjectToParse);
        }
        if (typeStatement.getResource().equals(AASNamespace.Types.ConceptDescription)) {
            return new DefaultConceptDescriptionRDFHandler().fromModel(model, subjectToParse);
        }
        if (AASNamespace.Types.SUBMODEL_ELEMENTS.contains(typeStatement.getResource())) {
            return new DefaultSubmodelElementRDFHandler().fromModel(model, subjectToParse);
        }
        throw new IllegalArgumentException("Provided Resource " +
                typeStatement.getResource().getURI() +
                " is not a SubmodelElement");
    }
}
