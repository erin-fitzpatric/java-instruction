package ch08_prj2_PersonManager2;

public class PersonManagerApp2 {

	public static void main(String[] args) {
		System.out.println("Welcome to the person manager app!");
		String choice = "y";

		while (choice.equalsIgnoreCase("y")) {
			String type = Console2.getString("Create customer or employee? (c/e) ");

			String firstName = Console2.getString("First Name: ");
			String lastName = Console2.getString("Last Name: ");

			Person2 p = null;
			if (type.equalsIgnoreCase("c")) {
				String customerNumber = Console2.getString("Customer Number: ");
				Customer2 c = new Customer2(firstName, lastName, customerNumber);
				p = c;
			} else if (type.equalsIgnoreCase("e")) {
				String ssn = Console2.getString("SSN: ");
				Employee2 e = new Employee2(firstName, lastName, ssn);
				p = e;
			} else {
				System.out.println("Invalid type.");
			}

			System.out.println("You entered a new " + p.getClass().getSimpleName());
			System.out.println(p);

			choice = Console2.getString("Continue?(y/n): ");
		}

		System.out.println("Goodbye!");
	}

}
