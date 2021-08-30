package StrategyPattern.Approach1;

public class WoodenDuck implements Duck{
    @Override
    public void fly() {
//        Problem 2: This class is not supposed to fly either. So overriding this behavior to do nothing.
//        This code hasn't turned out well when it comes to maintenance.
//        If we want to change the behavior tomorrow, then we'll have to change the entire class. NOT A GOOD DESIGN
    }

    @Override
    public void quack() {
        System.out.println("This is Quack behavior 4");
    }

    @Override
    public void run() {
        System.out.println("This is Run behavior 4");
    }
}
