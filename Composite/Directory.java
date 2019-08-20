import java.util.ArrayList;

public class Directory implements AbstractFile {
	private String _name;
	private ArrayList _files;

	public Directory(String name) {
		_name = name;
		_files = new ArrayList();
	}

	public void add(Object obj) {
		_files.add(obj);
	}

	public void displayInfo() {
		System.out.println("The directoy's name is: " + _name);

		for (Object obj : _files) {
			AbstractFile file = (AbstractFile) obj; //check this
			file.displayInfo();
		}
	}
}