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

package org.eclipse.aas4j.v3.rc02.model;

import java.util.List;



import org.eclipse.aas4j.v3.rc02.model.annotations.IRI;
import org.eclipse.aas4j.v3.rc02.model.annotations.KnownSubtypes;
import org.eclipse.aas4j.v3.rc02.model.impl.*;
import org.eclipse.aas4j.v3.rc02.model.impl.DefaultLangStringSet;

/**
 * Array of elements of type langString
 */
@KnownSubtypes({
    @KnownSubtypes.Type(value = DefaultLangStringSet.class)
})
public interface LangStringSet {

    /**
     * Strings in different languages
     *
     * More information under https://admin-shell.io/aas/3/0/RC02/LangStringSet/langStrings
     *
     * @return Returns the List of LangStrings for the property langStrings.
     */
    @IRI("https://admin-shell.io/aas/3/0/RC02/LangStringSet/langStrings")
    List<LangString> getLangStrings();

    /**
     * Strings in different languages
     *
     * More information under https://admin-shell.io/aas/3/0/RC02/LangStringSet/langStrings
     *
     * @param langStrings desired value for the property langStrings.
     */
    void setLangStrings(List<LangString> langStrings);

}
