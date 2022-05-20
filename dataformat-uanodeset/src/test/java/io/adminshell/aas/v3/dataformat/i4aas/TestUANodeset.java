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

import java.io.InputStream;

import javax.xml.bind.JAXBException;

import org.opcfoundation.ua._2011._03.uanodeset.UANodeSet;

import io.adminshell.aas.v3.dataformat.i4aas.parsers.ParserContextTest;

public class TestUANodeset {

	public static UANodeSet AAS_SIMPLE_V3_DRAFT;

	public static UANodeSet AAS_EXAMPLE_1;

	static {
		AAS_SIMPLE_V3_DRAFT = readFromFile("/AASSimple_V3Draft.xml");

		String i4aasString;
		try {
			i4aasString = new I4AASSerializer().write(AASExamples.AAS_ENV_1);
			AAS_EXAMPLE_1 = readFromString(i4aasString);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static UANodeSet getAASSimpleV3Draft() {
		return AAS_SIMPLE_V3_DRAFT;
	}

	public static UANodeSet readFromFile(String name) {
		try (InputStream testResourceAsStream = ParserContextTest.class.getResourceAsStream(name)) {
			UANodeSet uaNodeSet = new UANodeSetUnmarshaller().unmarshall(testResourceAsStream);
			return uaNodeSet;
		} catch (Exception e) {
			throw new IllegalArgumentException("test resource '" + name + "' is not available", e);
		}
	}
	

	public static UANodeSet readFromString(String input) {
			UANodeSet uaNodeSet = null;
			try {
				uaNodeSet = new UANodeSetUnmarshaller().unmarshall(input);
			} catch (JAXBException e) {
				e.printStackTrace();
			}
			return uaNodeSet;
	}
}
