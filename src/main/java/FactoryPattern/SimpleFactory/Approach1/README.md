**Approach Description**:

We modularized the code so that creation of pizza remains in one class. No need to change every class, in case of any modifications.

**Pros of this approach**:

1. Modularization
**Cons of this approach**:

1. If you see PizzaShops, the factory used is hardcoded. What if I want to use a different PizzaFactory? We can use constructor injection for this.

**Learnings**:

1. Never hard code any dependency and always use dependency injection.
