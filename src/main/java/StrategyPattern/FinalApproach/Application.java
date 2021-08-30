package StrategyPattern.FinalApproach;

import StrategyPattern.FinalApproach.FlyBehavior.FlyBehavior1;
import StrategyPattern.FinalApproach.QuackBehavior.QuackBehavior2;

public class Application {
    public static void main(String[] args) {
        Duck duck = new MallardDuck();
        duck.quack();
        duck.fly();
        duck.run();


        Duck anotherDuck = new MallardDuck(new FlyBehavior1(), new QuackBehavior2());
        anotherDuck.quack();
        anotherDuck.fly();
        anotherDuck.run();
    }
}
