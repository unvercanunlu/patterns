package tr.unvercanunlu.patterns.observer.impl;

import tr.unvercanunlu.patterns.observer.IObserver;

public class EventListener implements IObserver {

    private final String name;

    public EventListener(String name) {
        this.name = name;
    }

    @Override
    public void update(Event event) {
        System.out.println(event + " is got by " + name + ".");
    }

    @Override
    public String getIdentifier() {
        return name;
    }

    @Override
    public String toString() {
        return "EventListener{name='" + name + "'" + '}';
    }
}
