public class Cat extends Animal { // Extends keyword is used to inherit from another class
  public Cat(String name, int age) {
    super(name, age);
  }

  public void catSound() {
    System.out.println(this.name + " is meowing meow meow!");
  }
}
