# Eclipse AAS4J

> :newspaper: The _`Eclipse AAS4J 2.0.1`_ release is available on [Maven Central Repository](https://oss.sonatype.org/#nexus-search;quick~org.eclipse.digitaltwin.aas4j) and includes the 
> following artifacts implementing the _AAS Specs – [Part 1 V3.1](https://industrialdigitaltwin.org/en/wp-content/uploads/sites/2/2025/06/IDTA_01001-25-01_AAS-Specification_Part1_Metamodel.pdf)_: `aas4j-dataformat-core`, `aas4j-dataformat-aasx`, 
> `aas4j-dataformat-xml`, `aas4j-dataformat-json`, `aas4j-dataformat-parent`, and `aas4j-model`.

[Eclipse AAS4J](https://projects.eclipse.org/projects/dt.aas4j) implements the specification of the Asset Administration 
Shell (AAS) such as metamodels, submodels, serialization and deserialization modules, validators, and transformation 
libraries based on the AAS specifications. It also contains all classes and properties as defined by the document 
'Specification of the Asset Administration Shell Part 1: Meta-Model' published on 
[Industrial Digital Twin Association (IDTA)](https://industrialdigitaltwin.org/en/wp-content/uploads/sites/2/2025/06/IDTA_01001-25-01_AAS-Specification_Part1_Metamodel.pdf).

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

## Cloning the repository
This project uses git [submodules](https://git-scm.com/book/en/v2/Git-Tools-Submodules) to utilize extensive examples from [aas-specs-metamodel](https://github.com/admin-shell-io/aas-specs-metamodel) for schema validation. After cloning, be sure to also initialize and update submodules.

To clone the repository together with all submodules, run:

git clone --recurse-submodules <aas4j_repository_url>

If you have already cloned the repository without the --recurse-submodules option, initialize and fetch the submodules with:

git submodule update --init --recursive

Note: Submodules are required for the validation tests inside dataformat-json/xml to work properly. Make sure you don't skip these steps.

## Build and Use

You can build the project using Maven by simply executing at the repository
root:

`mvn clean package`


or by integrating the respective modules as dependencies from [Maven Central](https://search.maven.org/search?q=aas4j) Repository, for instance:

```
<dependency>
  <groupId>org.eclipse.digitaltwin.aas4j</groupId>
  <artifactId>aas4j-model</artifactId>
  <version>latest-version</version>
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

## Handling Large AASX Files and Zip Bomb Protection

The `dataformat-aasx` module relies on Apache POI's ZIP handling to process AASX packages (Open Packaging Convention format). Apache POI includes a safeguard against so‑called "zip bombs" by checking the compression inflate ratio. For legitimate, very large AASX files that embed sizable binary assets (e.g. multi‑MB PDFs), the default protection may trigger an exception similar to:

```
Caused by: java.io.IOException: Zip bomb detected! The file would exceed the max. ratio of compressed file size to the size of the expanded data.
```

If you are certain that the AASX file is trusted and the exception is only due to large, highly compressed attachments, you can relax the protection before invoking the AASX deserializer:

```java
import org.apache.poi.openxml4j.util.ZipSecureFile;

// Set to 0.0 to disable the inflate ratio check; prefer a small positive value when possible.
ZipSecureFile.setMinInflateRatio(0.0);

// Proceed with AASX deserialization
// AASXDeserializer deserializer = ...
```

Recommendations when adjusting the inflate ratio threshold:
- Only lower this value for trusted inputs. Setting `0.0` disables the ratio check and increases risk if processing untrusted files.
- Consider using a small positive threshold (e.g. `0.001`) instead of zero to keep some protection while allowing large embedded documents.
- Complement this with other safeguards in your application: file size limits, antivirus / malware scanning, and sandboxing if processing third‑party data.
- The library does not change this setting itself; it is the responsibility of the consuming application to decide and document the chosen risk posture (e.g. via configuration such as Spring `application.properties`).

We intentionally do not override Apache POI's defaults inside AAS4J so that applications retain explicit control over security trade‑offs.

## Support

Current status of the project is *incubating*. 

If you find any issue, please, file it at https://github.com/eclipse-aas4j/aas4j/issues. **Note** that some issues might affect the AAS specifications that are not addressed here but at the corresponding workstreams (AAS in Details) for the Industrial Digital Twin Association (IDTA).

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
