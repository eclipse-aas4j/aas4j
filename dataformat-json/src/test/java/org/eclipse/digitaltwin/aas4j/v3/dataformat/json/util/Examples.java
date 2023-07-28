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

import java.util.List;

import org.eclipse.digitaltwin.aas4j.v3.dataformat.core.AASFull;
import org.eclipse.digitaltwin.aas4j.v3.dataformat.core.AASSimple;
import org.eclipse.digitaltwin.aas4j.v3.model.AssetAdministrationShell;
import org.eclipse.digitaltwin.aas4j.v3.model.AssetKind;
import org.eclipse.digitaltwin.aas4j.v3.model.ConceptDescription;
import org.eclipse.digitaltwin.aas4j.v3.model.Environment;
import org.eclipse.digitaltwin.aas4j.v3.model.KeyTypes;
import org.eclipse.digitaltwin.aas4j.v3.model.ReferenceTypes;
import org.eclipse.digitaltwin.aas4j.v3.model.Submodel;
import org.eclipse.digitaltwin.aas4j.v3.model.SubmodelElement;
import org.eclipse.digitaltwin.aas4j.v3.model.SubmodelElementCollection;
import org.eclipse.digitaltwin.aas4j.v3.model.SubmodelElementList;
import org.eclipse.digitaltwin.aas4j.v3.model.impl.*;
import org.eclipse.digitaltwin.aas4j.v3.model.impl.DefaultSpecificAssetId;

public class Examples {

	public static final ExampleData<Environment> EXAMPLE_FULL = ExampleData.of(AASFull.createEnvironment(), "Example-Full.json");

	public static final ExampleData<Environment> EXAMPLE_SIMPLE = ExampleData.of(AASSimple.createEnvironment(), "Example-Simple.json");

    public static final ExampleData<Environment> ENVIRONMENT_EMPTY = ExampleData.of(new DefaultEnvironment.Builder().build(), "Environment-Empty.json");

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
//                            .dataSpecificationContent(new DefaultDataSpecificationPhysicalUnit.Builder()
//                                    .conversionFactor("1.0")
//                                    .eceCode("ece-code")
//                                    .eceName("ece-name")
//                                    .definition(new DefaultLangStringTextType.Builder()
//                                            .language("en")
//                                            .text("definition-en")
//                                            .build())
//                                    .definition(new DefaultLangStringTextType.Builder()
//                                            .language("de")
//                                            .text("definition-de")
//                                            .build())
//                                    .nistName("nist-name")
//                                    .dinNotation("din-notation")
//                                    .siName("si-name")
//                                    .registrationAuthorityId("registration-authority-id")
//                                    .siNotation("si-notation")
//                                    .sourceOfDefinition("source-of-definition")
//                                    .supplier("supplier")
//                                    .unitName("unit-name")
//                                    .unitSymbol("unit-symbol")
//                                    .build())
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
}
