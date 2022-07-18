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

package org.eclipse.aas4j.v3.model.annotations;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

// Retention policy runtime required for reflective access
@Retention(RetentionPolicy.RUNTIME)
public @interface IRI {
    /**
     * This annotation stores the IRI under which a certain element of a model is defined. Expected
     * behaviour when de-referencing the value of this annotation is a definition and further
     * information about this element.
     * 
     * @return IRI defining an element
     */
    public String[] value() default {};
}
