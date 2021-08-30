package StrategyPattern.Approach3;

public class Application {
    public static void main(String[] args) {
        Duck duck = new MallardDuck();
//      Problem 2: We cannot do this because quack behavior is implemented from Quackable interface
//        duck.quack();
    }
}
