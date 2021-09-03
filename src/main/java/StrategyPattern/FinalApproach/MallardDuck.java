package StrategyPattern.FinalApproach;

import StrategyPattern.FinalApproach.FlyBehavior.FlyBehavior1;
import StrategyPattern.FinalApproach.FlyBehavior.Flyable;
import StrategyPattern.FinalApproach.QuackBehavior.QuackBehavior2;
import StrategyPattern.FinalApproach.QuackBehavior.Quackable;

public class MallardDuck extends Duck {
    MallardDuck() {
        super(new FlyBehavior1(), new QuackBehavior2());
    }

    MallardDuck(Flyable flyBehavior, Quackable quackBehavior) {
        super(flyBehavior, quackBehavior);
    }
}
