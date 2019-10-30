package ui;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

import bussiness.Contact;
import bussiness.TestContact;
import util.Console;

public class ContactManagerApp {
	// refer to pg. 703
	public static void main(String[] args) {
		System.out.println("Welcome to the Contact Manager App!");
		int command = 0;
		List<Contact> contacts = new ArrayList<>();
		contacts.add(new Contact("Mike Murach", null, "800-221-5528"));
		contacts.add(new Contact("Anne Boehm", null, null));
		contacts.add(new Contact("Joel Murach", "joel@murach.com", null));

		while (command != 99) {
			// display menu and get input
			command = Console.getInt(getMenu(), 0, 100);
			switch (command) {
			case 1:
				// TODO list contacts
				System.out.println("Contact list: ");
				for (Contact c : contacts) {
					System.out.println(c);
				}
				break;
			case 2:
				// TODO list contacts with no phone number
				System.out.println("Contacts with no phone number: ");
				List<Contact> contactsWithoutPhone = filterContactsWithoutPhoneNumbers(contacts);
				for (Contact c : contactsWithoutPhone) {
					System.out.println(c);
				}
				break;
			case 3:
				// TODO list contacts with no email address
				System.out.println("Contacts with no email address: ");
				List<Contact> contactsWithoutEmail = filterContactsWithoutEmail(contacts);
				for (Contact c : contactsWithoutEmail) {
					System.out.println(c);
				}
				break;
			case 4:
				// TODO Lambda: list contacts with no phone number
				System.out.println("Lambda: Contacts with no phone number: ");
				contactsWithoutPhone = filterContacts(contacts, c -> c.getPhone() == null);
				for (Contact c : contactsWithoutPhone) {
					System.out.println(c);
				}
				break;
			case 5:
				// TODO Lambda: list contacts with no email
				System.out.println("Lambda: Contacts with no email: ");
				contactsWithoutEmail = filterContacts(contacts, c -> c.getEmail() == null);
				for (Contact c : contactsWithoutEmail) {
					System.out.println(c);
				}
				break;
			case 6:
				// TODO Lambda: list contacts named mike murach
				System.out.println("Lambda: Contacts named Mike Murach: ");
				List<Contact> contactsMike = filterContacts(contacts, c -> c.getName().equalsIgnoreCase("Mike Murach"));
				for (Contact c : contactsMike) {
					System.out.println(c);
				}
				break;
			case 7:
				// TODO Lambda - Predicate: no phone
				System.out.println("Lambda: Predicate: No Phone ");
				contactsWithoutPhone = filterContacts2(contacts, c -> c.getPhone() == null);
				for (Contact c : contactsWithoutPhone) {
					System.out.println(c);
				}
				break;
			case 8:
				System.out.println("Lambda: Consumer: print names ");
				processContacts(contacts, c -> System.out.println(c.getName()));
				break;
			case 9:
				// Streams
				System.out.println("Streams - list names for each contact missing phone ");
				contacts.stream()
					.filter(c -> c.getPhone()==null)
					.forEach(c -> System.out.println(c.getName()));
				break;
			case 10:
				// Streams
				System.out.println("Map and reduce contacts to a single string");
				String csv = contacts.stream().map(c -> c.getName()).
												reduce("", (a,b) -> a + b + ", ");
				csv = csv.substring(0, csv.length() - 2);
				System.out.println("All contacts: "+csv);
				break;
			case 99:
				// TODO exit
				command = 99;
				break;
			default:
				System.out.println("Invalid command...try again!");
				break;
			}

		}
		System.out.println("Good bye!");
	}

	// list command menu
	private static String getMenu() {
		String menu = "COMMAND:\n" + "1 - List Contacts\n" + "2 - List Contacts With No Phone #\n"
				+ "3 - List Contacts With No Email Address\n" + "4 - Lambda: List Contacts With No Phone #\n"
				+ "5 - Lambda: List Contacts With No Email Address\n" + "6 - Lambda: List Contacts named Mike Murach\n"
				+ "7 - Lambda Predicate: No Phone Contacts\n" 
				+ "8 - Lambda Consumer: Print names\n" 
				+ "9 - Stream of Contact: names missing phone\n" 
				+ "10 - Map and reduce names to a single stream\n" 
				+ "99 - Exit\n"
				+ "Command: ";
		return menu;
	}

	// list contacts without phone numbers
	public static List<Contact> filterContactsWithoutPhoneNumbers(List<Contact> contacts) {
		List<Contact> contactsWithoutPhone = new ArrayList<>();
		for (Contact c : contacts) {
			if (c.getPhone() == null) {
				contactsWithoutPhone.add(c);
			}
		}
		return contactsWithoutPhone;
	}

	// list contacts without email address
	public static List<Contact> filterContactsWithoutEmail(List<Contact> contacts) {
		List<Contact> contactsWithoutEmail = new ArrayList<>();
		for (Contact c : contacts) {
			if (c.getEmail() == null) {
				contactsWithoutEmail.add(c);
			}
		}
		return contactsWithoutEmail;
	}

	// Make one method that can replace the above 2 methods using Lambdas
	public static List<Contact> filterContacts(List<Contact> contacts, TestContact condition) {
		List<Contact> filteredContacts = new ArrayList<>();
		for (Contact c : contacts) {
			if (condition.test(c)) {
				filteredContacts.add(c);
			}
		}
		return filteredContacts;
	}

	// Make one method that can replace the above 2 methods using Lambdas -
	// predicate
	public static List<Contact> filterContacts2(List<Contact> contacts, Predicate<Contact> condition) {
		List<Contact> filteredContacts = new ArrayList<>();
		for (Contact c : contacts) {
			if (condition.test(c)) {
				filteredContacts.add(c);
			}
		}
		return filteredContacts;
	}

	// The Consumer interface lambda
	public static void processContacts(List<Contact> contacts, Consumer<Contact> consumer) {
		for (Contact c : contacts) {
			consumer.accept(c);
		}
	}
}
