**Definition**

A decorator has a component(similar to proxy pattern) and a decorator is a component.
(Similar and easier as compared to Composite pattern)

Attaches additional responsibility to an object dynamically (at runtime, and not compile time) (Class X + extra functionality)
Provides flexible alternatives to sub-classes.

**Other solutions?** <br>

1. Can also do one thing
Condiment -> Chocolate, Coffee etc

While constructing Beverage, pass a list of all condiments and in getCost, add up all costs in the lists.
Similar to iterator pattern.
Aggregate a value based on set of values.


Use decorator pattern when you have different behavior of each decorator.
Let's say in this example: if we need someone to do +, something else to do -

Timeout, Logging etc

**Cons**:
1. Can lead to problems like Tea with Chocolate. How to prevent this problem?
2. Client need to take care of object types a lot, otherwise it can lead to unwanted problems with decorators.

**Learnings**:
1. Inheritance is not for code-reuse.
2. Use composition over inheritance, to share behavior.
Using inheritance, every sub-class is forced to behave in the same way as parent class. Using composition, sub class has a choice to do whatever it wants!!
This way sub-class can add new behavior+ use whatever it needs.
3. Code should be extensible, but not modifiable
Open closed principle. Don't overuse it but try to implement it.
4. Don't return boolean.
5. Don't force any behaviour on sub-classes.
6. It's better to have multiple small interfaces, rather than 1 large interface.
7. Generally used in Python. Google search: Python decorators
8. Annotations also work the same way!!
9. Learn the power of extension at runtime rather than compile time.
You should be able to do whatever you want, without making any code changes in the underlying classes.

**Ways to think**:

Think of it like recursion. Base case are Decaf and Espresso.
We can have multiple base cases too, think of it like this:

Decaf = 10
Chocolate Decaf = 20
Chocolate Coffee Decaf = 50
Chocolate Chocolate Coffee Decaf = 60


Decorators takes a particular class and return that same class after decorating!!
**Important resources**:

1. Head first design pattern Chapter 3
2. Christopher Okhravi's video on [Decorator Pattern](https://www.youtube.com/watch?v=GCraGHx6gso)




