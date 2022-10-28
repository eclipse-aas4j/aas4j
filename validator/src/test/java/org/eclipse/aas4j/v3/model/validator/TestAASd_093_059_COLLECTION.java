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

import org.eclipse.aas4j.v3.model.impl.DefaultKey;
import org.eclipse.aas4j.v3.model.impl.DefaultReference;
import org.eclipse.aas4j.v3.model.impl.DefaultSubmodelElementCollection;
import org.junit.Ignore;
import org.junit.Test;

import org.eclipse.aas4j.v3.model.Environment;
import org.eclipse.aas4j.v3.model.ConceptDescription;
import org.eclipse.aas4j.v3.model.KeyTypes;
import org.eclipse.aas4j.v3.model.Submodel;
import org.eclipse.aas4j.v3.model.SubmodelElementCollection;

/**
 * Tests the following constraint:
 * <p>
 * <i>If the semanticId of a SubmodelElementCollection with
 * SubmodelElementCollection/allowDuplicates == true references a
 * ConceptDescription then the ConceptDescription/category shall be COLLECTION.
 * </i>
 * </p>
 * 
 * Additionally, covers part of AASd-059. Full coverage is achieved in
 * combination with AASd-092
 * 
 * @author schnicke
 *
 */
@Ignore("Constraint has been removed")
public class TestAASd_093_059_COLLECTION {
	@Test
	public void correctCategoryAllowDuplicates() throws ValidationException {
		String conceptDescriptionCollectionId = "conceptDescriptionCollection";

		ConceptDescription correctCategoryCollectionCD = ConstraintTestHelper.createConceptDescription("idShort1",
				conceptDescriptionCollectionId, "COLLECTION");

		SubmodelElementCollection noDuplicatesCollection = createSubmodelElementCollection("submodelElementIdShort2",
				conceptDescriptionCollectionId);
//		noDuplicatesCollection.setAllowDuplicates(true);

		Submodel sm = ConstraintTestHelper
				.createSubmodel(Arrays.asList(
		));

		Environment correctEnv = ConstraintTestHelper.createEnvironment(sm,
				Arrays.asList(correctCategoryCollectionCD,
						ConstraintTestHelper.getIrrelevantConceptDescription()));

		ShaclValidator.getInstance().validate(correctEnv);
	}

	@Test
	public void wrongCategoryAllowDuplicates() {
		String conceptDescriptionCollectionId = "conceptDescriptionCollection";

		ConceptDescription wrongCategoryCollectionCD = ConstraintTestHelper.createConceptDescription("idShort1",
				conceptDescriptionCollectionId, "ENTITY");

		SubmodelElementCollection noDuplicatesCollection = createSubmodelElementCollection("submodelElementIdShort2",
				conceptDescriptionCollectionId);
//		noDuplicatesCollection.setAllowDuplicates(true);

		Submodel sm = ConstraintTestHelper
				.createSubmodel(Arrays.asList(noDuplicatesCollection));

		Environment wrongEnv = ConstraintTestHelper.createEnvironment(sm,
				Arrays.asList(wrongCategoryCollectionCD, ConstraintTestHelper.getIrrelevantConceptDescription()));
		try {
			ShaclValidator.getInstance().validate(wrongEnv);
			fail();
		} catch (ValidationException e) {
			assertTrue(e.getMessage().endsWith(
					"If the semanticId of a SubmodelElementCollection with SubmodelElementCollection/allowDuplicates == true references a ConceptDescription then the ConceptDescription/category shall be COLLECTION."));
		}
	}

	private SubmodelElementCollection createSubmodelElementCollection(String idShort, String conceptDescriptionId) {
		return new DefaultSubmodelElementCollection.Builder()
				.idShort(idShort)
				.semanticId(new DefaultReference.Builder()
						.keys(new DefaultKey.Builder()
								.value(conceptDescriptionId)
								.type(KeyTypes.CONCEPT_DESCRIPTION)
								.build())
						.build())
				.build();
	}
}
