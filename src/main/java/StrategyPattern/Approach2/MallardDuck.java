package StrategyPattern.Approach2;

public class MallardDuck implements Duck {
    public void fly() {
//        Problem 1: CityDuck and Mallard Duck have same fly behavior, so code redundancy is there
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
