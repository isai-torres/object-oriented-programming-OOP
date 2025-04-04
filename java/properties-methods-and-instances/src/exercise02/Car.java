public class Car {
  // This are the attributes of the class
  public String brand = "Toyota";
  public String model = "Corolla";
  public int year = 2020;
  public boolean isRunning = false;

  // Methods
  public void start() {
    this.isRunning = true;
    System.out.println("The car is starting");
    System.out.println("Is the car running? " + this.isRunning);
  }

  public void stop() {
    this.isRunning = false;
    System.out.println("The car is off");
    System.out.println("Is the car running? " + this.isRunning);
  }
}
