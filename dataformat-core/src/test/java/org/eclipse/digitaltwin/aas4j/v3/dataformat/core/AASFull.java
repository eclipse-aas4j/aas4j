/*
 * Copyright (c) 2021 Fraunhofer-Gesellschaft zur Foerderung der angewandten Forschung e. V.
 * Copyright (C) 2023 SAP SE or an SAP affiliate company. All rights reserved.
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

import java.util.Arrays;
import java.util.Base64;
import org.eclipse.digitaltwin.aas4j.v3.model.AasSubmodelElements;
import org.eclipse.digitaltwin.aas4j.v3.model.AssetAdministrationShell;
import org.eclipse.digitaltwin.aas4j.v3.model.AssetKind;
import org.eclipse.digitaltwin.aas4j.v3.model.ConceptDescription;
import org.eclipse.digitaltwin.aas4j.v3.model.DataTypeDefXsd;
import org.eclipse.digitaltwin.aas4j.v3.model.DataTypeIec61360;
import org.eclipse.digitaltwin.aas4j.v3.model.Direction;
import org.eclipse.digitaltwin.aas4j.v3.model.EntityType;
import org.eclipse.digitaltwin.aas4j.v3.model.Environment;
import org.eclipse.digitaltwin.aas4j.v3.model.KeyTypes;
import org.eclipse.digitaltwin.aas4j.v3.model.ModellingKind;
import org.eclipse.digitaltwin.aas4j.v3.model.ReferenceTypes;
import org.eclipse.digitaltwin.aas4j.v3.model.StateOfEvent;
import org.eclipse.digitaltwin.aas4j.v3.model.Submodel;
import org.eclipse.digitaltwin.aas4j.v3.model.impl.DefaultAdministrativeInformation;
import org.eclipse.digitaltwin.aas4j.v3.model.impl.DefaultAnnotatedRelationshipElement;
import org.eclipse.digitaltwin.aas4j.v3.model.impl.DefaultAssetAdministrationShell;
import org.eclipse.digitaltwin.aas4j.v3.model.impl.DefaultAssetInformation;
import org.eclipse.digitaltwin.aas4j.v3.model.impl.DefaultBasicEventElement;
import org.eclipse.digitaltwin.aas4j.v3.model.impl.DefaultBlob;
import org.eclipse.digitaltwin.aas4j.v3.model.impl.DefaultCapability;
import org.eclipse.digitaltwin.aas4j.v3.model.impl.DefaultConceptDescription;
import org.eclipse.digitaltwin.aas4j.v3.model.impl.DefaultDataSpecificationIec61360;
import org.eclipse.digitaltwin.aas4j.v3.model.impl.DefaultEmbeddedDataSpecification;
import org.eclipse.digitaltwin.aas4j.v3.model.impl.DefaultEntity;
import org.eclipse.digitaltwin.aas4j.v3.model.impl.DefaultEnvironment;
import org.eclipse.digitaltwin.aas4j.v3.model.impl.DefaultFile;
import org.eclipse.digitaltwin.aas4j.v3.model.impl.DefaultKey;
import org.eclipse.digitaltwin.aas4j.v3.model.impl.DefaultLangStringDefinitionTypeIec61360;
import org.eclipse.digitaltwin.aas4j.v3.model.impl.DefaultLangStringNameType;
import org.eclipse.digitaltwin.aas4j.v3.model.impl.DefaultLangStringPreferredNameTypeIec61360;
import org.eclipse.digitaltwin.aas4j.v3.model.impl.DefaultLangStringShortNameTypeIec61360;
import org.eclipse.digitaltwin.aas4j.v3.model.impl.DefaultLangStringTextType;
import org.eclipse.digitaltwin.aas4j.v3.model.impl.DefaultLevelType;
import org.eclipse.digitaltwin.aas4j.v3.model.impl.DefaultMultiLanguageProperty;
import org.eclipse.digitaltwin.aas4j.v3.model.impl.DefaultOperation;
import org.eclipse.digitaltwin.aas4j.v3.model.impl.DefaultOperationVariable;
import org.eclipse.digitaltwin.aas4j.v3.model.impl.DefaultProperty;
import org.eclipse.digitaltwin.aas4j.v3.model.impl.DefaultQualifier;
import org.eclipse.digitaltwin.aas4j.v3.model.impl.DefaultRange;
import org.eclipse.digitaltwin.aas4j.v3.model.impl.DefaultReference;
import org.eclipse.digitaltwin.aas4j.v3.model.impl.DefaultReferenceElement;
import org.eclipse.digitaltwin.aas4j.v3.model.impl.DefaultRelationshipElement;
import org.eclipse.digitaltwin.aas4j.v3.model.impl.DefaultSubmodel;
import org.eclipse.digitaltwin.aas4j.v3.model.impl.DefaultSubmodelElementCollection;
import org.eclipse.digitaltwin.aas4j.v3.model.impl.DefaultSubmodelElementList;
import org.eclipse.digitaltwin.aas4j.v3.model.impl.DefaultValueList;
import org.eclipse.digitaltwin.aas4j.v3.model.impl.DefaultValueReferencePair;

public class AASFull {

  public static final AssetAdministrationShell AAS_1 = createAAS1();
  public static final AssetAdministrationShell AAS_2 = createAAS2();
  public static final AssetAdministrationShell AAS_3 = createAAS3();
  public static final AssetAdministrationShell AAS_4 = createAAS4();
  public static final Submodel SUBMODEL_1 = createSubmodel1();
  public static final Submodel SUBMODEL_2 = createSubmodel2();
  public static final Submodel SUBMODEL_3 = createSubmodel3();
  public static final Submodel SUBMODEL_4 = createSubmodel4();
  public static final Submodel SUBMODEL_5 = createSubmodel5();
  public static final Submodel SUBMODEL_6 = createSubmodel6();
  public static final Submodel SUBMODEL_7 = createSubmodel7();
  public static final ConceptDescription CONCEPT_DESCRIPTION_1 = createConceptDescription1();
  public static final ConceptDescription CONCEPT_DESCRIPTION_2 = createConceptDescription2();
  public static final ConceptDescription CONCEPT_DESCRIPTION_3 = createConceptDescription3();
  public static final ConceptDescription CONCEPT_DESCRIPTION_4 = createConceptDescription4();
  public static final Environment ENVIRONMENT = createEnvironment();
  public static final String AAS_3_0_RC_02_DATA_SPECIFICATION_IEC_61360 =
      "https://admin-shell.io/aas/3/0/RC02/DataSpecificationIec61360";

  public static AssetAdministrationShell createAAS1() {
    return new DefaultAssetAdministrationShell.Builder()
        .idShort("TestAssetAdministrationShell")
        .description(
            Arrays.asList(
                new DefaultLangStringTextType.Builder()
                    .text("An Example Asset Administration Shell for the test application")
                    .language("en-us")
                    .build(),
                new DefaultLangStringTextType.Builder()
                    .text("Ein Beispiel-Verwaltungsschale für eine Test-Anwendung")
                    .language("de")
                    .build()))
        .id("https://acplt.org/Test_AssetAdministrationShell")
        .administration(
            new DefaultAdministrativeInformation.Builder().version("0").revision("9").build())
        .derivedFrom(
            new DefaultReference.Builder()
                .keys(
                    new DefaultKey.Builder()
                        .type(KeyTypes.ASSET_ADMINISTRATION_SHELL)
                        .value("https://acplt.org/TestAssetAdministrationShell2")
                        .build())
                .type(ReferenceTypes.EXTERNAL_REFERENCE)
                .build())
        .assetInformation(
            new DefaultAssetInformation.Builder()
                .assetKind(AssetKind.INSTANCE)
                .globalAssetId("https://acplt.org/Test_Asset")
                // .billOfMaterial((new DefaultReference.Builder()
                //        .keys(new DefaultKey.Builder()
                //                .type(KeyTypes.SUBMODEL)
                //
                // .value("http://acplt.org/Submodels/Assets/TestAsset/BillOfMaterial")
                //                .build()))
                //        .build())
                .build())
        .submodels(
            new DefaultReference.Builder()
                .keys(
                    new DefaultKey.Builder()
                        .type(KeyTypes.SUBMODEL)
                        .value("https://acplt.org/Test_Submodel")
                        .build())
                .type(ReferenceTypes.EXTERNAL_REFERENCE)
                .build())
        .submodels(
            new DefaultReference.Builder()
                .keys(
                    new DefaultKey.Builder()
                        .type(KeyTypes.SUBMODEL)
                        .value("http://acplt.org/Submodels/Assets/TestAsset/BillOfMaterial")
                        .build())
                .type(ReferenceTypes.EXTERNAL_REFERENCE)
                .build())
        .submodels(
            new DefaultReference.Builder()
                .keys(
                    new DefaultKey.Builder()
                        .type(KeyTypes.SUBMODEL)
                        .value("http://acplt.org/Submodels/Assets/TestAsset/Identification")
                        .build())
                .type(ReferenceTypes.EXTERNAL_REFERENCE)
                .build())
        .build();
  }

  public static AssetAdministrationShell createAAS2() {
    return new DefaultAssetAdministrationShell.Builder()
        .idShort("Test_AssetAdministrationShell_Mandatory")
        .id("https://acplt.org/Test_AssetAdministrationShell_Mandatory")
        .assetInformation(
            new DefaultAssetInformation.Builder()
                .assetKind(AssetKind.INSTANCE)
                .globalAssetId("https://acplt.org/Test_Asset_Mandatory")
                .build())
        .submodels(
            new DefaultReference.Builder()
                .keys(
                    new DefaultKey.Builder()
                        .type(KeyTypes.SUBMODEL)
                        .value("https://acplt.org/Test_Submodel_Mandatory")
                        .build())
                .type(ReferenceTypes.EXTERNAL_REFERENCE)
                .build())
        .submodels(
            new DefaultReference.Builder()
                .keys(
                    new DefaultKey.Builder()
                        .type(KeyTypes.SUBMODEL)
                        .value("https://acplt.org/Test_Submodel2_Mandatory")
                        .build())
                .type(ReferenceTypes.EXTERNAL_REFERENCE)
                .build())
        .build();
  }

  public static AssetAdministrationShell createAAS3() {
    return new DefaultAssetAdministrationShell.Builder()
        .idShort("Test_AssetAdministrationShell2_Mandatory")
        .id("https://acplt.org/Test_AssetAdministrationShell2_Mandatory")
        .assetInformation(
            new DefaultAssetInformation.Builder()
                .assetKind(AssetKind.INSTANCE)
                .globalAssetId("https://acplt.org/Test_Asset_Mandatory")
                .build())
        .build();
  }

  public static AssetAdministrationShell createAAS4() {
    return new DefaultAssetAdministrationShell.Builder()
        .idShort("TestAssetAdministrationShell")
        .description(
            Arrays.asList(
                new DefaultLangStringTextType.Builder()
                    .text("An Example Asset Administration Shell for the test application")
                    .language("en-us")
                    .build(),
                new DefaultLangStringTextType.Builder()
                    .text("Ein Beispiel-Verwaltungsschale für eine Test-Anwendung")
                    .language("de")
                    .build()))
        .id("https://acplt.org/Test_AssetAdministrationShell_Missing")
        .administration(
            new DefaultAdministrativeInformation.Builder().version("0").revision("9").build())
        .assetInformation(
            new DefaultAssetInformation.Builder()
                .assetKind(AssetKind.INSTANCE)
                .globalAssetId("https://acplt.org/Test_Asset_Missing")
                .build())
        .submodels(
            new DefaultReference.Builder()
                .keys(
                    new DefaultKey.Builder()
                        .type(KeyTypes.SUBMODEL)
                        .value("https://acplt.org/Test_Submodel_Missing")
                        .build())
                .type(ReferenceTypes.EXTERNAL_REFERENCE)
                .build())
        .build();
  }

  public static Submodel createSubmodel1() {
    return new DefaultSubmodel.Builder()
        .idShort("Identification")
        .description(
            Arrays.asList(
                new DefaultLangStringTextType.Builder()
                    .text("An example asset identification submodel for the test application")
                    .language("en-us")
                    .build(),
                new DefaultLangStringTextType.Builder()
                    .text("Ein Beispiel-Identifikations-Submodel für eine Test-Anwendung")
                    .language("de")
                    .build()))
        .id("http://acplt.org/Submodels/Assets/TestAsset/Identification")
        .administration(
            new DefaultAdministrativeInformation.Builder().version("0").revision("9").build())
        .kind(ModellingKind.INSTANCE)
        .semanticId(
            new DefaultReference.Builder()
                .keys(
                    new DefaultKey.Builder()
                        .type(KeyTypes.SUBMODEL)
                        .value("http://acplt.org/SubmodelTemplates/AssetIdentification")
                        .build())
                .type(ReferenceTypes.EXTERNAL_REFERENCE)
                .build())
        .submodelElements(
            new DefaultProperty.Builder()
                .idShort("ManufacturerName")
                .displayName(
                    new DefaultLangStringNameType.Builder()
                        .language("en-us")
                        .text("Manufacturer Name")
                        .build())
                .description(
                    Arrays.asList(
                        new DefaultLangStringTextType.Builder()
                            .text(
                                "Legally valid designation of the natural or judicial person which is directly responsible for the design, production, packaging and labeling of a product in respect to its being brought into circulation.")
                            .language("en-us")
                            .build(),
                        new DefaultLangStringTextType.Builder()
                            .text(
                                "Bezeichnung für eine natürliche oder juristische Person, die für die Auslegung, Herstellung und Verpackung sowie die Etikettierung eines Produkts im Hinblick auf das 'Inverkehrbringen' im eigenen Namen verantwortlich ist")
                            .language("de")
                            .build()))
                .semanticId(
                    new DefaultReference.Builder()
                        .keys(
                            new DefaultKey.Builder()
                                .type(KeyTypes.GLOBAL_REFERENCE)
                                .value("0173-1#02-AAO677#002")
                                .build())
                        .type(ReferenceTypes.EXTERNAL_REFERENCE)
                        .build())
                .qualifiers(
                    new DefaultQualifier.Builder()
                        .value("100")
                        .type("http://acplt.org/Qualifier/ExampleQualifier")
                        .valueType(DataTypeDefXsd.INT)
                        .build())
                .qualifiers(
                    new DefaultQualifier.Builder()
                        .value("50")
                        .type("http://acplt.org/Qualifier/ExampleQualifier2")
                        .valueType(DataTypeDefXsd.INT)
                        .build())
                .value("http://acplt.org/ValueId/ACPLT")
                .valueType(DataTypeDefXsd.STRING)
                .valueId(
                    new DefaultReference.Builder()
                        .keys(
                            new DefaultKey.Builder()
                                .type(KeyTypes.GLOBAL_REFERENCE)
                                .value("http://acplt.org/ValueId/ACPLT")
                                .build())
                        .type(ReferenceTypes.EXTERNAL_REFERENCE)
                        .build())
                .build())
        .submodelElements(
            new DefaultProperty.Builder()
                .category("VARIABLE")
                .idShort("InstanceId")
                .description(
                    Arrays.asList(
                        new DefaultLangStringTextType.Builder()
                            .text(
                                "Legally valid designation of the natural or judicial person which is directly responsible for the design, production, packaging and labeling of a product in respect to its being brought into circulation.")
                            .language("en-us")
                            .build(),
                        new DefaultLangStringTextType.Builder()
                            .text(
                                "Bezeichnung für eine natürliche oder juristische Person, die für die Auslegung, Herstellung und Verpackung sowie die Etikettierung eines Produkts im Hinblick auf das 'Inverkehrbringen' im eigenen Namen verantwortlich ist")
                            .language("de")
                            .build()))
                .semanticId(
                    new DefaultReference.Builder()
                        .keys(
                            new DefaultKey.Builder()
                                .type(KeyTypes.GLOBAL_REFERENCE)
                                .value("http://opcfoundation.org/UA/DI/1.1/DeviceType/Serialnumber")
                                .build())
                        .type(ReferenceTypes.EXTERNAL_REFERENCE)
                        .build())
                .supplementalSemanticIds(
                    new DefaultReference.Builder()
                        .type(ReferenceTypes.EXTERNAL_REFERENCE)
                        .keys(
                            new DefaultKey.Builder()
                                .type(KeyTypes.GLOBAL_REFERENCE)
                                .value("something_random_e14ad770")
                                .build())
                        .build())
                .supplementalSemanticIds(
                    new DefaultReference.Builder()
                        .type(ReferenceTypes.EXTERNAL_REFERENCE)
                        .keys(
                            new DefaultKey.Builder()
                                .type(KeyTypes.GLOBAL_REFERENCE)
                                .value("something_random_bd061acd")
                                .build())
                        .build())
                .value("978-8234-234-342")
                .valueType(DataTypeDefXsd.STRING)
                .valueId(
                    new DefaultReference.Builder()
                        .keys(
                            new DefaultKey.Builder()
                                .type(KeyTypes.GLOBAL_REFERENCE)
                                .value("978-8234-234-342")
                                .build())
                        .type(ReferenceTypes.EXTERNAL_REFERENCE)
                        .build())
                .build())
        .build();
  }

  public static Submodel createSubmodel2() {
    return new DefaultSubmodel.Builder()
        .idShort("BillOfMaterial")
        .description(
            Arrays.asList(
                new DefaultLangStringTextType.Builder()
                    .text("An example bill of material submodel for the test application")
                    .language("en-us")
                    .build(),
                new DefaultLangStringTextType.Builder()
                    .text("Ein Beispiel-BillofMaterial-Submodel für eine Test-Anwendung")
                    .language("de")
                    .build()))
        .id("http://acplt.org/Submodels/Assets/TestAsset/BillOfMaterial")
        .administration(new DefaultAdministrativeInformation.Builder().version("0").build())
        .kind(ModellingKind.INSTANCE)
        .semanticId(
            new DefaultReference.Builder()
                .keys(
                    new DefaultKey.Builder()
                        .type(KeyTypes.SUBMODEL)
                        .value("http://acplt.org/SubmodelTemplates/BillOfMaterial")
                        .build())
                .type(ReferenceTypes.EXTERNAL_REFERENCE)
                .build())
        .submodelElements(
            new DefaultEntity.Builder()
                .idShort("ExampleEntity")
                .description(
                    Arrays.asList(
                        new DefaultLangStringTextType.Builder()
                            .text(
                                "Legally valid designation of the natural or judicial person which is directly responsible for the design, production, packaging and labeling of a product in respect to its being brought into circulation.")
                            .language("en-us")
                            .build(),
                        new DefaultLangStringTextType.Builder()
                            .text(
                                "Bezeichnung für eine natürliche oder juristische Person, die für die Auslegung, Herstellung und Verpackung sowie die Etikettierung eines Produkts im Hinblick auf das 'Inverkehrbringen' im eigenen Namen verantwortlich ist")
                            .language("de")
                            .build()))
                .semanticId(
                    new DefaultReference.Builder()
                        .keys(
                            new DefaultKey.Builder()
                                .type(KeyTypes.GLOBAL_REFERENCE)
                                .value("http://opcfoundation.org/UA/DI/1.1/DeviceType/Serialnumber")
                                .build())
                        .type(ReferenceTypes.EXTERNAL_REFERENCE)
                        .build())
                .statements(
                    new DefaultProperty.Builder()
                        .idShort("ExampleProperty2")
                        .category("CONSTANT")
                        .description(
                            Arrays.asList(
                                new DefaultLangStringTextType.Builder()
                                    .text("Example Property object")
                                    .language("en-us")
                                    .build(),
                                new DefaultLangStringTextType.Builder()
                                    .text("Beispiel Property Element")
                                    .language("de")
                                    .build()))
                        .semanticId(
                            new DefaultReference.Builder()
                                .keys(
                                    new DefaultKey.Builder()
                                        .type(KeyTypes.GLOBAL_REFERENCE)
                                        .value("http://acplt.org/Properties/ExampleProperty")
                                        .build())
                                .type(ReferenceTypes.EXTERNAL_REFERENCE)
                                .build())
                        .value("http://acplt.org/ValueId/ExampleValue2")
                        .valueType(DataTypeDefXsd.STRING)
                        .valueId(
                            new DefaultReference.Builder()
                                .keys(
                                    new DefaultKey.Builder()
                                        .type(KeyTypes.GLOBAL_REFERENCE)
                                        .value("http://acplt.org/ValueId/ExampleValue2")
                                        .build())
                                .type(ReferenceTypes.EXTERNAL_REFERENCE)
                                .build())
                        .build())
                .statements(
                    new DefaultProperty.Builder()
                        .idShort("ExampleProperty")
                        .category("CONSTANT")
                        .description(
                            Arrays.asList(
                                new DefaultLangStringTextType.Builder()
                                    .text("Example Property object")
                                    .language("en-us")
                                    .build(),
                                new DefaultLangStringTextType.Builder()
                                    .text("Beispiel Property Element")
                                    .language("de")
                                    .build()))
                        .semanticId(
                            new DefaultReference.Builder()
                                .keys(
                                    new DefaultKey.Builder()
                                        .type(KeyTypes.GLOBAL_REFERENCE)
                                        .value("http://acplt.org/Properties/ExampleProperty")
                                        .build())
                                .type(ReferenceTypes.EXTERNAL_REFERENCE)
                                .build())
                        .value("http://acplt.org/ValueId/ExampleValueId")
                        .valueType(DataTypeDefXsd.STRING)
                        .valueId(
                            new DefaultReference.Builder()
                                .keys(
                                    new DefaultKey.Builder()
                                        .type(KeyTypes.GLOBAL_REFERENCE)
                                        .value("http://acplt.org/ValueId/ExampleValueId")
                                        .build())
                                .type(ReferenceTypes.EXTERNAL_REFERENCE)
                                .build())
                        .build())
                .entityType(EntityType.CO_MANAGED_ENTITY)
                .build())
        .submodelElements(
            new DefaultEntity.Builder()
                .idShort("ExampleEntity2")
                .description(
                    Arrays.asList(
                        new DefaultLangStringTextType.Builder()
                            .text(
                                "Legally valid designation of the natural or judicial person which is directly responsible for the design, production, packaging and labeling of a product in respect to its being brought into circulation.")
                            .language("en-us")
                            .build(),
                        new DefaultLangStringTextType.Builder()
                            .text(
                                "Bezeichnung für eine natürliche oder juristische Person, die für die Auslegung, Herstellung und Verpackung sowie die Etikettierung eines Produkts im Hinblick auf das 'Inverkehrbringen' im eigenen Namen verantwortlich ist")
                            .language("de")
                            .build()))
                .semanticId(
                    new DefaultReference.Builder()
                        .keys(
                            new DefaultKey.Builder()
                                .type(KeyTypes.GLOBAL_REFERENCE)
                                .value("http://opcfoundation.org/UA/DI/1.1/DeviceType/Serialnumber")
                                .build())
                        .type(ReferenceTypes.EXTERNAL_REFERENCE)
                        .build())
                .entityType(EntityType.SELF_MANAGED_ENTITY)
                .globalAssetId("https://acplt.org/Test_Asset2")
                .build())
        .build();
  }

  public static Submodel createSubmodel3() {
    return new DefaultSubmodel.Builder()
        .idShort("TestSubmodel")
        .description(
            Arrays.asList(
                new DefaultLangStringTextType.Builder()
                    .text("An example submodel for the test application")
                    .language("en-us")
                    .build(),
                new DefaultLangStringTextType.Builder()
                    .text("Ein Beispiel-Teilmodell für eine Test-Anwendung")
                    .language("de")
                    .build()))
        .id("https://acplt.org/Test_Submodel")
        .administration(
            new DefaultAdministrativeInformation.Builder().version("0").revision("9").build())
        .kind(ModellingKind.INSTANCE)
        .semanticId(
            new DefaultReference.Builder()
                .keys(
                    new DefaultKey.Builder()
                        .type(KeyTypes.GLOBAL_REFERENCE)
                        .value("http://acplt.org/SubmodelTemplates/ExampleSubmodel")
                        .build())
                .type(ReferenceTypes.EXTERNAL_REFERENCE)
                .build())
        .submodelElements(
            new DefaultRelationshipElement.Builder()
                .idShort("ExampleRelationshipElement")
                .category("PARAMETER")
                .description(
                    Arrays.asList(
                        new DefaultLangStringTextType.Builder()
                            .text("Example RelationshipElement object")
                            .language("en-us")
                            .build(),
                        new DefaultLangStringTextType.Builder()
                            .text("Beispiel RelationshipElement Element")
                            .language("de")
                            .build()))
                .semanticId(
                    new DefaultReference.Builder()
                        .keys(
                            new DefaultKey.Builder()
                                .type(KeyTypes.GLOBAL_REFERENCE)
                                .value(
                                    "http://acplt.org/RelationshipElements/ExampleRelationshipElement")
                                .build())
                        .type(ReferenceTypes.EXTERNAL_REFERENCE)
                        .build())
                .first(
                    new DefaultReference.Builder()
                        .keys(
                            new DefaultKey.Builder()
                                .type(KeyTypes.SUBMODEL)
                                .value("https://acplt.org/Test_Submodel")
                                .build())
                        .keys(
                            new DefaultKey.Builder()
                                .type(KeyTypes.SUBMODEL_ELEMENT_LIST)
                                .value("ExampleSubmodelElementListOrdered")
                                .build())
                        .keys(
                            new DefaultKey.Builder()
                                .type(KeyTypes.PROPERTY)
                                .value("ExampleProperty")
                                .build())
                        .type(ReferenceTypes.MODEL_REFERENCE)
                        .build())
                .second(
                    new DefaultReference.Builder()
                        .keys(
                            new DefaultKey.Builder()
                                .type(KeyTypes.SUBMODEL)
                                .value("http://acplt.org/Submodels/Assets/TestAsset/BillOfMaterial")
                                .build())
                        .keys(
                            new DefaultKey.Builder()
                                .type(KeyTypes.ENTITY)
                                .value("ExampleEntity")
                                .build())
                        .keys(
                            new DefaultKey.Builder()
                                .type(KeyTypes.PROPERTY)
                                .value("ExampleProperty2")
                                .build())
                        .type(ReferenceTypes.MODEL_REFERENCE)
                        .build())
                .build())
        .submodelElements(
            new DefaultAnnotatedRelationshipElement.Builder()
                .idShort("ExampleAnnotatedRelationshipElement")
                .category("PARAMETER")
                .description(
                    Arrays.asList(
                        new DefaultLangStringTextType.Builder()
                            .text("Example AnnotatedRelationshipElement object")
                            .language("en-us")
                            .build(),
                        new DefaultLangStringTextType.Builder()
                            .text("Beispiel AnnotatedRelationshipElement Element")
                            .language("de")
                            .build()))
                .semanticId(
                    new DefaultReference.Builder()
                        .keys(
                            new DefaultKey.Builder()
                                .type(KeyTypes.GLOBAL_REFERENCE)
                                .value(
                                    "http://acplt.org/RelationshipElements/ExampleAnnotatedRelationshipElement")
                                .build())
                        .type(ReferenceTypes.EXTERNAL_REFERENCE)
                        .build())
                .first(
                    new DefaultReference.Builder()
                        .keys(
                            new DefaultKey.Builder()
                                .type(KeyTypes.SUBMODEL)
                                .value("https://acplt.org/Test_Submodel")
                                .build())
                        .keys(
                            new DefaultKey.Builder()
                                .type(KeyTypes.SUBMODEL_ELEMENT_LIST)
                                .value("ExampleSubmodelElementListOrdered")
                                .build())
                        .keys(
                            new DefaultKey.Builder()
                                .type(KeyTypes.PROPERTY)
                                .value("ExampleProperty")
                                .build())
                        .type(ReferenceTypes.MODEL_REFERENCE)
                        .build())
                .second(
                    new DefaultReference.Builder()
                        .keys(
                            new DefaultKey.Builder()
                                .type(KeyTypes.SUBMODEL)
                                .value("http://acplt.org/Submodels/Assets/TestAsset/BillOfMaterial")
                                .build())
                        .keys(
                            new DefaultKey.Builder()
                                .type(KeyTypes.ENTITY)
                                .value("ExampleEntity")
                                .build())
                        .keys(
                            new DefaultKey.Builder()
                                .type(KeyTypes.PROPERTY)
                                .value("ExampleProperty2")
                                .build())
                        .type(ReferenceTypes.MODEL_REFERENCE)
                        .build())
                .annotations(
                    new DefaultProperty.Builder()
                        .idShort("ExampleProperty3")
                        .category("PARAMETER")
                        .value("some example annotation")
                        .valueType(DataTypeDefXsd.STRING)
                        .build())
                .build())
        .submodelElements(
            new DefaultOperation.Builder()
                .idShort("ExampleOperation")
                .category("PARAMETER")
                .description(
                    Arrays.asList(
                        new DefaultLangStringTextType.Builder()
                            .text("Example Operation object")
                            .language("en-us")
                            .build(),
                        new DefaultLangStringTextType.Builder()
                            .text("Beispiel Operation Element")
                            .language("de")
                            .build()))
                .semanticId(
                    new DefaultReference.Builder()
                        .keys(
                            new DefaultKey.Builder()
                                .type(KeyTypes.GLOBAL_REFERENCE)
                                .value("http://acplt.org/Operations/ExampleOperation")
                                .build())
                        .type(ReferenceTypes.EXTERNAL_REFERENCE)
                        .build())
                .inputVariables(
                    Arrays.asList(
                        new DefaultOperationVariable.Builder()
                            .value(
                                new DefaultProperty.Builder()
                                    .idShort("ExampleProperty1")
                                    .category("CONSTANT")
                                    .description(
                                        Arrays.asList(
                                            new DefaultLangStringTextType.Builder()
                                                .text("Example Property object")
                                                .language("en-us")
                                                .build(),
                                            new DefaultLangStringTextType.Builder()
                                                .text("Beispiel Property Element")
                                                .language("de")
                                                .build()))
                                    .semanticId(
                                        new DefaultReference.Builder()
                                            .keys(
                                                new DefaultKey.Builder()
                                                    .type(KeyTypes.GLOBAL_REFERENCE)
                                                    .value(
                                                        "http://acplt.org/Properties/ExampleProperty")
                                                    .build())
                                            .type(ReferenceTypes.EXTERNAL_REFERENCE)
                                            .build())
                                    .value("http://acplt.org/ValueId/ExampleValueId")
                                    .valueId(
                                        new DefaultReference.Builder()
                                            .keys(
                                                new DefaultKey.Builder()
                                                    .type(KeyTypes.GLOBAL_REFERENCE)
                                                    .value(
                                                        "http://acplt.org/ValueId/ExampleValueId")
                                                    .build())
                                            .type(ReferenceTypes.EXTERNAL_REFERENCE)
                                            .build())
                                    .valueType(DataTypeDefXsd.STRING)
                                    .build())
                            .build(),
                        new DefaultOperationVariable.Builder()
                            .value(
                                new DefaultProperty.Builder()
                                    .idShort("ExampleProperty2")
                                    .category("CONSTANT")
                                    .description(
                                        Arrays.asList(
                                            new DefaultLangStringTextType.Builder()
                                                .text("Example Property object")
                                                .language("en-us")
                                                .build(),
                                            new DefaultLangStringTextType.Builder()
                                                .text("Beispiel Property Element")
                                                .language("de")
                                                .build()))
                                    .semanticId(
                                        new DefaultReference.Builder()
                                            .keys(
                                                new DefaultKey.Builder()
                                                    .type(KeyTypes.GLOBAL_REFERENCE)
                                                    .value(
                                                        "http://acplt.org/Properties/ExampleProperty")
                                                    .build())
                                            .type(ReferenceTypes.EXTERNAL_REFERENCE)
                                            .build())
                                    .value("http://acplt.org/ValueId/ExampleValueId")
                                    .valueId(
                                        new DefaultReference.Builder()
                                            .keys(
                                                new DefaultKey.Builder()
                                                    .type(KeyTypes.GLOBAL_REFERENCE)
                                                    .value(
                                                        "http://acplt.org/ValueId/ExampleValueId")
                                                    .build())
                                            .type(ReferenceTypes.EXTERNAL_REFERENCE)
                                            .build())
                                    .valueType(DataTypeDefXsd.STRING)
                                    .build())
                            .build()))
                .outputVariables(
                    new DefaultOperationVariable.Builder()
                        .value(
                            new DefaultProperty.Builder()
                                .idShort("ExampleProperty2")
                                .category("CONSTANT")
                                .description(
                                    Arrays.asList(
                                        new DefaultLangStringTextType.Builder()
                                            .text("Example Property object")
                                            .language("en-us")
                                            .build(),
                                        new DefaultLangStringTextType.Builder()
                                            .text("Beispiel Property Element")
                                            .language("de")
                                            .build()))
                                .semanticId(
                                    new DefaultReference.Builder()
                                        .keys(
                                            new DefaultKey.Builder()
                                                .type(KeyTypes.GLOBAL_REFERENCE)
                                                .value(
                                                    "http://acplt.org/Properties/ExampleProperty")
                                                .build())
                                        .type(ReferenceTypes.EXTERNAL_REFERENCE)
                                        .build())
                                .value("http://acplt.org/ValueId/ExampleValueId")
                                .valueId(
                                    new DefaultReference.Builder()
                                        .keys(
                                            new DefaultKey.Builder()
                                                .type(KeyTypes.GLOBAL_REFERENCE)
                                                .value("http://acplt.org/ValueId/ExampleValueId")
                                                .build())
                                        .type(ReferenceTypes.EXTERNAL_REFERENCE)
                                        .build())
                                .valueType(DataTypeDefXsd.STRING)
                                .build())
                        .build())
                .inoutputVariables(
                    new DefaultOperationVariable.Builder()
                        .value(
                            new DefaultProperty.Builder()
                                .idShort("ExampleProperty3")
                                .category("CONSTANT")
                                .description(
                                    Arrays.asList(
                                        new DefaultLangStringTextType.Builder()
                                            .text("Example Property object")
                                            .language("en-us")
                                            .build(),
                                        new DefaultLangStringTextType.Builder()
                                            .text("Beispiel Property Element")
                                            .language("de")
                                            .build()))
                                .semanticId(
                                    new DefaultReference.Builder()
                                        .keys(
                                            new DefaultKey.Builder()
                                                .type(KeyTypes.GLOBAL_REFERENCE)
                                                .value(
                                                    "http://acplt.org/Properties/ExampleProperty")
                                                .build())
                                        .type(ReferenceTypes.EXTERNAL_REFERENCE)
                                        .build())
                                .value("http://acplt.org/ValueId/ExampleValueId")
                                .valueId(
                                    new DefaultReference.Builder()
                                        .keys(
                                            new DefaultKey.Builder()
                                                .type(KeyTypes.GLOBAL_REFERENCE)
                                                .value("http://acplt.org/ValueId/ExampleValueId")
                                                .build())
                                        .type(ReferenceTypes.EXTERNAL_REFERENCE)
                                        .build())
                                .valueType(DataTypeDefXsd.STRING)
                                .build())
                        .build())
                .build())
        .submodelElements(
            new DefaultCapability.Builder()
                .idShort("ExampleCapability")
                .category("PARAMETER")
                .description(
                    Arrays.asList(
                        new DefaultLangStringTextType.Builder()
                            .text("Example Capability object")
                            .language("en-us")
                            .build(),
                        new DefaultLangStringTextType.Builder()
                            .text("Beispiel Capability Element")
                            .language("de")
                            .build()))
                .semanticId(
                    new DefaultReference.Builder()
                        .keys(
                            new DefaultKey.Builder()
                                .type(KeyTypes.GLOBAL_REFERENCE)
                                .value("http://acplt.org/Capabilities/ExampleCapability")
                                .build())
                        .type(ReferenceTypes.EXTERNAL_REFERENCE)
                        .build())
                .build())
        .submodelElements(
            new DefaultBasicEventElement.Builder()
                .idShort("ExampleBasicEvent")
                .category("PARAMETER")
                .direction(Direction.INPUT)
                .state(StateOfEvent.ON)
                .description(
                    Arrays.asList(
                        new DefaultLangStringTextType.Builder()
                            .text("Example BasicEvent object")
                            .language("en-us")
                            .build(),
                        new DefaultLangStringTextType.Builder()
                            .text("Beispiel BasicEvent Element")
                            .language("de")
                            .build()))
                .semanticId(
                    new DefaultReference.Builder()
                        .keys(
                            new DefaultKey.Builder()
                                .type(KeyTypes.GLOBAL_REFERENCE)
                                .value("http://acplt.org/Events/ExampleBasicEvent")
                                .build())
                        .type(ReferenceTypes.EXTERNAL_REFERENCE)
                        .build())
                .observed(
                    new DefaultReference.Builder()
                        .keys(
                            new DefaultKey.Builder()
                                .type(KeyTypes.SUBMODEL)
                                .value("https://acplt.org/Test_Submodel")
                                .build())
                        .keys(
                            new DefaultKey.Builder()
                                .type(KeyTypes.SUBMODEL_ELEMENT_LIST)
                                .value("ExampleSubmodelElementListOrdered")
                                .build())
                        .keys(
                            new DefaultKey.Builder()
                                .type(KeyTypes.PROPERTY)
                                .value("ExampleProperty")
                                .build())
                        .type(ReferenceTypes.MODEL_REFERENCE)
                        .build())
                .build())
        .submodelElements(
            new DefaultSubmodelElementList.Builder()
                .idShort("ExampleSubmodelElementListOrdered")
                .category("PARAMETER")
                .orderRelevant(true)
                .description(
                    Arrays.asList(
                        new DefaultLangStringTextType.Builder()
                            .text("Example ExampleSubmodelElementListOrdered object")
                            .language("en-us")
                            .build(),
                        new DefaultLangStringTextType.Builder()
                            .text("Beispiel ExampleSubmodelElementListOrdered Element")
                            .language("de")
                            .build()))
                .semanticId(
                    new DefaultReference.Builder()
                        .keys(
                            new DefaultKey.Builder()
                                .type(KeyTypes.GLOBAL_REFERENCE)
                                .value(
                                    "http://acplt.org/SubmodelElementLists/ExampleSubmodelElementListOrdered")
                                .build())
                        .type(ReferenceTypes.EXTERNAL_REFERENCE)
                        .build())
                .typeValueListElement(AasSubmodelElements.SUBMODEL_ELEMENT)
                .value(
                    new DefaultProperty.Builder()
                        .idShort("ExampleProperty")
                        .category("CONSTANT")
                        .description(
                            Arrays.asList(
                                new DefaultLangStringTextType.Builder()
                                    .text("Example Property object")
                                    .language("en-us")
                                    .build(),
                                new DefaultLangStringTextType.Builder()
                                    .text("Beispiel Property Element")
                                    .language("de")
                                    .build()))
                        .semanticId(
                            new DefaultReference.Builder()
                                .keys(
                                    new DefaultKey.Builder()
                                        .type(KeyTypes.GLOBAL_REFERENCE)
                                        .value("http://acplt.org/Properties/ExampleProperty")
                                        .build())
                                .type(ReferenceTypes.EXTERNAL_REFERENCE)
                                .build())
                        .value("http://acplt.org/ValueId/ExampleValueId")
                        .valueId(
                            new DefaultReference.Builder()
                                .keys(
                                    new DefaultKey.Builder()
                                        .type(KeyTypes.GLOBAL_REFERENCE)
                                        .value("http://acplt.org/ValueId/ExampleValueId")
                                        .build())
                                .type(ReferenceTypes.EXTERNAL_REFERENCE)
                                .build())
                        .valueType(DataTypeDefXsd.STRING)
                        .build())
                .value(
                    new DefaultMultiLanguageProperty.Builder()
                        .idShort("ExampleMultiLanguageProperty")
                        .category("CONSTANT")
                        .value(
                            Arrays.asList(
                                new DefaultLangStringTextType.Builder()
                                    .text("Example value of a MultiLanguageProperty element")
                                    .language("en-us")
                                    .build(),
                                new DefaultLangStringTextType.Builder()
                                    .text("Beispielswert für ein MultiLanguageProperty-Element")
                                    .language("de")
                                    .build()))
                        .semanticId(
                            new DefaultReference.Builder()
                                .keys(
                                    new DefaultKey.Builder()
                                        .type(KeyTypes.GLOBAL_REFERENCE)
                                        .value(
                                            "http://acplt.org/MultiLanguageProperties/ExampleMultiLanguageProperty")
                                        .build())
                                .type(ReferenceTypes.EXTERNAL_REFERENCE)
                                .build())
                        .description(
                            Arrays.asList(
                                new DefaultLangStringTextType.Builder()
                                    .text("Example MultiLanguageProperty object")
                                    .language("en-us")
                                    .build(),
                                new DefaultLangStringTextType.Builder()
                                    .text("Beispiel MultiLanguageProperty Element")
                                    .language("de")
                                    .build()))
                        .valueId(
                            new DefaultReference.Builder()
                                .keys(
                                    new DefaultKey.Builder()
                                        .type(KeyTypes.GLOBAL_REFERENCE)
                                        .value(
                                            "http://acplt.org/ValueId/ExampleMultiLanguageValueId")
                                        .build())
                                .type(ReferenceTypes.EXTERNAL_REFERENCE)
                                .build())
                        .build())
                .value(
                    new DefaultRange.Builder()
                        .idShort("ExampleRange")
                        .category("PARAMETER")
                        .description(
                            Arrays.asList(
                                new DefaultLangStringTextType.Builder()
                                    .text("Example Range object")
                                    .language("en-us")
                                    .build(),
                                new DefaultLangStringTextType.Builder()
                                    .text("Beispiel Range Element")
                                    .language("de")
                                    .build()))
                        .semanticId(
                            new DefaultReference.Builder()
                                .keys(
                                    new DefaultKey.Builder()
                                        .type(KeyTypes.GLOBAL_REFERENCE)
                                        .value("http://acplt.org/Ranges/ExampleRange")
                                        .build())
                                .type(ReferenceTypes.EXTERNAL_REFERENCE)
                                .build())
                        .min("0")
                        .max("100")
                        .valueType(DataTypeDefXsd.INT)
                        .build())
                .build())
        .submodelElements(
            new DefaultSubmodelElementCollection.Builder()
                .idShort("ExampleSubmodelElementCollection")
                .category("PARAMETER")
                .description(
                    Arrays.asList(
                        new DefaultLangStringTextType.Builder()
                            .text("Example SubmodelElementCollection object")
                            .language("en-us")
                            .build(),
                        new DefaultLangStringTextType.Builder()
                            .text("Beispiel SubmodelElementCollection Element")
                            .language("de")
                            .build()))
                .semanticId(
                    new DefaultReference.Builder()
                        .keys(
                            new DefaultKey.Builder()
                                .type(KeyTypes.GLOBAL_REFERENCE)
                                .value(
                                    "http://acplt.org/SubmodelElementCollections/ExampleSubmodelElementCollection")
                                .build())
                        .type(ReferenceTypes.EXTERNAL_REFERENCE)
                        .build())
                .value(
                    new DefaultBlob.Builder()
                        .idShort("ExampleBlob")
                        .category("PARAMETER")
                        .description(
                            Arrays.asList(
                                new DefaultLangStringTextType.Builder()
                                    .text("Example Blob object")
                                    .language("en-us")
                                    .build(),
                                new DefaultLangStringTextType.Builder()
                                    .text("Beispiel Blob Element")
                                    .language("de")
                                    .build()))
                        .semanticId(
                            new DefaultReference.Builder()
                                .keys(
                                    new DefaultKey.Builder()
                                        .type(KeyTypes.GLOBAL_REFERENCE)
                                        .value("http://acplt.org/Blobs/ExampleBlob")
                                        .build())
                                .type(ReferenceTypes.EXTERNAL_REFERENCE)
                                .build())
                        .contentType("application/pdf")
                        .value(Base64.getDecoder().decode("AQIDBAU="))
                        .build())
                .value(
                    new DefaultFile.Builder()
                        .idShort("ExampleFile")
                        .category("PARAMETER")
                        .description(
                            Arrays.asList(
                                new DefaultLangStringTextType.Builder()
                                    .text("Example File object")
                                    .language("en-us")
                                    .build(),
                                new DefaultLangStringTextType.Builder()
                                    .text("Beispiel File Element")
                                    .language("de")
                                    .build()))
                        .semanticId(
                            new DefaultReference.Builder()
                                .keys(
                                    new DefaultKey.Builder()
                                        .type(KeyTypes.GLOBAL_REFERENCE)
                                        .value("http://acplt.org/Files/ExampleFile")
                                        .build())
                                .type(ReferenceTypes.EXTERNAL_REFERENCE)
                                .build())
                        .value("file:///TestFile.pdf")
                        .contentType("application/pdf")
                        .build())
                .value(
                    new DefaultReferenceElement.Builder()
                        .idShort("ExampleReferenceElement")
                        .category("PARAMETER")
                        .description(
                            Arrays.asList(
                                new DefaultLangStringTextType.Builder()
                                    .text("Example Reference Element object")
                                    .language("en-us")
                                    .build(),
                                new DefaultLangStringTextType.Builder()
                                    .text("Beispiel Reference Element Element")
                                    .language("de")
                                    .build()))
                        .semanticId(
                            new DefaultReference.Builder()
                                .keys(
                                    new DefaultKey.Builder()
                                        .type(KeyTypes.GLOBAL_REFERENCE)
                                        .value(
                                            "http://acplt.org/ReferenceElements/ExampleReferenceElement")
                                        .build())
                                .type(ReferenceTypes.EXTERNAL_REFERENCE)
                                .build())
                        .value(
                            new DefaultReference.Builder()
                                .keys(
                                    new DefaultKey.Builder()
                                        .type(KeyTypes.SUBMODEL)
                                        .value("https://acplt.org/Test_Submodel")
                                        .build())
                                .keys(
                                    new DefaultKey.Builder()
                                        .type(KeyTypes.SUBMODEL_ELEMENT_LIST)
                                        .value("ExampleSubmodelElementListOrdered")
                                        .build())
                                .keys(
                                    new DefaultKey.Builder()
                                        .type(KeyTypes.PROPERTY)
                                        .value("ExampleProperty")
                                        .build())
                                .type(ReferenceTypes.EXTERNAL_REFERENCE)
                                .build())
                        .build())
                .build())
        .build();
  }

  public static Submodel createSubmodel4() {
    return new DefaultSubmodel.Builder()
        .idShort("Test_Submodel_Mandatory")
        .id("https://acplt.org/Test_Submodel_Mandatory")
        .kind(ModellingKind.TEMPLATE)
        .submodelElements(
            new DefaultRelationshipElement.Builder()
                .idShort("ExampleRelationshipElement")
                .first(
                    new DefaultReference.Builder()
                        .keys(
                            new DefaultKey.Builder()
                                .type(KeyTypes.SUBMODEL)
                                .value("https://acplt.org/Test_Submodel_Mandatory")
                                .build())
                        .keys(
                            new DefaultKey.Builder()
                                .type(KeyTypes.SUBMODEL_ELEMENT_LIST)
                                .value("ExampleSubmodelElementListUnordered")
                                .build())
                        .keys(
                            new DefaultKey.Builder()
                                .type(KeyTypes.PROPERTY)
                                .value("ExampleProperty")
                                .build())
                        .type(ReferenceTypes.MODEL_REFERENCE)
                        .build())
                .second(
                    new DefaultReference.Builder()
                        .keys(
                            new DefaultKey.Builder()
                                .type(KeyTypes.SUBMODEL)
                                .value("https://acplt.org/Test_Submodel_Mandatory")
                                .build())
                        .keys(
                            new DefaultKey.Builder()
                                .type(KeyTypes.SUBMODEL_ELEMENT_LIST)
                                .value("ExampleSubmodelElementListUnordered")
                                .build())
                        .keys(
                            new DefaultKey.Builder()
                                .type(KeyTypes.MULTI_LANGUAGE_PROPERTY)
                                .value("ExampleMultiLanguageProperty")
                                .build())
                        .type(ReferenceTypes.MODEL_REFERENCE)
                        .build())
                .build())
        .submodelElements(
            new DefaultAnnotatedRelationshipElement.Builder()
                .idShort("ExampleAnnotatedRelationshipElement")
                .first(
                    new DefaultReference.Builder()
                        .keys(
                            new DefaultKey.Builder()
                                .type(KeyTypes.SUBMODEL)
                                .value("https://acplt.org/Test_Submodel_Mandatory")
                                .build())
                        .keys(
                            new DefaultKey.Builder()
                                .type(KeyTypes.SUBMODEL_ELEMENT_COLLECTION)
                                .value("ExampleSubmodelElementCollection")
                                .build())
                        .keys(
                            new DefaultKey.Builder()
                                .type(KeyTypes.BLOB)
                                .value("ExampleBlob")
                                .build())
                        .type(ReferenceTypes.MODEL_REFERENCE)
                        .build())
                .second(
                    new DefaultReference.Builder()
                        .keys(
                            new DefaultKey.Builder()
                                .type(KeyTypes.SUBMODEL)
                                .value("https://acplt.org/Test_Submodel_Mandatory")
                                .build())
                        .keys(
                            new DefaultKey.Builder()
                                .type(KeyTypes.SUBMODEL_ELEMENT_LIST)
                                .value("ExampleSubmodelElementListUnordered")
                                .build())
                        .keys(
                            new DefaultKey.Builder()
                                .type(KeyTypes.MULTI_LANGUAGE_PROPERTY)
                                .value("ExampleMultiLanguageProperty")
                                .build())
                        .type(ReferenceTypes.MODEL_REFERENCE)
                        .build())
                .build())
        .submodelElements(new DefaultOperation.Builder().idShort("ExampleOperation").build())
        .submodelElements(new DefaultCapability.Builder().idShort("ExampleCapability").build())
        .submodelElements(
            new DefaultBasicEventElement.Builder()
                .idShort("ExampleBasicEvent")
                .direction(Direction.OUTPUT)
                .state(StateOfEvent.OFF)
                .observed(
                    new DefaultReference.Builder()
                        .keys(
                            new DefaultKey.Builder()
                                .type(KeyTypes.SUBMODEL)
                                .value("https://acplt.org/Test_Submodel_Mandatory")
                                .build())
                        .keys(
                            new DefaultKey.Builder()
                                .type(KeyTypes.SUBMODEL_ELEMENT_LIST)
                                .value("ExampleSubmodelElementListUnordered")
                                .build())
                        .keys(
                            new DefaultKey.Builder()
                                .type(KeyTypes.PROPERTY)
                                .value("ExampleProperty")
                                .build())
                        .type(ReferenceTypes.MODEL_REFERENCE)
                        .build())
                .build())
        .submodelElements(
            new DefaultSubmodelElementList.Builder()
                .idShort("ExampleSubmodelElementListUnordered")
                .orderRelevant(false)
                .typeValueListElement(AasSubmodelElements.SUBMODEL_ELEMENT)
                .value(
                    new DefaultProperty.Builder()
                        .idShort("ExampleProperty")
                        .value(null)
                        .valueType(DataTypeDefXsd.STRING)
                        .build())
                .value(
                    new DefaultMultiLanguageProperty.Builder()
                        .idShort("ExampleMultiLanguageProperty")
                        .build())
                .value(
                    new DefaultRange.Builder()
                        .idShort("ExampleRange")
                        .min(null)
                        .max(null)
                        .valueType(DataTypeDefXsd.INT)
                        .build())
                .build())
        .submodelElements(
            new DefaultSubmodelElementCollection.Builder()
                .idShort("ExampleSubmodelElementCollection")
                .value(
                    new DefaultBlob.Builder()
                        .idShort("ExampleBlob")
                        .contentType("application/pdf")
                        .build())
                .value(
                    new DefaultFile.Builder()
                        .idShort("ExampleFile")
                        .value(null)
                        .contentType("application/pdf")
                        .build())
                .value(
                    new DefaultReferenceElement.Builder()
                        .idShort("ExampleReferenceElement")
                        .build())
                .build())
        .submodelElements(
            new DefaultSubmodelElementCollection.Builder()
                .idShort("ExampleSubmodelElementCollection2")
                .build())
        .build();
  }

  public static Submodel createSubmodel5() {
    return new DefaultSubmodel.Builder()
        .idShort("Test_Submodel2_Mandatory")
        .kind(ModellingKind.INSTANCE)
        .id("https://acplt.org/Test_Submodel2_Mandatory")
        .build();
  }

  public static Submodel createSubmodel6() {
    return new DefaultSubmodel.Builder()
        .idShort("TestSubmodelMissing")
        .description(
            Arrays.asList(
                new DefaultLangStringTextType.Builder()
                    .text("An example submodel for the test application")
                    .language("en-us")
                    .build(),
                new DefaultLangStringTextType.Builder()
                    .text("Ein Beispiel-Teilmodell für eine Test-Anwendung")
                    .language("de")
                    .build()))
        .id("https://acplt.org/Test_Submodel_Missing")
        .kind(ModellingKind.INSTANCE)
        .administration(
            new DefaultAdministrativeInformation.Builder().version("0").revision("9").build())
        .semanticId(
            new DefaultReference.Builder()
                .keys(
                    new DefaultKey.Builder()
                        .type(KeyTypes.GLOBAL_REFERENCE)
                        .value("http://acplt.org/SubmodelTemplates/ExampleSubmodel")
                        .build())
                .type(ReferenceTypes.EXTERNAL_REFERENCE)
                .build())
        .submodelElements(
            new DefaultRelationshipElement.Builder()
                .idShort("ExampleRelationshipElement")
                .category("PARAMETER")
                .description(
                    Arrays.asList(
                        new DefaultLangStringTextType.Builder()
                            .text("Example RelationshipElement object")
                            .language("en-us")
                            .build(),
                        new DefaultLangStringTextType.Builder()
                            .text("Beispiel RelationshipElement Element")
                            .language("de")
                            .build()))
                .semanticId(
                    new DefaultReference.Builder()
                        .keys(
                            new DefaultKey.Builder()
                                .type(KeyTypes.GLOBAL_REFERENCE)
                                .value(
                                    "http://acplt.org/RelationshipElements/ExampleRelationshipElement")
                                .build())
                        .type(ReferenceTypes.EXTERNAL_REFERENCE)
                        .build())
                .first(
                    new DefaultReference.Builder()
                        .keys(
                            new DefaultKey.Builder()
                                .type(KeyTypes.SUBMODEL)
                                .value("https://acplt.org/Test_Submodel_Missing")
                                .build())
                        .keys(
                            new DefaultKey.Builder()
                                .type(KeyTypes.SUBMODEL_ELEMENT_LIST)
                                .value("ExampleSubmodelElementListOrdered")
                                .build())
                        .keys(
                            new DefaultKey.Builder()
                                .type(KeyTypes.PROPERTY)
                                .value("ExampleProperty")
                                .build())
                        .type(ReferenceTypes.MODEL_REFERENCE)
                        .build())
                .second(
                    new DefaultReference.Builder()
                        .keys(
                            new DefaultKey.Builder()
                                .type(KeyTypes.SUBMODEL)
                                .value("https://acplt.org/Test_Submodel_Missing")
                                .build())
                        .keys(
                            new DefaultKey.Builder()
                                .type(KeyTypes.SUBMODEL_ELEMENT_LIST)
                                .value("ExampleSubmodelElementListOrdered")
                                .build())
                        .keys(
                            new DefaultKey.Builder()
                                .type(KeyTypes.MULTI_LANGUAGE_PROPERTY)
                                .value("ExampleMultiLanguageProperty")
                                .build())
                        .type(ReferenceTypes.MODEL_REFERENCE)
                        .build())
                .build())
        .submodelElements(
            new DefaultAnnotatedRelationshipElement.Builder()
                .idShort("ExampleAnnotatedRelationshipElement")
                .category("PARAMETER")
                .description(
                    Arrays.asList(
                        new DefaultLangStringTextType.Builder()
                            .text("Example AnnotatedRelationshipElement object")
                            .language("en-us")
                            .build(),
                        new DefaultLangStringTextType.Builder()
                            .text("Beispiel AnnotatedRelationshipElement Element")
                            .language("de")
                            .build()))
                .semanticId(
                    new DefaultReference.Builder()
                        .keys(
                            new DefaultKey.Builder()
                                .type(KeyTypes.GLOBAL_REFERENCE)
                                .value(
                                    "http://acplt.org/RelationshipElements/ExampleAnnotatedRelationshipElement")
                                .build())
                        .type(ReferenceTypes.EXTERNAL_REFERENCE)
                        .build())
                .first(
                    new DefaultReference.Builder()
                        .keys(
                            new DefaultKey.Builder()
                                .type(KeyTypes.SUBMODEL)
                                .value("https://acplt.org/Test_Submodel_Missing")
                                .build())
                        .keys(
                            new DefaultKey.Builder()
                                .type(KeyTypes.SUBMODEL_ELEMENT_LIST)
                                .value("ExampleSubmodelElementListOrdered")
                                .build())
                        .keys(
                            new DefaultKey.Builder()
                                .type(KeyTypes.PROPERTY)
                                .value("ExampleProperty")
                                .build())
                        .type(ReferenceTypes.MODEL_REFERENCE)
                        .build())
                .second(
                    new DefaultReference.Builder()
                        .keys(
                            new DefaultKey.Builder()
                                .type(KeyTypes.SUBMODEL)
                                .value("https://acplt.org/Test_Submodel_Missing")
                                .build())
                        .keys(
                            new DefaultKey.Builder()
                                .type(KeyTypes.SUBMODEL_ELEMENT_LIST)
                                .value("ExampleSubmodelElementListOrdered")
                                .build())
                        .keys(
                            new DefaultKey.Builder()
                                .type(KeyTypes.MULTI_LANGUAGE_PROPERTY)
                                .value("ExampleMultiLanguageProperty")
                                .build())
                        .type(ReferenceTypes.MODEL_REFERENCE)
                        .build())
                .annotations(
                    new DefaultProperty.Builder()
                        .idShort("ExampleProperty")
                        .category("PARAMETER")
                        .value("some example annotation")
                        .valueType(DataTypeDefXsd.STRING)
                        .build())
                .build())
        .submodelElements(
            new DefaultOperation.Builder()
                .idShort("ExampleOperation")
                .category("PARAMETER")
                .description(
                    Arrays.asList(
                        new DefaultLangStringTextType.Builder()
                            .text("Example Operation object")
                            .language("en-us")
                            .build(),
                        new DefaultLangStringTextType.Builder()
                            .text("Beispiel Operation Element")
                            .language("de")
                            .build()))
                .semanticId(
                    new DefaultReference.Builder()
                        .keys(
                            new DefaultKey.Builder()
                                .type(KeyTypes.GLOBAL_REFERENCE)
                                .value("http://acplt.org/Operations/ExampleOperation")
                                .build())
                        .type(ReferenceTypes.EXTERNAL_REFERENCE)
                        .build())
                .inputVariables(
                    new DefaultOperationVariable.Builder()
                        .value(
                            new DefaultProperty.Builder()
                                .idShort("ExampleProperty1")
                                .category("CONSTANT")
                                .description(
                                    Arrays.asList(
                                        new DefaultLangStringTextType.Builder()
                                            .text("Example Property object")
                                            .language("en-us")
                                            .build(),
                                        new DefaultLangStringTextType.Builder()
                                            .text("Beispiel Property Element")
                                            .language("de")
                                            .build()))
                                .semanticId(
                                    new DefaultReference.Builder()
                                        .keys(
                                            new DefaultKey.Builder()
                                                .type(KeyTypes.GLOBAL_REFERENCE)
                                                .value(
                                                    "http://acplt.org/Properties/ExampleProperty")
                                                .build())
                                        .type(ReferenceTypes.EXTERNAL_REFERENCE)
                                        .build())
                                .qualifiers(
                                    new DefaultQualifier.Builder()
                                        .type("http://acplt.org/Qualifier/ExampleQualifier")
                                        .valueType(DataTypeDefXsd.STRING)
                                        .build())
                                .value("exampleValue")
                                .valueType(DataTypeDefXsd.STRING)
                                .build())
                        .build())
                .outputVariables(
                    new DefaultOperationVariable.Builder()
                        .value(
                            new DefaultProperty.Builder()
                                .idShort("ExampleProperty2")
                                .category("CONSTANT")
                                .description(
                                    Arrays.asList(
                                        new DefaultLangStringTextType.Builder()
                                            .text("Example Property object")
                                            .language("en-us")
                                            .build(),
                                        new DefaultLangStringTextType.Builder()
                                            .text("Beispiel Property Element")
                                            .language("de")
                                            .build()))
                                .semanticId(
                                    new DefaultReference.Builder()
                                        .keys(
                                            new DefaultKey.Builder()
                                                .type(KeyTypes.GLOBAL_REFERENCE)
                                                .value(
                                                    "http://acplt.org/Properties/ExampleProperty")
                                                .build())
                                        .type(ReferenceTypes.EXTERNAL_REFERENCE)
                                        .build())
                                .qualifiers(
                                    new DefaultQualifier.Builder()
                                        .type("http://acplt.org/Qualifier/ExampleQualifier")
                                        .valueType(DataTypeDefXsd.STRING)
                                        .build())
                                .value("exampleValue")
                                .valueType(DataTypeDefXsd.STRING)
                                .build())
                        .build())
                .inoutputVariables(
                    new DefaultOperationVariable.Builder()
                        .value(
                            new DefaultProperty.Builder()
                                .idShort("ExampleProperty3")
                                .category("CONSTANT")
                                .description(
                                    Arrays.asList(
                                        new DefaultLangStringTextType.Builder()
                                            .text("Example Property object")
                                            .language("en-us")
                                            .build(),
                                        new DefaultLangStringTextType.Builder()
                                            .text("Beispiel Property Element")
                                            .language("de")
                                            .build()))
                                .semanticId(
                                    new DefaultReference.Builder()
                                        .keys(
                                            new DefaultKey.Builder()
                                                .type(KeyTypes.GLOBAL_REFERENCE)
                                                .value(
                                                    "http://acplt.org/Properties/ExampleProperty")
                                                .build())
                                        .type(ReferenceTypes.EXTERNAL_REFERENCE)
                                        .build())
                                .qualifiers(
                                    new DefaultQualifier.Builder()
                                        .type("http://acplt.org/Qualifier/ExampleQualifier")
                                        .valueType(DataTypeDefXsd.STRING)
                                        .build())
                                .value("exampleValue")
                                .valueType(DataTypeDefXsd.STRING)
                                .build())
                        .build())
                .build())
        .submodelElements(
            new DefaultCapability.Builder()
                .idShort("ExampleCapability")
                .category("PARAMETER")
                .description(
                    Arrays.asList(
                        new DefaultLangStringTextType.Builder()
                            .text("Example Capability object")
                            .language("en-us")
                            .build(),
                        new DefaultLangStringTextType.Builder()
                            .text("Beispiel Capability Element")
                            .language("de")
                            .build()))
                .semanticId(
                    new DefaultReference.Builder()
                        .keys(
                            new DefaultKey.Builder()
                                .type(KeyTypes.GLOBAL_REFERENCE)
                                .value("http://acplt.org/Capabilities/ExampleCapability")
                                .build())
                        .type(ReferenceTypes.EXTERNAL_REFERENCE)
                        .build())
                .build())
        .submodelElements(
            new DefaultBasicEventElement.Builder()
                .idShort("ExampleBasicEvent")
                .category("PARAMETER")
                .direction(Direction.INPUT)
                .state(StateOfEvent.ON)
                .description(
                    Arrays.asList(
                        new DefaultLangStringTextType.Builder()
                            .text("Example BasicEvent object")
                            .language("en-us")
                            .build(),
                        new DefaultLangStringTextType.Builder()
                            .text("Beispiel BasicEvent Element")
                            .language("de")
                            .build()))
                .semanticId(
                    new DefaultReference.Builder()
                        .keys(
                            new DefaultKey.Builder()
                                .type(KeyTypes.GLOBAL_REFERENCE)
                                .value("http://acplt.org/Events/ExampleBasicEvent")
                                .build())
                        .type(ReferenceTypes.EXTERNAL_REFERENCE)
                        .build())
                .observed(
                    new DefaultReference.Builder()
                        .keys(
                            new DefaultKey.Builder()
                                .type(KeyTypes.SUBMODEL)
                                .value("https://acplt.org/Test_Submodel_Missing")
                                .build())
                        .keys(
                            new DefaultKey.Builder()
                                .type(KeyTypes.SUBMODEL_ELEMENT_LIST)
                                .value("ExampleSubmodelElementListOrdered")
                                .build())
                        .keys(
                            new DefaultKey.Builder()
                                .type(KeyTypes.PROPERTY)
                                .value("ExampleProperty")
                                .build())
                        .type(ReferenceTypes.EXTERNAL_REFERENCE)
                        .build())
                .build())
        .submodelElements(
            new DefaultSubmodelElementList.Builder()
                .idShort("ExampleSubmodelElementListOrdered")
                .category("PARAMETER")
                .orderRelevant(true)
                .typeValueListElement(AasSubmodelElements.SUBMODEL_ELEMENT)
                .description(
                    Arrays.asList(
                        new DefaultLangStringTextType.Builder()
                            .text("Example SubmodelElementListOrdered object")
                            .language("en-us")
                            .build(),
                        new DefaultLangStringTextType.Builder()
                            .text("Beispiel SubmodelElementListOrdered Element")
                            .language("de")
                            .build()))
                .semanticId(
                    new DefaultReference.Builder()
                        .keys(
                            new DefaultKey.Builder()
                                .type(KeyTypes.GLOBAL_REFERENCE)
                                .value(
                                    "http://acplt.org/SubmodelElementLists/ExampleSubmodelElementListOrdered")
                                .build())
                        .type(ReferenceTypes.EXTERNAL_REFERENCE)
                        .build())
                .value(
                    new DefaultProperty.Builder()
                        .idShort("ExampleProperty")
                        .category("CONSTANT")
                        .description(
                            Arrays.asList(
                                new DefaultLangStringTextType.Builder()
                                    .text("Example Property object")
                                    .language("en-us")
                                    .build(),
                                new DefaultLangStringTextType.Builder()
                                    .text("Beispiel Property Element")
                                    .language("de")
                                    .build()))
                        .semanticId(
                            new DefaultReference.Builder()
                                .keys(
                                    new DefaultKey.Builder()
                                        .type(KeyTypes.GLOBAL_REFERENCE)
                                        .value("http://acplt.org/Properties/ExampleProperty")
                                        .build())
                                .type(ReferenceTypes.EXTERNAL_REFERENCE)
                                .build())
                        .qualifiers(
                            new DefaultQualifier.Builder()
                                .type("http://acplt.org/Qualifier/ExampleQualifier")
                                .valueType(DataTypeDefXsd.STRING)
                                .build())
                        .value("exampleValue")
                        .valueType(DataTypeDefXsd.STRING)
                        .build())
                .value(
                    new DefaultMultiLanguageProperty.Builder()
                        .idShort("ExampleMultiLanguageProperty")
                        .category("CONSTANT")
                        .value(
                            Arrays.asList(
                                new DefaultLangStringTextType.Builder()
                                    .text("Example value of a MultiLanguageProperty element")
                                    .language("en-us")
                                    .build(),
                                new DefaultLangStringTextType.Builder()
                                    .text("Beispielswert für ein MultiLanguageProperty-Element")
                                    .language("de")
                                    .build()))
                        .semanticId(
                            new DefaultReference.Builder()
                                .keys(
                                    new DefaultKey.Builder()
                                        .type(KeyTypes.GLOBAL_REFERENCE)
                                        .value(
                                            "http://acplt.org/MultiLanguageProperties/ExampleMultiLanguageProperty")
                                        .build())
                                .type(ReferenceTypes.EXTERNAL_REFERENCE)
                                .build())
                        .description(
                            Arrays.asList(
                                new DefaultLangStringTextType.Builder()
                                    .text("Example MultiLanguageProperty object")
                                    .language("en-us")
                                    .build(),
                                new DefaultLangStringTextType.Builder()
                                    .text("Beispiel MultiLanguageProperty Element")
                                    .language("de")
                                    .build()))
                        .build())
                .value(
                    new DefaultRange.Builder()
                        .idShort("ExampleRange")
                        .category("PARAMETER")
                        .description(
                            Arrays.asList(
                                new DefaultLangStringTextType.Builder()
                                    .text("Example Range object")
                                    .language("en-us")
                                    .build(),
                                new DefaultLangStringTextType.Builder()
                                    .text("Beispiel Range Element")
                                    .language("de")
                                    .build()))
                        .semanticId(
                            new DefaultReference.Builder()
                                .keys(
                                    new DefaultKey.Builder()
                                        .type(KeyTypes.GLOBAL_REFERENCE)
                                        .value("http://acplt.org/Ranges/ExampleRange")
                                        .build())
                                .type(ReferenceTypes.EXTERNAL_REFERENCE)
                                .build())
                        .min("0")
                        .max("100")
                        .valueType(DataTypeDefXsd.INT)
                        .build())
                .build())
        .submodelElements(
            new DefaultSubmodelElementCollection.Builder()
                .idShort("ExampleSubmodelElementCollection")
                .category("PARAMETER")
                .description(
                    Arrays.asList(
                        new DefaultLangStringTextType.Builder()
                            .text("Example SubmodelElementCollection object")
                            .language("en-us")
                            .build(),
                        new DefaultLangStringTextType.Builder()
                            .text("Beispiel SubmodelElementCollection Element")
                            .language("de")
                            .build()))
                .semanticId(
                    new DefaultReference.Builder()
                        .keys(
                            new DefaultKey.Builder()
                                .type(KeyTypes.GLOBAL_REFERENCE)
                                .value(
                                    "http://acplt.org/SubmodelElementCollections/ExampleSubmodelElementCollection")
                                .build())
                        .type(ReferenceTypes.EXTERNAL_REFERENCE)
                        .build())
                .value(
                    new DefaultBlob.Builder()
                        .idShort("ExampleBlob")
                        .category("PARAMETER")
                        .description(
                            Arrays.asList(
                                new DefaultLangStringTextType.Builder()
                                    .text("Example Blob object")
                                    .language("en-us")
                                    .build(),
                                new DefaultLangStringTextType.Builder()
                                    .text("Beispiel Blob Element")
                                    .language("de")
                                    .build()))
                        .semanticId(
                            new DefaultReference.Builder()
                                .keys(
                                    new DefaultKey.Builder()
                                        .type(KeyTypes.GLOBAL_REFERENCE)
                                        .value("http://acplt.org/Blobs/ExampleBlob")
                                        .build())
                                .type(ReferenceTypes.EXTERNAL_REFERENCE)
                                .build())
                        .contentType("application/pdf")
                        .value(Base64.getDecoder().decode("AQIDBAU="))
                        .build())
                .value(
                    new DefaultFile.Builder()
                        .idShort("ExampleFile")
                        .category("PARAMETER")
                        .description(
                            Arrays.asList(
                                new DefaultLangStringTextType.Builder()
                                    .text("Example File object")
                                    .language("en-us")
                                    .build(),
                                new DefaultLangStringTextType.Builder()
                                    .text("Beispiel File Element")
                                    .language("de")
                                    .build()))
                        .semanticId(
                            new DefaultReference.Builder()
                                .keys(
                                    new DefaultKey.Builder()
                                        .type(KeyTypes.GLOBAL_REFERENCE)
                                        .value("http://acplt.org/Files/ExampleFile")
                                        .build())
                                .type(ReferenceTypes.EXTERNAL_REFERENCE)
                                .build())
                        .value("file:///TestFile.pdf")
                        .contentType("application/pdf")
                        .build())
                .value(
                    new DefaultReferenceElement.Builder()
                        .idShort("ExampleReferenceElement")
                        .category("PARAMETER")
                        .description(
                            Arrays.asList(
                                new DefaultLangStringTextType.Builder()
                                    .text("Example Reference Element object")
                                    .language("en-us")
                                    .build(),
                                new DefaultLangStringTextType.Builder()
                                    .text("Beispiel Reference Element Element")
                                    .language("de")
                                    .build()))
                        .semanticId(
                            new DefaultReference.Builder()
                                .keys(
                                    new DefaultKey.Builder()
                                        .type(KeyTypes.GLOBAL_REFERENCE)
                                        .value(
                                            "http://acplt.org/ReferenceElements/ExampleReferenceElement")
                                        .build())
                                .type(ReferenceTypes.EXTERNAL_REFERENCE)
                                .build())
                        .value(
                            new DefaultReference.Builder()
                                .keys(
                                    new DefaultKey.Builder()
                                        .type(KeyTypes.SUBMODEL)
                                        .value("https://acplt.org/Test_Submodel_Missing")
                                        .build())
                                .keys(
                                    new DefaultKey.Builder()
                                        .type(KeyTypes.SUBMODEL_ELEMENT_COLLECTION)
                                        .value("ExampleSubmodelElementCollection")
                                        .build())
                                .keys(
                                    new DefaultKey.Builder()
                                        .type(KeyTypes.FILE)
                                        .value("ExampleFile")
                                        .build())
                                .type(ReferenceTypes.MODEL_REFERENCE)
                                .build())
                        .build())
                .build())
        .build();
  }

  public static Submodel createSubmodel7() {
    return new DefaultSubmodel.Builder()
        .idShort("TestSubmodelTemplate")
        .description(
            Arrays.asList(
                new DefaultLangStringTextType.Builder()
                    .text("An example submodel for the test application")
                    .language("en-us")
                    .build(),
                new DefaultLangStringTextType.Builder()
                    .text("Ein Beispiel-Teilmodell für eine Test-Anwendung")
                    .language("de")
                    .build()))
        .id("https://acplt.org/Test_Submodel_Template")
        .kind(ModellingKind.TEMPLATE)
        .administration(
            new DefaultAdministrativeInformation.Builder().version("0").revision("9").build())
        .semanticId(
            new DefaultReference.Builder()
                .keys(
                    new DefaultKey.Builder()
                        .type(KeyTypes.GLOBAL_REFERENCE)
                        .value("http://acplt.org/SubmodelTemplates/ExampleSubmodel")
                        .build())
                .type(ReferenceTypes.EXTERNAL_REFERENCE)
                .build())
        .kind(ModellingKind.TEMPLATE)
        .submodelElements(
            new DefaultRelationshipElement.Builder()
                .idShort("ExampleRelationshipElement")
                .category("PARAMETER")
                .description(
                    Arrays.asList(
                        new DefaultLangStringTextType.Builder()
                            .text("Example RelationshipElement object")
                            .language("en-us")
                            .build(),
                        new DefaultLangStringTextType.Builder()
                            .text("Beispiel RelationshipElement Element")
                            .language("de")
                            .build()))
                .semanticId(
                    new DefaultReference.Builder()
                        .keys(
                            new DefaultKey.Builder()
                                .type(KeyTypes.GLOBAL_REFERENCE)
                                .value(
                                    "http://acplt.org/RelationshipElements/ExampleRelationshipElement")
                                .build())
                        .type(ReferenceTypes.EXTERNAL_REFERENCE)
                        .build())
                .first(
                    new DefaultReference.Builder()
                        .keys(
                            new DefaultKey.Builder()
                                .type(KeyTypes.SUBMODEL)
                                .value("https://acplt.org/Test_Submodel_Template")
                                .build())
                        .keys(
                            new DefaultKey.Builder()
                                .type(KeyTypes.OPERATION)
                                .value("ExampleOperation")
                                .build())
                        .keys(
                            new DefaultKey.Builder()
                                .type(KeyTypes.PROPERTY)
                                .value("ExampleProperty")
                                .build())
                        .type(ReferenceTypes.MODEL_REFERENCE)
                        .build())
                .second(
                    new DefaultReference.Builder()
                        .keys(
                            new DefaultKey.Builder()
                                .type(KeyTypes.SUBMODEL)
                                .value("https://acplt.org/Test_Submodel_Template")
                                .build())
                        .keys(
                            new DefaultKey.Builder()
                                .type(KeyTypes.OPERATION)
                                .value("ExampleOperation")
                                .build())
                        .keys(
                            new DefaultKey.Builder()
                                .type(KeyTypes.PROPERTY)
                                .value("ExampleProperty")
                                .build())
                        .type(ReferenceTypes.MODEL_REFERENCE)
                        .build())
                .build())
        .submodelElements(
            new DefaultAnnotatedRelationshipElement.Builder()
                .idShort("ExampleAnnotatedRelationshipElement")
                .category("PARAMETER")
                .description(
                    Arrays.asList(
                        new DefaultLangStringTextType.Builder()
                            .text("Example AnnotatedRelationshipElement object")
                            .language("en-us")
                            .build(),
                        new DefaultLangStringTextType.Builder()
                            .text("Beispiel AnnotatedRelationshipElement Element")
                            .language("de")
                            .build()))
                .semanticId(
                    new DefaultReference.Builder()
                        .keys(
                            new DefaultKey.Builder()
                                .type(KeyTypes.GLOBAL_REFERENCE)
                                .value(
                                    "http://acplt.org/RelationshipElements/ExampleAnnotatedRelationshipElement")
                                .build())
                        .type(ReferenceTypes.EXTERNAL_REFERENCE)
                        .build())
                .first(
                    new DefaultReference.Builder()
                        .keys(
                            new DefaultKey.Builder()
                                .type(KeyTypes.SUBMODEL)
                                .value("https://acplt.org/Test_Submodel_Template")
                                .build())
                        .keys(
                            new DefaultKey.Builder()
                                .type(KeyTypes.OPERATION)
                                .value("ExampleOperation")
                                .build())
                        .keys(
                            new DefaultKey.Builder()
                                .type(KeyTypes.PROPERTY)
                                .value("ExampleProperty")
                                .build())
                        .type(ReferenceTypes.MODEL_REFERENCE)
                        .build())
                .second(
                    new DefaultReference.Builder()
                        .keys(
                            new DefaultKey.Builder()
                                .type(KeyTypes.SUBMODEL)
                                .value("https://acplt.org/Test_Submodel_Template")
                                .build())
                        .keys(
                            new DefaultKey.Builder()
                                .type(KeyTypes.OPERATION)
                                .value("ExampleOperation")
                                .build())
                        .keys(
                            new DefaultKey.Builder()
                                .type(KeyTypes.PROPERTY)
                                .value("ExampleProperty")
                                .build())
                        .type(ReferenceTypes.MODEL_REFERENCE)
                        .build())
                .build())
        .submodelElements(
            new DefaultOperation.Builder()
                .idShort("ExampleOperation")
                .category("PARAMETER")
                .description(
                    Arrays.asList(
                        new DefaultLangStringTextType.Builder()
                            .text("Example Operation object")
                            .language("en-us")
                            .build(),
                        new DefaultLangStringTextType.Builder()
                            .text("Beispiel Operation Element")
                            .language("de")
                            .build()))
                .semanticId(
                    new DefaultReference.Builder()
                        .keys(
                            new DefaultKey.Builder()
                                .type(KeyTypes.GLOBAL_REFERENCE)
                                .value("http://acplt.org/Operations/ExampleOperation")
                                .build())
                        .type(ReferenceTypes.EXTERNAL_REFERENCE)
                        .build())
                .inputVariables(
                    new DefaultOperationVariable.Builder()
                        .value(
                            new DefaultProperty.Builder()
                                .idShort("ExampleProperty")
                                .category("CONSTANT")
                                .description(
                                    Arrays.asList(
                                        new DefaultLangStringTextType.Builder()
                                            .text("Example Property object")
                                            .language("en-us")
                                            .build(),
                                        new DefaultLangStringTextType.Builder()
                                            .text("Beispiel Property Element")
                                            .language("de")
                                            .build()))
                                .semanticId(
                                    new DefaultReference.Builder()
                                        .keys(
                                            new DefaultKey.Builder()
                                                .type(KeyTypes.GLOBAL_REFERENCE)
                                                .value(
                                                    "http://acplt.org/Properties/ExampleProperty")
                                                .build())
                                        .type(ReferenceTypes.EXTERNAL_REFERENCE)
                                        .build())
                                .value(null)
                                .valueType(DataTypeDefXsd.STRING)
                                .build())
                        .build())
                .outputVariables(
                    new DefaultOperationVariable.Builder()
                        .value(
                            new DefaultProperty.Builder()
                                .idShort("ExampleProperty")
                                .category("CONSTANT")
                                .description(
                                    Arrays.asList(
                                        new DefaultLangStringTextType.Builder()
                                            .text("Example Property object")
                                            .language("en-us")
                                            .build(),
                                        new DefaultLangStringTextType.Builder()
                                            .text("Beispiel Property Element")
                                            .language("de")
                                            .build()))
                                .semanticId(
                                    new DefaultReference.Builder()
                                        .keys(
                                            new DefaultKey.Builder()
                                                .type(KeyTypes.GLOBAL_REFERENCE)
                                                .value(
                                                    "http://acplt.org/Properties/ExampleProperty")
                                                .build())
                                        .type(ReferenceTypes.EXTERNAL_REFERENCE)
                                        .build())
                                .value(null)
                                .valueType(DataTypeDefXsd.STRING)
                                .build())
                        .build())
                .inoutputVariables(
                    new DefaultOperationVariable.Builder()
                        .value(
                            new DefaultProperty.Builder()
                                .idShort("ExampleProperty")
                                .category("CONSTANT")
                                .description(
                                    Arrays.asList(
                                        new DefaultLangStringTextType.Builder()
                                            .text("Example Property object")
                                            .language("en-us")
                                            .build(),
                                        new DefaultLangStringTextType.Builder()
                                            .text("Beispiel Property Element")
                                            .language("de")
                                            .build()))
                                .semanticId(
                                    new DefaultReference.Builder()
                                        .keys(
                                            new DefaultKey.Builder()
                                                .type(KeyTypes.GLOBAL_REFERENCE)
                                                .value(
                                                    "http://acplt.org/Properties/ExampleProperty")
                                                .build())
                                        .type(ReferenceTypes.EXTERNAL_REFERENCE)
                                        .build())
                                .value(null)
                                .valueType(DataTypeDefXsd.STRING)
                                .build())
                        .build())
                .build())
        .submodelElements(
            new DefaultCapability.Builder()
                .idShort("ExampleCapability")
                .category("PARAMETER")
                .description(
                    Arrays.asList(
                        new DefaultLangStringTextType.Builder()
                            .text("Example Capability object")
                            .language("en-us")
                            .build(),
                        new DefaultLangStringTextType.Builder()
                            .text("Beispiel Capability Element")
                            .language("de")
                            .build()))
                .semanticId(
                    new DefaultReference.Builder()
                        .keys(
                            new DefaultKey.Builder()
                                .type(KeyTypes.GLOBAL_REFERENCE)
                                .value("http://acplt.org/Capabilities/ExampleCapability")
                                .build())
                        .type(ReferenceTypes.EXTERNAL_REFERENCE)
                        .build())
                .build())
        .submodelElements(
            new DefaultBasicEventElement.Builder()
                .idShort("ExampleBasicEvent")
                .category("PARAMETER")
                .direction(Direction.OUTPUT)
                .state(StateOfEvent.OFF)
                .description(
                    Arrays.asList(
                        new DefaultLangStringTextType.Builder()
                            .text("Example BasicEvent object")
                            .language("en-us")
                            .build(),
                        new DefaultLangStringTextType.Builder()
                            .text("Beispiel BasicEvent Element")
                            .language("de")
                            .build()))
                .semanticId(
                    new DefaultReference.Builder()
                        .keys(
                            new DefaultKey.Builder()
                                .type(KeyTypes.GLOBAL_REFERENCE)
                                .value("http://acplt.org/Events/ExampleBasicEvent")
                                .build())
                        .type(ReferenceTypes.EXTERNAL_REFERENCE)
                        .build())
                .observed(
                    new DefaultReference.Builder()
                        .keys(
                            new DefaultKey.Builder()
                                .type(KeyTypes.SUBMODEL)
                                .value("https://acplt.org/Test_Submodel_Template")
                                .build())
                        .keys(
                            new DefaultKey.Builder()
                                .type(KeyTypes.OPERATION)
                                .value("ExampleOperation")
                                .build())
                        .keys(
                            new DefaultKey.Builder()
                                .type(KeyTypes.PROPERTY)
                                .value("ExampleProperty")
                                .build())
                        .type(ReferenceTypes.MODEL_REFERENCE)
                        .build())
                .build())
        .submodelElements(
            new DefaultSubmodelElementList.Builder()
                .idShort("ExampleSubmodelElementListOrdered")
                .category("PARAMETER")
                .orderRelevant(true)
                .description(
                    Arrays.asList(
                        new DefaultLangStringTextType.Builder()
                            .text("Example SubmodelElementListOrdered object")
                            .language("en-us")
                            .build(),
                        new DefaultLangStringTextType.Builder()
                            .text("Beispiel SubmodelElementListOrdered Element")
                            .language("de")
                            .build()))
                .semanticId(
                    new DefaultReference.Builder()
                        .keys(
                            new DefaultKey.Builder()
                                .type(KeyTypes.GLOBAL_REFERENCE)
                                .value(
                                    "http://acplt.org/SubmodelElementLists/ExampleSubmodelElementListOrdered")
                                .build())
                        .type(ReferenceTypes.EXTERNAL_REFERENCE)
                        .build())
                .typeValueListElement(AasSubmodelElements.SUBMODEL_ELEMENT)
                .value(
                    new DefaultProperty.Builder()
                        .idShort("ExampleProperty")
                        .category("CONSTANT")
                        .description(
                            Arrays.asList(
                                new DefaultLangStringTextType.Builder()
                                    .text("Example Property object")
                                    .language("en-us")
                                    .build(),
                                new DefaultLangStringTextType.Builder()
                                    .text("Beispiel Property Element")
                                    .language("de")
                                    .build()))
                        .semanticId(
                            new DefaultReference.Builder()
                                .keys(
                                    new DefaultKey.Builder()
                                        .type(KeyTypes.GLOBAL_REFERENCE)
                                        .value("http://acplt.org/Properties/ExampleProperty")
                                        .build())
                                .type(ReferenceTypes.EXTERNAL_REFERENCE)
                                .build())
                        .value(null)
                        .valueType(DataTypeDefXsd.STRING)
                        .build())
                .value(
                    new DefaultMultiLanguageProperty.Builder()
                        .idShort("ExampleMultiLanguageProperty")
                        .category("CONSTANT")
                        .description(
                            Arrays.asList(
                                new DefaultLangStringTextType.Builder()
                                    .text("Example MultiLanguageProperty object")
                                    .language("en-us")
                                    .build(),
                                new DefaultLangStringTextType.Builder()
                                    .text("Beispiel MultiLanguageProperty Element")
                                    .language("de")
                                    .build()))
                        .semanticId(
                            new DefaultReference.Builder()
                                .keys(
                                    new DefaultKey.Builder()
                                        .type(KeyTypes.GLOBAL_REFERENCE)
                                        .value(
                                            "http://acplt.org/MultiLanguageProperties/ExampleMultiLanguageProperty")
                                        .build())
                                .type(ReferenceTypes.EXTERNAL_REFERENCE)
                                .build())
                        .build())
                .value(
                    new DefaultRange.Builder()
                        .idShort("ExampleRange")
                        .category("PARAMETER")
                        .description(
                            Arrays.asList(
                                new DefaultLangStringTextType.Builder()
                                    .text("Example Range object")
                                    .language("en-us")
                                    .build(),
                                new DefaultLangStringTextType.Builder()
                                    .text("Beispiel Range Element")
                                    .language("de")
                                    .build()))
                        .semanticId(
                            new DefaultReference.Builder()
                                .keys(
                                    new DefaultKey.Builder()
                                        .type(KeyTypes.GLOBAL_REFERENCE)
                                        .value("http://acplt.org/Ranges/ExampleRange")
                                        .build())
                                .type(ReferenceTypes.EXTERNAL_REFERENCE)
                                .build())
                        .min(null)
                        .max("100")
                        .valueType(DataTypeDefXsd.INT)
                        .build())
                .value(
                    new DefaultRange.Builder()
                        .idShort("ExampleRange2")
                        .category("PARAMETER")
                        .description(
                            Arrays.asList(
                                new DefaultLangStringTextType.Builder()
                                    .text("Example Range object")
                                    .language("en-us")
                                    .build(),
                                new DefaultLangStringTextType.Builder()
                                    .text("Beispiel Range Element")
                                    .language("de")
                                    .build()))
                        .semanticId(
                            new DefaultReference.Builder()
                                .keys(
                                    new DefaultKey.Builder()
                                        .type(KeyTypes.GLOBAL_REFERENCE)
                                        .value("http://acplt.org/Ranges/ExampleRange")
                                        .build())
                                .type(ReferenceTypes.EXTERNAL_REFERENCE)
                                .build())
                        .min("0")
                        .max(null)
                        .valueType(DataTypeDefXsd.INT)
                        .build())
                .build())
        .submodelElements(
            new DefaultSubmodelElementCollection.Builder()
                .idShort("ExampleSubmodelElementCollection")
                .category("PARAMETER")
                .description(
                    Arrays.asList(
                        new DefaultLangStringTextType.Builder()
                            .text("Example SubmodelElementCollection object")
                            .language("en-us")
                            .build(),
                        new DefaultLangStringTextType.Builder()
                            .text("Beispiel SubmodelElementCollection Element")
                            .language("de")
                            .build()))
                .semanticId(
                    new DefaultReference.Builder()
                        .keys(
                            new DefaultKey.Builder()
                                .type(KeyTypes.GLOBAL_REFERENCE)
                                .value(
                                    "http://acplt.org/SubmodelElementCollections/ExampleSubmodelElementCollection")
                                .build())
                        .type(ReferenceTypes.EXTERNAL_REFERENCE)
                        .build())
                .value(
                    new DefaultBlob.Builder()
                        .idShort("ExampleBlob")
                        .category("PARAMETER")
                        .description(
                            Arrays.asList(
                                new DefaultLangStringTextType.Builder()
                                    .text("Example Blob object")
                                    .language("en-us")
                                    .build(),
                                new DefaultLangStringTextType.Builder()
                                    .text("Beispiel Blob Element")
                                    .language("de")
                                    .build()))
                        .semanticId(
                            new DefaultReference.Builder()
                                .keys(
                                    new DefaultKey.Builder()
                                        .type(KeyTypes.GLOBAL_REFERENCE)
                                        .value("http://acplt.org/Blobs/ExampleBlob")
                                        .build())
                                .type(ReferenceTypes.EXTERNAL_REFERENCE)
                                .build())
                        .contentType("application/pdf")
                        .build())
                .value(
                    new DefaultFile.Builder()
                        .idShort("ExampleFile")
                        .category("PARAMETER")
                        .description(
                            Arrays.asList(
                                new DefaultLangStringTextType.Builder()
                                    .text("Example File object")
                                    .language("en-us")
                                    .build(),
                                new DefaultLangStringTextType.Builder()
                                    .text("Beispiel File Element")
                                    .language("de")
                                    .build()))
                        .semanticId(
                            new DefaultReference.Builder()
                                .keys(
                                    new DefaultKey.Builder()
                                        .type(KeyTypes.GLOBAL_REFERENCE)
                                        .value("http://acplt.org/Files/ExampleFile")
                                        .build())
                                .type(ReferenceTypes.EXTERNAL_REFERENCE)
                                .build())
                        .value(null)
                        .contentType("application/pdf")
                        .build())
                .value(
                    new DefaultReferenceElement.Builder()
                        .idShort("ExampleReferenceElement")
                        .category("PARAMETER")
                        .description(
                            Arrays.asList(
                                new DefaultLangStringTextType.Builder()
                                    .text("Example Reference Element object")
                                    .language("en-us")
                                    .build(),
                                new DefaultLangStringTextType.Builder()
                                    .text("Beispiel Reference Element Element")
                                    .language("de")
                                    .build()))
                        .semanticId(
                            new DefaultReference.Builder()
                                .keys(
                                    new DefaultKey.Builder()
                                        .type(KeyTypes.GLOBAL_REFERENCE)
                                        .value(
                                            "http://acplt.org/ReferenceElements/ExampleReferenceElement")
                                        .build())
                                .type(ReferenceTypes.EXTERNAL_REFERENCE)
                                .build())
                        .build())
                .build())
        .submodelElements(
            new DefaultSubmodelElementCollection.Builder()
                .idShort("ExampleSubmodelElementCollection2")
                .category("PARAMETER")
                .description(
                    Arrays.asList(
                        new DefaultLangStringTextType.Builder()
                            .text("Example SubmodelElementCollection object")
                            .language("en-us")
                            .build(),
                        new DefaultLangStringTextType.Builder()
                            .text("Beispiel SubmodelElementCollection Element")
                            .language("de")
                            .build()))
                .semanticId(
                    new DefaultReference.Builder()
                        .keys(
                            new DefaultKey.Builder()
                                .type(KeyTypes.GLOBAL_REFERENCE)
                                .value(
                                    "http://acplt.org/SubmodelElementCollections/ExampleSubmodelElementCollection")
                                .build())
                        .type(ReferenceTypes.EXTERNAL_REFERENCE)
                        .build())
                .build())
        .build();
  }

  public static ConceptDescription createConceptDescription1() {
    return new DefaultConceptDescription.Builder()
        .idShort("TestConceptDescription")
        .description(
            Arrays.asList(
                new DefaultLangStringTextType.Builder()
                    .text("An example concept description for the test application")
                    .language("en-us")
                    .build(),
                new DefaultLangStringTextType.Builder()
                    .text("Ein Beispiel-ConceptDescription für eine Test-Anwendung")
                    .language("de")
                    .build()))
        .id("https://acplt.org/Test_ConceptDescription")
        .administration(
            new DefaultAdministrativeInformation.Builder().version("0").revision("9").build())
        .isCaseOf(
            new DefaultReference.Builder()
                .keys(
                    new DefaultKey.Builder()
                        .type(KeyTypes.GLOBAL_REFERENCE)
                        .value(
                            "http://acplt.org/DataSpecifications/Conceptdescription/TestConceptDescription")
                        .build())
                .type(ReferenceTypes.EXTERNAL_REFERENCE)
                .build())
        .build();
  }

  public static ConceptDescription createConceptDescription2() {
    return new DefaultConceptDescription.Builder()
        .idShort("Test_ConceptDescription_Mandatory")
        .id("https://acplt.org/Test_ConceptDescription_Mandatory")
        .build();
  }

  public static ConceptDescription createConceptDescription3() {
    return new DefaultConceptDescription.Builder()
        .idShort("TestConceptDescription1")
        .description(
            Arrays.asList(
                new DefaultLangStringTextType.Builder()
                    .text("An example concept description for the test application")
                    .language("en-us")
                    .build(),
                new DefaultLangStringTextType.Builder()
                    .text("Ein Beispiel-ConceptDescription für eine Test-Anwendung")
                    .language("de")
                    .build()))
        .id("https://acplt.org/Test_ConceptDescription_Missing")
        .category("PROPERTY")
        .administration(
            new DefaultAdministrativeInformation.Builder().version("0").revision("9").build())
        .build();
  }

  public static ConceptDescription createConceptDescription4() {
    return new DefaultConceptDescription.Builder()
        .idShort("TestSpec_01")
        .id("http://acplt.org/DataSpecifciations/Example/Identification")
        .administration(
            new DefaultAdministrativeInformation.Builder().version("0").revision("9").build())
        .isCaseOf(
            new DefaultReference.Builder()
                .keys(
                    new DefaultKey.Builder()
                        .type(KeyTypes.GLOBAL_REFERENCE)
                        .value("http://acplt.org/ReferenceElements/ConceptDescriptionX")
                        .build())
                .type(ReferenceTypes.EXTERNAL_REFERENCE)
                .build())
        .embeddedDataSpecifications(
            new DefaultEmbeddedDataSpecification.Builder()
                .dataSpecification(
                    new DefaultReference.Builder()
                        .type(ReferenceTypes.EXTERNAL_REFERENCE)
                        .keys(
                            new DefaultKey.Builder()
                                .type(KeyTypes.GLOBAL_REFERENCE)
                                .value(AAS_3_0_RC_02_DATA_SPECIFICATION_IEC_61360)
                                .build())
                        .build())
                .dataSpecificationContent(
                    new DefaultDataSpecificationIec61360.Builder()
                        .preferredName(
                            Arrays.asList(
                                new DefaultLangStringPreferredNameTypeIec61360.Builder()
                                    .text("Test Specification")
                                    .language("de")
                                    .build(),
                                new DefaultLangStringPreferredNameTypeIec61360.Builder()
                                    .text("TestSpecification")
                                    .language("en-us")
                                    .build()))
                        .dataType(DataTypeIec61360.REAL_MEASURE)
                        .definition(
                            new DefaultLangStringDefinitionTypeIec61360.Builder()
                                .text("Dies ist eine Data Specification für Testzwecke")
                                .language("de")
                                .build())
                        .definition(
                            new DefaultLangStringDefinitionTypeIec61360.Builder()
                                .text("This is a DataSpecification for testing purposes")
                                .language("en-us")
                                .build())
                        .shortName(
                            new DefaultLangStringShortNameTypeIec61360.Builder()
                                .text("Test Spec")
                                .language("de")
                                .build())
                        .shortName(
                            new DefaultLangStringShortNameTypeIec61360.Builder()
                                .text("TestSpec")
                                .language("en-us")
                                .build())
                        .unit("SpaceUnit")
                        .unitId(
                            new DefaultReference.Builder()
                                .keys(
                                    new DefaultKey.Builder()
                                        .type(KeyTypes.GLOBAL_REFERENCE)
                                        .value("http://acplt.org/Units/SpaceUnit")
                                        .build())
                                .type(ReferenceTypes.EXTERNAL_REFERENCE)
                                .build())
                        .sourceOfDefinition("http://acplt.org/DataSpec/ExampleDef")
                        .symbol("SU")
                        .valueFormat("string")
                        .value("TEST")
                        .levelType(new DefaultLevelType.Builder().max(true).build())
                        .valueList(
                            new DefaultValueList.Builder()
                                .valueReferencePairs(
                                    new DefaultValueReferencePair.Builder()
                                        .value("http://acplt.org/ValueId/ExampleValueId")
                                        .valueId(
                                            new DefaultReference.Builder()
                                                .keys(
                                                    new DefaultKey.Builder()
                                                        .type(KeyTypes.GLOBAL_REFERENCE)
                                                        .value(
                                                            "http://acplt.org/ValueId/ExampleValueId")
                                                        .build())
                                                .type(ReferenceTypes.EXTERNAL_REFERENCE)
                                                .build())
                                        .build())
                                .valueReferencePairs(
                                    new DefaultValueReferencePair.Builder()
                                        .value("http://acplt.org/ValueId/ExampleValueId2")
                                        .valueId(
                                            new DefaultReference.Builder()
                                                .keys(
                                                    new DefaultKey.Builder()
                                                        .type(KeyTypes.GLOBAL_REFERENCE)
                                                        .value(
                                                            "http://acplt.org/ValueId/ExampleValueId2")
                                                        .build())
                                                .type(ReferenceTypes.EXTERNAL_REFERENCE)
                                                .build())
                                        .build())
                                .build())
                        .build())
                .build())
        .build();
  }

  public static Environment createEnvironment() {
    return new DefaultEnvironment.Builder()
        .assetAdministrationShells(
            Arrays.asList(createAAS1(), createAAS2(), createAAS3(), createAAS4()))
        .submodels(
            Arrays.asList(
                createSubmodel1(),
                createSubmodel2(),
                createSubmodel3(),
                createSubmodel4(),
                createSubmodel5(),
                createSubmodel6(),
                createSubmodel7()))
        .conceptDescriptions(
            Arrays.asList(
                createConceptDescription1(),
                createConceptDescription2(),
                createConceptDescription3(),
                createConceptDescription4()))
        .build();
  }
}
