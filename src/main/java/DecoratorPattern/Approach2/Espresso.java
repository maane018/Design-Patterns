package DecoratorPattern.Approach2;

public class Espresso extends Beverage{

    public String getDescription(){
        return "This is espresso coffee";
    }
    public int getCost() {
        return 20;
    }
}
