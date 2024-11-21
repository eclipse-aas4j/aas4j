# Eclipse AAS4J

> :newspaper: The _`Eclipse AAS4J 1.0.3`_ release is available on [Maven Central Repository](https://oss.sonatype.org/#nexus-search;quick~org.eclipse.digitaltwin.aas4j) and includes the 
> following artifacts implementing the _AAS Specs – Part 1 V3.0 (final)_: `aas4j-dataformat-core`, `aas4j-dataformat-aasx`, 
> `aas4j-dataformat-xml`, `aas4j-dataformat-json`, `aas4j-dataformat-parent`, and `aas4j-model`.

[Eclipse AAS4J](https://projects.eclipse.org/projects/dt.aas4j) implements the specification of the Asset Administration 
Shell (AAS) such as metamodels, submodels, serialization and deserialization modules, validators, and transformation 
libraries based on the AAS specifications. It also contains all classes and properties as defined by the document 
'Specification of the Asset Administration Shell Part 1: Meta-Model' published on 
[Industrial Digital Twin Association (IDTA)](https://industrialdigitaltwin.org/wp-content/uploads/2023/04/IDTA-01001-3-0_SpecificationAssetAdministrationShell_Part1_Metamodel.pdf).

Note: AAS libraries for java previously available in [admin-shell-io](https://github.com/admin-shell-io).

# Project Structure

[Eclipse AA4J](https://projects.eclipse.org/projects/dt.aas4j) consists of the following components:
- AAS Model
- Dataformat AASX
- Dataformat Core
- Dataformat JSON
- Dataformat XML

# AAS Model

The AAS Model is an implementation of the Asset Administration Shell
metamodel in Java. It contains all classes and properties as defined by the
document 'Details of the Asset Administration Shell' published on
[Industrial Digital Twin Association (IDTA)](https://industrialdigitaltwin.org/en/).

Please refer to [AAS Model README](model/README.md) for more information.

# Dataformat Library

[Eclipse AA4J](https://projects.eclipse.org/projects/dt.aas4j) contains an AAS Java Dataformat Library. The AAS Java Dataformat Library is a collection of software modules to serialize and deserialze instances of the Asset Administration Shell from and to Java instances. De-/serialization works according to the dataformat schemas published in the document 'Details of the Asset Administration Shell', published on [Industrial Digital Twin Association (IDTA)](https://industrialdigitaltwin.org/en/).


## Build and Use

You can build the project using Maven by simply executing at the repository
root:

`mvn clean package`


or by integrating the respective modules as dependencies from [Maven Central](https://search.maven.org/search?q=aas4j) Repository, for instance:

```
<dependency>
  <groupId>org.eclipse.digitaltwin.aas4j</groupId>
  <artifactId>aas4j-model</artifactId>
  <version>1.0.2</version>
</dependency>
```

## AAS4J Project Structure

The project contains several modules:

- `dataformat-parent` Maven parent module that contains the respective de-/serializers for the different data formats.
- `dataformat-core` Location of the general classes and interfaces that are used by more than one de-/serializer.
- `dataformat-aasx` AASX de-/serializer
- `dataformat-json` JSON de-/serializer
- `dataformat-xml` XML de-/serializer
- `model` Meta-model classes be instantiated

[AAS4J's predecessor](https://github.com/admin-shell-io/java-serializer) contained serialization modules for AutomationML
and OPC UA for which however no longer up-to-date specifications exist. Implementation is halted until the specs have been updated.
Additionally, the RDF serializer and the validator have been removed temporarily from this repo but are planned to be
reintroduced in the future.

Additionally, the sources that are used for generating the static documentation using [DocFX](https://dotnet.github.io/docfx/) in the `gh-pages` branch are located in the `docs` folder.

## Support

Current status of the project is *incubating*. 

If you find any issue, please, file it at https://github.com/eclipse-aas4j/aas4j/issues. **Note** that some issues might affect the AAS specifications that are not addressed here but at the corrsponding workstreams (AAS in Details) for the Industrial Digital Twin Association (IDTA).

You can contact us via our mailing list (aas4j-dev@eclipse.org).

Feel free also to (subscribe to our mailing list)[https://accounts.eclipse.org/mailing-list/aas4j-dev]


# How to Contribute

We always look for contributions, bug reports, feature requests etc. Please, read https://github.com/eclipse-digitaltwin/aas4j/blob/main/CONTRIBUTING.md for more information.


# Contributors

An updated list of the committers can be found here: https://projects.eclipse.org/projects/dt.aas4j/who

This project was initiated by SAP and Fraunhofer to provide a foundation for the AAS development and to foster its dissemination.

## License
Copyright (c) 2021 Fraunhofer-Gesellschaft zur Foerderung der angewandten Forschung e. V.

Copyright 2023 SAP SE or an SAP affiliate company and Eclipse AAS4J contributors. 

The serializers contained in this repository provide the functionalities to serialize and deserialize instances of the Asset Administration Shell (AAS) data model from and to the AAS Java Model library. It is licensed under the Apache License
2.0 (see [LICENSE](https://github.com/eclipse-aas4j/aas4j/blob/main/LICENSE)).

The Model uses the concepts of the document "Specifications of Asset Administration Shell" published on [Industrial Digital Twin Association (IDTA)](https://industrialdigitaltwin.org) which is licensed
under Creative Commons [CC BY 4.0](https://creativecommons.org/licenses/by/4.0/).
