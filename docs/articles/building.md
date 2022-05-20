# Building

You can download and build the repository by yourself by following these steps:

- Clone the GitHub repository:

```sh
        git clone https://github.com/admin-shell-io/java-serializer.git
```

- Use [Maven](https://maven.apache.org/) to build the project
```sh
        mvn clean package
```

- **OR** use Maven to build and install the artifacts in your local Maven repository
```sh
        mvn clean install
```

> [!NOTE]
>
> If the project is built locally, the artifact version is set to the `revision` variable in the `pom.xml` in the project root folder. 
> ```xml
>        <revision>1.1.0</revision>
>        <model.version>${revision}</model.version>
> ```
> If you change the version of your local built, the `model.version` is also set to the updated artifact version from the [java-model](https://github.com/admin-shell-io/java-model) project. For the same version number, both artifacts are compatible.
