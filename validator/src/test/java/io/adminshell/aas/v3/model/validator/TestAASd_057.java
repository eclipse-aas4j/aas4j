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
import io.adminshell.aas.v3.rc02.model.Blob;
import io.adminshell.aas.v3.rc02.model.ConceptDescription;
import io.adminshell.aas.v3.rc02.model.File;
import io.adminshell.aas.v3.model.KeyElements;
import io.adminshell.aas.v3.model.KeyType;
import io.adminshell.aas.v3.rc02.model.Submodel;
import io.adminshell.aas.v3.rc02.model.impl.DefaultBlob;
import io.adminshell.aas.v3.rc02.model.impl.DefaultFile;
import io.adminshell.aas.v3.rc02.model.impl.DefaultKey;
import io.adminshell.aas.v3.rc02.model.impl.DefaultReference;

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

		AssetAdministrationShellEnvironment correctEnv = ConstraintTestHelper.createEnvironment(sm,
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
		
		AssetAdministrationShellEnvironment wrongEnv = ConstraintTestHelper.createEnvironment(sm,
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

		AssetAdministrationShellEnvironment correctEnv = ConstraintTestHelper.createEnvironment(sm,
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
		
		AssetAdministrationShellEnvironment wrongEnv = ConstraintTestHelper.createEnvironment(sm,
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
				.mimeType("application/json").value("test.json")
				.semanticId(new DefaultReference.Builder()
						.key(new DefaultKey.Builder()
								.idType(KeyType.CUSTOM)
								.value(conceptDescriptionId)
								.type(KeyElements.CONCEPT_DESCRIPTION)
								.build())
						.build())
				.build();
	}
	
	private Blob createBlob(String idShort, String conceptDescriptionId) {
		return new DefaultBlob.Builder()
				.idShort(idShort)
				.mimeType("application/json")
				.value(new byte[] { 0, 1, 2 })
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
