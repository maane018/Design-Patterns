package DecoratorPattern.Approach0;

public class Espresso extends Beverage{
    public String getDescription() {
        return "This is expresso coffee";
    }
    public int cost(){
        return 10;
    }
}
