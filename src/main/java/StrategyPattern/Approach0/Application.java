package StrategyPattern.Approach0;

public class Application {
    public static void main(String[] args) {
//        Problem 4: What if we want to swap it out with CityDuck instead? Need to change the implementation and also, what will we do with duck.swim()?
//        Swimming is not supported by CityDuck
        RubberDuck duck = new RubberDuck();
        duck.swim();
    }
}
