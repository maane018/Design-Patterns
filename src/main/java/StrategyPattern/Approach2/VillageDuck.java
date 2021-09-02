package StrategyPattern.Approach2;

public class VillageDuck extends Duck {
//    Problem 4: This duck is supposed to fly but it does not have fly() implementation. BAD DESIGN
//    What if the developer also forgets to implement this behavior?

    public void quack() {
        System.out.println("This is Quack Behavior 5");
    }

    public void run() {
        System.out.println("This is Run Behavior 5");
    }
}
