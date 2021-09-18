**Approach Description**:

We introduce booleans here, for every topping. In Application.java, client can mention what is present during
construction of coffee. And also, runtime changes are possible via setters introduced in Beverage class.

**Pros of this approach**:

1. Runtime changes are possible
2. No class explosion

**Cons of this approach**:

1. It's never a good idea to introduce booleans, because if you are introducing boolean that means somebody else will
   have to handle that. Returning booleans provokes conditional elsewhere on your system.
2. Not too scalable, because if we have to add any condiment, then whole code change
3. If we need to change cost of chocolate, many changes needed.
4. Forcing setters on Decaf and Espresso. We don't need it. Let's say we have Tea also and chocolate does not fit in
   Tea.
5. What if I need double chocolate? Too much code change... We can have hasDoubleChocolate too, but why? It is just
   chocolate applied twice and anyway there is no end to this. Triple chocolate?

**Learnings**:

1. Never use inheritance for code-reuse.
2. Code should be extensible, but not modifiable.
3. Don't return boolean.
4. Don't force any behaviour on sub-classes.
5. It's better to have multiple small interfaces, rather than 1 large interface.
