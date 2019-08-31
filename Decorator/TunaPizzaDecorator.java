public class TunaPizzaDecorator extends PizzaDecorator {
	
	public TunaPizzaDecorator(PizzaComponent pizza) {
		super(pizza);
	}

	@Override
	public int getCost() {
		return _pizza.getCost() + 1;
	}
}