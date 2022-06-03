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




import io.adminshell.aas.v3.model.annotations.IRI;
import io.adminshell.aas.v3.model.builder.*;
import io.adminshell.aas.v3.model.impl.*;

/**
 * Enumeration of different key value types within a key. Contains IdentifierType and LocalKeyType.
 */
@IRI("aas:KeyType")
public enum KeyType {

    /**
     * Custom identifiers like GUIDs (globally unique Identifiers)
     */
    @IRI("https://admin-shell.io/aas/3/0/RC01/IdentifierType/Custom")
    CUSTOM,

    /**
     * IRDI according to ISO29002-5 as an Identifier scheme for properties and classifications.
     */
    @IRI("https://admin-shell.io/aas/3/0/RC01/IdentifierType/Irdi")
    IRDI,

    /**
     * IRI. Should only be used if unicode symbols are used that are not allowed in URI.
     */
    @IRI("https://admin-shell.io/aas/3/0/RC01/IdentifierType/Iri")
    IRI,

    /**
     * Identifier of a fragment within a file
     */
    @IRI("https://admin-shell.io/aas/3/0/RC01/LocalKeyType/FragmentId")
    FRAGMENT_ID,

    /**
     * idShort of a referable element
     */
    @IRI("https://admin-shell.io/aas/3/0/RC01/LocalKeyType/IdShort")
    ID_SHORT;

}
