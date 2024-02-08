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
package org.eclipse.digitaltwin.aas4j.v3.dataformat.xml.internal.mixins;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;


@JsonPropertyOrder({
        "hasExtensions", "category", "idShort", "displayName", "description", "checksum", // --> Referable
        "kind", // --> HasKind
		"semanticId", "supplementalSemanticIds", "reference", // --> HasSemantics
        "qualifier",  // --> Qualifiable
        "dataSpecifications", "embeddedDataSpecifications", // --> HasDataSpecifications
		"orderRelevant", "semanticIdListElement", "typeValueListElement", "valueTypeListElement", // --> SME-List
        "valueType", "value", "valueId" // --> Property
        , "statements", "entityType", "globalAssetId", "specificAssetId" // --> Entity
        , "first", "second", "annotations" // --> (Annotated)RelationsShipElement
        , "inputVariables", "outputVariables", "inoutputVariables" // --> Operation
        , "observed","direction","state","messageTopic","messageBroker","lastUpdate","minInterval","maxInterval" // --> BasicEventElement
        , "min", "max" // Range
})
public interface SubmodelElementMixin {

}
