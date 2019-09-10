public class Test { 

	public static void main(String args[]) {
		Student s1 = new Student("Generic Student", 23);
		Student s2 = new Student("Generic Student", 23);
		Student s3 = new Student("Generic Student 1", 25);
		Course c1 = new Course("PO");
		Course c2 = new Course("SO");
		Course c3 = new Course("SO");
		SchoolManager school = new SchoolManager();

		school.addStudent(s1);
		school.addStudent(s2);
		school.addStudent(s3);
		school.displayStudentsInfo();

		school.addCourse(c1);
		school.addCourse(c2);
		school.displayCoursesInfo();

		school.addCourse(c3);
	}
}