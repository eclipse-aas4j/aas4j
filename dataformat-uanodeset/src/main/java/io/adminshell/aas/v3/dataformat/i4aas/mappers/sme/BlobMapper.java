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

import io.adminshell.aas.v3.dataformat.i4aas.mappers.ByteStringPropertyMapper;
import io.adminshell.aas.v3.dataformat.i4aas.mappers.MappingContext;
import io.adminshell.aas.v3.dataformat.i4aas.mappers.utils.I4AASIdentifier;
import io.adminshell.aas.v3.rc02.model.Blob;

public class BlobMapper extends SubmodelElementMapper<Blob> {

	public BlobMapper(Blob src, MappingContext ctx) {
		super(src, ctx);
	}
	
	@Override
	protected UAObject createTargetObject() {
		super.createTargetObject();
		addTypeReference(I4AASIdentifier.AASBlobType);
		return target;
	}
	
	@Override
	protected void mapAndAttachChildren() {
		super.mapAndAttachChildren();
		String mimeType = source.getMimeType();
		if (mimeType != null) {
			UAVariable map = new MimeTypeMapper(mimeType, ctx).map();
			attachAsProperty(target, map);
		}
		byte[] value = source.getValue();
		if (value != null) {
			UAVariable map = new ByteStringPropertyMapper("Value", value, ctx).map();
			attachAsProperty(target, map);
		}
	}

}
