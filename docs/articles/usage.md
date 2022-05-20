# Usage

The library and its modules are released at Maven Central. Thus, you can use the respective serializers in your Java Maven project by adding the following dependency:

```xml
<dependency>
  <groupId>io.admin-shell.aas</groupId>
  <artifactId>dataformat-**serializer**</artifactId>
  <version>**version**</version>
<dependency>
```

For example, uses the following dependency declaration to embed the `JSON dataformat`:

```xml
<dependency>
  <groupId>io.admin-shell.aas</groupId>
  <artifactId>dataformat-json</artifactId>
  <version>1.1.1</version>
<dependency>
```


> [!NOTE]
>
> Maven will automatically resolve the dependencies of the library and therefore also include the model implementation from the [java-model](https://github.com/admin-shell-io/java-model) project.

## Serialization

The library supports serialization of an AAS environment to a `File`, `OutputStream` or `String`. See the following interface to get more details on what methods can be used to serialize an environment:

https://github.com/admin-shell-io/java-serializer/blob/main/dataformat-core/src/main/java/io/adminshell/aas/v3/dataformat/Serializer.java

Here is a small example on how to serialize a given environment to a JSON-`String`:

```Java
AssetAdministrationShellEnvironment env = ...;
String serializedEnvironment = new JsonSerializer().write(env);
```

## Deserialization

Likewise, you can deserialize an AAS environment from a `File`, `InputStream` or `String`. See the following interface to get more details on what methods can be used to deserialize an environment:

https://github.com/admin-shell-io/java-serializer/blob/main/dataformat-core/src/main/java/io/adminshell/aas/v3/dataformat/Deserializer.java

Here is a small example on how to deserialize a given JSON-`String` and draw some information out of the returned model:

```Java
String serializedEnvironment = "...";
AssetAdministrationShellEnvironment env = new JsonDeserializer().read(serializedEnvironment);
List<AssetAdministrationShell> aasList = env.getAssetAdministrationShells();
aasList.forEach(aas -> System.out.println("Environment contains AAS: " + aas.getIdShort()));
```

## AASX

In order to be able to also embed files into a serialized environment, it is possible to create an .aasx-package. The AASX module makes use of the xml-dataformat to handle the `AASEnvironment`.

```Java
byte[] fileContent = ...;
AssetAdministrationShellEnvironment env = ...;
InMemoryFile file = new InMemoryFile(fileContent, "aasx/MyFile.pdf");
List<InMemoryFile> fileList = new ArrayList<>()
fileList.add(file);
ByteArrayOutputStream out = new ByteArrayOutputStream();
new AASXSerializer().write(env, fileList, out);
```

> [!NOTE]
>
> The given filepath is relative to the .aasx package root and has to correspondent to the relative path given in the `File`-`SubmodelElement` that points to this file.

## Constraint Validation

According to the AAS specification in "Details of The Asset Administration Shell", there are a number of constraints a valid model has to fulfill. The java-model implementation allows the creation of models that are not valid according to these constraints. The java-dataformat library contains a validation module to test them. The following snippet shows a submodel with an invalid idShort. Therefore, this snippet will throw a `ValidationException`.

```Java
Referable invalidReferable = new DefaultSubmodel.Builder()
    .identification(
        new DefaultIdentifier.Builder().identifier("submodel").idType(IdentifierType.CUSTOM).build())
            .idShort("_idShort")
            .build();
ShaclValidator.getInstance().validate(invalidReferable);
```
