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
package io.adminshell.aas.v3.dataformat.i4aas.mappers;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

import javax.xml.bind.JAXBElement;

import io.adminshell.aas.v3.rc02.model.AssetKind;
import io.adminshell.aas.v3.rc02.model.EntityType;
import io.adminshell.aas.v3.rc02.model.ModelingKind;
import org.opcfoundation.ua._2008._02.types.ObjectFactory;
import org.opcfoundation.ua._2011._03.uanodeset.UAVariable;

import io.adminshell.aas.v3.dataformat.i4aas.mappers.utils.UaIdentifier;

public class I4AASEnumMapper extends I4AASMapper<Enum<?>, UAVariable> {

	public final static Map<Class<? extends Enum>, Class<? extends Enum>> enum2enumMap = new HashMap<>();

	static {
		enum2enumMap.put(io.adminshell.aas.v3.model.KeyElements.class,
				org.opcfoundation.ua.i4aas.v3.types.AASKeyElementsDataType.class);
		enum2enumMap.put(io.adminshell.aas.v3.model.KeyType.class,
				org.opcfoundation.ua.i4aas.v3.types.AASKeyTypeDataType.class);
		enum2enumMap.put(AssetKind.class,
				org.opcfoundation.ua.i4aas.v3.types.AASAssetKindDataType.class);
		enum2enumMap.put(io.adminshell.aas.v3.model.Category.class,
				org.opcfoundation.ua.i4aas.v3.types.AASCategoryDataType.class);
		enum2enumMap.put(io.adminshell.aas.v3.model.DataTypeIEC61360.class,
				org.opcfoundation.ua.i4aas.v3.types.AASDataTypeIEC61360DataType.class);
		enum2enumMap.put(EntityType.class,
				org.opcfoundation.ua.i4aas.v3.types.AASEntityTypeDataType.class);
		enum2enumMap.put(io.adminshell.aas.v3.model.IdentifiableElements.class,
				org.opcfoundation.ua.i4aas.v3.types.AASKeyElementsDataType.class);
		enum2enumMap.put(io.adminshell.aas.v3.model.IdentifierType.class,
				org.opcfoundation.ua.i4aas.v3.types.AASIdentifierTypeDataType.class);
		enum2enumMap.put(io.adminshell.aas.v3.model.LevelType.class,
				org.opcfoundation.ua.i4aas.v3.types.AASLevelTypeDataType.class);
		enum2enumMap.put(io.adminshell.aas.v3.model.LocalKeyType.class,
				org.opcfoundation.ua.i4aas.v3.types.AASKeyTypeDataType.class);
		enum2enumMap.put(ModelingKind.class,
				org.opcfoundation.ua.i4aas.v3.types.AASModelingKindDataType.class);
		// enum2enumMap.put(io.adminshell.aas.v3.model.PermissionKind.class, null);//no
		// match, since it is from security part
		enum2enumMap.put(io.adminshell.aas.v3.model.ReferableElements.class,
				org.opcfoundation.ua.i4aas.v3.types.AASKeyElementsDataType.class);
	}

	public I4AASEnumMapper(Enum<?> src, MappingContext ctx) {
		super(src, ctx);
	}

	@Override
	protected UAVariable createTargetObject() {
		String name = deriveDefaultName();
		Enum i4aasMatch = findMatch(source);

		org.opcfoundation.ua._2011._03.uanodeset.UAVariable.Builder<Void> idTypeVarBuilder = UAVariable.builder()
				.withDisplayName(createLocalizedText(name)).withDataType(i4aasMatch.getClass().getSimpleName())
				.withNodeId(ctx.newModelNodeIdAsString()).withBrowseName(createI4AASBrowseName(name))
				.withAccessLevel(3L);

		JAXBElement<Integer> targetIdTypeVar2 = new ObjectFactory().createInt32(i4aasMatch.ordinal());
		UAVariable targetIdTypeVar = idTypeVarBuilder.withValue().withAny(targetIdTypeVar2).end().build();

		addTypeReferenceFor(targetIdTypeVar, UaIdentifier.PropertyType);

		return targetIdTypeVar;
	}

	protected String deriveDefaultName() {
		if (source instanceof io.adminshell.aas.v3.model.IdentifierType) {
			return IDENTIFICATION_IDTYPE_BROWSENAME;
		}
		if (source instanceof io.adminshell.aas.v3.model.DataTypeIEC61360) {
			return IDENTIFICATION_DATATYPE_BROWSENAME;
		}
		return source.getClass().getSimpleName();
	}

	public static Enum findMatch(Enum<?> src) {
		if (src == null) {
			return null;
		}
		if (!enum2enumMap.containsKey(src.getClass())) {
			throw new IllegalArgumentException("Class " + src.getClass() + " is not supported by I4AASEnumMapper");
		}
		Class<? extends Enum> aasEnum = enum2enumMap.get(src.getClass());

		String srcName = src.name().toLowerCase();
		Enum[] enumConstants = aasEnum.getEnumConstants();
		for (Enum targetEnumCandidate : enumConstants) {
			int lastUnderscore = targetEnumCandidate.name().lastIndexOf("_");
			String targetEnumCandidateName = targetEnumCandidate.name().substring(0, lastUnderscore).toLowerCase();
			if (targetEnumCandidateName.equals(srcName)) {
				return targetEnumCandidate;
			}
		}

		throw new IllegalArgumentException(
				"Could not match " + src.name() + " with any of " + Arrays.toString(aasEnum.getEnumConstants()));
	}

	@Override
	protected void mapAndAttachChildren() {
		// nothing to do
	}

	public static void main(String[] args) {
		// quick test
		System.out.println(
				Arrays.toString(org.opcfoundation.ua.i4aas.v3.types.AASKeyElementsDataType.class.getEnumConstants()));
	}

}
