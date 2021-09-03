**Definition**

This pattern defines a family of algorithms, encapsulates each one of them and makes them interchangeable. It lets the
algorithms vary independently of clients.

Family of algorithms: `FlyBehavior, QuackBehavior` <br>
Encapsulates: `Created interfaces for these 2 behaviors` <br>
Interchangeable: `We can easily use FlyBehavior1 over 2, without any changes in code (except dependency changes)` <br>
Lets algorithm vary independently of
clients: `We can have any logic change in FlyBehavior1() and it won't affect anything to the Duck which has this behavior.` <br>

**Other solutions?** <br>

1.
We can have other approaches, where we have a big tree with different types of behaviors. This approach uses inheritance
as code-reuse mechanism. Consider duck behavior as D1 and let's assume we have 2 fly behaviors F1 and F2. So, we can
have a tree with root as D1, then children as D1F1 and D1F2.

D1F1 will be implemented by MallardDuck and City Duck (if they have common behavior i.e D1 and FlyBehavior 1).
Similarly, D1F2 will be implemented by RubberDuck if it wants D1 and F2 as Fly behavior.

    Cons:
    1. Class Explosion
    2. Maintenance problems in case of future enhancements
    3. Let's say if we have some changes in Fly Behavior 1, we'll need to find all the ducks which use that behavior. And then possibly change them.

2.
We can use multiple inheritance too. Let's say we have a class FlyBehavior1(), and then FlyBehavior2(), and similarly
QuackBehavior1() and 2(). So we can have a duck which wants to inherit these 2 behaviors i.e Duck, QuackBehavior1 and
FlyBehavior2.

    Cons:
    1. Multiple inheritance is not supported in Java, because of diamond problem. 
      [Question: Then why is it supported in other languages and how is the diamond problem handled?]

**Learnings**:

1. Favour composition as compared to inheritance. Use HAS-A relationship over IS-A relationship.
2. Separate what's constant and what's varying.
3. If you see clearly, in the Duck class, we are using Dependency injection for Fly and Quack behavior, instead of
   defining it anywhere. Use dependency injection, because it allows your code to be loosely coupled.
4. Never force any behavior on a class.
5. Try to do code-reuse/behavior-reuse. Otherwise, it will eventually lead to maintenance problems.
6. Program to interface and not implementations. [In Application.java, we are currently tied to RubberDuck]
7. Try to create a contract, so that the concrete implementations adhere to it.
8. Solution for inheritance problems is not more inheritance
9. Never use inheritance for code-reuse. BAD DESIGN
10. Interfaces are better than abstract classes (which has non-abstract methods and some code inside it) because we
    generally never want to tie our implementation to ANY code. Always tie it to interfaces and not code (because code
    can change anytime, leading to so many issues in other classes too).
11. Try to come up with a design which enables you to make a change in 1 class, without affecting anything else.
12. Interfaces are better because it enables you to extend the code, and also you can extend multiple interfaces. Unlike
    abstract class.
13. More time is spent in manitaining/enhancing the code instead of developing it. That's why always think about
    extensible designs.

**Ways to think**:

1. Let's say I have to introduce a behavior for an object, so what if I don't create the behavior in the same class and
   just get it from some place else. Instead of caring about how to fly/quack, we only use an object which knows how to
   do so. We just use the object. Always try to delegate the functionality. We don't care about what kind of object Duck
   is, all we care about that it knows how to quack() or fly().
2. Should we always create interfaces for all methods of duck? Not necessarily, always think from future perspective. If
   you think the behavior might change in the future, then use interface. If not, then use abstract class to implement
   the behavior. If every behavior is changing, you can use interfaces as well instead of abstract class.

**Important resources**:

1. Head first design pattern Chapter 1
2. Christopher Okhravi's video on [Strategy Pattern](https://www.youtube.com/watch?v=v9ejT8FO-7I)




