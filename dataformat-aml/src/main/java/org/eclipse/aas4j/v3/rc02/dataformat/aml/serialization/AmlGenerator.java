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
package org.eclipse.aas4j.v3.rc02.dataformat.aml.serialization;

import org.eclipse.aas4j.v3.rc02.dataformat.aml.AmlDocumentInfo;
import org.eclipse.aas4j.v3.rc02.dataformat.aml.serialization.id.IdGenerator;
import org.eclipse.aas4j.v3.rc02.dataformat.aml.serialization.id.UuidGenerator;
import org.eclipse.aas4j.v3.rc02.dataformat.aml.model.caex.AttributeType;
import org.eclipse.aas4j.v3.rc02.dataformat.aml.model.caex.CAEXFile;
import org.eclipse.aas4j.v3.rc02.dataformat.aml.model.caex.CAEXObject;
import org.eclipse.aas4j.v3.rc02.dataformat.aml.model.caex.InternalElementType;
import org.eclipse.aas4j.v3.rc02.dataformat.aml.model.caex.RoleClassType;
import org.eclipse.aas4j.v3.rc02.dataformat.aml.model.caex.SystemUnitClassType;
import org.eclipse.aas4j.v3.rc02.dataformat.core.util.AasUtils;
import org.eclipse.aas4j.v3.rc02.model.Referable;
import org.eclipse.aas4j.v3.rc02.model.Reference;
import org.eclipse.aas4j.v3.rc02.model.impl.DefaultReference;
import java.beans.PropertyDescriptor;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Immutable class supporting creation of AML file by encalsulating different
 * common tasks and functionality, e.g. id generation and caching. To create new
 * instances with modified properties use provided with...(...) functions.
 */
public class AmlGenerator {

    private static final Logger log = LoggerFactory.getLogger(AmlGenerator.class);
    public static final String REFERABLE_REFERENCE_INTERFACE_CLASS = "ReferableReference";
    private static final String DEFAULT_REF_SEMANTIC_PREFIX = "AAS";

    public static Builder builder() {
        return new Builder();
    }
    private final String refSemanticPrefix;
    private final CAEXObject.Builder current;
    private final AmlDocumentInfo documentInfo;
    private final Reference reference;
    private final IdGenerator idGenerator;
    private final Map<Reference, String> idCache;
    private CAEXFile.Builder fileBuilder;

    private AmlGenerator(
            AmlDocumentInfo documentInfo,
            IdGenerator idGenerator,
            Map<Reference, String> idCache,
            String refSemanticPrefix,
            CAEXFile.Builder fileBuilder,
            CAEXObject.Builder current,
            Reference reference) {
        this.documentInfo = documentInfo;
        this.idGenerator = idGenerator;
        this.idCache = idCache;
        this.refSemanticPrefix = refSemanticPrefix;
        this.fileBuilder = fileBuilder;
        this.current = current;
        this.reference = reference;
    }

    /**
     * Creates a new instance with new current CAEXObject.Builder
     *
     * @param current new current CAEXObject.Builder
     * @return new immutable instance with CAEXObject.Builder
     */
    public AmlGenerator with(CAEXObject.Builder current) {
        return new AmlGenerator(documentInfo,
                idGenerator,
                idCache,
                refSemanticPrefix,
                fileBuilder,
                current,
                reference);
    }

    /**
     * Creates a new instance with reference to new parent object in AAS
     *
     * @param parent reference to new parent element
     * @return new immutable instance with new parent
     */
    public AmlGenerator with(Referable parent) {
        return new AmlGenerator(
                documentInfo,
                idGenerator,
                idCache,
                refSemanticPrefix,
                fileBuilder,
                current,
                AasUtils.toReference(reference, parent));
    }

    /**
     * Creates a new instance with given prefix for refSemantic tags
     *
     * @param value new prefix for refSemantic tags
     * @return new immutable instance given refSemantic prefix
     */
    public AmlGenerator withRefSemanticPrefix(String value) {
        return new AmlGenerator(
                documentInfo,
                idGenerator,
                idCache,
                value,
                fileBuilder,
                current,
                reference);
    }

    /**
     * Adds additional information to the AML file
     *
     * @param additionalInformation additional information to add
     */
    public void addAdditionalInformation(List<Object> additionalInformation) {
        fileBuilder.addAdditionalInformation(additionalInformation);
    }

    /**
     * Generates a new ID without caching it.
     *
     * @return a new ID
     */
    public String newId() {
        return idGenerator.next();
    }

    /**
     * Gets the ID for given object. If obj is an instance of Referable it is
     * first converted to reference pointing to that element. In that case, or
     * if the obj is already an instance of Reference, an already existing ID
     * will be returned if available, otherwise a new one is created and cached.
     * If obj is neither an instance of Reference nor Referable, a new ID is
     * generated and not cached.
     *
     * @param obj object to generate an ID for
     * @return an ID that might or might not be cached (depending of type of
     * obj)
     */
    public String getId(Object obj) {
        if (obj == null) {
            return idGenerator.next();
        }
        Reference key;
        if (Reference.class.isAssignableFrom(obj.getClass())) {
            key = (Reference) obj;
        } else if (Referable.class.isAssignableFrom(obj.getClass())) {
            key = AasUtils.toReference(reference, (Referable) obj);
        } else {
            return idGenerator.next();
        }
        Optional<Reference> cacheKey = idCache.keySet().stream()
                .filter(x -> AasUtils.sameAs(x, key))
                .findFirst();
        if (cacheKey.isPresent()) {
            return idCache.get(cacheKey.get());
        }
        String result = idGenerator.next();
        idCache.put(key, result);
        return result;
    }

    /**
     * Adds an object to the current element of the AML document
     *
     * @param caexObject the object to add
     */
    public void add(CAEXObject caexObject) {
        if (caexObject == null) {
            return;
        }
        if (AttributeType.class.isAssignableFrom(caexObject.getClass())) {
            addAttribute((AttributeType) caexObject);
        } else if (InternalElementType.class.isAssignableFrom(caexObject.getClass())) {
            addInternalElement((InternalElementType) caexObject);
        } else {
            log.warn("adding caex object failed because unsupported type '{}'", caexObject.getClass());
        }
    }

    /**
     * Adds an attribute to the current element of the AML document
     *
     * @param attribute the attribute to add
     */
    public void addAttribute(AttributeType attribute) {
        if (attribute == null) {
            return;
        }
        if (AttributeType.Builder.class.isAssignableFrom(current.getClass())) {
            AttributeType.Builder builder = (AttributeType.Builder) current;
            builder.addAttribute(attribute);
        } else if (InternalElementType.Builder.class.isAssignableFrom(current.getClass())) {
            InternalElementType.Builder builder = (InternalElementType.Builder) current;
            builder.addAttribute(attribute);
        } else {
            log.warn("adding attribute failed because no parent builder defined");
        }
    }

    private void addExternalInterface(RoleClassType.ExternalInterface externalInterface, boolean allowDuplicate) {
        if (externalInterface == null) {
            return;
        }
        if (InternalElementType.Builder.class.isAssignableFrom(current.getClass())) {
            InternalElementType.Builder builder = (InternalElementType.Builder) current;
            if (!builder.build().getExternalInterface().stream()
                    .anyMatch(x -> x.getName().equals(externalInterface.getName())
                    && x.getRefBaseClassPath().equals(externalInterface.getRefBaseClassPath()))) {
                builder.addExternalInterface(externalInterface);
            }
        } else {
            log.warn("adding external interface failed because no parent builder defined");
        }
    }

    /**
     * Adds an external interface with name and roleCall ReferableReference to
     * the current element of the AML document
     */
    public void addExternalInterfaceForReference() {
        addExternalInterface(RoleClassType.ExternalInterface.builder()
                .withID(newId())
                .withName(REFERABLE_REFERENCE_INTERFACE_CLASS)
                .withRefBaseClassPath(documentInfo.getAssetAdministrationShellInterfaceClassLib() + "/" + REFERABLE_REFERENCE_INTERFACE_CLASS)
                .build(), false);
    }

    /**
     * Adds an internal link with given namen pointing from source to target to
     * the current element of the AML document
     *
     * @param name name if the link
     * @param source source element of the link
     * @param target reference pointing to the target element
     */
    public void addInternalLink(String name, Referable source, Reference target) {
        if (InternalElementType.Builder.class.isAssignableFrom(current.getClass())) {
            InternalElementType.Builder builder = (InternalElementType.Builder) current;
            builder.addInternalLink((SystemUnitClassType.InternalLink.builder()
                    .withName(name)
                    .withID(newId())
                    .withRefPartnerSideA(getId(source) + ":" + REFERABLE_REFERENCE_INTERFACE_CLASS)
                    .withRefPartnerSideB(getId(target) + ":" + REFERABLE_REFERENCE_INTERFACE_CLASS)
                    .build()));
        } else {
            log.warn("adding internal link failed because no parent builder defined");
        }
    }

    /**
     * Adds an external interface of type ReferableReference with given name
     * with unresolvabled reference as value to the current element of the AML
     * document
     *
     * @param name name of the interface
     * @param reference unresolvable target reference
     */
    public void addExternalInterfaceForUnresolvableReference(String name, Reference reference) {
        addExternalInterface(RoleClassType.ExternalInterface.builder()
                .withID(idGenerator.next())
                .withName(name)
                .withRefBaseClassPath(documentInfo.getAssetAdministrationShellInterfaceClassLib() + "/" + REFERABLE_REFERENCE_INTERFACE_CLASS)
                .addAttribute(AttributeType.builder()
                        .withName("value")
                        .withID(newId())
                        .withAttributeDataType("xs:string")
                        .withValue(AasUtils.asString(reference))
                        .build())
                .build(),
                false);
    }

    /**
     * Clears the ID cache. This should be used with caution as it may cause
     * reference resolution mechanism to fail. Typically it will only be called
     * after processing the InstanceHierarchy elements and before creating
     * custom SystemUnitClasses
     */
    public void clearIdCache() {
        idCache.clear();
    }

    public void addSystemUnitClassLib(CAEXFile.SystemUnitClassLib systemUnitClassLib) {
        if (systemUnitClassLib == null) {
            return;
        }
        if (fileBuilder != null) {
            fileBuilder = fileBuilder.addSystemUnitClassLib(systemUnitClassLib);
        }
    }

    public void addInstanceHierarchy(CAEXFile.InstanceHierarchy instanceHierarchy) {
        if (instanceHierarchy == null) {
            return;
        }
        if (fileBuilder != null) {
            fileBuilder = fileBuilder.addInstanceHierarchy(instanceHierarchy);
        }
    }

    public void addInternalElement(InternalElementType internalElement, Object source) {
        addInternalElement(InternalElementType
                .copyOf(internalElement)
                .withID(getId(source))
                .build());
    }

    public void addInternalElement(InternalElementType element) {
        if (element == null) {
            return;
        }
        InternalElementType value = element;
        if (value.getID() == null || value.getID().isBlank()) {
            value = InternalElementType
                    .copyOf(element)
                    .withID(idGenerator.next())
                    .build();
        }
        if (InternalElementType.Builder.class.isAssignableFrom(current.getClass())) {
            InternalElementType.Builder builder = (InternalElementType.Builder) current;
            builder.addInternalElement(value);
        } else if (CAEXFile.InstanceHierarchy.Builder.class.isAssignableFrom(current.getClass())) {
            CAEXFile.InstanceHierarchy.Builder builder = (CAEXFile.InstanceHierarchy.Builder) current;
            builder.addInternalElement(value);
        } else {
            log.warn("adding internalElement failed because no parent builder defined");
        }
    }

    public void appendReferenceTargetInterfaceIfRequired(Object obj, MappingContext context) {
        RoleClassType.ExternalInterface referenceTargetInterface = getReferenceTargetInterface(obj, context);
        if (referenceTargetInterface != null) {
            addExternalInterface(referenceTargetInterface, false);
        }
    }

    public RoleClassType.ExternalInterface getReferenceTargetInterface(Object obj, MappingContext context) {
        RoleClassType.ExternalInterface result = null;
        if (obj != null && Referable.class.isAssignableFrom(obj.getClass())) {
            Referable referable = (Referable) obj;
            Reference targetRef = AasUtils.toReference(reference, referable);
            if (context.isTargetOfInternalLink(targetRef)) {
                result = RoleClassType.ExternalInterface.builder()
                        .withID(newId())
                        .withName("ReferableReference")
                        .withRefBaseClassPath(documentInfo.getAssetAdministrationShellInterfaceClassLib() + "/ReferableReference")
                        .build();
            }
        }
        return result;
    }

    public InternalElementType.RoleRequirements roleRequirement(String value) {
        return InternalElementType.RoleRequirements.builder()
                .withRefBaseRoleClassPath(documentInfo.getAssetAdministrationShellRoleClassLib() + "/" + value)
                .build();
    }

    public AttributeType.RefSemantic refSemantic(Class<?> type, String propertyName) {
        return AttributeType.RefSemantic.builder()
                .withCorrespondingAttributePath(refSemanticPrefix + (refSemanticPrefix.isBlank() ? "" : ":") + type.getSimpleName() + "/" + propertyName)
                .build();
    }

    /**
     * Creates a refSemantic object for a given property and property name.
     *
     * @param property the property
     * @param propertyName the property name to use in the refSemantic.
     * @return the generated refSemantic object
     */
    public AttributeType.RefSemantic refSemantic(PropertyDescriptor property, String propertyName) {
        return refSemantic(property.getReadMethod().getDeclaringClass(), propertyName);
    }

    /**
     * Gets to AML document info
     *
     * @return the AML document info
     */
    public AmlDocumentInfo getDocumentInfo() {
        return documentInfo;
    }

    public static class Builder {

        private String refSemanticPrefix = DEFAULT_REF_SEMANTIC_PREFIX;
        private CAEXObject.Builder current;
        private CAEXFile.Builder fileBuilder = CAEXFile.builder();
        private AmlDocumentInfo documentInfo = new AmlDocumentInfo();
        private IdGenerator idGenerator = new UuidGenerator();

        public AmlGenerator build() {
            return new AmlGenerator(documentInfo,
                    idGenerator,
                    new HashMap<>(),
                    refSemanticPrefix,
                    fileBuilder,
                    current,
                    new DefaultReference.Builder().build());
        }

        public Builder refSemanticPrefix(String value) {
            this.refSemanticPrefix = value;
            return this;
        }

        public Builder current(CAEXObject.Builder value) {
            this.current = value;
            return this;
        }

        public Builder idGenerator(IdGenerator value) {
            this.idGenerator = value;
            return this;
        }

        public Builder file(CAEXFile.Builder value) {
            this.fileBuilder = value;
            return this;
        }

        public Builder documentInfo(AmlDocumentInfo value) {
            this.documentInfo = value;
            return this;
        }
    }
}
