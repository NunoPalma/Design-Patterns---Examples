public class Test {
	public static void main(String args[]) {

		BasePizza pizza = new BasePizza();
		System.out.println("Cost: " + pizza.getCost());

		TunaPizzaDecorator tuna = new TunaPizzaDecorator(pizza);
		TunaPizzaDecorator extraTuna = new TunaPizzaDecorator(tuna);
		System.out.println("Cost: " + extraTuna.getCost());

		MushroomPizzaDecorator mushroom = new MushroomPizzaDecorator(extraTuna);
		System.out.println("Cost: " + mushroom.getCost());
	}
}