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

import io.adminshell.aas.v3.dataformat.i4aas.mappers.utils.I4AASIdentifier;
import io.adminshell.aas.v3.rc02.model.ConceptDescription;
import io.adminshell.aas.v3.model.Identifier;
import io.adminshell.aas.v3.model.IdentifierType;
import io.adminshell.aas.v3.rc02.model.Reference;

public class ConceptDescriptionMapper extends IdentifiableMapper<ConceptDescription>
		implements HasDataSpecificationMapper {

	public ConceptDescriptionMapper(ConceptDescription src, MappingContext ctx) {
		super(src, ctx);
	}

	@Override
	protected UAObject createTargetObject() {
		target = super.createTargetObject();

		Identifier identification = source.getIdentification();
		if (identification != null) {
			IdentifierType idType = identification.getIdType();
			if (IdentifierType.IRI == idType) {
				addTypeReference(I4AASIdentifier.AASIriConceptDescriptionType);
			} else if (IdentifierType.IRDI == idType) {
				addTypeReference(I4AASIdentifier.AASIrdiConceptDescriptionType);
			} else if (IdentifierType.CUSTOM == idType) {
				addTypeReference(I4AASIdentifier.AASCustomConceptDescriptionType);
			}
//			if (identification.getIdentifier() != null) {
//				// TODO: I4AAS says idshort, OPC UA says value. Currently there is no mapping target for IdShort of ConceptDescription
//				target.setBrowseName(createModelBrowseName(identification.getIdentifier()));
//			}
		}

		return target;
	}

	@Override
	protected void mapAndAttachChildren() {
		super.mapAndAttachChildren();

		mapDataSpecification(source, target, ctx);

		UAObject createFolder = source.getIsCaseOfs().isEmpty() ? null : createReferenceList("IsCaseOf");
		for (Reference reference : source.getIsCaseOfs()) {
			UAObject uaRef = new ReferenceMapper(reference, ctx, reference.getKeys().get(0).getValue()).map();
			attachAsComponent(createFolder, uaRef);
		}
	}

}
