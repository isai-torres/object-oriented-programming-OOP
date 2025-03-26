import java.util.Scanner;

public class Computer {
  // Attributes
  public String gpu;
  public String cpu;
  public String ram;
  public String storage;
  public double price;

  // Method to ask the user to enter the computer's specifications
  public void askSpecs(Scanner scanner) { // Accept Scanner as a parameter

    System.out.println("Enter the GPU: ");
    this.gpu = scanner.nextLine();

    System.out.println("Enter the CPU: ");
    this.cpu = scanner.nextLine();

    System.out.println("Enter your computer RAM: ");
    this.ram = scanner.nextLine();

    System.out.println("Enter your computer storage: ");
    this.storage = scanner.nextLine();

    System.out.println("Enter the price: ");
    this.price = scanner.nextDouble();
    scanner.nextLine(); // Consume the newline character  
  }

  // Method to display the computer's specifications
  public void displaySpecs() {
    System.out.println("Computer Specifications: ");
    System.out.println("GPU: " + this.gpu);
    System.out.println("CPU: " + this.cpu);
    System.out.println("RAM: " + this.ram);
    System.out.println("Storage: " + this.storage);
    System.out.println("Price: " + this.price);
  }

}
