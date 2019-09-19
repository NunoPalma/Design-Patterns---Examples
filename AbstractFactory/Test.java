public class Test {

	public static void main(String args[]) {
		AbstractFactory computerFactory = new ComputerFactory();

		System.out.println(computerFactory.getProcessor().displayInformation());
		System.out.println(computerFactory.getDisk().displayInformation());

	}
}