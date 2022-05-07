package tr.unvercanunlu.patterns.observer.impl;

public class Event {

	public EventType type;
	public String data;

	@Override
	public String toString() {
		return "Event{" +
				"type=" + type + ", " +
				"data='" + data + "'" +
				'}';
	}
}
