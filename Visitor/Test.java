public class Test {

	public static void main(String args[]) {
		InformationVisitor visitor = new InformationVisitor();
		Student student = new Student("John", 21, 999);
		Teacher teacher = new Teacher("Josef", 37, "PO");

		student.accept(visitor);
		teacher.accept(visitor);
	}
}