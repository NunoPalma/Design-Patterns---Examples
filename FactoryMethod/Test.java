public class Test {

	public static void main(String args[]) {
		PeopleFactory newFactory = new PeopleFactory();

		Person student = newFactory.createPerson("Student", "Generic Name");
		System.out.println(student.getName());
		Person teacher = newFactory.createPerson("Teacher", "Generic Name 1");
		System.out.println(teacher.getName());
	}
}