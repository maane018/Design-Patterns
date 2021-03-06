package StrategyPattern.Approach3;

public class MallardDuck extends Duck implements Flyable, Quackable {
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
