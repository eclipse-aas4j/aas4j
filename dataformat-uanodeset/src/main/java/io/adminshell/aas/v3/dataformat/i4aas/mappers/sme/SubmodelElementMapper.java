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

import io.adminshell.aas.v3.dataformat.i4aas.mappers.HasDataSpecificationMapper;
import io.adminshell.aas.v3.dataformat.i4aas.mappers.HasKindMapper;
import io.adminshell.aas.v3.dataformat.i4aas.mappers.HasSemanticsMapper;
import io.adminshell.aas.v3.dataformat.i4aas.mappers.MappingContext;
import io.adminshell.aas.v3.dataformat.i4aas.mappers.QualifiableMapper;
import io.adminshell.aas.v3.dataformat.i4aas.mappers.ReferableMapper;
import org.eclipse.aas4j.v3.rc02.model.SubmodelElement;

public class SubmodelElementMapper<T extends SubmodelElement> extends ReferableMapper<T> implements HasKindMapper, HasSemanticsMapper, HasDataSpecificationMapper, QualifiableMapper {

	public SubmodelElementMapper(T src, MappingContext ctx) {
		super(src, ctx);
	}

	@Override
	protected void mapAndAttachChildren() {
		super.mapAndAttachChildren();
		mapKind(source, target, ctx);
		mapSemantics(source, target, ctx);
		mapDataSpecification(source, target, ctx);
		mapQualifiable(source, target, ctx);
	}



}
