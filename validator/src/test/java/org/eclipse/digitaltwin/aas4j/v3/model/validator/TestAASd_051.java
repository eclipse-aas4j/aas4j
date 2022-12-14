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

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import java.util.Arrays;
import java.util.List;

import org.eclipse.digitaltwin.aas4j.v3.model.ConceptDescription;
import org.junit.Test;

/**
 * Tests the following constraint:
 * <p>
 * <i> A ConceptDescription shall have one of the following categories: VALUE,
 * PROPERTY, REFERENCE, DOCUMENT, CAPABILITY, RELATIONSHIP, COLLECTION,
 * FUNCTION, EVENT, ENTITY, APPLICATION_CLASS, QUALIFIER, VIEW. </i>
 * </p>
 * 
 * @author schnicke, kannoth
 *
 */
public class TestAASd_051 {
	@Test
	public void correctCategory() throws ValidationException {
		List<String> categories = Arrays.asList("VALUE", "PROPERTY", "REFERENCE", "DOCUMENT", "CAPABILITY",
				"RELATIONSHIP", "COLLECTION", "FUNCTION", "EVENT", "ENTITY", "APPLICATION_CLASS", "QUALIFIER", "VIEW");
		
		for(String category : categories) {
			ConceptDescription cd = ConstraintTestHelper.createConceptDescription("idShort", "identifier", category);
			ShaclValidator.getInstance().validate(cd);
		}
	}

	@Test
	public void incorrectCategory() {
		ConceptDescription cd = ConstraintTestHelper.createConceptDescription("idShort", "identifier", "WRONG");
		try {
			ShaclValidator.getInstance().validate(cd);
			fail();
		} catch (ValidationException e) {
			assertTrue(e.getMessage().endsWith(
					"A ConceptDescription shall have one of the following categories: VALUE, PROPERTY, REFERENCE, DOCUMENT, CAPABILITY, RELATIONSHIP, COLLECTION, FUNCTION, EVENT, ENTITY, APPLICATION_CLASS, QUALIFIER, VIEW."));
		}
	}
}
