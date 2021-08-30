package StrategyPattern.Approach1;

public class MallardDuck implements Duck {
    @Override
    public void fly() {
        System.out.println("This is Fly behavior 1");
    }

    @Override
    public void quack() {
        System.out.println("This is Quack behavior 1");
    }

    @Override
    public void run() {
        System.out.println("This is Run behavior 1");
    }
}
