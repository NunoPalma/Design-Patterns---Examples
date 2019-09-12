public abstract class Vehicle {
	private Factory _factory;

	public Vehicle(Factory factory) {
		_factory = factory;
	}
	
	public abstract void build();
}