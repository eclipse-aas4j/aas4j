# Eclipse AAS4J

> :newspaper: The _`Eclipse AAS4J 1.0.0-milestone-01`_ release is available on Maven Central Repository and includes the following artifacts implementing the _AAS Specs – Part 1 V3.RC02_: `dataformat-core`, `dataformat-aasx`, `dataformat-xml`, `dataformat-json`, `dataformat-parent`, and `model'.

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
</dependency>
```

## Dataformat Library Project Structure

The project contains several modules:

- `dataformat-parent` Maven parent module that contains the respective de-/serializers for the different data formats.
- `dataformat-core` Location of the general classes and interfaces that are used by more than one de-/serializer.
- `dataformat-aasx` AASX de-/serializer
- `dataformat-json` JSON de-/serializer
- `dataformat-rdf` RDF de-/serializer
- `dataformat-xml` XML de-/serializer
- `dataformat-uanodeset` OPC UA I4AAS NodeSet de-/serializer
- `dataformat-aml` AutomationML serializer (deserializer is currently under development)

Additionally, the sources that are used for generating the static documentation using [DocFX](https://dotnet.github.io/docfx/) in the `gh-pages` branch are located in the `docs` folder.

# Simple Example

```

package com.example;

import java.util.Arrays;

import org.eclipse.digitaltwin.aas4j.v3.dataformat.json.JsonSerializer;
import org.eclipse.digitaltwin.aas4j.v3.dataformat.xml.XmlSerializer;
import org.eclipse.digitaltwin.aas4j.v3.model.DataTypeDefXsd;
import org.eclipse.digitaltwin.aas4j.v3.model.KeyTypes;
import org.eclipse.digitaltwin.aas4j.v3.model.ModelingKind;
import org.eclipse.digitaltwin.aas4j.v3.model.ReferenceTypes;
import org.eclipse.digitaltwin.aas4j.v3.model.impl.DefaultAdministrativeInformation;
import org.eclipse.digitaltwin.aas4j.v3.model.impl.DefaultAssetAdministrationShell;
import org.eclipse.digitaltwin.aas4j.v3.model.impl.DefaultEnvironment;
import org.eclipse.digitaltwin.aas4j.v3.model.impl.DefaultKey;
import org.eclipse.digitaltwin.aas4j.v3.model.impl.DefaultLangString;
import org.eclipse.digitaltwin.aas4j.v3.model.impl.DefaultProperty;
import org.eclipse.digitaltwin.aas4j.v3.model.impl.DefaultQualifier;
import org.eclipse.digitaltwin.aas4j.v3.model.impl.DefaultReference;
import org.eclipse.digitaltwin.aas4j.v3.model.impl.DefaultSubmodel;

public class Example {

    public void create() throws Exception {
        DefaultAssetAdministrationShell shell = new DefaultAssetAdministrationShell.Builder()
                .id("https://example.org/AssetAdministrationShell")
                .submodels(new DefaultReference.Builder()
                        .keys(new DefaultKey.Builder()
                                .type(KeyTypes.SUBMODEL)
                                .value("http://acplt.org/Submodels/Assets/TestAsset/Identification")
                                .build())
                        .type(ReferenceTypes.GLOBAL_REFERENCE)
                        .build())
                .build();

        DefaultSubmodel submodel = new DefaultSubmodel.Builder()
                .idShort("Identification")
                .description(Arrays.asList(
                        new DefaultLangString.Builder()
                                .text("An example asset identification submodel for the test application")
                                .language("en-us").build(),
                        new DefaultLangString.Builder()
                                .text("Ein Beispiel-Identifikations-Submodel für eine Test-Anwendung")
                                .language("de")
                                .build()))
                .id("http://acplt.org/Submodels/Assets/TestAsset/Identification")
                .administration(new DefaultAdministrativeInformation.Builder()
                        .version("0.9")
                        .revision("0")
                        .build())
                .kind(ModelingKind.INSTANCE)
                .semanticId(new DefaultReference.Builder()
                        .keys(new DefaultKey.Builder()
                                .type(KeyTypes.SUBMODEL)
                                .value("http://acplt.org/SubmodelTemplates/AssetIdentification")
                                .build())
                        .type(ReferenceTypes.GLOBAL_REFERENCE)
                        .build())
                .submodelElements(new DefaultProperty.Builder()
                        .idShort("ManufacturerName")
                        .description(Arrays.asList(
                                new DefaultLangString.Builder().text(
                                        "Legally valid designation of the natural or judicial person which is directly responsible for the design, production, packaging and labeling of a product in respect to its being brought into circulation.")
                                        .language("en-us").build(),
                                new DefaultLangString.Builder().text(
                                        "Bezeichnung für eine natürliche oder juristische Person, die für die Auslegung, Herstellung und Verpackung sowie die Etikettierung eines Produkts im Hinblick auf das 'Inverkehrbringen' im eigenen Namen verantwortlich ist")
                                        .language("de").build()))
                        .semanticId(new DefaultReference.Builder()
                                .keys(new DefaultKey.Builder()
                                        .type(KeyTypes.GLOBAL_REFERENCE)
                                        .value("0173-1#02-AAO677#002")
                                        .build())
                                .type(ReferenceTypes.GLOBAL_REFERENCE)
                                .build())
                        .qualifiers(new DefaultQualifier.Builder()
                                .value("100")
                                .type("http://acplt.org/Qualifier/ExampleQualifier")
                                .valueType(DataTypeDefXsd.INT)
                                .build())
                        .qualifiers(new DefaultQualifier.Builder()
                                .value("50")
                                .type("http://acplt.org/Qualifier/ExampleQualifier2")
                                .valueType(DataTypeDefXsd.INT)
                                .build())
                        .value("http://acplt.org/ValueId/ACPLT")
                        .valueType(DataTypeDefXsd.STRING)
                        .valueId(new DefaultReference.Builder()
                                .keys(new DefaultKey.Builder()
                                        .type(KeyTypes.GLOBAL_REFERENCE)
                                        .value("http://acplt.org/ValueId/ACPLT")
                                        .build())
                                .type(ReferenceTypes.GLOBAL_REFERENCE)
                                .build())
                        .build())
                .submodelElements(new DefaultProperty.Builder()
                        .idShort("InstanceId")
                        .description(Arrays.asList(
                                new DefaultLangString.Builder().text(
                                        "Legally valid designation of the natural or judicial person which is directly responsible for the design, production, packaging and labeling of a product in respect to its being brought into circulation.")
                                        .language("en-us").build(),
                                new DefaultLangString.Builder().text(
                                        "Bezeichnung für eine natürliche oder juristische Person, die für die Auslegung, Herstellung und Verpackung sowie die Etikettierung eines Produkts im Hinblick auf das 'Inverkehrbringen' im eigenen Namen verantwortlich ist")
                                        .language("de").build()))
                        .semanticId(new DefaultReference.Builder()
                                .keys(new DefaultKey.Builder()
                                        .type(KeyTypes.GLOBAL_REFERENCE)
                                        .value("http://opcfoundation.org/UA/DI/1.1/DeviceType/Serialnumber")
                                        .build())
                                .type(ReferenceTypes.GLOBAL_REFERENCE)
                                .build())
                        .value("978-8234-234-342")
                        .valueType(DataTypeDefXsd.STRING)
                        .valueId(new DefaultReference.Builder()
                                .keys(new DefaultKey.Builder()
                                        .type(KeyTypes.GLOBAL_REFERENCE)
                                        .value("978-8234-234-342")
                                        .build())
                                .type(ReferenceTypes.GLOBAL_REFERENCE)
                                .build())
                        .build())
                .build();

        DefaultEnvironment env = new DefaultEnvironment.Builder().assetAdministrationShells(shell)
                .submodels(submodel).build();

        // searialize to json
        String json_shell = new JsonSerializer().write(env);

        // searialize to xml
        String xml_shell = new XmlSerializer().write(env);

    }
}

```

# How to Contribute

We always look for contributions, bug reports, feature requests etc. Please, read https://github.com/eclipse-digitaltwin/aas4j/blob/main/CONTRIBUTING.md for more information.


# Contributors

An updated list of the committers can be found here: https://projects.eclipse.org/projects/dt.aas4j/who

| Name        | Affiliation           | Github Account | Parent | Core  | AASX | JSON | XML | RDF | UA-Nodeset | Validator| AutomationML
--- | --- | --- | :---: | :---: | :---: | :---: | :---: | :---: | :---: | :---: | :---:
| Mohammad Alreeni | Fraunhofer IWU | []() |  |  |  |  | x |  |  |  |
| Sebastian Bader | Fraunhofer IAIS | [sebbader](https://github.com/sebbader) | x |  |  |  |  | x |  | x |  |
| Matthias Böckmann | Fraunhofer IAIS | [maboeckmann](https://github.com/maboeckmann) | x |  |  |  |  | x |  | x |  |
| Maximilian Conradi | Fraunhofer IESE | []() |  |  | x |  | x |  |  |  |  |
| Helge Dickel | SAP SE | [heldic](https://github.com/heldic) | x |  |  | x | x |  |  |  |  |
| Daniel Espen | Fraunhofer IESE | [daespen](https://github.com/daespen) |  | x | x | x | x |  |  |  |  |
| Michael Jacoby | Fraunhofer IOSB| [mjacoby](https://github.com/mjacoby) | x | x |  | x | x |  |  |  | x |
| Jens Müller | Fraunhofer IOSB | [JensMueller2709](https://github.com/JensMueller2709) |  |  |  | x |  |  |  |  | x |
| Orthodoxos Kipouridis | SAP SE | [akiskips](https://github.com/akiskips) | x |  |  | x | x |  |  |  |  |
| Bastian Rössl | Fraunhofer IOSB-INA | [br-iosb](https://github.com/br-iosb) |  |  |  | x |  |  | x |  |  |
| Frank Schnicke | Fraunhofer IESE | [frankschnicke](https://github.com/frankschnicke) |  |  | x |  | x |  |  | x |  |
| Manuel Sauer | SAP SE | [Manu3756](https://github.com/Manu3756) | x |  |  |  |  |  |  |  |  |
| Arno Weiss | Fraunhofer IWU | [alw-iwu](https://github.com/alw-iwu) |  |  |  | x |  |  | x |  |  |
| Jan Blume | Fraunhofer IOSB | []() |  |  |  |  |  |  |  |  | x |

This project was initiated by SAP and Fraunhofer to provide a foundation for the
AAS development and to foster its dissemination.
