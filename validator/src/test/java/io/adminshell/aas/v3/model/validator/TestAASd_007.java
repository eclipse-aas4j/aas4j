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

import io.adminshell.aas.v3.rc02.model.Property;
import io.adminshell.aas.v3.rc02.model.Reference;
import io.adminshell.aas.v3.rc02.model.impl.DefaultProperty;
import org.junit.Test;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

/**
 * Tests the following constraint:
 * <p>
 * <i> If both, the Property/value and the Property/valueId are present then the value of Property/value needs to be
 * identical to the value of the referenced coded value in Property/valueId. </i>
 * </p>
 * 
 * @author bader, chang
 *
 */
public class TestAASd_007 {
	@Test
	public void missmatchingValueAndValueId() throws ValidationException {

		Reference reference = ConstraintTestHelper.createDummyReference();
		reference.getKeys().get(0).setValue("http://example.org/someRef");

		Property wrongProperty = new DefaultProperty.Builder()
				.idShort("idShort")
				.value("http://example.org")
				.valueType("string")
				.valueId(reference)
				.build();

		try {
			ShaclValidator.getInstance().validate(wrongProperty);
			fail();
		} catch (ValidationException e) {
			assertTrue(e.getMessage().endsWith(
					"If both, the Property/value and the Property/valueId are present then the value of Property/value " +
							"needs to be identical to the value of the referenced coded value in Property/valueId."));
		}


	}

	@Test
	public void matchingValueAndValueId() throws ValidationException {
		Reference reference = ConstraintTestHelper.createDummyReference();
		reference.getKeys().get(0).setValue("http://example.org");

		Property property = new DefaultProperty.Builder()
				.idShort("idShort")
				.value("http://example.org")
				.valueType("string")
				.valueId(reference)
				.build();

		ShaclValidator.getInstance().validate(property);

	}
}
