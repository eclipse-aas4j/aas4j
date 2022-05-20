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

import io.adminshell.aas.v3.dataformat.i4aas.mappers.utils.I4AASConstants;

public abstract class I4AASParser<TARGET> implements I4AASConstants {

	protected ParserContext ctx;
	protected UANodeWrapper source;
	protected TARGET target;

	public I4AASParser(UANodeWrapper src, ParserContext ctx) {
		this.source = src;
		this.ctx = ctx;
	}

	protected abstract TARGET createTargetObject();

	public final TARGET parse() {
		target = createTargetObject();
		parseAndAttachChildren();
		return target;
	}

	protected abstract void parseAndAttachChildren();


}
