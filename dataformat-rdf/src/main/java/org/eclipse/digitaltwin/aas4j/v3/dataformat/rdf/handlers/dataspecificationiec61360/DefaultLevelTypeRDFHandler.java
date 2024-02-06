package org.eclipse.digitaltwin.aas4j.v3.dataformat.rdf.handlers.dataspecificationiec61360;

import org.apache.jena.rdf.model.Model;
import org.apache.jena.rdf.model.ModelFactory;
import org.apache.jena.rdf.model.Resource;
import org.apache.jena.rdf.model.ResourceFactory;
import org.apache.jena.vocabulary.RDF;
import org.eclipse.digitaltwin.aas4j.v3.dataformat.rdf.*;
import org.eclipse.digitaltwin.aas4j.v3.model.LevelType;
import org.eclipse.digitaltwin.aas4j.v3.model.impl.DefaultLevelType;

public class DefaultLevelTypeRDFHandler implements RDFHandler<LevelType> {
    @Override
    public RDFSerializationResult toModel(LevelType object) {
        Model model = ModelFactory.createDefaultModel();
        if (object == null) {
            return new DefaultRDFHandlerResult(model, ResourceFactory.createResource());
        }
        Resource subject = model.createResource();
        model.add(subject, RDF.type, AASNamespace.Types.LevelType);
        model.addLiteral(subject, AASNamespace.LevelType.min, object.getMin());
        model.addLiteral(subject, AASNamespace.LevelType.max, object.getMax());
        model.addLiteral(subject, AASNamespace.LevelType.nom, object.getNom());
        model.addLiteral(subject, AASNamespace.LevelType.typ, object.getTyp());
        return new DefaultRDFHandlerResult(model, subject);
    }

    @Override
    public LevelType fromModel(Model model, Resource subjectToParse) throws IncompatibleTypeException {
        if (!model.contains(subjectToParse, RDF.type, AASNamespace.Types.LevelType)) {
            throw new IllegalArgumentException("Provided Resource is not a LevelType");
        }
        return new DefaultLevelType.Builder()
                .min(model.getProperty(subjectToParse, AASNamespace.LevelType.min).getBoolean())
                .max(model.getProperty(subjectToParse, AASNamespace.LevelType.max).getBoolean())
                .nom(model.getProperty(subjectToParse, AASNamespace.LevelType.nom).getBoolean())
                .typ(model.getProperty(subjectToParse, AASNamespace.LevelType.typ).getBoolean())
                .build();
    }
}
