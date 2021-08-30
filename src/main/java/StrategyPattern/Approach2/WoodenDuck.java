package StrategyPattern.Approach2;

public class WoodenDuck implements Duck {

    //There is no fly implementation here, because WoodenDucks cannot fly.
    @Override
    public void quack() {
        System.out.println("This is Quack behavior 4");
    }

    @Override
    public void run() {
        System.out.println("This is Run behavior 4");

    }
}
