**Definition**

Ensures the class has only 1 instance and provides global access to that class.
Takes care of 3 things:
1. Makes sure a single instance exists
2. Provide global access
3. Do whatever the instance is supposed to do

It's not following single responsibility principle, hence also bad.
**Other solutions?** <br>


**Learnings**:

1. Singleton pattern is code-smell, should not use it.
2. One person's constant is another person's variable. That means, singletons are very difficult to test etc.
3. One of the main things we learn in programming is to avoid globals. Singletons are globals hence bad!!
The global thing might change anytime (by anyone) and hence you'll not have good control over that variable.
4. Using singleton, we make sure that we have only one instance. But why? What about extensibility? What if in the future, we need more instances?
5. It's fine to have only a single object of something in an application, but it's not fine to force a behavior on a class, which allows it to have ONLY ONE object.
6. Statics are also bad, how to test??

**Ways to think**:


**Important resources**:

1. Head first design pattern Chapter 5
2. Christopher Okhravi's video on [Singleton Pattern](https://www.youtube.com/watch?v=hUE_j6q0LTQ)




