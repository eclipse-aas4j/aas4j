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
package org.eclipse.aas4j.v3.rc02.dataformat.json;

import org.eclipse.aas4j.v3.rc02.dataformat.DeserializationException;
import org.eclipse.aas4j.v3.rc02.model.validator.ShaclValidator;
import org.eclipse.aas4j.v3.rc02.model.validator.ValidationException;
import org.eclipse.aas4j.v3.rc02.model.validator.ValidatorUtil;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;

import static org.junit.Assert.assertTrue;

public class JsonFullExampleTest {

    private static final Logger log = LoggerFactory.getLogger(JsonFullExampleTest.class);





    @Test
    public void validateFullJson() throws ValidationException, IOException, DeserializationException {
        String object = ValidatorUtil.readResourceToString("test_demo_full_example.json");

        ShaclValidator.getInstance().validate(new JsonDeserializer().read(object));
    }


}
