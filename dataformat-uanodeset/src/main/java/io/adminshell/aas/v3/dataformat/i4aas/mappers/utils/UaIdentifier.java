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
package io.adminshell.aas.v3.dataformat.i4aas.mappers.utils;

public enum UaIdentifier implements BasicIdentifier  {
	
	Boolean("Boolean", 1),
	String("String", 12),
	DateTime("DateTime", 13),
	ByteString("ByteString", 15),
	LocalizedText("LocalizedText", 21),
	Organizes("Organizes", 35),
	HasTypeDefinition("HasTypeDefinition", 40),
	HasProperty("HasProperty", 46),
	HasComponent("HasComponent", 47),
	HasOrderedComponent("HasOrderedComponent", 49),
	FolderType("FolderType", 61),
	PropertyType("PropertyType", 68),
	IdType("IdType", 256),
	NumericRange("NumericRange", 291),
	HasAddIn("HasAddIn", 17604),
	HasDictionaryEntry("HasDictionaryEntry", 17597);
	
	private String name;
	private Integer id;

	private UaIdentifier(String name, Integer id) {
		this.name = name;
		this.id = id;
	}
	
	public String getName() {
		return name;
	}

	public Integer getId() {
		return id;
	}
}
