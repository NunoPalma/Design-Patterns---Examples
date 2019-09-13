public class Student extends Person {
	private Task _task;

	public Student(String name, Task task) {
		super(name);
		_task = task;
	}

	public void doTask() {
		System.out.print(this.getName() +  " working on ");
		 _task.doTask();
	}
}