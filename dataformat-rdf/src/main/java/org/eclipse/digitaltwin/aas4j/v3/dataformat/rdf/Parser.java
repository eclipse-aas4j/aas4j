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
package org.eclipse.digitaltwin.aas4j.v3.dataformat.rdf;

import org.eclipse.digitaltwin.aas4j.v3.model.LangString;
import org.eclipse.digitaltwin.aas4j.v3.model.annotations.IRI;
import org.eclipse.digitaltwin.aas4j.v3.model.annotations.KnownSubtypes;
import org.eclipse.digitaltwin.aas4j.v3.model.impl.DefaultLangString;
import org.apache.jena.datatypes.DatatypeFormatException;
import org.apache.jena.query.*;
import org.apache.jena.rdf.model.*;
import org.apache.jena.riot.Lang;
import org.apache.jena.riot.RDFDataMgr;
import org.apache.jena.riot.RDFLanguages;
import org.apache.jena.riot.RiotException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.Duration;
import javax.xml.datatype.XMLGregorianCalendar;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.lang.reflect.*;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.ZonedDateTime;
import java.time.format.DateTimeParseException;
import java.util.*;
import java.util.stream.Collectors;


/**
 * Internal class to handle the parsing of JSON-LD into java objects
 * @author maboeckmann
 */
class Parser {

    private final Logger logger = LoggerFactory.getLogger(Parser.class);

    private static final URI blankNodeIdPropertyUri = URI.create("https://admin-shell.io/aas/blankNodeId");

    static Map<String, String> knownNamespaces = new HashMap<>();

    /**
     * Main internal method for creating a java object from a given RDF graph and a URI of the object to handle
     * @param inputModel Model on which queries are to be evaluated from which information can be retrieved
     * @param objectUri URI of the object to be handled
     * @param targetClass Variable containing the class which should be returned
     * @param <T> Class which should be returned
     * @return Object of desired class, filled with the values extracted from inputModel
     * @throws IOException thrown if the parsing fails
     */
    private <T> T handleObject(Model inputModel, String objectUri, Class<T> targetClass) throws IOException {
        try {

            //if(!targetClass.getSimpleName().endsWith("Impl")) //This would not work for "TypedLiteral", "RdfResource" and so on
            //Check whether we are dealing with an instantiable class (i.e. no interface and no abstract class)
            boolean currentObjectIsBlankNode = false;
            if (targetClass.isInterface() || Modifier.isAbstract(targetClass.getModifiers())) {
                //We don't know the desired class yet (current targetClass is not instantiable). This is only known for the root object
                ArrayList<Class<?>> implementingClasses = getImplementingClasses(targetClass);
                String queryString;
                //Get a list of all "rdf:type" statements in our model
                //In case of a blank node, the "object URI" will just be a string and no valid URI. In that  case, we need a different query syntax
                try {
                    new URL(objectUri);
                }
                catch (MalformedURLException e)
                {
                    currentObjectIsBlankNode = true;
                }
                if(currentObjectIsBlankNode)
                {
                    //Object is a blank node, so the subject URI cannot be used
                    queryString = "SELECT ?type { ?s <" + blankNodeIdPropertyUri + "> \"" + objectUri + "\" ; a ?type . }";
                }
                else
                {
                    //Not a blank node, so we can work with the subject URI
                    queryString = "SELECT ?type { BIND(<" + objectUri + "> AS ?s). ?s a ?type . }";
                }
                Query query = QueryFactory.create(queryString);
                QueryExecution queryExecution = QueryExecutionFactory.create(query, inputModel);
                ResultSet resultSet = queryExecution.execSelect();

                if (!resultSet.hasNext()) {
                    queryExecution.close();
                    throw new IOException("Could not extract class of child object. ID: " + objectUri);
                }

                //Class<?> candidateClass = null;

                String fullName = "No triple present indicating type.";
                while (resultSet.hasNext()) {
                    QuerySolution solution = resultSet.nextSolution();
                    fullName = solution.get("type").toString();

                    //Expected URI is something like https://w3id.org/idsa/core/ClassName (and we want ClassName)
                    String className = fullName.substring(fullName.lastIndexOf('/') + 1);

                    //Some namespaces use "#" instead of "/"
                    if (className.contains("#")) {
                        className = className.substring(className.lastIndexOf("#") + 1);
                    }

                    for (Class<?> currentClass : implementingClasses) {
                        //Is this class instantiable?
                        if (!currentClass.isInterface() && !Modifier.isAbstract(currentClass.getModifiers())) {
                            //candidateClass = currentClass;
                            if (currentClass.getSimpleName().equals(className) || currentClass.getSimpleName().equals(Serializer.implementingClassesNamePrefix + className + Serializer.implementingClassesNameSuffix)) {
                                targetClass = (Class<T>) currentClass;
                                break;
                            }
                        }
                    }
                }
                queryExecution.close();
                //Did we find "the" class, i.e. instantiable and name matches?
                if (targetClass.isInterface() || Modifier.isAbstract(targetClass.getModifiers())) {
                    //No, the current targetClass cannot be instantiated. Do we have a candidate class?
                    //if (candidateClass != null) {
                    throw new IOException("Did not find an instantiable class for " + objectUri + " matching expected class name (" + targetClass.getSimpleName() + "). Object has type: " + fullName);
                    //targetClass = (Class<T>) candidateClass;
                    //}
                }
            }

            //Enums have no constructors
            if(targetClass.isEnum())
            {
                return handleEnum(targetClass, objectUri);
            }

            //Get constructor (which is package private for our classes) and make it accessible
            Constructor<T> constructor = targetClass.getDeclaredConstructor();
            constructor.setAccessible(true);

            //Instantiate new object, which will be returned at the end
            T returnObject = constructor.newInstance();

            //Get methods
            Method[] methods = returnObject.getClass().getDeclaredMethods();

            //Store methods in map. Key is the name of the RDF property without ids prefix
            Map<String, Method> methodMap = new HashMap<>();

            //Get all relevant methods (setters, but not for label, comment or external properties)
            Arrays.stream(methods).filter(method -> {
                String name = method.getName();
                //Filter out irrelevant methods
                return name.startsWith("set") && !name.equals("setProperty") && !name.equals("setComment") && !name.equals("setLabel"); // && !name.equals("setId");
            }).forEach(method -> {
                //Remove "set" part
                String reducedName = method.getName().substring(3);

                //Turn first character to lower case
                char[] c = reducedName.toCharArray();
                c[0] = Character.toLowerCase(c[0]);
                String finalName = new String(c);
                methodMap.put(finalName, method);

            });

            //There is no "setId" method in our CodeGen generated classes, so we get the field
            /* TODO: No "id" field yet
            Field idField = returnObject.getClass().getDeclaredField("id");

            //Store whether or not it was accessible, so that we can undo making it accessible
            boolean wasAccessible = idField.isAccessible();
            idField.setAccessible(true);

            //Set the ID of the object to be identical with the objectUri parameter
            idField.set(returnObject, new URI(objectUri));
            idField.setAccessible(wasAccessible);
             */

            //Is this a trivial class with 0 fields? If so, the generated query would be "SELECT { }", which is illegal
            if(methodMap.isEmpty())
            {
                return returnObject;
            }


            //A list which stores all those parameter names which may occur only once (i.e. those occurring in the GROUP BY clause)
            List<String> groupByKeys = new ArrayList<>();

            StringBuilder queryStringBuilder = new StringBuilder();

            for(Map.Entry<String, String> entry : knownNamespaces.entrySet())
            {
                queryStringBuilder.append("PREFIX ").append(entry.getKey());
                if(!entry.getKey().endsWith(":"))
                {
                    queryStringBuilder.append(":");
                }
                queryStringBuilder.append(" <").append(entry.getValue()).append(">\n");
            }
            queryStringBuilder.append("SELECT");
            methodMap.forEach((key1, value) -> {
                //Is the return type some sort of List?
                if (Collection.class.isAssignableFrom(value.getParameterTypes()[0])) {
                    boolean isTypedLiteral = false;
                    //Yes, it is assignable multiple times. Concatenate multiple values together using some delimiter
                    try {
                        //ArrayLists are generics. We need to extract the name of the generic parameter as string and interpret that
                        String typeName = extractTypeNameFromCollection(value.getGenericParameterTypes()[0]);

                        if (typeName.endsWith("LangString"))
                            isTypedLiteral = true;
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                    if (isTypedLiteral) {
                        queryStringBuilder.append(" (GROUP_CONCAT(CONCAT('\"',?").append(key1).append(",'\"@', lang(?").append(key1).append("));separator=\"||\") AS ?").append(key1).append("sLang) ");
                    }
                    queryStringBuilder.append(" (GROUP_CONCAT(?").append(key1).append(";separator=\"||\") AS ?").append(key1).append("s) ");

                    //Additional case for blank nodes
                    queryStringBuilder.append(" (GROUP_CONCAT(?").append(key1).append("Blank;separator=\"||\") AS ?").append(key1).append("sBlank) ");


                } else {
                    //No, it's not a list. No need to aggregate
                    queryStringBuilder.append(" ?").append(key1);
                    //We will have to GROUP BY this variable though...
                    groupByKeys.add(key1);
                }
            });
            //Start the "WHERE" part - Fuseki does not expect the "WHERE" keyword, but just an "{"
            queryStringBuilder.append(" { ");

            //In case of blank nodes, we can't work with the subject URI
            if(currentObjectIsBlankNode)
            {
                queryStringBuilder.append("?s <").append(blankNodeIdPropertyUri).append("> \"").append(objectUri).append("\" ;");
            }
            else
            {
                queryStringBuilder.append(" <").append(objectUri).append(">");
            }

            //Make sure that the object is of the correct type
            //This is particularly relevant in case of all fields being optional -- then one could simply parse a random object
            queryStringBuilder.append(" a ").append(wrapIfUri(targetClass.getAnnotation(IRI.class).value()[0])).append(". ");

            for (Map.Entry<String, Method> entry : methodMap.entrySet()) {
                //Is this a field which is annotated by NOT NULL?
                //Attempt to find a field matching the setter method name
                //E.g. for "setSomething", we search for a field with name "_something" (IDS way) and "something"
                Field field = getFieldByName(targetClass, entry.getKey());


                //In AAS, every field is optional, as there are no validation annotations in the model
                queryStringBuilder.append(" OPTIONAL {");

                if(currentObjectIsBlankNode)
                {
                    queryStringBuilder.append(" ?s ");
                }
                else {
                    queryStringBuilder.append(" <").append(objectUri).append("> "); //subject, as passed to the function
                }
                //For the field, get the JsonAlias annotation (present for all classes generated by the CodeGen tool)
                //Find the annotation value containing a colon and interpret this as "prefix:predicate"
                boolean foundAnnotation = false;
                if(field.getAnnotation(IRI.class) != null) {
                    Optional<String> currentAnnotation = Arrays.stream(field.getAnnotation(IRI.class).value()).map(this::wrapIfUri).filter(annotation -> annotation.contains(":")).findFirst();
                    currentAnnotation.ifPresent(queryStringBuilder::append);
                    foundAnnotation = true;
                }
                if(!foundAnnotation)
                {
                    logger.warn("Failed to retrieve JsonAlias for field " + field + ". Assuming aas:" + entry.getKey());
                    queryStringBuilder.append("aas:").append(entry.getKey());
                }
                //if(isBlank(?entry.getKey(), use value of artificial, use original value)
                queryStringBuilder.append(" ?").append(entry.getKey()).append(" ."); //object

                //In case of the object being a blank node, we construct a second result variable with the blank node id
                queryStringBuilder.append("OPTIONAL { ?").append(entry.getKey()).append(" <").append(blankNodeIdPropertyUri).append("> ?").append(entry.getKey()).append("Blank . } ");

                queryStringBuilder.append("} ");
            }


            queryStringBuilder.append(" } ");

            //Do we need to group? We do, if there is at least one property which can occur multiple times
            //We added all those properties, which may only occur once, to the groupByKeys list
            if (!groupByKeys.isEmpty()) {
                queryStringBuilder.append("GROUP BY");
                for (String key : groupByKeys) {
                    queryStringBuilder.append(" ?").append(key);
                }
            }

            String queryString = queryStringBuilder.toString();

            StringBuilder queryForOtherProperties = new StringBuilder();
            //Query for all unknown properties and their values
            //Select properties and values only

            if(!targetClass.equals(LangString.class)) { //LangString has no additional properties map. Skip this step

                //CONSTRUCT { ?s ?p ?o } { ?s ?p ?o. FILTER(?p NOT IN (list of ids properties)) }
                for (Map.Entry<String, String> entry : knownNamespaces.entrySet()) {
                    queryForOtherProperties.append("PREFIX ").append(entry.getKey());
                    if (!entry.getKey().endsWith(":")) {
                        queryForOtherProperties.append(":");
                    }
                    queryForOtherProperties.append(" <").append(entry.getValue()).append(">\n");
                }


                //Respect ALL properties and values
                queryForOtherProperties.append(" SELECT ?p ?o {  <").append(objectUri).append("> ?p ?o .\n");

                //Exclude known properties
                queryForOtherProperties.append("FILTER (?p NOT IN (rdf:type");

                //Predicates usually look like: .append("ids:").append(entry.getKey())
                for (Map.Entry<String, Method> entry : methodMap.entrySet()) {
                    queryForOtherProperties.append(", ");

                    Field field = getFieldByName(targetClass, entry.getKey());
                    Optional<String> currentAnnotation = Arrays.stream(field.getAnnotation(IRI.class).value()).filter(annotation -> annotation.contains(":")).filter(s -> s.length() > 1).findFirst();
                    if (currentAnnotation.isPresent()) {
                        queryForOtherProperties.append(wrapIfUri(currentAnnotation.get()));
                    } else {
                        logger.warn("Failed to retrieve JsonAlias for field " + field + ". Assuming aas:" + entry.getKey());
                        queryForOtherProperties.append("aas:").append(entry.getKey());
                    }
                }

                queryForOtherProperties.append(")). } ");


                //Now that we searched for all "known properties", let's search for all unrecognized content and append it to a generic properties map

                Query externalPropertiesQuery = QueryFactory.create(queryForOtherProperties.toString());
                QueryExecution externalPropertiesQueryExecution = QueryExecutionFactory.create(externalPropertiesQuery, inputModel);
                ResultSet externalPropertiesResultSet = externalPropertiesQueryExecution.execSelect();

                // now as all declared instances and classes are treated, which are also represented in the respective java
                // dependency, take care about the ones within foreign namespaces and add those to the 'properties' field
                // note that not all models (e.g. AAS) have such methods. In case they do not exist, skip adding external properties

                try {
                    Method setProperty = returnObject.getClass().getDeclaredMethod("setProperty", String.class, Object.class);
                    Method getProperties = returnObject.getClass().getDeclaredMethod("getProperties");

                    while (externalPropertiesResultSet.hasNext()) {
                        QuerySolution externalPropertySolution = externalPropertiesResultSet.next();

                        HashMap<String, Object> currentProperties = (HashMap<String, Object>) getProperties.invoke(returnObject);

                        //Avoid NullPointerException
                        if (currentProperties == null) {
                            currentProperties = new HashMap<>();
                        }

                        String propertyUri = externalPropertySolution.get("p").toString();

                        //Does this key already exist? If yes, we need to store the value as array to not override them
                        if (currentProperties.containsKey(propertyUri)) {
                            //If it is not an array list yet, turn it into one
                            if (!(currentProperties.get(propertyUri) instanceof ArrayList)) {
                                ArrayList<Object> newList = new ArrayList<>();
                                newList.add(currentProperties.get(propertyUri));
                                currentProperties.put(propertyUri, newList);
                            }
                        }

                        //Literals and complex objects need to be handled differently
                        //Literals can be treated as flat values, whereas complex objects require recursive calls
                        if (externalPropertySolution.get("o").isLiteral()) {
                            Object o = handleForeignLiteral(externalPropertySolution.getLiteral("o"));
                            //If it is already an ArrayList, add new value to it
                            if (currentProperties.containsKey(propertyUri)) {
                                ArrayList<Object> currentPropertyArray = ((ArrayList<Object>) currentProperties.get(propertyUri));
                                currentPropertyArray.add(o);
                                setProperty.invoke(returnObject, propertyUri, currentPropertyArray);
                            }
                            //Otherwise save as new plain value
                            else {
                                setProperty.invoke(returnObject, propertyUri, o);
                            }
                        } else {
                            //It is a complex object. Distinguish whether or not we need to store as array
                            HashMap<String, Object> subMap = handleForeignNode(externalPropertySolution.getResource("o"), new HashMap<>(), inputModel);
                            subMap.put("@id", externalPropertySolution.getResource("o").getURI());
                            if (currentProperties.containsKey(propertyUri)) {
                                ArrayList<Object> currentPropertyArray = ((ArrayList<Object>) currentProperties.get(propertyUri));
                                currentPropertyArray.add(subMap);
                                setProperty.invoke(returnObject, propertyUri, currentPropertyArray);
                            } else {
                                setProperty.invoke(returnObject, propertyUri, subMap);
                            }
                        }
                    }
                    externalPropertiesQueryExecution.close();
                }
                catch (NoSuchMethodException ignored)
                {
                    //Method does not exist, skip
                }
            }



            Query query;
            try {
                query = QueryFactory.create(queryString);
            }
            catch (QueryParseException e)
            {
                logger.error(queryString);
                throw e;
            }

            //Evaluate query
            QueryExecution queryExecution = QueryExecutionFactory.create(query, inputModel);
            ResultSet resultSet = queryExecution.execSelect();


            if (!resultSet.hasNext()) {
                queryExecution.close();
                //no content...
                return returnObject;
            }

            //SPARQL binding present, iterate over result and construct return object
            while (resultSet.hasNext()) {
                QuerySolution querySolution = resultSet.next();

                //Check if there are fields which have more values than allowed
                if (resultSet.hasNext()) {
                    String value1 = "", value2 = "", parameterName = "";
                    QuerySolution querySolution2 = resultSet.next();
                    Iterator<String> varNamesIt = querySolution2.varNames();
                    while(varNamesIt.hasNext())
                    {
                        String varName = varNamesIt.next();
                        if(querySolution.contains(varName))
                        {
                            if(!querySolution.get(varName).equals(querySolution2.get(varName)))
                            {
                                parameterName = varName;
                                value1 = querySolution.get(varName).toString();
                                value2 = querySolution2.get(varName).toString();
                                break;
                            }
                        }
                    }
                    if(!value1.isEmpty())
                    {
                        throw new IOException(objectUri + " has multiple values for " + parameterName + ", which is not allowed. Values are: " + value1 + " and " + value2);
                    }
                    throw new IOException("Multiple bindings for SPARQL query which should only have one binding. Input contains multiple values for a field which may occur only once.");
                }

                //No value occurs more often than allowed
                for (Map.Entry<String, Method> entry : methodMap.entrySet()) {

                    //What is this method setting? Get the expected parameter type and check whether it is some complex sub-object and whether this is a list
                    Class<?> currentType = entry.getValue().getParameterTypes()[0];

                    String sparqlParameterName = entry.getKey();

                    if (Collection.class.isAssignableFrom(currentType)) {
                        sparqlParameterName += "s"; //plural form for the concatenated values
                    }
                    if(!querySolution.contains(sparqlParameterName))
                    {
                        sparqlParameterName += "Blank"; //If not present, try to go with the option for blank nodes instead
                        //TODO: Note: This would not yield full results yet in case some of the values are encapsulated
                        // in blank nodes and some are not, for the same property
                    }
                    if (querySolution.contains(sparqlParameterName)) {
                        String currentSparqlBinding = querySolution.get(sparqlParameterName).toString();

                        boolean objectIsBlankNode = querySolution.get(sparqlParameterName).isResource() && querySolution.get(sparqlParameterName).asNode().isBlank();
                        String blankNodeId = "";
                        //If the object is a blank node, we will struggle to make follow-up queries starting at the blank node as subject
                        //For that case, we add some artificial identifiers here
                        if(objectIsBlankNode) {
                            blankNodeId = querySolution.get(sparqlParameterName).asNode().getBlankNodeId().toString();
                        }
                        if (currentType.isEnum()) {
                            //Two possibilities:
                            //1: The URI of the enum value is given directly e.g. ?s ?p <someUri>
                            //2: The URI of the enum value is encapsulated in a blank node, e.g.
                            //  ?s ?p [ a demo:myEnum, demo:enumValue ]
                            if(objectIsBlankNode)
                            {

                                Query innerEnumQuery = QueryFactory.create("SELECT ?type { ?s <" + blankNodeIdPropertyUri + "> + \"" + blankNodeId + "\" ; a ?type } ");
                                QueryExecution innerEnumQueryExecution = QueryExecutionFactory.create(innerEnumQuery, inputModel);
                                ResultSet innerEnumQueryExecutionResultSet = innerEnumQueryExecution.execSelect();

                                //Only throw this if there is no successful execution
                                IOException anyIOException = null;
                                boolean oneSuccessfulEnumFound = false;
                                while(innerEnumQueryExecutionResultSet.hasNext())
                                {
                                    try {
                                        entry.getValue().invoke(returnObject, handleEnum(currentType, innerEnumQueryExecutionResultSet.next().get("type").toString()));
                                        oneSuccessfulEnumFound = true;
                                        break; //Stop after the first successful execution
                                    }
                                    catch (IOException e) //There might be errors, if multiple types are present, see example above
                                    {
                                        anyIOException = e;
                                    }
                                }
                                //If nothing worked, but something failed (i.e. there exists a problematic element, but no proper element), we throw an exception
                                if(anyIOException != null && !oneSuccessfulEnumFound)
                                    throw new IOException("Could not parse Enum. ", anyIOException);
                                innerEnumQueryExecution.close();
                            }
                            else {
                                entry.getValue().invoke(returnObject, handleEnum(currentType, currentSparqlBinding));
                            }
                            continue;
                        }


                        //There is a binding. If it is a complex sub-object, we need to recursively call this function
                        if (Collection.class.isAssignableFrom(currentType)) {
                            //We are working with ArrayLists.
                            //Here, we need to work with the GenericParameterTypes instead to find out what kind of ArrayList we are dealing with
                            String typeName = extractTypeNameFromCollection(entry.getValue().getGenericParameterTypes()[0]);
                            if (isArrayListTypePrimitive(entry.getValue().getGenericParameterTypes()[0])) {
                                if (typeName.endsWith("LangString")) {
                                    try {
                                        currentSparqlBinding = querySolution.get(sparqlParameterName + "Lang").toString();
                                    } catch (NullPointerException e) {
                                        //logger.warn("Failed to retrieve localized/typed values of " + currentSparqlBinding + ". Make sure that namespaces used in this property are known and valid. Proceeding without localized values and interpreting as string.");
                                        //logger.warn("Query was: " + queryString);
                                        //logger.warn("Attempted to fetch: " + sparqlParameterName + "Lang");
                                    }
                                }
                                ArrayList<Object> list = new ArrayList<>();
                                //Two pipes were used as delimiter above
                                //Introduce set to deduplicate
                                Set<String> allElements = new HashSet<>(Arrays.asList(currentSparqlBinding.split("\\|\\|")));
                                for (String s : allElements) {
                                    Literal literal;
                                    //querySolution.get(sparqlParameterName).
                                    if (s.endsWith("@")) {
                                        s = s.substring(2, s.length() - 3);
                                        literal = ResourceFactory.createStringLiteral(s);
                                    } else if (s.startsWith("\\")) {
                                        //turn something like \"my Desc 1\"@en to "my Desc 1"@en
                                        s = s.substring(1).replace("\\\"@", "\"@");
                                        literal = ResourceFactory.createLangLiteral(s.substring(1, s.lastIndexOf("@") - 1), s.substring(s.lastIndexOf("@") + 1));
                                    } else {
                                        literal = ResourceFactory.createPlainLiteral(s);
                                    }

                                    //Is the type of the ArrayList some built in Java primitive?

                                    if (builtInMap.containsKey(typeName)) {
                                        //Yes, it is. We MUST NOT call Class.forName(name)!
                                        list.add(handlePrimitive(builtInMap.get(typeName), literal, null));
                                    } else {
                                        //Not a Java primitive, we may call Class.forName(name)
                                        list.add(handlePrimitive(Class.forName(typeName), literal, s));
                                    }
                                }
                                entry.getValue().invoke(returnObject, list);
                            } else {
                                //List of complex sub-objects, such as a list of Resources in a ResourceCatalog
                                ArrayList<Object> list = new ArrayList<>();
                                Set<String> allElements = new HashSet<>(Arrays.asList(currentSparqlBinding.split("\\|\\|")));
                                for (String s : allElements) {
                                    if (Class.forName(typeName).isEnum()) {
                                        list.add(handleEnum(Class.forName(typeName), s));
                                    } else {
                                        list.add(handleObject(inputModel, s, Class.forName(typeName)));
                                    }
                                }
                                entry.getValue().invoke(returnObject, list);
                            }
                        }

                        //Not an ArrayList of objects expected, but rather one object
                        else {
                            //Our implementation of checking for primitives (i.e. also includes URLs, Strings, XMLGregorianCalendars, ...)
                            if (isPrimitive(currentType)) {

                                Literal literal = null;
                                try {
                                    literal = querySolution.getLiteral(sparqlParameterName);
                                } catch (Exception ignored) {
                                }

                                entry.getValue().invoke(returnObject, handlePrimitive(currentType, literal, currentSparqlBinding));

                            } else {
                                //Not a primitive object, but a complex sub-object. Recursively call this function to handle it
                                if (objectIsBlankNode) {
                                    entry.getValue().invoke(returnObject, handleObject(inputModel, blankNodeId, entry.getValue().getParameterTypes()[0]));
                                } else {

                                    entry.getValue().invoke(returnObject, handleObject(inputModel, currentSparqlBinding, entry.getValue().getParameterTypes()[0]));
                                }
                            }
                        }
                    }

                }
            }
            queryExecution.close();

            return returnObject;
        } catch (NoSuchMethodException | NullPointerException | IllegalAccessException | InstantiationException | InvocationTargetException | NoSuchFieldException | URISyntaxException | DatatypeConfigurationException | ClassNotFoundException e) {
            throw new IOException("Failed to instantiate desired class (" + targetClass.getName() + ")", e);
        }
    }

    /**
     * This function wraps a URI with "<" ">", if needed, to avoid errors about "unknown namespace http(s):"
     * @param input Input URI, possibly a prefixed value
     * @return If this is a full URI, starting with http or https, the URI will be encapsulated in "<" ">"
     */
    private String wrapIfUri(String input)
    {
        if(input.startsWith("http://") || input.startsWith("https://"))
        {
            return "<" + input + ">";
        }
        else {
            return input;
        }
    }

    private Object handleForeignLiteral(Literal literal) throws URISyntaxException {
        if(literal.getLanguage() != null && !literal.getLanguage().equals(""))
        {
            return new DefaultLangString.Builder().text(literal.getValue().toString()).language(literal.getLanguage()).build();
        }
        //If not, does it have some datatype URI?
        //else if(literal.getDatatypeURI() != null && !literal.getDatatypeURI().equals(""))
        //{
        //    return new TypedLiteral(literal.getString(), new URI(literal.getDatatypeURI()));
        //}
        //If both is not true, add it as normal string
        else
        {
            return literal.getString();
        }
    }

    private HashMap<String, Object> handleForeignNode(RDFNode node, HashMap<String, Object> map, Model model) throws IOException, URISyntaxException {
        //Make sure it is not a literal. If it were, we would not know the property name and could not add this to the map
        //Literals must be handled "one recursion step above"
        if(node.isLiteral())
        {
            throw new IOException("Literal passed to handleForeignNode. Must be non-literal RDF node");
        }

        //Run SPARQL query retrieving all information (only one hop!) about this node
        String queryString = "SELECT ?s ?p ?o { BIND(<" + node.asNode().getURI() + "> AS ?s) . ?s ?p ?o . } ";
        Query query = QueryFactory.create(queryString);
        QueryExecution queryExecution = QueryExecutionFactory.create(query, model);
        ResultSet resultSet = queryExecution.execSelect();



        //Handle outgoing properties of this foreign node
        while(resultSet.hasNext())
        {
            QuerySolution querySolution = resultSet.next();

            String propertyUri = querySolution.get("p").toString();

            if(map.containsKey(propertyUri)) {
                //If it is not an array list yet, turn it into one
                if (!(map.get(propertyUri) instanceof ArrayList)) {
                    ArrayList<Object> newList = new ArrayList<>();
                    newList.add(map.get(propertyUri));
                    map.put(propertyUri, newList);
                }
            }

            //Check the type of object we have. If it is a literal, just add it as "flat value" to the map
            if(querySolution.get("o").isLiteral())
            {
                //Handle some small literal. This function will turn this into a TypedLiteral if appropriate
                Object o = handleForeignLiteral(querySolution.getLiteral("o"));
                if(map.containsKey(propertyUri))
                {
                    map.put(querySolution.get("p").toString(), ((ArrayList)map.get(propertyUri)).add(o));
                }
                else
                {
                    map.put(querySolution.get("p").toString(), o);
                }
            }

            //If it is not a literal, we need to call this function recursively. Create new map for sub object
            else
            {
                //logger.info("Calling handleForeignNode for " + querySolution.getResource("o").toString());
                if(querySolution.getResource("s").toString().equals(querySolution.getResource("o").toString()))
                {
                    logger.warn("Found self-reference on " + querySolution.getResource("s").toString() + " via predicate " + querySolution.getResource("p").toString() + " .");
                    continue;
                }
                HashMap<String, Object> subMap = handleForeignNode(querySolution.getResource("o"), new HashMap<>(), model);
                subMap.put("@id", querySolution.getResource("o").getURI());
                if(map.containsKey(propertyUri))
                {
                    map.put(querySolution.get("p").toString(), ((ArrayList)map.get(propertyUri)).add(subMap));
                }
                else {
                    map.put(querySolution.get("p").toString(), subMap);
                }
            }
        }
        queryExecution.close();
        return map;
    }


    /**
     * Utility function, used to obtain the field corresponding to a setter function
     * @param targetClass Class object in which we search for a field
     * @param fieldName Guessed name of the field to search for
     * @return Field object matching the name (possibly with leading underscore)
     * @throws NoSuchFieldException thrown, if no such field exists
     */
    private Field getFieldByName(Class<?> targetClass, String fieldName) throws NoSuchFieldException {
        try {
            return targetClass.getDeclaredField("_" + fieldName);
        } catch (NoSuchFieldException e) {
            try {
                return targetClass.getDeclaredField(fieldName);
            } catch (NoSuchFieldException e2) {
                try {
                    return targetClass.getDeclaredField("_" + Character.toUpperCase(fieldName.charAt(0)) + fieldName.substring(1));
                }
                catch (NoSuchFieldException e3)
                {
                    throw new NoSuchFieldException("Failed to find field which is set by method " + fieldName);
                }
            }
        }
    }

    /**
     * Internal function to create a single enum object from a given desired class and a URL
     * @param enumClass The enum class
     * @param url The URL of the enum value
     * @param <T> Enum class
     * @return Value of enumClass matching the input URL
     * @throws IOException thrown if no matching enum value could be found
     */
    private <T> T handleEnum(Class<T> enumClass, String url) throws IOException {
        if (!enumClass.isEnum()) {
            throw new RuntimeException("Non-Enum class passed to handleEnum function.");
        }
        T[] constants = enumClass.getEnumConstants();
        if(url.contains("/"))
        {
            url = url.substring(url.lastIndexOf("/") + 1);
        }
        for (T constant : constants) {
            //We artificially added some underscores in the AAS ontology. TODO: This might be a bit dangerous for other ontologies, which really contain underscores in enum names
            if (url.equalsIgnoreCase(constant.toString()) || url.equalsIgnoreCase(constant.toString().replace("_", ""))) {
                return constant;
            }
        }
        throw new IOException("Failed to find matching enum value for " + url + " . Available enums are: " + Arrays.stream(constants).map(Object::toString).collect(Collectors.joining(", ")));
    }

    /**
     * Function for handling a rather primitive object, i.e. not a complex sub-object (e.g. URI, TypedLiteral, GregorianCalendar values, ...)
     * @param currentType Input Class (or primitive)
     * @param literal Value as literal (can be null in some cases)
     * @param currentSparqlBinding Value as SPARQL Binding (can be null in some cases)
     * @return Object of type currentType
     * @throws URISyntaxException thrown, if currentType is URI, but the value cannot be parsed to a URI
     * @throws DatatypeConfigurationException thrown, if currentType is XMLGregorianCalendar or Duration, but parsing fails
     * @throws IOException thrown, if no matching "simple class" could be found
     */
    private Object handlePrimitive(Class<?> currentType, Literal literal, String currentSparqlBinding) throws URISyntaxException, DatatypeConfigurationException, IOException {
        //Java way of checking for primitives, i.e. int, char, float, double, ...
        if (currentType.isPrimitive()) {
            if (literal == null) {
                throw new IOException("Trying to handle Java primitive, but got no literal value");
            }
            //If it is an actual primitive, there is no need to instantiate anything. Just give it to the function
            switch (currentType.getSimpleName()) {
                case "int":
                    return literal.getInt();
                case "boolean":
                    return literal.getBoolean();
                case "long":
                    return literal.getLong();
                case "short":
                    return literal.getShort();
                case "float":
                    return literal.getFloat();
                case "double":
                    return literal.getDouble();
                case "byte":
                    return literal.getByte();
            }
        }

        //Check for the more complex literals

        //URI
        if (URI.class.isAssignableFrom(currentType)) {
            return new URI(currentSparqlBinding);
        }

        //String
        if (String.class.isAssignableFrom(currentType)) {
            return currentSparqlBinding;
        }

        //XMLGregorianCalendar
        if (XMLGregorianCalendar.class.isAssignableFrom(currentType)) {
            //Try parsing this as dateTimeStamp (most specific). If seconds / timezone is missing, DatatypeFormatException will be thrown
            try {
                return DatatypeFactory.newInstance().newXMLGregorianCalendar(GregorianCalendar.from(ZonedDateTime.parse(literal.getValue().toString())));
            }
            catch (DatatypeFormatException | DateTimeParseException ignored)
            {
                //Not a valid dateTimeStamp. Try parsing just to Date
                try {
                    Date date = new SimpleDateFormat().parse(literal.getValue().toString());
                    GregorianCalendar calendar = new GregorianCalendar();
                    calendar.setTime(date);
                    return DatatypeFactory.newInstance().newXMLGregorianCalendar(calendar);
                }
                catch (ParseException | DateTimeParseException | DatatypeFormatException e2)
                {
                    //Do NOT use literal.getValue(), as that can already cause yet another DatatypeFormatException
                    throw new IOException("Could not turn " + literal.getString() + " into " + literal.getDatatypeURI(), e2);
                }
            }
        }

        //TypedLiteral
        if (LangString.class.isAssignableFrom(currentType)) {
            //Either a language tagged string OR literal with type. Only one allowed
            if (!literal.getLanguage().equals("")) {
                return new DefaultLangString.Builder().text(literal.getValue().toString()).language(literal.getLanguage()).build();
            }
            return new DefaultLangString.Builder().text(currentSparqlBinding).language("en-us").build(); // TODO: find a better language tag
        }

        //BigInteger
        if (BigInteger.class.isAssignableFrom(currentType)) {
            return new BigInteger(literal.getString());
        }

        //BigDecimal
        if (BigDecimal.class.isAssignableFrom(currentType)) {
            return new BigDecimal(literal.getString());
        }

        //byte[]
        if (byte[].class.isAssignableFrom(currentType)) {
            return currentSparqlBinding.getBytes();
        }

        //Duration
        if (Duration.class.isAssignableFrom(currentType)) {
            return DatatypeFactory.newInstance().newDuration(currentSparqlBinding);
        }

        throw new IOException("Unrecognized primitive type: " + currentType.getName());
    }

    /**
     * This list contains all primitive Java types
     */
    private final Map<String, Class<?>> builtInMap = new HashMap<>();
    {
        builtInMap.put("int", Integer.TYPE);
        builtInMap.put("long", Long.TYPE);
        builtInMap.put("double", Double.TYPE);
        builtInMap.put("float", Float.TYPE);
        builtInMap.put("bool", Boolean.TYPE);
        builtInMap.put("char", Character.TYPE);
        builtInMap.put("byte", Byte.TYPE);
        builtInMap.put("void", Void.TYPE);
        builtInMap.put("short", Short.TYPE);
    }

    private boolean isArrayListTypePrimitive(Type t) throws IOException {
        String typeName = extractTypeNameFromCollection(t);

        try {
            //Do not try to call Class.forName(primitive) -- that would throw an exception
            if (builtInMap.containsKey(typeName)) return true;
            return isPrimitive(Class.forName(typeName));
        } catch (ClassNotFoundException e) {
            throw new IOException("Unable to retrieve class from generic", e);
        }
    }

    private String extractTypeNameFromCollection(Type t) throws IOException {
        String typeName = t.getTypeName();
        if (!typeName.startsWith("java.util.ArrayList<") && !typeName.startsWith("java.util.List<") && !typeName.startsWith("java.util.Collection<")) {
            throw new IOException("Illegal argument encountered while interpreting type parameter");
        }
        //"<? extends XYZ>" or super instead of extends
        if(typeName.contains("?"))
        {
            //last space is where we want to cut off (right after the "extends"), as well as removing the last closing braces
            return typeName.substring(typeName.lastIndexOf(" ") + 1, typeName.length() - 1);
        }
        //No extends
        else
        {
            return typeName.substring(typeName.indexOf("<") + 1, typeName.indexOf(">"));
        }
    }

    private boolean isPrimitive(Class<?> input) throws IOException {
        //Collections are not simple
        if (Collection.class.isAssignableFrom(input)) {
            throw new IOException("Encountered collection in isPrimitive. Use isArrayListTypePrimitive instead");
        }

        //check for: plain/typed literal, XMLGregorianCalendar, byte[], RdfResource
        //covers int, long, short, float, double, boolean, byte
        if (input.isPrimitive()) return true;

        return (URI.class.isAssignableFrom(input) ||
                String.class.isAssignableFrom(input) ||
                XMLGregorianCalendar.class.isAssignableFrom(input) ||
                LangString.class.isAssignableFrom(input) ||
                BigInteger.class.isAssignableFrom(input) ||
                BigDecimal.class.isAssignableFrom(input) ||
                byte[].class.isAssignableFrom(input) ||
                Duration.class.isAssignableFrom(input));
    }

    /**
     * Entry point to this class. Takes an RDF Model and a desired target class (can be an interface)
     * @param rdfModel RDF input to be parsed
     * @param targetClass Desired target class (something as abstract as "Message.class" is allowed)
     * @param <T> Desired target class
     * @return Object of desired target class, representing the values contained in input message
     * @throws IOException if the parsing of the message fails
     */
    <T> T parseMessage(Model rdfModel, Class<T> targetClass) throws IOException {
        addArtificialBlankNodeLabels(rdfModel);
        ArrayList<Class<?>> implementingClasses = getImplementingClasses(targetClass);

        // Query to retrieve all instances in the input graph that have a class assignment
        // Assumption: if the class name (?type) is equal to the target class, this should be the
        // instance we actually want to parse
        String queryString = "SELECT ?id ?type { ?id a ?type . }";
        Query query = QueryFactory.create(queryString);
        QueryExecution queryExecution = QueryExecutionFactory.create(query, rdfModel);
        ResultSet resultSet = queryExecution.execSelect();

        if (!resultSet.hasNext()) {
            throw new IOException("Could not extract class from input message");
        }

        Map<String, Class<?>> returnCandidates = new HashMap<>();

        while (resultSet.hasNext()) {
            QuerySolution solution = resultSet.nextSolution();
            String fullName = solution.get("type").toString();
            String className = fullName.substring(fullName.lastIndexOf('/') + 1);

            //In case of hash-namespaces
            if(className.contains("#")) {
                className = className.substring(className.lastIndexOf("#"));
            }

            //For legacy purposes...
            if (className.startsWith("ids:") || className.startsWith("aas:")) {
                className = className.substring(4);
            }

            for (Class<?> currentClass : implementingClasses) {
                if (currentClass.getSimpleName().equals(Serializer.implementingClassesNamePrefix + className + Serializer.implementingClassesNameSuffix)) {
                    returnCandidates.put(solution.get("id").toString(), currentClass);
                }
            }
            //if (returnCandidates.size() > 0) break;
        }
        queryExecution.close();

        if (returnCandidates.size() == 0) {
            throw new IOException("Could not transform input to an appropriate implementing class for " + targetClass.getName());
        }

        //At this point, we parsed the model and know to which implementing class we want to parse
        //Check if there are several options available
        if(returnCandidates.size() > 1)
        {
            String bestCandidateId = null;
            Class<?> bestCandidateClass = null;
            long bestNumRelations = -1L;
            for(Map.Entry<String, Class<?>> entry : returnCandidates.entrySet())
            {
                String determineBestCandidateQueryString = "CONSTRUCT { ?s ?p ?o . ?o ?p2 ?o2 . ?o2 ?p3 ?o3 . ?o3 ?p4 ?o4 . ?o4 ?p5 ?o5 . }" +
                        " WHERE {" +
                        " BIND(<" + entry.getKey() + "> AS ?s). ?s ?p ?o ." +
                        " OPTIONAL {?o ?p2 ?o2 . OPTIONAL {?o2 ?p3 ?o3 . OPTIONAL {?o3 ?p4 ?o4 . OPTIONAL {?o4 ?p5 ?o5 . } } } } }";
                Query determineBestCandidateQuery = QueryFactory.create(determineBestCandidateQueryString);
                QueryExecution determineBestCandidateQueryExecution = QueryExecutionFactory.create(determineBestCandidateQuery, rdfModel);
                long graphSize = determineBestCandidateQueryExecution.execConstruct().size();
                if(graphSize > bestNumRelations)
                {
                    bestNumRelations = graphSize;
                    bestCandidateId = entry.getKey();
                    bestCandidateClass = entry.getValue();
                }

                determineBestCandidateQueryExecution.close();

            }
            logger.debug("The RDF graph contains multiple objects which can be parsed to " + targetClass.getSimpleName() + ". Determined " + bestCandidateId + " as best candidate.");
            return (T) handleObject(rdfModel, bestCandidateId, bestCandidateClass);
        }

        //We only reach this spot, if there is exactly one return candidate. Let's return it
        Map.Entry<String, Class<?>> singularEntry = returnCandidates.entrySet().iterator().next();
        return (T) handleObject(rdfModel, singularEntry.getKey(), singularEntry.getValue());

    }


    /**
     * Entry point to this class. Takes a message and a desired target class (can be an interface)
     * @param message Object to be parsed. Note that the name is misleading: One can also parse non-message IDS objects with this function
     * @param targetClass Desired target class (something as abstract as "Message.class" is allowed)
     * @param <T> Desired target class
     * @return Object of desired target class, representing the values contained in input message
     * @throws IOException if the parsing of the message fails
     */
    <T> T parseMessage(String message, Class<T> targetClass) throws IOException {
        Model model = readMessage(message);
        return parseMessage(model, targetClass);
    }

    /**
     * Entry point to this class. Takes a message and a desired target class (can be an interface)
     * @param message Object to be parsed. Note that the name is misleading: One can also parse non-message IDS objects with this function
     * @param targetClass Desired target class (something as abstract as "Message.class" is allowed)
     * @param serializationFormat Input RDF format
     * @param <T> Desired target class
     * @return Object of desired target class, representing the values contained in input message
     * @throws IOException if the parsing of the message fails
     */
    <T> T parseMessage(String message, Class<T> targetClass, Lang serializationFormat) throws IOException {
        Model model = readMessage(message, serializationFormat);
        return parseMessage(model, targetClass);
    }

    /**
     * Reads a message into an Apache Jena model, guessing the input language.
     * Note: Guessing the language may cause some error messages during parsing attempts
     *
     * @param message Message to be read
     * @return The model of the message
     */
    private Model readMessage(String message) throws IOException {

        List<Lang> supportedLanguages = new ArrayList<>(
                Arrays.asList(
                        RDFLanguages.JSONLD, //JSON-LD first
                        RDFLanguages.TURTLE, //N-TRIPLE is a subset of Turtle
                        RDFLanguages.RDFXML
                ));

        for (Lang lang : supportedLanguages) {
            try {
                return readMessage(message, lang);
            } catch (IOException ignored) {
            }
        }
        throw new IOException("Could not parse string as any supported RDF format (JSON-LD, Turtle/N-Triple, RDF-XML).");
    }

    /**
     * Reads a message into an Apache Jena model, guessing the input language.
     * Note: Guessing the language may cause some error messages during parsing attempts
     *
     * @param message Message to be read
     * @param language The RDF serialization of the input. Supported formats are JSON-LD, N-Triple, Turtle, and RDF-XML
     * @return The model of the message
     */
    private Model readMessage(String message, Lang language) throws IOException {

        Model targetModel = ModelFactory.createDefaultModel();

        try {
            RDFDataMgr.read(targetModel, new ByteArrayInputStream(message.getBytes()), language);
        }
        catch (RiotException e)
        {
            throw new IOException("Failed to parse input as " + language, e);
        }
        return targetModel;
    }

    /**
     * Get a list of all subclasses (by JsonSubTypes annotation) which can be instantiated
     * @param someClass Input class of which implementable subclasses need to be found
     * @return ArrayList of instantiable subclasses
     */
    ArrayList<Class<?>> getImplementingClasses(Class<?> someClass) {
        ArrayList<Class<?>> result = new ArrayList<>();
        KnownSubtypes subTypeAnnotation = someClass.getAnnotation(KnownSubtypes.class);
        if (subTypeAnnotation != null) {
            KnownSubtypes.Type[] types = subTypeAnnotation.value();
            for (KnownSubtypes.Type type : types) {
                result.addAll(getImplementingClasses(type.value()));
            }
        }
        if (!someClass.isInterface() && !Modifier.isAbstract(someClass.getModifiers())) {
            result.add(Serializer.customImplementationMap.getOrDefault(someClass, someClass));
        }
        return result;
    }

    private void addArtificialBlankNodeLabels(Model m)
    {
        //Get all blank nodes
        Query q = QueryFactory.create("SELECT DISTINCT ?s { ?s ?p ?o . FILTER(isBlank(?s)) } ");
        QueryExecution qe = QueryExecutionFactory.create(q, m);
        ResultSet rs = qe.execSelect();
        List<Statement> statementsToAdd = new ArrayList<>();
        while(rs.hasNext())
        {
            QuerySolution qs = rs.next();
            statementsToAdd.add(ResourceFactory.createStatement(qs.get("?s").asResource(),
                    ResourceFactory.createProperty(blankNodeIdPropertyUri.toString()),
                    ResourceFactory.createStringLiteral(qs.get("?s").toString())));
        }
        qe.close();
        m.add(statementsToAdd);
    }

}
