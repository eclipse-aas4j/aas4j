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
package org.eclipse.aas4j.v3.rc02.model.validator;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import java.util.stream.Collectors;

import org.apache.jena.graph.compose.Union;
import org.apache.jena.rdf.model.Model;
import org.apache.jena.rdf.model.ModelFactory;
import org.apache.jena.riot.RDFLanguages;
import org.apache.jena.riot.RiotException;
import org.apache.jena.shacl.Shapes;
import org.apache.jena.shacl.ValidationReport;
import org.apache.jena.shacl.validation.ReportEntry;
import org.apache.jena.util.FileUtils;
import org.slf4j.LoggerFactory;

import org.eclipse.aas4j.v3.rc02.dataformat.rdf.Serializer;


public class ShaclValidator implements Validator{

    private final static org.slf4j.Logger logger = LoggerFactory.getLogger(ShaclValidator.class);
    private final Shapes shapes;
    private final Model ontologyModel;

    private static ShaclValidator validator;

    private static final Serializer serializer = new Serializer();


    /**
     * Function to get the validator object. Initializes if it does not exist yet. Note that initialization might take a long time and should be done prior to incoming messages
     * @return ShaclValidator object to validate RDF
     */
    public static ShaclValidator getInstance() {
        if(validator == null)
        {
            validator = new ShaclValidator();
        }
        return validator;
    }

    /**
     * Function to validate Objects against SHACL shapes.
     * @param obj Object to be validated alongside the information model against the shape files
     */
    @Override
    public void validate(Object obj) throws ValidationException {
        //Perform the validation
        //The data graph is the information model plus the message, hence let's create a Union graph
        try {
            ValidationReport report = validateGetReport(obj);

            if (!report.conforms()) {
                throw new ValidationException(report.getEntries().stream().map(ReportEntry::toString).collect(Collectors.joining("\n")));
            }
        }
        catch (IOException e)
        {
            throw new ValidationException("Validation process could not be completed.", e);
        }
    }

    /**
     * Function to validate Objects against SHACL shapes.
     * @param obj Object to be validated alongside the information model against the shape files
     */
    public ValidationReport validateGetReport(Object obj) throws IOException {
        String rdfSerialization;

        //Turn object into JSON-LD
        rdfSerialization = serializer.serialize(obj, RDFLanguages.JSONLD, new HashMap<>());

        ShaclValidator val = getInstance();
        //Ontology is already loaded. Now we need to parse the message.
        Model messageModel = ModelFactory.createDefaultModel();

        //Read JSON-LD String into a model
        try {
            messageModel.read(new ByteArrayInputStream(rdfSerialization.getBytes(StandardCharsets.UTF_8)), null, "JSONLD");
        }
        catch (RiotException e)
        {
            throw new IOException("The message is no valid JSON-LD and could therefore not be checked for information model compliance.", e);
        }

        //Perform the validation
        //The data graph is the information model plus the message, hence let's create a Union graph
        return org.apache.jena.shacl.ShaclValidator.get().validate(val.shapes, new Union(messageModel.getGraph(), val.ontologyModel.getGraph()));
    }


    /**
     * Function to explicitly initialize the ShaclValidator object. This can be used to avoid long initialization times when a message comes in
     */
    @Override
    public void initialize() {
        if(validator == null)
        {
            validator = new ShaclValidator();
        }
    }


    private ShaclValidator() {
        logger.info("Initializing SHACL shapes.");

        //Initialize an empty model into which we will be loading the shapes
        Model shapesModel = ModelFactory.createDefaultModel();

        //All loaded, let's parse!
        //shapes = Shapes.parse(shapesModel);
        InputStream shapesInputStream = getClass().getClassLoader().getResourceAsStream("shapes.ttl");
        InputStream ontologyInputStream = getClass().getClassLoader().getResourceAsStream("ontology.ttl");
        InputStream constraintShapesInputStream = getClass().getClassLoader().getResourceAsStream("constraint_shapes.ttl");
        shapesModel.read(shapesInputStream, null, FileUtils.langTurtle);
        shapesModel.read(constraintShapesInputStream, null, FileUtils.langTurtle);
        shapes = Shapes.parse(shapesModel);
        ontologyModel = ModelFactory.createDefaultModel();

        logger.info("Loading ontology");


        //Load the input stream into the ontology model
        ontologyModel.read(ontologyInputStream, null, FileUtils.langTurtle);
        logger.info("Initialization of SHACL shapes complete.");
    }



}

