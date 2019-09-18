public class PeopleFactory implements BasePeopleFactory {

	public Person createPerson(String identifier, String name)  {
		switch (identifier) {
			case "Student":
				return new Student(name);
			case "Teacher":
				return new Teacher(name);
			default:
				return null;
		}
	}
}