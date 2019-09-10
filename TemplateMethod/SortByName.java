public class SortByName extends SortTemplateMethod {

	@Override
	public boolean isFirst(Student s1, Student s2) {
		return s1.getName().compareTo(s2.getName()) > 0;
	}
}