package org.eclipse.digitaltwin.aas4j.v3.dataformat.rdf.handlers;

import org.apache.jena.rdf.model.Model;
import org.apache.jena.rdf.model.ModelFactory;
import org.apache.jena.rdf.model.Resource;
import org.apache.jena.rdf.model.ResourceFactory;
import org.apache.jena.vocabulary.RDF;
import org.eclipse.digitaltwin.aas4j.v3.dataformat.rdf.*;
import org.eclipse.digitaltwin.aas4j.v3.model.DataSpecificationContent;
import org.eclipse.digitaltwin.aas4j.v3.model.EmbeddedDataSpecification;
import org.eclipse.digitaltwin.aas4j.v3.model.Reference;
import org.eclipse.digitaltwin.aas4j.v3.model.impl.DefaultEmbeddedDataSpecification;

public class DefaultEmbeddedDataSpecificationRDFHandler implements RDFHandler<EmbeddedDataSpecification> {
    @Override
    public RDFSerializationResult toModel(EmbeddedDataSpecification object) {
        Model model = ModelFactory.createDefaultModel();
        if (object == null) {
            return new DefaultRDFHandlerResult(model, ResourceFactory.createResource());
        }
        Resource subject = model.createResource();
        model.add(subject, RDF.type, AASNamespace.Types.EmbeddedDataSpecification);
        if (object.getDataSpecification() != null) {
            RDFSerializationResult res = new DefaultReferenceRDFHandler().toModel(object.getDataSpecification());
            model.add(subject, AASNamespace.EmbeddedDataSpecification.dataSpecification, res.getResource());
            model.add(res.getModel());
        }
        if (object.getDataSpecificationContent() != null) {
            RDFSerializationResult res =
                    new DefaultDataSpecificationContentRDFHandler().toModel(object.getDataSpecificationContent());
            model.add(subject, AASNamespace.EmbeddedDataSpecification.dataSpecificationContent, res.getResource());
            model.add(res.getModel());
        }
        return new DefaultRDFHandlerResult(model, subject);
    }

    @Override
    public EmbeddedDataSpecification fromModel(Model model, Resource subjectToParse) throws IncompatibleTypeException {
        if (model.contains(subjectToParse, RDF.type, AASNamespace.Types.EmbeddedDataSpecification) == false) {
            throw new IncompatibleTypeException("EmbeddedDataSpecification");
        }
        DefaultEmbeddedDataSpecification.Builder builder = new DefaultEmbeddedDataSpecification.Builder();
        if (model.contains(subjectToParse, AASNamespace.EmbeddedDataSpecification.dataSpecification)) {
            Resource resource = model.getProperty(subjectToParse,
                    AASNamespace.EmbeddedDataSpecification.dataSpecification).getResource();
            Reference reference = new DefaultReferenceRDFHandler().fromModel(model, resource);
            builder.dataSpecification(reference);
        }
        if (model.contains(subjectToParse, AASNamespace.EmbeddedDataSpecification.dataSpecificationContent)) {
            Resource resource = model.getProperty(subjectToParse,
                    AASNamespace.EmbeddedDataSpecification.dataSpecificationContent).getResource();

            DataSpecificationContent dataSpecificationContent =
                    new DefaultDataSpecificationContentRDFHandler().fromModel(model, resource);
            builder.dataSpecificationContent(dataSpecificationContent);
        }
        return builder.build();
    }
}
