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
package io.adminshell.aas.v3.model;




import io.adminshell.aas.v3.model.annotations.KnownSubtypes;
import io.adminshell.aas.v3.model.builder.*;
import io.adminshell.aas.v3.model.impl.*;

/**
 * A submodel element is an element suitable for the description and differentiation of assets. The
 * concept of type and instance applies to submodel elements. Properties are special submodel
 * elements. The property types are defined in dictionaries (like the IEC Common Data Dictionary or
 * eCl@ss), they do not have a value. The property type (kind=Type) is also called data element type
 * in some standards. The property instances (kind=Instance) typically have a value. A property
 * instance is also called property-value pair in certain standards.
 */
@KnownSubtypes({
    @KnownSubtypes.Type(value = RelationshipElement.class),
    @KnownSubtypes.Type(value = DataElement.class),
    @KnownSubtypes.Type(value = File.class),
    @KnownSubtypes.Type(value = Event.class),
    @KnownSubtypes.Type(value = Capability.class),
    @KnownSubtypes.Type(value = Entity.class),
    @KnownSubtypes.Type(value = EventElement.class),
    @KnownSubtypes.Type(value = EventMessage.class),
    @KnownSubtypes.Type(value = Operation.class),
    @KnownSubtypes.Type(value = SubmodelElementCollection.class)
})
public interface SubmodelElement extends Referable, Qualifiable, HasDataSpecification, HasKind, HasSemantics {

}
