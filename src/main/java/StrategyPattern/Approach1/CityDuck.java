package StrategyPattern.Approach1;

public class CityDuck implements Duck {
    @Override
    public void fly() {
        System.out.println("This is Fly Behavior 3");
    }

    @Override
    public void quack() {
        // Problem 1: See MallardDuck implementation. This behavior is duplicated across MallardDuck and CityDuck
        System.out.println("This is Quack Behavior 1");
    }

    @Override
    public void run() {
        // Problem 1: See RubberDuck implementation. This behavior is duplicated across RubberDuck and CityDuck
        System.out.println("This is Run Behavior 2");
    }
}
