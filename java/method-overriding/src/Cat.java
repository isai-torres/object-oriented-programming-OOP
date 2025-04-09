public class Cat extends Animal{
  public Cat(String species) {
    super(species);
  }

  @Override // Override annotation is optional but recommended, It helps to indicate that this method is intended to override a method in the superclass
  public void move() { // The same method name
    System.out.println("The" + " " + this.species + " " + "is jumping"); // Here we override the method by changing running to jumping
  }
}
