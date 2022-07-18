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
package org.eclipse.aas4j.v3.dataformat.rdf;

import java.io.IOException;
import java.net.URI;


import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonStreamContext;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.ser.std.StdSerializer;

public class UriSerializer extends StdSerializer<URI> {


	public UriSerializer() {
		this(null);
	}

	public UriSerializer(Class clazz) {
		super(clazz);
	}


	@Override
	public void serialize(URI value, JsonGenerator gen, SerializerProvider provider) throws IOException {
		String serializedUri = value.toString();
		//		String idPattern = "{\"@id\": \"" + serializedUri + "\"}";
		JsonStreamContext context = gen.getOutputContext();
		if (context.getCurrentName() != null && context.getCurrentName().contains("@id")) {
			gen.writeString(serializedUri);
		} else {
			gen.writeStartObject();
			gen.writeStringField("@id", serializedUri);
			gen.writeEndObject();
		}
	}

}
