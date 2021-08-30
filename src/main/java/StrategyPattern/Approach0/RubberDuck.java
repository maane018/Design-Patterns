package StrategyPattern.Approach0;

public class RubberDuck {

    //    Problem 3: No quack behavior is present in this RubberDuck, developer made a mistake. OOPS!!
    public void run() {
        System.out.println("This is Run Behavior 3");
    }

    public void swim() {
//      Problem 2: Extra behavior in the duck. Where was it announced?
        System.out.println("This is swim behavior 1");
    }
}
