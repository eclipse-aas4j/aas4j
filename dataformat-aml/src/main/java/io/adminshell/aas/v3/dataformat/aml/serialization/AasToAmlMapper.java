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
package io.adminshell.aas.v3.dataformat.aml.serialization;

import io.adminshell.aas.v3.dataformat.aml.AmlSerializationConfig;
import io.adminshell.aas.v3.dataformat.aml.common.naming.PropertyNamingStrategy;
import io.adminshell.aas.v3.dataformat.aml.common.naming.AbstractClassNamingStrategy;
import io.adminshell.aas.v3.dataformat.aml.common.naming.NumberingClassNamingStrategy;
import io.adminshell.aas.v3.dataformat.aml.header.AutomationMLVersion;
import io.adminshell.aas.v3.dataformat.aml.serialization.mappers.AssetAdministrationShellEnvironmentMapper;
import io.adminshell.aas.v3.dataformat.aml.serialization.mappers.AssetAdministrationShellMapper;
import io.adminshell.aas.v3.dataformat.aml.serialization.mappers.ConstraintCollectionMapper;
import io.adminshell.aas.v3.dataformat.aml.serialization.mappers.DataSpecificationContentMapper;
// TODO import io.adminshell.aas.v3.dataformat.aml.serialization.mappers.DataSpecificationIEC61360Mapper;
// TODO import io.adminshell.aas.v3.dataformat.aml.serialization.mappers.EmbeddedDataSpecificationCollectionMapper;
import io.adminshell.aas.v3.dataformat.aml.serialization.mappers.FileMapper;
import io.adminshell.aas.v3.dataformat.aml.serialization.mappers.LangStringCollectionMapper;
import io.adminshell.aas.v3.dataformat.aml.serialization.mappers.OperationVariableCollectionMapper;
import io.adminshell.aas.v3.dataformat.aml.serialization.mappers.OperationVariableMapper;
import io.adminshell.aas.v3.dataformat.aml.serialization.mappers.QualifierMapper;
import io.adminshell.aas.v3.dataformat.aml.serialization.mappers.ReferenceCollectionMapper;
import io.adminshell.aas.v3.dataformat.aml.serialization.mappers.ReferenceElementMapper;
import io.adminshell.aas.v3.dataformat.aml.serialization.mappers.RelationshipElementMapper;
import io.adminshell.aas.v3.dataformat.aml.serialization.mappers.SubmodelMapper;
import io.adminshell.aas.v3.dataformat.aml.model.caex.CAEXFile;
import io.adminshell.aas.v3.dataformat.aml.serialization.mappers.ConceptDescriptionMapper;
import io.adminshell.aas.v3.dataformat.aml.serialization.mappers.IdentifierKeyValuePairCollectionMapper;
import io.adminshell.aas.v3.dataformat.aml.serialization.mappers.PropertyMapper;
import io.adminshell.aas.v3.dataformat.aml.serialization.mappers.RangeMapper;
import io.adminshell.aas.v3.dataformat.aml.serialization.mappers.ReferenceMapper;
import io.adminshell.aas.v3.dataformat.mapping.MappingException;
import io.adminshell.aas.v3.dataformat.mapping.MappingProvider;
import io.adminshell.aas.v3.rc02.model.Environment;
import io.adminshell.aas.v3.rc02.model.LangString;
import io.adminshell.aas.v3.rc02.model.Qualifier;
import io.adminshell.aas.v3.rc02.model.Referable;
import org.slf4j.LoggerFactory;
import io.adminshell.aas.v3.dataformat.mapping.SourceBasedMapper;
import io.adminshell.aas.v3.rc02.model.MultiLanguageProperty;

/**
 * Maps an Environment to an AML file
 */
public class AasToAmlMapper {

    private static final org.slf4j.Logger log = LoggerFactory.getLogger(AasToAmlMapper.class);

    /**
     * Maps an Environment to an AML file (represented
     * by a CAEXFile)
     *
     * @param env the Environment to map
     * @param config the serialization conig
     * @return an AML representation of the Environment
     * @throws MappingException if the mapping fails
     */
    public CAEXFile map(Environment env, AmlSerializationConfig config) throws MappingException {
        AbstractClassNamingStrategy classNamingStrategy = new NumberingClassNamingStrategy();
        classNamingStrategy.registerCustomNaming(LangString.class, x -> "aml-lang=" + x.getLanguage());
        PropertyNamingStrategy propertyNamingStrategy = new PropertyNamingStrategy();
        propertyNamingStrategy.registerCustomNaming(Referable.class, "descriptions", "description");
        propertyNamingStrategy.registerCustomNaming(MultiLanguageProperty.class, "values", "value");
        propertyNamingStrategy.registerCustomNaming(Qualifier.class, x -> "qualifier:" + x.getType() + "=" + x.getValue(), x -> "qualifier");
        MappingProvider<SourceBasedMapper> mappingProvider = new MappingProvider<>(
                SourceBasedMapper.class,
                new DefaultMapper(),
                new DefaultCollectionMapper());

        mappingProvider.register(new AssetAdministrationShellEnvironmentMapper());
        mappingProvider.register(new LangStringCollectionMapper());
        mappingProvider.register(new ReferenceMapper());
        mappingProvider.register(new AssetAdministrationShellMapper());
        mappingProvider.register(new OperationVariableMapper());
        mappingProvider.register(new OperationVariableCollectionMapper());
        mappingProvider.register(new ReferenceCollectionMapper());
        mappingProvider.register(new ConstraintCollectionMapper());
        mappingProvider.register(new QualifierMapper());
        mappingProvider.register(new FileMapper());
        mappingProvider.register(new SubmodelMapper());
        // TODO mappingProvider.register(new EmbeddedDataSpecificationCollectionMapper());
        mappingProvider.register(new DataSpecificationContentMapper());
        mappingProvider.register(new ReferenceElementMapper());
        mappingProvider.register(new RelationshipElementMapper());
        // TODO mappingProvider.register(new DataSpecificationIEC61360Mapper());
        mappingProvider.register(new PropertyMapper());
        mappingProvider.register(new RangeMapper());
        mappingProvider.register(new ConceptDescriptionMapper());
        mappingProvider.register(new IdentifierKeyValuePairCollectionMapper());
        MappingContext context = new MappingContext(
                mappingProvider,
                classNamingStrategy,
                propertyNamingStrategy,
                env);
        CAEXFile.Builder builder = CAEXFile.builder()
                .withSchemaVersion(config.getCaexSchemaVersion())
                .withFileName(config.getFilename())
                .addAdditionalInformation(new AutomationMLVersion(config.getAmlVersion()));
        if (config.getWriterInfo() != null) {
            builder = builder.addAdditionalInformation(config.getWriterInfo().wrap());
        }
        if (!config.getAdditionalInformation().isEmpty()) {
            builder = builder.addAdditionalInformation(config.getAdditionalInformation());
        }
        context.map(env, AmlGenerator.builder()
                .file(builder)
                .idGenerator(config.getIdGenerator())
                .build());
        return builder.build();
    }
}
