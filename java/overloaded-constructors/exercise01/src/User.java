public class User {
  public String name;
  public String email;
  public int age;

  // Overloading constructors
  User() {
    this.name = "Peter";
    this.email = "peter@gmail.com";
    this.age = 25;
  }

  User(String name) {
    this.name = name;
  }

  User(String name, String email, int age) {
    this.name = name;
    this.email = email;
    this.age = age;
  }
}
