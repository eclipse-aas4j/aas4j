# Eclipse AAS4J

> :newspaper: The _`Eclipse AAS4J 1.0.0-milestone-03`_ release is available on Maven Central Repository and includes the following artifacts implementing the _AAS Specs – Part 1 V3.0 (final)_: `dataformat-core`, `dataformat-aasx`, `dataformat-xml`, `dataformat-json`, `dataformat-parent`, and `model`.

[Eclipse AA4J](https://projects.eclipse.org/projects/dt.aas4j) implements the specification of the Asset Administration Shell (AAS) such as metamodels, submodels, serialization and deserialization modules, validators, and transformation libraries based on the AAS specifications. It also contains all classes and properties as defined by the document 'Details of the Asset Administration Shell' published on [Industrial Digital Twin Association (IDTA)](https://industrialdigitaltwin.org/en/).

Note: AAS libraries for java previously available in [admin-shell-io](https://github.com/admin-shell-io).

# Project Structure

[Eclipse AA4J](https://projects.eclipse.org/projects/dt.aas4j) consists of the following components:
- AAS Model
- Dataformat Library
- Validator

# AAS Model

The AAS Model is an implementation of the Asset Administration Shell
metamodel in Java. It contains all classes and properties as defined by the
document 'Details of the Asset Administration Shell' published on
[Industrial Digital Twin Association (IDTA)](https://industrialdigitaltwin.org/en/).

Please refer to [AAS Model README](model/README.md) for more information.

# Dataformat Library

[Eclipse AA4J](https://projects.eclipse.org/projects/dt.aas4j) contains an AAS Java Dataformat Library. The AAS Java Dataformat Library is a collection of software modules to serialize and deserialze instances of the Asset Administration Shell from and to Java instances. De-/serialization works according to the dataformat schemas published in the document 'Details of the Asset Administration Shell', published on [Industrial Digital Twin Association (IDTA)](https://industrialdigitaltwin.org/en/).


## Build and Use

Some examples can be found on the [documentation webpage](https://admin-shell-io.github.io/java-serializer/).

You can build the project using Maven by simply executing at the repository
root:

`mvn clean package`


or by integrating the respective modules as dependencies from [Maven Central](https://search.maven.org/search?q=aas4j) Repository, for instance:

```
<dependency>
  <groupId>org.eclipse.digitaltwin.aas4j</groupId>
  <artifactId>dataformat-json</artifactId>
  <version>latest-version</version>
<dependency>
```

## AAS4J Project Structure

The project contains several modules:

- `dataformat-parent` Maven parent module that contains the respective de-/serializers for the different data formats.
- `dataformat-core` Location of the general classes and interfaces that are used by more than one de-/serializer.
- `dataformat-aasx` AASX de-/serializer
- `dataformat-json` JSON de-/serializer
- `dataformat-xml` XML de-/serializer
- `model` Meta-model classes be instantiated
- `validator` Validator against the semantic restrictions of the AAS meta-model

[AAS4J's predecessor](https://github.com/admin-shell-io/java-serializer) contained serialization modules for AutomationML
and OPC UA for which however no longer up-to-date specifications exist. Implementation is halted until the specs have been updated.

Additionally, the sources that are used for generating the static documentation using [DocFX](https://dotnet.github.io/docfx/) in the `gh-pages` branch are located in the `docs` folder.



# How to Contribute

We always look for contributions, bug reports, feature requests etc. Please, read https://github.com/eclipse-digitaltwin/aas4j/blob/main/CONTRIBUTING.md for more information.


# Contributors

An updated list of the committers can be found here: https://projects.eclipse.org/projects/dt.aas4j/who

This project was initiated by SAP and Fraunhofer to provide a foundation for the AAS development and to foster its dissemination.
