package StrategyPattern.Approach2;

public class Application {
    public static void main(String[] args) {
        Duck duck = new MallardDuck();
        duck.quack();
        Duck anotherDuck = new CityDuck();
        anotherDuck.quack();
    }
}
