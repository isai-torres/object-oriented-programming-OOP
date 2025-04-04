public class Student {
  // Attributes
  String name;
  int years;
  double gpa;

  // Constructor method that initializes the object's fields with the given arguments.
  public Student(String name, int years, double gpa) {
    this.name = name;
    this.years = years;
    this.gpa = gpa;
  }

  // Method to show student information.
  public void showInfo() {
    System.out.println("Name: " + this.name);
    System.out.println("Years: " + this.years);
    System.out.println("Student gpa: " + this.gpa);
  }
}
