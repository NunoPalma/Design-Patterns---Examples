public class Student {
    private String _name;
    private int _id;
  
    public Student(String name, int id) {
      _name = name;
      _id = id;
    }

    public String getName() {
      return _name;
    }

    public int getId() {
      return _id;
    }

    @Override
    public String toString() {
      return String.format("Name: " + getName() + " Id: " + getId() + "\n");
    }
}