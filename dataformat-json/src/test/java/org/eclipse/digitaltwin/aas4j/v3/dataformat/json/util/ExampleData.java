/*
 * Copyright 2022 jab.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.eclipse.digitaltwin.aas4j.v3.dataformat.json.util;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;

public class ExampleData<T> {

    private static final ObjectMapper mapper = new ObjectMapper();

    private final T model;
    private final String file;

    public ExampleData(T model, String file) {
        this.model = model;
        this.file = file;
    }

    public static <T> ExampleData<T> of(T model, String file) {
        return new ExampleData<>(model, file);
    }

    public T getModel() {
        return model;
    }

    public String getFile() {
        return file;
    }

    public String fileContent() throws IOException {
        return new String(getClass().getClassLoader().getResourceAsStream(file).readAllBytes(), StandardCharsets.UTF_8);
    }

    public InputStream fileContentStream() {
        return getClass().getClassLoader().getResourceAsStream(file);
    }

    public JsonNode getJsonNode() {
        try {
            return mapper.readTree(fileContent());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
