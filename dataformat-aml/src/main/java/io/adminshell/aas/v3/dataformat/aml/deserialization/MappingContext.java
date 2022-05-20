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
package io.adminshell.aas.v3.dataformat.aml.deserialization;

import io.adminshell.aas.v3.dataformat.aml.AmlDocumentInfo;
import io.adminshell.aas.v3.dataformat.aml.common.AbstractMappingContext;
import io.adminshell.aas.v3.dataformat.aml.common.naming.NamingStrategy;
import io.adminshell.aas.v3.dataformat.mapping.MappingException;
import io.adminshell.aas.v3.dataformat.mapping.MappingProvider;
import io.adminshell.aas.v3.model.Reference;
import java.beans.PropertyDescriptor;
import java.lang.reflect.Type;

/**
 * Mapping Context for mapping AML to AAS
 */
public class MappingContext extends AbstractMappingContext<Mapper> {

    private AmlDocumentInfo documentInfo;
    private AasTypeFactory typeFactory;
    private Object parent;
    private Reference parentRef;
    private Type type;

    public MappingContext(MappingProvider<Mapper> mappingProvider,
            NamingStrategy classNamingStrategy,
            NamingStrategy propertyNamingStrategy,
            AasTypeFactory typeFactory) {
        super(mappingProvider, classNamingStrategy, propertyNamingStrategy, null);
        this.typeFactory = typeFactory;
        this.type = null;
    }

    private MappingContext(MappingProvider<Mapper> mappingProvider,
            NamingStrategy classNamingStrategy,
            NamingStrategy propertyNamingStrategy,
            PropertyDescriptor property,
            AasTypeFactory typeFactory,
            AmlDocumentInfo documentInfo,
            Object parent,
            Reference parentRef,
            Type type) {
        super(mappingProvider, classNamingStrategy, propertyNamingStrategy, property);
        this.typeFactory = typeFactory;
        this.documentInfo = documentInfo;
        this.parent = parent;
        this.parentRef = parentRef;
        this.type = type;
    }

    public MappingContext with(Type type) {
        return new MappingContext(mappingProvider,
                classNamingStrategy,
                propertyNamingStrategy,
                property,
                typeFactory,
                documentInfo,
                parent,
                parentRef,
                type);
    }

    public MappingContext with(PropertyDescriptor property) {
        return new MappingContext(mappingProvider,
                classNamingStrategy,
                propertyNamingStrategy,
                property,
                typeFactory,
                documentInfo,
                parent,
                parentRef,
                type);
    }

    public MappingContext with(Object parent) {
        return new MappingContext(mappingProvider,
                classNamingStrategy,
                propertyNamingStrategy,
                property,
                typeFactory,
                documentInfo,
                parent,
                parentRef,
                type);
    }

    public MappingContext with(Reference parentRef) {
        return new MappingContext(mappingProvider,
                classNamingStrategy,
                propertyNamingStrategy,
                property,
                typeFactory,
                documentInfo,
                parent,
                parentRef,
                type);
    }

    public MappingContext withoutProperty() {
        return new MappingContext(mappingProvider,
                classNamingStrategy,
                propertyNamingStrategy,
                null,
                typeFactory,
                documentInfo,
                parent,
                parentRef,
                type);
    }

    public MappingContext withoutParent() {
        return new MappingContext(mappingProvider,
                classNamingStrategy,
                propertyNamingStrategy,
                property,
                typeFactory,
                documentInfo,
                null,
                parentRef,
                type);
    }

    public MappingContext withoutType() {
        return new MappingContext(mappingProvider,
                classNamingStrategy,
                propertyNamingStrategy,
                property,
                typeFactory,
                documentInfo,
                parent,
                parentRef,
                null);
    }

    public AmlDocumentInfo getDocumentInfo() {
        return documentInfo;
    }

    public void setDocumentInfo(AmlDocumentInfo documentInfo) {
        this.documentInfo = documentInfo;
    }

    public Object map(Type type, AmlParser parser) throws MappingException {
        return mappingProvider.getMapper(type).map(parser, this);
    }

    public <T> T map(Class<T> type, AmlParser parser) throws MappingException {
        return (T) mappingProvider.getMapper(type).map(parser, this);
    }

    public Type getType() {
        return type;
    }

    public AasTypeFactory getTypeFactory() {
        return typeFactory;
    }

    public Object getParent() {
        return parent;
    }

    public Reference getParentRef() {
        return parentRef;
    }

    public void setParentRef(Reference parentRef) {
        this.parentRef = parentRef;
    }
}
