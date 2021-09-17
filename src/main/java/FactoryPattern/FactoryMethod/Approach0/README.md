**Definition**:
Defines an interface for defining objects but let's the subclasses decide which class to instantiate.
Here interface = PizzaFactory
Subclasses = PizzaShop1 and PizzaShop2


**Approach Description**:

Now, we have used strategy pattern on Simple Factory, so that we can easily swap out 1 factory with another.

**Pros of this approach**:

1. Modularization
2. Very easy to swap factories with each other

**Cons of this approach**:


**Learnings**:

1. Never hard code any dependency and always use dependency injection.
2. Mix and match design patterns

Example:
Let's say we have a industry which sells toys.
For the launch, it selects any random toy out of <penguin, deer and panda>
but then we have decided to equally sell these.
Hence we can have 2 kinds of factory: RandomFactory and UniformFactory, which will just give us the toy and we'll sell it.


Another example:
Let's say we have a game, which shoots asteroids in space. The higher level you get to, more and heavier asteroids will be shot.
Now using factory pattern, we can have something like this:
For every level, different Factory. Level1Factory, Level2Factory etc
These factories will be responsible for creating asteroids and once they are created, we can shoot them off. Yayyy!!
