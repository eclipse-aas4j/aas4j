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

import java.util.List;

import org.junit.Assert;
import org.junit.Test;

import io.adminshell.aas.v3.dataformat.i4aas.TestUANodeset;
import io.adminshell.aas.v3.model.AdministrativeInformation;
import io.adminshell.aas.v3.model.AssetAdministrationShellEnvironment;
import io.adminshell.aas.v3.model.DataSpecificationContent;
import io.adminshell.aas.v3.model.DataSpecificationIEC61360;
import io.adminshell.aas.v3.model.IdentifierType;
import io.adminshell.aas.v3.model.Reference;

public class EnvironmentParserTest {

	@Test
	public void testEnvironmentParser() {
		ParserContext context = new ParserContext(TestUANodeset.getAASSimpleV3Draft());
		AssetAdministrationShellEnvironment aasEnv = new EnvironmentParser(context.getEnvironment(), context).parse();

		// test referable
		String aasIdShort = aasEnv.getAssetAdministrationShells().get(0).getIdShort();
		Assert.assertEquals("ExampleMotor", aasIdShort);
		Assert.assertEquals("", aasEnv.getAssetAdministrationShells().get(0).getCategory());

		// test identifiable
		Assert.assertEquals("http://customer.com/aas/9175_7013_7091_9168",
				aasEnv.getAssetAdministrationShells().get(0).getIdentification().getIdentifier());
		Assert.assertEquals(IdentifierType.IRI,
				aasEnv.getAssetAdministrationShells().get(0).getIdentification().getIdType());
	}

	@Test
	public void testAdministrativeParser() {
		ParserContext context = new ParserContext(TestUANodeset.AAS_EXAMPLE_1);
		AssetAdministrationShellEnvironment aasEnv = new EnvironmentParser(context.getEnvironment(), context).parse();

		// test referable
		AdministrativeInformation adminInfo = aasEnv.getAssetAdministrationShells().get(0).getAdministration();
		Assert.assertEquals("1.0", adminInfo.getVersion());
		Assert.assertEquals("b", adminInfo.getRevision());

		Reference dataSpecification = adminInfo.getEmbeddedDataSpecifications().get(0).getDataSpecification();
		DataSpecificationContent dataSpecificationContent = adminInfo.getEmbeddedDataSpecifications().get(0)
				.getDataSpecificationContent();

		Assert.assertTrue(dataSpecificationContent instanceof DataSpecificationIEC61360);
		Assert.assertEquals("http://dataspec.org/example", dataSpecification.getKeys().get(0).getValue());
		Assert.assertEquals("iec61360_symbol", ((DataSpecificationIEC61360) dataSpecificationContent).getSymbol());
		Assert.assertEquals("mydefinition", ((DataSpecificationIEC61360) dataSpecificationContent).getDefinitions().get(0).getValue());
	}
	
	@Test
	public void testSubmodelReferenceParser() {
		ParserContext context = new ParserContext(TestUANodeset.getAASSimpleV3Draft());
		AssetAdministrationShellEnvironment aasEnv = new EnvironmentParser(context.getEnvironment(), context).parse();

		List<Reference> smReferences = aasEnv.getAssetAdministrationShells().get(0).getSubmodels();
		Assert.assertEquals(3, smReferences.size());
		
		Assert.assertNotNull(smReferences.get(0).getKeys().get(0).getValue());
		Assert.assertNotNull(smReferences.get(0).getKeys().get(0).getIdType());
		Assert.assertNotNull(smReferences.get(0).getKeys().get(0).getType());
	}
}
