public class InformationVisitor implements Visitor {

	public void visitStudent(Student student) {
		System.out.println("Student -> " + student.toString() + " id: " + student.getId());
	}

	public void visitTeacher(Teacher teacher) {
		System.out.println("Teacher -> " + teacher.toString() + " subject: " + teacher.getSubject());
	}
}