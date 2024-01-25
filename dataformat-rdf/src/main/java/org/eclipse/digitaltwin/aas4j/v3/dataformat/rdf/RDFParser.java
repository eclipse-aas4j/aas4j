package org.eclipse.digitaltwin.aas4j.v3.dataformat.rdf;

import com.fasterxml.jackson.databind.JsonNode;
import org.apache.jena.rdf.model.Resource;
import org.eclipse.digitaltwin.aas4j.v3.dataformat.DeserializationException;
import org.eclipse.digitaltwin.aas4j.v3.model.Environment;
import org.eclipse.digitaltwin.aas4j.v3.model.Referable;

import java.io.*;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.List;
import java.util.stream.Collectors;

public class RDFParser {
    private static final Charset DEFAULT_CHARSET = StandardCharsets.UTF_8;
    /**
     * Deserializes a given string into an instance of AssetAdministrationShellEnvironment
     *
     * @param value a string representation of the AssetAdministrationShellEnvironment
     * @return an instance of AssetAdministrationShellEnvironment
     * @throws DeserializationException if deserialization fails
     */
    public Environment read(String value) throws DeserializationException {
//        try {
//            return mapper.readValue(value, Environment.class);
//        } catch (JsonProcessingException ex) {
//            throw new DeserializationException("error deserializing AssetAdministrationShellEnvironment", ex);
//        }
        try {
            throw new RuntimeException("Not Implemented");
        } catch (Exception ex) {
            throw new DeserializationException("error deserializing list of Referable", ex);
        }
    }

    /**
     * Deserializes a given JSON node into an instance of AssetAdministrationShellEnvironment
     *
     * @param root root node of the document to parse
     * @return an instance of AssetAdministrationShellEnvironment
     * @throws DeserializationException if deserialization fails
     */
    public Environment read(Resource root) throws DeserializationException {
//        try {
//            return mapper.treeToValue(root, Environment.class);
//        } catch (JsonProcessingException ex) {
//            throw new DeserializationException("error deserializing AssetAdministrationShellEnvironment", ex);
//        }
        try {
            throw new RuntimeException("Not Implemented");
        } catch (Exception ex) {
            throw new DeserializationException("error deserializing list of Referable", ex);
        }
    }

    /**
     * Deserializes a given InputStream into an instance of AssetAdministrationShellEnvironment using DEFAULT_CHARSET
     *
     * @param src an InputStream containing the string representation of the AssetAdministrationShellEnvironment
     * @return an instance of AssetAdministrationShellEnvironment
     * @throws DeserializationException if deserialization fails
     */
    public Environment read(InputStream src) throws DeserializationException {
        return read(src, DEFAULT_CHARSET);
    }

    /**
     * Deserializes a given InputStream into an instance of AssetAdministrationShellEnvironment using a given charset
     *
     * @param src An InputStream containing the string representation of the AssetAdministrationShellEnvironment
     * @param charset the charset to use for deserialization
     * @return an instance of AssetAdministrationShellEnvironment
     * @throws DeserializationException if deserialization fails
     */
    public Environment read(InputStream src, Charset charset) throws DeserializationException {
        return read(new BufferedReader(
                new InputStreamReader(src, charset))
                .lines()
                .collect(Collectors.joining(System.lineSeparator())));
    }

    /**
     * Deserializes a given File into an instance of AssetAdministrationShellEnvironment using DEFAULT_CHARSET
     *
     * @param file A java.io.File containing the string representation of the AssetAdministrationShellEnvironment
     * @param charset the charset to use for deserialization
     * @return an instance of AssetAdministrationShellEnvironment
     * @throws FileNotFoundException if file is not present
     * @throws DeserializationException if deserialization fails
     */
    public Environment read(java.io.File file, Charset charset)
            throws FileNotFoundException, DeserializationException {
        return read(new FileInputStream(file), charset);
    }

    /**
     * Deserializes a given File into an instance of AssetAdministrationShellEnvironment using a given charset
     *
     * @param file a java.io.File containing the string representation of the AssetAdministrationShellEnvironment
     * @return an instance of AssetAdministrationShellEnvironment
     * @throws FileNotFoundException if the file is not present
     * @throws DeserializationException if deserialization fails
     */
    public Environment read(java.io.File file) throws FileNotFoundException, DeserializationException {
        return read(file, DEFAULT_CHARSET);
    }


    /**
     * Enables usage of custom implementation to be used for deserialization instead of default implementation, e.g.
     * defining a custom implementation of the Submodel interface {@code class
     * CustomSubmodel implements Submodel {}} and calling
     * {@code useImplementation(Submodel.class, CustomSubmodel.class);} will result in all instances of Submodel will be
     * deserialized as CustomSubmodel. Subsequent class with the same aasInterface parameter will override the effects
     * of all previous calls.
     *
     * @param <T> the type of the interface to replace
     * @param aasInterface the class of the interface to replace
     * @param implementation the class implementing the interface that should be used for deserialization.
     */
    public <T> void useImplementation(Class<T> aasInterface, Class<? extends T> implementation) {
//        typeResolver.addMapping(aasInterface, implementation);
//        mapper = jsonMapperFactory.create(typeResolver);
    }

    /**
     * Deserializes a given string into an instance of the given Referable
     *
     * @param src a string representation of the Referable
     * @param outputClass most specific class of the given Referable
     * @param <T> type of the returned element
     * @return an instance of the referable
     * @throws DeserializationException if deserialization fails
     */
    public <T extends Referable> T readReferable(String src, Class<T> outputClass) throws DeserializationException {
        try {
            throw new RuntimeException("Not Implemented");
        } catch (Exception ex) {
            throw new DeserializationException("error deserializing list of Referable", ex);
        }
    }

    /**
     * Deserializes a given input stream into an instance of the given Referable using DEFAULT_CHARSET
     *
     * @param src a input stream representing a Referable
     * @param outputClass most specific class of the given Referable
     * @param <T> type of the returned element
     * @return an instance of the referable
     * @throws DeserializationException if deserialization fails
     */
    public <T extends Referable> T readReferable(InputStream src, Class<T> outputClass) throws DeserializationException {
        return readReferable(src, DEFAULT_CHARSET, outputClass);
    }

    /**
     * Deserializes a given input stream into an instance of the given Referable using DEFAULT_CHARSET
     *
     * @param root Apache Jena Resource
     * @param outputClass most specific class of the given Referable
     * @param <T> type of the returned element
     * @return an instance of the referable
     * @throws DeserializationException if deserialization fails
     */
    public <T extends Referable> T readReferable(JsonNode root, Class<T> outputClass) throws DeserializationException {
        try {
            throw new RuntimeException("Not Implemented");
        } catch (Exception ex) {
            throw new DeserializationException("error deserializing list of Referable", ex);
        }
    }

    /**
     * Deserializes a given input stream into an instance of the given Referable
     *
     * @param src a input stream representing a Referable
     * @param charset the charset to use
     * @param outputClass most specific class of the given Referable
     * @param <T> type of the returned element
     * @return an instance of the referable
     * @throws DeserializationException if deserialization fails
     */
    public <T extends Referable> T readReferable(InputStream src, Charset charset, Class<T> outputClass) throws DeserializationException {
        return readReferable(new BufferedReader(
                        new InputStreamReader(src, charset))
                        .lines()
                        .collect(Collectors.joining(System.lineSeparator())),
                outputClass);
    }

    /**
     * Deserializes a given file into an instance of the given Referable using DEFAULT_CHARSET
     *
     * @param src a file containing string representation of a Referable
     * @param outputClass most specific class of the given Referable
     * @param <T> type of the returned element
     * @return an instance of the referable
     * @throws DeserializationException if deserialization fails
     * @throws java.io.FileNotFoundException if file is not found
     */
    public <T extends Referable> T readReferable(File src, Class<T> outputClass) throws DeserializationException, FileNotFoundException {
        return readReferable(src, DEFAULT_CHARSET, outputClass);
    }

    /**
     * Deserializes a given file into an instance of the given Referable
     *
     * @param src a file containing string representation of a Referable
     * @param charset the charset to use
     * @param outputClass most specific class of the given Referable
     * @param <T> type of the returned element
     * @return an instance of the referable
     * @throws DeserializationException if deserialization fails
     * @throws java.io.FileNotFoundException if file is not found
     */
    public <T extends Referable> T readReferable(File src, Charset charset, Class<T> outputClass) throws DeserializationException, FileNotFoundException {
        return readReferable(new FileInputStream(src), charset, outputClass);
    }

    /**
     * Deserializes a given string into an instance of a list of the given Referables
     *
     * @param referables a string representation of an array of Referables
     * @param outputClass most specific class of the given Referable
     * @param <T> type of the returned element
     * @return an instance of a list of the referables
     * @throws DeserializationException if deserialization of referable fails
     */
    public <T extends Referable> List<T> readReferables(String referables, Class<T> outputClass) throws DeserializationException {
        try {
            throw new RuntimeException("Not Implemented");
        } catch (Exception ex) {
            throw new DeserializationException("error deserializing list of Referable", ex);
        }
    }

    /**
     * Deserializes a given string into an instance of a list of the given Referables
     *
     * @param root Apache Jena Resource
     * @param outputClass most specific class of the given Referable
     * @param <T> type of the returned element
     * @return an instance of a list of the referables
     * @throws DeserializationException if deserialization of referable fails
     */
    public <T extends Referable> List<T> readReferables(Resource root, Class<T> outputClass) throws DeserializationException {
        try {
            throw new RuntimeException("Not Implemented");
        } catch (Exception ex) {
            throw new DeserializationException("error deserializing list of Referable", ex);
        }
    }

    /**
     * Deserializes a given input stream into an instance of a list of the given Referable using DEFAULT_CHARSET
     *
     * @param src a input stream representing a Referable
     * @param outputClass most specific class of the given Referable
     * @param <T> type of the returned element
     * @return an instance of the referable
     * @throws DeserializationException if deserialization fails
     */
    public <T extends Referable> List<T> readReferables(InputStream src, Class<T> outputClass) throws DeserializationException {
        return readReferables(src, DEFAULT_CHARSET, outputClass);
    }

    /**
     * Deserializes a given input stream into an instance of a list of the given Referable
     *
     * @param src a input stream representing a Referable
     * @param charset the charset to use
     * @param outputClass most specific class of the given Referable
     * @param <T> type of the returned element
     * @return an instance of the referable
     * @throws DeserializationException if deserialization fails
     */
    public <T extends Referable> List<T> readReferables(InputStream src, Charset charset, Class<T> outputClass) throws DeserializationException {
        return readReferables(new BufferedReader(
                        new InputStreamReader(src, charset))
                        .lines()
                        .collect(Collectors.joining(System.lineSeparator())),
                outputClass);
    }

    /**
     * Deserializes a given file into an instance of a list of the given Referable using DEFAULT_CHARSET
     *
     * @param src a file containing string representation of a Referable
     * @param outputClass most specific class of the given Referable
     * @param <T> type of the returned element
     * @return an instance of the referable
     * @throws DeserializationException if deserialization fails
     * @throws java.io.FileNotFoundException if file is not found
     */
    public <T extends Referable> List<T> readReferables(File src, Class<T> outputClass) throws DeserializationException, FileNotFoundException {
        return readReferables(src, DEFAULT_CHARSET, outputClass);
    }

    /**
     * Deserializes a given file into an instance of a list of the given Referable
     *
     * @param src a file containing string representation of a Referable
     * @param charset the charset to use
     * @param outputClass most specific class of the given Referable
     * @param <T> type of the returned element
     * @return an instance of the referable
     * @throws DeserializationException if deserialization fails
     * @throws java.io.FileNotFoundException if file is not found
     */
    public <T extends Referable> List<T> readReferables(File src, Charset charset, Class<T> outputClass) throws DeserializationException, FileNotFoundException {
        return readReferables(new FileInputStream(src), charset, outputClass);
    }
}
