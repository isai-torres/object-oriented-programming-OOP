public class Car {
  // Attributes
  public String make;
  public String model;
  public String color;

  // Constructor
  Car(String make, String model, String color) {
    this.make = make;
    this.model = model;
    this.color = color;
  }

  // Method to display car details
  public void Drive() {
    System.out.println("You are driving a " + this.color + " " + this.make + " " + this.model);
  }
}
