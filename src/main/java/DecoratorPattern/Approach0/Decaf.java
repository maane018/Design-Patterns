package DecoratorPattern.Approach0;

public class Decaf extends Beverage {
    public String getDescription() {
        return "This is decaf coffee";
    }

    public int cost() {
        return 15;
    }

}
