public class Singleton {

	private static Singleton  _singleInstance;

	private Singleton() {}

	public static Singleton getInstance() {
		if (_singleInstance == null)
			_singleInstance = new Singleton();
		return _singleInstance;
	}

	public void displayInfo() {
		System.out.println("Single instance of the class.");
	}
}