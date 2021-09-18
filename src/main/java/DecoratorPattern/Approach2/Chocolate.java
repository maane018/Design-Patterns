package DecoratorPattern.Approach2;

public class Chocolate extends AddOns {
    Beverage beverage;

    Chocolate(Beverage beverage) {
        super(beverage);
        this.beverage = beverage;
    }

    public String getDescription() {
        return this.beverage.getDescription() + "Chocolate ";
    }

    public int getCost() {
        return this.beverage.getCost() + 20;
    }
}
