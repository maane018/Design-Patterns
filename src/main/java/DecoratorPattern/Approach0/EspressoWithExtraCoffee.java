package DecoratorPattern.Approach0;

public class EspressoWithExtraCoffee extends Beverage{
    public String getDescription() {
        return "This is espresso coffee with extra coffee beans";
    }
    public int cost(){
        return 25;
    }

}