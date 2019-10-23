package ui;

import business.User;
import java.util.ArrayList;
import java.util.List;
import util.Console;

public class PrsConsoleApp {

	public static void main(String[] args) {
		System.out.println("Welcome to the PRS Console App!");

		User u1 = new User(1, "PrincessLeia", "maytheforcebewithyou", "Leia", "Organa", "512-566-3578",
				"princess@gmail.com", false, false);
		User u2 = new User(2, "KyloRen", "thedarkside", "Kylo", "Ren", "829-675-3467", "kylo@gmail.com", true, false);
		User u3 = new User(3, "LukeSkywalker", "runlukerun", "Luke", "Skywalker", "329-897-1123", "luke@gmail.com",
				false, false);
		User u4 = new User(4, "DarthVader", "youhavefailedme", "Darth", "Vader", "111-111-2456", "vader@gmail.com",
				false, true);
		User u5 = new User(5, "HanSolo", "nevertellmetheodds", "Han", "Solo", "123-456-7899", "solo@gmail.com", false,
				false);

		List<User> users = new ArrayList<>();
		users.add(u1);
		users.add(u2);
		users.add(u3);
		users.add(u4);
		users.add(u5);
		
		String choice = "";
		while (!choice.equalsIgnoreCase("exit")) {
			getCommandMenu(); // lists commands
			choice = Console.getString("\nEnter a Command: "); //prompts user
			if (choice.equalsIgnoreCase("list") || choice.equalsIgnoreCase("1")) {
				listUsers(users); 		// list function
			} else if (choice.equalsIgnoreCase("get")|| choice.equalsIgnoreCase("2")) {
				getUser(users);			// get a user
			} else if (choice.equalsIgnoreCase("add")|| choice.equalsIgnoreCase("3")) {
				addUser(users);			// add a user
			} else if (choice.equalsIgnoreCase("edit")|| choice.equalsIgnoreCase("4")) {
				editUser(users);		// edit a user
			} else if (choice.equalsIgnoreCase("delete")|| choice.equalsIgnoreCase("5")) {
				deleteUser(users);		// delete a user
			} else if (choice.equalsIgnoreCase("exit")|| choice.equalsIgnoreCase("6")) { 
				break;
			} else {
				System.out.println("Invalid entry! Select command name from COMMAND MENU.");
			}
		}
		System.out.println("\nBye!");
	}
	// display menu 
		private static String getCommandMenu() {
			String menu = "";
			System.out.println("\nCOMMAND MENU\r" + "==================");
			System.out.println("#   Name");
			System.out.println("1 - List Users");
			System.out.println("2 - Get a User");
			System.out.println("3 - Add a User");
			System.out.println("4 - Edit a User");
			System.out.println("5 - Delete a User");
			System.out.println("6 - Exit");
			System.out.println("==================");
			return menu;
		}    

	// list method
	private static void listUsers(List<User> users) {
		String show = "";
		for (int i = 0; i < users.size(); i++) {
			show += (i + 1) + ". " + users.get(i) + "\n";
		}
		System.out.println(show);
	}

	// get user method
	private static void getUser(List<User> users) {
		String getUser = Console.getString("Enter username you would like to get: ");
		for (User u : users) {
			if (u.getUserName().equalsIgnoreCase(getUser)) {
				System.out.println(u);
			}
		}
		System.out.println();
	}

	// add user method TODO
	private static void addUser(List<User> users) {
		int id = (users.size())+1;
		String userName = Console.getString("New Username: ");
		String password = Console.getString("New Password: ");
		String firstName = Console.getString("Enter First Name: ");
		String lastName = Console.getString("Enter Last Name: ");
		String phone = Console.getString("Enter Phone Number (xxx-xxx-xxxx): ");
		String email = Console.getString("Enter Email: ");
		Boolean isReviewer = false;
		Boolean isAdmin = false;
		
		User newUser = new User (id, userName, password, firstName, lastName, phone, email, isReviewer, isAdmin);
		users.add(newUser);
	}
	
	// edit user method 
	private static void editUser(List<User> users) {
		int number = Console.getInt("Number you would like to edit: ", 0, (users.size() + 1));
		String email = "";
		for (User u : users) {
			if (u.getId() == number) {
				email = Console.getString("New email address: ");
				u.setEmail(email);
			}
		}
		System.out.println("User number " + number + " was editted.");
	}

	// delete user method TODO
	private static void deleteUser(List<User> users) {
		int number = Console.getInt("User number you would like to delete (#): ", 0, (users.size() + 1));
		for (int i = 0; i < users.size(); i++) {
			if (i == (number-1)) {
				users.remove(i);
			}
		}
		System.out.println("User number " + number + " was deleted!");
	}
}
