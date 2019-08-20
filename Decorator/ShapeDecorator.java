public abstract class ShapeDecorator implements IShape {

	protected IShape _decoratedShape;

	public ShapeDecorator(IShape decoratedShape) {
		_decoratedShape = decoratedShape;
	}

	public void draw() {
		_decoratedShape.draw();
	}
}