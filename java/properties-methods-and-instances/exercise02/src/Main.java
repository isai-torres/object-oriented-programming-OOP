public class Main {
    public static void main(String[] args) {
        Car car1 = new Car();

        System.out.println("Brand: " + car1.brand);
        System.out.println("Model: " + car1.model);
        System.out.println("Year: " + car1.year);

        System.out.println();

        car1.start();

        System.out.println();

        car1.stop();
    }
}
