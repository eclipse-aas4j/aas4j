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

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

import io.adminshell.aas.v3.dataformat.i4aas.mappers.utils.I4AASIdentifier;
import io.adminshell.aas.v3.model.DataSpecificationContent;
import io.adminshell.aas.v3.model.DataSpecificationIEC61360;
import io.adminshell.aas.v3.model.EmbeddedDataSpecification;
import io.adminshell.aas.v3.model.Reference;
import io.adminshell.aas.v3.model.impl.DefaultEmbeddedDataSpecification;

public class DataSpecificationsParser extends I4AASParser<List<EmbeddedDataSpecification>> {

	int size = 0;

	public DataSpecificationsParser(UANodeWrapper src, ParserContext ctx) {
		super(src, ctx);
	}

	@Override
	protected List<EmbeddedDataSpecification> createTargetObject() {
		return new ArrayList<>();
	}


	@Override
	protected void parseAndAttachChildren() {
		Map<Integer, Reference> idx2Ref = new TreeMap<>();
		Map<Integer, DataSpecificationContent> idx2Content = new TreeMap<>();
		
		//TODO split("_") used for naming convention to fix I4AAS uniqueness issues
		List<UANodeWrapper> references = source.getComponentsOfType(I4AASIdentifier.AASReferenceType);
		for (UANodeWrapper reference : references) {
			reference.getI4AASProperty(REFERENCE_KEYS_BROWSENAME).ifPresent(key -> {				
				int idx = Integer.parseInt(reference.getBrowseNameStringPart().split("_")[1]);
				size = Math.max(size, idx);
				Reference parse = new ReferenceParser(key, ctx).parse();
				idx2Ref.put(idx, parse);
			});
		}
		
		List<UANodeWrapper> iecSpecifications = source.getComponentsOfType(I4AASIdentifier.AASDataSpecificationIEC61360Type);
		for (UANodeWrapper content : iecSpecifications) {
			int idx = Integer.parseInt(content.getBrowseNameStringPart().split("_")[1]);
			size = Math.max(size, idx);
			DataSpecificationIEC61360 parse = new DataSpecificationIEC61360Parser(content, ctx).parse();
			idx2Content.put(idx, parse);
		}

		for (int idx = 0; idx <= size; idx++) {
			DefaultEmbeddedDataSpecification targetElement = new DefaultEmbeddedDataSpecification();
			targetElement.setDataSpecification(idx2Ref.get(idx));
			targetElement.setDataSpecificationContent(idx2Content.get(idx));
			target.add(idx, targetElement);
		}
		
	}

}
