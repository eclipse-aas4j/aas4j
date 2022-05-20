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

import java.util.List;



import io.adminshell.aas.v3.model.annotations.IRI;
import io.adminshell.aas.v3.model.annotations.KnownSubtypes;
import io.adminshell.aas.v3.model.builder.*;
import io.adminshell.aas.v3.model.impl.*;

/**
 * A property is a data element that has a multi language value.
 */
@KnownSubtypes({
    @KnownSubtypes.Type(value = DefaultMultiLanguageProperty.class)
})
public interface MultiLanguageProperty extends DataElement {

    /**
     * The value of the property instance.
     *
     * Constraint AASd-052b: If the semanticId of a MultiLanguageProperty references a
     * ConceptDescription then the ConceptDescription/category shall be one of following values:
     * PROPERTY.
     *
     * Constraint AASd-012: If both, the MultiLanguageProperty/value and the
     * MultiLanguageProperty/valueId are present then for each string in a specific language the meaning
     * must be the same as specified in MultiLanguageProperty/valueId.
     *
     * Constraint AASd-067: If the semanticId of a MultiLanguageProperty references a ConceptDescription
     * then DataSpecificationIEC61360/dataType shall be STRING_TRANSLATABLE.
     *
     * More information under https://admin-shell.io/aas/3/0/RC01/MultiLanguageProperty/value
     *
     * @return Returns the List of LangStrings for the property values.
     */
    @IRI("https://admin-shell.io/aas/3/0/RC01/MultiLanguageProperty/value")
    List<LangString> getValues();

    /**
     * The value of the property instance.
     *
     * Constraint AASd-052b: If the semanticId of a MultiLanguageProperty references a
     * ConceptDescription then the ConceptDescription/category shall be one of following values:
     * PROPERTY.
     *
     * Constraint AASd-012: If both, the MultiLanguageProperty/value and the
     * MultiLanguageProperty/valueId are present then for each string in a specific language the meaning
     * must be the same as specified in MultiLanguageProperty/valueId.
     *
     * Constraint AASd-067: If the semanticId of a MultiLanguageProperty references a ConceptDescription
     * then DataSpecificationIEC61360/dataType shall be STRING_TRANSLATABLE.
     *
     * More information under https://admin-shell.io/aas/3/0/RC01/MultiLanguageProperty/value
     *
     * @param values desired value for the property values.
     */
    void setValues(List<LangString> values);

    /**
     * Reference to the global unqiue id of a coded value.
     *
     * More information under https://admin-shell.io/aas/3/0/RC01/MultiLanguageProperty/valueId
     *
     * @return Returns the List of References for the property valueIds.
     */
    @IRI("https://admin-shell.io/aas/3/0/RC01/MultiLanguageProperty/valueId")
    List<Reference> getValueIds();

    /**
     * Reference to the global unqiue id of a coded value.
     *
     * More information under https://admin-shell.io/aas/3/0/RC01/MultiLanguageProperty/valueId
     *
     * @param valueIds desired value for the property valueIds.
     */
    void setValueIds(List<Reference> valueIds);

}
