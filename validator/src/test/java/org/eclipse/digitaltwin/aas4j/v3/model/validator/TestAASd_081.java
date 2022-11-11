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

import org.eclipse.digitaltwin.aas4j.v3.model.Key;
import org.eclipse.digitaltwin.aas4j.v3.model.KeyTypes;
import org.eclipse.digitaltwin.aas4j.v3.model.impl.DefaultKey;
import org.junit.Ignore;
import org.junit.Test;

/**
 * Tests the following constraint:
 * <p>
 * <i>In case Key/type==AssetAdministrationShell Key/idType shall not be any
 * LocalKeyType (IdShort, FragmentId).</i>
 * </p>
 * 
 * @author schnicke
 *
 */
@Ignore("Constraint has been removed")
public class TestAASd_081 {
	private static final String ERRORMSG = "In case Key/type==AssetAdministrationShell Key/idType shall not be any LocalKeyType (IdShort, FragmentId).";

	@Test
	public void correctIdType() throws ValidationException {
		Key key = createWithTypeAssetAdministrationShellKey();

		ShaclValidator.getInstance().validate(key);
	}

	@Test
	public void wrongIdTypeIdShort() {
		Key key = createWithTypeAssetAdministrationShellKey();
		try {
			ShaclValidator.getInstance().validate(key);
			fail();
		} catch (ValidationException e) {
			assertTrue(e.getMessage().endsWith(ERRORMSG));
		}
	}

	@Test
	public void wrongIdTypeFragmentId() {
		Key key = createWithTypeAssetAdministrationShellKey();

		try {
			ShaclValidator.getInstance().validate(key);
			fail();
		} catch (ValidationException e) {
			assertTrue(e.getMessage().endsWith(ERRORMSG));
		}
	}

	private Key createWithTypeAssetAdministrationShellKey() {
		return new DefaultKey.Builder()
				.value("value")
				.type(KeyTypes.ASSET_ADMINISTRATION_SHELL)
				.build();
	}

}
