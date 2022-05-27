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
 * A enumeration for data elements except for files and blobs.
 */
@IRI("aas:Category")
public enum Category {

    /**
     * A constant property is a property with a value that does not change over time. In eCl@ss this
     * kind of category has the category 'Coded Value'.
     */
    @IRI("https://admin-shell.io/aas/3/0/RC01/Category/Constant")
    CONSTANT,

    /**
     * A parameter property is a property that is once set and then typically does not change over time.
     * This is for example the case for configuration parameters.
     */
    @IRI("https://admin-shell.io/aas/3/0/RC01/Category/Parameter")
    PARAMETER,

    /**
     * A variable property is a property that is calculated during runtime, i.e. its value is a runtime
     * value.
     */
    @IRI("https://admin-shell.io/aas/3/0/RC01/Category/Variable")
    VARIABLE;

}
