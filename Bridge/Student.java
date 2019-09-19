public class Student extends Person {

	public Student(String name, Task task) {
		super(name, task);
	}

	public void doTask() {
		System.out.print(this.getName() +  " working on ");
		 this.getTask().doTask();
	}
}