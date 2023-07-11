/*
 * Copyright 2023 jab.
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
package org.eclipse.digitaltwin.aas4j.v3.dataformat.core;

import org.eclipse.digitaltwin.aas4j.v3.model.AssetKind;
import org.eclipse.digitaltwin.aas4j.v3.model.DataTypeDefXSD;
import org.eclipse.digitaltwin.aas4j.v3.model.Environment;
import org.eclipse.digitaltwin.aas4j.v3.model.KeyTypes;
import org.eclipse.digitaltwin.aas4j.v3.model.ReferenceTypes;
import org.eclipse.digitaltwin.aas4j.v3.model.impl.DefaultAssetAdministrationShell;
import org.eclipse.digitaltwin.aas4j.v3.model.impl.DefaultAssetInformation;
import org.eclipse.digitaltwin.aas4j.v3.model.impl.DefaultEnvironment;
import org.eclipse.digitaltwin.aas4j.v3.model.impl.DefaultExtension;
import org.eclipse.digitaltwin.aas4j.v3.model.impl.DefaultKey;
import org.eclipse.digitaltwin.aas4j.v3.model.impl.DefaultReference;

public class Examples {
    
    public static final Environment EXTENSION_MINIMAL = new DefaultEnvironment.Builder()
            .assetAdministrationShells(new DefaultAssetAdministrationShell.Builder()
                    .id("something_142922d6")
                    .extensions(new DefaultExtension.Builder()
                            .name("something_aae6caf4")
                            .build())
                    .assetInformation(new DefaultAssetInformation.Builder()
                            .assetKind(AssetKind.NOT_APPLICABLE)
                            .globalAssetID("something_eea66fa1")
                            .build())
                    .build())
            .build();
    
    public static final Environment EXTENSION_MAXIMAL = new DefaultEnvironment.Builder()
            .assetAdministrationShells(new DefaultAssetAdministrationShell.Builder()
                    .id("something_142922d6")
                    .extensions(new DefaultExtension.Builder()
                            .name("something_aae6caf4")
                            .value("10233")
                            .valueType(DataTypeDefXSD.UNSIGNED_SHORT)
                            .refersTo(new DefaultReference.Builder()
                                    .keys(new DefaultKey.Builder()
                                            .type(KeyTypes.SUBMODEL)
                                            .value("urn:another-example01:f7faa581")
                                            .build())
                                    .type(ReferenceTypes.MODEL_REFERENCE)
                                    .build())
                            .semanticID(new DefaultReference.Builder()
                                    .keys(new DefaultKey.Builder()
                                            .type(KeyTypes.GLOBAL_REFERENCE)
                                            .value("urn:another-company07:4d1bd2cb")
                                            .build())
                                    .type(ReferenceTypes.EXTERNAL_REFERENCE)
                                    .build())
                            .supplementalSemanticIds(new DefaultReference.Builder()
                                    .keys(new DefaultKey.Builder()
                                            .type(KeyTypes.GLOBAL_REFERENCE)
                                            .value("urn:an-example13:be48ff29")
                                            .build())
                                    .type(ReferenceTypes.EXTERNAL_REFERENCE)
                                    .build())
                            .build())
                    .assetInformation(new DefaultAssetInformation.Builder()
                            .assetKind(AssetKind.NOT_APPLICABLE)
                            .globalAssetID("something_eea66fa1")
                            .build())
                    .build())
            .build();
}
