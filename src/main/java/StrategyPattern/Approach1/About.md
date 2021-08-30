Approach Description:

`Create an interface named Duck, which has all behaviours of a Duck.
Create concrete implementations, using this interface Duck and define the specific behaviors in the concrete implementations.
This way we can easily implement any new Duck, with the contract specified in the interface.`

Pros of this approach:

1. `All behaviours of duck are very clearly mentioned in the interface. 
Basically, the Duck interface has clearly defined a contract for any new specific type of Duck, which implements this interface.`

Cons of this approach:

1. `Duplicate/Redundant behavior shared across various implementations`
2. `Some behavior is forced on some classes, even when the class should not have this behavior.`
3. `Runtime Behavior changes are difficult.`


Learnings:
1. `Never force any behavior on a class. In our case, we are forcing fly() behavior on Rubber as well as Wooden duck.`
