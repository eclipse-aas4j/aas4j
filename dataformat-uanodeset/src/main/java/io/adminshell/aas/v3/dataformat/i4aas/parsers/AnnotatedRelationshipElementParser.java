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

import io.adminshell.aas.v3.rc02.model.AnnotatedRelationshipElement;
import io.adminshell.aas.v3.rc02.model.DataElement;
import io.adminshell.aas.v3.rc02.model.Reference;
import io.adminshell.aas.v3.rc02.model.SubmodelElement;
import io.adminshell.aas.v3.rc02.model.impl.DefaultAnnotatedRelationshipElement;

public class AnnotatedRelationshipElementParser extends ReferableParser<AnnotatedRelationshipElement> {

	public AnnotatedRelationshipElementParser(UANodeWrapper src, ParserContext ctx) {
		super(src, ctx);
	}

	@Override
	protected AnnotatedRelationshipElement createTargetObject() {
		return new DefaultAnnotatedRelationshipElement();
	}

	@Override
	protected void parseAndAttachChildren() {
		super.parseAndAttachChildren();
		source.getI4AASComponent("First").ifPresent(p -> {
			p.getI4AASProperty(REFERENCE_KEYS_BROWSENAME).ifPresent(key -> {
				Reference parse = new ReferenceParser(key, ctx).parse();
				target.setFirst(parse);
			});
		});

		source.getI4AASComponent("Second").ifPresent(p -> {
			p.getI4AASProperty(REFERENCE_KEYS_BROWSENAME).ifPresent(key -> {
				Reference parse = new ReferenceParser(key, ctx).parse();
				target.setSecond(parse);
			});
		});

		source.getI4AASComponent("Annotation").ifPresent(p -> {
			p.getComponents().forEach(sme -> {
				SubmodelElement parse = ParserUtils.parseSME(sme, ctx);
				if (parse != null) {				
					target.getAnnotations().add((DataElement) parse);
				}
			});
		});

	}

}
