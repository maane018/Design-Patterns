package StrategyPattern.FinalApproach;

import StrategyPattern.FinalApproach.FlyBehavior.Flyable;
import StrategyPattern.FinalApproach.QuackBehavior.Quackable;

public abstract class Duck {
    Flyable flyBehavior;
    Quackable quackBehavior;

    Duck() {

    }

    Duck(Flyable flyBehavior, Quackable quackBehavior) {
        this.flyBehavior = flyBehavior;
        this.quackBehavior = quackBehavior;
    }

    void run() {
        System.out.println("This is run behavior 1");
    }

    public void quack() {
        this.quackBehavior.quack();
    }

    public void fly() {
        this.flyBehavior.fly();
    }
}
