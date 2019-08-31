import java.util.ArrayList;

public class Directory implements AbstractFile {
	private String _name;
	private ArrayList<AbstractFile> _files;

	public Directory(String name) {
		_name = name;
		_files = new ArrayList<AbstractFile>();
	}

	public void add(AbstractFile file) {
		_files.add(file);
	}

	public void displayInfo() {
		System.out.println("\n\nThe directoy's name is: " + _name);

		for (AbstractFile file : _files)
			file.displayInfo();		
	}
}