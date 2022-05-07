package tr.unvercanunlu.patterns.observer;

import tr.unvercanunlu.patterns.observer.impl.Event;

public interface ISubject {

	void register(IObserver observer);

	void unRegister(IObserver observer);

	void notifies();

	void postEvent(Event event);
}
