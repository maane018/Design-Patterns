package ObserverPattern.Approach0;

public class Application {
    public static void main(String[] args) {
        WeatherStation weatherStation = new WeatherStation(new Sensor());
        weatherStation.showReadings();
    }
}
