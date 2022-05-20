/*
 * Copyright (c) 2021 Fraunhofer-Gesellschaft zur Foerderung der angewandten Forschung e. V.
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

package io.adminshell.aas.v3.model;




import io.adminshell.aas.v3.model.annotations.IRI;
import io.adminshell.aas.v3.model.builder.*;
import io.adminshell.aas.v3.model.impl.*;

/**
 * Enumeration for denoting whether an element is a type or an instance.
 */
@IRI("aas:AssetKind")
public enum AssetKind {

    /**
     * Concrete, clearly identifiable component of a certain type.
     */
    @IRI("https://admin-shell.io/aas/3/0/RC01/AssetKind/INSTANCE")
    INSTANCE,

    /**
     * hardware or software element which specifies the common attributes shared by all instances of the
     * type.
     */
    @IRI("https://admin-shell.io/aas/3/0/RC01/AssetKind/TYPE")
    TYPE;

}
