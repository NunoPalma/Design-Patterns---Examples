public class Teacher extends Person implements Element {
	private String _subject;

	public Teacher(String name, int age, String subject) {
		super(name, age);
		_subject = subject;
	}

	public String getSubject() {
		return _subject;
	}

	public void accept(Visitor visitor) {
		visitor.visitTeacher(this);
	}
}