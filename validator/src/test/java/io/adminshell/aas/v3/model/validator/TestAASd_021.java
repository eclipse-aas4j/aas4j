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

import io.adminshell.aas.v3.model.Constraint;
import io.adminshell.aas.v3.rc02.model.Qualifiable;
import io.adminshell.aas.v3.rc02.model.Qualifier;
import io.adminshell.aas.v3.rc02.model.impl.DefaultProperty;
import io.adminshell.aas.v3.rc02.model.impl.DefaultQualifier;
import org.junit.Ignore;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

/**
 * Tests the following constraint:
 * <p>
 * <i> The value of Qualifier/value shall be consistent to the data type as defined in Qualifier/valueType. </i>
 * </p>
 * 
 * @author bader, chang
 *
 */
public class TestAASd_021 {
	@Test
	@Ignore
	public void twoQualifierWithSameType() throws ValidationException {

		DefaultQualifier.Builder builder = new DefaultQualifier.Builder();
		Qualifier qualifier1 = builder
				.value("some Qualifier value")
				.valueType("http://www.w3.org/2001/XMLSchema#string")
				.type("string")
				.build();
		builder = null;

		builder = new DefaultQualifier.Builder();
		Qualifier qualifier2 = builder
				.value("some other Qualifier value")
				.valueType("http://www.w3.org/2001/XMLSchema#string")
				.type("string")
				.build();

		Qualifiable wrongQualifiable = new DefaultProperty.Builder()
				.idShort("wrongQualifiable")
				.valueType("string")
				.value("dummy")
				.qualifiers(new ArrayList<Constraint>() {{ add(qualifier1); add(qualifier2); }})
				.build();

		try {
			ShaclValidator.getInstance().validate(wrongQualifiable); // SPARQL Query does not fire in the shape for some reason
			fail();
		} catch (ValidationException e) {
			assertTrue(e.getMessage().endsWith(
					"Every Qualifiable can only have one Qualifier with the same Qualifier/type."));
		}
	}

	@Ignore // The model only allows strings as Qualifier/valueType --> It is not possible to check for non-strings yet.
	@Test
	public void twoCorrectQualifier() throws ValidationException {

		Qualifier qualifier1 = new DefaultQualifier.Builder()
				.value("some Qualifier value")
				.valueType("http://www.w3.org/2001/XMLSchema#string")
				.type("string")
				.build();

		Qualifier qualifier2 = new DefaultQualifier.Builder()
				.value("1")
				.valueType("integer")
				.valueType("http://www.w3.org/2001/XMLSchema#integer")
				.type("string")
				.build();

		Qualifiable qualifiable = new DefaultProperty.Builder()
				.idShort("correctQualifiable")
				.valueType("string")
				.value("dummy")
				.qualifiers(new ArrayList<Constraint>() {{ add(qualifier1); add(qualifier2); }})
				.build();

		ShaclValidator.getInstance().validate(qualifiable);

	}

	@Test
	public void oneCorrectQualifier() throws ValidationException {

		Qualifier qualifier1 = new DefaultQualifier.Builder()
				.value("some Qualifier value")
				.valueType("http://www.w3.org/2001/XMLSchema#string")
				.type("string")
				.build();

		Qualifiable qualifiable = new DefaultProperty.Builder()
				.idShort("correctQualifiable")
				.valueType("string")
				.value("dummy")
				.qualifiers(new ArrayList<Constraint>() {{ add(qualifier1); }})
				.build();

		ShaclValidator.getInstance().validate(qualifiable);

	}
}
