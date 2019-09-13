public class Test {

	public static void main(String args[]) {
		Person student = new Student("Generic Student", (Task) new Project());
		Person student1 = new Student("Generic Student 1", (Task) new Exam());

		student.doTask();
		student1.doTask();
	}
}