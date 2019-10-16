package ch07_prj1_ContactList2;

public class ContactList2App {

	public static void main(String[] args) {
		System.out.println("Welcome to the Contact App!!!!");

		String choice = "y";
		while (choice.equalsIgnoreCase("y")) {

			String fName = Console.getString("Enter first name:  ");
			String lName = Console.getString("Enter last name:   ");
			String email = Console.getString("Enter email:       ");
			String phone = Console.getString("Enter phone:       ");

			// create instance of ContactList2
			ContactList2 c = new ContactList2(fName, lName, email, phone);

			// display the contact
			System.out.println(c.displayContact());

			choice = Console.getString("Continue? (y/n) ");
		}
		System.out.println("Good bye!");
	}

}
