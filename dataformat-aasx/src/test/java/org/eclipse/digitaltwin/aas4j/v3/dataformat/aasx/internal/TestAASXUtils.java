/*
 * Copyright (c) 2024 Fraunhofer-Gesellschaft zur Foerderung der angewandten Forschung e. V.
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

package org.eclipse.digitaltwin.aas4j.v3.dataformat.aasx.internal;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class TestAASXUtils {

	@Test
	public void isFilePath() {
		// Cf. RFC8089
		String[] filePaths = {
				"file://a", "file:a", "./b/c", "../b/c/d", "/a" 
		};
		
		String[] notFilePaths = {
				"http://admin-shell.io/example", "ftp://admin-shell.io/example"
		};

		for (String filePath : filePaths) {
			assertTrue(AASXUtils.isFilePath(filePath));
		}

		for (String filePath : notFilePaths) {
			assertFalse(AASXUtils.isFilePath(filePath));
		}
	}

	@Test
	public void removeFilePartOfURI() {
		String[] filePaths = {
				"file:///a", "file:/a", "/a"
		};

		for (String filePath : filePaths) {
			assertEquals("/a", AASXUtils.removeFilePartOfURI(filePath));
		}
	}
}
