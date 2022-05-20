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
import com.google.inject.util.Types;
import io.adminshell.aas.v3.dataformat.aml.serialization.AmlGenerator;
import io.adminshell.aas.v3.dataformat.aml.serialization.MappingContext;
import io.adminshell.aas.v3.dataformat.aml.model.caex.CAEXFile;
import io.adminshell.aas.v3.dataformat.aml.model.caex.CAEXFile.SystemUnitClassLib;
import io.adminshell.aas.v3.dataformat.aml.model.caex.InternalElementType;
import io.adminshell.aas.v3.dataformat.aml.model.caex.SystemUnitClassType.SupportedRoleClass;
import io.adminshell.aas.v3.dataformat.aml.model.caex.SystemUnitFamilyType;
import io.adminshell.aas.v3.dataformat.core.util.AasUtils;
import io.adminshell.aas.v3.dataformat.mapping.MappingException;
import io.adminshell.aas.v3.model.AssetAdministrationShell;
import io.adminshell.aas.v3.model.AssetAdministrationShellEnvironment;
import io.adminshell.aas.v3.model.ConceptDescription;
import io.adminshell.aas.v3.model.ModelingKind;
import io.adminshell.aas.v3.model.Submodel;
import java.util.Collection;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class AssetAdministrationShellEnvironmentMapper extends DefaultMapper<AssetAdministrationShellEnvironment> {

    @Override
    public void map(AssetAdministrationShellEnvironment value, AmlGenerator generator, MappingContext context) throws MappingException {
        List<AssetAdministrationShell> assetAdministrationShells = value.getAssetAdministrationShells().stream()
                .filter(x -> x.getSubmodels().stream()
                .anyMatch(sm -> {
                    Submodel submodel = AasUtils.resolve(sm, value, Submodel.class);
                    return submodel != null && submodel.getKind() != ModelingKind.TEMPLATE;
                }))
                .collect(Collectors.toList());
        toHierarchy(generator.getDocumentInfo().getAssetAdministrationShellInstanceHierarchy(),
                AssetAdministrationShell.class,
                assetAdministrationShells,
                generator,
                context);
        toHierarchy(
                generator.getDocumentInfo().getConceptDescriptionInstanceHierarchy(),
                ConceptDescription.class,
                value.getConceptDescriptions(),
                generator,
                context);
        mapTemplates(value, generator, context);
    }

    protected <T> void toHierarchy(
            String hierarchyName,
            Class<T> type,
            Collection<T> value,
            AmlGenerator generator,
            MappingContext context) throws MappingException {
        CAEXFile.InstanceHierarchy.Builder builder = CAEXFile.InstanceHierarchy.builder()
                .withName(hierarchyName);
        context.map(Types.newParameterizedType(Collection.class, type), value, generator.with(builder));
        generator.addInstanceHierarchy(builder.build());
    }

    protected void mapTemplates(AssetAdministrationShellEnvironment env, AmlGenerator generator, MappingContext context) throws MappingException {
        boolean empty = true;
        SystemUnitClassLib.Builder builder = SystemUnitClassLib.builder()
                .withName(generator.getDocumentInfo().getAssetAdministrationShellSystemUnitClassLib());

        // generate SystemUnitClass for each AAS with at least 1 Submodel with kind == TEMPLATE
        // generate SystemUnitClass for each Submodel with king == TEMPLATE
        for (AssetAdministrationShell aas : env.getAssetAdministrationShells()) {
            List<Submodel> submodelTemplates = AasUtils.getSubmodelTemplates(aas, env);
            if (!submodelTemplates.isEmpty()) {
                empty = false;
                generator.clearIdCache();
                InternalElementType.Builder temp = InternalElementType.builder();
                context.withoutProperty().map(aas, generator.with(temp));
                builder.addSystemUnitClass(internalElementToSystemUnitClass(temp.build().getInternalElement().get(0)));
            }
            generator.clearIdCache();
            for (Submodel submodel : submodelTemplates) {
                InternalElementType.Builder temp = InternalElementType.builder();
                context.withoutProperty().map(submodel, generator.with(temp));
                builder.addSystemUnitClass(internalElementToSystemUnitClass(temp.build().getInternalElement().get(0)));
            }
        }
        if (!empty) {
            generator.addSystemUnitClassLib(builder.build());
        }
    }

    protected SystemUnitFamilyType internalElementToSystemUnitClass(InternalElementType internalElement) {
        return SystemUnitFamilyType.builder()
                .withName(internalElement.getName())
                .withID(internalElement.getID())
                .addAttribute(internalElement.getAttribute())
                .addInternalElement(internalElement.getInternalElement())
                .withSupportedRoleClass(SupportedRoleClass.builder()
                        .withRefRoleClassPath(internalElement.getRoleRequirements().getRefBaseRoleClassPath())
                        .build())
                .build();
    }
}
