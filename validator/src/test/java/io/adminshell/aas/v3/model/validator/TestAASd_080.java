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

import org.junit.Test;

import io.adminshell.aas.v3.rc02.model.Key;
import io.adminshell.aas.v3.model.KeyElements;
import io.adminshell.aas.v3.model.KeyType;
import io.adminshell.aas.v3.rc02.model.impl.DefaultKey;

/**
 * Tests the following constraint:
 * <p>
 * <i>In case Key/type == GlobalReference idType shall not be any LocalKeyType
 * (IdShort, FragmentId). </i>
 * </p>
 * 
 * @author schnicke
 *
 */
public class TestAASd_080 {
	private static final String ERRORMSG = "In case Key/type == GlobalReference idType shall not be any LocalKeyType (IdShort, FragmentId).";

	@Test
	public void correctIdType() throws ValidationException {
		Key key = createWithTypeGlobalReferenceKey(KeyType.CUSTOM);

		ShaclValidator.getInstance().validate(key);
	}

	@Test
	public void wrongIdTypeIdShort() {
		Key key = createWithTypeGlobalReferenceKey(KeyType.ID_SHORT);
		try {
			ShaclValidator.getInstance().validate(key);
			fail();
		} catch (ValidationException e) {
			assertTrue(e.getMessage().endsWith(ERRORMSG));
		}
	}

	@Test
	public void wrongIdTypeFragmentId() {
		Key key = createWithTypeGlobalReferenceKey(KeyType.FRAGMENT_ID);

		try {
			ShaclValidator.getInstance().validate(key);
			fail();
		} catch (ValidationException e) {
			assertTrue(e.getMessage().endsWith(ERRORMSG));
		}
	}

	private Key createWithTypeGlobalReferenceKey(KeyType custom) {
		return new DefaultKey.Builder()
				.value("value")
				.type(KeyElements.GLOBAL_REFERENCE)
				.idType(custom)
				.build();
	}

}
