package ch08_prj2_PersonManager;

public class PersonManagerApp {

	public static void main(String[] args) {
		System.out.println("Welcome to the Person Manager");

		String choice = "y";

		while (choice.equalsIgnoreCase("y")) {
			String input = Console.getString("Create customer or employee? (c/e):");
			
			String first = Console.getString("First Name: ");
			String last = Console.getString("Last Name: ");
			
			if (input.equalsIgnoreCase("c")) {
				String customerNumber = Console.getString("Customer number: ");
				Customer customer = new Customer(first, last, customerNumber);
				System.out.println(customer.toString());

			} else if (input.equalsIgnoreCase("e")) {
				String social = Console.getString("Social SS#: ");
				Employee employee = new Employee(first, last, social);
				System.out.println(employee.toString());
			}    
			// continue? 
			choice = Console.getString("Continue? (y/n) ");
		}
		System.out.println("Good bye!");
	}	
}
