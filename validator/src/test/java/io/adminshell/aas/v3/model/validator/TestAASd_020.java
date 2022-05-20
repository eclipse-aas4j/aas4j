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

import io.adminshell.aas.v3.model.ModelingKind;
import io.adminshell.aas.v3.model.Operation;
import io.adminshell.aas.v3.model.Qualifier;
import io.adminshell.aas.v3.model.impl.DefaultOperation;
import io.adminshell.aas.v3.model.impl.DefaultQualifier;
import org.junit.Ignore;
import org.junit.Test;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

/**
 * Tests the following constraint:
 * <p>
 * <i> The value of Qualifier/value shall be consistent to the data type as defined in Qualifier/valueType. </i>
 * </p>
 * 
 * @author bader, chang
 *
 */
public class TestAASd_020 {
	@Test
	public void wrongIntegerValue() throws ValidationException {

		Qualifier wrongQualifier = new DefaultQualifier.Builder()
				.valueType("int")
				.value("test")
				.type("integer")
				.build();

		try {
			ShaclValidator.getInstance().validate(wrongQualifier);
			fail();
		} catch (ValidationException e) {
			assertTrue(e.getMessage().endsWith(
					"The value of Qualifier/value shall be consistent to the data type as defined in Qualifier/valueType."));
		}
	}

	@Test
	public void wrongUriValue() throws ValidationException {

		Qualifier wrongQualifier = new DefaultQualifier.Builder()
				.valueType("uri")
				.value("1")
				.type("integer")
				.build();

		try {
			ShaclValidator.getInstance().validate(wrongQualifier);
			fail();
		} catch (ValidationException e) {
			assertTrue(e.getMessage().endsWith(
					"The value of Qualifier/value shall be consistent to the data type as defined in Qualifier/valueType."));
		}
	}


	@Test
	public void correctString() throws ValidationException {

		Qualifier qualifier = new DefaultQualifier.Builder()
				.valueType("string")
				.value("a string")
				.type("string")
				.build();

		ShaclValidator.getInstance().validate(qualifier);

	}
}
