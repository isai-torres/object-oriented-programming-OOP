public class Main {
    public static void main(String[] args) throws Exception {
        // Instantiate the classes
        Cat simba = new Cat("Cat");
        Dog balto = new Dog("Dog");
        Fish nemo = new Fish("Fish");

        // Call the move method on each object
        nemo.move();
        balto.move();
        simba.move();
    }
}
