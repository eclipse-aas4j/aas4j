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

import java.util.Arrays;
import java.util.Optional;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import io.adminshell.aas.v3.dataformat.i4aas.mappers.utils.BasicIdentifier;
import io.adminshell.aas.v3.dataformat.i4aas.mappers.utils.I4AASIdentifier;
import io.adminshell.aas.v3.dataformat.i4aas.mappers.utils.UaIdentifier;

public class TypeResolver {

	private final int i4aasNsIdx;

	private final static Pattern ns0NodeIdPattern = Pattern.compile("^i=(\\d+)$");
	private final static Pattern nsXNodeIdPattern = Pattern.compile("^ns=(\\d+);i=(\\d+)$");

	public TypeResolver(int i4aasNsIdx) {
		this.i4aasNsIdx = i4aasNsIdx;
	}

	public Optional<? extends BasicIdentifier> getType(String typeId) {
		Matcher ns0matcher = ns0NodeIdPattern.matcher(typeId);
		if (ns0matcher.matches()) {
			int parsedId = Integer.parseInt(ns0matcher.group(1));
			return Arrays.stream(UaIdentifier.values()).filter(identifier -> parsedId == identifier.getId())
					.findFirst();
		}

		Matcher nsXmatcher = nsXNodeIdPattern.matcher(typeId);
		if (nsXmatcher.matches()) {
			int parsedNs = Integer.parseInt(nsXmatcher.group(1));
			int parsedId = Integer.parseInt(nsXmatcher.group(2));
			if (parsedNs == i4aasNsIdx) {
				return Arrays.stream(I4AASIdentifier.values()).filter(identifier -> parsedId == identifier.getId())
						.findFirst();
			}
		}

		return Optional.empty();
	}

}