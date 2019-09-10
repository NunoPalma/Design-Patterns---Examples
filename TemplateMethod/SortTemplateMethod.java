import java.util.ArrayList;

public abstract class SortTemplateMethod {

	public abstract boolean isFirst(Student s1, Student s2);

	public ArrayList<Student> sort(ArrayList<Student> toSortList) {
		int size = toSortList.size();

		for (int i = 0; i < size; i++)
			for (int j = 0; j < size; j++)
				if (!isFirst(toSortList.get(i), toSortList.get(j))) {
					Student tmp = toSortList.get(j);
					toSortList.set(j, toSortList.get(i));
					toSortList.set(i, tmp);
				}	
		return toSortList;
	}
}