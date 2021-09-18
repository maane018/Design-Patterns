package ObserverPattern.Approach1.Observables;

import ObserverPattern.Approach1.Observers.Observer;

import java.util.ArrayList;
import java.util.List;

public class HumiditySensor implements Observable {
    //    Can save it in any Data structure, either heap for priority or map for unique.
    private List<Observer> registeredObservers;
    private int humidity;

    public HumiditySensor() {
        registeredObservers = new ArrayList<>();
    }

    @Override
    public void registerObserver(Observer observer) {
        registeredObservers.add(observer);
    }

    @Override
    public void unregisterObserver(Observer observer) {
        registeredObservers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (Observer currentObserver : registeredObservers) {
            currentObserver.update(this);
        }
    }

    public void setHumidity(int humidity) {
        this.humidity = humidity;
    }

    public int getValue() {
        return humidity;
    }
}
