import java.util.ArrayList;

public class Student implements Observer {
	private ArrayList<String> _messages;
	private String _name;
	
	public Student(String name, Observable observerable) {
		_name = name;
		_messages = new ArrayList<String>();
	}

	public String getName() {
		return _name;
	}

	public void displayMessages() {
		System.out.println(getName() + " has " + _messages.size() + " messages.");
		for (String message: _messages)
			System.out.println(message);
		System.out.println("");
	}

	public void update(String message) {
		_messages.add(message);
	}
}