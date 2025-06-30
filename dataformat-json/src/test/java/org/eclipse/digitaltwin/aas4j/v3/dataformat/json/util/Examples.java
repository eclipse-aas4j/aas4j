/*
 * Copyright 2022 jab.
 * Copyright (c) 2023 SAP SE
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.eclipse.digitaltwin.aas4j.v3.dataformat.json.util;

import org.eclipse.digitaltwin.aas4j.v3.dataformat.core.AASFull;
import org.eclipse.digitaltwin.aas4j.v3.dataformat.core.AASSimple;
import org.eclipse.digitaltwin.aas4j.v3.model.AdministrativeInformation;
import org.eclipse.digitaltwin.aas4j.v3.model.AssetAdministrationShell;
import org.eclipse.digitaltwin.aas4j.v3.model.AssetAdministrationShellDescriptor;
import org.eclipse.digitaltwin.aas4j.v3.model.AssetKind;
import org.eclipse.digitaltwin.aas4j.v3.model.ConceptDescription;
import org.eclipse.digitaltwin.aas4j.v3.model.DataTypeDefXsd;
import org.eclipse.digitaltwin.aas4j.v3.model.EmbeddedDataSpecification;
import org.eclipse.digitaltwin.aas4j.v3.model.Environment;
import org.eclipse.digitaltwin.aas4j.v3.model.Key;
import org.eclipse.digitaltwin.aas4j.v3.model.KeyTypes;
import org.eclipse.digitaltwin.aas4j.v3.model.LangStringNameType;
import org.eclipse.digitaltwin.aas4j.v3.model.LangStringTextType;
import org.eclipse.digitaltwin.aas4j.v3.model.OperationRequest;
import org.eclipse.digitaltwin.aas4j.v3.model.Reference;
import org.eclipse.digitaltwin.aas4j.v3.model.ReferenceTypes;
import org.eclipse.digitaltwin.aas4j.v3.model.SecurityTypeEnum;
import org.eclipse.digitaltwin.aas4j.v3.model.SpecificAssetId;
import org.eclipse.digitaltwin.aas4j.v3.model.Submodel;
import org.eclipse.digitaltwin.aas4j.v3.model.SubmodelDescriptor;
import org.eclipse.digitaltwin.aas4j.v3.model.SubmodelElement;
import org.eclipse.digitaltwin.aas4j.v3.model.SubmodelElementCollection;
import org.eclipse.digitaltwin.aas4j.v3.model.SubmodelElementList;
import org.eclipse.digitaltwin.aas4j.v3.model.impl.DefaultAdministrativeInformation;
import org.eclipse.digitaltwin.aas4j.v3.model.impl.DefaultAssetAdministrationShell;
import org.eclipse.digitaltwin.aas4j.v3.model.impl.DefaultAssetAdministrationShellDescriptor;
import org.eclipse.digitaltwin.aas4j.v3.model.impl.DefaultAssetInformation;
import org.eclipse.digitaltwin.aas4j.v3.model.impl.DefaultConceptDescription;
import org.eclipse.digitaltwin.aas4j.v3.model.impl.DefaultDataSpecificationIec61360;
import org.eclipse.digitaltwin.aas4j.v3.model.impl.DefaultEmbeddedDataSpecification;
import org.eclipse.digitaltwin.aas4j.v3.model.impl.DefaultEndpoint;
import org.eclipse.digitaltwin.aas4j.v3.model.impl.DefaultEnvironment;
import org.eclipse.digitaltwin.aas4j.v3.model.impl.DefaultKey;
import org.eclipse.digitaltwin.aas4j.v3.model.impl.DefaultLangStringNameType;
import org.eclipse.digitaltwin.aas4j.v3.model.impl.DefaultLangStringPreferredNameTypeIec61360;
import org.eclipse.digitaltwin.aas4j.v3.model.impl.DefaultLangStringTextType;
import org.eclipse.digitaltwin.aas4j.v3.model.impl.DefaultOperationRequest;
import org.eclipse.digitaltwin.aas4j.v3.model.impl.DefaultOperationVariable;
import org.eclipse.digitaltwin.aas4j.v3.model.impl.DefaultProperty;
import org.eclipse.digitaltwin.aas4j.v3.model.impl.DefaultProtocolInformation;
import org.eclipse.digitaltwin.aas4j.v3.model.impl.DefaultReference;
import org.eclipse.digitaltwin.aas4j.v3.model.impl.DefaultResource;
import org.eclipse.digitaltwin.aas4j.v3.model.impl.DefaultSecurityAttributeObject;
import org.eclipse.digitaltwin.aas4j.v3.model.impl.DefaultSpecificAssetId;
import org.eclipse.digitaltwin.aas4j.v3.model.impl.DefaultSubmodelDescriptor;
import org.eclipse.digitaltwin.aas4j.v3.model.impl.DefaultSubmodelElementList;

import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;
import java.util.List;

public class Examples {

    private static final String DEFAULT_IDENTIFICATION = "identification";

    private static final Reference DEFAULT_SEMANTIC_ID =
            new DefaultReference.Builder().type(ReferenceTypes.EXTERNAL_REFERENCE)
                    .keys(new DefaultKey.Builder().type(KeyTypes.GLOBAL_REFERENCE).value("eClassDefaultSemanticId").build())
                    .build();

    private static final EmbeddedDataSpecification DEFAULT_EMBEDDED_DATA_SPECIFICATION = new DefaultEmbeddedDataSpecification.Builder()
            .dataSpecificationContent(new DefaultDataSpecificationIec61360.Builder()
                    .preferredName(
                            new DefaultLangStringPreferredNameTypeIec61360.Builder().language("en").text("defaultPreferredName").build())
                    .build())
            .dataSpecification(createGlobalReference("defaultEmbeddedDataSpecificationDataSpecificationValue")).build();

    private static final AdministrativeInformation DEFAULT_ADMINISTRATIVE_INFORMATION =
            new DefaultAdministrativeInformation.Builder()
                    .embeddedDataSpecifications(DEFAULT_EMBEDDED_DATA_SPECIFICATION)
                    .revision("1")
                    .version("1").build();

    private static final List<LangStringTextType> DEFAULT_DESCRIPTION = List.of(createLangStringTextType("en", "defaultDescription"));

    private static final List<LangStringNameType> DEFAULT_DISPLAY_NAME = List.of(createLangStringNameType("en", "defaultDisplayName"));

    private static final String DEFAULT_ID_SHORT = "defaultIdShort";

    private static LangStringTextType createLangStringTextType(String langCode, String text) {
        return new DefaultLangStringTextType.Builder().language(langCode).text(text).build();
    }

    private static LangStringNameType createLangStringNameType(String langCode, String text) {
        return new DefaultLangStringNameType.Builder().language(langCode).text(text).build();
    }

    private static Reference createReference(ReferenceTypes type, KeyTypes keyType, String value) {
        return new DefaultReference.Builder().type(type).keys(createKey(keyType, value)).build();
    }

    private static Reference createGlobalReference(String value) {
        return createReference(ReferenceTypes.EXTERNAL_REFERENCE, KeyTypes.GLOBAL_REFERENCE, value);
    }

    private static DefaultEndpoint.Builder createEndpointBuilder() {

        String DEFAULT_INTERFACE_VALUE = "defaultInterface";

        return new DefaultEndpoint.Builder()
                .protocolInformation(createProtocolInformationBuilder().build())
                ._interface(DEFAULT_INTERFACE_VALUE);
    }

    private static Key createKey(KeyTypes type, String value) {
        return new DefaultKey.Builder().type(type).value(value).build();
    }

    private static DefaultProtocolInformation.Builder createProtocolInformationBuilder() {
        return new DefaultProtocolInformation.Builder()
                .href("defaultEndpointAddress")
                .endpointProtocol("defaultEndpointProtocol")
                .endpointProtocolVersion(List.of("defaultEndpointProtocolVersion"))
                .subprotocol("defaultSubprotocol")
                .subprotocolBody("defaultSubprotocolBody")
                .subprotocolBodyEncoding("defaultSubprotocolBodyEncoding")
                .securityAttributes(new DefaultSecurityAttributeObject.Builder()
                        .key("NONE")
                        .type(SecurityTypeEnum.NONE)
                        .value("NONE")
                        .build());
    }

    private static SpecificAssetId createSpecificAssetId() {
        return new DefaultSpecificAssetId.Builder()
                .name("testSpecificAssetId")
                .value("testValue")
                .build();
    }

    private static AssetAdministrationShellDescriptor createAasDescriptor() {

        SpecificAssetId specificAssetId = new DefaultSpecificAssetId.Builder()
                .semanticId(DEFAULT_SEMANTIC_ID)
                .externalSubjectId(createReference(
                        ReferenceTypes.MODEL_REFERENCE, KeyTypes.ASSET_ADMINISTRATION_SHELL, "defaultSpecificAssetId"))
                .name("defaultSpecificAssetIdName")
                .value("http://example.company/myAsset").build();

        return new DefaultAssetAdministrationShellDescriptor.Builder()
                .administration(DEFAULT_ADMINISTRATIVE_INFORMATION)
                .description(DEFAULT_DESCRIPTION)
                .displayName(DEFAULT_DISPLAY_NAME)
                .id(DEFAULT_IDENTIFICATION)
                .idShort(DEFAULT_ID_SHORT)
                .specificAssetIds(List.of(specificAssetId))
                .endpoints(List.of(createEndpointBuilder().build()))
                .globalAssetId("defaultGlobalAssetId")
                .submodelDescriptors(List.of(createDefaultSubmodelDescriptor())).build();
    }

    private static SubmodelDescriptor createDefaultSubmodelDescriptor () {
        return new DefaultSubmodelDescriptor.Builder()
                .administration(DEFAULT_ADMINISTRATIVE_INFORMATION)
                .description(DEFAULT_DESCRIPTION)
                .displayName(DEFAULT_DISPLAY_NAME)
                .id(DEFAULT_IDENTIFICATION)
                .idShort(DEFAULT_ID_SHORT)
                .endpoints(List.of(createEndpointBuilder().build()))
                .semanticId(DEFAULT_SEMANTIC_ID)
                .build();
    }

    private static OperationRequest createOperationRequest() {
        try {
            return new DefaultOperationRequest.Builder()
                    .inoutputArguments(new DefaultOperationVariable.Builder()
                            .value(new DefaultProperty.Builder()
                                    .valueType(DataTypeDefXsd.INT).value("42")
                                    .idShort("TheAnswerOfAllQuestions")
                                    .build())
                            .build())
                    .clientTimeoutDuration(DatatypeFactory.newInstance().newDurationDayTime("PT3M"))  // three minutes
                    .build();
        } catch (DatatypeConfigurationException e) {
            throw new RuntimeException(e);
        }
    }
    public static final ExampleData<Environment> EXAMPLE_FULL = ExampleData.of(AASFull.createEnvironment(), "Example-Full.json");

    public static final ExampleData<Environment> EXAMPLE_SIMPLE = ExampleData.of(AASSimple.createEnvironment(), "Example-Simple.json");

    public static final ExampleData<Environment> ENVIRONMENT_EMPTY = ExampleData.of(new DefaultEnvironment.Builder().build(), "Environment-Empty.json");

    public static final ExampleData<Environment> ENVIRONMENT_CUSTOM_DATA = ExampleData.of(
        org.eclipse.digitaltwin.aas4j.v3.dataformat.core.Examples.ENVIRONMENT_WITH_DUMMYDATASPEC,
        "Environment-CustomDataSpec.json");

    public static final ExampleData<AssetAdministrationShellDescriptor> SHELL_DESCRIPTOR = ExampleData.of(
        createAasDescriptor(), "AssetAdministrationShellDescriptor.json");

    public static final ExampleData<SubmodelDescriptor> SUBMODEL_DESCRIPTOR = ExampleData.of(
            createDefaultSubmodelDescriptor(), "SubmodelDescriptor.json");

    public static final ExampleData<List<AssetAdministrationShell>> ASSET_ADMINISTRATION_SHELL_LIST_OF = ExampleData.of(
            List.of(AASFull.createEnvironment().getAssetAdministrationShells().get(0),
                    AASFull.createEnvironment().getAssetAdministrationShells().get(1)),
            "AssetAdministrationShell-List.json");

    public static final ExampleData<AssetAdministrationShell> ASSET_ADMINISTRATION_SHELL_WITH_ASSET_INFORMATION = ExampleData.of(
            new DefaultAssetAdministrationShell.Builder()
                    .id("https://example.org/AssetAdministrationShell")
                    .assetInformation(new DefaultAssetInformation.Builder()
                            .assetKind(AssetKind.INSTANCE)
                            .globalAssetId("https://example.org/Asset")
                            .specificAssetIds(new DefaultSpecificAssetId.Builder()
                                    .name("ExampleAssetId")
                                    .value("ExampleValue")
                                    .externalSubjectId(new DefaultReference.Builder()
                                            .type(ReferenceTypes.EXTERNAL_REFERENCE)
                                            .keys(new DefaultKey.Builder()
                                                    .type(KeyTypes.GLOBAL_REFERENCE)
                                                    .value("https://example.org/ExternalSubject")
                                                    .build())
                                            .build())
                                    .build())
                            .defaultThumbnail(new DefaultResource.Builder()
                                    .path("file:/example.jpg")
                                    .contentType("image/jpeg")
                                    .build())
                            .build())
                    .build(),
            "AssetAdministrationShell-WithAssetInformation.json");

    public static final ExampleData<AssetAdministrationShell> ASSET_ADMINISTRATION_SHELL = ExampleData.of(AASFull.createEnvironment().getAssetAdministrationShells().get(0), "AssetAdministrationShell.json");


    public static final ExampleData<ConceptDescription> CONCEPT_DESCRIPTION_DATA_SPECIFICATION_PHYSICAL_UNIT = ExampleData.of(
            new DefaultConceptDescription.Builder()
                    .id("https://example.org/ConceptDescription")
					.category("PROPERTY")
                    .embeddedDataSpecifications(new DefaultEmbeddedDataSpecification.Builder()
                            .dataSpecification(new DefaultReference.Builder()
                                    .type(ReferenceTypes.EXTERNAL_REFERENCE)
                                    .keys(new DefaultKey.Builder()
                                            .type(KeyTypes.GLOBAL_REFERENCE)
                                            .value("https://admin-shell.io/DataSpecificationTemplates/DataSpecificationPhysicalUnit/3/0/RC02")
                                            .build())
                                    .build())
                            .build())
                    .build(),
            "ConceptDescription-DataSpecificationPhysicalUnit.json");

    public static final ExampleData<List<SubmodelElement>> SUBMODEL_ELEMENT_LIST_OF = ExampleData.of(
            List.of(AASFull.createEnvironment().getSubmodels().get(0).getSubmodelElements().get(0),
                    AASFull.createEnvironment().getSubmodels().get(0).getSubmodelElements().get(1)),
            "SubmodelElement-List.json");

    public static final ExampleData<List<Submodel>> SUBMODEL_LIST_OF = ExampleData.of(
            List.of(AASFull.createEnvironment().getSubmodels().get(0),
                    AASFull.createEnvironment().getSubmodels().get(1)),
            "Submodel-List.json");

    public static final ExampleData<Submodel> SUBMODEL = ExampleData.of(AASFull.createEnvironment().getSubmodels().get(0), "Submodel.json");

    public static final ExampleData<SubmodelElement> SUBMODEL_ELEMENT = ExampleData.of(AASFull.createEnvironment().getSubmodels().get(0).getSubmodelElements().get(0), "SubmodelElement.json");

    public static final ExampleData<SubmodelElementCollection> SUBMODEL_ELEMENT_COLLECTION = ExampleData.of((SubmodelElementCollection) AASFull.createEnvironment().getSubmodels().get(6).getSubmodelElements().get(6),
            "SubmodelElementCollection.json");

    public static final ExampleData<SubmodelElementList> SUBMODEL_ELEMENT_LIST_EMPTY = ExampleData.of(
            new DefaultSubmodelElementList.Builder()
                    .idShort("submodelElementList")
                    .orderRelevant(true)
                    .build(), "SubmodelElementList-Empty.json");

    public static final ExampleData<SubmodelElementList> SUBMODEL_ELEMENT_LIST = ExampleData.of((SubmodelElementList) AASFull.createEnvironment().getSubmodels().get(6).getSubmodelElements().get(5), "SubmodelElementList.json");

	public static final ExampleData<Environment> EXTENSION_MINIMAL = ExampleData.of(org.eclipse.digitaltwin.aas4j.v3.dataformat.core.Examples.EXTENSION_MINIMAL, "admin-shell-io/Extension/Minimal.json");

	public static final ExampleData<Environment> EXTENSION_MAXIMAL = ExampleData.of(org.eclipse.digitaltwin.aas4j.v3.dataformat.core.Examples.EXTENSION_MAXIMAL, "admin-shell-io/Extension/Maximal.json");

    public static final ExampleData<OperationRequest> OPERATION_REQUEST = ExampleData.of(
            createOperationRequest(), "OperationRequest.json");
}
