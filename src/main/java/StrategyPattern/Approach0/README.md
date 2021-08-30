Approach Description:

`Create different classes for different types of duck. No interface, no abstract class. Just a bunch of different classes, for each type of duck.`

Pros of this approach:

1. `Very simple approach. Naive approach.`

Cons of this approach:

1. `Duplicate/Redundant behavior shared across various implementations`
2. `Some classes can have weird behaviors too, even when it's not needed.`
3. `Some classes can have missing behaviors too, even when it's needed.`
4. `Runtime Behavior changes are difficult.`

Learnings:

1. `Try to do code-reuse/behavior-reuse. Otherwise, it will eventually lead to maintenance problems.`
2. `Always tie to interfaces and not implementations. [In Application.java, we are currently tied to RubberDuck]`
