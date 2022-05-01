package tr.unvercanunlu.patterns.observer.impl;

import tr.unvercanunlu.patterns.observer.IObserver;
import tr.unvercanunlu.patterns.observer.ISubject;

import java.util.ArrayList;
import java.util.List;

public class EventManager implements ISubject {

    public final List<IObserver> observers = new ArrayList<>();
    private Event lastEvent;

    @Override
    public void register(IObserver observer) {
        if (!validateObserver(observer)) {
            return;
        }

        IObserver registered = observers.stream()
                .filter(o -> o.getIdentifier() != null && o.getIdentifier().equals(observer))
                .findAny()
                .orElse(null);

        if (registered == null) {
            observers.add(observer);
            System.out.println(observer + " is registered.");
        } else {
            System.out.println(observer + " is already registered.");
        }
    }

    @Override
    public void unRegister(IObserver observer) {
        IObserver registered = observers.stream()
                .filter(o -> o.equals(observer))
                .findAny()
                .orElse(null);

        if (registered != null) {
            observers.remove(observer);
        } else {
            System.out.println(observer + " is not registered.");
        }
    }

    @Override
    public void notifies() {
        for (IObserver observer : observers) {
            observer.update(lastEvent);
        }
    }

    @Override
    public void postEvent(Event event) {
        lastEvent = event;
        notifies();
    }

    private boolean validateObserver(IObserver observer) {
        if (observer == null) {
            System.out.println("Observer is not valid.");
            return false;
        }

        if (observer.getIdentifier() == null) {
            System.out.println("Observer identifier is not valid.");
            return false;
        }

        return true;
    }
}
