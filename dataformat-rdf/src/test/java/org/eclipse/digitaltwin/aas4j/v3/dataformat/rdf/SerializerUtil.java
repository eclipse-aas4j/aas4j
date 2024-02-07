package org.eclipse.digitaltwin.aas4j.v3.dataformat.rdf;


import org.eclipse.digitaltwin.aas4j.v3.model.*;
import org.eclipse.digitaltwin.aas4j.v3.model.impl.*;

import java.util.Arrays;
import java.util.Base64;
import java.util.List;


public class SerializerUtil {


    public static DefaultDataSpecificationIec61360 getDataSpecificationIec61360() {
        return new DefaultDataSpecificationIec61360.Builder()
                .dataType(DataTypeIec61360.STRING)
                .value("exampleValue")
                .symbol("g")
                .unit("gram")
                .sourceOfDefinition("external")
                .valueList(new DefaultValueList.Builder()
                        .valueReferencePairs(List.of(
                                new DefaultValueReferencePair.Builder()
                                        .value("refVal1")
                                        .valueId(new DefaultReference.Builder()
                                                .keys(new DefaultKey.Builder()
                                                        .type(KeyTypes.GLOBAL_REFERENCE)
                                                        .value("externalKey1")
                                                        .build())
                                                .type(ReferenceTypes.EXTERNAL_REFERENCE)
                                                .build())
                                        .build()
                                , new DefaultValueReferencePair.Builder()
                                        .value("refVal2")
                                        .valueId(new DefaultReference.Builder()
                                                .keys(List.of(
                                                        new DefaultKey.Builder()
                                                                .type(KeyTypes.GLOBAL_REFERENCE)
                                                                .value("externalKey2")
                                                                .build(),
                                                        new DefaultKey.Builder()
                                                                .type(KeyTypes.FRAGMENT_REFERENCE)
                                                                .value("fragment2")
                                                                .build()
                                                ))
                                                .type(ReferenceTypes.EXTERNAL_REFERENCE)
                                                .build())
                                        .build()
                        ))
                        .build()
                )
                .definition(List.of(
                        new DefaultLangStringDefinitionTypeIec61360.Builder()
                                .text("definition1")
                                .language("en")
                                .build(),
                        new DefaultLangStringDefinitionTypeIec61360.Builder()
                                .text("definition2")
                                .language("de")
                                .build()
                ))
                .preferredName(List.of(
                        new DefaultLangStringPreferredNameTypeIec61360.Builder()
                                .text("preferred1")
                                .language("en")
                                .build(),
                        new DefaultLangStringPreferredNameTypeIec61360.Builder()
                                .text("preferred2")
                                .language("de")
                                .build()
                ))
                .shortName(List.of(
                        new DefaultLangStringShortNameTypeIec61360.Builder()
                                .text("short1")
                                .language("en")
                                .build(),
                        new DefaultLangStringShortNameTypeIec61360.Builder()
                                .text("short2")
                                .language("de")
                                .build()
                ))
                .levelType(new DefaultLevelType.Builder()
                        .build())
                .build();
    }

    public static EmbeddedDataSpecification getEmbeddedDataSpecifications() {
        return new DefaultEmbeddedDataSpecification.Builder()
                .dataSpecification(
                        new DefaultReference.Builder()
                                .keys(new DefaultKey.Builder()
                                        .value("https://admin-shell.io/DataSpecificationTemplates/DataSpecificationIEC61360/3/0")
                                        .type(KeyTypes.GLOBAL_REFERENCE).build())
                                .type(ReferenceTypes.EXTERNAL_REFERENCE)
                                .build())
                .dataSpecificationContent(
                        new DefaultDataSpecificationIec61360.Builder()
                                .levelType(new DefaultLevelType.Builder()
                                        .max(true).min(true).nom(false).typ(false)
                                        .build())
                                .unit("gram")
                                .symbol("g")
                                .dataType(DataTypeIec61360.INTEGER_MEASURE).build())
                .build();
    }

    public static EmbeddedDataSpecification getMaximalEmbeddedDataSpecifications() {
        return new DefaultEmbeddedDataSpecification.Builder()
                .dataSpecification(
                        new DefaultReference.Builder()
                                .keys(new DefaultKey.Builder()
                                        .value("https://admin-shell.io/DataSpecificationTemplates/DataSpecificationIEC61360/3/0")
                                        .type(KeyTypes.GLOBAL_REFERENCE).build())
                                .type(ReferenceTypes.EXTERNAL_REFERENCE)
                                .build())
                .dataSpecificationContent(getDataSpecificationIec61360())
                .build();
    }

    static List<Reference> getIsCaseOfs() {
        return Arrays.asList(
                new DefaultReference.Builder()
                        .keys(new DefaultKey.Builder()
                                .value("https://example.com/outside")
                                .type(KeyTypes.GLOBAL_REFERENCE)
                                .build())
                        .type(ReferenceTypes.EXTERNAL_REFERENCE).build());
    }

    static AdministrativeInformation getAdministrativeInformation() {
        return new DefaultAdministrativeInformation.Builder()
                .version("1")
                .revision("0")
                .creator(new DefaultReference.Builder().keys(
                                Arrays.asList(new DefaultKey.Builder()
                                                .value("https://example.com")
                                                .type(KeyTypes.GLOBAL_REFERENCE)
                                                .build(),
                                        new DefaultKey.Builder()
                                                .value("fragment")
                                                .type(KeyTypes.FRAGMENT_REFERENCE)
                                                .build()))
                        .type(ReferenceTypes.EXTERNAL_REFERENCE)
                        .build())
                .build();
    }

    static List<LangStringTextType> getDescriptions() {
        return Arrays.asList(
                new DefaultLangStringTextType.Builder()
                        .text("A long text in English")
                        .language("en")
                        .build(),
                new DefaultLangStringTextType.Builder()
                        .text("영어로 된 긴 텍스트")
                        .language("ko")
                        .build());
    }

    static List<LangStringNameType> getDisplayNames() {
        return Arrays.asList(
                new DefaultLangStringNameType.Builder()
                        .text("text in English")
                        .language("en")
                        .build(),
                new DefaultLangStringNameType.Builder()
                        .text("متن به فارسی")
                        .language("fa")
                        .build());
    }

    static Extension getMaximalExtension() {
        return new DefaultExtension.Builder()
                .name("extension1")
                .value("extension1Value")
                .valueType(DataTypeDefXsd.ANY_URI)
                .refersTo(Arrays.asList(
                        new DefaultReference.Builder()
                                .keys(new DefaultKey.Builder()
                                        .value("refersTo")
                                        .type(KeyTypes.GLOBAL_REFERENCE)
                                        .build())
                                .type(ReferenceTypes.EXTERNAL_REFERENCE).build()))
                .semanticId(new DefaultReference.Builder()
                        .keys(new DefaultKey.Builder()
                                .value("semanticId")
                                .type(KeyTypes.GLOBAL_REFERENCE)
                                .build())
                        .type(ReferenceTypes.EXTERNAL_REFERENCE).build())
                .supplementalSemanticIds(Arrays.asList(
                        new DefaultReference.Builder()
                                .keys(new DefaultKey.Builder()
                                        .value("supplementalSemanticIds")
                                        .type(KeyTypes.GLOBAL_REFERENCE)
                                        .build())
                                .type(ReferenceTypes.EXTERNAL_REFERENCE).build()))
                .build();
    }

    static Reference getMinimalReference() {
        return new DefaultReference.Builder()
                .keys(new DefaultKey.Builder()
                        .value("minimal")
                        .type(KeyTypes.GLOBAL_REFERENCE)
                        .build())
                .type(ReferenceTypes.EXTERNAL_REFERENCE)
                .build();
    }

    static Qualifier getMinimalQualifier() {
        return new DefaultQualifier.Builder()
                .type("type1")
                .valueType(DataTypeDefXsd.STRING)
                .build();
    }

    static Qualifier getMaximalQualifier() {
        return new DefaultQualifier.Builder()
                .type("type1")
                .kind(QualifierKind.CONCEPT_QUALIFIER)
                .valueId(getMinimalReference())
                .supplementalSemanticIds(getMinimalReference())
                .semanticId(getMinimalReference())
                .value("value1")
                .valueType(DataTypeDefXsd.STRING)
                .build();
    }

    static SpecificAssetId getMaximalSpecificAssetId() {
        return new DefaultSpecificAssetId.Builder()
                .semanticId(getMinimalReference())
                .supplementalSemanticIds(getMinimalReference())
                .externalSubjectId(getMinimalReference())
                .name("name1")
                .value("value1")
                .build();
    }

    static SpecificAssetId getMinimalSpecificAssetId() {
        return new DefaultSpecificAssetId.Builder()
                .name("name1")
                .value("value1")
                .build();
    }

    static Property getMinimalProperty() {
        return new DefaultProperty.Builder()
                .idShort("idShort1")
                .valueType(DataTypeDefXsd.DECIMAL)
                .build();
    }

    static Property getMaximalProperty() {
        return new DefaultProperty.Builder()
                .idShort("idShort1")
                .valueType(DataTypeDefXsd.DECIMAL)
                .value("12.2")
                .valueId(getMinimalReference())
                .category("category1")
                .description(getDescriptions())
                .displayName(getDisplayNames())
                .embeddedDataSpecifications(getMaximalEmbeddedDataSpecifications())
                .extensions(getMaximalExtension())
                .supplementalSemanticIds(getIsCaseOfs())
                .semanticId(getMinimalReference())
                .qualifiers(List.of(getMaximalQualifier(), getMinimalQualifier()))
                .build();
    }

    static MultiLanguageProperty getMaximalMultiLanguageProperty() {
        return new DefaultMultiLanguageProperty.Builder()
                .idShort("MLP1")
                .value(getDescriptions())
                .valueId(getMinimalReference())
                .category("category1")
                .description(getDescriptions())
                .displayName(getDisplayNames())
                .embeddedDataSpecifications(getMaximalEmbeddedDataSpecifications())
                .extensions(getMaximalExtension())
                .supplementalSemanticIds(getIsCaseOfs())
                .semanticId(getMinimalReference())
                .qualifiers(List.of(getMaximalQualifier(), getMinimalQualifier()))
                .build();

    }

    static AnnotatedRelationshipElement getMinimalAnnotatedRelationshipElement() {
        return new DefaultAnnotatedRelationshipElement.Builder()
                .idShort("ARE1")
                .first(new DefaultReference.Builder()
                        .type(ReferenceTypes.MODEL_REFERENCE)
                        .keys(List.of(
                                new DefaultKey.Builder()
                                        .type(KeyTypes.SUBMODEL)
                                        .value("submodel_")
                                        .build(),
                                new DefaultKey.Builder()
                                        .type(KeyTypes.SUBMODEL)
                                        .value("submodel_")
                                        .build()
                        )).build())
                .second(new DefaultReference.Builder()
                        .type(ReferenceTypes.MODEL_REFERENCE)
                        .keys(List.of(
                                new DefaultKey.Builder()
                                        .type(KeyTypes.CONCEPT_DESCRIPTION)
                                        .value("concept_")
                                        .build()
                        )).build())
                .build();
    }

    static BasicEventElement getMinimalBasicEventElement() {
        return new DefaultBasicEventElement.Builder()
                .idShort("BEE1")
                .direction(Direction.OUTPUT)
                .state(StateOfEvent.OFF)
                .observed(getMinimalReference())
                .build();
    }

    static Blob getMinimalBlob() {
        return new DefaultBlob.Builder()
                .idShort("B1")
                .value(Base64.getDecoder().decode("aGVsbG8=")) // a `hello` in a text file
                .contentType("plain/text")
                .build();
    }

    static Capability getMinimalCapability() {
        return new DefaultCapability.Builder()
                .idShort("C1")
                .build();
    }

    static Entity getMinimalEntity() {
        return new DefaultEntity.Builder()
                .idShort("E1")
                .entityType(EntityType.SELF_MANAGED_ENTITY)
                .build();
    }

    static File getMinimalFile() {
        return new DefaultFile.Builder()
                .idShort("F1")
                .contentType("image/png")
                .build();
    }

    static Range getMinimalRange() {
        return new DefaultRange.Builder()
                .idShort("R1")
                .valueType(DataTypeDefXsd.DECIMAL)
                .build();
    }

    static ReferenceElement getMinimalReferenceElement() {
        return new DefaultReferenceElement.Builder()
                .idShort("RE1")
                .build();
    }

    static RelationshipElement getMinimalRelationshipElement() {
        return new DefaultRelationshipElement.Builder()
                .idShort("ReE1")
                .build();
    }

    static SubmodelElementCollection getMinimalSubmodelElementCollection() {
        return new DefaultSubmodelElementCollection.Builder()
                .idShort("SEC1")
                .build();
    }

    static SubmodelElementList getMinimalSubmodelElementList() {
        return new DefaultSubmodelElementList.Builder()
                .idShort("SEL1")
                .build();
    }

    static Operation getMinimalOperation() {
        return new DefaultOperation.Builder()
                .idShort("O1")
                .build();
    }

    static MultiLanguageProperty getMinimalMultiLanguageProperty() {
        return new DefaultMultiLanguageProperty.Builder()
                .idShort("mlp1")
                .build();
    }

    static Extension getMiniamlExtension() {
        return new DefaultExtension.Builder()
                .name("extension2")
                .value("extension2Value")
                .build();
    }

    static Resource getResource() {
        return new DefaultResource.Builder()
                .path("path://")
                .contentType("content/type")
                .build();
    }

    static AssetInformation getMinimalAssetInformation() {
        return new DefaultAssetInformation.Builder()
                .assetKind(AssetKind.INSTANCE)
                .globalAssetId("global1")
                .build();
    }

    static AssetInformation getMaximalAssetInformation() {
        return new DefaultAssetInformation.Builder()
                .assetKind(AssetKind.NOT_APPLICABLE)
                .globalAssetId("global2")
                .assetType("type2")
                .specificAssetIds(getMaximalSpecificAssetId())
                .defaultThumbnail(new DefaultResource.Builder()
                        .contentType("image/png")
                        .path("s3://test.org")
                        .build())
                .build();
    }

    static AssetAdministrationShell getMinimalAssetAdministrationShell() {
        return new DefaultAssetAdministrationShell.Builder()
                .assetInformation(getMinimalAssetInformation())
                .id("id1")
                .build();
    }

    static AssetAdministrationShell getMaximalAssetAdministrationShell() {
        return new DefaultAssetAdministrationShell.Builder()
                .assetInformation(getMaximalAssetInformation())
                .administration(getAdministrativeInformation())
                .category("category1")
                .derivedFrom(getMinimalReference())
                .extensions(getMaximalExtension())
                .description(getDescriptions())
                .displayName(getDisplayNames())
                .embeddedDataSpecifications(getEmbeddedDataSpecifications())
                .submodels(getIsCaseOfs())
                .id("https://example.com")
                .build();
    }


    static List<Extension> getExtensionList() {
        return Arrays.asList(
                getMaximalExtension(),
                getMiniamlExtension());
    }
}
