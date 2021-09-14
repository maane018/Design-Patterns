package DecoratorPattern.Approach2;

public abstract class AddOns extends Beverage{
    Beverage beverage;
    AddOns(Beverage beverage){
        this.beverage = beverage;
    }
    public abstract String getDescription();
    public abstract int getCost();
}
