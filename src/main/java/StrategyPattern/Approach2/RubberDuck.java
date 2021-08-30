package StrategyPattern.Approach2;

public class RubberDuck implements Duck {

    //There is no fly implementation here, because RubberDuck cannot fly.

    @Override
    public void quack() {
        System.out.println("This is Quack Behavior 2");
    }

    @Override
    public void run() {
        System.out.println("This is Run Behavior 2");
    }
}
