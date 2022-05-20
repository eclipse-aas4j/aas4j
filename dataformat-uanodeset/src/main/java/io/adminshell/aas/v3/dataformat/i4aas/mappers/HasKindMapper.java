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

import org.opcfoundation.ua._2011._03.uanodeset.UAObject;
import org.opcfoundation.ua._2011._03.uanodeset.UAVariable;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import io.adminshell.aas.v3.model.HasKind;
import io.adminshell.aas.v3.model.ModelingKind;

public interface HasKindMapper {

	static final Logger logger = LoggerFactory.getLogger(HasKindMapper.class);

	default void mapKind(HasKind kind, UAObject target, MappingContext ctx) {
		ModelingKind modelingKind = kind.getKind();
		if (modelingKind == null) {
			logger.warn("Missing ModelingKind attribute, fallback to 'Instance'");
			modelingKind = ModelingKind.INSTANCE;
		}
		UAVariable mappedKind = new I4AASEnumMapper(modelingKind, ctx).map();
		I4AASMapper.attachAsProperty(target, mappedKind);
	}

}
