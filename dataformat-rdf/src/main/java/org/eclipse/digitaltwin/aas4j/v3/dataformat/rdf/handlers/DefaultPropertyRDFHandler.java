package org.eclipse.digitaltwin.aas4j.v3.dataformat.rdf.handlers;

import org.apache.jena.rdf.model.Model;
import org.apache.jena.rdf.model.ModelFactory;
import org.apache.jena.rdf.model.Resource;
import org.apache.jena.rdf.model.ResourceFactory;
import org.apache.jena.vocabulary.RDF;
import org.eclipse.digitaltwin.aas4j.v3.dataformat.rdf.*;
import org.eclipse.digitaltwin.aas4j.v3.dataformat.rdf.handlers.partial.DefaultHasDataSpecificationRDFPartialHandler;
import org.eclipse.digitaltwin.aas4j.v3.dataformat.rdf.handlers.partial.DefaultHasSemanticsRDFPartialHandler;
import org.eclipse.digitaltwin.aas4j.v3.dataformat.rdf.handlers.partial.DefaultQualifiableRDFPartialHandler;
import org.eclipse.digitaltwin.aas4j.v3.dataformat.rdf.handlers.partial.DefaultReferableRDFPartialHandler;
import org.eclipse.digitaltwin.aas4j.v3.model.Property;
import org.eclipse.digitaltwin.aas4j.v3.model.Reference;
import org.eclipse.digitaltwin.aas4j.v3.model.impl.DefaultProperty;

public class DefaultPropertyRDFHandler implements RDFHandler<Property> {
    @Override
    public RDFSerializationResult toModel(Property object) {
        Model model = ModelFactory.createDefaultModel();
        if (object == null) {
            return new DefaultRDFHandlerResult(model, ResourceFactory.createResource());
        }
        Resource subject = model.createResource();
        model.add(subject, RDF.type, AASNamespace.Types.Property);
        if (object.getValue() != null) {
            model.add(subject, AASNamespace.Property.value, object.getValue());
        }
        if (object.getValueId() != null) {
            RDFSerializationResult res = new DefaultReferenceRDFHandler().toModel(object.getValueId());
            model.add(subject, AASNamespace.Property.valueId, res.getResource());
            model.add(res.getModel());
        }
        if (object.getValueType() != null) {
            model.add(subject, AASNamespace.Property.valueType,
                    AASNamespace.DataTypeDefXsd.valueOf(object.getValueType().name()));
        }
        //HasDataSpecification
        new DefaultHasDataSpecificationRDFPartialHandler().partialToModel(object, model, subject);
        //HasSemantics
        new DefaultHasSemanticsRDFPartialHandler().partialToModel(object, model, subject);
        //Qualifiable
        new DefaultQualifiableRDFPartialHandler().partialToModel(object, model, subject);
        //Referable
        new DefaultReferableRDFPartialHandler().partialToModel(object, model, subject);
        return new DefaultRDFHandlerResult(model, subject);
    }

    @Override
    public Property fromModel(Model model, Resource subjectToParse) throws IncompatibleTypeException {
        if (!model.contains(subjectToParse, RDF.type, AASNamespace.Types.Property)) {
            throw new IncompatibleTypeException("Property");
        }
        //TODO: Get this from supplier
        Property object = new DefaultProperty();

        if (model.contains(subjectToParse, AASNamespace.Property.value)) {
            object.setValue(model.getProperty(subjectToParse, AASNamespace.Property.value).getString());
        }
        if (model.contains(subjectToParse, AASNamespace.Property.valueId)) {
            Resource resource = model.getProperty(subjectToParse, AASNamespace.Property.valueId).getResource();
            Reference reference = new DefaultReferenceRDFHandler().fromModel(model, resource);
            object.setValueId(reference);
        }
        if (model.contains(subjectToParse, AASNamespace.Property.valueType)) {
            Resource resource = model.getProperty(subjectToParse, AASNamespace.Property.valueType).getResource();
            object.setValueType(AASNamespace.DataTypeDefXsd.fromIRI(resource.getURI()));
        }
        //HasDataSpecification
        new DefaultHasDataSpecificationRDFPartialHandler().partialFromModel(object, model, subjectToParse);
        //HasSemantics
        new DefaultHasSemanticsRDFPartialHandler().partialFromModel(object, model, subjectToParse);
        //Qualifiable
        new DefaultQualifiableRDFPartialHandler().partialFromModel(object, model, subjectToParse);
        //Referable
        new DefaultReferableRDFPartialHandler().partialFromModel(object, model, subjectToParse);
        return object;
    }
}
