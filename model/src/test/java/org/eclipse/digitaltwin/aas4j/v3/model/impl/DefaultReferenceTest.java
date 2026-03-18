/*
 * Copyright (c) 2021 Fraunhofer-Gesellschaft zur Foerderung der angewandten Forschung e. V.
 * Copyright (c) 2023, SAP SE or an SAP affiliate company
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
package org.eclipse.digitaltwin.aas4j.v3.model.impl;

import static org.junit.Assert.assertSame;

import org.junit.Test;

public class DefaultReferenceTest {

  @Test(expected = IllegalArgumentException.class)
  public void setReferredSemanticId_withSelfReference_throws() {
    DefaultReference reference = new DefaultReference();

    reference.setReferredSemanticId(reference);
  }

  @Test(expected = IllegalArgumentException.class)
  public void setReferredSemanticId_withIndirectCycle_throws() {
    DefaultReference first = new DefaultReference();
    DefaultReference second = new DefaultReference();
    second.setReferredSemanticId(first);

    first.setReferredSemanticId(second);
  }

  @Test
  public void setReferredSemanticId_withAcyclicChain_succeeds() {
    DefaultReference reference = new DefaultReference();
    DefaultReference semanticReference = new DefaultReference();
    DefaultReference semanticParent = new DefaultReference();

    semanticReference.setReferredSemanticId(semanticParent);
    reference.setReferredSemanticId(semanticReference);

    assertSame(semanticReference, reference.getReferredSemanticId());
    assertSame(semanticParent, semanticReference.getReferredSemanticId());
  }
}
