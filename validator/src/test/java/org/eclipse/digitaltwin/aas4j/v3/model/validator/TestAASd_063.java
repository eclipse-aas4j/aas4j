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

import java.util.ArrayList;
import java.util.Arrays;

import org.eclipse.digitaltwin.aas4j.v3.model.*;
import org.eclipse.digitaltwin.aas4j.v3.model.impl.DefaultKey;
import org.eclipse.digitaltwin.aas4j.v3.model.impl.DefaultQualifier;
import org.eclipse.digitaltwin.aas4j.v3.model.impl.DefaultReference;

import org.junit.Ignore;
import org.junit.Test;

/**
 * Tests the following constraint:
 * <p>
 * <i>If the semanticId of a Qualifier references a ConceptDescription then the
 * ConceptDescription/category shall be one of following values: QUALIFIER.</i>
 * </p>
 * 
 * @author schnicke
 *
 */
@Ignore("Constraint has been removed")
public class TestAASd_063 {
	@Test
	public void correctCategory() throws ValidationException {
		String conceptDescriptionId = "conceptDescription";

		ConceptDescription correctCD = ConstraintTestHelper
				.createConceptDescription("idShort1", conceptDescriptionId, "QUALIFIER");

		Submodel sm = ConstraintTestHelper
				.createSubmodel(new ArrayList<>());
		sm.setQualifiers(Arrays.asList(createConstraint(conceptDescriptionId)));

		Environment correctEnv = ConstraintTestHelper.createEnvironment(sm,
				Arrays.asList(correctCD,
						ConstraintTestHelper.getIrrelevantConceptDescription()));

		ShaclValidator.getInstance().validate(correctEnv);
	}

	@Test
	public void wrongCategory() {
		String conceptDescriptionWrongId = "conceptDescriptionWrong";

		ConceptDescription wrongCD = ConstraintTestHelper.createConceptDescription("idShort1", conceptDescriptionWrongId,
				"COLLECTION");

		Submodel sm = ConstraintTestHelper
				.createSubmodel(new ArrayList<>());
		sm.setQualifiers(Arrays.asList(createConstraint(conceptDescriptionWrongId)));

		Environment wrongEnv = ConstraintTestHelper.createEnvironment(sm,
				Arrays.asList(wrongCD, ConstraintTestHelper.getIrrelevantConceptDescription()));
		try {
			ShaclValidator.getInstance().validate(wrongEnv);
			fail();
		} catch (ValidationException e) {
			assertTrue(e.getMessage().endsWith(
					"If the semanticId of a Qualifier references a ConceptDescription then the ConceptDescription/category shall be one of following values: QUALIFIER."));
		}
	}

	private Qualifier createConstraint(String conceptDescriptionId) {
		return new DefaultQualifier.Builder()
				.valueType(DataTypeDefXsd.STRING)
				.type("test")
				.semanticId(new DefaultReference.Builder().keys(new DefaultKey.Builder()
						.value(conceptDescriptionId).type(KeyTypes.CONCEPT_DESCRIPTION).build())
						.type(ReferenceTypes.GLOBAL_REFERENCE).build())
				.build();
	}

}
