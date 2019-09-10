import java.util.HashSet;

public class School {
	private HashSet<Student> _students;
	private HashSet<Course> _courses;

	public School() {
		_students = new HashSet<Student>();
		_courses = new HashSet<Course>();
	}

	public void addStudent(Student student) {
		if(!_students.add(student))
			System.out.println("Error: \"" + student.toString() + "\" has already been added." + "\n");
	}

	public HashSet<Student> getAllStudents() {
		return _students;
	}

	public void addCourse(Course course) {
		if(!_courses.add(course))
			System.out.println("Error: \"" + course.toString() + "\" has already been added.");
	}
	public HashSet<Course> getAllCourses() {
		return _courses;
	}
}