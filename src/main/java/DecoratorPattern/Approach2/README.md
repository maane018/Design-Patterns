**Approach Description**:

Decorator has a component and is a component. Addon has a beverage (so that it can build on it) and is a beverage([so
that we can use beverage = new chocolate(beverage) thing)
Attaches some additional responsbibility to an object dynamically.

**Pros of this approach**:

1. Runtime changes are possible
2. No class explosion
3. No duplicated behavior + easily extensible
4. If cost of anything changes, then only 1 change is needed. Not everything.

**Cons of this approach**:

1. Sometimes decorators can get out of hand. That's why some brands have something like this "You can have only 5
   toppings".
2. Decorators are too much alike, so is there a way to share behavior?
3. If we need decorators to be different, then decorator pattern is much more useful. Let's say OutputStream, has many
   decorators as BufferedOutputStream, LineStream, WordStream Different implementations and hence decorator pattern.

**Learnings**:

1. Never use inheritance for code-reuse.
2. Code should be extensible, but not modifiable.
3. Don't return boolean.
4. Don't force any behaviour on sub-classes.
5. It's better to have multiple small interfaces, rather than 1 large interface.
