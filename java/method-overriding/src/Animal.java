public class Animal {
  String species;

  public Animal(String species) {
    this.species = species;
  }

  public void move() {
    System.out.println(this.species + " " + "is running");
  }
}
