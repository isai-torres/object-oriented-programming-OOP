public class User {
  public String name;
  public String email;
  public int age;

  // Overloading constructors
  public User() {
    this.name = "Peter";
    this.email = "peter@gmail.com";
    this.age = 25;
  }

  public User(String name) {
    this.name = name;
  }

  public User(String name, String email, int age) {
    this.name = name;
    this.email = email;
    this.age = age;
  }
}
