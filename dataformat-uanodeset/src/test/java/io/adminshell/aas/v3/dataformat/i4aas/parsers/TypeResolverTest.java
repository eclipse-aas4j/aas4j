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
package io.adminshell.aas.v3.dataformat.i4aas.parsers;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.util.Optional;

import org.junit.Test;

import io.adminshell.aas.v3.dataformat.i4aas.mappers.utils.BasicIdentifier;
import io.adminshell.aas.v3.dataformat.i4aas.mappers.utils.I4AASIdentifier;
import io.adminshell.aas.v3.dataformat.i4aas.mappers.utils.UaIdentifier;

public class TypeResolverTest {

	@Test
	public void testGetBasicType() {
		TypeResolver typeResolver = new TypeResolver(5);
		Optional<? extends BasicIdentifier> type = typeResolver.getType("i=" + UaIdentifier.FolderType.getId());
		assertFalse(type.isEmpty());
		assertTrue(UaIdentifier.FolderType == type.get());
	}

	@Test
	public void testGetI4aasType() {
		TypeResolver typeResolver = new TypeResolver(5);
		Optional<? extends BasicIdentifier> type = typeResolver.getType("ns=5;i=" + I4AASIdentifier.AASSubmodelType.getId());
		assertFalse(type.isEmpty());
		assertTrue(I4AASIdentifier.AASSubmodelType == type.get());
	}
}