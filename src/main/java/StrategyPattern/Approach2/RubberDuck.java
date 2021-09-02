package StrategyPattern.Approach2;

public class RubberDuck extends Duck {

    //There is no fly implementation here, because RubberDucks cannot fly.

    public void quack() {
        System.out.println("This is Quack Behavior 2");
    }

    public void run() {
        System.out.println("This is Run Behavior 2");
    }

    public void entertain() {
//        Problem 5: What why? Why is there entertain behavior of duck, what if other classes want this too?
        System.out.println("Hey I am entertaining");
    }
}
