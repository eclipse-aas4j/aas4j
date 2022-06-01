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

package org.eclipse.aas4j.v3.rc02.model.builder;

import java.util.List;



import org.eclipse.aas4j.v3.rc02.model.*;
import org.eclipse.aas4j.v3.rc02.model.LangString;
import org.eclipse.aas4j.v3.rc02.model.LangStringSet;

public abstract class LangStringSetBuilder<T extends LangStringSet, B extends LangStringSetBuilder<T, B>> extends ExtendableBuilder<T, B> {

    /**
     * This function allows setting a value for langStrings
     * 
     * @param langStrings desired value to be set
     * @return Builder object with new value for langStrings
     */
    public B langStrings(List<LangString> langStrings) {
        getBuildingInstance().setLangStrings(langStrings);
        return getSelf();
    }

    /**
     * This function allows adding a value to the List langStrings
     * 
     * @param langStrings desired value to be added
     * @return Builder object with new value for langStrings
     */
    public B langStrings(LangString langStrings) {
        getBuildingInstance().getLangStrings().add(langStrings);
        return getSelf();
    }
}
