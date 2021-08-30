package StrategyPattern.FinalApproach;

import StrategyPattern.FinalApproach.FlyBehavior.FlyBehavior1;
import StrategyPattern.FinalApproach.FlyBehavior.Flyable;
import StrategyPattern.FinalApproach.QuackBehavior.QuackBehavior1;
import StrategyPattern.FinalApproach.QuackBehavior.Quackable;

public class CityDuck extends Duck {
    CityDuck() {
        super(new FlyBehavior1(), new QuackBehavior1());
    }

    CityDuck(Flyable flyBehavior, Quackable quackBehavior) {
        super(flyBehavior,quackBehavior);
    }
}
