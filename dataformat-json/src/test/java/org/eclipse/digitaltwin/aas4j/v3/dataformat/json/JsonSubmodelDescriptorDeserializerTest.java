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
package org.eclipse.digitaltwin.aas4j.v3.dataformat.json;

import org.eclipse.digitaltwin.aas4j.v3.dataformat.DeserializationException;
import org.eclipse.digitaltwin.aas4j.v3.model.SubmodelDescriptor;
import org.eclipse.digitaltwin.aas4j.v3.model.impl.DefaultSubmodelDescriptor;
import org.junit.Test;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class JsonSubmodelDescriptorDeserializerTest {

    public static SubmodelDescriptor getDefaultSubmodelDescriptor () {
        return new DefaultSubmodelDescriptor.Builder()
                .administration(TestDataHelper.DEFAULT_ADMINISTRATIVE_INFORMATION)
                .description(TestDataHelper.DEFAULT_DESCRIPTION)
                .displayName(TestDataHelper.DEFAULT_DISPLAY_NAME)
                .identification(TestDataHelper.DEFAULT_IDENTIFICATION)
                .idShort(TestDataHelper.DEFAULT_ID_SHORT)
                .endpoints(List.of(TestDataHelper.createEndpointBuilder().build()))
                .semanticId(TestDataHelper.DEFAULT_SEMANTIC_ID)
                .build();
    }


    @Test
    public void testReadSubmodelDescriptor() throws IOException, DeserializationException {
        File fileExpected = new File("src/test/resources/submodelDescriptor.json");
        String expected = Files.readString(fileExpected.toPath());
        SubmodelDescriptor submodelDescriptor = new JsonDeserializer().readSubmodelDescriptor(expected);
        SubmodelDescriptor submodelDescriptorExpected = getDefaultSubmodelDescriptor();

        assertEquals(submodelDescriptorExpected, submodelDescriptor);
    }
}
