package StrategyPattern.Approach1;

public abstract class Duck {
    abstract void fly();

    abstract void quack();

    abstract void run();

    void animalName() {
        System.out.println("This is a duck");
    }
}
