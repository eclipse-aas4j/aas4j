# Architectural Decisions Records

## Handling the package structures of AAS4J

Refer to [ticket #3](https://github.com/eclipse-digitaltwin/aas4j/issues/11) - decision is:

- Considering only final versions of the model 

- Release vX.Y.Z with namespace ...v3... used for all components, i.e. ...v3.model...., ...v3.dataformat.json..., ...v3.validator... etc.

- Upon release of next final version v4 of specification: Release v(X+1).Y.Z with namespace ...v4... used for all components, remove all ...v4... namespaces

- If an application wants to support v3 and v4 it can include dependencies with vX.Y.Z and v(X+1).Y.Z.
