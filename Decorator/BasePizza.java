public class BasePizza implements PizzaComponent {
	private int _cost;

	public BasePizza() {
		_cost = 6;
	}

	public int getCost() {
		return  _cost;
	}
}