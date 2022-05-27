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

import io.adminshell.aas.v3.dataformat.i4aas.mappers.utils.I4AASIdentifier;
import io.adminshell.aas.v3.rc02.model.ConceptDescription;
import io.adminshell.aas.v3.rc02.model.Reference;
import io.adminshell.aas.v3.rc02.model.impl.DefaultConceptDescription;

public class ConceptDescriptionParser extends IdentifiableParser<ConceptDescription> {

	public ConceptDescriptionParser(UANodeWrapper src, ParserContext ctx) {
		super(src, ctx);
	}

	@Override
	protected ConceptDescription createTargetObject() {
		return new DefaultConceptDescription();
	}
	
	@Override
	protected void parseAndAttachChildren() {
		super.parseAndAttachChildren();
		source.getI4AASComponent("IsCaseOf").ifPresent(p->{
			p.getComponentsOfType(I4AASIdentifier.AASReferenceType).forEach(ref -> {
				ref.getI4AASProperty(REFERENCE_KEYS_BROWSENAME).ifPresent(key -> {
					Reference parse = new ReferenceParser(key, ctx).parse();
					target.getIsCaseOfs().add(parse);
				});
			});
		});
	}

}
