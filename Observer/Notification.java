import java.util.ArrayList;

public class Notification implements Subject {
	private ArrayList<Observer> _observers;
	private String _message;

	public Notification() {
		_observers = new ArrayList<Observer>();
	}

	public void register(Observer observer) {
		_observers.add(observer);
	}

	public void unregister(Observer observer) {
		_observers.remove(observer);
	}

	public void notifyObserver() {
		for (Observer observer: _observers)
			observer.update(_message);
	}

	public void addNotification(String notification) {
		_message = notification;
		notifyObserver();
	}

}