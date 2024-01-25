package org.eclipse.digitaltwin.aas4j.v3.dataformat.rdf;

import org.apache.jena.rdf.model.Property;
import org.apache.jena.rdf.model.Resource;
import org.apache.jena.rdf.model.ResourceFactory;
import org.eclipse.digitaltwin.aas4j.v3.model.KeyTypes;
import org.eclipse.digitaltwin.aas4j.v3.model.ReferenceTypes;

/**
 * Elements of Asset Administration Shell as Resource and Property compatible with Apache Jena.
 */
public class AASNamespace {
    public static final String AAS_NAMESPACE = "https://admin-shell.io/aas/3/0/";

    public static final Property index = ResourceFactory.createProperty(AAS_NAMESPACE + "index");

    private AASNamespace() {

    }

    /**
     * A key is a reference to an element by its ID.
     *
     * @see AASNamespace.KeyTypes
     */
    public static class Key {
        /**
         * The key value, for example an IRDI or an URI
         */
        public static final Property value = ResourceFactory.createProperty(AAS_NAMESPACE + "Key/value");
        /**
         * Denotes which kind of entity is referenced.
         */
        public static final Property type = ResourceFactory.createProperty(AAS_NAMESPACE + "Key/type");
    }

    public static class Reference {
        public static final Property keys = ResourceFactory.createProperty(AAS_NAMESPACE + "Reference/keys");
        public static final Property type = ResourceFactory.createProperty(AAS_NAMESPACE + "Reference/type");
    }

    public static class Referable {
        public static final Property idShort = ResourceFactory.createProperty(AAS_NAMESPACE + "Referable/idShort");
        public static final Property displayName = ResourceFactory.createProperty(AAS_NAMESPACE + "Referable/displayName");
        public static final Property description = ResourceFactory.createProperty(AAS_NAMESPACE + "Referable/description");
        public static final Property category = ResourceFactory.createProperty(AAS_NAMESPACE + "Referable/category");
    }

    public static class Identifiable {
        public static final Property id = ResourceFactory.createProperty(AAS_NAMESPACE + "Identifiable/id");
        public static final Property administration = ResourceFactory.createProperty(AAS_NAMESPACE + "Identifiable/administration");
    }

    /**
     * The semantics of a property or other elements that may have a semantic description is defined by a concept description.
     */
    public static class ConceptDescription {
        public static final Property isCaseOf = ResourceFactory.createProperty(AAS_NAMESPACE + "ConceptDescription/isCaseOf");
    }

    /**
     * Enumeration of different key value types within a key.
     *
     * @see AASNamespace.Key
     */
    public static class KeyTypes {
        public static final Resource AnnotatedRelationshipElement =
                ResourceFactory.createResource(AAS_NAMESPACE + "KeyTypes/AnnotatedRelationshipElement");
        public static final Resource AssetAdministrationShell =
                ResourceFactory.createResource(AAS_NAMESPACE + "KeyTypes/AssetAdministrationShell");
        public static final Resource BasicEventElement =
                ResourceFactory.createResource(AAS_NAMESPACE + "KeyTypes/BasicEventElement");
        public static final Resource Blob =
                ResourceFactory.createResource(AAS_NAMESPACE + "KeyTypes/Blob");
        public static final Resource Capability =
                ResourceFactory.createResource(AAS_NAMESPACE + "KeyTypes/Capability");
        public static final Resource ConceptDescription =
                ResourceFactory.createResource(AAS_NAMESPACE + "KeyTypes/ConceptDescription");
        public static final Resource DataElement =
                ResourceFactory.createResource(AAS_NAMESPACE + "KeyTypes/DataElement");
        public static final Resource Entity =
                ResourceFactory.createResource(AAS_NAMESPACE + "KeyTypes/Entity");
        public static final Resource EventElement =
                ResourceFactory.createResource(AAS_NAMESPACE + "KeyTypes/EventElement");
        public static final Resource File =
                ResourceFactory.createResource(AAS_NAMESPACE + "KeyTypes/File");
        public static final Resource FragmentReference =
                ResourceFactory.createResource(AAS_NAMESPACE + "KeyTypes/FragmentReference");
        public static final Resource GlobalReference =
                ResourceFactory.createResource(AAS_NAMESPACE + "KeyTypes/GlobalReference");
        public static final Resource Identifiable =
                ResourceFactory.createResource(AAS_NAMESPACE + "KeyTypes/Identifiable");
        public static final Resource MultiLanguageProperty =
                ResourceFactory.createResource(AAS_NAMESPACE + "KeyTypes/MultiLanguageProperty");
        public static final Resource Operation =
                ResourceFactory.createResource(AAS_NAMESPACE + "KeyTypes/Operation");
        public static final Resource Property =
                ResourceFactory.createResource(AAS_NAMESPACE + "KeyTypes/Property");
        public static final Resource Range =
                ResourceFactory.createResource(AAS_NAMESPACE + "KeyTypes/Range");
        public static final Resource ReferenceElement =
                ResourceFactory.createResource(AAS_NAMESPACE + "KeyTypes/ReferenceElement");
        public static final Resource RelationshipElement =
                ResourceFactory.createResource(AAS_NAMESPACE + "KeyTypes/RelationshipElement");
        public static final Resource Submodel =
                ResourceFactory.createResource(AAS_NAMESPACE + "KeyTypes/Submodel");
        public static final Resource SubmodelElement =
                ResourceFactory.createResource(AAS_NAMESPACE + "KeyTypes/SubmodelElement");
        public static final Resource SubmodelElementCollection =
                ResourceFactory.createResource(AAS_NAMESPACE + "KeyTypes/SubmodelElementCollection");
        public static final Resource SubmodelElementList =
                ResourceFactory.createResource(AAS_NAMESPACE + "KeyTypes/SubmodelElementList");
        public static org.eclipse.digitaltwin.aas4j.v3.model.KeyTypes fromIRI(String stringIRI){
            if(stringIRI.equals(FragmentReference.getURI())){
                return org.eclipse.digitaltwin.aas4j.v3.model.KeyTypes.FRAGMENT_REFERENCE;
            }
            if(stringIRI.equals(GlobalReference.getURI())){
                return org.eclipse.digitaltwin.aas4j.v3.model.KeyTypes.GLOBAL_REFERENCE;
            }
            throw new IllegalArgumentException("Invalid ReferenceType IRI provided.");
        }
        public static Resource valueOf(String type){
            if(type.equalsIgnoreCase(org.eclipse.digitaltwin.aas4j.v3.model.KeyTypes.ANNOTATED_RELATIONSHIP_ELEMENT.name())){
                return AnnotatedRelationshipElement;
            }
            if(type.equalsIgnoreCase(org.eclipse.digitaltwin.aas4j.v3.model.KeyTypes.GLOBAL_REFERENCE.name())){
                return GlobalReference;
            }
            if(type.equalsIgnoreCase(org.eclipse.digitaltwin.aas4j.v3.model.KeyTypes.FRAGMENT_REFERENCE.name())){
                return FragmentReference;
            }

            throw new IllegalArgumentException("Invalid ReferenceType provided.");
        }
    }

    public static class ReferenceTypes {
        public static org.eclipse.digitaltwin.aas4j.v3.model.ReferenceTypes fromIRI(String stringIRI){
            if(stringIRI.equals(ModelReference.getURI())){
                return org.eclipse.digitaltwin.aas4j.v3.model.ReferenceTypes.MODEL_REFERENCE;
            }
            if(stringIRI.equals(ExternalReference.getURI())){
                return org.eclipse.digitaltwin.aas4j.v3.model.ReferenceTypes.EXTERNAL_REFERENCE;
            }
            throw new IllegalArgumentException("Invalid ReferenceType IRI provided.");
        }
        public static Resource valueOf(String type){
            if(type.equalsIgnoreCase(org.eclipse.digitaltwin.aas4j.v3.model.ReferenceTypes.EXTERNAL_REFERENCE.name())){
                return ExternalReference;
            }
            if(type.equalsIgnoreCase(org.eclipse.digitaltwin.aas4j.v3.model.ReferenceTypes.MODEL_REFERENCE.name())){
                return ModelReference;
            }
            throw new IllegalArgumentException("Invalid ReferenceType provided.");
        }
        public static final Resource ExternalReference =
                ResourceFactory.createResource(AAS_NAMESPACE + "ReferenceTypes/ExternalReference");
        public static final Resource ModelReference =
                ResourceFactory.createResource(AAS_NAMESPACE + "ReferenceTypes/ModelReference");
    }

    public static class Types {

        public static final Resource AdministrativeInformation =
                ResourceFactory.createResource(AAS_NAMESPACE + "AdministrativeInformation");
        public static final Resource AnnotatedRelationshipElement =
                ResourceFactory.createResource(AAS_NAMESPACE + "AnnotatedRelationshipElement");
        public static final Resource AssetAdministrationShell =
                ResourceFactory.createResource(AAS_NAMESPACE + "AssetAdministrationShell");
        public static final Resource AssetInformation =
                ResourceFactory.createResource(AAS_NAMESPACE + "AssetInformation");
        public static final Resource BasicEventElement =
                ResourceFactory.createResource(AAS_NAMESPACE + "BasicEventElement");
        public static final Resource Blob =
                ResourceFactory.createResource(AAS_NAMESPACE + "Blob");
        public static final Resource Capability =
                ResourceFactory.createResource(AAS_NAMESPACE + "Capability");
        public static final Resource ConceptDescription =
                ResourceFactory.createResource(AAS_NAMESPACE + "ConceptDescription");
        public static final Resource DataSpecificationIec61360 =
                ResourceFactory.createResource(AAS_NAMESPACE + "DataSpecificationIec61360");
        public static final Resource EmbeddedDataSpecification =
                ResourceFactory.createResource(AAS_NAMESPACE + "EmbeddedDataSpecification");
        public static final Resource Entity =
                ResourceFactory.createResource(AAS_NAMESPACE + "Entity");
        public static final Resource Extension =
                ResourceFactory.createResource(AAS_NAMESPACE + "Extension");
        public static final Resource File =
                ResourceFactory.createResource(AAS_NAMESPACE + "File");

        public static final Resource Key =
                ResourceFactory.createResource(AAS_NAMESPACE + "Key");
        public static final Resource LangStringDefinitionTypeIec61360 =
                ResourceFactory.createResource(AAS_NAMESPACE + "LangStringDefinitionTypeIec61360");
        public static final Resource LangStringNameType =
                ResourceFactory.createResource(AAS_NAMESPACE + "LangStringNameType");
        public static final Resource LangStringPreferredNameTypeIec61360 =
                ResourceFactory.createResource(AAS_NAMESPACE + "LangStringPreferredNameTypeIec61360");
        public static final Resource LangStringShortNameTypeIec61360 =
                ResourceFactory.createResource(AAS_NAMESPACE + "LangStringShortNameTypeIec61360");
        public static final Resource LangStringTextType =
                ResourceFactory.createResource(AAS_NAMESPACE + "LangStringTextType");
        public static final Resource LevelType =
                ResourceFactory.createResource(AAS_NAMESPACE + "LevelType");
        public static final Resource MultiLanguageProperty =
                ResourceFactory.createResource(AAS_NAMESPACE + "MultiLanguageProperty");
        public static final Resource Operation =
                ResourceFactory.createResource(AAS_NAMESPACE + "Operation");
        public static final Resource OperationVariable =
                ResourceFactory.createResource(AAS_NAMESPACE + "OperationVariable");
        public static final Resource Property =
                ResourceFactory.createResource(AAS_NAMESPACE + "Property");
        public static final Resource Qualifier =
                ResourceFactory.createResource(AAS_NAMESPACE + "Qualifier");
        public static final Resource Range =
                ResourceFactory.createResource(AAS_NAMESPACE + "Range");
        public static final Resource Reference =
                ResourceFactory.createResource(AAS_NAMESPACE + "Reference");
        public static final Resource ReferenceElement =
                ResourceFactory.createResource(AAS_NAMESPACE + "ReferenceElement");
        public static final Resource RelationshipElement =
                ResourceFactory.createResource(AAS_NAMESPACE + "RelationshipElement");
        public static final Resource Resource =
                ResourceFactory.createResource(AAS_NAMESPACE + "Resource");
        public static final Resource SpecificAssetId =
                ResourceFactory.createResource(AAS_NAMESPACE + "SpecificAssetId");
        public static final Resource Submodel =
                ResourceFactory.createResource(AAS_NAMESPACE + "Submodel");
        public static final Resource SubmodelElementCollection =
                ResourceFactory.createResource(AAS_NAMESPACE + "SubmodelElementCollection");
        public static final Resource SubmodelElementList =
                ResourceFactory.createResource(AAS_NAMESPACE + "SubmodelElementList");
        public static final Resource ValueList =
                ResourceFactory.createResource(AAS_NAMESPACE + "ValueList");
        public static final Resource ValueReferencePair =
                ResourceFactory.createResource(AAS_NAMESPACE + "ValueReferencePair");

    }
}
