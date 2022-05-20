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

import org.opcfoundation.ua._2011._03.uanodeset.UAObject;
import org.opcfoundation.ua._2011._03.uanodeset.UAVariable;

import io.adminshell.aas.v3.dataformat.i4aas.mappers.MappingContext;
import io.adminshell.aas.v3.dataformat.i4aas.mappers.utils.I4AASIdentifier;
import io.adminshell.aas.v3.model.File;

public class FileMapper extends SubmodelElementMapper<File> {

	private String customName;
	private int namespaceIndex;

	public FileMapper(File src, MappingContext ctx) {
		this(src, ctx, src.getIdShort(), ctx.getModelNsIndex());
	}

	public FileMapper(File src, MappingContext ctx, String name, int namespaceIndex) {
		super(src, ctx);
		this.customName = name;
		this.namespaceIndex = namespaceIndex;
	}

	@Override
	protected UAObject createTargetObject() {
		target = UAObject.builder().withNodeId(ctx.newModelNodeIdAsString()).withBrowseName(createBrowseName(customName, namespaceIndex))
				.withDisplayName(createLocalizedText(customName)).build();
		addTypeReference(I4AASIdentifier.AASFileType);
		return target;
	}

	@Override
	protected void mapAndAttachChildren() {
		super.mapAndAttachChildren();
		if (source.getMimeType() != null) {
			UAVariable map = new MimeTypeMapper(source.getMimeType(), ctx).map();
			attachAsProperty(target, map);
		}
		if (source.getValue() != null) {
			UAVariable map = new PathTypeMapper(source.getValue(), ctx).map();
			attachAsProperty(target, map);
		}
	}

}
