/*
 * Copyright (c) 2021 Fraunhofer-Gesellschaft zur Foerderung der angewandten Forschung e. V.
 * Copyright (c) 2023, SAP SE or an SAP affiliate company
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

import org.eclipse.digitaltwin.aas4j.v3.model.LevelType;
import org.eclipse.digitaltwin.aas4j.v3.model.annotations.IRI;
import org.eclipse.digitaltwin.aas4j.v3.model.builder.LevelTypeBuilder;

import java.util.Objects;


/**
 * Default implementation of package org.eclipse.digitaltwin.aas4j.v3.model.LevelType
 * 
 * Value represented by up to four variants of a numeric value in a specific role: MIN, NOM, TYP and
 * MAX. True means that the value is available, false means the value is not available.
 */

@IRI("aas:LevelType")
public class DefaultLevelType implements LevelType {

    @IRI("https://admin-shell.io/aas/3/0/LevelType/max")
    protected boolean max;

    @IRI("https://admin-shell.io/aas/3/0/LevelType/min")
    protected boolean min;

    @IRI("https://admin-shell.io/aas/3/0/LevelType/nom")
    protected boolean nom;

    @IRI("https://admin-shell.io/aas/3/0/LevelType/typ")
    protected boolean typ;

    public DefaultLevelType() {}

    @Override
    public int hashCode() {
        return Objects.hash(this.min,
            this.nom,
            this.typ,
            this.max);
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
            DefaultLevelType other = (DefaultLevelType) obj;
            return Objects.equals(this.min, other.min) &&
                Objects.equals(this.nom, other.nom) &&
                Objects.equals(this.typ, other.typ) &&
                Objects.equals(this.max, other.max);
        }
    }

    @Override
    public boolean getMin() {
        return min;
    }

    @Override
    public void setMin(boolean min) {
        this.min = min;
    }

    @Override
    public boolean getNom() {
        return nom;
    }

    @Override
    public void setNom(boolean nom) {
        this.nom = nom;
    }

    @Override
    public boolean getTyp() {
        return typ;
    }

    @Override
    public void setTyp(boolean typ) {
        this.typ = typ;
    }

    @Override
    public boolean getMax() {
        return max;
    }

    @Override
    public void setMax(boolean max) {
        this.max = max;
    }

    public String toString() {
        return String.format(
            "DefaultLevelType (" + "min=%s,"
                + "nom=%s,"
                + "typ=%s,"
                + "max=%s,"
                + ")",
            this.min, this.nom, this.typ, this.max);
    }

    /**
     * This builder class can be used to construct a DefaultLevelType bean.
     */
    public static class Builder extends LevelTypeBuilder<DefaultLevelType, Builder> {

        @Override
        protected Builder getSelf() {
            return this;
        }

        @Override
        protected DefaultLevelType newBuildingInstance() {
            return new DefaultLevelType();
        }
    }
}
