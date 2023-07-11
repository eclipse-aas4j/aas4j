/*
 * Copyright (c) 2023 SAP SE
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

import org.eclipse.digitaltwin.aas4j.v3.dataformat.SerializationException;
import org.eclipse.digitaltwin.aas4j.v3.model.AssetAdministrationShellDescriptor;
import org.eclipse.digitaltwin.aas4j.v3.model.SubmodelDescriptor;

import java.util.List;

/**
 * Serializer Interface for serialization of AssetAdministrationShellDescriptor
 */
public interface AssetAdministrationShellDescriptorSerializer {

    /**
     * Serializes a given instance of a AssetAdministrationShellDescriptor to string
     *
     * @param assetAdministrationShellDescriptor the AssetAdministrationShellDescriptor to serialize
     * @return the string representation of the SpecificAssetId
     * @throws SerializationException if serialization fails
     */
    String writeAssetAdministrationShellDescriptor(AssetAdministrationShellDescriptor assetAdministrationShellDescriptor) throws SerializationException;

    /**
     *
     * @param assetAdministrationShellDescriptors the references to serialize
     * @return the string representation of the list of SubmodelDescriptors
     * @throws SerializationException if serialization fails
     */
    String writeAssetAdministrationShellDescriptors(List<AssetAdministrationShellDescriptor> assetAdministrationShellDescriptors) throws SerializationException;

}
