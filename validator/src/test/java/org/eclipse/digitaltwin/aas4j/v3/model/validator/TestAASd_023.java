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
package org.eclipse.digitaltwin.aas4j.v3.model.validator;


import org.eclipse.digitaltwin.aas4j.v3.model.AssetInformation;
import org.eclipse.digitaltwin.aas4j.v3.model.AssetKind;
import org.eclipse.digitaltwin.aas4j.v3.model.KeyTypes;
import org.eclipse.digitaltwin.aas4j.v3.model.impl.DefaultAssetInformation;
import org.eclipse.digitaltwin.aas4j.v3.model.impl.DefaultKey;
import org.eclipse.digitaltwin.aas4j.v3.model.impl.DefaultReference;
import org.junit.Ignore;
import org.junit.Test;

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
//    @Test
//    public void correctReferenceToAsset() throws ValidationException, IOException {
//        AssetInformation assetInformation = createAssetInformation(KeyTypes.ASSET);
//        assertEquals(assetInformation.getGlobalAssetId().getKeys().get(0).getType(), KeyElements.ASSET);
//        ShaclValidator.getInstance().validate(assetInformation);
//
//    }

//    @Test
//    public void correctReferenceToGobalRe() throws ValidationException {
//        AssetInformation assetInformation = createAssetInformation(KeyElements.GLOBAL_REFERENCE);
//        assertEquals(assetInformation.getGlobalAssetId().getKeys().get(0).getType(), KeyElements.GLOBAL_REFERENCE);
//        ShaclValidator.getInstance().validate(assetInformation);
//
//    }

    @Ignore
    @Test
    public void wrongReferenceToCD() throws ValidationException {
        AssetInformation assetInformation = createAssetInformation(KeyTypes.CONCEPT_DESCRIPTION);
        assertEquals(assetInformation.getGlobalAssetId().getKeys().get(0).getType(), KeyTypes.CONCEPT_DESCRIPTION);
        try {
            ShaclValidator.getInstance().validate(assetInformation);
            fail();
        } catch (ValidationException e) {
            assertTrue(e.getMessage().endsWith("AssetInformation/globalAssetId either is a reference to an Asset object or a global reference."));
        }
    }


    private AssetInformation createAssetInformation(KeyTypes keyTypes) {
        return new DefaultAssetInformation.Builder()
                .assetKind(AssetKind.INSTANCE)
                .globalAssetId(new DefaultReference.Builder()
                        .keys(new DefaultKey.Builder()
                                .value("1234")
                                .type(keyTypes)
                                .build())

                        .build())
                .build();
    }

}


