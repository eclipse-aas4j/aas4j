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
package io.adminshell.aas.v3.dataformat.rdf.preprocessing;


import org.apache.jena.rdf.model.Model;
import org.apache.jena.rdf.model.ModelFactory;
import org.apache.jena.riot.RDFDataMgr;
import org.apache.jena.riot.RDFLanguages;


import java.io.ByteArrayInputStream;
import java.io.IOException;

/**
 * basic implementation of {@code JsonPreprocessor} that encapsulates validation.
 * By default, validation is disabled for performance reasons (@context has to be downloaded each time).
 */
public abstract class BasePreprocessor implements JsonPreprocessor {

    private boolean validate = false;


    @Override
    public final String preprocess(String input) throws IOException {
        String result = preprocess_impl(input);
        if(validate) {
            Model m = ModelFactory.createDefaultModel();
            RDFDataMgr.read(m, new ByteArrayInputStream(result.getBytes()), RDFLanguages.JSONLD);
        }
        return result;
    }

    abstract String preprocess_impl(String input) throws IOException;

    @Override
    public void enableRDFValidation(boolean validate) {
        this.validate = validate;
    }
}
