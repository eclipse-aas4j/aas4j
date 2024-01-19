/*
 * Copyright (c) 2021 Fraunhofer-Gesellschaft zur Foerderung der angewandten Forschung e. V.
 * Copyright (C) 2023 SAP SE or an SAP affiliate company.
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
package org.eclipse.digitaltwin.aas4j.v3.dataformat.json;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.eclipse.digitaltwin.aas4j.v3.dataformat.DeserializationException;
import org.eclipse.digitaltwin.aas4j.v3.dataformat.SerializationException;
import org.eclipse.digitaltwin.aas4j.v3.dataformat.core.Examples;
import org.eclipse.digitaltwin.aas4j.v3.model.OperationRequest;
import org.junit.Before;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.Duration;

import static org.junit.Assert.assertEquals;

public class JsonDurationDeserializerTest {

    private static final Logger logger = LoggerFactory.getLogger(JsonDurationDeserializerTest.class);

    String operationRequestString;

    @Before
    public void prepare() throws SerializationException, JsonProcessingException {

        operationRequestString = new ObjectMapper().writeValueAsString(Examples.OPERATION_REQUEST);

    }


    @Test
    public void testDeserializeDuration() throws DeserializationException, DatatypeConfigurationException {

        Duration duration = DatatypeFactory.newInstance().newDurationDayTime("P0DT0H3M0S"); // three minutes

        JsonDeserializer deserializer = new JsonDeserializer();

        OperationRequest operationRequest = deserializer.read(operationRequestString, OperationRequest.class);

        assertEquals( operationRequest.getClientTimeoutDuration() , duration);
    }


}
