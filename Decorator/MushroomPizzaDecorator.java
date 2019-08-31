public class MushroomPizzaDecorator extends PizzaDecorator {

	public MushroomPizzaDecorator(PizzaComponent pizza) {
		super(pizza);
	}

	@Override
	public int getCost() {
		return _pizza.getCost() + 1;
	}
}