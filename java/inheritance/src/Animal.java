public class Animal {
  boolean isAlive;
  String name;
  int age;

  // Constructor
  public Animal(String name, int age) {
    this.name = name;
    this.age = age;
    isAlive= true;
  }

  public void eat() {
    System.out.println("The animal is eating");
  }

  public void animalInfo() {
    System.out.println("Name: " + this.name);
    System.out.println("Age: " + this.age);
    System.out.println("Is this animal alive: " + this.isAlive);
  }
}
