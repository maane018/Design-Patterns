package StrategyPattern.Approach2;

public class WoodenDuck extends Duck {

    //There is no fly implementation here, because WoodenDucks cannot fly.
    public void quack() {
        System.out.println("This is Quack behavior 4");
    }

    public void run() {
        System.out.println("This is Run behavior 4");

    }
}
