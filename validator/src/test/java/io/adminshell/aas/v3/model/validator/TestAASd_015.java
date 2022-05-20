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

import io.adminshell.aas.v3.model.*;
import io.adminshell.aas.v3.model.impl.DefaultAccessControl;
import io.adminshell.aas.v3.model.impl.DefaultOperation;
import io.adminshell.aas.v3.model.impl.DefaultProperty;
import io.adminshell.aas.v3.model.impl.DefaultSubjectAttributes;
import org.junit.Ignore;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

/**
 * Tests the following constraint:
 * <p>
 * <i> The data element SubjectAttributes/subjectAttribute shall be part of the submodel that is referenced within the
 * “selectableSubjectAttributes” attribute of “AccessControl” </i>
 * </p>
 * 
 * @author bader, chang
 *
 */
public class TestAASd_015 {


	@Test
	@Ignore
	public void noRelation() throws ValidationException {

		DataElement dataElement = new DefaultProperty.Builder()
				.idShort("property")
				.build();

		SubjectAttributes subjectAttributes = new DefaultSubjectAttributes.Builder()
				.subjectAttributes(new ArrayList<DataElement>() {{ add(dataElement); }} )
				.build();

		Reference reference = ConstraintTestHelper.createDummyReference();
		reference.getKeys().get(0).setValue(dataElement.getIdShort());
		reference.getKeys().get(0).setType(KeyElements.PROPERTY);

		AccessControl wrongAccessControl = new DefaultAccessControl.Builder()
				.selectableSubjectAttributes( reference )
				.defaultSubjectAttributes( ConstraintTestHelper.createDummyReference() )
				.defaultPermissions( ConstraintTestHelper.createDummyReference() )
				.build();

		try {
			ShaclValidator.getInstance().validate(wrongAccessControl);
			fail(); // TODO: I really have no clue what this constraint shall check...
		} catch (ValidationException e) {
			assertTrue(e.getMessage().endsWith(
					"The data element SubjectAttributes/subjectAttribute shall be part of the submodel that is " +
							"referenced within the “selectableSubjectAttributes” attribute of “AccessControl”"));
		}

	}

	@Test
	@Ignore
	public void correctRelation() throws ValidationException {

		DataElement dataElement = new DefaultProperty.Builder()
				.idShort("property")
				.build();

		SubjectAttributes subjectAttributes = new DefaultSubjectAttributes.Builder()
				.subjectAttributes(new ArrayList<DataElement>() {{ add(dataElement); }} )
				.build();

		Reference reference = ConstraintTestHelper.createDummyReference();
		reference.getKeys().get(0).setValue(dataElement.getIdShort());
		reference.getKeys().get(0).setType(KeyElements.PROPERTY);

		AccessControl accessControl = new DefaultAccessControl.Builder()
				.selectableSubjectAttributes( reference )
				.defaultSubjectAttributes( ConstraintTestHelper.createDummyReference() )
				.defaultPermissions( ConstraintTestHelper.createDummyReference() )
				.build();

		ShaclValidator.getInstance().validate(accessControl);
	}

}
