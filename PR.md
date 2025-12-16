## Summary
- prevent circular `referredSemanticId` chains in `DefaultReference` by rejecting self/indirect cycles during assignment
- add unit tests that cover self and indirect cycles plus happy-path acyclic chains
- include JUnit dependency in the model module to compile the new tests
- unblocks SAMM CLI AAS generation (esmf-sdk#802) by preventing the StackOverflow from circular references

## Background
Jackson XML serialization blew up with a StackOverflow when `Reference.referredSemanticId` contained a cycle (e.g., `Reference -> Reference -> same Reference`). The model allowed such graphs because the setter did not guard against cycles. This PR keeps the model acyclic so downstream serializers do not need custom circular-reference handling. This removes the root cause behind SAMM CLI’s infinite recursion during AAS generation (see esmf-sdk#802).

## Implementation Notes
- cycle detection uses identity (not equals) to avoid false positives from structurally equal references
- the guard walks the `referredSemanticId` chain once and fails fast with a clear `IllegalArgumentException` message
- tests cover self-reference, indirect cycles, and a valid chain

## Testing
- `mvn -pl model test -Dmaven.repo.local=./.m2`
