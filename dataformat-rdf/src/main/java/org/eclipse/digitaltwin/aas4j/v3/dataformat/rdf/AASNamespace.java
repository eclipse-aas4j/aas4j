package org.eclipse.digitaltwin.aas4j.v3.dataformat.rdf;

import org.apache.jena.rdf.model.Property;
import org.apache.jena.rdf.model.Resource;
import org.apache.jena.rdf.model.ResourceFactory;
import org.eclipse.digitaltwin.aas4j.v3.model.DataTypeIec61360;
import org.eclipse.digitaltwin.aas4j.v3.model.KeyTypes;
import org.eclipse.digitaltwin.aas4j.v3.model.ReferenceTypes;

/**
 * Elements of Asset Administration Shell as Resource and Property compatible with Apache Jena.
 */
public final class AASNamespace {
    public static final String AAS_NAMESPACE = "https://admin-shell.io/aas/3/0/";

    public static final Property index = ResourceFactory.createProperty(AAS_NAMESPACE + "index");

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
        public static final Property value = ResourceFactory.createProperty(AAS_NAMESPACE + "Key/value");
        /**
         * Denotes which kind of entity is referenced.
         */
        public static final Property type = ResourceFactory.createProperty(AAS_NAMESPACE + "Key/type");
    }

    public static final class Reference {
        public static final Property keys = ResourceFactory.createProperty(AAS_NAMESPACE + "Reference/keys");
        public static final Property type = ResourceFactory.createProperty(AAS_NAMESPACE + "Reference/type");
    }

    public static final class Referable {
        public static final Property idShort = ResourceFactory.createProperty(AAS_NAMESPACE + "Referable/idShort");
        public static final Property displayName = ResourceFactory.createProperty(AAS_NAMESPACE + "Referable/displayName");
        public static final Property description = ResourceFactory.createProperty(AAS_NAMESPACE + "Referable/description");
        public static final Property category = ResourceFactory.createProperty(AAS_NAMESPACE + "Referable/category");
    }

    public static final class Identifiable {
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
    public static final class KeyTypes {
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

        public static org.eclipse.digitaltwin.aas4j.v3.model.KeyTypes fromIRI(String stringIRI) {
            if (stringIRI.equals(FragmentReference.getURI())) {
                return org.eclipse.digitaltwin.aas4j.v3.model.KeyTypes.FRAGMENT_REFERENCE;
            }
            if (stringIRI.equals(GlobalReference.getURI())) {
                return org.eclipse.digitaltwin.aas4j.v3.model.KeyTypes.GLOBAL_REFERENCE;
            }
            throw new IllegalArgumentException("Invalid ReferenceType IRI provided.");
        }

        public static Resource valueOf(String type) {
            if (type.equalsIgnoreCase(org.eclipse.digitaltwin.aas4j.v3.model.KeyTypes.ANNOTATED_RELATIONSHIP_ELEMENT.name())) {
                return AnnotatedRelationshipElement;
            }
            if (type.equalsIgnoreCase(org.eclipse.digitaltwin.aas4j.v3.model.KeyTypes.GLOBAL_REFERENCE.name())) {
                return GlobalReference;
            }
            if (type.equalsIgnoreCase(org.eclipse.digitaltwin.aas4j.v3.model.KeyTypes.FRAGMENT_REFERENCE.name())) {
                return FragmentReference;
            }

            throw new IllegalArgumentException("Invalid ReferenceType provided.");
        }
    }

    public static final class ReferenceTypes {
        public static final Resource ExternalReference =
                ResourceFactory.createResource(AAS_NAMESPACE + "ReferenceTypes/ExternalReference");
        public static final Resource ModelReference =
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

        public static Resource valueOf(String type) {
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

    public static final class LevelType {
        public static final Property min = ResourceFactory.createProperty(AAS_NAMESPACE + "LevelType/min");
        public static final Property nom = ResourceFactory.createProperty(AAS_NAMESPACE + "LevelType/nom");
        public static final Property typ = ResourceFactory.createProperty(AAS_NAMESPACE + "LevelType/typ");
        public static final Property max = ResourceFactory.createProperty(AAS_NAMESPACE + "LevelType/max");
    }

    public static final class AbstractLangString {
        public static final Property language = ResourceFactory.createProperty(AAS_NAMESPACE + "AbstractLangString/language");
        public static final Property text = ResourceFactory.createProperty(AAS_NAMESPACE + "AbstractLangString/text");
    }

    public static final class ValueReferencePair {
        public static final Property value = ResourceFactory.createProperty(AAS_NAMESPACE + "ValueReferencePair/value");
        public static final Property valueId = ResourceFactory.createProperty(AAS_NAMESPACE + "ValueReferencePair/valueId");
    }

    public static final class ValueList {
        public static final Property valueReferencePairs = ResourceFactory.createProperty(AAS_NAMESPACE + "ValueList/valueReferencePairs");
    }

    public static final class DataSpecificationIec61360 {
        public static final Property levelType = ResourceFactory.createProperty(AAS_NAMESPACE + "DataSpecificationIec61360/levelType");
        public static final Property value = ResourceFactory.createProperty(AAS_NAMESPACE + "DataSpecificationIec61360/value");
        public static final Property valueFormat = ResourceFactory.createProperty(AAS_NAMESPACE + "DataSpecificationIec61360/valueFormat");
        public static final Property definition = ResourceFactory.createProperty(AAS_NAMESPACE + "DataSpecificationIec61360/definition");
        public static final Property dataType = ResourceFactory.createProperty(AAS_NAMESPACE + "DataSpecificationIec61360/dataType");
        public static final Property symbol = ResourceFactory.createProperty(AAS_NAMESPACE + "DataSpecificationIec61360/symbol");
        public static final Property sourceOfDefinition = ResourceFactory.createProperty(AAS_NAMESPACE + "DataSpecificationIec61360/sourceOfDefinition");
        public static final Property unitId = ResourceFactory.createProperty(AAS_NAMESPACE + "DataSpecificationIec61360/unitId");
        public static final Property unit = ResourceFactory.createProperty(AAS_NAMESPACE + "DataSpecificationIec61360/unit");
        public static final Property shortName = ResourceFactory.createProperty(AAS_NAMESPACE + "DataSpecificationIec61360/shortName");
        public static final Property preferredName = ResourceFactory.createProperty(AAS_NAMESPACE + "DataSpecificationIec61360/preferredName");
        public static final Property valueList = ResourceFactory.createProperty(AAS_NAMESPACE + "DataSpecificationIec61360/valueList");
    }

    public static final class DataTypeIec61360 {
        public static final Resource Blob =
                ResourceFactory.createResource(AAS_NAMESPACE + "DataTypeIec61360/Blob");
        public static final Resource Boolean =
                ResourceFactory.createResource(AAS_NAMESPACE + "DataTypeIec61360/Boolean");
        public static final Resource Date =
                ResourceFactory.createResource(AAS_NAMESPACE + "DataTypeIec61360/Date");
        public static final Resource File =
                ResourceFactory.createResource(AAS_NAMESPACE + "DataTypeIec61360/File");
        public static final Resource Html =
                ResourceFactory.createResource(AAS_NAMESPACE + "DataTypeIec61360/Html");
        public static final Resource IntegerCount =
                ResourceFactory.createResource(AAS_NAMESPACE + "DataTypeIec61360/IntegerCount");
        public static final Resource IntegerCurrency =
                ResourceFactory.createResource(AAS_NAMESPACE + "DataTypeIec61360/IntegerCurrency");
        public static final Resource IntegerMeasure =
                ResourceFactory.createResource(AAS_NAMESPACE + "DataTypeIec61360/IntegerMeasure");
        public static final Resource Irdi =
                ResourceFactory.createResource(AAS_NAMESPACE + "DataTypeIec61360/Irdi");
        public static final Resource Iri =
                ResourceFactory.createResource(AAS_NAMESPACE + "DataTypeIec61360/Iri");
        public static final Resource Rational =
                ResourceFactory.createResource(AAS_NAMESPACE + "DataTypeIec61360/Rational");
        public static final Resource RationalMeasure =
                ResourceFactory.createResource(AAS_NAMESPACE + "DataTypeIec61360/RationalMeasure");
        public static final Resource RealCount =
                ResourceFactory.createResource(AAS_NAMESPACE + "DataTypeIec61360/RealCount");
        public static final Resource RealCurrency =
                ResourceFactory.createResource(AAS_NAMESPACE + "DataTypeIec61360/RealCurrency");
        public static final Resource RealMeasure =
                ResourceFactory.createResource(AAS_NAMESPACE + "DataTypeIec61360/RealMeasure");
        public static final Resource String =
                ResourceFactory.createResource(AAS_NAMESPACE + "DataTypeIec61360/String");
        public static final Resource StringTranslatable =
                ResourceFactory.createResource(AAS_NAMESPACE + "DataTypeIec61360/StringTranslatable");
        public static final Resource Time =
                ResourceFactory.createResource(AAS_NAMESPACE + "DataTypeIec61360/Time");
        public static final Resource Timestamp =
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

        public static Resource valueOf(String type) {
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
}
