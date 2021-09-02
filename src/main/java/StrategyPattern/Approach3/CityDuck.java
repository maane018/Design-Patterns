package StrategyPattern.Approach3;

public class CityDuck extends Duck implements Flyable, Quackable {
    @Override
    public void fly() {
        System.out.println("This is Fly Behavior 2");
    }

    @Override
    public void quack() {
        System.out.println("This is Quack Behavior 2");
    }

    @Override
    public void run() {
//      Problem 1: Code redundancy. See MallardDuck.run()
        System.out.println("This is Run Behavior 1");
    }
}
