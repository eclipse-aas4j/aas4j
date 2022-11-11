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
package org.eclipse.digitaltwin.aas4j.v3.model.validator;

import org.eclipse.digitaltwin.aas4j.v3.model.DataTypeDefXsd;
import org.eclipse.digitaltwin.aas4j.v3.model.Qualifier;
import org.eclipse.digitaltwin.aas4j.v3.model.impl.DefaultQualifier;
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
	@Ignore("Very hard to validate properly, requires more time.") // TODO
	public void wrongIntegerValue() throws ValidationException {

		Qualifier wrongQualifier = new DefaultQualifier.Builder()
				.valueType(DataTypeDefXsd.INT)
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
	@Ignore("Very hard to validate properly, requires more time.") // TODO
	public void wrongUriValue() throws ValidationException {

		Qualifier wrongQualifier = new DefaultQualifier.Builder()
				.valueType(DataTypeDefXsd.ANY_URI)
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
				.valueType(DataTypeDefXsd.STRING)
				.value("a string")
				.type("string")
				.build();

		ShaclValidator.getInstance().validate(qualifier);

	}
}
