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

import java.util.Arrays;

import org.eclipse.aas4j.v3.model.*;
import org.eclipse.aas4j.v3.model.impl.DefaultKey;
import org.eclipse.aas4j.v3.model.impl.DefaultProperty;
import org.eclipse.aas4j.v3.model.impl.DefaultReference;

import org.junit.Ignore;
import org.junit.Test;

/**
 * Tests the following constraint:
 * <p>
 * <i> If the semanticId of a Property references a ConceptDescription then the
 * ConceptDescription/category shall be one of following values: VALUE,
 * PROPERTY. </i>
 * </p>
 * 
 * @author schnicke
 *
 */
@Ignore("Constraint AASd_052a has been removed")
public class TestAASd_052a {
	@Test
	public void correctCategories() throws ValidationException {
		String conceptDescriptionPropertyId = "conceptDescriptionProperty";
		String conceptDescriptionValueId = "conceptDescriptionValue";

		ConceptDescription correctPropertyCD = ConstraintTestHelper
				.createConceptDescription("idShort1", conceptDescriptionPropertyId, "PROPERTY");

		ConceptDescription correctValueCD = ConstraintTestHelper.createConceptDescription("idShort2",
				conceptDescriptionValueId, "VALUE");

		Submodel sm = ConstraintTestHelper
				.createSubmodel(Arrays.asList(createProperty("submodelElementIdShort1", conceptDescriptionValueId),
						createProperty("submodelElementIdShort2", conceptDescriptionPropertyId)));

		Environment correctEnv = ConstraintTestHelper.createEnvironment(sm, Arrays.asList(correctValueCD, correctPropertyCD,
						ConstraintTestHelper.getIrrelevantConceptDescription()));

		ShaclValidator.getInstance().validate(correctEnv);
	}

	@Test
	public void wrongCategory() {
		String conceptDescriptionWrongId = "conceptDescriptionWrong";

		ConceptDescription wrongCD = ConstraintTestHelper.createConceptDescription("idShort1", conceptDescriptionWrongId,
				"COLLECTION");

		Submodel sm = ConstraintTestHelper
				.createSubmodel(Arrays.asList(createProperty("submodelElementIdShort", conceptDescriptionWrongId)));
		
		Environment wrongEnv = ConstraintTestHelper.createEnvironment(sm,
				Arrays.asList(wrongCD, ConstraintTestHelper.getIrrelevantConceptDescription()));

		try {
			ShaclValidator.getInstance().validate(wrongEnv);
			fail();
		} catch (ValidationException e) {
			assertTrue(e.getMessage().endsWith(
					"If the semanticId of a Property references a ConceptDescription then the ConceptDescription/category shall be one of following values: VALUE, PROPERTY."));
		}
	}

	private Property createProperty(String idShort, String conceptDescriptionId) {
		return new DefaultProperty.Builder()
				.idShort(idShort)
				.valueType(DataTypeDefXsd.STRING)
				.value("TestValue")
				.semanticId(new DefaultReference.Builder()
						.keys(new DefaultKey.Builder()
								.value(conceptDescriptionId)
								.type(KeyTypes.CONCEPT_DESCRIPTION)
								.build())
						.type(ReferenceTypes.GLOBAL_REFERENCE)
						.build())
				.build();
	}


}
