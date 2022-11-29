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
import org.eclipse.digitaltwin.aas4j.v3.model.impl.*;

import org.junit.Ignore;
import org.junit.Test;

/**
 * Tests the following constraint:
 * <p>
 * <i> If the semanticId of a RelationshipElement or an
 * AnnotatedRelationshipElement submodel element references a ConceptDescription
 * then the ConceptDescription/category shall be one of following values:
 * RELATIONSHIP. </i>
 * </p>
 * 
 * @author schnicke
 *
 */
@Ignore("Constraint has been removed")
public class TestAASd_055 {

	private final static String ERRORMSG = "If the semanticId of a RelationshipElement or an AnnotatedRelationshipElement submodel element references a ConceptDescription then the ConceptDescription/category shall be one of following values: RELATIONSHIP.";

	@Test
	public void correctCategoryRelationshipElement() throws ValidationException {
		String conceptDescriptionId = "conceptDescription";

		ConceptDescription correctCD = ConstraintTestHelper
				.createConceptDescription("idShort1", conceptDescriptionId, "RELATIONSHIP");

		Submodel sm = ConstraintTestHelper
				.createSubmodel(
						Arrays.asList(createRelationshipElement("submodelElementIdShort", conceptDescriptionId)));

		Environment correctEnv = ConstraintTestHelper.createEnvironment(sm,
				Arrays.asList(correctCD,
						ConstraintTestHelper.getIrrelevantConceptDescription()));

		ShaclValidator.getInstance().validate(correctEnv);
	}

	@Test
	public void wrongCategoryRelationshipElement() {
		String conceptDescriptionWrongId = "conceptDescriptionWrong";

		ConceptDescription wrongCD = ConstraintTestHelper.createConceptDescription("idShort1", conceptDescriptionWrongId,
				"COLLECTION");

		Submodel sm = ConstraintTestHelper
				.createSubmodel(Arrays.asList(createRelationshipElement("submodelElementIdShort", conceptDescriptionWrongId)));
		
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
	public void correctCategoryAnnotatedRelationshipElement() throws ValidationException {
		String conceptDescriptionId = "conceptDescriptionProperty";

		ConceptDescription correctCD = ConstraintTestHelper
				.createConceptDescription("idShort1", conceptDescriptionId, "RELATIONSHIP");

		Submodel sm = ConstraintTestHelper
				.createSubmodel(
						Arrays.asList(createAnnotatedRelationshipElement("submodelElementIdShort", conceptDescriptionId)));

		Environment correctEnv = ConstraintTestHelper.createEnvironment(sm,
				Arrays.asList(correctCD,
						ConstraintTestHelper.getIrrelevantConceptDescription()));

		ShaclValidator.getInstance().validate(correctEnv);
	}

	@Test
	public void wrongCategoryAnnotatedRelationshipElement() {
		String conceptDescriptionWrongId = "conceptDescriptionWrong";

		ConceptDescription wrongCD = ConstraintTestHelper.createConceptDescription("idShort1", conceptDescriptionWrongId,
				"COLLECTION");

		Submodel sm = ConstraintTestHelper
				.createSubmodel(Arrays.asList(createAnnotatedRelationshipElement("submodelElementIdShort", conceptDescriptionWrongId)));
		
		Environment wrongEnv = ConstraintTestHelper.createEnvironment(sm,
				Arrays.asList(wrongCD, ConstraintTestHelper.getIrrelevantConceptDescription()));
		try {
			ShaclValidator.getInstance().validate(wrongEnv);
			fail();
		} catch (ValidationException e) {
			assertTrue(e.getMessage().endsWith(ERRORMSG));
		}
	}

	private RelationshipElement createRelationshipElement(String idShort, String conceptDescriptionId) {
		return new DefaultRelationshipElement.Builder()
				.idShort(idShort)
				.first(ConstraintTestHelper.createDummyReference())
				.second(ConstraintTestHelper.createDummyReference())
				.semanticId(new DefaultReference.Builder()
						.keys(new DefaultKey.Builder()
								.value(conceptDescriptionId)
								.type(KeyTypes.CONCEPT_DESCRIPTION)
								.build())
						.type(ReferenceTypes.GLOBAL_REFERENCE)
						.build())
				.build();
	}
	
	private AnnotatedRelationshipElement createAnnotatedRelationshipElement(String idShort, String conceptDescriptionId) {
		return new DefaultAnnotatedRelationshipElement.Builder()
				.idShort(idShort)
				.first(ConstraintTestHelper.createDummyReference())
				.second(ConstraintTestHelper.createDummyReference())
				.annotations(new DefaultProperty.Builder()
						.idShort("annotationIdShort")
						.value("annotation")
						.valueType(DataTypeDefXsd.STRING)
						.build())
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
