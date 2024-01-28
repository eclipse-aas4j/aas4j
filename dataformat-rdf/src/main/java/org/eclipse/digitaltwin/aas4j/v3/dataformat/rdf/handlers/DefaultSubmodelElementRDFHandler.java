package org.eclipse.digitaltwin.aas4j.v3.dataformat.rdf.handlers;

import org.apache.jena.rdf.model.Model;
import org.apache.jena.rdf.model.Resource;
import org.apache.jena.rdf.model.Statement;
import org.apache.jena.vocabulary.RDF;
import org.eclipse.digitaltwin.aas4j.v3.dataformat.rdf.AASNamespace;
import org.eclipse.digitaltwin.aas4j.v3.dataformat.rdf.IncompatibleTypeException;
import org.eclipse.digitaltwin.aas4j.v3.dataformat.rdf.RDFHandler;
import org.eclipse.digitaltwin.aas4j.v3.dataformat.rdf.RDFSerializationResult;
import org.eclipse.digitaltwin.aas4j.v3.model.AnnotatedRelationshipElement;
import org.eclipse.digitaltwin.aas4j.v3.model.RelationshipElement;
import org.eclipse.digitaltwin.aas4j.v3.model.Submodel;
import org.eclipse.digitaltwin.aas4j.v3.model.*;
import org.eclipse.digitaltwin.aas4j.v3.model.impl.*;

public class DefaultSubmodelElementRDFHandler implements RDFHandler<SubmodelElement> {
    @Override
    public RDFSerializationResult toModel(SubmodelElement object) {
        // it should be bottom up in hierarchy
        if (object.getClass().isInstance(AnnotatedRelationshipElement.class)) {
            return new DefaultAnnotatedRelationshipElementRDFHandler().toModel((AnnotatedRelationshipElement) object);
        }
        if (object.getClass().isInstance(RelationshipElement.class)) {
            return new DefaultRelationshipElementRDFHandler().toModel((RelationshipElement) object);
        }
        if (object.getClass().isInstance(BasicEventElement.class)) {
            return new DefaultBasicEventElementRDFHandler().toModel((BasicEventElement) object);
        }
        if (object.getClass().isInstance(Blob.class)) {
            return new DefaultBlobRDFHandler().toModel((Blob) object);
        }
        if (object.getClass().isInstance(File.class)) {
            return new DefaultFileRDFHandler().toModel((File) object);
        }
        if (object.getClass().isInstance(MultiLanguageProperty.class)) {
            return new DefaultMultiLanguagePropertyRDFHandler().toModel((MultiLanguageProperty) object);
        }
        if (object.getClass().isInstance(Property.class)) {
            return new DefaultPropertyRDFHandler().toModel((Property) object);
        }
        if (object.getClass().isInstance(Range.class)) {
            return new DefaultRangeRDFHandler().toModel((Range) object);
        }
        if (object.getClass().isInstance(ReferenceElement.class)) {
            return new DefaultReferenceElementRDFHandler().toModel((ReferenceElement) object);
        }
        if (object.getClass().isInstance(SubmodelElementCollection.class)) {
            return new DefaultSubmodelElementCollectionRDFHandler().toModel((SubmodelElementCollection) object);
        }
        if (object.getClass().isInstance(SubmodelElementList.class)) {
            return new DefaultSubmodelElementListRDFHandler().toModel((SubmodelElementList) object);
        }
        if (object.getClass().isInstance(Entity.class)) {
            return new DefaultEntityRDFHandler().toModel((Entity) object);
        }
        if (object.getClass().isInstance(Capability.class)) {
            return new DefaultCapabilityRDFHandler().toModel((Capability) object);
        }
        if (object.getClass().isInstance(Operation.class)) {
            return new DefaultOperationRDFHandler().toModel((Operation) object);
        }

        throw new IllegalArgumentException("Provided object " +
                object.getClass() +
                " is not a known type");
    }

    @Override
    public SubmodelElement fromModel(Model model, Resource subjectToParse) throws IncompatibleTypeException {
        Statement typeStatement = model.getProperty(subjectToParse, RDF.type);
        // Discriminate on the RDF.type value.
        if (typeStatement.getResource().equals(AASNamespace.Types.AnnotatedRelationshipElement)) {
            return new DefaultAnnotatedRelationshipElementRDFHandler().fromModel(model, subjectToParse);
        }
        if (typeStatement.getResource().equals(AASNamespace.Types.RelationshipElement)) {
            return new DefaultRelationshipElementRDFHandler().fromModel(model, subjectToParse);
        }
        if (typeStatement.getResource().equals(AASNamespace.Types.BasicEventElement)) {
            return new DefaultBasicEventElementRDFHandler().fromModel(model, subjectToParse);
        }
        if (typeStatement.getResource().equals(AASNamespace.Types.Blob)) {
            return new DefaultBlobRDFHandler().fromModel(model, subjectToParse);
        }
        if (typeStatement.getResource().equals(AASNamespace.Types.File)) {
            return new DefaultFileRDFHandler().fromModel(model, subjectToParse);
        }
        if (typeStatement.getResource().equals(AASNamespace.Types.MultiLanguageProperty)) {
            return new DefaultMultiLanguagePropertyRDFHandler().fromModel(model, subjectToParse);
        }
        if (typeStatement.getResource().equals(AASNamespace.Types.Property)) {
            return new DefaultPropertyRDFHandler().fromModel(model, subjectToParse);
        }
        if (typeStatement.getResource().equals(AASNamespace.Types.Range)) {
            return new DefaultRangeRDFHandler().fromModel(model, subjectToParse);
        }
        if (typeStatement.getResource().equals(AASNamespace.Types.ReferenceElement)) {
            return new DefaultReferenceElementRDFHandler().fromModel(model, subjectToParse);
        }
        if (typeStatement.getResource().equals(AASNamespace.Types.SubmodelElementCollection)) {
            return new DefaultSubmodelElementCollectionRDFHandler().fromModel(model, subjectToParse);
        }
        if (typeStatement.getResource().equals(AASNamespace.Types.SubmodelElementList)) {
            return new DefaultSubmodelElementListRDFHandler().fromModel(model, subjectToParse);
        }
        if (typeStatement.getResource().equals(AASNamespace.Types.Entity)) {
            return new DefaultEntityRDFHandler().fromModel(model, subjectToParse);
        }
        if (typeStatement.getResource().equals(AASNamespace.Types.Capability)) {
            return new DefaultCapabilityRDFHandler().fromModel(model, subjectToParse);
        }
        if (typeStatement.getResource().equals(AASNamespace.Types.Operation)) {
            return new DefaultOperationRDFHandler().fromModel(model, subjectToParse);
        }

        throw new IllegalArgumentException("Provided Resource " +
                typeStatement.getResource().getURI() +
                " is not a SubmodelElement");
    }
}
