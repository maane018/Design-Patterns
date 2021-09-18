package DecoratorPattern.Approach0;

public class DecafWithChocolate extends Beverage {
    //    Problem 1: Class explosion, we are creating a new class for every combination
//    Problem 2: What if we want to create DecafWithDoubleChocolate?
    public String getDescription() {
        return "This is decaf coffee with chocolate";
    }

    public int cost() {
//        Problem 3: What if cost of chocolate changes from 5->23? Then in every class which has chocolate, we'll have to chan
        return 20;
    }

}