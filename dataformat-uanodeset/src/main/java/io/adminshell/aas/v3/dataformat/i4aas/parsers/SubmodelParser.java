/*
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

import org.eclipse.aas4j.v3.rc02.model.Submodel;
import org.eclipse.aas4j.v3.rc02.model.SubmodelElement;
import org.eclipse.aas4j.v3.rc02.model.impl.DefaultSubmodel;

public class SubmodelParser extends IdentifiableParser<Submodel> {

	public SubmodelParser(UANodeWrapper src, ParserContext ctx) {
		super(src, ctx);
	}

	@Override
	protected Submodel createTargetObject() {
		DefaultSubmodel defaultSubmodel = new DefaultSubmodel();
		return defaultSubmodel;
	}

	@Override
	protected void parseAndAttachChildren() {
		super.parseAndAttachChildren();
		
		source.getComponents().forEach(sme -> {
			SubmodelElement parse = ParserUtils.parseSME(sme, ctx);
			if (parse != null) {				
				target.getSubmodelElements().add(parse);
			}
		});

	}

}
