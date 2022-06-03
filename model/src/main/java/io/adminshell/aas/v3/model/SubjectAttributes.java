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

import java.util.List;



import io.adminshell.aas.v3.model.annotations.IRI;
import io.adminshell.aas.v3.model.annotations.KnownSubtypes;
import io.adminshell.aas.v3.model.builder.*;
import io.adminshell.aas.v3.model.impl.*;

/**
 * A set of data elements that further classifies a specific subject.
 */
@KnownSubtypes({
    @KnownSubtypes.Type(value = DefaultSubjectAttributes.class)
})
public interface SubjectAttributes {

    /**
     * A data element that further classifies a specific subject.
     *
     * Constraint AASs-015: The data element SubjectAttributes/subjectAttribute shall be part of the
     * submodel that is referenced within the 'selectableSubjectAttributes' attribute of
     * 'AccessControl'.
     *
     * More information under https://admin-shell.io/aas/3/0/RC01/SubjectAttributes/subjectAttribute
     *
     * @return Returns the List of DataElements for the property subjectAttributes.
     */
    @IRI("https://admin-shell.io/aas/3/0/RC01/SubjectAttributes/subjectAttribute")
    List<DataElement> getSubjectAttributes();

    /**
     * A data element that further classifies a specific subject.
     *
     * Constraint AASs-015: The data element SubjectAttributes/subjectAttribute shall be part of the
     * submodel that is referenced within the 'selectableSubjectAttributes' attribute of
     * 'AccessControl'.
     *
     * More information under https://admin-shell.io/aas/3/0/RC01/SubjectAttributes/subjectAttribute
     *
     * @param subjectAttributes desired value for the property subjectAttributes.
     */
    void setSubjectAttributes(List<DataElement> subjectAttributes);

}
