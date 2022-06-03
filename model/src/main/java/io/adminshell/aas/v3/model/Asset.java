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
 * An Asset describes meta data of an asset that is represented by an AAS. The asset may either
 * represent an asset type or an asset instance. The asset has a globally unique identifier plus -
 * if needed - additional domain specific (proprietary) identifiers. Objects may be known in the
 * form of a type or of an instance. An object in the planning phase is known as a type
 */
@KnownSubtypes({
    @KnownSubtypes.Type(value = DefaultAsset.class)
})
public interface Asset extends HasDataSpecification, Identifiable {

}
