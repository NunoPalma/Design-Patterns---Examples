import java.util.HashSet;

public class SchoolManager {

	private School _school;

	public SchoolManager() {
		_school = new School();
	}

	public void addStudent(Student student) {
		_school.addStudent(student);
	}

	public void displayStudentsInfo() {
		HashSet<Student> students = _school.getAllStudents();

		for (Student s: students)
			System.out.println(s.toString());
	}

	public void addCourse(Course course) {
		_school.addCourse(course);
	}

	public void displayCoursesInfo() {
		HashSet<Course> courses = _school.getAllCourses();

		for (Course c: courses)
			System.out.println(c.toString());
	}
}