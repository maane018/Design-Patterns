package StrategyPattern.FinalApproach.QuackBehavior;

public class QuackBehavior1 implements Quackable {
    @Override
    public void quack() {
        System.out.println("This is quack behavior 1");
    }
}
