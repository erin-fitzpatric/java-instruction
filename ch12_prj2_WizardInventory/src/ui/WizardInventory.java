package ui;

import java.util.ArrayList;

import util.Console;

public class WizardInventory {

	public static void main(String[] args) {
		System.out.println("The Wizard Inventory Game\n");

		// create item array
		ArrayList<String> items = new ArrayList<>(4); // TODO add numbers

		items.add("Wooden Staff");
		items.add("Wizard Hat");
		items.add("Cloth Shoes");

		// print command menu
		System.out.println("COMMAND MENU");
		System.out.println("show - Show all items\r\n" + "grab - Grab an item\r\n" + "edit - Edit an item\r\n"
				+ "drop - Drop an item\r\n" + "exit - Exit program");

		
		String choice = "";
		while (!choice.equalsIgnoreCase("exit")) {
			choice = Console.getString("\nCommand: "); // prompt for input
			if (choice.equalsIgnoreCase("show")) { // show method
				showItems(items);
			} else if (choice.equalsIgnoreCase("grab")) { // grab method
				grabItems(items);
			} else if (choice.equalsIgnoreCase("edit")) { // edit method
				editItems(items);
			} else if (choice.equalsIgnoreCase("drop")) { // drop method
				dropItems(items);
			} else if (choice.equalsIgnoreCase("exit")) { // clear method
				clearItems(items);
			} else {
				System.out.println("Invalid entry! Select command from COMMAND MENU.");
			}
		}
		System.out.println("Good bye!");
	}

	// Show method
	private static void showItems(ArrayList<String> items) {
		String show = "";
		for(int i = 0; i<items.size(); i++) {
			show += (i+1) + ". " + items.get(i) + "\n";
		}
		System.out.println(show);
//		for (String item : items) {
//			System.out.println(item);
//		}
	}

	// TODO grab method
	private static void grabItems(ArrayList<String> items) {
		int size = items.size();
		if (size < 4) {
			String grabItem = Console.getString("Name of item: ");
			items.add(grabItem);
			System.out.println(grabItem + " was added to your inventory.");
		} else {
			System.out.println("You can't carry any more items. Drop something first.");
		}
	}

// TODO edit method
	private static void editItems(ArrayList<String> items) {
		int number = Console.getInt("Number: ", 0, (items.size() + 1));
		String updatedName = Console.getString("Updated name: ");
		String edittedItem = items.set((number - 1), updatedName);
		System.out.println("Item number " + number + " was updated.");
	}

// TODO drop method
	private static void dropItems(ArrayList<String> items) {
		int number = Console.getInt("Number: ", -1, (items.size() + 1));
		String droppedItem = items.remove(number - 1);
		System.out.println(droppedItem + " was dropped.");
	}

// TODO clear method
	private static void clearItems(ArrayList<String> items) {
		items.clear();
	}
}