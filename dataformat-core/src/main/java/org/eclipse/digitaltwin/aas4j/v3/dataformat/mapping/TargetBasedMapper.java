/*
 * Copyright (c) 2021 Fraunhofer-Gesellschaft zur Foerderung der angewandten Forschung e. V.
 * Copyright (C) 2023 SAP SE or an SAP affiliate company. All rights reserved.
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
package org.eclipse.digitaltwin.aas4j.v3.dataformat.mapping;

/**
 * A mapper that when mapping from A to B allows to write mappers based on the
 * classes of B (the target of the mapping)
 *
 * @param <T> type that the mapper accepts, here: any class of B
 * @param <P> the parser type, here: to parse data of A
 * @param <C> the type of mapping context
 */
public interface TargetBasedMapper<T, P, C extends MappingContext<? extends TargetBasedMapper>> extends Mapper<T> {

    /**
     * Reads from the parser and returns the mapping result.
     *
     * @param parser the parser to read the actual input
     * @param context the context
     * @return a new instance of T created by mapping data given by the parser
     * @throws MappingException
     */
    public T map(P parser, C context) throws MappingException;
}
