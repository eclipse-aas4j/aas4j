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

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import java.util.Arrays;

import org.junit.Test;

import io.adminshell.aas.v3.model.AssetAdministrationShellEnvironment;
import io.adminshell.aas.v3.model.ConceptDescription;
import io.adminshell.aas.v3.model.KeyElements;
import io.adminshell.aas.v3.model.KeyType;
import io.adminshell.aas.v3.model.Submodel;
import io.adminshell.aas.v3.model.SubmodelElementCollection;
import io.adminshell.aas.v3.model.impl.DefaultKey;
import io.adminshell.aas.v3.model.impl.DefaultReference;
import io.adminshell.aas.v3.model.impl.DefaultSubmodelElementCollection;

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
public class TestAASd_093_059_COLLECTION {
	@Test
	public void correctCategoryAllowDuplicates() throws ValidationException {
		String conceptDescriptionCollectionId = "conceptDescriptionCollection";

		ConceptDescription correctCategoryCollectionCD = ConstraintTestHelper.createConceptDescription("idShort1",
				conceptDescriptionCollectionId, "COLLECTION");

		SubmodelElementCollection noDuplicatesCollection = createSubmodelElementCollection("submodelElementIdShort2",
				conceptDescriptionCollectionId);
		noDuplicatesCollection.setAllowDuplicates(true);

		Submodel sm = ConstraintTestHelper
				.createSubmodel(Arrays.asList(
		));

		AssetAdministrationShellEnvironment correctEnv = ConstraintTestHelper.createEnvironment(sm,
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
		noDuplicatesCollection.setAllowDuplicates(true);

		Submodel sm = ConstraintTestHelper
				.createSubmodel(Arrays.asList(noDuplicatesCollection));

		AssetAdministrationShellEnvironment wrongEnv = ConstraintTestHelper.createEnvironment(sm,
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
						.key(new DefaultKey.Builder()
								.idType(KeyType.CUSTOM)
								.value(conceptDescriptionId)
								.type(KeyElements.CONCEPT_DESCRIPTION)
								.build())
						.build())
				.build();
	}
}
