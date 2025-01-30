package org.eclipse.digitaltwin.aas4j.v3.dataformat.rdf.handlers;

import org.apache.jena.rdf.model.*;
import org.apache.jena.vocabulary.RDF;
import org.eclipse.digitaltwin.aas4j.v3.dataformat.rdf.*;
import org.eclipse.digitaltwin.aas4j.v3.model.AssetAdministrationShell;
import org.eclipse.digitaltwin.aas4j.v3.model.ConceptDescription;
import org.eclipse.digitaltwin.aas4j.v3.model.Environment;
import org.eclipse.digitaltwin.aas4j.v3.model.Submodel;
import org.eclipse.digitaltwin.aas4j.v3.model.impl.DefaultEnvironment;

import java.util.LinkedList;
import java.util.List;

public class DefaultEnvironmentRDFHandler implements RDFHandler<Environment> {
    @Override
    public RDFSerializationResult toModel(Environment object) {
        Model model = ModelFactory.createDefaultModel();
        if (object == null) {
            return new DefaultRDFHandlerResult(model, ResourceFactory.createResource());
        }
        Resource subject = model.createResource();
        model.add(subject, RDF.type, AASNamespace.Types.Environment);
        if (object.getAssetAdministrationShells() != null && object.getAssetAdministrationShells().isEmpty() == false) {
            for (AssetAdministrationShell shell : object.getAssetAdministrationShells()) {
                RDFSerializationResult res = new DefaultAssetAdministrationShellRDFHandler().toModel(shell);
                model.add(subject, AASNamespace.Environment.assetAdministrationShells, res.getResource());
                model.add(res.getModel());
            }
        }
        if (object.getSubmodels() != null && object.getSubmodels().isEmpty() == false) {
            for (Submodel submodel : object.getSubmodels()) {
                RDFSerializationResult res = new DefaultSubmodelRDFHandler().toModel(submodel);
                model.add(subject, AASNamespace.Environment.submodels, res.getResource());
                model.add(res.getModel());
            }
        }
        if (object.getConceptDescriptions() != null && object.getConceptDescriptions().isEmpty() == false) {
            for (ConceptDescription submodel : object.getConceptDescriptions()) {
                RDFSerializationResult res = new DefaultConceptDescriptionRDFHandler().toModel(submodel);
                model.add(subject, AASNamespace.Environment.conceptDescriptions, res.getResource());
                model.add(res.getModel());
            }
        }
        return new DefaultRDFHandlerResult(model, subject);
    }

    @Override
    public Environment fromModel(Model model, Resource subjectToParse) throws IncompatibleTypeException {
        if (!model.contains(subjectToParse, RDF.type, AASNamespace.Types.Environment)) {
            throw new IncompatibleTypeException("Environment");
        }
        DefaultEnvironment.Builder builder = new DefaultEnvironment.Builder();

        Environment object = builder.build();
        if (model.contains(subjectToParse, AASNamespace.Environment.assetAdministrationShells)) {
            NodeIterator nodeIterator = model.listObjectsOfProperty(subjectToParse, AASNamespace.Environment.assetAdministrationShells);
            List<AssetAdministrationShell> submodelElements = new LinkedList<>();
            nodeIterator.forEachRemaining(node -> {
                try {
                    AssetAdministrationShell key = new DefaultAssetAdministrationShellRDFHandler().fromModel(model, node.asResource());
                    submodelElements.add(key);
                } catch (IncompatibleTypeException e) {
                    throw new RuntimeException(e);
                }
            });
            builder.assetAdministrationShells(submodelElements);
        }
        if (model.contains(subjectToParse, AASNamespace.Environment.submodels)) {
            NodeIterator nodeIterator = model.listObjectsOfProperty(subjectToParse, AASNamespace.Environment.submodels);
            List<Submodel> submodels = new LinkedList<>();
            nodeIterator.forEachRemaining(node -> {
                try {
                    Submodel key = new DefaultSubmodelRDFHandler().fromModel(model, node.asResource());
                    submodels.add(key);
                } catch (IncompatibleTypeException e) {
                    throw new RuntimeException(e);
                }
            });
            builder.submodels(submodels);
        }
        if (model.contains(subjectToParse, AASNamespace.Environment.conceptDescriptions)) {
            NodeIterator nodeIterator = model.listObjectsOfProperty(subjectToParse, AASNamespace.Environment.conceptDescriptions);
            List<ConceptDescription> conceptDescriptions = new LinkedList<>();
            nodeIterator.forEachRemaining(node -> {
                try {
                    ConceptDescription key = new DefaultConceptDescriptionRDFHandler().fromModel(model, node.asResource());
                    conceptDescriptions.add(key);
                } catch (IncompatibleTypeException e) {
                    throw new RuntimeException(e);
                }
            });
            builder.conceptDescriptions(conceptDescriptions);
        }
        return object;
    }
}
