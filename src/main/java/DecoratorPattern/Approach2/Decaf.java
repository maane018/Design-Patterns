package DecoratorPattern.Approach2;

public class Decaf extends Beverage {

    public String getDescription() {
        return "This is decaf coffee with ";
    }

    public int getCost() {
        return 10;
    }
}