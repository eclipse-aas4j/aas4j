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

import org.opcfoundation.ua.i4aas.v3.types.AASKeyDataType;

import io.adminshell.aas.v3.rc02.model.Key;
import io.adminshell.aas.v3.model.KeyElements;
import io.adminshell.aas.v3.model.KeyType;
import io.adminshell.aas.v3.rc02.model.impl.DefaultKey;

public class KeyParser {

	private AASKeyDataType source;

	public KeyParser(AASKeyDataType key, ParserContext ctx) {
		this.source = key;
	}

	public Key parse() {
		DefaultKey defaultKey = new DefaultKey();

		defaultKey.setValue(source.getValue());
		
		if (source.getIdType() != null) {			
			KeyType keyType = (KeyType) I4AASGenericEnumParser.findMatch(source.getIdType().name(), KeyType.class);
			defaultKey.setIdType(keyType);
		}
		if (source.getType() != null) {			
			KeyElements keyElements = (KeyElements) I4AASGenericEnumParser.findMatch(source.getType().name(), KeyElements.class);
			defaultKey.setType(keyElements);
		}		
		
		return defaultKey;
	}


}
