public abstract class PizzaDecorator implements PizzaComponent {
	protected PizzaComponent _pizza;
	private int _cost;

	public PizzaDecorator(PizzaComponent pizza) {
		_pizza = pizza;
	}

	public int getCost() {
		return _cost;
	}
}