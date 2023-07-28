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

import org.eclipse.digitaltwin.aas4j.v3.dataformat.DeserializationException;
import org.eclipse.digitaltwin.aas4j.v3.dataformat.core.AASFull;
import org.eclipse.digitaltwin.aas4j.v3.model.*;
import org.eclipse.digitaltwin.aas4j.v3.model.impl.*;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class JsonAssetAdministrationShellDescriptorDeserializerTest {

    private static final Logger logger = LoggerFactory.getLogger(JsonAssetAdministrationShellDescriptorDeserializerTest.class);



    public static AssetAdministrationShellDescriptor createAasDescriptor() {

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
                .identification(TestDataHelper.DEFAULT_IDENTIFICATION)
                .idShort(TestDataHelper.DEFAULT_ID_SHORT)
                .specificAssetIds(List.of(specificAssetId))
                .endpoints(List.of(TestDataHelper.createEndpointBuilder().build()))
                .globalAssetId("defaultGlobalAssetId")
                .submodelDescriptor(List.of(JsonSubmodelDescriptorDeserializerTest.getDefaultSubmodelDescriptor())).build();
    }

    @Test
    public void testReadAasDescriptor() throws IOException, DeserializationException {
        File fileExpected = new File("src/test/resources/assetAdministrationShellDescriptor.json");
        String expected = Files.readString(fileExpected.toPath());
        AssetAdministrationShellDescriptor assetAdministrationShellDescriptor = new JsonDeserializer().readAssetAdministrationShellDescriptor(expected);
        AssetAdministrationShellDescriptor aasExpected = createAasDescriptor();

        assertEquals(aasExpected, assetAdministrationShellDescriptor);
    }

}
