public class SortById extends SortTemplateMethod {

	@Override
	public boolean isFirst(Student s1, Student s2) {
		return s1.getId() > s2.getId();
	}
}