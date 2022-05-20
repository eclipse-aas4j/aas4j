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
package io.adminshell.aas.v3.dataformat.i4aas.parsers;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;

import java.io.IOException;
import java.io.InputStream;

import javax.xml.bind.JAXBException;

import org.junit.Test;
import org.opcfoundation.ua._2011._03.uanodeset.UANodeSet;

import io.adminshell.aas.v3.dataformat.i4aas.UANodeSetUnmarshaller;
import io.adminshell.aas.v3.dataformat.i4aas.mappers.utils.I4AASIdentifier;

public class ParserContextTest {

	@Test
	public void testGetPreparsedEnvironment() throws IOException, JAXBException {
		try (InputStream testResourceAsStream = ParserContextTest.class.getResourceAsStream("/AASSimple_V3Draft.xml")) {
			UANodeSet uaNodeSet = new UANodeSetUnmarshaller().unmarshall(testResourceAsStream);
			ParserContext parserContext = new ParserContext(uaNodeSet);
			assertEquals(2, parserContext.getI4aasNsIdx());
			UANodeWrapper preparsedEnvironment = parserContext.getEnvironment();
			assertNotNull(preparsedEnvironment);
			assertEquals("ns=1;i=1", preparsedEnvironment.getNodeId());
			assertEquals(4, preparsedEnvironment.getComponents().size());
			assertEquals(I4AASIdentifier.AASEnvironmentType, preparsedEnvironment.getType());
			assertFalse(preparsedEnvironment.getComponentsOfType(I4AASIdentifier.AASSubmodelType).isEmpty());
		}

	}

}