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

import org.eclipse.digitaltwin.aas4j.v3.model.*;
import org.junit.Ignore;
import org.junit.Test;

import org.eclipse.digitaltwin.aas4j.v3.model.impl.DefaultBlob;
import org.eclipse.digitaltwin.aas4j.v3.model.impl.DefaultFile;
import org.eclipse.digitaltwin.aas4j.v3.model.impl.DefaultKey;
import org.eclipse.digitaltwin.aas4j.v3.model.impl.DefaultReference;

/**
 * Tests the following constraint:
 * <p>
 * <i> The semanticId of a File or Blob submodel element shall only reference a
 * ConceptDescription with the category DOCUMENT</i>
 * </p>
 * 
 * @author schnicke
 *
 */
@Ignore("Constraint has been removed")
public class TestAASd_057 {

	private final static String ERRORMSG = "The semanticId of a File or Blob submodel element shall only reference a ConceptDescription with the category DOCUMENT.";

	@Test
	public void correctCategoryFile() throws ValidationException {
		String conceptDescriptionId = "conceptDescription";

		ConceptDescription correctCD = ConstraintTestHelper.createConceptDescription("idShort1",
				conceptDescriptionId, "DOCUMENT");

		Submodel sm = ConstraintTestHelper
				.createSubmodel(
						Arrays.asList(createFile("submodelElementIdShort", conceptDescriptionId)));

		Environment correctEnv = ConstraintTestHelper.createEnvironment(sm,
				Arrays.asList(correctCD,
						ConstraintTestHelper.getIrrelevantConceptDescription()));

		ShaclValidator.getInstance().validate(correctEnv);
	}

	@Test
	public void wrongCategoryFile() {
		String conceptDescriptionWrong = "conceptDescriptionWrong";

		ConceptDescription wrongCD = ConstraintTestHelper.createConceptDescription("idShort1", conceptDescriptionWrong,
				"COLLECTION");

		Submodel sm = ConstraintTestHelper
				.createSubmodel(Arrays.asList(createFile("submodelElementIdShort", conceptDescriptionWrong)));
		
		Environment wrongEnv = ConstraintTestHelper.createEnvironment(sm,
				Arrays.asList(wrongCD, ConstraintTestHelper.getIrrelevantConceptDescription()));
		try {
			ShaclValidator.getInstance().validate(wrongEnv);
			fail();
		} catch (ValidationException e) {
			assertTrue(e.getMessage().endsWith(ERRORMSG));
		}
	}
	
	@Test
	public void correctCategoryBlob() throws ValidationException {
		String conceptDescriptionId = "conceptDescription";

		ConceptDescription correctCD = ConstraintTestHelper
				.createConceptDescription("idShort1", conceptDescriptionId, "DOCUMENT");

		Submodel sm = ConstraintTestHelper
				.createSubmodel(
						Arrays.asList(createBlob("submodelElementIdShort", conceptDescriptionId)));

		Environment correctEnv = ConstraintTestHelper.createEnvironment(sm,
				Arrays.asList(correctCD,
						ConstraintTestHelper.getIrrelevantConceptDescription()));

		ShaclValidator.getInstance().validate(correctEnv);
	}

	@Test
	public void wrongCategoryBlob() {
		String conceptDescriptionWrongId = "conceptDescriptionWrong";

		ConceptDescription wrongCD = ConstraintTestHelper.createConceptDescription("idShort1", conceptDescriptionWrongId,
				"COLLECTION");

		Submodel sm = ConstraintTestHelper
				.createSubmodel(Arrays.asList(createBlob("submodelElementIdShort", conceptDescriptionWrongId)));
		
		Environment wrongEnv = ConstraintTestHelper.createEnvironment(sm,
				Arrays.asList(wrongCD, ConstraintTestHelper.getIrrelevantConceptDescription()));
		try {
			ShaclValidator.getInstance().validate(wrongEnv);
			fail();
		} catch (ValidationException e) {
			assertTrue(e.getMessage().endsWith(ERRORMSG));
		}
	}

	private File createFile(String idShort, String conceptDescriptionId) {
		return new DefaultFile.Builder()
				.idShort(idShort)
				.contentType("application/json").value("file:///test.json")
				.semanticId(new DefaultReference.Builder()
						.keys(new DefaultKey.Builder()
								.value(conceptDescriptionId)
								.type(KeyTypes.CONCEPT_DESCRIPTION)
								.build())
						.type(ReferenceTypes.GLOBAL_REFERENCE)
						.build())
				.build();
	}
	
	private Blob createBlob(String idShort, String conceptDescriptionId) {
		return new DefaultBlob.Builder()
				.idShort(idShort)
				.contentType("application/json")
				.value(new byte[] { 0, 1, 2 })
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
