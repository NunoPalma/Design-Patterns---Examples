abstract class Person {
	private String _name;
	private Task _task;

	public Person(String name, Task task) {
		_name = name;
		_task = task;
	}

	public String getName() {
		return _name;
	}

	public Task getTask() {
		return _task;
	}

	abstract public void doTask();
}