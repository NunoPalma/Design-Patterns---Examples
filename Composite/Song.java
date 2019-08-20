public class Song implements AbstractFile {
	private String _name;

	public Song(String name) {
		_name = name;
	}

	public void displayInfo() {
		System.out.println("The song name is: " + _name);
	}
}