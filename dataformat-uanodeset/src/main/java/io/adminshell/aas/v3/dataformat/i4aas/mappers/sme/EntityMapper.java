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
package io.adminshell.aas.v3.dataformat.i4aas.mappers.sme;

import java.util.List;

import org.opcfoundation.ua._2011._03.uanodeset.UAObject;
import org.opcfoundation.ua._2011._03.uanodeset.UAVariable;

import io.adminshell.aas.v3.dataformat.i4aas.mappers.I4AASEnumMapper;
import io.adminshell.aas.v3.dataformat.i4aas.mappers.IdentifierKeyValuePairMapper;
import io.adminshell.aas.v3.dataformat.i4aas.mappers.MappingContext;
import io.adminshell.aas.v3.dataformat.i4aas.mappers.ReferenceMapper;
import io.adminshell.aas.v3.dataformat.i4aas.mappers.utils.I4AASIdentifier;
import io.adminshell.aas.v3.model.Entity;
import io.adminshell.aas.v3.model.EntityType;
import io.adminshell.aas.v3.model.IdentifierKeyValuePair;
import io.adminshell.aas.v3.model.Reference;
import io.adminshell.aas.v3.model.SubmodelElement;

public class EntityMapper extends SubmodelElementMapper<Entity> {

	public EntityMapper(Entity src, MappingContext ctx) {
		super(src, ctx);
	}

	@Override
	protected UAObject createTargetObject() {
		super.createTargetObject();
		addTypeReference(I4AASIdentifier.AASEntityType);
		return target;
	}

	@Override
	protected void mapAndAttachChildren() {
		super.mapAndAttachChildren();
		EntityType entityType = source.getEntityType();
		if (entityType != null) {
			UAVariable map = new I4AASEnumMapper(entityType, ctx).map();
			attachAsProperty(target, map);
		}

		Reference globalAssetId = source.getGlobalAssetId();
		if (globalAssetId != null) {
			UAObject uaIdentification = new ReferenceMapper(globalAssetId, ctx, "GlobalAssetId").map();
			attachAsComponent(target, uaIdentification);
		}

		IdentifierKeyValuePair specificAssetId = source.getSpecificAssetId();
		if (specificAssetId != null) {
			UAObject map = new IdentifierKeyValuePairMapper(specificAssetId, ctx).map();
			attachAsComponent(target, map);
		}

		UAObject createFolder = source.getStatements().isEmpty() ? null : createSubmodelElementList("Statement");
		List<SubmodelElement> statements = source.getStatements();
		for (SubmodelElement submodelElement : statements) {
			UAObject map = SubmodelElementMappers.getMapper(submodelElement, ctx).map();
			attachAsComponent(createFolder, map);
		}

	}
}
