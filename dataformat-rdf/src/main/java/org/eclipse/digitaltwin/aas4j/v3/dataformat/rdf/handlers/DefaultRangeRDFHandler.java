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
import org.eclipse.digitaltwin.aas4j.v3.model.Range;
import org.eclipse.digitaltwin.aas4j.v3.model.impl.DefaultRange;

public class DefaultRangeRDFHandler implements RDFHandler<Range> {
    @Override
    public RDFSerializationResult toModel(Range object) {
        Model model = ModelFactory.createDefaultModel();
        if (object == null) {
            return new DefaultRDFHandlerResult(model, ResourceFactory.createResource());
        }
        Resource subject = model.createResource();
        model.add(subject, RDF.type, AASNamespace.Types.Range);
        if (object.getMax() != null) {
            model.add(subject, AASNamespace.Range.max, object.getMax());
        }
        if (object.getMin() != null) {
            model.add(subject, AASNamespace.Range.min, object.getMin());
        }
        if (object.getValueType() != null) {
            model.add(subject, AASNamespace.Range.valueType, AASNamespace.DataTypeDefXsd.valueOf(object.getValueType().name()));
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
    public Range fromModel(Model model, Resource subjectToParse) throws IncompatibleTypeException {
        if (!model.contains(subjectToParse, RDF.type, AASNamespace.Types.Range)) {
            throw new IncompatibleTypeException("Range");
        }
        DefaultRange.Builder builder = new DefaultRange.Builder();

        if (model.contains(subjectToParse, AASNamespace.Range.max)) {
            builder.max(model.getProperty(subjectToParse, AASNamespace.Range.max).getString());
        }
        if (model.contains(subjectToParse, AASNamespace.Range.min)) {
            builder.min(model.getProperty(subjectToParse, AASNamespace.Range.min).getString());
        }
        if (model.contains(subjectToParse, AASNamespace.Range.valueType)) {
            Resource resource = model.getProperty(subjectToParse, AASNamespace.Range.valueType).getResource();
            builder.valueType(AASNamespace.DataTypeDefXsd.fromIRI(resource.getURI()));
        }
        Range object = builder.build();
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
