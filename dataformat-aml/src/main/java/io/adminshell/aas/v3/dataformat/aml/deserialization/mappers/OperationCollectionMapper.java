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
package io.adminshell.aas.v3.dataformat.aml.deserialization.mappers;

import io.adminshell.aas.v3.dataformat.aml.deserialization.AmlParser;
import io.adminshell.aas.v3.dataformat.aml.deserialization.DefaultMapper;
import io.adminshell.aas.v3.dataformat.aml.deserialization.MappingContext;
import io.adminshell.aas.v3.dataformat.aml.model.caex.CAEXObject;
import io.adminshell.aas.v3.dataformat.aml.model.caex.InternalElementType;
import io.adminshell.aas.v3.dataformat.mapping.MappingException;
import io.adminshell.aas.v3.model.Operation;
import io.adminshell.aas.v3.model.OperationVariable;
import io.adminshell.aas.v3.model.SubmodelElement;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class OperationCollectionMapper extends DefaultMapper<Collection<OperationVariable>> {


    public static final String CLASS_LIB_OPERATION = "AssetAdministrationShellRoleClassLib/Operation";

    @Override
    protected Collection mapCollectionValueProperty(AmlParser parser, MappingContext context) throws MappingException {

        if (parser == null || context == null || context.getProperty() == null) {
            return null;
        }

        List<InternalElementType> variables = findInternalElements(parser.getCurrent(),
                x -> x.getRoleRequirements().getRefBaseRoleClassPath().equalsIgnoreCase(CLASS_LIB_OPERATION + context.getProperty().getName()));

        if (variables == null || variables.size() == 0) return null;
        if (variables.size() > 1)
            throw new MappingException(String.format("multiple %s elements are found in %s %s", context.getProperty().getName(), parser.getCurrent().getID(), parser.getCurrent().getName()));

        List<InternalElementType> internalElements = findInternalElements(variables.get(0), SubmodelElement.class, true, context);

        CAEXObject current = parser.getCurrent();

        if (!internalElements.isEmpty()) {
            Collection result = new ArrayList<>();
            for (InternalElementType internalElement : internalElements) {
                try {
                    parser.setCurrent(internalElement);
                    OperationVariable operationVariable = context.getTypeFactory().newInstance(OperationVariable.class);

                    SubmodelElement submodelElement = (SubmodelElement) context.withoutProperty().map(typeFromInternalElement(internalElement), parser);
                    operationVariable.setValue(submodelElement);
                    result.add(operationVariable);
                } catch (NoSuchMethodException | InstantiationException | IllegalAccessException | InvocationTargetException e) {
                    throw new MappingException("error mapping Collection<OperationVariable> - could not create new instance for interface OperationVariable");
                }
            }
            parser.setCurrent(current);
            return result;
        }
        return null;

    }


}
