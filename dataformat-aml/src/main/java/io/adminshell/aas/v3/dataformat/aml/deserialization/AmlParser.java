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

import io.adminshell.aas.v3.dataformat.aml.model.caex.CAEXFile;
import io.adminshell.aas.v3.dataformat.aml.model.caex.CAEXObject;
import io.adminshell.aas.v3.dataformat.core.util.AasUtils;
import io.adminshell.aas.v3.dataformat.mapping.MappingException;
import io.adminshell.aas.v3.model.AssetAdministrationShellEnvironment;
import io.adminshell.aas.v3.model.Reference;
import java.beans.PropertyDescriptor;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * Wraps an AML file and provides a pointer to the current position within that
 * file
 *
 */
public class AmlParser {

    private final CAEXFile content;
    private CAEXObject current;
    private final Map<String, Reference> idToReference = new HashMap<>();
    private final Map<ObjectLocationByProperty, List<String>> idsToResolve = new HashMap<>();

    public static final String DEFAULT_REFSEMANTIC_PREFIX = "AAS";
    private String refSemanticPrefix = DEFAULT_REFSEMANTIC_PREFIX;

    public AmlParser(CAEXFile content) {
        this.content = content;
    }

    /**
     * Gets the AML file the parser represents
     *
     * @return the AML file the parser represents
     */
    public CAEXFile getContent() {
        return content;
    }

    /**
     * Gets the CAEXObject that currently is being processed, i.e. a point to
     * the current position within the AML file
     *
     * @return the current object
     */
    public CAEXObject getCurrent() {
        return current;
    }

    /**
     * Sets the CAEXObject that currently is being processed.
     *
     * @param current the object currently being processed
     */
    public void setCurrent(CAEXObject current) {
        this.current = current;
    }

    /**
     * Saves mapping between AML-based ID and a AAS Reference that is needed
     * later on to resolve internalLinks within the AML document. This should
     * always be called when creating/reading a Referable from AML.
     *
     * @param amlId AML-based ID of the element/Referable
     * @param reference AAS reference to the Referable
     */
    public void collectIdMapping(String amlId, Reference reference) {
        idToReference.put(amlId, reference);
    }

    /**
     * Marks a property to contain an AAS Reference which at time of mapping may
     * not yet be available.
     *
     * @param parent parent AAS object that contains the property
     * @param property property that should contain the resolved reference(s)
     * later. Its type must be either Reference or collection of Reference
     * @param id AML-based ID of the targeted Referabe that should later be
     * resolved to a Reference
     */
    public void resolveIdToReferenceLater(Object parent, PropertyDescriptor property, String id) {
        ObjectLocationByProperty location = new ObjectLocationByProperty(parent, property);
        if (!idsToResolve.containsKey(location)) {
            idsToResolve.put(location, new ArrayList<>());
        }
        idsToResolve.get(location).add(id);
    }

    /**
     * Resolves properties containing References expressed through AML-based IDs
     * which have been previously makred by calling
     * resolveIdToReferenceLater(..)
     *
     * @param environment the environment to apply this resolution to
     * @throws MappingException when resolving fails, e.g. because cardinalities
     * do not match or AML IDs cannot be resolved
     */
    public void resolveIdsToReferences(AssetAdministrationShellEnvironment environment) throws MappingException {
        for (Map.Entry<ObjectLocationByProperty, List<String>> entry : idsToResolve.entrySet()) {
            Object value = null;
            Class<?> acceptedType = null;
            List<String> idsToResolve = entry.getValue().stream().filter(x -> x != null).collect(Collectors.toList());
            if (!idsToResolve.isEmpty()) {
                if (Collection.class.isAssignableFrom(entry.getKey().property.getReadMethod().getReturnType())) {
                    acceptedType = AasUtils.getCollectionContentType(entry.getKey().property.getReadMethod().getGenericReturnType());
                    Collection<Reference> collection = new ArrayList<>();
                    for (String id : idsToResolve) {
                        if (!idToReference.containsKey(id)) {
                            throw new MappingException(String.format("error adding resolved references for property %s - "
                                    + "found unresolved AML id %s",
                                    entry.getKey().property.getName(),
                                    id));
                        }
                        collection.add(idToReference.get(id));
                    }
                    value = collection;
                } else {
                    acceptedType = entry.getKey().property.getReadMethod().getReturnType();
                    if (idsToResolve.size() > 1) {
                        throw new MappingException(String.format("error adding resolved references for property %s - found %d ids but expected zero or one",
                                entry.getKey().property.getName(),
                                idsToResolve.size()));
                    }
                    if (!idToReference.containsKey(idsToResolve.get(0))) {
                        throw new MappingException(String.format("error adding resolved references for property %s - "
                                + "found unresolved AML id %s",
                                entry.getKey().property.getName(),
                                idsToResolve.get(0)));
                    }
                    value = idToReference.get(idsToResolve.get(0));
                }
            }
            if (value != null) {
                if (!Reference.class.isAssignableFrom(acceptedType)) {
                    throw new MappingException(String.format("error adding resolved references for property %s - expected type Reference or Collection<Reference> but found %s",
                            entry.getKey().property.getName(),
                            acceptedType));
                }
            }
            try {
                entry.getKey().property.getWriteMethod().invoke(entry.getKey().parent, value);
            } catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException ex) {
                throw new MappingException("error resolving references", ex);
            }
        }
    }

    private class ObjectLocationByProperty {

        Object parent;
        PropertyDescriptor property;

        private ObjectLocationByProperty(Object parent, PropertyDescriptor property) {
            this.parent = parent;
            this.property = property;
        }
    }

    public Map<String, Reference> getIdToReference() {
        return idToReference;
    }

    /**
     * Gets the prefix for the RefSemantic
     *
     * @return
     */
    public String getRefSemanticPrefix() {
        return refSemanticPrefix;
    }

    /**
     * Sets the prefix for the RefSemantic
     *
     * @param refSemanticPrefix
     */
    public void setRefSemanticPrefix(String refSemanticPrefix) {
        this.refSemanticPrefix = refSemanticPrefix;
    }

    /**
     * Sets the prefix for the RefSemantic to the default value
     *
     */
    public void setRefSemanticPrefixToDefault() {
        this.refSemanticPrefix = DEFAULT_REFSEMANTIC_PREFIX;
    }

}
