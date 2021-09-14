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

**Learnings**:
1. Inheritance is not for code-reuse.
2. Use composition over inheritance, to share behavior.
3. Code should be extensible, but not modifiable.
4. Don't return boolean.
5. Don't force any behaviour on sub-classes.
6. It's better to have multiple small interfaces, rather than 1 large interface.
7. Generally used in Python. Google search: Python decorators
8. Annotations also work the same way!!

**Ways to think**:

Think of it like recursion. Base case are Decaf and Espresso.
We can have multiple base cases too, think of it like this:

Decaf = 10
Chocolate Decaf = 20
Chocolate Coffee Decaf = 50
Chocolate Chocolate Coffee Decaf = 60


**Important resources**:

1. Head first design pattern Chapter 3
2. Christopher Okhravi's video on [Decorator Pattern](https://www.youtube.com/watch?v=GCraGHx6gso)




