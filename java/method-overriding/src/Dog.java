public class Dog extends Animal{
  public Dog(String species) {
    super(species);
  }
  
  public void move() {
    System.out.println("The" + " " + this.species + " " + "is running");
  }
}
