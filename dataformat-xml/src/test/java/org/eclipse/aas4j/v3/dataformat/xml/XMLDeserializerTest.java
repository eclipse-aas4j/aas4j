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
package org.eclipse.aas4j.v3.dataformat.xml;

import org.eclipse.aas4j.v3.dataformat.DeserializationException;
import org.eclipse.aas4j.v3.dataformat.core.AASFull;
import org.eclipse.aas4j.v3.dataformat.core.AASSimple;
import org.eclipse.aas4j.v3.model.*;
import org.junit.Assert;
import org.junit.Test;

import java.io.FileNotFoundException;
import java.util.List;
import java.util.stream.Stream;

public class XMLDeserializerTest {

    @Test
    public void deserializeAASSimple() throws Exception {
        Environment env = new XmlDeserializer().read(XmlSerializerTest.AASSIMPLE_FILE);
        Assert.assertEquals(AASSimple.ENVIRONMENT, env);
    }

    @Test
    public void deserializeAnnotedRelationshipElement() throws Exception {
        Environment env = new XmlDeserializer().read(XmlSerializerTest.AASFULL_FILE_WITH_ANNOTATED_RELATIONSHIP);
        Assert.assertNotNull(env);
    }

    @Test
    public void deserializeQualifier() throws Exception {
        Environment env = new XmlDeserializer().read(XmlSerializerTest.AASFULL_FILE_WITH_QUALIFIERS);
        Assert.assertNotNull(env);
        String[] qualifierValues = env.getSubmodels().stream().map(Submodel::getSubmodelElements).flatMap(List::stream)
                .map(SubmodelElement::getQualifiers).flatMap(List::stream)
                .map(Qualifier::getValue).toArray(String[]::new);
        Assert.assertArrayEquals(new String[]{"100", "50"}, qualifierValues);
    }

    @Test
    public void deserializeOperation() throws Exception {
        Environment env = new XmlDeserializer().read(XmlSerializerTest.AASFULL_FILE_WITH_OPERATIONS);
        Assert.assertNotNull(env);
        Stream<Operation> operationStream = env.getSubmodels().stream().map(Submodel::getSubmodelElements).flatMap(List::stream)
                .filter(submodelElement -> submodelElement instanceof Operation)
                .map(submodelElement -> (Operation) submodelElement);
        operationStream.forEach(operation -> {
            operation.getInputVariables().forEach(operationVariable -> Assert.assertNotNull(operationVariable.getValue()));
            operation.getOutputVariables().forEach(operationVariable -> Assert.assertNotNull(operationVariable.getValue()));
            operation.getInoutputVariables().forEach(operationVariable -> Assert.assertNotNull(operationVariable.getValue()));
        });
    }

    @Test
    public void deserializeAASFull() throws FileNotFoundException, DeserializationException {
        Environment env = new XmlDeserializer().read(XmlSerializerTest.AASFULL_FILE);
        Assert.assertEquals(AASFull.ENVIRONMENT, env);
    }
}
