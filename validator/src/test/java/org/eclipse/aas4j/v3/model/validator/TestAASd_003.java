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

import org.eclipse.aas4j.v3.model.Referable;
import org.eclipse.aas4j.v3.model.impl.DefaultSubmodel;
import org.junit.Ignore;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

/**
 * Tests the following constraint:
 * <p>
 * <i> idShort shall be matched case-insensitive. </i>
 * </p>
 * 
 * @author bader, chang
 *
 */
public class TestAASd_003 {
	@Test
	@Ignore
	public void idShortMatchCaseInsensitive() throws ValidationException {
		DefaultSubmodel smA = (DefaultSubmodel) ConstraintTestHelper.createSubmodel(new ArrayList<>());
		smA.setIdShort("idShort");

		Referable smB = (DefaultSubmodel) ConstraintTestHelper.createSubmodel(new ArrayList<>());
		smB.setIdShort("IDSHORT");

		assertTrue(smA.equals(smB)); // TODO: should be true but requires adjustments in the Java Model

	}

}
