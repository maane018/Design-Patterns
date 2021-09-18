package ObserverPattern.BruteForce;

public class Sensor {
    public int temperature;
    public int humidity;
    WeatherStation weatherStation;

    Sensor() {
        weatherStation = new WeatherStation();
    }

    public void setHumidity(int humidity) {
//        This will be used by actual sensors
        this.humidity = humidity;
    }

    public void setTemperature(int temperature) {
//        This will be used by actual sensors
        this.temperature = temperature;
    }

    public void update() {
//      Hard coding clients, bad idea
        weatherStation.update(this.temperature, this.humidity);
//        anotherClient.update(...)
//        anotherClient.update()....

    }
}
