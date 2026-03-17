/*
 * Copyright (c) 2026 Fraunhofer-Gesellschaft zur Foerderung der angewandten Forschung e. V.
 * Copyright (c) 2026 SAP SE or an SAP affiliate company. All rights reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License
 * is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express
 * or implied. See the License for the specific language governing permissions and limitations under
 * the License.
 */

package org.eclipse.digitaltwin.aas4j.v3.model.impl;

import org.eclipse.digitaltwin.aas4j.v3.model.AnnotatedRelationshipElement;
import org.eclipse.digitaltwin.aas4j.v3.model.DataElement;
import org.eclipse.digitaltwin.aas4j.v3.model.EmbeddedDataSpecification;
import org.eclipse.digitaltwin.aas4j.v3.model.Extension;
import org.eclipse.digitaltwin.aas4j.v3.model.LangStringNameType;
import org.eclipse.digitaltwin.aas4j.v3.model.LangStringTextType;
import org.eclipse.digitaltwin.aas4j.v3.model.Qualifier;
import org.eclipse.digitaltwin.aas4j.v3.model.Reference;
import org.eclipse.digitaltwin.aas4j.v3.model.annotations.IRI;
import org.eclipse.digitaltwin.aas4j.v3.model.builder.AnnotatedRelationshipElementBuilder;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;


/**
 * Default implementation of package
 * org.eclipse.digitaltwin.aas4j.v3.model.AnnotatedRelationshipElement
 * <p>
 * An annotated relationship element is a relationship element that can be annotated with additional
 * data elements.
 */

@IRI("aas:AnnotatedRelationshipElement")
public class DefaultAnnotatedRelationshipElement implements AnnotatedRelationshipElement {

    @IRI("https://admin-shell.io/aas/3/2/AnnotatedRelationshipElement/annotations")
    protected List<DataElement> annotations = new ArrayList<>();

    @IRI("https://admin-shell.io/aas/3/2/HasDataSpecification/embeddedDataSpecifications")
    protected List<EmbeddedDataSpecification> embeddedDataSpecifications = new ArrayList<>();

    @IRI("https://admin-shell.io/aas/3/2/HasExtensions/extensions")
    protected List<Extension> extensions = new ArrayList<>();

    @IRI("https://admin-shell.io/aas/3/2/HasSemantics/semanticId")
    protected Reference semanticId;

    @IRI("https://admin-shell.io/aas/3/2/HasSemantics/supplementalSemanticIds")
    protected List<Reference> supplementalSemanticIds = new ArrayList<>();

    @IRI("https://admin-shell.io/aas/3/2/Qualifiable/qualifiers")
    protected List<Qualifier> qualifiers = new ArrayList<>();

    @IRI("https://admin-shell.io/aas/3/2/Referable/category")
    protected String category;

    @IRI("https://admin-shell.io/aas/3/2/Referable/description")
    protected List<LangStringTextType> descriptions = new ArrayList<>();

    @IRI("https://admin-shell.io/aas/3/2/Referable/displayName")
    protected List<LangStringNameType> displayNames = new ArrayList<>();

    @IRI("https://admin-shell.io/aas/3/2/Referable/idShort")
    protected String idShort;

    @IRI("https://admin-shell.io/aas/3/2/RelationshipElement/first")
    protected Reference first;

    @IRI("https://admin-shell.io/aas/3/2/RelationshipElement/second")
    protected Reference second;

    public DefaultAnnotatedRelationshipElement() {
    }

    @Override
    public String toString() {
        return "DefaultAnnotatedRelationshipElement{"
                + "annotations='" + annotations + "',"
                + "first='" + first + "',"
                + "second='" + second + "',"
                + "category='" + category + "',"
                + "idShort='" + idShort + "',"
                + "displayNames='" + displayNames + "',"
                + "descriptions='" + descriptions + "',"
                + "extensions='" + extensions + "',"
                + "embeddedDataSpecifications='" + embeddedDataSpecifications + "',"
                + "semanticId='" + semanticId + "',"
                + "supplementalSemanticIds='" + supplementalSemanticIds + "',"
                + "qualifiers='" + qualifiers + "',"
                + "}";
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.annotations,
                this.first,
                this.second,
                this.category,
                this.idShort,
                this.displayNames,
                this.descriptions,
                this.extensions,
                this.embeddedDataSpecifications,
                this.semanticId,
                this.supplementalSemanticIds,
                this.qualifiers);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        } else if (obj == null) {
            return false;
        } else if (this.getClass() != obj.getClass()) {
            return false;
        } else {
            DefaultAnnotatedRelationshipElement other = (DefaultAnnotatedRelationshipElement) obj;
            return Objects.equals(this.annotations, other.annotations) &&
                    Objects.equals(this.first, other.first) &&
                    Objects.equals(this.second, other.second) &&
                    Objects.equals(this.category, other.category) &&
                    Objects.equals(this.idShort, other.idShort) &&
                    Objects.equals(this.displayNames, other.displayNames) &&
                    Objects.equals(this.descriptions, other.descriptions) &&
                    Objects.equals(this.extensions, other.extensions) &&
                    Objects.equals(this.embeddedDataSpecifications, other.embeddedDataSpecifications) &&
                    Objects.equals(this.semanticId, other.semanticId) &&
                    Objects.equals(this.supplementalSemanticIds, other.supplementalSemanticIds) &&
                    Objects.equals(this.qualifiers, other.qualifiers);
        }
    }

    @Override
    public List<DataElement> getAnnotations() {
        return annotations;
    }

    @Override
    public void setAnnotations(List<DataElement> annotations) {
        this.annotations = annotations;
    }

    @Override
    public Reference getFirst() {
        return first;
    }

    @Override
    public void setFirst(Reference first) {
        this.first = first;
    }

    @Override
    public Reference getSecond() {
        return second;
    }

    @Override
    public void setSecond(Reference second) {
        this.second = second;
    }

    @Override
    public String getCategory() {
        return category;
    }

    @Override
    public void setCategory(String category) {
        this.category = category;
    }

    @Override
    public String getIdShort() {
        return idShort;
    }

    @Override
    public void setIdShort(String idShort) {
        this.idShort = idShort;
    }

    @Override
    public List<LangStringNameType> getDisplayNames() {
        return displayNames;
    }

    @Override
    public void setDisplayNames(List<LangStringNameType> displayNames) {
        this.displayNames = displayNames;
    }

    @Override
    public List<LangStringTextType> getDescriptions() {
        return descriptions;
    }

    @Override
    public void setDescriptions(List<LangStringTextType> descriptions) {
        this.descriptions = descriptions;
    }

    @Override
    public List<Extension> getExtensions() {
        return extensions;
    }

    @Override
    public void setExtensions(List<Extension> extensions) {
        this.extensions = extensions;
    }

    @Override
    public List<EmbeddedDataSpecification> getEmbeddedDataSpecifications() {
        return embeddedDataSpecifications;
    }

    @Override
    public void setEmbeddedDataSpecifications(List<EmbeddedDataSpecification> embeddedDataSpecifications) {
        this.embeddedDataSpecifications = embeddedDataSpecifications;
    }

    @Override
    public Reference getSemanticId() {
        return semanticId;
    }

    @Override
    public void setSemanticId(Reference semanticId) {
        this.semanticId = semanticId;
    }

    @Override
    public List<Reference> getSupplementalSemanticIds() {
        return supplementalSemanticIds;
    }

    @Override
    public void setSupplementalSemanticIds(List<Reference> supplementalSemanticIds) {
        this.supplementalSemanticIds = supplementalSemanticIds;
    }

    @Override
    public List<Qualifier> getQualifiers() {
        return qualifiers;
    }

    @Override
    public void setQualifiers(List<Qualifier> qualifiers) {
        this.qualifiers = qualifiers;
    }

    /**
     * This builder class can be used to construct a DefaultAnnotatedRelationshipElement bean.
     */
    public static class Builder extends AnnotatedRelationshipElementBuilder<DefaultAnnotatedRelationshipElement, Builder> {

        @Override
        protected Builder getSelf() {
            return this;
        }

        @Override
        protected DefaultAnnotatedRelationshipElement newBuildingInstance() {
            return new DefaultAnnotatedRelationshipElement();
        }
    }
}
