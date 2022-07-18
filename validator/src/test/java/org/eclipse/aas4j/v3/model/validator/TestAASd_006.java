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

import org.eclipse.aas4j.v3.model.DataTypeDefXsd;
import org.eclipse.aas4j.v3.model.Qualifier;
import org.eclipse.aas4j.v3.model.Reference;
import org.eclipse.aas4j.v3.model.impl.DefaultQualifier;
import org.junit.Test;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

/**
 * Tests the following constraint:
 * <p>
 * <i> If both, the value and the valueId of a Qualifier are present then the value needs to be identical to the value
 * of the referenced coded value in Qualifier/valueId. </i>
 * </p>
 * 
 * @author bader, chang
 *
 */
public class TestAASd_006 {
	@Test
	public void missmatchingValueAndValueId() throws ValidationException {

		Reference reference = ConstraintTestHelper.createDummyReference();
		reference.getKeys().get(0).setValue("http://example.org/someRef");

		Qualifier wrongQualifier = new DefaultQualifier.Builder()
				.value("http://example.org")
				.valueType(DataTypeDefXsd.STRING)
				.valueId(reference)
				.type("REFERENCE")
				.build();

		try {
			ShaclValidator.getInstance().validate(wrongQualifier);
			fail();
		} catch (ValidationException e) {
			assertTrue(e.getMessage().endsWith(
					"If both, the value and the valueId of a Qualifier are present then the value needs to be identical " +
							"to the value of the referenced coded value in Qualifier/valueId."));
		}


	}

	@Test
	public void matchingValueAndValueId() throws ValidationException {
		Reference reference = ConstraintTestHelper.createDummyReference();
		reference.getKeys().get(0).setValue("http://example.org");

		Qualifier qualifier = new DefaultQualifier.Builder()
				.value("http://example.org")
				.valueType(DataTypeDefXsd.STRING)
				.valueId(reference)
				.type("REFERENCE")
				.build();

		ShaclValidator.getInstance().validate(qualifier);

	}
}
