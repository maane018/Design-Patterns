package BuilderPattern.FinalApproach;

public class Application {
    public static void main(String[] args) {
        Car car = Car.Builder.newInstance().setCompany("Maruti").setName("Baleno").build();
        System.out.println(car.getCompany());
    }

}
