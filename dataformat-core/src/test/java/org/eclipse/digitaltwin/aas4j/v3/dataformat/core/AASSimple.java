/*
 * Copyright (c) 2021 Fraunhofer-Gesellschaft zur Foerderung der angewandten Forschung e. V.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.eclipse.digitaltwin.aas4j.v3.dataformat.core;

import org.eclipse.digitaltwin.aas4j.v3.model.AssetAdministrationShell;
import org.eclipse.digitaltwin.aas4j.v3.model.AssetKind;
import org.eclipse.digitaltwin.aas4j.v3.model.ConceptDescription;
import org.eclipse.digitaltwin.aas4j.v3.model.DataTypeDefXsd;
import org.eclipse.digitaltwin.aas4j.v3.model.DataTypeIec61360;
import org.eclipse.digitaltwin.aas4j.v3.model.Environment;
import org.eclipse.digitaltwin.aas4j.v3.model.KeyTypes;
import org.eclipse.digitaltwin.aas4j.v3.model.ModellingKind;
import org.eclipse.digitaltwin.aas4j.v3.model.ReferenceTypes;
import org.eclipse.digitaltwin.aas4j.v3.model.Submodel;
import org.eclipse.digitaltwin.aas4j.v3.model.impl.DefaultAdministrativeInformation;
import org.eclipse.digitaltwin.aas4j.v3.model.impl.DefaultAssetAdministrationShell;
import org.eclipse.digitaltwin.aas4j.v3.model.impl.DefaultAssetInformation;
import org.eclipse.digitaltwin.aas4j.v3.model.impl.DefaultConceptDescription;
import org.eclipse.digitaltwin.aas4j.v3.model.impl.DefaultDataSpecificationIec61360;
import org.eclipse.digitaltwin.aas4j.v3.model.impl.DefaultEmbeddedDataSpecification;
import org.eclipse.digitaltwin.aas4j.v3.model.impl.DefaultEnvironment;
import org.eclipse.digitaltwin.aas4j.v3.model.impl.DefaultFile;
import org.eclipse.digitaltwin.aas4j.v3.model.impl.DefaultKey;
import org.eclipse.digitaltwin.aas4j.v3.model.impl.DefaultLangStringDefinitionTypeIec61360;
import org.eclipse.digitaltwin.aas4j.v3.model.impl.DefaultLangStringPreferredNameTypeIec61360;
import org.eclipse.digitaltwin.aas4j.v3.model.impl.DefaultLangStringShortNameTypeIec61360;
import org.eclipse.digitaltwin.aas4j.v3.model.impl.DefaultProperty;
import org.eclipse.digitaltwin.aas4j.v3.model.impl.DefaultReference;
import org.eclipse.digitaltwin.aas4j.v3.model.impl.DefaultResource;
import org.eclipse.digitaltwin.aas4j.v3.model.impl.DefaultSpecificAssetId;
import org.eclipse.digitaltwin.aas4j.v3.model.impl.DefaultSubmodel;
import org.eclipse.digitaltwin.aas4j.v3.model.impl.DefaultSubmodelElementCollection;

import java.util.Arrays;

public class AASSimple {

    private static final String DOCUMENT_DEF = "Feste und geordnete Menge von für die Verwendung durch Personen bestimmte Informationen, die verwaltet und als Einheit zwischen Benutzern und System ausgetauscht werden kann.";
    private static final String ISO15519_1_2010 = "[ISO15519-1:2010]";
    private static final String DOKUMENT = "Dokument";
    private static final String DOCUMENT = "Document";
    private static final String WWW_VDI2770_COM_BLATT1_ENTWURF_OKT18_CD_DOCUMENT = "http://www.vdi2770.com/blatt1/Entwurf/Okt18/cd/Document";
    private static final String ACTUAL_ROTATIONSPEED_WITH_WHICH_THE_MOTOR_OR_FEEDINGUNIT_IS_OPERATED = "Actual rotationspeed with which the motor or feedingunit is operated";
    private static final String AKTUELLE_DREHZAHL_MITWELCHER_DER_MOTOR_ODER_DIE_SPEISEINHEIT_BETRIEBEN_WIRD = "Aktuelle Drehzahl, mitwelcher der Motor oder die Speiseinheit betrieben wird";
    private static final String ACTUAL_ROTATION_SPEED = "ActualRotationSpeed";
    private static final String ACTUALROTATIONSPEED = "Actualrotationspeed";
    private static final String AKTUELLE_DREHZAHL = "AktuelleDrehzahl";
    private static final String _1_MIN = "1/min";
    private static final String HTTP_CUSTOMER_COM_CD_1_1_18EBD56F6B43D895 = "http://customer.com/cd/1/1/18EBD56F6B43D895";
    private static final String ROTATION_SPEED = "RotationSpeed";
    private static final String MAX_ROTATE_DEF_EN = "Greatestpermissiblerotationspeedwithwhichthemotororfeedingunitmaybeoperated";
    private static final String MAX_ROTATE_DEF_DE = "HöchstezulässigeDrehzahl,mitwelcherderMotoroderdieSpeiseinheitbetriebenwerdendarf";
    private static final String _0173_1_05_AAA650_002 = "0173-1#05-AAA650#002";
    private static final String MAX_ROTATIONSPEED = "Max.rotationspeed";
    private static final String MAX_DREHZAHL = "max.Drehzahl";
    private static final String _0173_1_02_BAA120_008 = "0173-1#02-BAA120#008";
    private static final String PROPERTY = "PROPERTY";
    private static final String MAX_ROTATION_SPEED = "MaxRotationSpeed";
    private static final String DIGITAL_FILE_DEFINITION = "A file representing the document version. In addition to the mandatory PDF file, other files can be specified."; //"Eine Datei, die die Document Version repräsentiert. Neben der obligatorischen PDF Datei können weitere Dateien angegeben werden.";
    private static final String DIGITALE_DATEI = "DigitaleDatei";
    private static final String WWW_VDI2770_COM_BLATT1_ENTWURF_OKT18_CD_STORED_DOCUMENT_REPRESENTATION_DIGITAL_FILE = "http://www.vdi2770.com/blatt1/Entwurf/Okt18/cd/StoredDocumentRepresentation/DigitalFile";
    private static final String DIGITAL_FILE = "DigitalFile";
    private static final String SPRACHABHÄNGIGER_TITELDES_DOKUMENTS = "SprachabhängigerTiteldesDokuments.";
    private static final String TITEL = "Titel";
    private static final String WWW_VDI2770_COM_BLATT1_ENTWURF_OKT18_CD_DESCRIPTION_TITLE = "http://www.vdi2770.com/blatt1/Entwurf/Okt18/cd/Description/Title";
    private static final String TITLE = "Title";
    private static final String SERVO_DC_MOTOR = "ServoDCMotor";
    private static final String FILE_MASTER_VERWALTUNGSSCHALE_DETAIL_PART1_PNG = "file:///master/verwaltungsschale-detail-part1.png";
    private static final String IMAGE_PNG = "image/png";
    private static final String THUMBNAIL = "thumbnail";
    private static final String HTTP_CUSTOMER_COM_SYSTEMS_IO_T_1 = "http://customer.com/Systems/IoT/1";
    private static final String QJ_YG_PGGJWKI_HK4_RR_QI_YS_LG = "QjYgPggjwkiHk4RrQiYSLg==";
    private static final String DEVICE_ID = "DeviceID";
    private static final String HTTP_CUSTOMER_COM_SYSTEMS_ERP_012 = "http://customer.com/Systems/ERP/012";
    private static final String _538FD1B3_F99F_4A52_9C75_72E9FA921270 = "538fd1b3-f99f-4a52-9c75-72e9fa921270";
    private static final String EQUIPMENT_ID = "EquipmentID";
    private static final String HTTP_CUSTOMER_COM_ASSETS_KHBVZJSQKIY = "http://customer.com/assets/KHBVZJSQKIY";
    // AAS
    public static final String AAS_ID = "ExampleMotor";
    public static final String AAS_IDENTIFIER = "http://customer.com/aas/9175_7013_7091_9168";

    // SUBMODEL_TECHNICAL_DATA
    public static final String SUBMODEL_TECHNICAL_DATA_PROPERTY_ID_SHORT = MAX_ROTATION_SPEED;
    public static final String SUBMODEL_TECHNICAL_DATA_ID_SHORT = "TechnicalData";
    public static final String SUBMODEL_TECHNICAL_DATA_ID = "http://i40.customer.com/type/1/1/7A7104BDAB57E184";
    public static final String SUBMODEL_TECHNICAL_DATA_SEMANTIC_ID = "0173-1#01-AFZ615#016";
    public static final String SUBMODEL_TECHNICAL_DATA_SEMANTIC_ID_PROPERTY = _0173_1_02_BAA120_008;
    public static final String SUBMODEL_TECHNICAL_DATA_PROPERTY_CATEGORY = "PARAMETER";
    public static final String SUBMODEL_TECHNICAL_DATA_PROPERTY_VALUE = "5000";
    public static final String SUBMODEL_TECHNICAL_DATA_PROPERTY_VALUETYPE = "integer";

    // SUBMODEL_DOCUMENTATION
    private static final String SUBMODEL_DOCUMENTATION_ID_SHORT = "Documentation";
    private static final String SUBMODEL_DOCUMENTATION_ID = "http://i40.customer.com/type/1/1/1A7B62B529F19152";
    private static final String SUBMODEL_DOCUMENTATION_ELEMENTCOLLECTION_SEMANTIC_ID = WWW_VDI2770_COM_BLATT1_ENTWURF_OKT18_CD_DOCUMENT;
    private static final String SUBMODEL_DOCUMENTATION_ELEMENTCOLLECTION_ID_SHORT = "OperatingManual";
    private static final String SUBMODEL_DOCUMENTATION_PROPERTY_SEMANTIC_ID = WWW_VDI2770_COM_BLATT1_ENTWURF_OKT18_CD_DESCRIPTION_TITLE;
    private static final String SUBMODEL_DOCUMENTATION_PROPERTY_ID_SHORT = TITLE;
    private static final String SUBMODEL_DOCUMENTATION_PROPERTY_VALUE = "OperatingManual";
    private static final String SUBMODEL_DOCUMENTATION_PROPERTY_VALUETYPE = "langString";
    private static final String SUBMODEL_DOCUMENTATION_FILE_SEMANTIC_ID = WWW_VDI2770_COM_BLATT1_ENTWURF_OKT18_CD_STORED_DOCUMENT_REPRESENTATION_DIGITAL_FILE;
    private static final String SUBMODEL_DOCUMENTATION_FILE_ID_SHORT = "DigitalFile_PDF";
    private static final String SUBMODEL_DOCUMENTATION_FILE_contentType = "application/pdf";
    private static final String SUBMODEL_DOCUMENTATION_FILE_VALUE = "file:///aasx/OperatingManual.pdf";

    // SUBMODEL_OPERATIONAL_DATA
    private static final String SUBMODEL_OPERATIONAL_DATA_ID_SHORT = "OperationalData";
    private static final String SUBMODEL_OPERATIONAL_DATA_ID = "http://i40.customer.com/instance/1/1/AC69B1CB44F07935";
    private static final String SUBMODEL_OPERATIONAL_DATA_SEMANTIC_ID_PROPERTY = HTTP_CUSTOMER_COM_CD_1_1_18EBD56F6B43D895;
    private static final String SUBMODEL_OPERATIONAL_DATA_PROPERTY_ID_SHORT = ROTATION_SPEED;
    private static final String SUBMODEL_OPERATIONAL_DATA_PROPERTY_CATEGORY = "VARIABLE";
    private static final String SUBMODEL_OPERATIONAL_DATA_PROPERTY_VALUE = "4370";
    private static final String SUBMODEL_OPERATIONAL_DATA_PROPERTY_VALUETYPE = "integer";
    public static final String AAS_3_0_RC_02_DATA_SPECIFICATION_IEC_61360 = "https://admin-shell.io/aas/3/0/RC02/DataSpecificationIec61360";

    public AASSimple() {
    }

    public static final AssetAdministrationShell AAS = createAAS();
    public static final Submodel SUBMODEL_TECHNICAL_DATA = createSubmodelTechnicalData();
    public static final Submodel SUBMODEL_OPERATIONAL_DATA = createSubmodelOperationalData();
    public static final Submodel SUBMODEL_DOCUMENTATION = createSubmodelDocumentation();
    public static final ConceptDescription CONCEPT_DESCRIPTION_TITLE = createConceptDescriptionTitle();
    public static final ConceptDescription CONCEPT_DESCRIPTION_DIGITALFILE = createConceptDescriptionDigitalFile();
    public static final ConceptDescription CONCEPT_DESCRIPTION_MAXROTATIONSPEED = createConceptDescriptionMaxRotationSpeed();
    public static final ConceptDescription CONCEPT_DESCRIPTION_ROTATIONSPEED = createConceptDescriptionRotationSpeed();
    public static final ConceptDescription CONCEPT_DESCRIPTION_DOCUMENT = createConceptDescriptionDocument();
    public static final Environment ENVIRONMENT = createEnvironment();

    public static AssetAdministrationShell createAAS() {
        return new DefaultAssetAdministrationShell.Builder()
                .idShort(AAS_ID)
                .id(AAS_IDENTIFIER)
                .assetInformation(new DefaultAssetInformation.Builder()
                        .assetKind(AssetKind.INSTANCE)
                        .globalAssetId(HTTP_CUSTOMER_COM_ASSETS_KHBVZJSQKIY)
                        .specificAssetIds(new DefaultSpecificAssetId.Builder()
                                .name(EQUIPMENT_ID)
                                .value(_538FD1B3_F99F_4A52_9C75_72E9FA921270)
                                .externalSubjectId(new DefaultReference.Builder()
                                        .keys(Arrays.asList(new DefaultKey.Builder()
                                                .type(KeyTypes.GLOBAL_REFERENCE)
                                                .value(HTTP_CUSTOMER_COM_SYSTEMS_ERP_012)
                                                .build()))
                                        .type(ReferenceTypes.EXTERNAL_REFERENCE)
                                        .build())
                                .build())
                        .specificAssetIds(new DefaultSpecificAssetId.Builder()
                                .name(DEVICE_ID)
                                .value(QJ_YG_PGGJWKI_HK4_RR_QI_YS_LG)
                                .externalSubjectId(new DefaultReference.Builder()
                                        .keys(new DefaultKey.Builder()
                                                .type(KeyTypes.GLOBAL_REFERENCE)
                                                .value(HTTP_CUSTOMER_COM_SYSTEMS_IO_T_1)
                                                .build())
                                        .type(ReferenceTypes.EXTERNAL_REFERENCE)
                                        .build())
                                .build())
                        .defaultThumbnail(new DefaultResource.Builder()
                                .contentType(IMAGE_PNG)
                                .path(FILE_MASTER_VERWALTUNGSSCHALE_DETAIL_PART1_PNG)
                                .build())
                        .build())
                .submodels(new DefaultReference.Builder()
                        .keys(new DefaultKey.Builder()
                                .type(KeyTypes.SUBMODEL)
                                .value(SUBMODEL_TECHNICAL_DATA_ID)
                                .build())
                        .type(ReferenceTypes.EXTERNAL_REFERENCE)
                        .build())
                .submodels(
                        new DefaultReference.Builder()
                                .keys(new DefaultKey.Builder()
                                        .type(KeyTypes.SUBMODEL)
                                        .value(SUBMODEL_OPERATIONAL_DATA_ID)
                                        .build())
                                .type(ReferenceTypes.EXTERNAL_REFERENCE)
                                .build())
                .submodels(
                        new DefaultReference.Builder()
                                .keys(new DefaultKey.Builder()
                                        .type(KeyTypes.SUBMODEL)
                                        .value(SUBMODEL_DOCUMENTATION_ID)
                                        .build())
                                .type(ReferenceTypes.EXTERNAL_REFERENCE)
                                .build())
                .build();
    }


    public static Submodel createSubmodelTechnicalData() {
        return new DefaultSubmodel.Builder()
                .semanticId(new DefaultReference.Builder()
                        .keys(new DefaultKey.Builder()
                                .type(KeyTypes.GLOBAL_REFERENCE)
                                .value(SUBMODEL_TECHNICAL_DATA_SEMANTIC_ID)
                                .build())
                        .type(ReferenceTypes.EXTERNAL_REFERENCE)
                        .build())
                .kind(ModellingKind.INSTANCE)
                .idShort(SUBMODEL_TECHNICAL_DATA_ID_SHORT)
                .id(SUBMODEL_TECHNICAL_DATA_ID)
                .submodelElements(new DefaultProperty.Builder()
                        .semanticId(new DefaultReference.Builder()
                                .keys(new DefaultKey.Builder()
                                        .type(KeyTypes.CONCEPT_DESCRIPTION)
                                        .value(SUBMODEL_TECHNICAL_DATA_SEMANTIC_ID_PROPERTY)
                                        .build())
                                .type(ReferenceTypes.EXTERNAL_REFERENCE)
                                .build())
                        .idShort(SUBMODEL_TECHNICAL_DATA_PROPERTY_ID_SHORT)
                        .category(SUBMODEL_TECHNICAL_DATA_PROPERTY_CATEGORY)
                        .value(SUBMODEL_TECHNICAL_DATA_PROPERTY_VALUE)
                        .valueType(DataTypeDefXsd.INTEGER)
                        .build())
                .build();
    }

    public static Submodel createSubmodelOperationalData() {
        return new DefaultSubmodel.Builder()
                .kind(ModellingKind.INSTANCE)
                .idShort(SUBMODEL_OPERATIONAL_DATA_ID_SHORT)
                .id(SUBMODEL_OPERATIONAL_DATA_ID)
                .submodelElements(new DefaultProperty.Builder()
                        .semanticId(new DefaultReference.Builder()
                                .keys(new DefaultKey.Builder()
                                        .type(KeyTypes.CONCEPT_DESCRIPTION)
                                        .value(SUBMODEL_OPERATIONAL_DATA_SEMANTIC_ID_PROPERTY)
                                        .build())
                                .type(ReferenceTypes.EXTERNAL_REFERENCE)
                                .build())
                        .idShort(SUBMODEL_OPERATIONAL_DATA_PROPERTY_ID_SHORT)
                        .category(SUBMODEL_OPERATIONAL_DATA_PROPERTY_CATEGORY)
                        .value(SUBMODEL_OPERATIONAL_DATA_PROPERTY_VALUE)
                        .valueType(DataTypeDefXsd.INTEGER)
                        .build())
                .build();
    }

    public static Submodel createSubmodelDocumentation() {
        return new DefaultSubmodel.Builder()
                .kind(ModellingKind.INSTANCE)
                .idShort(SUBMODEL_DOCUMENTATION_ID_SHORT)
                .id(SUBMODEL_DOCUMENTATION_ID)
                .submodelElements(new DefaultSubmodelElementCollection.Builder()
                        .semanticId(new DefaultReference.Builder()
                                .keys(new DefaultKey.Builder()
                                        .type(KeyTypes.CONCEPT_DESCRIPTION)
                                        .value(SUBMODEL_DOCUMENTATION_ELEMENTCOLLECTION_SEMANTIC_ID)
                                        .build())
                                .type(ReferenceTypes.EXTERNAL_REFERENCE)
                                .build())
                        .idShort(SUBMODEL_DOCUMENTATION_ELEMENTCOLLECTION_ID_SHORT)
                        .value(new DefaultProperty.Builder()
                                .semanticId(new DefaultReference.Builder()
                                        .keys(new DefaultKey.Builder()
                                                .type(KeyTypes.CONCEPT_DESCRIPTION)
                                                .value(SUBMODEL_DOCUMENTATION_PROPERTY_SEMANTIC_ID)
                                                .build())
                                        .type(ReferenceTypes.EXTERNAL_REFERENCE)
                                        .build())
                                .idShort(SUBMODEL_DOCUMENTATION_PROPERTY_ID_SHORT)
                                .value(SUBMODEL_DOCUMENTATION_PROPERTY_VALUE)
                                .valueType(DataTypeDefXsd.STRING)
                                .build())
                        .value(new DefaultFile.Builder()
                                .semanticId(new DefaultReference.Builder()
                                        .keys(new DefaultKey.Builder()
                                                .type(KeyTypes.CONCEPT_DESCRIPTION)
                                                .value(SUBMODEL_DOCUMENTATION_FILE_SEMANTIC_ID)
                                                .build())
                                        .type(ReferenceTypes.EXTERNAL_REFERENCE)
                                        .build())
                                .idShort(SUBMODEL_DOCUMENTATION_FILE_ID_SHORT)
                                .contentType(SUBMODEL_DOCUMENTATION_FILE_contentType)
                                .value(SUBMODEL_DOCUMENTATION_FILE_VALUE)
                                .build())
                        //.ordered(false)
                        //.allowDuplicates(false)
                        .build())
                .build();
    }

    public static ConceptDescription createConceptDescriptionTitle() {
        return new DefaultConceptDescription.Builder()
                .idShort(TITLE)
                .id(WWW_VDI2770_COM_BLATT1_ENTWURF_OKT18_CD_DESCRIPTION_TITLE)
                .embeddedDataSpecifications(new DefaultEmbeddedDataSpecification.Builder()
                        .dataSpecification(new DefaultReference.Builder()
                                .keys(new DefaultKey.Builder()
                                        .type(KeyTypes.GLOBAL_REFERENCE)
                                        .value(AAS_3_0_RC_02_DATA_SPECIFICATION_IEC_61360)
                                        .build())
                                .type(ReferenceTypes.EXTERNAL_REFERENCE)
                                .build())
                        .dataSpecificationContent(new DefaultDataSpecificationIec61360.Builder()
                                .preferredName(new DefaultLangStringPreferredNameTypeIec61360.Builder().text(TITLE).language("EN").build())
                                .preferredName(new DefaultLangStringPreferredNameTypeIec61360.Builder().text(TITEL).language("DE").build())
                                .shortName(new DefaultLangStringShortNameTypeIec61360.Builder().text(TITLE).language("EN").build())
                                .shortName(new DefaultLangStringShortNameTypeIec61360.Builder().text(TITEL).language("DE").build())
                                .unit("ExampleString")
                                .sourceOfDefinition("ExampleString")
                                .dataType(DataTypeIec61360.STRING_TRANSLATABLE)
                                .definition(new DefaultLangStringDefinitionTypeIec61360.Builder().text(SPRACHABHÄNGIGER_TITELDES_DOKUMENTS).language("EN").build())
                                .build())
                        .build())
                .build();
    }

    public static ConceptDescription createConceptDescriptionDigitalFile() {
        return new DefaultConceptDescription.Builder()
                .idShort(DIGITAL_FILE)
                .id(WWW_VDI2770_COM_BLATT1_ENTWURF_OKT18_CD_STORED_DOCUMENT_REPRESENTATION_DIGITAL_FILE)
                .embeddedDataSpecifications(new DefaultEmbeddedDataSpecification.Builder()
                        .dataSpecification(new DefaultReference.Builder()
                                .keys(new DefaultKey.Builder()
                                        .type(KeyTypes.GLOBAL_REFERENCE)
                                        .value(AAS_3_0_RC_02_DATA_SPECIFICATION_IEC_61360)
                                        .build())
                                .type(ReferenceTypes.EXTERNAL_REFERENCE)
                                .build())
                        .dataSpecificationContent(
                                new DefaultDataSpecificationIec61360.Builder()
                                        .preferredName(new DefaultLangStringPreferredNameTypeIec61360.Builder().text(DIGITAL_FILE).language("EN").build())
                                        .preferredName(new DefaultLangStringPreferredNameTypeIec61360.Builder().text(DIGITAL_FILE).language("EN").build())
                                        .shortName(new DefaultLangStringShortNameTypeIec61360.Builder().text(DIGITAL_FILE).language("EN").build())
                                        .shortName(new DefaultLangStringShortNameTypeIec61360.Builder().text(DIGITALE_DATEI).language("DE").build())
                                        .unit("ExampleString")
                                        .sourceOfDefinition("ExampleString")
                                        .dataType(DataTypeIec61360.STRING)
                                        .definition(new DefaultLangStringDefinitionTypeIec61360.Builder().text(DIGITAL_FILE_DEFINITION).language("EN").build())
                                        .build())
                        .build())
                .build();
    }

    public static ConceptDescription createConceptDescriptionMaxRotationSpeed() {
        return new DefaultConceptDescription.Builder()
                .idShort(MAX_ROTATION_SPEED).category(PROPERTY)
                .administration(new DefaultAdministrativeInformation.Builder()
                        .version("2")
                        .revision("1")
                        .build())
                .id(_0173_1_02_BAA120_008)
                .embeddedDataSpecifications(
                        new DefaultEmbeddedDataSpecification.Builder()
                                .dataSpecification(new DefaultReference.Builder()
                                        .keys(new DefaultKey.Builder()
                                                .type(KeyTypes.GLOBAL_REFERENCE)
                                                .value(AAS_3_0_RC_02_DATA_SPECIFICATION_IEC_61360)
                                                .build())
                                        .type(ReferenceTypes.EXTERNAL_REFERENCE)
                                        .build())
                                .dataSpecificationContent(new DefaultDataSpecificationIec61360.Builder()
                                        .preferredName(new DefaultLangStringPreferredNameTypeIec61360.Builder().text(MAX_DREHZAHL).language("de").build())
                                        .preferredName(new DefaultLangStringPreferredNameTypeIec61360.Builder().text(MAX_ROTATIONSPEED).language("en").build())
                                        .unit(_1_MIN)
                                        .unitId(new DefaultReference.Builder()
                                                .keys(new DefaultKey.Builder()
                                                        .type(KeyTypes.GLOBAL_REFERENCE)
                                                        .value(_0173_1_05_AAA650_002)
                                                        .build())
                                                .type(ReferenceTypes.EXTERNAL_REFERENCE)
                                                .build())
                                        .sourceOfDefinition("ExampleString")
                                        .dataType(DataTypeIec61360.REAL_MEASURE)
                                        .definition(new DefaultLangStringDefinitionTypeIec61360.Builder().text(MAX_ROTATE_DEF_DE).language("de").build())
                                        .definition(new DefaultLangStringDefinitionTypeIec61360.Builder().text(MAX_ROTATE_DEF_EN).language("EN").build())
                                        .build())
                                .build())
                .build();
    }

    public static ConceptDescription createConceptDescriptionRotationSpeed() {
        return new DefaultConceptDescription.Builder()
                .idShort(ROTATION_SPEED)
                .category(PROPERTY)
                .id(HTTP_CUSTOMER_COM_CD_1_1_18EBD56F6B43D895)
                .embeddedDataSpecifications(
                        new DefaultEmbeddedDataSpecification.Builder()
                                .dataSpecification(new DefaultReference.Builder()
                                        .keys(new DefaultKey.Builder()
                                                .type(KeyTypes.GLOBAL_REFERENCE)
                                                .value(AAS_3_0_RC_02_DATA_SPECIFICATION_IEC_61360)
                                                .build())
                                        .type(ReferenceTypes.EXTERNAL_REFERENCE)
                                        .build())
                                .dataSpecificationContent(
                                        new DefaultDataSpecificationIec61360.Builder()
                                                .preferredName(new DefaultLangStringPreferredNameTypeIec61360.Builder().text(AKTUELLE_DREHZAHL).language("DE").build())
                                                .preferredName(new DefaultLangStringPreferredNameTypeIec61360.Builder().text(ACTUALROTATIONSPEED).language("EN").build())
                                                .shortName(new DefaultLangStringShortNameTypeIec61360.Builder().text(AKTUELLE_DREHZAHL).language("DE").build())
                                                .shortName(new DefaultLangStringShortNameTypeIec61360.Builder().text(ACTUAL_ROTATION_SPEED).language("EN").build())
                                                .unit(_1_MIN)
                                                .unitId(new DefaultReference.Builder()
                                                        .keys(new DefaultKey.Builder()
                                                                .type(KeyTypes.GLOBAL_REFERENCE)
                                                                .value(_0173_1_05_AAA650_002)
                                                                .build())
                                                        .type(ReferenceTypes.EXTERNAL_REFERENCE)
                                                        .build())
                                                .sourceOfDefinition("ExampleString")
                                                .dataType(DataTypeIec61360.REAL_MEASURE)
                                                .definition(new DefaultLangStringDefinitionTypeIec61360.Builder().text(AKTUELLE_DREHZAHL_MITWELCHER_DER_MOTOR_ODER_DIE_SPEISEINHEIT_BETRIEBEN_WIRD).language("DE").build())
                                                .definition(new DefaultLangStringDefinitionTypeIec61360.Builder().text(ACTUAL_ROTATIONSPEED_WITH_WHICH_THE_MOTOR_OR_FEEDINGUNIT_IS_OPERATED).language("EN").build())
                                                .build())
                                .build())
                .build();
    }

    public static ConceptDescription createConceptDescriptionDocument() {
        return new DefaultConceptDescription.Builder()
                .idShort(DOCUMENT)
                .id(WWW_VDI2770_COM_BLATT1_ENTWURF_OKT18_CD_DOCUMENT)
                .embeddedDataSpecifications(new DefaultEmbeddedDataSpecification.Builder()
                        .dataSpecification(new DefaultReference.Builder()
                                .keys(new DefaultKey.Builder()
                                        .type(KeyTypes.GLOBAL_REFERENCE)
                                        .value(AAS_3_0_RC_02_DATA_SPECIFICATION_IEC_61360)
                                        .build())
                                .type(ReferenceTypes.EXTERNAL_REFERENCE)
                                .build())
                        .dataSpecificationContent(new DefaultDataSpecificationIec61360.Builder()
                                .preferredName(new DefaultLangStringPreferredNameTypeIec61360.Builder().text(DOCUMENT).language("EN").build())
                                .shortName(new DefaultLangStringShortNameTypeIec61360.Builder().text(DOCUMENT).language("EN").build())
                                .shortName(new DefaultLangStringShortNameTypeIec61360.Builder().text(DOKUMENT).language("DE").build())
                                .unit("ExampleString")
                                .sourceOfDefinition(ISO15519_1_2010)
                                .dataType(DataTypeIec61360.STRING)
                                .definition(new DefaultLangStringDefinitionTypeIec61360.Builder().text(DOCUMENT_DEF).language("EN").build())
                                .build())
                        .build())
                .build();
    }

    public static Environment createEnvironment() {
        return new DefaultEnvironment.Builder()
                .assetAdministrationShells(createAAS())
                .submodels(createSubmodelTechnicalData())
                .submodels(createSubmodelDocumentation())
                .submodels(createSubmodelOperationalData())
                .conceptDescriptions(createConceptDescriptionTitle())
                .conceptDescriptions(createConceptDescriptionDigitalFile())
                .conceptDescriptions(createConceptDescriptionMaxRotationSpeed())
                .conceptDescriptions(createConceptDescriptionRotationSpeed())
                .conceptDescriptions(createConceptDescriptionDocument())
                .build();
    }
}
