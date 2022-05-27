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
 * Enumeration of different level types within a DataSpecificationIEC61360. Contains Min, Max, Nom,
 * and Typ.
 */
@IRI("aas:LevelType")
public enum LevelType {

    /**
     * Max according to IEC 61360 as an Identifier scheme for maximal levels.
     */
    @IRI("https://admin-shell.io/aas/3/0/RC01/LevelType/Max")
    MAX,

    /**
     * Min according to IEC 61360 as an Identifier scheme for minimal levels.
     */
    @IRI("https://admin-shell.io/aas/3/0/RC01/LevelType/Min")
    MIN,

    /**
     * Nom according to IEC 61360 as an Identifier scheme for nominal levels.
     */
    @IRI("https://admin-shell.io/aas/3/0/RC01/LevelType/Nom")
    NOM,

    /**
     * Typ according to IEC 61360 as an Identifier scheme for typical levels.
     */
    @IRI("https://admin-shell.io/aas/3/0/RC01/LevelType/Typ")
    TYP;

}
