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
package io.adminshell.aas.v3.model.validator;


import io.adminshell.aas.v3.model.*;
import io.adminshell.aas.v3.model.impl.DefaultAssetInformation;
import io.adminshell.aas.v3.model.impl.DefaultKey;
import io.adminshell.aas.v3.model.impl.DefaultReference;
import org.junit.Ignore;
import org.junit.Test;

import java.io.IOException;

import static org.junit.Assert.*;

/**
 * Tests the following constraint:
 * <p>
 * <i> AssetInformation/globalAssetId either is a reference to an Asset object or a global reference. </i>
 * </p>
 *
 * @author bader, chang
 *
 */

public class TestAASd_023 {
    @Test
    public void correctReferenceToAsset() throws ValidationException, IOException {
        AssetInformation assetInformation = createAssetInformation(KeyElements.ASSET);
        assertEquals(assetInformation.getGlobalAssetId().getKeys().get(0).getType(), KeyElements.ASSET);
        ShaclValidator.getInstance().validate(assetInformation);

    }

    @Test
    public void correctReferenceToGobalRe() throws ValidationException {
        AssetInformation assetInformation = createAssetInformation(KeyElements.GLOBAL_REFERENCE);
        assertEquals(assetInformation.getGlobalAssetId().getKeys().get(0).getType(), KeyElements.GLOBAL_REFERENCE);
        ShaclValidator.getInstance().validate(assetInformation);

    }

    @Ignore
    @Test
    public void wrongReferenceToCD() throws ValidationException {
        AssetInformation assetInformation = createAssetInformation(KeyElements.CONCEPT_DESCRIPTION);
        assertEquals(assetInformation.getGlobalAssetId().getKeys().get(0).getType(), KeyElements.CONCEPT_DESCRIPTION);
        try {
            ShaclValidator.getInstance().validate(assetInformation);
            fail();
        } catch (ValidationException e) {
            assertTrue(e.getMessage().endsWith("AssetInformation/globalAssetId either is a reference to an Asset object or a global reference."));
        }
    }


    private AssetInformation createAssetInformation(KeyElements keyElements) {
        return new DefaultAssetInformation.Builder()
                .assetKind(AssetKind.INSTANCE)
                .globalAssetId(new DefaultReference.Builder()
                        .key(new DefaultKey.Builder()
                                .idType(KeyType.CUSTOM)
                                .value("1234")
                                .type(keyElements)
                                .build())

                        .build())
                .build();
    }

}


