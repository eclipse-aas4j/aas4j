package org.eclipse.digitaltwin.aas4j.v3.dataformat.rdf;

import org.apache.jena.rdf.model.Model;
import org.apache.jena.riot.Lang;
import org.apache.jena.riot.RDFLanguages;
import org.eclipse.digitaltwin.aas4j.v3.dataformat.SerializationException;
import org.eclipse.digitaltwin.aas4j.v3.model.Environment;
import org.eclipse.digitaltwin.aas4j.v3.model.Referable;

import java.io.*;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;

public class RDFSerializer {
    private static final Charset DEFAULT_CHARSET = StandardCharsets.UTF_8;


    /**
     * Serializes a given instance of AssetAdministrationShellEnvironment to string
     *
     * @param aasEnvironment      the AssetAdministrationShellEnvironment to serialize
     * @param serializationFormat the serialization format such as JSON-LD, RDF/Turtle, ...
     * @return the string representation of the environment
     * @throws SerializationException if serialization fails
     */
    public String write(Environment aasEnvironment, Lang serializationFormat) throws SerializationException {
        try {
            throw new RuntimeException("Not Implemented");
        } catch (Exception ex) {
            throw new SerializationException("error serializing AssetAdministrationShellEnvironment", ex);
        }
    }

    /**
     * Serializes a given instance of AssetAdministrationShellEnvironment to string
     *
     * @param aasEnvironment the AssetAdministrationShellEnvironment to serialize
     * @return the string representation of the environment
     * @throws SerializationException if serialization fails
     */
    public String write(Environment aasEnvironment) throws SerializationException {
        return write(aasEnvironment, RDFLanguages.TTL);
    }

    /**
     * Serializes a given instance of a Referable to string
     *
     * @param referable           the referable to serialize
     * @param serializationFormat the serialization format such as JSON-LD, RDF/Turtle, ...
     * @return the string representation of the referable
     * @throws SerializationException if serialization fails
     */
    public String write(Referable referable, Lang serializationFormat) throws SerializationException {
        try {
            throw new RuntimeException("Not Implemented");
        } catch (Exception ex) {
            throw new SerializationException("error serializing AssetAdministrationShellEnvironment", ex);
        }
    }

    /**
     * Serializes a given instance of a Referable to string
     *
     * @param referable the referable to serialize
     * @return the string representation of the referable
     * @throws SerializationException if serialization fails
     */
    public String write(Referable referable) throws SerializationException {
        return write(referable, RDFLanguages.TTL);
    }

    /**
     * Converts a given instance of AssetAdministrationShellEnvironment as RDF Model.
     *
     * @param aasEnvironment the AssetAdministrationShellEnvironment to serialize
     * @return the Jena Model
     */
    public Model toModel(Environment aasEnvironment) {
        throw new RuntimeException("Not Implemented");
    }

    /**
     * Converts a given instance of a Referable to a JSON node.
     *
     * @param referable the referable to serialize
     * @return the RDFSerializationResult contains the Apache Jena model as well as the corresponding created resource
     */
    public RDFSerializationResult toModel(Referable referable) {
        return null;
    }


    /**
     * Serializes a given instance of Environment to an OutputStream using DEFAULT_CHARSET
     *
     * @param out            the Outputstream to serialize to
     * @param aasEnvironment the Environment to serialize
     * @throws IOException            if writing to the stream fails
     * @throws SerializationException if serialization fails
     */
    void write(OutputStream out, Environment aasEnvironment) throws IOException, SerializationException {
        write(out, DEFAULT_CHARSET, aasEnvironment);
    }

    /**
     * Serializes a given instance of Environment to an OutputStream using given charset
     *
     * @param out            the Outputstream to serialize to
     * @param charset        the Charset to use for serialization
     * @param aasEnvironment the Environment to serialize
     * @throws IOException            if writing to the stream fails
     * @throws SerializationException if serialization fails
     */
    void write(OutputStream out, Charset charset, Environment aasEnvironment)
            throws IOException, SerializationException {
        try (OutputStreamWriter writer = new OutputStreamWriter(out, charset)) {
            writer.write(write(aasEnvironment));
        }
    }

    // Note that the AAS also defines a file class

    /**
     * Serializes a given instance of Environment to a java.io.File using DEFAULT_CHARSET
     *
     * @param file           the java.io.File to serialize to
     * @param charset        the Charset to use for serialization
     * @param aasEnvironment the Environment to serialize
     * @throws FileNotFoundException  if the fail does not exist
     * @throws IOException            if writing to the file fails
     * @throws SerializationException if serialization fails
     */
    void write(java.io.File file, Charset charset, Environment aasEnvironment)
            throws FileNotFoundException, IOException, SerializationException {
        try (OutputStream out = new FileOutputStream(file)) {
            write(out, charset, aasEnvironment);
        }
    }

    /**
     * Serializes a given instance of Environment to a java.io.File using given charset
     *
     * @param file           the java.io.File to serialize to
     * @param aasEnvironment the Environment to serialize
     * @throws FileNotFoundException  if the fail does not exist
     * @throws IOException            if writing to the file fails
     * @throws SerializationException if serialization fails
     */
    void write(java.io.File file, Environment aasEnvironment)
            throws FileNotFoundException, IOException, SerializationException {
        write(file, DEFAULT_CHARSET, aasEnvironment);
    }


//    /**
//     *
//     * @param referables the referables to serialize
//     * @return the string representation of the list of referables
//     * @throws SerializationException if serialization fails
//     */
//    public String write(Collection<? extends Referable> referables) throws SerializationException {
//        try {
//            throw new RuntimeException("Not Implemented");
//        } catch (Exception ex) {
//            throw new SerializationException("error serializing AssetAdministrationShellEnvironment", ex);
//        }
//    }

//    /**
//     *
//     * @param referables the referables to serialize
//     * @return the string representation of the list of referables
//     */
//    public Model toModel(Collection<? extends Referable> referables) {
//        throw new RuntimeException("Not Implemented");
//    }


//    public String writeReferables(List<Referable> referables) throws SerializationException {
//        try {
//            throw new RuntimeException("Not Implemented");
//        } catch (Exception ex) {
//            throw new SerializationException("error serializing AssetAdministrationShellEnvironment", ex);
//        }
//    }
}
