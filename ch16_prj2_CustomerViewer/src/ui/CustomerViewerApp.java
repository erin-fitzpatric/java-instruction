package ui;

import business.Customer;
import business.NoSuchCustomerException;
import db.CustomerDB;
import util.Console;

public class CustomerViewerApp {

	public static void main(String[] args){
		System.out.println("Welcome to Customer Viewer App");
		
		String choice = "y";
		while (choice.equalsIgnoreCase("y")) {
			int custNbr = Console.getInt("\nEnter a customer number: ");				
		
			Customer c;
			try {
				c = CustomerDB.getCustomer(custNbr);
				System.out.println("\n" + c.getNameAndAddress());
			} catch (NoSuchCustomerException e) {
				System.out.println(e.getMessage());
			}		

			choice = Console.getString("\nDisplay another customer? (y/n): ");
		}
		System.out.println("Bye!");
	}

}
