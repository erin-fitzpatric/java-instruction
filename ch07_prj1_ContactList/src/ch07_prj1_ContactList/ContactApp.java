package ch07_prj1_ContactList;

import java.util.Scanner;

public class ContactApp {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String choice = "y";
		while (choice.equalsIgnoreCase("y")) {
			
			System.out.println("Welcome to the Contact List application\n");

			System.out.print("Enter first name: ");
			String firstName = sc.next();

			System.out.print("Enter last name: ");
			String lastName = sc.next();

			System.out.print("Enter email: ");
			String email = sc.next();

			System.out.print("Enter phone: ");
			String phone = sc.next();

			Contact c = new Contact(firstName, lastName, email, phone);
			
			System.out.println("\n--------------------------------------------");
			System.out.println("---- Current Contact -----------------------");
			System.out.println("-------------------------------------------- ");

			c.displayContact();
			c.getFirstName();
			
			System.out.println("--------------------------------------------\n");


			System.out.println("Continue? (y/n): ");
			choice = sc.next();
		}
		System.out.println("Goodbye!");
		sc.close();
	}
}
