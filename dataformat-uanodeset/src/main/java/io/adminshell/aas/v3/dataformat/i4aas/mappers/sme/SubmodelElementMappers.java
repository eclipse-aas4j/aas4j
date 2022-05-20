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

import io.adminshell.aas.v3.dataformat.i4aas.mappers.MappingContext;
import io.adminshell.aas.v3.model.SubmodelElement;
import io.adminshell.aas.v3.model.SubmodelElementCollection;

public class SubmodelElementMappers {

	public static SubmodelElementMapper<? extends SubmodelElement> getMapper(SubmodelElement submodelElement, MappingContext ctx) {
		if (submodelElement instanceof io.adminshell.aas.v3.model.Capability) {
			return new CapabilityMapper((io.adminshell.aas.v3.model.Capability) submodelElement, ctx);
		}
		if (submodelElement instanceof io.adminshell.aas.v3.model.Blob) {
			return new BlobMapper((io.adminshell.aas.v3.model.Blob) submodelElement, ctx);
		}
		if (submodelElement instanceof io.adminshell.aas.v3.model.File) {
			return new FileMapper((io.adminshell.aas.v3.model.File) submodelElement, ctx);
		}
		if (submodelElement instanceof io.adminshell.aas.v3.model.MultiLanguageProperty) {
			return new MultiLanguagePropertyMapper((io.adminshell.aas.v3.model.MultiLanguageProperty) submodelElement, ctx);
		}
		if (submodelElement instanceof io.adminshell.aas.v3.model.Property) {
			return new PropertyMapper((io.adminshell.aas.v3.model.Property) submodelElement, ctx);
		}
		if (submodelElement instanceof io.adminshell.aas.v3.model.Range) {
			return new RangeMapper((io.adminshell.aas.v3.model.Range) submodelElement, ctx);
		}
		if (submodelElement instanceof io.adminshell.aas.v3.model.ReferenceElement) {
			return new ReferenceElementMapper((io.adminshell.aas.v3.model.ReferenceElement) submodelElement, ctx);
		}
		if (submodelElement instanceof io.adminshell.aas.v3.model.Entity) {
			return new EntityMapper((io.adminshell.aas.v3.model.Entity) submodelElement, ctx);
		}
		if (submodelElement instanceof io.adminshell.aas.v3.model.Event) {
			return new EventMapper((io.adminshell.aas.v3.model.Event) submodelElement, ctx);
		}
		if (submodelElement instanceof io.adminshell.aas.v3.model.EventElement) {
			return new EventElementMapper((io.adminshell.aas.v3.model.EventElement) submodelElement, ctx);
		}
		if (submodelElement instanceof io.adminshell.aas.v3.model.EventMessage) {
			return new EventMessageMapper((io.adminshell.aas.v3.model.EventMessage) submodelElement, ctx);
		}
		if (submodelElement instanceof io.adminshell.aas.v3.model.Operation) {
			return new OperationMapper((io.adminshell.aas.v3.model.Operation) submodelElement, ctx);
		}
		if (submodelElement instanceof io.adminshell.aas.v3.model.AnnotatedRelationshipElement) {
			return new AnnotatedRelationshipElementMapper((io.adminshell.aas.v3.model.AnnotatedRelationshipElement) submodelElement, ctx);
		}
		if (submodelElement instanceof io.adminshell.aas.v3.model.RelationshipElement) {
			return new RelationshipElementMapper((io.adminshell.aas.v3.model.RelationshipElement) submodelElement, ctx);
		}
		if (submodelElement instanceof io.adminshell.aas.v3.model.SubmodelElementCollection) {
			return new SubmodelElementCollectionMapper((SubmodelElementCollection) submodelElement, ctx);
		}
		throw new UnsupportedOperationException(
				"mapping not implemented for " + submodelElement.getClass().getName());
	}

}
