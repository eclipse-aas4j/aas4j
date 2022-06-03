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
package org.eclipse.aas4j.v3.rc02.dataformat.rdf.preprocessing;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;

public class TypeNamePreprocessor extends BasePreprocessor {

	private static final Map<String, String> prefixes;

	static {
		prefixes = new HashMap<>();
		prefixes.put("ids:", "https://w3id.org/idsa/core/");
		prefixes.put("idsc:", "https://w3id.org/idsa/code/");
		prefixes.put("info:", "http://www.fraunhofer.de/fraunhofer-digital/infomodell#");
		prefixes.put("kdsf:", "http://kerndatensatz-forschung.de/version1/technisches_datenmodell/owl/Basis#");
	}

	@Override
	String preprocess_impl(String input) throws IOException {
		ObjectMapper mapper = new ObjectMapper();
		Map<?, ?> inMap = mapper.readValue(input, Map.class);
		Map<?, ?> outMap = unifyTypeURIPrefix(inMap);
		return mapper.writeValueAsString(outMap);
	}


	private Map<?, ?> unifyTypeURIPrefix(Map<?, ?> in) {
		Map<Object, Object> out = new LinkedHashMap<>();
		in.forEach((k,v) -> {
			if(v instanceof String && k instanceof String && k.equals("@type")) {


				// if key is @type and value is a string: add 'ids:' if no other namespace at the value
				AtomicReference<String> modifiableValue = new AtomicReference<>((String) v);
				prefixes.forEach((p, u) -> modifiableValue.set(modifiableValue.get().replace(u, p))); // replace full URI with prefix
				if(! (modifiableValue.get().startsWith("ids:")
						|| modifiableValue.get().startsWith("idsc:")
						|| modifiableValue.get().startsWith("info:")
						|| modifiableValue.get().startsWith("kdsf:")
						|| modifiableValue.get().startsWith("xsd:")
						|| modifiableValue.get().startsWith("http://")
						|| modifiableValue.get().startsWith("https://"))) {
					modifiableValue.set("ids:".concat(modifiableValue.get())); // default to ids prefix for backwards compatibility
				}
				out.put(k, modifiableValue.get());


			} else if(v instanceof Map) {
				AtomicReference<String> modifiableKey = new AtomicReference<>((String) k);

				prefixes.forEach((prefix, uri) -> modifiableKey.set(modifiableKey.get().replace(uri, prefix))); // replace full URI with prefix
				if(! (modifiableKey.get().startsWith("ids:")
						|| modifiableKey.get().startsWith("info:")
						|| modifiableKey.get().startsWith("kdsf:")
						|| modifiableKey.get().startsWith("http://")
						|| modifiableKey.get().startsWith("https://")
						|| modifiableKey.get().startsWith("@context"))) {
					modifiableKey.set("ids:".concat(modifiableKey.get())); // default to ids prefix for backwards compatibility
				}


				// shorten an @id Map
				if (((Map<?, ?>) v).containsKey("@id") && ((Map<?, ?>) v).keySet().size() == 1) {
					Map idMap = new LinkedHashMap<>();
					idMap.put(k, ((Map) v).get("@id"));

					out.putAll(unifyTypeURIPrefix(idMap));

				} else if (((Map) v).containsKey("@value") && 
						((Map) v).containsKey("@type"))
				{
					if( ((Map) v).get("@type").toString().contains("dateTime")	)
					{

						// shorten an @value Map with xsd:dateTimes
						Object date = ((Map) v).get("@value");
						out.put(modifiableKey, date);
					}
					else if(((Map) v).get("@type").toString().equals("xsd:integer"))
					{
						int value = Integer.parseInt(((Map) v).get("@value").toString());
						out.put(modifiableKey, value);
					}
					else { //Do the same as below
						out.put(modifiableKey, unifyTypeURIPrefix((Map) v));
					}
				
				} else {

					out.put(modifiableKey, unifyTypeURIPrefix((Map) v));


				}

			} else if(v instanceof ArrayList) {


				AtomicReference<String> modifiableKey = new AtomicReference<>((String) k);
				prefixes.forEach((p, u) -> modifiableKey.set(modifiableKey.get().replace(u, p))); // replace full URI with prefix
				if(! (modifiableKey.get().startsWith("ids:")
						|| modifiableKey.get().startsWith("info:")
						|| modifiableKey.get().startsWith("kdsf:")
						|| modifiableKey.get().startsWith("http://")
						|| modifiableKey.get().startsWith("https://"))) {
					modifiableKey.set("ids:".concat(modifiableKey.get())); // default to ids prefix for backwards compatibility
				}
				
				Iterator iter = new ArrayList((ArrayList) v).iterator(); //making a copy of the old array so the iterator does not get confused by the element deletions
				while (iter.hasNext()) {
					Object child = iter.next();
					if (child instanceof Map && ((Map) child).containsKey("@id") && ((Map) child).keySet().size() == 1) {
						((ArrayList) v).remove(child);
						((ArrayList) v).add(((Map) child).get("@id"));
					}
				}

				out.put(modifiableKey, unifyTypeURIPrefix((ArrayList) v)); // TODO: What happens with an Array inside the Array?


			} else {


				AtomicReference<String> modifiableKey = new AtomicReference<>((String) k);
				prefixes.forEach((p, u) -> modifiableKey.set(modifiableKey.get().replace(u, p))); // replace full URI with prefix
				if(! (modifiableKey.get().startsWith("ids:")
						|| modifiableKey.get().startsWith("info:")
						|| modifiableKey.get().startsWith("kdsf:")
						|| modifiableKey.get().startsWith("http://")
						|| modifiableKey.get().startsWith("https://")
						|| modifiableKey.get().startsWith("@"))) {
					//in the context definition, a pair might look like this: "ids" : "http://www.someURL.com"
					//Here, we start with "ids", not "ids:". So we also need to check that the key is not contained in our prefixes
					if(!prefixes.containsKey(modifiableKey.get() + ":")) {
						modifiableKey.set("ids:".concat(modifiableKey.get())); // default to ids prefix for backwards compatibility
					}
				}

				out.put(modifiableKey, v); // modify nothing if not @type or a map
			}
		});
		return out;
	}


	private ArrayList unifyTypeURIPrefix(ArrayList in) {
		ArrayList out = new ArrayList<>();

		Iterator iter = in.iterator();

		while (iter.hasNext()) {
			Object v = iter.next();
			if(v instanceof Map) {


				if (!((Map) v).isEmpty())
					out.add( unifyTypeURIPrefix((Map) v));


			} else if (v instanceof String) {

				out.add(v); // modify nothing if not @type or a map
			} else {
				out.add(v);
			}
		}
		return out;
	}




}
