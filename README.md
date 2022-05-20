# Java Dataformat Library

The AAS Java Dataformat Library is a collection of software modules to serialize and
deserialze instances of the Asset Administration Shell from and to Java
instances. De-/serialization works according to the dataformat schemas published in
the document 'Details of the Asset Administration Shell', published on
[www.plattform-i40.de](https://www.plattform-i40.de).


# Build and Use

Some examples can be found on the [documentation webpage](https://admin-shell-io.github.io/java-serializer/).

You can build the project using Maven by simply executing at the repository
root:

`mvn clean package`


or by integrating the respective modules as dependencies from Maven Central Repository, for instance:

```
<dependency>
  <groupId>io.admin-shell.aas</groupId>
  <artifactId>dataformat-json</artifactId>
  <version>latest-version</version>
<dependency>
```

# Project Structure

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



# How to Contribute

We always look for contributions, bug reports, feature requests etc. Simply open an [issue](https://github.com/admin-shell-io/java-serializer/issues) or - even better - directly propose a change through a [pull request](https://github.com/admin-shell-io/java-serializer/pulls).


# Contributors

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
