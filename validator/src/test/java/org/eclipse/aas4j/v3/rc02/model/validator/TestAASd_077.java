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

package org.eclipse.aas4j.v3.rc02.model.validator;

import org.eclipse.aas4j.v3.rc02.model.Extension;
import org.eclipse.aas4j.v3.rc02.model.Referable;
import org.eclipse.aas4j.v3.rc02.model.impl.DefaultExtension;
import org.eclipse.aas4j.v3.rc02.model.impl.DefaultSubmodel;
import org.junit.Ignore;
import org.junit.Test;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

/**
 * Tests the following constraint:
 * <p>
 * <i> The name of an extension within HasExtensions needs to be unique. </i>
 * </p>
 * 
 * @author bader
 *
 */
public class TestAASd_077 {

	// TODO: Add HasExtensions to Referables in the Java Model and then uncomment the lines in the tests.

	@Test
	@Ignore
	public void repeatingExtensionName() throws ValidationException {

		Extension extension1 = new DefaultExtension.Builder()
				.name("extension")
				.build();

		Extension extension2 = new DefaultExtension.Builder()
				.name("extension")
				.build();

		Referable referable = new DefaultSubmodel.Builder()
				.idShort("submodel_idShort")
				.id("http://example.org/TestSubmodel")
				//.setExtensions( new ArrayList<Extension>() {{add(extension1); add(extension2);}} )
				.build();

		try {
			ShaclValidator.getInstance().validate(referable);
			fail();
		} catch (ValidationException e) {
			assertTrue(e.getMessage().endsWith(
					"The name of an extension within HasExtensions needs to be unique."));
		}


	}

	@Test
	public void uniqueExtensionNames() throws ValidationException {
		Extension extension1 = new DefaultExtension.Builder()
				.name("extension1")
				.build();

		Extension extension2 = new DefaultExtension.Builder()
				.name("extension2")
				.build();

		Referable referable = new DefaultSubmodel.Builder()
				.idShort("submodel_idShort")
				.id("http://example.org/TestSubmodel")
				//.setExtensions( new ArrayList<Extension>() {{add(extension1); add(extension2);}} )
				.build();

		ShaclValidator.getInstance().validate(referable);

	}
}
