package BuilderPattern.FinalApproach;

public class Application {
    public static void main(String[] args) {
        Car car = new Car.Builder("Baleno").build();
        System.out.println(car.getCompany());
        Car anotherCar = new Car.Builder("Swift").setCompany("Maruti").build();
        System.out.println(anotherCar.getCompany());
    }

}
