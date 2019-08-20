public class BlueShapeDecorator extends ShapeDecorator {

	public BlueShapeDecorator(IShape _decoratedShape) {
		super(_decoratedShape);
	}

	@Override
	public void draw() {
		setRedBorder(_decoratedShape);
		_decoratedShape.draw();
	}

	private void setRedBorder(IShape _decoratedShape) {
		System.out.println("Border Color: Blue");
	}
}