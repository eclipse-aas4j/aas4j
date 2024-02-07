package org.eclipse.digitaltwin.aas4j.v3.dataformat.rdf;

import org.apache.jena.rdf.model.ResourceFactory;

/**
 * Elements of Asset Administration Shell as org.apache.jena.rdf.model.Resource and org.apache.jena.rdf.model.Property compatible with Apache Jena.
 */
public final class AASNamespace {
    public static final String AAS_NAMESPACE = "https://admin-shell.io/aas/3/0/";

    public static final org.apache.jena.rdf.model.Property index = ResourceFactory.createProperty(AAS_NAMESPACE + "index");

    private AASNamespace() {

    }

    /**
     * A key is a reference to an element by its ID.
     *
     * @see AASNamespace.KeyTypes
     */
    public static final class Key {
        /**
         * The key value, for example an IRDI or an URI
         */
        public static final org.apache.jena.rdf.model.Property value = ResourceFactory.createProperty(AAS_NAMESPACE + "Key/value");
        /**
         * Denotes which kind of entity is referenced.
         */
        public static final org.apache.jena.rdf.model.Property type = ResourceFactory.createProperty(AAS_NAMESPACE + "Key/type");
    }

    public static final class Reference {
        public static final org.apache.jena.rdf.model.Property keys = ResourceFactory.createProperty(AAS_NAMESPACE + "Reference/keys");
        public static final org.apache.jena.rdf.model.Property type = ResourceFactory.createProperty(AAS_NAMESPACE + "Reference/type");
    }

    public static final class HasExtensions {
        public static final org.apache.jena.rdf.model.Property extensions = ResourceFactory.createProperty(AAS_NAMESPACE + "HasExtensions/extensions");
    }

    public static final class Referable {
        public static final org.apache.jena.rdf.model.Property idShort = ResourceFactory.createProperty(AAS_NAMESPACE + "Referable/idShort");
        public static final org.apache.jena.rdf.model.Property displayName = ResourceFactory.createProperty(AAS_NAMESPACE + "Referable/displayName");
        public static final org.apache.jena.rdf.model.Property description = ResourceFactory.createProperty(AAS_NAMESPACE + "Referable/description");
        public static final org.apache.jena.rdf.model.Property category = ResourceFactory.createProperty(AAS_NAMESPACE + "Referable/category");
    }

    public static final class Identifiable {
        public static final org.apache.jena.rdf.model.Property id = ResourceFactory.createProperty(AAS_NAMESPACE + "Identifiable/id");
        public static final org.apache.jena.rdf.model.Property administration = ResourceFactory.createProperty(AAS_NAMESPACE + "Identifiable/administration");
    }

    /**
     * The semantics of a property or other elements that may have a semantic description is defined by a concept description.
     */
    public static class ConceptDescription {
        public static final org.apache.jena.rdf.model.Property isCaseOf = ResourceFactory.createProperty(AAS_NAMESPACE + "ConceptDescription/isCaseOf");
    }

    /**
     * Enumeration of different key value types within a key.
     *
     * @see AASNamespace.Key
     */
    public static final class KeyTypes {
        public static final org.apache.jena.rdf.model.Resource AnnotatedRelationshipElement =
                ResourceFactory.createResource(AAS_NAMESPACE + "KeyTypes/AnnotatedRelationshipElement");
        public static final org.apache.jena.rdf.model.Resource AssetAdministrationShell =
                ResourceFactory.createResource(AAS_NAMESPACE + "KeyTypes/AssetAdministrationShell");
        public static final org.apache.jena.rdf.model.Resource BasicEventElement =
                ResourceFactory.createResource(AAS_NAMESPACE + "KeyTypes/BasicEventElement");
        public static final org.apache.jena.rdf.model.Resource Blob =
                ResourceFactory.createResource(AAS_NAMESPACE + "KeyTypes/Blob");
        public static final org.apache.jena.rdf.model.Resource Capability =
                ResourceFactory.createResource(AAS_NAMESPACE + "KeyTypes/Capability");
        public static final org.apache.jena.rdf.model.Resource ConceptDescription =
                ResourceFactory.createResource(AAS_NAMESPACE + "KeyTypes/ConceptDescription");
        public static final org.apache.jena.rdf.model.Resource DataElement =
                ResourceFactory.createResource(AAS_NAMESPACE + "KeyTypes/DataElement");
        public static final org.apache.jena.rdf.model.Resource Entity =
                ResourceFactory.createResource(AAS_NAMESPACE + "KeyTypes/Entity");
        public static final org.apache.jena.rdf.model.Resource EventElement =
                ResourceFactory.createResource(AAS_NAMESPACE + "KeyTypes/EventElement");
        public static final org.apache.jena.rdf.model.Resource File =
                ResourceFactory.createResource(AAS_NAMESPACE + "KeyTypes/File");
        public static final org.apache.jena.rdf.model.Resource FragmentReference =
                ResourceFactory.createResource(AAS_NAMESPACE + "KeyTypes/FragmentReference");
        public static final org.apache.jena.rdf.model.Resource GlobalReference =
                ResourceFactory.createResource(AAS_NAMESPACE + "KeyTypes/GlobalReference");
        public static final org.apache.jena.rdf.model.Resource Identifiable =
                ResourceFactory.createResource(AAS_NAMESPACE + "KeyTypes/Identifiable");
        public static final org.apache.jena.rdf.model.Resource MultiLanguageProperty =
                ResourceFactory.createResource(AAS_NAMESPACE + "KeyTypes/MultiLanguageProperty");
        public static final org.apache.jena.rdf.model.Resource Operation =
                ResourceFactory.createResource(AAS_NAMESPACE + "KeyTypes/Operation");
        public static final org.apache.jena.rdf.model.Resource Property =
                ResourceFactory.createResource(AAS_NAMESPACE + "KeyTypes/Property");
        public static final org.apache.jena.rdf.model.Resource Range =
                ResourceFactory.createResource(AAS_NAMESPACE + "KeyTypes/Range");
        public static final org.apache.jena.rdf.model.Resource ReferenceElement =
                ResourceFactory.createResource(AAS_NAMESPACE + "KeyTypes/ReferenceElement");
        public static final org.apache.jena.rdf.model.Resource RelationshipElement =
                ResourceFactory.createResource(AAS_NAMESPACE + "KeyTypes/RelationshipElement");
        public static final org.apache.jena.rdf.model.Resource Submodel =
                ResourceFactory.createResource(AAS_NAMESPACE + "KeyTypes/Submodel");
        public static final org.apache.jena.rdf.model.Resource SubmodelElement =
                ResourceFactory.createResource(AAS_NAMESPACE + "KeyTypes/SubmodelElement");
        public static final org.apache.jena.rdf.model.Resource SubmodelElementCollection =
                ResourceFactory.createResource(AAS_NAMESPACE + "KeyTypes/SubmodelElementCollection");
        public static final org.apache.jena.rdf.model.Resource SubmodelElementList =
                ResourceFactory.createResource(AAS_NAMESPACE + "KeyTypes/SubmodelElementList");

        public static org.eclipse.digitaltwin.aas4j.v3.model.KeyTypes fromIRI(String stringIRI) {
            if (stringIRI.equals(AnnotatedRelationshipElement.getURI())) {
                return org.eclipse.digitaltwin.aas4j.v3.model.KeyTypes.ANNOTATED_RELATIONSHIP_ELEMENT;
            }
            if (stringIRI.equals(AssetAdministrationShell.getURI())) {
                return org.eclipse.digitaltwin.aas4j.v3.model.KeyTypes.ASSET_ADMINISTRATION_SHELL;
            }
            if (stringIRI.equals(BasicEventElement.getURI())) {
                return org.eclipse.digitaltwin.aas4j.v3.model.KeyTypes.BASIC_EVENT_ELEMENT;
            }
            if (stringIRI.equals(Blob.getURI())) {
                return org.eclipse.digitaltwin.aas4j.v3.model.KeyTypes.BLOB;
            }
            if (stringIRI.equals(Capability.getURI())) {
                return org.eclipse.digitaltwin.aas4j.v3.model.KeyTypes.CAPABILITY;
            }
            if (stringIRI.equals(ConceptDescription.getURI())) {
                return org.eclipse.digitaltwin.aas4j.v3.model.KeyTypes.CONCEPT_DESCRIPTION;
            }
            if (stringIRI.equals(DataElement.getURI())) {
                return org.eclipse.digitaltwin.aas4j.v3.model.KeyTypes.DATA_ELEMENT;
            }
            if (stringIRI.equals(Entity.getURI())) {
                return org.eclipse.digitaltwin.aas4j.v3.model.KeyTypes.ENTITY;
            }
            if (stringIRI.equals(EventElement.getURI())) {
                return org.eclipse.digitaltwin.aas4j.v3.model.KeyTypes.EVENT_ELEMENT;
            }
            if (stringIRI.equals(File.getURI())) {
                return org.eclipse.digitaltwin.aas4j.v3.model.KeyTypes.FILE;
            }
            if (stringIRI.equals(FragmentReference.getURI())) {
                return org.eclipse.digitaltwin.aas4j.v3.model.KeyTypes.FRAGMENT_REFERENCE;
            }
            if (stringIRI.equals(GlobalReference.getURI())) {
                return org.eclipse.digitaltwin.aas4j.v3.model.KeyTypes.GLOBAL_REFERENCE;
            }
            if (stringIRI.equals(Identifiable.getURI())) {
                return org.eclipse.digitaltwin.aas4j.v3.model.KeyTypes.IDENTIFIABLE;
            }
            if (stringIRI.equals(MultiLanguageProperty.getURI())) {
                return org.eclipse.digitaltwin.aas4j.v3.model.KeyTypes.MULTI_LANGUAGE_PROPERTY;
            }
            if (stringIRI.equals(Operation.getURI())) {
                return org.eclipse.digitaltwin.aas4j.v3.model.KeyTypes.OPERATION;
            }
            if (stringIRI.equals(Property.getURI())) {
                return org.eclipse.digitaltwin.aas4j.v3.model.KeyTypes.PROPERTY;
            }
            if (stringIRI.equals(Range.getURI())) {
                return org.eclipse.digitaltwin.aas4j.v3.model.KeyTypes.RANGE;
            }
            if (stringIRI.equals(ReferenceElement.getURI())) {
                return org.eclipse.digitaltwin.aas4j.v3.model.KeyTypes.REFERENCE_ELEMENT;
            }
            if (stringIRI.equals(RelationshipElement.getURI())) {
                return org.eclipse.digitaltwin.aas4j.v3.model.KeyTypes.RELATIONSHIP_ELEMENT;
            }
            if (stringIRI.equals(Submodel.getURI())) {
                return org.eclipse.digitaltwin.aas4j.v3.model.KeyTypes.SUBMODEL;
            }
            if (stringIRI.equals(SubmodelElement.getURI())) {
                return org.eclipse.digitaltwin.aas4j.v3.model.KeyTypes.SUBMODEL_ELEMENT;
            }
            if (stringIRI.equals(SubmodelElementCollection.getURI())) {
                return org.eclipse.digitaltwin.aas4j.v3.model.KeyTypes.SUBMODEL_ELEMENT_COLLECTION;
            }
            if (stringIRI.equals(SubmodelElementList.getURI())) {
                return org.eclipse.digitaltwin.aas4j.v3.model.KeyTypes.SUBMODEL_ELEMENT_LIST;
            }
            throw new IllegalArgumentException("Invalid KeyTypes IRI provided.");
        }

        public static org.apache.jena.rdf.model.Resource valueOf(String type) {
            if (type.equalsIgnoreCase(org.eclipse.digitaltwin.aas4j.v3.model.KeyTypes.ANNOTATED_RELATIONSHIP_ELEMENT.name())) {
                return AnnotatedRelationshipElement;
            }
            if (type.equalsIgnoreCase(org.eclipse.digitaltwin.aas4j.v3.model.KeyTypes.GLOBAL_REFERENCE.name())) {
                return GlobalReference;
            }
            if (type.equalsIgnoreCase(org.eclipse.digitaltwin.aas4j.v3.model.KeyTypes.FRAGMENT_REFERENCE.name())) {
                return FragmentReference;
            }
            if (type.equalsIgnoreCase(org.eclipse.digitaltwin.aas4j.v3.model.KeyTypes.ANNOTATED_RELATIONSHIP_ELEMENT.name())) {
                return AnnotatedRelationshipElement;
            }
            if (type.equalsIgnoreCase(org.eclipse.digitaltwin.aas4j.v3.model.KeyTypes.ASSET_ADMINISTRATION_SHELL.name())) {
                return AssetAdministrationShell;
            }
            if (type.equalsIgnoreCase(org.eclipse.digitaltwin.aas4j.v3.model.KeyTypes.BASIC_EVENT_ELEMENT.name())) {
                return BasicEventElement;
            }
            if (type.equalsIgnoreCase(org.eclipse.digitaltwin.aas4j.v3.model.KeyTypes.BLOB.name())) {
                return Blob;
            }
            if (type.equalsIgnoreCase(org.eclipse.digitaltwin.aas4j.v3.model.KeyTypes.CAPABILITY.name())) {
                return Capability;
            }
            if (type.equalsIgnoreCase(org.eclipse.digitaltwin.aas4j.v3.model.KeyTypes.CONCEPT_DESCRIPTION.name())) {
                return ConceptDescription;
            }
            if (type.equalsIgnoreCase(org.eclipse.digitaltwin.aas4j.v3.model.KeyTypes.DATA_ELEMENT.name())) {
                return DataElement;
            }
            if (type.equalsIgnoreCase(org.eclipse.digitaltwin.aas4j.v3.model.KeyTypes.ENTITY.name())) {
                return Entity;
            }
            if (type.equalsIgnoreCase(org.eclipse.digitaltwin.aas4j.v3.model.KeyTypes.EVENT_ELEMENT.name())) {
                return EventElement;
            }
            if (type.equalsIgnoreCase(org.eclipse.digitaltwin.aas4j.v3.model.KeyTypes.FILE.name())) {
                return File;
            }
            if (type.equalsIgnoreCase(org.eclipse.digitaltwin.aas4j.v3.model.KeyTypes.FRAGMENT_REFERENCE.name())) {
                return FragmentReference;
            }
            if (type.equalsIgnoreCase(org.eclipse.digitaltwin.aas4j.v3.model.KeyTypes.GLOBAL_REFERENCE.name())) {
                return GlobalReference;
            }
            if (type.equalsIgnoreCase(org.eclipse.digitaltwin.aas4j.v3.model.KeyTypes.IDENTIFIABLE.name())) {
                return Identifiable;
            }
            if (type.equalsIgnoreCase(org.eclipse.digitaltwin.aas4j.v3.model.KeyTypes.MULTI_LANGUAGE_PROPERTY.name())) {
                return MultiLanguageProperty;
            }
            if (type.equalsIgnoreCase(org.eclipse.digitaltwin.aas4j.v3.model.KeyTypes.OPERATION.name())) {
                return Operation;
            }
            if (type.equalsIgnoreCase(org.eclipse.digitaltwin.aas4j.v3.model.KeyTypes.PROPERTY.name())) {
                return Property;
            }
            if (type.equalsIgnoreCase(org.eclipse.digitaltwin.aas4j.v3.model.KeyTypes.RANGE.name())) {
                return Range;
            }
            if (type.equalsIgnoreCase(org.eclipse.digitaltwin.aas4j.v3.model.KeyTypes.REFERENCE_ELEMENT.name())) {
                return ReferenceElement;
            }
            if (type.equalsIgnoreCase(org.eclipse.digitaltwin.aas4j.v3.model.KeyTypes.RELATIONSHIP_ELEMENT.name())) {
                return RelationshipElement;
            }
            if (type.equalsIgnoreCase(org.eclipse.digitaltwin.aas4j.v3.model.KeyTypes.SUBMODEL.name())) {
                return Submodel;
            }
            if (type.equalsIgnoreCase(org.eclipse.digitaltwin.aas4j.v3.model.KeyTypes.SUBMODEL_ELEMENT.name())) {
                return SubmodelElement;
            }
            if (type.equalsIgnoreCase(org.eclipse.digitaltwin.aas4j.v3.model.KeyTypes.SUBMODEL_ELEMENT_COLLECTION.name())) {
                return SubmodelElementCollection;
            }
            if (type.equalsIgnoreCase(org.eclipse.digitaltwin.aas4j.v3.model.KeyTypes.SUBMODEL_ELEMENT_LIST.name())) {
                return SubmodelElementList;
            }

            throw new IllegalArgumentException("Invalid KeyTypes provided.");
        }
    }

    public static final class ReferenceTypes {
        public static final org.apache.jena.rdf.model.Resource ExternalReference =
                ResourceFactory.createResource(AAS_NAMESPACE + "ReferenceTypes/ExternalReference");
        public static final org.apache.jena.rdf.model.Resource ModelReference =
                ResourceFactory.createResource(AAS_NAMESPACE + "ReferenceTypes/ModelReference");

        public static org.eclipse.digitaltwin.aas4j.v3.model.ReferenceTypes fromIRI(String stringIRI) {
            if (stringIRI.equals(ModelReference.getURI())) {
                return org.eclipse.digitaltwin.aas4j.v3.model.ReferenceTypes.MODEL_REFERENCE;
            }
            if (stringIRI.equals(ExternalReference.getURI())) {
                return org.eclipse.digitaltwin.aas4j.v3.model.ReferenceTypes.EXTERNAL_REFERENCE;
            }
            throw new IllegalArgumentException("Invalid ReferenceType IRI provided.");
        }

        public static org.apache.jena.rdf.model.Resource valueOf(String type) {
            if (type.equalsIgnoreCase(org.eclipse.digitaltwin.aas4j.v3.model.ReferenceTypes.EXTERNAL_REFERENCE.name())) {
                return ExternalReference;
            }
            if (type.equalsIgnoreCase(org.eclipse.digitaltwin.aas4j.v3.model.ReferenceTypes.MODEL_REFERENCE.name())) {
                return ModelReference;
            }
            throw new IllegalArgumentException("Invalid ReferenceType provided.");
        }
    }

    public static final class Types {

        public static final org.apache.jena.rdf.model.Resource AdministrativeInformation =
                ResourceFactory.createResource(AAS_NAMESPACE + "AdministrativeInformation");
        public static final org.apache.jena.rdf.model.Resource AnnotatedRelationshipElement =
                ResourceFactory.createResource(AAS_NAMESPACE + "AnnotatedRelationshipElement");
        public static final org.apache.jena.rdf.model.Resource AssetAdministrationShell =
                ResourceFactory.createResource(AAS_NAMESPACE + "AssetAdministrationShell");
        public static final org.apache.jena.rdf.model.Resource AssetInformation =
                ResourceFactory.createResource(AAS_NAMESPACE + "AssetInformation");
        public static final org.apache.jena.rdf.model.Resource BasicEventElement =
                ResourceFactory.createResource(AAS_NAMESPACE + "BasicEventElement");
        public static final org.apache.jena.rdf.model.Resource Blob =
                ResourceFactory.createResource(AAS_NAMESPACE + "Blob");
        public static final org.apache.jena.rdf.model.Resource Capability =
                ResourceFactory.createResource(AAS_NAMESPACE + "Capability");
        public static final org.apache.jena.rdf.model.Resource ConceptDescription =
                ResourceFactory.createResource(AAS_NAMESPACE + "ConceptDescription");
        public static final org.apache.jena.rdf.model.Resource DataSpecificationIec61360 =
                ResourceFactory.createResource(AAS_NAMESPACE + "DataSpecificationIec61360");
        public static final org.apache.jena.rdf.model.Resource EmbeddedDataSpecification =
                ResourceFactory.createResource(AAS_NAMESPACE + "EmbeddedDataSpecification");
        public static final org.apache.jena.rdf.model.Resource Entity =
                ResourceFactory.createResource(AAS_NAMESPACE + "Entity");
        public static final org.apache.jena.rdf.model.Resource Extension =
                ResourceFactory.createResource(AAS_NAMESPACE + "Extension");
        public static final org.apache.jena.rdf.model.Resource File =
                ResourceFactory.createResource(AAS_NAMESPACE + "File");

        public static final org.apache.jena.rdf.model.Resource Key =
                ResourceFactory.createResource(AAS_NAMESPACE + "Key");
        public static final org.apache.jena.rdf.model.Resource LangStringDefinitionTypeIec61360 =
                ResourceFactory.createResource(AAS_NAMESPACE + "LangStringDefinitionTypeIec61360");
        public static final org.apache.jena.rdf.model.Resource LangStringNameType =
                ResourceFactory.createResource(AAS_NAMESPACE + "LangStringNameType");
        public static final org.apache.jena.rdf.model.Resource LangStringPreferredNameTypeIec61360 =
                ResourceFactory.createResource(AAS_NAMESPACE + "LangStringPreferredNameTypeIec61360");
        public static final org.apache.jena.rdf.model.Resource LangStringShortNameTypeIec61360 =
                ResourceFactory.createResource(AAS_NAMESPACE + "LangStringShortNameTypeIec61360");
        public static final org.apache.jena.rdf.model.Resource LangStringTextType =
                ResourceFactory.createResource(AAS_NAMESPACE + "LangStringTextType");
        public static final org.apache.jena.rdf.model.Resource LevelType =
                ResourceFactory.createResource(AAS_NAMESPACE + "LevelType");
        public static final org.apache.jena.rdf.model.Resource MultiLanguageProperty =
                ResourceFactory.createResource(AAS_NAMESPACE + "MultiLanguageProperty");
        public static final org.apache.jena.rdf.model.Resource Operation =
                ResourceFactory.createResource(AAS_NAMESPACE + "Operation");
        public static final org.apache.jena.rdf.model.Resource OperationVariable =
                ResourceFactory.createResource(AAS_NAMESPACE + "OperationVariable");
        public static final org.apache.jena.rdf.model.Resource Property =
                ResourceFactory.createResource(AAS_NAMESPACE + "Property");
        public static final org.apache.jena.rdf.model.Resource Qualifier =
                ResourceFactory.createResource(AAS_NAMESPACE + "Qualifier");
        public static final org.apache.jena.rdf.model.Resource Range =
                ResourceFactory.createResource(AAS_NAMESPACE + "Range");
        public static final org.apache.jena.rdf.model.Resource Reference =
                ResourceFactory.createResource(AAS_NAMESPACE + "Reference");
        public static final org.apache.jena.rdf.model.Resource ReferenceElement =
                ResourceFactory.createResource(AAS_NAMESPACE + "ReferenceElement");
        public static final org.apache.jena.rdf.model.Resource RelationshipElement =
                ResourceFactory.createResource(AAS_NAMESPACE + "RelationshipElement");
        public static final org.apache.jena.rdf.model.Resource Resource =
                ResourceFactory.createResource(AAS_NAMESPACE + "Resource");
        public static final org.apache.jena.rdf.model.Resource SpecificAssetId =
                ResourceFactory.createResource(AAS_NAMESPACE + "SpecificAssetId");
        public static final org.apache.jena.rdf.model.Resource Submodel =
                ResourceFactory.createResource(AAS_NAMESPACE + "Submodel");
        public static final org.apache.jena.rdf.model.Resource SubmodelElementCollection =
                ResourceFactory.createResource(AAS_NAMESPACE + "SubmodelElementCollection");
        public static final org.apache.jena.rdf.model.Resource SubmodelElementList =
                ResourceFactory.createResource(AAS_NAMESPACE + "SubmodelElementList");
        public static final org.apache.jena.rdf.model.Resource ValueList =
                ResourceFactory.createResource(AAS_NAMESPACE + "ValueList");
        public static final org.apache.jena.rdf.model.Resource ValueReferencePair =
                ResourceFactory.createResource(AAS_NAMESPACE + "ValueReferencePair");

    }

    public static final class LevelType {
        public static final org.apache.jena.rdf.model.Property min = ResourceFactory.createProperty(AAS_NAMESPACE + "LevelType/min");
        public static final org.apache.jena.rdf.model.Property nom = ResourceFactory.createProperty(AAS_NAMESPACE + "LevelType/nom");
        public static final org.apache.jena.rdf.model.Property typ = ResourceFactory.createProperty(AAS_NAMESPACE + "LevelType/typ");
        public static final org.apache.jena.rdf.model.Property max = ResourceFactory.createProperty(AAS_NAMESPACE + "LevelType/max");
    }

    public static final class AbstractLangString {
        public static final org.apache.jena.rdf.model.Property language = ResourceFactory.createProperty(AAS_NAMESPACE + "AbstractLangString/language");
        public static final org.apache.jena.rdf.model.Property text = ResourceFactory.createProperty(AAS_NAMESPACE + "AbstractLangString/text");
    }

    public static final class Extension {
        public static final org.apache.jena.rdf.model.Property value = ResourceFactory.createProperty(AAS_NAMESPACE + "Extension/value");
        public static final org.apache.jena.rdf.model.Property valueType = ResourceFactory.createProperty(AAS_NAMESPACE + "Extension/valueType");
        public static final org.apache.jena.rdf.model.Property refersTo = ResourceFactory.createProperty(AAS_NAMESPACE + "Extension/refersTo");
        public static final org.apache.jena.rdf.model.Property name = ResourceFactory.createProperty(AAS_NAMESPACE + "Extension/name");

    }

    public static final class ValueReferencePair {
        public static final org.apache.jena.rdf.model.Property value = ResourceFactory.createProperty(AAS_NAMESPACE + "ValueReferencePair/value");
        public static final org.apache.jena.rdf.model.Property valueId = ResourceFactory.createProperty(AAS_NAMESPACE + "ValueReferencePair/valueId");
    }

    public static final class ValueList {
        public static final org.apache.jena.rdf.model.Property valueReferencePairs = ResourceFactory.createProperty(AAS_NAMESPACE + "ValueList/valueReferencePairs");
    }

    public static final class EmbeddedDataSpecification {
        public static final org.apache.jena.rdf.model.Property dataSpecification =
                ResourceFactory.createProperty(AAS_NAMESPACE + "EmbeddedDataSpecification/dataSpecification");
        public static final org.apache.jena.rdf.model.Property dataSpecificationContent =
                ResourceFactory.createProperty(AAS_NAMESPACE + "EmbeddedDataSpecification/dataSpecificationContent");
    }

    public static final class HasDataSpecification {
        public static final org.apache.jena.rdf.model.Property embeddedDataSpecifications =
                ResourceFactory.createProperty(AAS_NAMESPACE + "HasDataSpecification/embeddedDataSpecifications");
    }

    public static final class HasSemantics {
        public static final org.apache.jena.rdf.model.Property semanticId =
                ResourceFactory.createProperty(AAS_NAMESPACE + "HasSemantics/semanticId");
        public static final org.apache.jena.rdf.model.Property supplementalSemanticIds =
                ResourceFactory.createProperty(AAS_NAMESPACE + "HasSemantics/supplementalSemanticIds");

    }

    public static final class Qualifiable {
        public static final org.apache.jena.rdf.model.Property qualifiers =
                ResourceFactory.createProperty(AAS_NAMESPACE + "Qualifiable/qualifiers");

    }

    public static final class Qualifier {
        public static final org.apache.jena.rdf.model.Property kind =
                ResourceFactory.createProperty(AAS_NAMESPACE + "Qualifier/kind");
        public static final org.apache.jena.rdf.model.Property type =
                ResourceFactory.createProperty(AAS_NAMESPACE + "Qualifier/type");
        public static final org.apache.jena.rdf.model.Property value =
                ResourceFactory.createProperty(AAS_NAMESPACE + "Qualifier/value");
        public static final org.apache.jena.rdf.model.Property valueId =
                ResourceFactory.createProperty(AAS_NAMESPACE + "Qualifier/valueId");
        public static final org.apache.jena.rdf.model.Property valueType =
                ResourceFactory.createProperty(AAS_NAMESPACE + "Qualifier/valueType");


    }

    public static final class AdministrativeInformation {
        public static final org.apache.jena.rdf.model.Property version =
                ResourceFactory.createProperty(AAS_NAMESPACE + "AdministrativeInformation/version");
        public static final org.apache.jena.rdf.model.Property revision =
                ResourceFactory.createProperty(AAS_NAMESPACE + "AdministrativeInformation/revision");
        public static final org.apache.jena.rdf.model.Property creator =
                ResourceFactory.createProperty(AAS_NAMESPACE + "AdministrativeInformation/creator");
        public static final org.apache.jena.rdf.model.Property templateId =
                ResourceFactory.createProperty(AAS_NAMESPACE + "AdministrativeInformation/templateId");
    }

    public static final class SpecificAssetId {
        public static final org.apache.jena.rdf.model.Property externalSubjectId =
                ResourceFactory.createProperty(AAS_NAMESPACE + "SpecificAssetId/externalSubjectId");
        public static final org.apache.jena.rdf.model.Property name =
                ResourceFactory.createProperty(AAS_NAMESPACE + "SpecificAssetId/name");
        public static final org.apache.jena.rdf.model.Property value =
                ResourceFactory.createProperty(AAS_NAMESPACE + "SpecificAssetId/value");
    }

    public static final class AnnotatedRelationshipElement {
        public static final org.apache.jena.rdf.model.Property annotations =
                ResourceFactory.createProperty(AAS_NAMESPACE + "AnnotatedRelationshipElement/annotations");
    }

    public static final class RelationshipElement {
        public static final org.apache.jena.rdf.model.Property first =
                ResourceFactory.createProperty(AAS_NAMESPACE + "RelationshipElement/first");
        public static final org.apache.jena.rdf.model.Property second =
                ResourceFactory.createProperty(AAS_NAMESPACE + "RelationshipElement/second");
    }

    public static final class Property {
        public static final org.apache.jena.rdf.model.Property value =
                ResourceFactory.createProperty(AAS_NAMESPACE + "Property/value");
        public static final org.apache.jena.rdf.model.Property valueId =
                ResourceFactory.createProperty(AAS_NAMESPACE + "Property/valueId");
        public static final org.apache.jena.rdf.model.Property valueType =
                ResourceFactory.createProperty(AAS_NAMESPACE + "Property/valueType");
    }

    public static final class MultiLanguageProperty {
        public static final org.apache.jena.rdf.model.Property value =
                ResourceFactory.createProperty(AAS_NAMESPACE + "MultiLanguageProperty/value");
        public static final org.apache.jena.rdf.model.Property valueId =
                ResourceFactory.createProperty(AAS_NAMESPACE + "MultiLanguageProperty/valueId");
    }

    public static final class Range {
        public static final org.apache.jena.rdf.model.Property max =
                ResourceFactory.createProperty(AAS_NAMESPACE + "Range/max");
        public static final org.apache.jena.rdf.model.Property min =
                ResourceFactory.createProperty(AAS_NAMESPACE + "Range/min");
        public static final org.apache.jena.rdf.model.Property valueType =
                ResourceFactory.createProperty(AAS_NAMESPACE + "Range/valueType");
    }

    public static final class ReferenceElement {
        public static final org.apache.jena.rdf.model.Property value =
                ResourceFactory.createProperty(AAS_NAMESPACE + "ReferenceElement/value");
    }

    public static final class Entity {
        public static final org.apache.jena.rdf.model.Property entityType =
                ResourceFactory.createProperty(AAS_NAMESPACE + "Entity/entityType");

        public static final org.apache.jena.rdf.model.Property globalAssetId =
                ResourceFactory.createProperty(AAS_NAMESPACE + "Entity/globalAssetId");
        public static final org.apache.jena.rdf.model.Property specificAssetIds =
                ResourceFactory.createProperty(AAS_NAMESPACE + "Entity/specificAssetIds");
        public static final org.apache.jena.rdf.model.Property statements =
                ResourceFactory.createProperty(AAS_NAMESPACE + "Entity/statements");
    }

    public static final class OperationVariable {
        public static final org.apache.jena.rdf.model.Property value =
                ResourceFactory.createProperty(AAS_NAMESPACE + "OperationVariable/value");
    }

    public static final class BasicEventElement {
        public static final org.apache.jena.rdf.model.Property direction =
                ResourceFactory.createProperty(AAS_NAMESPACE + "BasicEventElement/direction");
        public static final org.apache.jena.rdf.model.Property lastUpdate =
                ResourceFactory.createProperty(AAS_NAMESPACE + "BasicEventElement/lastUpdate");
        public static final org.apache.jena.rdf.model.Property maxInterval =
                ResourceFactory.createProperty(AAS_NAMESPACE + "BasicEventElement/maxInterval");
        public static final org.apache.jena.rdf.model.Property messageBroker =
                ResourceFactory.createProperty(AAS_NAMESPACE + "BasicEventElement/messageBroker");
        public static final org.apache.jena.rdf.model.Property messageTopic =
                ResourceFactory.createProperty(AAS_NAMESPACE + "BasicEventElement/messageTopic");
        public static final org.apache.jena.rdf.model.Property minInterval =
                ResourceFactory.createProperty(AAS_NAMESPACE + "BasicEventElement/minInterval");
        public static final org.apache.jena.rdf.model.Property observed =
                ResourceFactory.createProperty(AAS_NAMESPACE + "BasicEventElement/observed");
        public static final org.apache.jena.rdf.model.Property state =
                ResourceFactory.createProperty(AAS_NAMESPACE + "BasicEventElement/state");

    }


    public static final class Operation {
        public static final org.apache.jena.rdf.model.Property inoutputVariables =
                ResourceFactory.createProperty(AAS_NAMESPACE + "Operation/inoutputVariables");
        public static final org.apache.jena.rdf.model.Property inputVariables =
                ResourceFactory.createProperty(AAS_NAMESPACE + "Operation/inputVariables");
        public static final org.apache.jena.rdf.model.Property outputVariables =
                ResourceFactory.createProperty(AAS_NAMESPACE + "Operation/outputVariables");
    }

    public static final class File {
        public static final org.apache.jena.rdf.model.Property contentType =
                ResourceFactory.createProperty(AAS_NAMESPACE + "File/contentType");
        public static final org.apache.jena.rdf.model.Property value =
                ResourceFactory.createProperty(AAS_NAMESPACE + "File/value");
    }

    public static final class Blob {
        public static final org.apache.jena.rdf.model.Property value =
                ResourceFactory.createProperty(AAS_NAMESPACE + "Blob/value");
        public static final org.apache.jena.rdf.model.Property contentType =
                ResourceFactory.createProperty(AAS_NAMESPACE + "Blob/contentType");
    }

    public static final class AssetAdministrationShell {
        public static final org.apache.jena.rdf.model.Property assetInformation =
                ResourceFactory.createProperty(AAS_NAMESPACE + "AssetAdministrationShell/assetInformation");
        public static final org.apache.jena.rdf.model.Property derivedFrom =
                ResourceFactory.createProperty(AAS_NAMESPACE + "AssetAdministrationShell/derivedFrom");
        public static final org.apache.jena.rdf.model.Property submodels =
                ResourceFactory.createProperty(AAS_NAMESPACE + "AssetAdministrationShell/submodels");
    }

    public static final class AssetInformation {
        public static final org.apache.jena.rdf.model.Property assetType =
                ResourceFactory.createProperty(AAS_NAMESPACE + "AssetInformation/assetType");
        public static final org.apache.jena.rdf.model.Property defaultThumbnail =
                ResourceFactory.createProperty(AAS_NAMESPACE + "AssetInformation/defaultThumbnail");
        public static final org.apache.jena.rdf.model.Property globalAssetId =
                ResourceFactory.createProperty(AAS_NAMESPACE + "AssetInformation/globalAssetId");
        public static final org.apache.jena.rdf.model.Property specificAssetIds =
                ResourceFactory.createProperty(AAS_NAMESPACE + "AssetInformation/specificAssetIds");

        public static final org.apache.jena.rdf.model.Property assetKind =
                ResourceFactory.createProperty(AAS_NAMESPACE + "AssetInformation/assetKind");

    }

    public static final class Resource {
        public static final org.apache.jena.rdf.model.Property contentType =
                ResourceFactory.createProperty(AAS_NAMESPACE + "Resource/contentType");
        public static final org.apache.jena.rdf.model.Property path =
                ResourceFactory.createProperty(AAS_NAMESPACE + "Resource/path");
    }

    public static final class DataSpecificationIec61360 {
        public static final org.apache.jena.rdf.model.Property levelType = ResourceFactory.createProperty(AAS_NAMESPACE + "DataSpecificationIec61360/levelType");
        public static final org.apache.jena.rdf.model.Property value = ResourceFactory.createProperty(AAS_NAMESPACE + "DataSpecificationIec61360/value");
        public static final org.apache.jena.rdf.model.Property valueFormat = ResourceFactory.createProperty(AAS_NAMESPACE + "DataSpecificationIec61360/valueFormat");
        public static final org.apache.jena.rdf.model.Property definition = ResourceFactory.createProperty(AAS_NAMESPACE + "DataSpecificationIec61360/definition");
        public static final org.apache.jena.rdf.model.Property dataType = ResourceFactory.createProperty(AAS_NAMESPACE + "DataSpecificationIec61360/dataType");
        public static final org.apache.jena.rdf.model.Property symbol = ResourceFactory.createProperty(AAS_NAMESPACE + "DataSpecificationIec61360/symbol");
        public static final org.apache.jena.rdf.model.Property sourceOfDefinition = ResourceFactory.createProperty(AAS_NAMESPACE + "DataSpecificationIec61360/sourceOfDefinition");
        public static final org.apache.jena.rdf.model.Property unitId = ResourceFactory.createProperty(AAS_NAMESPACE + "DataSpecificationIec61360/unitId");
        public static final org.apache.jena.rdf.model.Property unit = ResourceFactory.createProperty(AAS_NAMESPACE + "DataSpecificationIec61360/unit");
        public static final org.apache.jena.rdf.model.Property shortName = ResourceFactory.createProperty(AAS_NAMESPACE + "DataSpecificationIec61360/shortName");
        public static final org.apache.jena.rdf.model.Property preferredName = ResourceFactory.createProperty(AAS_NAMESPACE + "DataSpecificationIec61360/preferredName");
        public static final org.apache.jena.rdf.model.Property valueList = ResourceFactory.createProperty(AAS_NAMESPACE + "DataSpecificationIec61360/valueList");
    }

    public static final class AssetKind {
        public static final org.apache.jena.rdf.model.Resource Instance =
                ResourceFactory.createResource(AAS_NAMESPACE + "AssetKind/Instance");
        public static final org.apache.jena.rdf.model.Resource Type =
                ResourceFactory.createResource(AAS_NAMESPACE + "AssetKind/Type");
        public static final org.apache.jena.rdf.model.Resource NotApplicable =
                ResourceFactory.createResource(AAS_NAMESPACE + "AssetKind/NotApplicable");

        public static org.eclipse.digitaltwin.aas4j.v3.model.AssetKind fromIRI(String stringIRI) {
            if (stringIRI.equals(Instance.getURI())) {
                return org.eclipse.digitaltwin.aas4j.v3.model.AssetKind.INSTANCE;
            }
            if (stringIRI.equals(Type.getURI())) {
                return org.eclipse.digitaltwin.aas4j.v3.model.AssetKind.TYPE;
            }
            if (stringIRI.equals(NotApplicable.getURI())) {
                return org.eclipse.digitaltwin.aas4j.v3.model.AssetKind.NOT_APPLICABLE;
            }
            throw new IllegalArgumentException("Invalid AssetKind IRI provided.");
        }

        public static org.apache.jena.rdf.model.Resource valueOf(String type) {
            if (type.equalsIgnoreCase(org.eclipse.digitaltwin.aas4j.v3.model.AssetKind.INSTANCE.name())) {
                return Instance;
            }
            if (type.equalsIgnoreCase(org.eclipse.digitaltwin.aas4j.v3.model.AssetKind.TYPE.name())) {
                return Type;
            }
            if (type.equalsIgnoreCase(org.eclipse.digitaltwin.aas4j.v3.model.AssetKind.NOT_APPLICABLE.name())) {
                return NotApplicable;
            }

            throw new IllegalArgumentException("Invalid AssetKind provided.");
        }
    }

    public static final class EntityType {
        public static final org.apache.jena.rdf.model.Resource CoManagedEntity =
                ResourceFactory.createResource(AAS_NAMESPACE + "EntityType/CoManagedEntity");
        public static final org.apache.jena.rdf.model.Resource SelfManagedEntity =
                ResourceFactory.createResource(AAS_NAMESPACE + "EntityType/SelfManagedEntity");

        public static org.eclipse.digitaltwin.aas4j.v3.model.EntityType fromIRI(String stringIRI) {
            if (stringIRI.equals(CoManagedEntity.getURI())) {
                return org.eclipse.digitaltwin.aas4j.v3.model.EntityType.CO_MANAGED_ENTITY;
            }
            if (stringIRI.equals(SelfManagedEntity.getURI())) {
                return org.eclipse.digitaltwin.aas4j.v3.model.EntityType.SELF_MANAGED_ENTITY;
            }
            throw new IllegalArgumentException("Invalid EntityType IRI provided.");
        }

        public static org.apache.jena.rdf.model.Resource valueOf(String type) {
            if (type.equalsIgnoreCase(org.eclipse.digitaltwin.aas4j.v3.model.EntityType.CO_MANAGED_ENTITY.name())) {
                return CoManagedEntity;
            }
            if (type.equalsIgnoreCase(org.eclipse.digitaltwin.aas4j.v3.model.EntityType.SELF_MANAGED_ENTITY.name())) {
                return SelfManagedEntity;
            }

            throw new IllegalArgumentException("Invalid EntityType provided.");
        }
    }

    public static final class StateOfEvent {
        public static final org.apache.jena.rdf.model.Resource Off =
                ResourceFactory.createResource(AAS_NAMESPACE + "StateOfEvent/Off");
        public static final org.apache.jena.rdf.model.Resource On =
                ResourceFactory.createResource(AAS_NAMESPACE + "StateOfEvent/On");

        public static org.eclipse.digitaltwin.aas4j.v3.model.StateOfEvent fromIRI(String stringIRI) {
            if (stringIRI.equals(Off.getURI())) {
                return org.eclipse.digitaltwin.aas4j.v3.model.StateOfEvent.OFF;
            }
            if (stringIRI.equals(On.getURI())) {
                return org.eclipse.digitaltwin.aas4j.v3.model.StateOfEvent.ON;
            }
            throw new IllegalArgumentException("Invalid StateOfEvent IRI provided.");
        }

        public static org.apache.jena.rdf.model.Resource valueOf(String type) {
            if (type.equalsIgnoreCase(org.eclipse.digitaltwin.aas4j.v3.model.StateOfEvent.OFF.name())) {
                return Off;
            }
            if (type.equalsIgnoreCase(org.eclipse.digitaltwin.aas4j.v3.model.StateOfEvent.ON.name())) {
                return On;
            }

            throw new IllegalArgumentException("Invalid StateOfEvent provided.");
        }
    }

    public static final class Direction {
        public static final org.apache.jena.rdf.model.Resource Input =
                ResourceFactory.createResource(AAS_NAMESPACE + "Direction/Input");
        public static final org.apache.jena.rdf.model.Resource Output =
                ResourceFactory.createResource(AAS_NAMESPACE + "Direction/Output");

        public static org.eclipse.digitaltwin.aas4j.v3.model.Direction fromIRI(String stringIRI) {
            if (stringIRI.equals(Input.getURI())) {
                return org.eclipse.digitaltwin.aas4j.v3.model.Direction.INPUT;
            }
            if (stringIRI.equals(Output.getURI())) {
                return org.eclipse.digitaltwin.aas4j.v3.model.Direction.OUTPUT;
            }
            throw new IllegalArgumentException("Invalid Direction IRI provided.");
        }

        public static org.apache.jena.rdf.model.Resource valueOf(String type) {
            if (type.equalsIgnoreCase(org.eclipse.digitaltwin.aas4j.v3.model.Direction.INPUT.name())) {
                return Input;
            }
            if (type.equalsIgnoreCase(org.eclipse.digitaltwin.aas4j.v3.model.Direction.OUTPUT.name())) {
                return Output;
            }

            throw new IllegalArgumentException("Invalid Direction provided.");
        }
    }


    public static final class DataTypeIec61360 {
        public static final org.apache.jena.rdf.model.Resource Blob =
                ResourceFactory.createResource(AAS_NAMESPACE + "DataTypeIec61360/Blob");
        public static final org.apache.jena.rdf.model.Resource Boolean =
                ResourceFactory.createResource(AAS_NAMESPACE + "DataTypeIec61360/Boolean");
        public static final org.apache.jena.rdf.model.Resource Date =
                ResourceFactory.createResource(AAS_NAMESPACE + "DataTypeIec61360/Date");
        public static final org.apache.jena.rdf.model.Resource File =
                ResourceFactory.createResource(AAS_NAMESPACE + "DataTypeIec61360/File");
        public static final org.apache.jena.rdf.model.Resource Html =
                ResourceFactory.createResource(AAS_NAMESPACE + "DataTypeIec61360/Html");
        public static final org.apache.jena.rdf.model.Resource IntegerCount =
                ResourceFactory.createResource(AAS_NAMESPACE + "DataTypeIec61360/IntegerCount");
        public static final org.apache.jena.rdf.model.Resource IntegerCurrency =
                ResourceFactory.createResource(AAS_NAMESPACE + "DataTypeIec61360/IntegerCurrency");
        public static final org.apache.jena.rdf.model.Resource IntegerMeasure =
                ResourceFactory.createResource(AAS_NAMESPACE + "DataTypeIec61360/IntegerMeasure");
        public static final org.apache.jena.rdf.model.Resource Irdi =
                ResourceFactory.createResource(AAS_NAMESPACE + "DataTypeIec61360/Irdi");
        public static final org.apache.jena.rdf.model.Resource Iri =
                ResourceFactory.createResource(AAS_NAMESPACE + "DataTypeIec61360/Iri");
        public static final org.apache.jena.rdf.model.Resource Rational =
                ResourceFactory.createResource(AAS_NAMESPACE + "DataTypeIec61360/Rational");
        public static final org.apache.jena.rdf.model.Resource RationalMeasure =
                ResourceFactory.createResource(AAS_NAMESPACE + "DataTypeIec61360/RationalMeasure");
        public static final org.apache.jena.rdf.model.Resource RealCount =
                ResourceFactory.createResource(AAS_NAMESPACE + "DataTypeIec61360/RealCount");
        public static final org.apache.jena.rdf.model.Resource RealCurrency =
                ResourceFactory.createResource(AAS_NAMESPACE + "DataTypeIec61360/RealCurrency");
        public static final org.apache.jena.rdf.model.Resource RealMeasure =
                ResourceFactory.createResource(AAS_NAMESPACE + "DataTypeIec61360/RealMeasure");
        public static final org.apache.jena.rdf.model.Resource String =
                ResourceFactory.createResource(AAS_NAMESPACE + "DataTypeIec61360/String");
        public static final org.apache.jena.rdf.model.Resource StringTranslatable =
                ResourceFactory.createResource(AAS_NAMESPACE + "DataTypeIec61360/StringTranslatable");
        public static final org.apache.jena.rdf.model.Resource Time =
                ResourceFactory.createResource(AAS_NAMESPACE + "DataTypeIec61360/Time");
        public static final org.apache.jena.rdf.model.Resource Timestamp =
                ResourceFactory.createResource(AAS_NAMESPACE + "DataTypeIec61360/Timestamp");

        public static org.eclipse.digitaltwin.aas4j.v3.model.DataTypeIec61360 fromIRI(String stringIRI) {
            if (stringIRI.equals(Blob.getURI())) {
                return org.eclipse.digitaltwin.aas4j.v3.model.DataTypeIec61360.BLOB;
            }
            if (stringIRI.equals(Boolean.getURI())) {
                return org.eclipse.digitaltwin.aas4j.v3.model.DataTypeIec61360.BOOLEAN;
            }
            if (stringIRI.equals(Date.getURI())) {
                return org.eclipse.digitaltwin.aas4j.v3.model.DataTypeIec61360.DATE;
            }
            if (stringIRI.equals(File.getURI())) {
                return org.eclipse.digitaltwin.aas4j.v3.model.DataTypeIec61360.FILE;
            }
            if (stringIRI.equals(Html.getURI())) {
                return org.eclipse.digitaltwin.aas4j.v3.model.DataTypeIec61360.HTML;
            }
            if (stringIRI.equals(IntegerCount.getURI())) {
                return org.eclipse.digitaltwin.aas4j.v3.model.DataTypeIec61360.INTEGER_COUNT;
            }
            if (stringIRI.equals(IntegerCurrency.getURI())) {
                return org.eclipse.digitaltwin.aas4j.v3.model.DataTypeIec61360.INTEGER_CURRENCY;
            }
            if (stringIRI.equals(IntegerMeasure.getURI())) {
                return org.eclipse.digitaltwin.aas4j.v3.model.DataTypeIec61360.INTEGER_MEASURE;
            }
            if (stringIRI.equals(Irdi.getURI())) {
                return org.eclipse.digitaltwin.aas4j.v3.model.DataTypeIec61360.IRDI;
            }
            if (stringIRI.equals(Iri.getURI())) {
                return org.eclipse.digitaltwin.aas4j.v3.model.DataTypeIec61360.IRI;
            }
            if (stringIRI.equals(Rational.getURI())) {
                return org.eclipse.digitaltwin.aas4j.v3.model.DataTypeIec61360.RATIONAL;
            }
            if (stringIRI.equals(RationalMeasure.getURI())) {
                return org.eclipse.digitaltwin.aas4j.v3.model.DataTypeIec61360.RATIONAL_MEASURE;
            }
            if (stringIRI.equals(RealCount.getURI())) {
                return org.eclipse.digitaltwin.aas4j.v3.model.DataTypeIec61360.REAL_COUNT;
            }
            if (stringIRI.equals(RealCurrency.getURI())) {
                return org.eclipse.digitaltwin.aas4j.v3.model.DataTypeIec61360.REAL_CURRENCY;
            }
            if (stringIRI.equals(RealMeasure.getURI())) {
                return org.eclipse.digitaltwin.aas4j.v3.model.DataTypeIec61360.REAL_MEASURE;
            }
            if (stringIRI.equals(String.getURI())) {
                return org.eclipse.digitaltwin.aas4j.v3.model.DataTypeIec61360.STRING;
            }
            if (stringIRI.equals(StringTranslatable.getURI())) {
                return org.eclipse.digitaltwin.aas4j.v3.model.DataTypeIec61360.STRING_TRANSLATABLE;
            }
            if (stringIRI.equals(Time.getURI())) {
                return org.eclipse.digitaltwin.aas4j.v3.model.DataTypeIec61360.TIME;
            }
            if (stringIRI.equals(Timestamp.getURI())) {
                return org.eclipse.digitaltwin.aas4j.v3.model.DataTypeIec61360.TIMESTAMP;
            }

            throw new IllegalArgumentException("Invalid DataTypeIec61360 IRI provided.");
        }

        public static org.apache.jena.rdf.model.Resource valueOf(String type) {
            if (type.equalsIgnoreCase(org.eclipse.digitaltwin.aas4j.v3.model.DataTypeIec61360.BLOB.name())) {
                return Blob;
            }
            if (type.equalsIgnoreCase(org.eclipse.digitaltwin.aas4j.v3.model.DataTypeIec61360.BOOLEAN.name())) {
                return Boolean;
            }
            if (type.equalsIgnoreCase(org.eclipse.digitaltwin.aas4j.v3.model.DataTypeIec61360.DATE.name())) {
                return Date;
            }
            if (type.equalsIgnoreCase(org.eclipse.digitaltwin.aas4j.v3.model.DataTypeIec61360.FILE.name())) {
                return File;
            }
            if (type.equalsIgnoreCase(org.eclipse.digitaltwin.aas4j.v3.model.DataTypeIec61360.HTML.name())) {
                return Html;
            }
            if (type.equalsIgnoreCase(org.eclipse.digitaltwin.aas4j.v3.model.DataTypeIec61360.INTEGER_COUNT.name())) {
                return IntegerCount;
            }
            if (type.equalsIgnoreCase(org.eclipse.digitaltwin.aas4j.v3.model.DataTypeIec61360.INTEGER_CURRENCY.name())) {
                return IntegerCurrency;
            }
            if (type.equalsIgnoreCase(org.eclipse.digitaltwin.aas4j.v3.model.DataTypeIec61360.INTEGER_MEASURE.name())) {
                return IntegerMeasure;
            }
            if (type.equalsIgnoreCase(org.eclipse.digitaltwin.aas4j.v3.model.DataTypeIec61360.IRDI.name())) {
                return Irdi;
            }
            if (type.equalsIgnoreCase(org.eclipse.digitaltwin.aas4j.v3.model.DataTypeIec61360.IRI.name())) {
                return Iri;
            }
            if (type.equalsIgnoreCase(org.eclipse.digitaltwin.aas4j.v3.model.DataTypeIec61360.RATIONAL.name())) {
                return Rational;
            }
            if (type.equalsIgnoreCase(org.eclipse.digitaltwin.aas4j.v3.model.DataTypeIec61360.RATIONAL_MEASURE.name())) {
                return RationalMeasure;
            }
            if (type.equalsIgnoreCase(org.eclipse.digitaltwin.aas4j.v3.model.DataTypeIec61360.REAL_COUNT.name())) {
                return RealCount;
            }
            if (type.equalsIgnoreCase(org.eclipse.digitaltwin.aas4j.v3.model.DataTypeIec61360.REAL_CURRENCY.name())) {
                return RealCurrency;
            }
            if (type.equalsIgnoreCase(org.eclipse.digitaltwin.aas4j.v3.model.DataTypeIec61360.REAL_MEASURE.name())) {
                return RealMeasure;
            }
            if (type.equalsIgnoreCase(org.eclipse.digitaltwin.aas4j.v3.model.DataTypeIec61360.STRING.name())) {
                return String;
            }
            if (type.equalsIgnoreCase(org.eclipse.digitaltwin.aas4j.v3.model.DataTypeIec61360.STRING_TRANSLATABLE.name())) {
                return StringTranslatable;
            }
            if (type.equalsIgnoreCase(org.eclipse.digitaltwin.aas4j.v3.model.DataTypeIec61360.TIME.name())) {
                return Time;
            }
            if (type.equalsIgnoreCase(org.eclipse.digitaltwin.aas4j.v3.model.DataTypeIec61360.TIMESTAMP.name())) {
                return Timestamp;
            }

            throw new IllegalArgumentException("Invalid DataTypeIec61360 provided.");
        }
    }

    public static final class DataTypeDefXsd {
        public static final org.apache.jena.rdf.model.Resource AnyUri =
                ResourceFactory.createResource(AAS_NAMESPACE + "DataTypeDefXsd/AnyUri");
        public static final org.apache.jena.rdf.model.Resource Base64Binary =
                ResourceFactory.createResource(AAS_NAMESPACE + "DataTypeDefXsd/Base64Binary");
        public static final org.apache.jena.rdf.model.Resource Boolean =
                ResourceFactory.createResource(AAS_NAMESPACE + "DataTypeDefXsd/Boolean");
        public static final org.apache.jena.rdf.model.Resource Byte =
                ResourceFactory.createResource(AAS_NAMESPACE + "DataTypeDefXsd/Byte");
        public static final org.apache.jena.rdf.model.Resource Date =
                ResourceFactory.createResource(AAS_NAMESPACE + "DataTypeDefXsd/Date");
        public static final org.apache.jena.rdf.model.Resource DateTime =
                ResourceFactory.createResource(AAS_NAMESPACE + "DataTypeDefXsd/DateTime");
        public static final org.apache.jena.rdf.model.Resource Decimal =
                ResourceFactory.createResource(AAS_NAMESPACE + "DataTypeDefXsd/Decimal");
        public static final org.apache.jena.rdf.model.Resource Double =
                ResourceFactory.createResource(AAS_NAMESPACE + "DataTypeDefXsd/Double");
        public static final org.apache.jena.rdf.model.Resource Duration =
                ResourceFactory.createResource(AAS_NAMESPACE + "DataTypeDefXsd/Duration");
        public static final org.apache.jena.rdf.model.Resource Float =
                ResourceFactory.createResource(AAS_NAMESPACE + "DataTypeDefXsd/Float");
        public static final org.apache.jena.rdf.model.Resource GDay =
                ResourceFactory.createResource(AAS_NAMESPACE + "DataTypeDefXsd/GDay");
        public static final org.apache.jena.rdf.model.Resource GMonth =
                ResourceFactory.createResource(AAS_NAMESPACE + "DataTypeDefXsd/GMonth");
        public static final org.apache.jena.rdf.model.Resource GMonthDay =
                ResourceFactory.createResource(AAS_NAMESPACE + "DataTypeDefXsd/GMonthDay");
        public static final org.apache.jena.rdf.model.Resource GYear =
                ResourceFactory.createResource(AAS_NAMESPACE + "DataTypeDefXsd/GYear");
        public static final org.apache.jena.rdf.model.Resource GYearMonth =
                ResourceFactory.createResource(AAS_NAMESPACE + "DataTypeDefXsd/GYearMonth");
        public static final org.apache.jena.rdf.model.Resource HexBinary =
                ResourceFactory.createResource(AAS_NAMESPACE + "DataTypeDefXsd/HexBinary");
        public static final org.apache.jena.rdf.model.Resource Int =
                ResourceFactory.createResource(AAS_NAMESPACE + "DataTypeDefXsd/Int");
        public static final org.apache.jena.rdf.model.Resource Integer =
                ResourceFactory.createResource(AAS_NAMESPACE + "DataTypeDefXsd/Integer");
        public static final org.apache.jena.rdf.model.Resource Long =
                ResourceFactory.createResource(AAS_NAMESPACE + "DataTypeDefXsd/Long");
        public static final org.apache.jena.rdf.model.Resource NegativeInteger =
                ResourceFactory.createResource(AAS_NAMESPACE + "DataTypeDefXsd/NegativeInteger");
        public static final org.apache.jena.rdf.model.Resource NonNegativeInteger =
                ResourceFactory.createResource(AAS_NAMESPACE + "DataTypeDefXsd/NonNegativeInteger");
        public static final org.apache.jena.rdf.model.Resource NonPositiveInteger =
                ResourceFactory.createResource(AAS_NAMESPACE + "DataTypeDefXsd/NonPositiveInteger");
        public static final org.apache.jena.rdf.model.Resource PositiveInteger =
                ResourceFactory.createResource(AAS_NAMESPACE + "DataTypeDefXsd/PositiveInteger");
        public static final org.apache.jena.rdf.model.Resource Short =
                ResourceFactory.createResource(AAS_NAMESPACE + "DataTypeDefXsd/Short");
        public static final org.apache.jena.rdf.model.Resource String =
                ResourceFactory.createResource(AAS_NAMESPACE + "DataTypeDefXsd/String");
        public static final org.apache.jena.rdf.model.Resource Time =
                ResourceFactory.createResource(AAS_NAMESPACE + "DataTypeDefXsd/Time");
        public static final org.apache.jena.rdf.model.Resource UnsignedByte =
                ResourceFactory.createResource(AAS_NAMESPACE + "DataTypeDefXsd/UnsignedByte");
        public static final org.apache.jena.rdf.model.Resource UnsignedInt =
                ResourceFactory.createResource(AAS_NAMESPACE + "DataTypeDefXsd/UnsignedInt");
        public static final org.apache.jena.rdf.model.Resource UnsignedLong =
                ResourceFactory.createResource(AAS_NAMESPACE + "DataTypeDefXsd/UnsignedLong");
        public static final org.apache.jena.rdf.model.Resource UnsignedShort =
                ResourceFactory.createResource(AAS_NAMESPACE + "DataTypeDefXsd/UnsignedShort");


        public static org.eclipse.digitaltwin.aas4j.v3.model.DataTypeDefXsd fromIRI(String stringIRI) {
            if (stringIRI.equals(AnyUri.getURI())) {
                return org.eclipse.digitaltwin.aas4j.v3.model.DataTypeDefXsd.ANY_URI;
            }
            if (stringIRI.equals(Base64Binary.getURI())) {
                return org.eclipse.digitaltwin.aas4j.v3.model.DataTypeDefXsd.BASE64BINARY;
            }
            if (stringIRI.equals(Boolean.getURI())) {
                return org.eclipse.digitaltwin.aas4j.v3.model.DataTypeDefXsd.BOOLEAN;
            }
            if (stringIRI.equals(Byte.getURI())) {
                return org.eclipse.digitaltwin.aas4j.v3.model.DataTypeDefXsd.BYTE;
            }
            if (stringIRI.equals(Date.getURI())) {
                return org.eclipse.digitaltwin.aas4j.v3.model.DataTypeDefXsd.DATE;
            }
            if (stringIRI.equals(DateTime.getURI())) {
                return org.eclipse.digitaltwin.aas4j.v3.model.DataTypeDefXsd.DATE_TIME;
            }
            if (stringIRI.equals(Decimal.getURI())) {
                return org.eclipse.digitaltwin.aas4j.v3.model.DataTypeDefXsd.DECIMAL;
            }
            if (stringIRI.equals(Double.getURI())) {
                return org.eclipse.digitaltwin.aas4j.v3.model.DataTypeDefXsd.DOUBLE;
            }
            if (stringIRI.equals(Duration.getURI())) {
                return org.eclipse.digitaltwin.aas4j.v3.model.DataTypeDefXsd.DURATION;
            }
            if (stringIRI.equals(Float.getURI())) {
                return org.eclipse.digitaltwin.aas4j.v3.model.DataTypeDefXsd.FLOAT;
            }
            if (stringIRI.equals(GDay.getURI())) {
                return org.eclipse.digitaltwin.aas4j.v3.model.DataTypeDefXsd.GDAY;
            }
            if (stringIRI.equals(GMonth.getURI())) {
                return org.eclipse.digitaltwin.aas4j.v3.model.DataTypeDefXsd.GMONTH;
            }
            if (stringIRI.equals(GMonthDay.getURI())) {
                return org.eclipse.digitaltwin.aas4j.v3.model.DataTypeDefXsd.GMONTH_DAY;
            }
            if (stringIRI.equals(GYear.getURI())) {
                return org.eclipse.digitaltwin.aas4j.v3.model.DataTypeDefXsd.GYEAR;
            }
            if (stringIRI.equals(GYearMonth.getURI())) {
                return org.eclipse.digitaltwin.aas4j.v3.model.DataTypeDefXsd.GYEAR_MONTH;
            }
            if (stringIRI.equals(HexBinary.getURI())) {
                return org.eclipse.digitaltwin.aas4j.v3.model.DataTypeDefXsd.HEX_BINARY;
            }
            if (stringIRI.equals(Int.getURI())) {
                return org.eclipse.digitaltwin.aas4j.v3.model.DataTypeDefXsd.INT;
            }
            if (stringIRI.equals(Integer.getURI())) {
                return org.eclipse.digitaltwin.aas4j.v3.model.DataTypeDefXsd.INTEGER;
            }
            if (stringIRI.equals(Long.getURI())) {
                return org.eclipse.digitaltwin.aas4j.v3.model.DataTypeDefXsd.LONG;
            }
            if (stringIRI.equals(NegativeInteger.getURI())) {
                return org.eclipse.digitaltwin.aas4j.v3.model.DataTypeDefXsd.NEGATIVE_INTEGER;
            }
            if (stringIRI.equals(NonNegativeInteger.getURI())) {
                return org.eclipse.digitaltwin.aas4j.v3.model.DataTypeDefXsd.NON_NEGATIVE_INTEGER;
            }
            if (stringIRI.equals(NonPositiveInteger.getURI())) {
                return org.eclipse.digitaltwin.aas4j.v3.model.DataTypeDefXsd.NON_POSITIVE_INTEGER;
            }
            if (stringIRI.equals(PositiveInteger.getURI())) {
                return org.eclipse.digitaltwin.aas4j.v3.model.DataTypeDefXsd.POSITIVE_INTEGER;
            }
            if (stringIRI.equals(Short.getURI())) {
                return org.eclipse.digitaltwin.aas4j.v3.model.DataTypeDefXsd.SHORT;
            }
            if (stringIRI.equals(String.getURI())) {
                return org.eclipse.digitaltwin.aas4j.v3.model.DataTypeDefXsd.STRING;
            }
            if (stringIRI.equals(Time.getURI())) {
                return org.eclipse.digitaltwin.aas4j.v3.model.DataTypeDefXsd.TIME;
            }
            if (stringIRI.equals(UnsignedByte.getURI())) {
                return org.eclipse.digitaltwin.aas4j.v3.model.DataTypeDefXsd.UNSIGNED_BYTE;
            }
            if (stringIRI.equals(UnsignedInt.getURI())) {
                return org.eclipse.digitaltwin.aas4j.v3.model.DataTypeDefXsd.UNSIGNED_INT;
            }
            if (stringIRI.equals(UnsignedLong.getURI())) {
                return org.eclipse.digitaltwin.aas4j.v3.model.DataTypeDefXsd.UNSIGNED_LONG;
            }
            if (stringIRI.equals(UnsignedShort.getURI())) {
                return org.eclipse.digitaltwin.aas4j.v3.model.DataTypeDefXsd.UNSIGNED_SHORT;
            }

            throw new IllegalArgumentException("Invalid DataTypeIec61360 IRI provided.");
        }

        public static org.apache.jena.rdf.model.Resource valueOf(String type) {
            if (type.equalsIgnoreCase(org.eclipse.digitaltwin.aas4j.v3.model.DataTypeDefXsd.ANY_URI.name())) {
                return AnyUri;
            }
            if (type.equalsIgnoreCase(org.eclipse.digitaltwin.aas4j.v3.model.DataTypeDefXsd.BASE64BINARY.name())) {
                return Base64Binary;
            }
            if (type.equalsIgnoreCase(org.eclipse.digitaltwin.aas4j.v3.model.DataTypeDefXsd.BOOLEAN.name())) {
                return Boolean;
            }
            if (type.equalsIgnoreCase(org.eclipse.digitaltwin.aas4j.v3.model.DataTypeDefXsd.BYTE.name())) {
                return Byte;
            }
            if (type.equalsIgnoreCase(org.eclipse.digitaltwin.aas4j.v3.model.DataTypeDefXsd.DATE.name())) {
                return Date;
            }
            if (type.equalsIgnoreCase(org.eclipse.digitaltwin.aas4j.v3.model.DataTypeDefXsd.DATE_TIME.name())) {
                return DateTime;
            }
            if (type.equalsIgnoreCase(org.eclipse.digitaltwin.aas4j.v3.model.DataTypeDefXsd.DECIMAL.name())) {
                return Decimal;
            }
            if (type.equalsIgnoreCase(org.eclipse.digitaltwin.aas4j.v3.model.DataTypeDefXsd.DOUBLE.name())) {
                return Double;
            }
            if (type.equalsIgnoreCase(org.eclipse.digitaltwin.aas4j.v3.model.DataTypeDefXsd.DURATION.name())) {
                return Duration;
            }
            if (type.equalsIgnoreCase(org.eclipse.digitaltwin.aas4j.v3.model.DataTypeDefXsd.FLOAT.name())) {
                return Float;
            }
            if (type.equalsIgnoreCase(org.eclipse.digitaltwin.aas4j.v3.model.DataTypeDefXsd.GDAY.name())) {
                return GDay;
            }
            if (type.equalsIgnoreCase(org.eclipse.digitaltwin.aas4j.v3.model.DataTypeDefXsd.GMONTH.name())) {
                return GMonth;
            }
            if (type.equalsIgnoreCase(org.eclipse.digitaltwin.aas4j.v3.model.DataTypeDefXsd.GMONTH_DAY.name())) {
                return GMonthDay;
            }
            if (type.equalsIgnoreCase(org.eclipse.digitaltwin.aas4j.v3.model.DataTypeDefXsd.GYEAR.name())) {
                return GYear;
            }
            if (type.equalsIgnoreCase(org.eclipse.digitaltwin.aas4j.v3.model.DataTypeDefXsd.GYEAR_MONTH.name())) {
                return GYearMonth;
            }
            if (type.equalsIgnoreCase(org.eclipse.digitaltwin.aas4j.v3.model.DataTypeDefXsd.HEX_BINARY.name())) {
                return HexBinary;
            }
            if (type.equalsIgnoreCase(org.eclipse.digitaltwin.aas4j.v3.model.DataTypeDefXsd.INT.name())) {
                return Int;
            }
            if (type.equalsIgnoreCase(org.eclipse.digitaltwin.aas4j.v3.model.DataTypeDefXsd.INTEGER.name())) {
                return Integer;
            }
            if (type.equalsIgnoreCase(org.eclipse.digitaltwin.aas4j.v3.model.DataTypeDefXsd.LONG.name())) {
                return Long;
            }
            if (type.equalsIgnoreCase(org.eclipse.digitaltwin.aas4j.v3.model.DataTypeDefXsd.NEGATIVE_INTEGER.name())) {
                return NegativeInteger;
            }
            if (type.equalsIgnoreCase(org.eclipse.digitaltwin.aas4j.v3.model.DataTypeDefXsd.NON_NEGATIVE_INTEGER.name())) {
                return NonNegativeInteger;
            }
            if (type.equalsIgnoreCase(org.eclipse.digitaltwin.aas4j.v3.model.DataTypeDefXsd.SHORT.name())) {
                return Short;
            }
            if (type.equalsIgnoreCase(org.eclipse.digitaltwin.aas4j.v3.model.DataTypeDefXsd.STRING.name())) {
                return String;
            }
            if (type.equalsIgnoreCase(org.eclipse.digitaltwin.aas4j.v3.model.DataTypeDefXsd.TIME.name())) {
                return Time;
            }
            if (type.equalsIgnoreCase(org.eclipse.digitaltwin.aas4j.v3.model.DataTypeDefXsd.UNSIGNED_BYTE.name())) {
                return UnsignedByte;
            }
            if (type.equalsIgnoreCase(org.eclipse.digitaltwin.aas4j.v3.model.DataTypeDefXsd.UNSIGNED_INT.name())) {
                return UnsignedInt;
            }
            if (type.equalsIgnoreCase(org.eclipse.digitaltwin.aas4j.v3.model.DataTypeDefXsd.UNSIGNED_LONG.name())) {
                return UnsignedLong;
            }
            if (type.equalsIgnoreCase(org.eclipse.digitaltwin.aas4j.v3.model.DataTypeDefXsd.UNSIGNED_SHORT.name())) {
                return UnsignedShort;
            }


            throw new IllegalArgumentException("Invalid DataTypeIec61360 provided.");
        }


    }

    public static final class QualifierKind {
        public static final org.apache.jena.rdf.model.Resource ConceptQualifier =
                ResourceFactory.createResource(AAS_NAMESPACE + "QualifierKind/ConceptQualifier");
        public static final org.apache.jena.rdf.model.Resource TemplateQualifier =
                ResourceFactory.createResource(AAS_NAMESPACE + "QualifierKind/TemplateQualifier");
        public static final org.apache.jena.rdf.model.Resource ValueQualifier =
                ResourceFactory.createResource(AAS_NAMESPACE + "QualifierKind/ValueQualifier");


        public static org.eclipse.digitaltwin.aas4j.v3.model.QualifierKind fromIRI(String stringIRI) {
            if (stringIRI.equals(ConceptQualifier.getURI())) {
                return org.eclipse.digitaltwin.aas4j.v3.model.QualifierKind.CONCEPT_QUALIFIER;
            }
            if (stringIRI.equals(TemplateQualifier.getURI())) {
                return org.eclipse.digitaltwin.aas4j.v3.model.QualifierKind.TEMPLATE_QUALIFIER;
            }
            if (stringIRI.equals(ValueQualifier.getURI())) {
                return org.eclipse.digitaltwin.aas4j.v3.model.QualifierKind.VALUE_QUALIFIER;
            }


            throw new IllegalArgumentException("Invalid QualifierKind IRI provided.");
        }

        public static org.apache.jena.rdf.model.Resource valueOf(String type) {

            if (type.equalsIgnoreCase(org.eclipse.digitaltwin.aas4j.v3.model.QualifierKind.CONCEPT_QUALIFIER.name())) {
                return ConceptQualifier;
            }
            if (type.equalsIgnoreCase(org.eclipse.digitaltwin.aas4j.v3.model.QualifierKind.TEMPLATE_QUALIFIER.name())) {
                return TemplateQualifier;
            }
            if (type.equalsIgnoreCase(org.eclipse.digitaltwin.aas4j.v3.model.QualifierKind.VALUE_QUALIFIER.name())) {
                return ValueQualifier;
            }

            throw new IllegalArgumentException("Invalid QualifierKind provided.");
        }
    }

}
