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

import org.eclipse.digitaltwin.aas4j.v3.model.annotations.KnownSubtypes;

/** A submodel element is an element suitable for the description and differentiation of assets. */
@KnownSubtypes({
  @KnownSubtypes.Type(value = DataElement.class),
  @KnownSubtypes.Type(value = Capability.class),
  @KnownSubtypes.Type(value = Entity.class),
  @KnownSubtypes.Type(value = EventElement.class),
  @KnownSubtypes.Type(value = Operation.class),
  @KnownSubtypes.Type(value = RelationshipElement.class),
  @KnownSubtypes.Type(value = SubmodelElementCollection.class),
  @KnownSubtypes.Type(value = SubmodelElementList.class)
})
public interface SubmodelElement
    extends HasDataSpecification, Referable, HasSemantics, Qualifiable {}
