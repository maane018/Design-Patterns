package ObserverPattern.Approach2.Observers;

import ObserverPattern.Approach2.Observables.Observable;

public class WeatherStation implements Observer {
    Observable observable;
    int temperature;

    public WeatherStation(Observable observable) {
        this.observable = observable;
        observable.registerObserver(this);
    }

    @Override
    public void update(int value) {
        this.temperature = value;
        display();
    }

    public void display() {
        System.out.println(temperature);
    }
}
