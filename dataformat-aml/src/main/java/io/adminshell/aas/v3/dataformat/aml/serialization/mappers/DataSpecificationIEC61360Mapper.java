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
package io.adminshell.aas.v3.dataformat.aml.serialization.mappers;

import io.adminshell.aas.v3.dataformat.aml.serialization.DefaultMapper;
import io.adminshell.aas.v3.dataformat.aml.serialization.AmlGenerator;
import io.adminshell.aas.v3.dataformat.aml.serialization.MappingContext;
import io.adminshell.aas.v3.dataformat.aml.model.caex.InternalElementType;
import io.adminshell.aas.v3.dataformat.mapping.MappingException;
import io.adminshell.aas.v3.rc02.model.DataSpecificationContent;
// TODO import io.adminshell.aas.v3.model.DataSpecificationIEC61360;
import java.beans.PropertyDescriptor;

// TODO solve the EmbeddedDataSpecifciation issue
/*
public class DataSpecificationIEC61360Mapper extends DefaultMapper<DataSpecificationIEC61360> {

    @Override
    public void map(DataSpecificationIEC61360 content, AmlGenerator generator, MappingContext context) throws MappingException {
        asInternalElement(content, generator, context);
    }

//    @Override
//    protected String getId(DataSpecificationIEC61360 value, AmlGenerator generator, Aas2AmlMappingContext context) {
//        return context.generateId();
//    }
    @Override
    protected InternalElementType.RoleRequirements getRoleRequirementClass(DataSpecificationIEC61360 value, AmlGenerator generator, MappingContext context) {
        return generator.roleRequirement(DataSpecificationContent.class.getSimpleName());
    }

    @Override
    protected boolean skipProperty(PropertyDescriptor property) {
        return property.getName().equals("levelTypes") || property.getName().equals("valueList");
    }
}*/
