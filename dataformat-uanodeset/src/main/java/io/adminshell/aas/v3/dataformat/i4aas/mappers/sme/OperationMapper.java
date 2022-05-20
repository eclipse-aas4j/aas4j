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

import org.opcfoundation.ua._2011._03.uanodeset.UAMethod;
import org.opcfoundation.ua._2011._03.uanodeset.UAObject;

import io.adminshell.aas.v3.dataformat.i4aas.mappers.MappingContext;
import io.adminshell.aas.v3.dataformat.i4aas.mappers.utils.I4AASIdentifier;
import io.adminshell.aas.v3.model.Operation;
import io.adminshell.aas.v3.model.OperationVariable;
import io.adminshell.aas.v3.model.SubmodelElement;

public class OperationMapper extends SubmodelElementMapper<Operation> {

	public OperationMapper(Operation src, MappingContext ctx) {
		super(src, ctx);
	}

	@Override
	protected UAObject createTargetObject() {
		super.createTargetObject();
		addTypeReference(I4AASIdentifier.AASOperationType);
		return target;
	}

	@Override
	protected void mapAndAttachChildren() {
		super.mapAndAttachChildren();

		if (!source.getInputVariables().isEmpty()) {
			UAObject folder = createSubmodelElementList("InputVariable");
			for (OperationVariable operationVariable : source.getInputVariables()) {
				SubmodelElement value = operationVariable.getValue();
				UAObject mappedVariable = SubmodelElementMappers.getMapper(value, ctx).map();
				attachAsComponent(folder, mappedVariable);
			}
		}
		
		if (!source.getOutputVariables().isEmpty()) {
			UAObject folder = createSubmodelElementList("OutputVariable");
			for (OperationVariable operationVariable : source.getOutputVariables()) {
				SubmodelElement value = operationVariable.getValue();
				UAObject mappedVariable = SubmodelElementMappers.getMapper(value, ctx).map();
				attachAsComponent(folder, mappedVariable);
			}
		}
		
		if (!source.getInoutputVariables().isEmpty()) {
			UAObject folder = createSubmodelElementList("InOutputVariable");
			for (OperationVariable operationVariable : source.getInoutputVariables()) {
				SubmodelElement value = operationVariable.getValue();
				UAObject mappedVariable = SubmodelElementMappers.getMapper(value, ctx).map();
				attachAsComponent(folder, mappedVariable);
			}
		}

		UAMethod operation = UAMethod.builder().withBrowseName(createI4AASBrowseName("Operation"))
				.addDisplayName(createLocalizedText("Operation"))
				.withMethodDeclarationId(ctx.getI4aasNodeIdAsString(I4AASIdentifier.AASOperationType_Operation))
				.withNodeId(ctx.newModelNodeIdAsString()).build();
		this.addToNodeset(operation);
		attachAsComponent(target, operation);
	}

}
