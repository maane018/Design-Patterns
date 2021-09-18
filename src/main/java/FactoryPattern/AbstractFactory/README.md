**Definition**:
Defines an interface for defining related or connected objects, without specifying their concrete classes.

**Approach Description**:

Here we want objects which are related. Basically user should not be able to mix and match different kinds of factories.

**Pros of this approach**:

1. Modularization
2. Very easy to swap factories with each other
3. Users won't be able to mix and match different kinds, hence preventing any sort of abuse.

**Cons of this approach**:

**Learnings**:

1. Never hard code any dependency and always use dependency injection.
2. Mix and match design patterns

**Example**:

Let's say we have an application which needs to be deployed on MacOS and windows. Ideally there are 4 objects: MacOS
Button, Windows Button, MacOS Mouse, Windows Mouse We cannot pair MacOs button with Windows mouse. Hence we can use
abstract factory.