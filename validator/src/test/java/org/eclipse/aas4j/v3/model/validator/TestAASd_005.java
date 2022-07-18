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
package org.eclipse.aas4j.v3.model.validator;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import org.eclipse.aas4j.v3.model.AdministrativeInformation;
import org.eclipse.aas4j.v3.model.impl.DefaultAdministrativeInformation;
import org.junit.Test;

/**
 * Tests the following constraint:
 * <p>
 * <i> A revision requires a version. </i>
 * </p>
 * 
 * @author schnicke, chang
 *
 */
public class TestAASd_005 {
	@Test
	public void revisionWithoutVersion() throws ValidationException {
		AdministrativeInformation admInfo = new DefaultAdministrativeInformation.Builder().revision("1").build();

		try {
			ShaclValidator.getInstance().validate(admInfo);
			fail();
		} catch (ValidationException e) {
			assertTrue(e.getMessage().endsWith("A revision requires a version."));
		}
	}

	@Test
	public void revisionWithVersion()
			throws ValidationException {
		AdministrativeInformation admInfo = new DefaultAdministrativeInformation.Builder().revision("1").version("1")
				.build();
		ShaclValidator.getInstance().validate(admInfo);
	}
}
