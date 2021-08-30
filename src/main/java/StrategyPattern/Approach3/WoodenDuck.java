package StrategyPattern.Approach3;

import StrategyPattern.Approach3.Duck;

public class WoodenDuck implements Duck {
//    Problem 3: This class is supposed to have Quack() also but oops developer mistake

    @Override
    public void run() {
        System.out.println("This is Run behavior 4");
    }
}
