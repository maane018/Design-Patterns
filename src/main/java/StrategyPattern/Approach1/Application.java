package StrategyPattern.Approach1;

public class Application {
    public static void main(String[] args) {
        Duck duck = new MallardDuck();
        duck.quack();
        Duck anotherDuck = new WoodenDuck();
        anotherDuck.run();
        anotherDuck.animalName();
    }
}
