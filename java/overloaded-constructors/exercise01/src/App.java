/* Overloaded Constructors = Allow a class to have multiple constructors
                             with different parameter lists.
                             Enable objects to be initialized in varios ways.
*/

// Remember you can set more constructors but they must have different set of parameters.

public class App {
	public static void main(String[] args) {

		User user1 = new User();

		System.out.println(user1.name);
		System.out.println(user1.email);
		System.out.println(user1.age);

		System.out.println("---------------------");

		User user2 = new User("Mr.Crabs");

		System.out.println(user2.name);

		System.out.println("---------------------");

		User user3 = new User("SpongeBob", "Sponge@gmail.com", 27);

		System.out.println(user3.name);
		System.out.println(user3.email);
		System.out.println(user3.age);
	}
}

// Remember:
// Python and JavaScript does not support constructor overloading in the same way Java does.
// However, you can simulate it using techniques like default parameters.