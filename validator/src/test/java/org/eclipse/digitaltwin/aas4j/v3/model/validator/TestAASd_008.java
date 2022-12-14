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

import org.eclipse.digitaltwin.aas4j.v3.model.ModelingKind;
import org.eclipse.digitaltwin.aas4j.v3.model.Operation;
import org.eclipse.digitaltwin.aas4j.v3.model.impl.DefaultOperation;
import org.junit.Test;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

/**
 * Tests the following constraint:
 * <p>
 * <i> The submodel element value of an operation variable shall be of kind=Template. </i>
 * </p>
 * 
 * @author bader, chang
 *
 */
public class TestAASd_008 {
	@Test
	public void wrongKind() throws ValidationException {

		Operation wrongOperation = new DefaultOperation.Builder()
				.idShort("idShort")
				.kind(ModelingKind.INSTANCE)
				.build();

		try {
			ShaclValidator.getInstance().validate(wrongOperation);
			fail();
		} catch (ValidationException e) {
			assertTrue(e.getMessage().endsWith(
					"The submodel element value of an operation variable shall be of kind=Template."));
		}


	}

	@Test
	public void correctKind() throws ValidationException {

		Operation operation = new DefaultOperation.Builder()
				.idShort("idShort")
				.kind(ModelingKind.TEMPLATE)
				.build();

		ShaclValidator.getInstance().validate(operation);

	}
}
