**Approach Description**:

We create a class for every possible combination. Decaf with chocolate espresso with extra coffee decaf espresso....

**Pros of this approach**:

**Cons of this approach**:

1. Class explosion
2. What if we want to create DecafWithDoubleChocolate?
3. What if cost of some Ingredient changes? Need to change all classes

**Learnings**:

1. Never use inheritance for code-reuse.
