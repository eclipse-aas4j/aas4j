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

import java.util.List;

import org.opcfoundation.ua._2011._03.uanodeset.UAObject;

import io.adminshell.aas.v3.dataformat.i4aas.mappers.utils.I4AASConstants;
import io.adminshell.aas.v3.dataformat.i4aas.mappers.utils.I4AASIdentifier;
import io.adminshell.aas.v3.model.Constraint;
import org.eclipse.aas4j.v3.rc02.model.Qualifiable;
import org.eclipse.aas4j.v3.rc02.model.Qualifier;

public interface QualifiableMapper {

	public default void mapQualifiable(Qualifiable source, UAObject target, MappingContext ctx) {

		UAObject folder = source.getQualifiers().isEmpty() ? null
				: I4AASMapper.createFolder(target, I4AASConstants.QUALIFIABLE_BROWSENAME, ctx,
						I4AASIdentifier.AASQualifierList);

		List<Constraint> qualifiers = source.getQualifiers();
		for (int i = 0; i < qualifiers.size(); i++) {
			Constraint constraint = qualifiers.get(i);
			if (constraint instanceof Qualifier) {
				UAObject uaQualifier = new QualifierMapper((Qualifier) constraint, ctx, "Qualifier_" + i,
						ctx.getModelNsIndex()).map();
				I4AASMapper.attachAsComponent(folder, uaQualifier);
			}
		}
	}
}
