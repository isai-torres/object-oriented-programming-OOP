import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Computer computer1 = new Computer();
        Computer computer2 = new Computer();
        Computer computer3 = new Computer();

        computer1.askSpecs(scanner);
        System.out.println();
        computer1.displaySpecs();

        System.out.println();

        computer2.askSpecs(scanner);
        System.out.println();
        computer2.displaySpecs();

        System.out.println();

        computer3.askSpecs(scanner);
        System.out.println();
        computer3.displaySpecs();

        scanner.close(); // Always remember to close the scanner
    }
}
