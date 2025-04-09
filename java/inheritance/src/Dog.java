public class Dog extends Animal{ // Extends keyword is used to inherit from another class

  public Dog(String name, int age) {
    super(name, age);
  }

  public void dogSound() {
    System.out.println(this.name + " is barking woof woof!");
  }
}
// super = Refers to the parent class
//         Used in constructors and methods overriding
//         Calls the parent constructor to initialize attributes