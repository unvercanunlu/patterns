package tr.unvercanunlu.patterns.observer.impl;

import tr.unvercanunlu.patterns.observer.Observer;
import tr.unvercanunlu.patterns.observer.Subject;

import java.util.ArrayList;
import java.util.List;

public class EventManager implements Subject {

    private Event lastEvent;

    public List<Observer> observerList = new ArrayList<>();

    @Override
    public void register(Observer observer) {
        if (!validateObserver(observer)) {
            return;
        }

        Observer registered = observerList.stream()
                .filter(o -> o.getIdentifier() != null && o.getIdentifier().equals(observer))
                .findAny()
                .orElse(null);

        if (registered == null) {
            observerList.add(observer);
            System.out.println(observer + " is registered.");
        } else {
            System.out.println(observer + " is already registered.");
        }
    }

    @Override
    public void unRegister(Observer observer) {
        Observer registered = observerList.stream()
                .filter(o -> o.equals(observer))
                .findAny()
                .orElse(null);

        if (registered != null) {
            observerList.remove(observer);
        } else {
            System.out.println(observer + " is not registered.");
        }
    }

    @Override
    public void notifies() {
        for (Observer observer : observerList) {
            observer.update(lastEvent);
        }
    }

    @Override
    public void postEvent(Event event) {
        lastEvent = event;
        notifies();
    }

    boolean validateObserver(Observer observer) {
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
