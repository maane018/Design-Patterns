package StrategyPattern.Approach2;

public class CityDuck extends Duck {
    public void fly() {
        System.out.println("This is Fly Behavior 1");
    }

    public void quack() {
        // Problem 2: See this implementation. This behavior is duplicated across MallardDuck and CityDuck
        System.out.println("This is Quack Behavior 1");
    }

    public void run() {
        // Problem 2: See this implementation. This behavior is duplicated across RubberDuck and CityDuck
        System.out.println("This is Run Behavior 2");
    }
}
