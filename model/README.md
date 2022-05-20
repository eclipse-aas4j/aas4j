# Eclipse AAS4J - AAS Model

The AAS Java Model is an implementation of the Asset Administration Shell
metamodel in Java. It contains all classes and properties as defined by the
document 'Details of the Asset Administration Shell' published on
[Industrial Digital Twin Association (IDTA)](https://industrialdigitaltwin.org/en/).


# Build and Use

You can build the project using Maven by simply executing:

`mvn clean install`

or by integrating the library as a dependency:

```
<dependency>
  <groupId>org.eclipse.aas4j</groupId>
  <artifactId>model</artifactId>
  <version>latest-version</version>
<dependency>
```

# Project Structure

The project contains several packages.

- `io.adminshell.aas.v3.model` Java interfaces & enums representing the AAS model
- `io.adminshell.aas.v3.model.annotations` Annotations used on the model
- `io.adminshell.aas.v3.model.builder` Abstract builder classes for the interfaces
- `io.adminshell.aas.v3.model.impl` Default implementations of the AAS classes. Can be replaced with custom implementations if needed.


# Contributors


An updated list of the committers can be found here: https://projects.eclipse.org/projects/dt.aas4j/who

| Name | Affiliation | Github Account |
|:--| -- | -- |
| Sebastian Bader | Fraunhofer IAIS | [sebbader](https://github.com/sebbader) |
| Matthias Böckmann | Fraunhofer IAIS | [maboeckmann](https://github.com/maboeckmann) |
| Helge Dickel | SAP SE | [heldic](https://github.com/heldic) |
| Daniel Espen | Fraunhofer IESE | [daespen](https://github.com/daespen) |
| Michael Jacoby | Fraunhofer IOSB | [mjacoby](https://github.com/mjacoby) |
| Jens Müller | Fraunhofer IOSB | [JensMueller2709](https://github.com/JensMueller2709) |
| Orthodoxos Kipouridis | SAP SE | [akiskips](https://github.com/akiskips) |
| Chang Qin | Fraunhofer IAIS | [changqin26](https://github.com/changqin26) |
| Bastian Rössl | Fraunhofer IOSB-INA | [br-iosb](https://github.com/br-iosb) |
| Manuel Sauer | SAP SE | [Manu3756](https://github.com/Manu3756) |
| Frank Schnicke | Fraunhofer IESE | [frankschnicke](https://github.com/frankschnicke) |

This project was initiated by SAP and Fraunhofer to provide a foundation for the
AAS development and to foster its dissemination.
