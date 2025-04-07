public class Animal {
  boolean isAlive;
  String name;
  int age;

  public Animal() {
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
