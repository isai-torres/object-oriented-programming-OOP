public class App {
    public static void main(String[] args) {
        Car car1 = new Car("Toyota", "Corolla", "Red");
        Car car2 = new Car("Ford", "Mustang", "Blue");
        Car car3 = new Car("Porche", "Cayman", "Green");

        Car cars[] = {car1, car2, car3};

        // Create for loop to iterate through the array of cars
        for (int i = 0; i < cars.length; i++) {
            cars[i].drive();
        }
    }
}
