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

import io.adminshell.aas.v3.model.Blob;
import io.adminshell.aas.v3.model.impl.DefaultBlob;

public class BlobParser extends ReferableParser<Blob> {

	public BlobParser(UANodeWrapper src, ParserContext ctx) {
		super(src, ctx);
	}

	@Override
	protected Blob createTargetObject() {
		return new DefaultBlob();
	}
	
	@Override
	protected void parseAndAttachChildren() {
		super.parseAndAttachChildren();
		source.getI4AASProperty(MIME_TYPE_BROWSENAME).ifPresent(p->{
			String valueAsString = ParserUtils.extractValueAsString(p.getNodeVariable());
			target.setMimeType(valueAsString);
		});
		
		source.getI4AASProperty("Value").ifPresent(p->{
			byte[] value = ParserUtils.extractValueAsByteString(p.getNodeVariable());
			target.setValue(value);
		});
	}

}
