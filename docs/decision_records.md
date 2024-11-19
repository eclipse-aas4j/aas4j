# Architectural Decisions Records

## Handling the package structures of AAS4J

Refer to [ticket #3](https://github.com/eclipse-digitaltwin/aas4j/issues/11) - decision is:

- Considering only final versions of the model 

- Release vX.Y.Z with namespace ...v3... used for all components, i.e. ...v3.model...., ...v3.dataformat.json..., ...v3.validator... etc.

- Upon release of next final version v4 of specification: Release v(X+1).Y.Z with namespace ...v4... used for all components, remove all ...v4... namespaces

- If an application wants to support v3 and v4 it can include dependencies with vX.Y.Z and v(X+1).Y.Z.


## Versioning for Milestone Release / Preview / Release Candidates

- Decision for "1.0.0-milestone-01"

- Future versions of the pre-relesease can be "1.0.0-milestone-02"


## Final Release Planning

### V1.0.0 - Current state as final release (milestone 1.0.0-…-3 w/o issues and w/o RDF and w/o validator) 
- Take out RDF
- Take out Validator
- Take out utils
- Clean-up / quality assurance (e.g. public apis, best practices, test coverage…)
- Documentation
- Start Eclipse Foundation official release process

> Note: all issues and pull request addressing this part will be labelled as `label:V.1.0.0`

### V1.1.0 - New features
- Serializers according to Pt.2-Output-Modifiers (value-only as prio, …, is there already somethin available in BaSyx)
- Base-Classes Pt 2 (Descriptor etc) 
- Reintroduce RDF (V3) serialization
- Reintroduce Validator / Reimplement Validator in pure Java
- Reintroduce OPC UA 
- Reintroduce AML

> Note: all issues and pull request addressing this part will be labelled as `label:V.1.1.0`

