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

import org.opcfoundation.ua._2011._03.uanodeset.UAVariable;

public class I4AASGenericEnumParser extends I4AASParser<Enum<?>> {

	private Class<? extends Enum<?>> targetEnum;

	public I4AASGenericEnumParser(UANodeWrapper src, ParserContext ctx, Class<? extends Enum<?>> targetEnumClass) {
		super(src, ctx);
		this.targetEnum = targetEnumClass;
	}

	@Override
	protected Enum<?> createTargetObject() {
		UAVariable nodeVariable = source.getNodeVariable();

		Class<? extends Enum> loadEnum;
		try {
			loadEnum = (Class<? extends Enum>) getClass().getClassLoader()
					.loadClass("org.opcfoundation.ua.i4aas.v3.types." + nodeVariable.getDataType());
		} catch (ClassNotFoundException e) {
			throw new IllegalArgumentException(nodeVariable.getDataType() + " is not supported.", e);
		}

		Integer enumIdx = ParserUtils.extractValueAsInteger(nodeVariable);
		if (enumIdx == null) {
			return null;
		}

		Enum<?> enumByIdx = loadEnum.getEnumConstants()[enumIdx];
		return findMatch(enumByIdx.name(), targetEnum);

	}

	public static final Enum<?> findMatch(String name, Class<? extends Enum<?>> targetEnumClass) {
		int lastUnderscore = name.lastIndexOf("_");
		String sourceEnumCandidateName = name.substring(0, lastUnderscore).toLowerCase();
		for (Enum<?> enum1 : targetEnumClass.getEnumConstants()) {
			if (enum1.name().toLowerCase().equals(sourceEnumCandidateName)) {
				return enum1;
			}
		}
		throw new IllegalArgumentException(
				String.format("No match found in %s for %s", targetEnumClass.getSimpleName(), name));
	}

	@Override
	protected void parseAndAttachChildren() {
		// nothing to do
	}

}
