package ObserverPattern.Approach1.Observables;
import ObserverPattern.Approach1.Observers.Observer;

public interface Observable {
//    The reason we haven't included the implementation of these 3 methods is because subsriptions should be able to choose however it wants to notify the subscribers.
//    Don't tie to an implementation.
    void registerObserver(Observer observer);

    void unregisterObserver(Observer observer);

    void notifyObservers();

    int getValue();
}
