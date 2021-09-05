package ObserverPattern.Approach0;

public class WeatherStation {
    public int temperature;
    public int humidity;
//    Problem 1: Tied to an implementation
//    Problem 2: Implementation is tied to an implementation, basically WeatherStation to Sensor
    Sensor sensor;

    WeatherStation(Sensor sensor) {
        this.sensor = sensor;
        this.temperature = this.sensor.getTemperature();
        this.humidity = this.sensor.getHumidity();
    }

    private void display() {
        System.out.println(this.temperature);
        System.out.println(this.humidity);
    }

    public void showReadings() {
//        This is poll mechanism, not very efficient because this loop will run infinite times and most of the time there will be no update.
        while (true) {
            if (sensor.getHumidity() != this.humidity) {
                this.humidity = sensor.getHumidity();
                display(); //Start a new thread/process for this
            }
            if (sensor.getTemperature() != this.temperature) {
                this.temperature = sensor.getTemperature();
                display(); //Start a new thread/process for this
            }
        }
    }

}
