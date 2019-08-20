public class Test {

	public static void main(String args[]) {

		Singleton _singleton = Singleton.getInstance();
		_singleton.displayInfo();

		//Singleton _newSingleton = new Singleton();  The constructor is private so it can't be instantiated
	}
}