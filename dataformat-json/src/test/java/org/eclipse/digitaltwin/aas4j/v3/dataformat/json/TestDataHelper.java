/*
 * Copyright (c) 2021 Fraunhofer-Gesellschaft zur Foerderung der angewandten Forschung e. V.
 * Copyright (C) 2023 SAP SE or an SAP affiliate company.
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
package org.eclipse.digitaltwin.aas4j.v3.dataformat.json;

import org.eclipse.digitaltwin.aas4j.v3.model.AdministrativeInformation;
import org.eclipse.digitaltwin.aas4j.v3.model.AssetAdministrationShellDescriptor;
import org.eclipse.digitaltwin.aas4j.v3.model.EmbeddedDataSpecification;
import org.eclipse.digitaltwin.aas4j.v3.model.Key;
import org.eclipse.digitaltwin.aas4j.v3.model.KeyTypes;
import org.eclipse.digitaltwin.aas4j.v3.model.LangStringNameType;
import org.eclipse.digitaltwin.aas4j.v3.model.LangStringTextType;
import org.eclipse.digitaltwin.aas4j.v3.model.Reference;
import org.eclipse.digitaltwin.aas4j.v3.model.ReferenceTypes;
import org.eclipse.digitaltwin.aas4j.v3.model.SecurityTypeEnum;
import org.eclipse.digitaltwin.aas4j.v3.model.SpecificAssetId;
import org.eclipse.digitaltwin.aas4j.v3.model.SubmodelDescriptor;
import org.eclipse.digitaltwin.aas4j.v3.model.impl.DefaultAdministrativeInformation;
import org.eclipse.digitaltwin.aas4j.v3.model.impl.DefaultAssetAdministrationShellDescriptor;
import org.eclipse.digitaltwin.aas4j.v3.model.impl.DefaultDataSpecificationIec61360;
import org.eclipse.digitaltwin.aas4j.v3.model.impl.DefaultEmbeddedDataSpecification;
import org.eclipse.digitaltwin.aas4j.v3.model.impl.DefaultEndpoint;
import org.eclipse.digitaltwin.aas4j.v3.model.impl.DefaultKey;
import org.eclipse.digitaltwin.aas4j.v3.model.impl.DefaultLangStringNameType;
import org.eclipse.digitaltwin.aas4j.v3.model.impl.DefaultLangStringPreferredNameTypeIec61360;
import org.eclipse.digitaltwin.aas4j.v3.model.impl.DefaultLangStringTextType;
import org.eclipse.digitaltwin.aas4j.v3.model.impl.DefaultProtocolInformation;
import org.eclipse.digitaltwin.aas4j.v3.model.impl.DefaultReference;
import org.eclipse.digitaltwin.aas4j.v3.model.impl.DefaultSecurityAttributeObject;
import org.eclipse.digitaltwin.aas4j.v3.model.impl.DefaultSpecificAssetId;
import org.eclipse.digitaltwin.aas4j.v3.model.impl.DefaultSubmodelDescriptor;

import java.util.List;

public class TestDataHelper {

    public static final String DEFAULT_IDENTIFICATION = "identification";

    public static final Reference DEFAULT_SEMANTIC_ID =
            new DefaultReference.Builder().type(ReferenceTypes.EXTERNAL_REFERENCE)
                    .keys(new DefaultKey.Builder().type(KeyTypes.GLOBAL_REFERENCE).value("eClassDefaultSemanticId").build())
                    .build();

    public static final EmbeddedDataSpecification DEFAULT_EMBEDDED_DATA_SPECIFICATION = new DefaultEmbeddedDataSpecification.Builder()
            .dataSpecificationContent(new DefaultDataSpecificationIec61360.Builder()
                    .preferredName(
                    new DefaultLangStringPreferredNameTypeIec61360.Builder().language("en").text("defaultPreferredName").build())
                    .build())
            .dataSpecification(createGlobalReference("defaultEmbeddedDataSpecificationDataSpecificationValue")).build();

    public static final AdministrativeInformation DEFAULT_ADMINISTRATIVE_INFORMATION =
            new DefaultAdministrativeInformation.Builder()
                    .embeddedDataSpecifications(DEFAULT_EMBEDDED_DATA_SPECIFICATION)
                    .revision("1")
                    .version("1").build();

    public static final List<LangStringTextType> DEFAULT_DESCRIPTION = List.of(createLangStringTextType("en", "defaultDescription"));

    public static final List<LangStringNameType> DEFAULT_DISPLAY_NAME = List.of(createLangStringNameType("en", "defaultDisplayName"));

    public static final String DEFAULT_ID_SHORT = "defaultIdShort";

    public static LangStringTextType createLangStringTextType(String langCode, String text) {
        return new DefaultLangStringTextType.Builder().language(langCode).text(text).build();
    }

    public static LangStringNameType createLangStringNameType(String langCode, String text) {
        return new DefaultLangStringNameType.Builder().language(langCode).text(text).build();
    }

    public static Reference createReference(ReferenceTypes type, KeyTypes keyType, String value) {
        return new DefaultReference.Builder().type(type).keys(createKey(keyType, value)).build();
    }

    public static Reference createGlobalReference(String value) {
        return createReference(ReferenceTypes.EXTERNAL_REFERENCE, KeyTypes.GLOBAL_REFERENCE, value);
    }

    public static DefaultEndpoint.Builder createEndpointBuilder() {

        String DEFAULT_INTERFACE_VALUE = "defaultInterface";

        return new DefaultEndpoint.Builder()
                .protocolInformation(createProtocolInformationBuilder().build())
                ._interface(DEFAULT_INTERFACE_VALUE);
    }

    public static Key createKey(KeyTypes type, String value) {
        return new DefaultKey.Builder().type(type).value(value).build();
    }

    public static DefaultProtocolInformation.Builder createProtocolInformationBuilder() {
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

    public static SpecificAssetId createSpecificAssetId() {
        return new DefaultSpecificAssetId.Builder()
                .name("testSpecificAssetId")
                .value("testValue")
                .build();
    }

    static AssetAdministrationShellDescriptor createAasDescriptor() {

        SpecificAssetId specificAssetId = new DefaultSpecificAssetId.Builder()
                .semanticId(TestDataHelper.DEFAULT_SEMANTIC_ID)
                .externalSubjectId(TestDataHelper.createReference(
                        ReferenceTypes.MODEL_REFERENCE, KeyTypes.ASSET_ADMINISTRATION_SHELL, "defaultSpecificAssetId"))
                .name("defaultSpecificAssetIdName")
                .value("http://example.company/myAsset").build();

        return new DefaultAssetAdministrationShellDescriptor.Builder()
                .administration(TestDataHelper.DEFAULT_ADMINISTRATIVE_INFORMATION)
                .description(TestDataHelper.DEFAULT_DESCRIPTION)
                .displayName(TestDataHelper.DEFAULT_DISPLAY_NAME)
                .id(TestDataHelper.DEFAULT_IDENTIFICATION)
                .idShort(TestDataHelper.DEFAULT_ID_SHORT)
                .specificAssetIds(List.of(specificAssetId))
                .endpoints(List.of(TestDataHelper.createEndpointBuilder().build()))
                .globalAssetId("defaultGlobalAssetId")
                .submodelDescriptors(List.of(createDefaultSubmodelDescriptor())).build();
    }

    static SubmodelDescriptor createDefaultSubmodelDescriptor () {
        return new DefaultSubmodelDescriptor.Builder()
                .administration(TestDataHelper.DEFAULT_ADMINISTRATIVE_INFORMATION)
                .description(TestDataHelper.DEFAULT_DESCRIPTION)
                .displayName(TestDataHelper.DEFAULT_DISPLAY_NAME)
                .id(TestDataHelper.DEFAULT_IDENTIFICATION)
                .idShort(TestDataHelper.DEFAULT_ID_SHORT)
                .endpoints(List.of(TestDataHelper.createEndpointBuilder().build()))
                .semanticId(TestDataHelper.DEFAULT_SEMANTIC_ID)
                .build();
    }
}
