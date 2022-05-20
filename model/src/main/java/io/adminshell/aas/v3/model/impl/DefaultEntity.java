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

package io.adminshell.aas.v3.model.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;



import io.adminshell.aas.v3.model.*;
import io.adminshell.aas.v3.model.annotations.IRI;
import io.adminshell.aas.v3.model.builder.*;

/**
 * Default implementation of package io.adminshell.aas.v3.model.Entity
 * 
 * An entity is a submodel element that is used to model entities. Constraint AASd-056: The
 * semanticId of a Entity submodel element shall only reference a ConceptDescription with the
 * category ENTITY. The ConceptDescription describes the elements assigned to the entity via
 * Entity/statement.
 */

@IRI("aas:Entity")
public class DefaultEntity implements Entity {

    @IRI("https://admin-shell.io/aas/3/0/RC01/Entity/entityType")
    protected EntityType entityType;

    @IRI("https://admin-shell.io/aas/3/0/RC01/Entity/externalAssetId")
    protected IdentifierKeyValuePair externalAssetId;

    @IRI("https://admin-shell.io/aas/3/0/RC01/Entity/globalAssetId")
    protected Reference globalAssetId;

    @IRI("https://admin-shell.io/aas/3/0/RC01/Entity/statement")
    protected List<SubmodelElement> statements = new ArrayList<>();

    @IRI("https://admin-shell.io/aas/3/0/RC01/HasDataSpecification/dataSpecification")
    protected List<Reference> dataSpecifications = new ArrayList<>();

    @IRI("https://admin-shell.io/aas/3/0/RC01/HasKind/kind")
    protected ModelingKind kind;

    @IRI("https://admin-shell.io/aas/3/0/RC01/HasSemantics/semanticId")
    protected Reference semanticId;

    @IRI("https://admin-shell.io/aas/3/0/RC01/Qualifiable/qualifier")
    protected List<Constraint> qualifiers = new ArrayList<>();

    @IRI("https://admin-shell.io/aas/3/0/RC01/Referable/description")
    protected List<LangString> descriptions = new ArrayList<>();

    @IRI("https://admin-shell.io/aas/3/0/RC01/Referable/displayName")
    protected LangString displayName;

    @IRI("https://admin-shell.io/aas/3/0/RC01/Referable/idShort")
    protected String idShort;

    @IRI("https://admin-shell.io/aas/3/0/RC01/Referable/referableCategory")
    protected List<String> referableCategories = new ArrayList<>();

    public DefaultEntity() {}

    @Override
    public int hashCode() {
        return Objects.hash(this.globalAssetId,
            this.externalAssetId,
            this.entityType,
            this.statements,
            this.referableCategories,
            this.descriptions,
            this.displayName,
            this.idShort,
            this.qualifiers,
            this.dataSpecifications,
            this.kind,
            this.semanticId);
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
            return Objects.equals(this.globalAssetId, other.globalAssetId) &&
                Objects.equals(this.externalAssetId, other.externalAssetId) &&
                Objects.equals(this.entityType, other.entityType) &&
                Objects.equals(this.statements, other.statements) &&
                Objects.equals(this.referableCategories, other.referableCategories) &&
                Objects.equals(this.descriptions, other.descriptions) &&
                Objects.equals(this.displayName, other.displayName) &&
                Objects.equals(this.idShort, other.idShort) &&
                Objects.equals(this.qualifiers, other.qualifiers) &&
                Objects.equals(this.dataSpecifications, other.dataSpecifications) &&
                Objects.equals(this.kind, other.kind) &&
                Objects.equals(this.semanticId, other.semanticId);
        }
    }

    @Override
    public Reference getGlobalAssetId() {
        return globalAssetId;
    }

    @Override
    public void setGlobalAssetId(Reference globalAssetId) {
        this.globalAssetId = globalAssetId;
    }

    @Override
    public IdentifierKeyValuePair getExternalAssetId() {
        return externalAssetId;
    }

    @Override
    public void setExternalAssetId(IdentifierKeyValuePair externalAssetId) {
        this.externalAssetId = externalAssetId;
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
    public List<SubmodelElement> getStatements() {
        return statements;
    }

    @Override
    public void setStatements(List<SubmodelElement> statements) {
        this.statements = statements;
    }

    @Override
    public List<String> getReferableCategories() {
        return referableCategories;
    }

    @Override
    public void setReferableCategories(List<String> referableCategories) {
        this.referableCategories = referableCategories;
    }

    @Override
    public List<LangString> getDescriptions() {
        return descriptions;
    }

    @Override
    public void setDescriptions(List<LangString> descriptions) {
        this.descriptions = descriptions;
    }

    @Override
    public LangString getDisplayName() {
        return displayName;
    }

    @Override
    public void setDisplayName(LangString displayName) {
        this.displayName = displayName;
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
    public List<Constraint> getQualifiers() {
        return qualifiers;
    }

    @Override
    public void setQualifiers(List<Constraint> qualifiers) {
        this.qualifiers = qualifiers;
    }

    @Override
    public List<Reference> getDataSpecifications() {
        return dataSpecifications;
    }

    @Override
    public void setDataSpecifications(List<Reference> dataSpecifications) {
        this.dataSpecifications = dataSpecifications;
    }

    @Override
    public ModelingKind getKind() {
        return kind;
    }

    @Override
    public void setKind(ModelingKind kind) {
        this.kind = kind;
    }

    @Override
    public Reference getSemanticId() {
        return semanticId;
    }

    @Override
    public void setSemanticId(Reference semanticId) {
        this.semanticId = semanticId;
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
