# Introduction

The [AAS Java Dataformat Library](https://github.com/admin-shell-io/java-serializer/) is a collection of software modules to serialize and deserialze instances of the Asset Administration Shell from and to Java instances. De-/serialization works according to the dataformat schemas published in the document 'Details of the Asset Administration Shell', published on www.plattform-i40.de.

The serialization library and all its modules depend on the Java implementation for the metamodel from the project [java-model](https://github.com/admin-shell-io/java-model).

## Project Structure

The project contains several modules:

- `dataformat-parent` Maven parent module that contains the respective de-/serializers for the different data formats.
- `dataformat-core` Location of the general classes and interfaces that are used by more than one de-/serializer.
- `dataformat-aasx` AASX de-/serializer
- `dataformat-json` JSON de-/serializer
- `dataformat-xml` XML de-/serializer
- `dataformat-uanodeset` OPC UA I4AAS NodeSet de-/serializer