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
package io.adminshell.aas.v3.dataformat.i4aas;

import java.io.IOException;
import java.io.InputStream;

import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;

import io.adminshell.aas.v3.dataformat.DeserializationException;
import io.adminshell.aas.v3.dataformat.SerializationException;
import io.adminshell.aas.v3.model.AssetAdministrationShellEnvironment;

public class DeserializerTest {

	@Test
	public void testAASSimple()
			throws SerializationException, IllegalArgumentException, IllegalAccessException, DeserializationException, IOException {
		//arrange
		I4AASDeserializer i4aasDeserializer = new I4AASDeserializer();
		try (InputStream testResourceAsStream = DeserializerTest.class.getResourceAsStream("/AASSimple_V3Draft.xml")) {
			//act
			AssetAdministrationShellEnvironment parsedResult = i4aasDeserializer.read(testResourceAsStream);
			// TODO assert
			Assert.assertNotNull(i4aasDeserializer);
		}
	}

}
