public class NumberChecker {

	public static void main(String[] args) {
		System.out.println("Welcome to the Odd/Even Checker!\n");
		String choice = "y";

		MyConsole c = new MyConsole();

		while (choice.equalsIgnoreCase("y")) {

			//TODO validate data with console
			int number = c.getInt("Enter an integer:  ");
			
			//TODO determine even or odd by using modulus 
			if ((number % 2) == 0) {
				System.out.println("The number " + number + " is even.");
			} else {
				System.out.println("The number " + number + " is odd.");
			}
			
			choice = c.getString("Continue? (y/n) ");
		}
		System.out.println("Good bye!");
	}
}
