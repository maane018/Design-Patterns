Approach Description:

`In the previous approach, fly() behavior was creating a problem. We had to force an "empty" implementation on the Ducks which don't fly (i.e Rubber Duck and Wooden Duck)
So in this approach, we have removed the fly() method from the interface, so that the Duck can have the choice to implement the fly() method or not. If the duck does not fly, it doesn't have to implement that method, but if it does fly, then the duck needs to implement fly() in the implementation.`

Pros of this approach:

1. `Each specific implementation is able to implement it's specific fly behavior.`

Cons of this approach:

1. `Since each class is able to implement it's specific fly behavior, code redundancy can be there in fly behavior.`
2. `Duplicate/Redundant behavior is still shared across various implementations.`
3. `Runtime Behavior changes are difficult.`
4. `Contract is breached now. We have VillageDuck with no fly behavior present [Which is just wrong].`

Learnings:

1. `Try to create a contract, so that the concrete implementations adhere to it.`
