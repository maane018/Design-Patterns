package DecoratorPattern.Approach1;

public class Decaf extends Beverage {
    boolean hasChocolate;
    boolean hasCoffee;
    boolean hasCream;

    Decaf(boolean hasChocolate, boolean hasCoffee, boolean hasCream) {
        super(hasChocolate, hasCoffee, hasCream);
        this.hasChocolate = hasChocolate;
        this.hasCoffee = hasCoffee;
        this.hasCream = hasCream;
    }

    public String getDescription() {
        String baseString = "This is decaf coffee ";
        if(hasChocolate)
            baseString = baseString + "with chocolate";
        if(hasCoffee)
            baseString = baseString + "with coffee";
        if(hasCream)
            baseString = baseString + "with cream";
        return baseString;
    }
    public int cost(){
        int cost = 5;
        if(hasChocolate)
            cost = cost + 10;
        if(hasCoffee)
            cost = cost + 5;
        if(hasCream)
            cost = cost + 10;
        return cost;
    }

}
