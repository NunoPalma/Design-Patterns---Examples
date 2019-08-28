public class Student extends Person implements Element {
	private int _id;
	
	public Student(String name, int age, int id) {
		super(name, age);
		_id = id;
	}

	public int getId() {
		return _id;
	}

	public void accept(InformationVisitor visitor) {
		visitor.visitStudent(this);
	}
}