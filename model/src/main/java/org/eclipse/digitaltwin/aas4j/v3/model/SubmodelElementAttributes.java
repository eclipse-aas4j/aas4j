/*
 * Copyright (c) 2021 Fraunhofer-Gesellschaft zur Foerderung der angewandten Forschung e. V.
 * Copyright (c) 2023, SAP SE or an SAP affiliate company
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License. You may obtain a copy of the License at
 * 
 * http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software distributed under the License
 * is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express
 * or implied. See the License for the specific language governing permissions and limitations under
 * the License.
 */

package org.eclipse.digitaltwin.aas4j.v3.model;


import org.eclipse.digitaltwin.aas4j.v3.model.annotations.IRI;
import org.eclipse.digitaltwin.aas4j.v3.model.annotations.KnownSubtypes;
import org.eclipse.digitaltwin.aas4j.v3.model.impl.DefaultSubmodelElementAttributes;


/**
*/
@KnownSubtypes({
    @KnownSubtypes.Type(value = DefaultSubmodelElementAttributes.class),
    @KnownSubtypes.Type(value = AnnotatedRelationshipElementMetadata.class),
    @KnownSubtypes.Type(value = BasicEventElementMetadata.class),
    @KnownSubtypes.Type(value = BlobMetadata.class),
    @KnownSubtypes.Type(value = CapabilityMetadata.class),
    @KnownSubtypes.Type(value = EntityMetadata.class),
    @KnownSubtypes.Type(value = MultiLanguagePropertyMetadata.class),
    @KnownSubtypes.Type(value = OperationMetadata.class),
    @KnownSubtypes.Type(value = PropertyMetadata.class),
    @KnownSubtypes.Type(value = RangeMetadata.class),
    @KnownSubtypes.Type(value = ReferenceElementMetadata.class),
    @KnownSubtypes.Type(value = SubmodelElementListMetadata.class),
    @KnownSubtypes.Type(value = SubmodelElementCollectionMetadata.class)
})
public interface SubmodelElementAttributes extends HasDataSpecification, Referable, HasSemantics, Qualifiable {

    /**
     *
     * More information under https://admin-shell.io/aas/3/0/SubmodelElementAttributes/kind
     *
     * @return Returns the ModellingKind for the property kind.
     */
    @IRI("https://admin-shell.io/aas/3/0/SubmodelElementAttributes/kind")
    ModellingKind getKind();

    /**
     *
     * More information under https://admin-shell.io/aas/3/0/SubmodelElementAttributes/kind
     *
     * @param kind desired value for the property kind.
     */
    void setKind(ModellingKind kind);

}
