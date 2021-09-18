package DecoratorPattern.Approach2;

public class Coffee extends AddOns {
    Beverage beverage;

    Coffee(Beverage beverage) {
        super(beverage);
        this.beverage = beverage;
    }

    public String getDescription() {
        return this.beverage.getDescription() + "Coffee";
    }

    public int getCost() {
        return this.beverage.getCost() + 10;
    }
}
