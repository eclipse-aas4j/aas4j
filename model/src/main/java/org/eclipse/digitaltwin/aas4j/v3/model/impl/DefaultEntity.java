/*
 * Copyright (c) 2021 Fraunhofer-Gesellschaft zur Foerderung der angewandten Forschung e. V.
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

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;


import org.eclipse.digitaltwin.aas4j.v3.model.*;
import org.eclipse.digitaltwin.aas4j.v3.model.annotations.IRI;
import org.eclipse.digitaltwin.aas4j.v3.model.builder.*;


/**
 * Default implementation of package org.eclipse.digitaltwin.aas4j.v3.model.Entity
 * 
 * An entity is a submodel element that is used to model entities.
 */

@IRI("aas:Entity")
public class DefaultEntity implements Entity {

    @IRI("https://admin-shell.io/aas/3/1/Entity/entityType")
    protected EntityType entityType;

    @IRI("https://admin-shell.io/aas/3/1/Entity/globalAssetId")
    protected String globalAssetId;

    @IRI("https://admin-shell.io/aas/3/1/Entity/specificAssetIds")
    protected List<SpecificAssetId> specificAssetIds = new ArrayList<>();

    @IRI("https://admin-shell.io/aas/3/1/Entity/statements")
    protected List<SubmodelElement> statements = new ArrayList<>();

    @IRI("https://admin-shell.io/aas/3/1/HasDataSpecification/embeddedDataSpecifications")
    protected List<EmbeddedDataSpecification> embeddedDataSpecifications = new ArrayList<>();

    @IRI("https://admin-shell.io/aas/3/1/HasExtensions/extensions")
    protected List<Extension> extensions = new ArrayList<>();

    @IRI("https://admin-shell.io/aas/3/1/HasSemantics/semanticId")
    protected Reference semanticId;

    @IRI("https://admin-shell.io/aas/3/1/HasSemantics/supplementalSemanticIds")
    protected List<Reference> supplementalSemanticIds = new ArrayList<>();

    @IRI("https://admin-shell.io/aas/3/1/Qualifiable/qualifiers")
    protected List<Qualifier> qualifiers = new ArrayList<>();

    @IRI("https://admin-shell.io/aas/3/1/Referable/category")
    protected String category;

    @IRI("https://admin-shell.io/aas/3/1/Referable/description")
    protected List<LangStringTextType> description = new ArrayList<>();

    @IRI("https://admin-shell.io/aas/3/1/Referable/displayName")
    protected List<LangStringNameType> displayName = new ArrayList<>();

    @IRI("https://admin-shell.io/aas/3/1/Referable/idShort")
    protected String idShort;

    public DefaultEntity() {}

    @Override
    public int hashCode() {
        return Objects.hash(this.statements,
            this.entityType,
            this.globalAssetId,
            this.specificAssetIds,
            this.category,
            this.idShort,
            this.displayName,
            this.description,
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
            DefaultEntity other = (DefaultEntity) obj;
            return Objects.equals(this.statements, other.statements) &&
                Objects.equals(this.entityType, other.entityType) &&
                Objects.equals(this.globalAssetId, other.globalAssetId) &&
                Objects.equals(this.specificAssetIds, other.specificAssetIds) &&
                Objects.equals(this.category, other.category) &&
                Objects.equals(this.idShort, other.idShort) &&
                Objects.equals(this.displayName, other.displayName) &&
                Objects.equals(this.description, other.description) &&
                Objects.equals(this.extensions, other.extensions) &&
                Objects.equals(this.embeddedDataSpecifications, other.embeddedDataSpecifications) &&
                Objects.equals(this.semanticId, other.semanticId) &&
                Objects.equals(this.supplementalSemanticIds, other.supplementalSemanticIds) &&
                Objects.equals(this.qualifiers, other.qualifiers);
        }
    }

    @Override
    public String toString() {
        return "DefaultEntity{" +
                "entityType=" + entityType +
                ", globalAssetId='" + globalAssetId + '\'' +
                ", specificAssetIds=" + specificAssetIds +
                ", statements=" + statements +
                ", embeddedDataSpecifications=" + embeddedDataSpecifications +
                ", extensions=" + extensions +
                ", semanticId=" + semanticId +
                ", supplementalSemanticIds=" + supplementalSemanticIds +
                ", qualifiers=" + qualifiers +
                ", category='" + category + '\'' +
                ", description=" + description +
                ", displayName=" + displayName +
                ", idShort='" + idShort + '\'' +
                '}';
    }

    @Override
    public List<SubmodelElement> getStatements() {
        return statements;
    }

    @Override
    public void setStatements(List<SubmodelElement> statements) {
        this.statements = statements;
    }

    @Override
    public EntityType getEntityType() {
        return entityType;
    }

    @Override
    public void setEntityType(EntityType entityType) {
        this.entityType = entityType;
    }

    @Override
    public String getGlobalAssetId() {
        return globalAssetId;
    }

    @Override
    public void setGlobalAssetId(String globalAssetId) {
        this.globalAssetId = globalAssetId;
    }

    @Override
    public List<SpecificAssetId> getSpecificAssetIds() {
        return specificAssetIds;
    }

    @Override
    public void setSpecificAssetIds(List<SpecificAssetId> specificAssetIds) {
        this.specificAssetIds = specificAssetIds;
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
    public List<LangStringNameType> getDisplayName() {
        return displayName;
    }

    @Override
    public void setDisplayName(List<LangStringNameType> displayName) {
        this.displayName = displayName;
    }

    @Override
    public List<LangStringTextType> getDescription() {
        return description;
    }

    @Override
    public void setDescription(List<LangStringTextType> description) {
        this.description = description;
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
     * This builder class can be used to construct a DefaultEntity bean.
     */
    public static class Builder extends EntityBuilder<DefaultEntity, Builder> {

        @Override
        protected Builder getSelf() {
            return this;
        }

        @Override
        protected DefaultEntity newBuildingInstance() {
            return new DefaultEntity();
        }
    }
}
