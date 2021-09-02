package StrategyPattern.Approach3;

public class WoodenDuck extends Duck implements Quackable {

    public void run() {
        System.out.println("This is Run behavior 4");
    }

    @Override
    public void quack() {
        System.out.println("This is quack behavior 5");
    }
}
