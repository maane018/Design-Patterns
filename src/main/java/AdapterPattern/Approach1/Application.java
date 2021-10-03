package AdapterPattern.Approach1;

public class Application {
    public static void main(String[] args) {
        GenericAdapter adapter = new Adapter2to3(new WallWith3PinCharger());
        LaptopChargerWith2Pin laptopCharger = new LaptopChargerWith2Pin(adapter);
        laptopCharger.charge();
    }
}
