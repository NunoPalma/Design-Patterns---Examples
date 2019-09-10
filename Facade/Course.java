public class Course {
	private String _name;

	public Course(String name) {
		_name = name;
	}

	public String getName() {
		return _name;
	}

	@Override
	public String toString() {
		return String.format("Course name: " + getName());
	}

	@Override
	public int hashCode() {
		return 1;
	}

	@Override
 	public boolean equals(Object obj) {
  		if (this.getName().compareTo(((Course)obj).getName()) == 0)
    			return true;

  		return false;
 	}
}