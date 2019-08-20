public class Singleton {

	private static Singleton  _singleInstance = new Singleton();

	private Singleton() {}

	public static Singleton getInstance() {
		return _singleInstance;
	}

	public void displayInfo() {
		System.out.println("Single instance of the class.");
	}
}