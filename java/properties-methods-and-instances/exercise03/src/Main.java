public class Main {
    public static void main(String[] args) {
        // Create two Student objects or instances of the Student class.
        Student student1 = new Student("SpongeBob", 30, 3.40);
        Student student2 = new Student("Patric", 27, 1.20);

        // Use methods to show student information.
        student1.showInfo();
        System.out.println();
        student2.showInfo();
    }
}
