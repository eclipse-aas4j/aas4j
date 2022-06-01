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
package org.eclipse.aas4j.v3.rc02.dataformat.mapping;

/**
 * A mapper that when mapping from A to B allows to write mappers based on the
 * classes of A (the source of the mapping)
 *
 * @param <T> type that the mapper accepts, here: any class of A
 * @param <G> the generator type, here: to generate instances of B
 * @param <C> the type of mapping context
 */
public interface SourceBasedMapper<T, G, C extends MappingContext> extends Mapper<T> {

    /**
     * Maps the given value to target format via the generator.
     *
     * @param value the value to map
     * @param generator the generator to write the mapping result to
     * @param context the context of the mapping
     * @throws MappingException
     */
    public void map(T value, G generator, C context) throws MappingException;
}
