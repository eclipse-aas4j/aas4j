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
package org.eclipse.aas4j.v3.dataformat.aml.deserialize;

import org.eclipse.aas4j.v3.dataformat.aml.fixtures.FullExample;
import org.eclipse.aas4j.v3.dataformat.aml.fixtures.SimpleExample;
import org.eclipse.aas4j.v3.dataformat.DeserializationException;
import org.eclipse.aas4j.v3.dataformat.aml.AmlDeserializer;
import org.eclipse.aas4j.v3.dataformat.core.AASFull;
import org.eclipse.aas4j.v3.dataformat.core.AASSimple;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

import org.eclipse.aas4j.v3.model.AssetAdministrationShell;
import org.eclipse.aas4j.v3.model.Environment;
import org.eclipse.aas4j.v3.model.Submodel;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class AmlDeserializerTest {

    private final AmlDeserializer deserializer = new AmlDeserializer();

    @Test
    public void testSAPFullExample() throws FileNotFoundException, DeserializationException {
        Environment actual = deserializer.read(FullExample.FILE);
        Environment expected = AASFull.createEnvironment();
        //some changes on the Full Example environment are necessary because there are some constructs inside which are
        //not possible with AML due to the mapping specifications

        //remove asset administration shells with no submodels
        adaptAssetAdministrationShells(expected);
        //remove leveltypes and valuelists from embedded dataspecification
        adaptConceptDescriptions(expected);
        //remove non referenced submodels
        adaptSubmodels(expected);
        //swap the idx of two submodels because assertEquals checks also the order of the elements
        swapSubmodelIdx(actual, 0, 2);
        assertEquals(expected, actual);
    }

    @Test
    public void testSAPSimpleExample() throws FileNotFoundException, DeserializationException {
        Environment actual = deserializer.read(SimpleExample.FILE);
        Environment expected = AASSimple.createEnvironment();
        //some changes on the Simple Example environment are necessary because there are some constructs inside which are
        //not possible with AML due to the mapping specifications

        //remove asset administration shells with no submodels
        adaptAssetAdministrationShells(expected);
        //remove leveltypes and valuelists from embedded dataspecification
        adaptConceptDescriptions(expected);
        //remove non referenced submodels
        adaptSubmodels(expected);
        //swap the idx of two submodels because assertEquals checks also the order of the elements
        swapSubmodelIdx(expected, 1, 2);

        adaptAssetInformation(expected);
        assertEquals(expected, actual);
    }

    @Test
    public void testSubmodels() throws FileNotFoundException, DeserializationException {
        Environment actual = deserializer.read(FullExample.FILE);
        Environment expected = AASFull.createEnvironment();
        adaptSubmodels(expected);
        swapSubmodelIdx(actual, 0, 2);
        assertEquals(expected.getSubmodels(), actual.getSubmodels());
    }

    private void swapSubmodelIdx(Environment env, int idxSrc, int idxDest) {
        Collections.swap(env.getSubmodels(), idxSrc, idxDest);
    }

    private void adaptAssetInformation(Environment env) {
        // remove thumbnail as it is not defined in current AML specification
        env.getAssetAdministrationShells().forEach(x -> x.getAssetInformation().setDefaultThumbnail(null));
    }

    private void adaptSubmodels(Environment env) {
        //non referenced submodels are not considered in AML
        List<String> submodelIds = new ArrayList<>();
        env.getAssetAdministrationShells().stream().forEach(
                x -> x.getSubmodels().stream()
                        .forEach(y -> y.getKeys().stream().forEach(z -> submodelIds.add(z.getValue()))));

        List<Submodel> referencedSubmodels = env.getSubmodels().stream().filter(x -> submodelIds.contains(x.getId())).collect(Collectors.toList());
        env.setSubmodels(referencedSubmodels);
    }

    @Test
    public void testAssetAdministrationShells() throws FileNotFoundException, DeserializationException {
        Environment actual = deserializer.read(FullExample.FILE);
        Environment expected = AASFull.createEnvironment();
        adaptAssetAdministrationShells(expected);
        assertEquals(expected.getAssetAdministrationShells(), actual.getAssetAdministrationShells());
    }

    private void adaptAssetAdministrationShells(Environment env) {
        //Need to remove Asset Administration Shell which have no Submodels
        //they are not considered in AML due to the specification
        List<AssetAdministrationShell> nonEmptyShells = new ArrayList<>();
        for (AssetAdministrationShell aas : env.getAssetAdministrationShells()) {
            if (aas.getSubmodels() != null && aas.getSubmodels().size() > 0) {
                nonEmptyShells.add(aas);
            }
        }
        env.setAssetAdministrationShells(nonEmptyShells);
    }

    @Test
    public void testConceptDescriptions() throws FileNotFoundException, DeserializationException {
        Environment actual = deserializer.read(FullExample.FILE);
        Environment expected = AASFull.createEnvironment();
        //Need to remove Level Types and Value Lists from embedded dataspecification
        //they are not considered in AML due to the specification
        adaptConceptDescriptions(expected);
        assertEquals(expected.getConceptDescriptions(), actual.getConceptDescriptions());
    }

    private void adaptConceptDescriptions(Environment env) {
        // TODO
        /*List<ConceptDescription> expectedConceptDescriptions = env.getConceptDescriptions();
        for (ConceptDescription c : expectedConceptDescriptions) {
            for (EmbeddedDataSpecification embeddedDataSpecification : c.getEmbeddedDataSpecifications()) {
                ((DataSpecificationIEC61360) embeddedDataSpecification.getDataSpecificationContent()).setLevelTypes(new ArrayList<>());
                ((DataSpecificationIEC61360) embeddedDataSpecification.getDataSpecificationContent()).setValueList(null);
            }
        }
*/
    }
}
