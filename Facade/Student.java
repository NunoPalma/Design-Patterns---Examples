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
    return String.format("Student name: " + getName() + " Id: " + getId());
  }

 //hashCode and equals methods must be overridden so that the HashSet in the School class indentifies two Students with the same _id as being the same Object
 @Override
 public int hashCode() {
  return _id;
 }
 
 @Override
 public boolean equals(Object obj) {
  if (this.getId() == ((Student)obj).getId())
    return true;

  return false;
 }
}