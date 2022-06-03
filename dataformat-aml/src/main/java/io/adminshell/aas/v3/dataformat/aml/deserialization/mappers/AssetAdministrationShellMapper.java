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

import com.google.common.reflect.TypeToken;
import io.adminshell.aas.v3.dataformat.aml.deserialization.AmlParser;
import io.adminshell.aas.v3.dataformat.aml.deserialization.MappingContext;
import io.adminshell.aas.v3.dataformat.core.util.AasUtils;
import io.adminshell.aas.v3.dataformat.mapping.MappingException;
import io.adminshell.aas.v3.rc02.model.AssetAdministrationShell;
import io.adminshell.aas.v3.rc02.model.Environment;
import io.adminshell.aas.v3.rc02.model.Key;
import io.adminshell.aas.v3.rc02.model.Reference;
import io.adminshell.aas.v3.rc02.model.Submodel;
import java.beans.PropertyDescriptor;
import java.util.List;

public class AssetAdministrationShellMapper extends IdentifiableMapper<AssetAdministrationShell> {

    @Override
    public AssetAdministrationShell map(AmlParser parser, MappingContext context) throws MappingException {
        AssetAdministrationShell result = super.map(parser, context);
        PropertyDescriptor property = AasUtils.getProperty(AssetAdministrationShell.class, "submodels");
        List<Submodel> submodels = (List<Submodel>) context
                .with(property)
                .with(new TypeToken<List<Submodel>>() {
                }.getType())
                .withoutParent()
                .map(new TypeToken<List<Submodel>>() {
                }.getType(), parser);
        if (context.getParent() != null && Environment.class.isAssignableFrom(context.getParent().getClass())) {
            List<Submodel> submodelsInEnvironment = ((Environment) context.getParent()).getSubmodels();
            // ensure there are not duplicate submodels in environment
            // this may happen if multiple AAS reference/contain the same submodel
            submodels.forEach(x -> {
                if (!submodelsInEnvironment.contains(x)) {
                    submodelsInEnvironment.add(x);
                }
            });
        }
        submodels.forEach(x -> result.getSubmodels().add(AasUtils.toReference(x,
                context.getTypeFactory().getImplementationType(Reference.class),
                context.getTypeFactory().getImplementationType(Key.class))));
        return result;
    }

}
