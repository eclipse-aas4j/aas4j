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
import org.eclipse.aas4j.v3.rc02.model.*;
import org.eclipse.aas4j.v3.rc02.model.model.*;

public class SubmodelElementMappers {

	public static SubmodelElementMapper<? extends SubmodelElement> getMapper(SubmodelElement submodelElement, MappingContext ctx) {
		if (submodelElement instanceof Capability) {
			return new CapabilityMapper((Capability) submodelElement, ctx);
		}
		if (submodelElement instanceof Blob) {
			return new BlobMapper((Blob) submodelElement, ctx);
		}
		if (submodelElement instanceof File) {
			return new FileMapper((File) submodelElement, ctx);
		}
		if (submodelElement instanceof MultiLanguageProperty) {
			return new MultiLanguagePropertyMapper((MultiLanguageProperty) submodelElement, ctx);
		}
		if (submodelElement instanceof Property) {
			return new PropertyMapper((Property) submodelElement, ctx);
		}
		if (submodelElement instanceof Range) {
			return new RangeMapper((Range) submodelElement, ctx);
		}
		if (submodelElement instanceof ReferenceElement) {
			return new ReferenceElementMapper((ReferenceElement) submodelElement, ctx);
		}
		if (submodelElement instanceof Entity) {
			return new EntityMapper((Entity) submodelElement, ctx);
		}
		if (submodelElement instanceof io.adminshell.aas.v3.model.Event) {
			return new EventMapper((io.adminshell.aas.v3.model.Event) submodelElement, ctx);
		}
		if (submodelElement instanceof EventElement) {
			return new EventElementMapper((EventElement) submodelElement, ctx);
		}
		if (submodelElement instanceof io.adminshell.aas.v3.model.EventMessage) {
			return new EventMessageMapper((io.adminshell.aas.v3.model.EventMessage) submodelElement, ctx);
		}
		if (submodelElement instanceof Operation) {
			return new OperationMapper((Operation) submodelElement, ctx);
		}
		if (submodelElement instanceof AnnotatedRelationshipElement) {
			return new AnnotatedRelationshipElementMapper((AnnotatedRelationshipElement) submodelElement, ctx);
		}
		if (submodelElement instanceof RelationshipElement) {
			return new RelationshipElementMapper((RelationshipElement) submodelElement, ctx);
		}
		if (submodelElement instanceof SubmodelElementCollection) {
			return new SubmodelElementCollectionMapper((SubmodelElementCollection) submodelElement, ctx);
		}
		throw new UnsupportedOperationException(
				"mapping not implemented for " + submodelElement.getClass().getName());
	}

}
