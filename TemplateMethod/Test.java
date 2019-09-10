import java.util.ArrayList;

public class Test { 

	public static void main(String args[]) {
		ArrayList<Student> students = new ArrayList<Student>();
		Student s1 = new Student("Z", 23);
		Student s2 = new Student("A", 22);
		Student s3 = new Student("B", 77);
		Student s4 = new Student("F", 13);

		students.add(s1);
		students.add(s2);
		students.add(s3);
		students.add(s4);

		SortById sortById = new SortById();
		SortByName sortByName = new SortByName();

		System.out.println("Sorting by id");
		sortById.sort(students);
		displayInfo(students);

		System.out.println("Sorting by name");
		sortByName.sort(students);
		displayInfo(students);
	}

	public static void displayInfo(ArrayList<Student> students) {
		int size = students.size();

		for (int i = 0; i < size; i++)
			System.out.println(students.get(i).toString());
	}
}