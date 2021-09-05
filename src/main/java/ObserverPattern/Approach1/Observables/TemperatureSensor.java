package ObserverPattern.Approach1.Observables;

import ObserverPattern.Approach1.Observers.Observer;

import java.util.ArrayList;
import java.util.List;

public class TemperatureSensor implements Observable {
//    Can save it in any Data structure, either heap for priority or map for unique.

    private List<Observer> registeredObservers;
    private int temperature;

    public TemperatureSensor() {
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

    public void setTemperature(int temperature) {
        this.temperature = temperature;
    }

    public int getValue() {
        return temperature;
    }
}
