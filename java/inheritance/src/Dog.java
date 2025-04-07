public class Dog extends Animal{ // Extends keyword is used to inherit from another class
  public Dog(String name, int age) {
    this.name = name;
    this.age = age;
  }

  public void dogSound() {
    System.out.println(this.name + " is barking woof woof!");
  }
}
