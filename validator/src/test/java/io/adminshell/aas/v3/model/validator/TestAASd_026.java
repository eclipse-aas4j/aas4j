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
package io.adminshell.aas.v3.model.validator;

import io.adminshell.aas.v3.rc02.model.SubmodelElement;
import io.adminshell.aas.v3.rc02.model.SubmodelElementCollection;
import io.adminshell.aas.v3.rc02.model.impl.DefaultKey;
import io.adminshell.aas.v3.rc02.model.impl.DefaultReference;
import io.adminshell.aas.v3.rc02.model.impl.DefaultSubmodelElementCollection;
import org.junit.Test;

import java.util.*;

/**
 * Tests the following constraint:
 * <p>
 * <i> If allowDuplicates==false then it is not allowed that the collection contains several elements with the same semantics (i.e. the same semanticId). </i>
 * </p>
 *
 * @author bader, chang
 *
 */

public class TestAASd_026 {

    @Test
    public void testAllowDuplicates() {

        // TODO @chang: please write the test.

    }


    private SubmodelElementCollection createSubmodelElementCollection(Collection<SubmodelElement> values) {
        return  new DefaultSubmodelElementCollection.Builder()
                .idShort("idShort")
                .value((SubmodelElement) values)
                .semanticId(new DefaultReference.Builder()
                        .key(new DefaultKey.Builder()
                                .idType(KeyType.CUSTOM)
                                .value("the value of the semantic id")
                                .type(KeyElements.CONCEPT_DESCRIPTION)
                                .build())
                        .build())
                .build();
    }
}
