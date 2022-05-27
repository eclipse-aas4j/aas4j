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

import io.adminshell.aas.v3.rc02.model.Reference;
import org.opcfoundation.ua._2011._03.uanodeset.UAObject;

import io.adminshell.aas.v3.dataformat.i4aas.mappers.utils.UaIdentifier;
import io.adminshell.aas.v3.rc02.model.HasSemantics;
import io.adminshell.aas.v3.model.Identifier;
import io.adminshell.aas.v3.model.IdentifierType;
import io.adminshell.aas.v3.rc02.model.Key;
import io.adminshell.aas.v3.rc02.model.impl.DefaultConceptDescription;

public interface HasSemanticsMapper {

	default void mapSemantics(HasSemantics source, UAObject target, MappingContext ctx) {
		Reference semanticId = source.getSemanticId();
		if (semanticId != null && !semanticId.getKeys().isEmpty()) {
						
			// get Dictionary Entry based on first key
			UAObject nodeForIdentification = ctx.getTargetNodeForReference(semanticId);			
			
			Key key = semanticId.getKeys().get(0);
			if (nodeForIdentification == null && key.getValue() != null && !key.getValue().isBlank()) {
				if (ctx.isAddMissingSemanticIdsToDictionary()) {					
					nodeForIdentification = fixConceptDescription(ctx, key);
				} else {
					return;
				}
			}

			if (nodeForIdentification != null) {
				I4AASMapper.attachAsDictionaryEntry(target, nodeForIdentification);
			}
		}
	}

	default UAObject fixConceptDescription(MappingContext ctx, Key key) {
		//if not found, a concept description must be created and added
		DefaultConceptDescription virtualCD = new DefaultConceptDescription();
		virtualCD.setIdShort(key.getValue());
		virtualCD.setIdentification(new Identifier() {
			@Override
			public void setIdentifier(String arg0) {
				throw new UnsupportedOperationException();
			}
			@Override
			public void setIdType(IdentifierType arg0) {
				throw new UnsupportedOperationException();
			}
			@Override
			public String getIdentifier() {
				return key.getValue();
			}
			@Override
			public IdentifierType getIdType() {
				return key.getIdType() == null ? null : IdentifierType.valueOf(key.getIdType().name());
			}
		});
		
		UAObject uaVirtualCD = new ConceptDescriptionMapper(virtualCD, ctx).map();
		org.opcfoundation.ua._2011._03.uanodeset.Reference orgaRef = new org.opcfoundation.ua._2011._03.uanodeset.Reference();
		orgaRef.setReferenceType(UaIdentifier.Organizes.getName());
		orgaRef.setIsForward(false);
		orgaRef.setValue("i=17594");
		uaVirtualCD.getReferences().getReference().add(orgaRef);
		return uaVirtualCD;
	}
}
