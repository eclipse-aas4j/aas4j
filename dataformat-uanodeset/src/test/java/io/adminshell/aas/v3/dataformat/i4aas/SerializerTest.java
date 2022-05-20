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
package io.adminshell.aas.v3.dataformat.i4aas;

import java.io.IOException;
import java.lang.reflect.Field;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

import io.adminshell.aas.v3.dataformat.SerializationException;
import io.adminshell.aas.v3.dataformat.core.AASFull;
import io.adminshell.aas.v3.dataformat.core.AASSimple;
import io.adminshell.aas.v3.dataformat.i4aas.mappers.I4AASMapper;
import io.adminshell.aas.v3.dataformat.i4aas.mappers.MappingContext;
import io.adminshell.aas.v3.model.impl.DefaultAssetAdministrationShellEnvironment;

public class SerializerTest {

	@BeforeClass
	public static void before() {
		MappingContext.setModelNamespaceNamingStrategy(nodeset -> "http://example.org/SerializerTest");
		I4AASMapper.CHECK_NS_INTERN_REFERENCES_ATTACHED = true;
	}

	@Test
	public void testEmpty() throws SerializationException {
		I4AASSerializer i4aasSerializer = new I4AASSerializer();
		String write = i4aasSerializer.write(new DefaultAssetAdministrationShellEnvironment());
	}

	@Test
	public void testSimple() throws SerializationException, IllegalArgumentException, IllegalAccessException {
		I4AASSerializer i4aasSerializer = new I4AASSerializer();
		String write = i4aasSerializer.write(AASSimple.ENVIRONMENT);
        for (String toCheck : getContainedStrings(AASSimple.class)) {
			if (toCheck.toLowerCase().contains("thumbnail")) {
				//gets remapped to DefaultThumbnail
				toCheck = "DefaultThumbnail";
			}
			if (toCheck.equals("integer") || toCheck.equals("langString")) {
				//ignore, gets mapped to enum index values
				continue;
			}
			Assert.assertTrue("contains " + toCheck, write.contains(toCheck));
		}
		System.out.println(write);
	}

	@Test
	public void testSimpleToFile() throws SerializationException, IOException {
		Path createTempFile = Files.createTempFile("testSimpleToFile", ".xml");
		I4AASSerializer i4aasSerializer = new I4AASSerializer();
		i4aasSerializer.write(createTempFile.toFile(), AASSimple.ENVIRONMENT);
	}

	@Test
	public void testFull() throws SerializationException {
		I4AASSerializer i4aasSerializer = new I4AASSerializer();
		String write = i4aasSerializer.write(AASFull.ENVIRONMENT);
	}

    private static List<String> getContainedStrings(Class<?> testModelClass) throws IllegalArgumentException, IllegalAccessException {
        List<String> results = new ArrayList<>();
        for (Field field : AASSimple.class.getDeclaredFields()) {
            field.setAccessible(true);
            if (field.getType() == String.class) {
                Object object = field.get(null);
                results.add((String) object);
            }
        }
        return results;
    }
}
