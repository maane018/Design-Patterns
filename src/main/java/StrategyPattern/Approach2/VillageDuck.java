package StrategyPattern.Approach2;

public class VillageDuck implements Duck{
//    Problem 4: This duck is supposed to fly but it does not have fly() implementation. BAD DESIGN
//    What if the developer also forgets to implement this behavior?

    @Override
    public void quack() {
        System.out.println("This is Quack Behavior 5");
    }

    @Override
    public void run() {
        System.out.println("This is Run Behavior 5");
    }
}
