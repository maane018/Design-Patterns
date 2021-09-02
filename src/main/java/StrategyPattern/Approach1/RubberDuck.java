package StrategyPattern.Approach1;

public class RubberDuck extends Duck {
    public void fly() {
//        Problem 2: Since RubberDucks cannot fly, we don't want this method in our class.
//        But since we are implementing from Duck, we are forced to implement this method and hence this method is empty.
//        User should not even be allowed to call this method for RubberDuck
//        But because of our design, calling fly() on RubberDuck is allowed, unless we throw some exception from our side.
//        Either leave this empty or you can also throw an exception (i.e OperationNotAllowed) to indicate that this operation is not allowed.
//        From design perspective, it's not a good idea to expose the methods/API's which are not allowed to use.
//        We should only expose those methods/API's which the user can use/call, because we cannot control what the user can do.
//        We can only control what our service exposes.
    }

    public void quack() {
        System.out.println("This is Quack Behavior 2");
    }

    public void run() {
        System.out.println("This is Run Behavior 2");
    }

    public void entertain() {
//        Problem 4: What why? Why is there entertain behavior of duck, what if other classes want this too?
        System.out.println("Hey I am entertaining");
    }
}
