public class Test {

	public static void main(String args[]) {

		IShape _circle = new Circle();
		IShape _triangle = new Triangle();

		IShape _blueCircle = new BlueShapeDecorator(new Circle());
		IShape _redTriangle = new RedShapeDecorator(new Triangle());

		_circle.draw();
		_triangle.draw();
		_blueCircle.draw();
		_redTriangle.draw();
	}
}