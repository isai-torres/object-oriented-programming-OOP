public class Main {
    public static void main(String[] args)  {
        Dog capitan = new Dog("Capitan", 7);
        Cat boots = new Cat("Boots", 5);
        
        // Show dog information
        capitan.animalInfo();
        capitan.dogSound();
        capitan.eat();

        System.out.println(); // Add a new line

        // Show cat information
        boots.animalInfo();
        boots.catSound();
        boots.eat();

    }
}

/* Inheritance = One class inherits the attributes and methods
                 from another class.
                 child <- parent
*/