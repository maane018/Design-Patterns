package BuilderPattern.Approach0;

public class Application {
    public static void main(String[] args) {
//    Problem 1: If you observe, in this constructor we'll have to remember the order of parameters. What if number of parameters increase????? SO MUCH WORK
//    Problem 2: Let's say isReleased is optional, and we don't want to provide it right now but in the future. Either remove it from constructor or currently set it as null.
//    Problem 3: If we introduce null then chances of null pointer exception increase.
        Car car = new Car("Baleno", 2, 3, 4, "Maruti", 100, 10000, false);
    }
}
