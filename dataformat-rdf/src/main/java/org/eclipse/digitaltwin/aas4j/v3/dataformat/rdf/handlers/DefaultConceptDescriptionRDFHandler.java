package org.eclipse.digitaltwin.aas4j.v3.dataformat.rdf.handlers;

import org.apache.jena.rdf.model.Model;
import org.apache.jena.rdf.model.ModelFactory;
import org.apache.jena.rdf.model.Resource;
import org.apache.jena.rdf.model.ResourceFactory;
import org.apache.jena.vocabulary.RDF;
import org.eclipse.digitaltwin.aas4j.v3.dataformat.rdf.*;
import org.eclipse.digitaltwin.aas4j.v3.dataformat.rdf.handlers.partial.DefaultIdentifiableRDFHandler;
import org.eclipse.digitaltwin.aas4j.v3.model.ConceptDescription;
import org.eclipse.digitaltwin.aas4j.v3.model.Reference;
import org.eclipse.digitaltwin.aas4j.v3.model.impl.DefaultConceptDescription;

public class DefaultConceptDescriptionRDFHandler implements RDFHandler<ConceptDescription> {

    @Override
    public RDFSerializationResult toModel(ConceptDescription key) {
        Model model = ModelFactory.createDefaultModel();
        if (key == null) {
            return new DefaultRDFHandlerResult(model, ResourceFactory.createResource());
        }
        Resource conceptDescriptionResource = model.createResource(key.getId());
        model.add(conceptDescriptionResource, RDF.type, AASNamespace.Types.ConceptDescription);
        //HasDataSpecification
        if (key.getEmbeddedDataSpecifications() != null && key.getEmbeddedDataSpecifications().isEmpty() == false) {

        }

        //Identifiable
        new DefaultIdentifiableRDFHandler().partialToModel(key, model, conceptDescriptionResource);

        for (Reference reference : key.getIsCaseOf()) {
            // TODO: Optional ordering
            RDFSerializationResult result = new DefaultReferenceRDFHandler().toModel(reference);
            model.add(result.getModel());
            conceptDescriptionResource.addProperty(AASNamespace.ConceptDescription.isCaseOf, result.getResource());
        }

        return new DefaultRDFHandlerResult(model, conceptDescriptionResource);
    }

    @Override
    public ConceptDescription fromModel(Model model, Resource subjectToParse) throws IncompatibleTypeException {
        if (model.contains(subjectToParse, RDF.type, AASNamespace.Types.ConceptDescription) == false) {
            throw new IncompatibleTypeException();
        }
        ConceptDescription build = new DefaultConceptDescription.Builder()
                .build();
        new DefaultIdentifiableRDFHandler().partialFromModel(build, model, subjectToParse);
        return build;
    }
}
