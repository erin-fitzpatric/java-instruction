package ui;

import java.util.List;

import business.Stuffy;
import db.StuffyDB;
import util.Console;

public class StuffyDispenserApp {
	private static StuffyDB sdb = new StuffyDB();

	public static void main(String[] args) {
		System.out.println("Welcome to the Stuffy Dispenser App!");

		int command = 0;
		while (command != 6) {
			command = Console.getInt(getMenu(), 0, 7);
			Stuffy s;
			switch (command) {
			case 1:
				// List 
				List<Stuffy> sdbList = sdb.list();
				System.out.println(sdbList);
				break;
			case 2:
				// Get  
				int id1 = Console.getInt("ID: ");
				getStuffy(id1);
				break;
			case 3:
				// Add - prompt user for stuffy values 
				String type = Console.getString("Type: ");
				String color = Console.getString("Color: ");
				String size = Console.getString("Size: ");
				int limbs =Console.getInt("Limbs: "); 
				s = new Stuffy(type, color, size, limbs);
				int rowCount = sdb.add(s);
				System.out.println(rowCount+ " rows affected.");
				break;
			case 4:
				int id = Console.getInt("Enter Stuffy ID to Edit: ");
				String type1 = Console.getString("Type: ");
				String color1 = Console.getString("Color: ");
				String size1 = Console.getString("Size: ");
				int limbs1 =Console.getInt("Limbs: "); 
				s = new Stuffy(type1, color1, size1, limbs1);
				sdb.editStuffy(s, id);
				
				// Edit TODO
				break;
			case 5: 
				int id2 = Console.getInt("Enter Stuffy ID to DELETE: ");
				sdb.deleteStuffy(id2);
			
				break;
			case 6:
				// Exit
				break;
			default:
				// Error
				System.out.println("Invalid command!");
				break;
			}
		}

		System.out.println("Bye!");
	}
	
	private static String getMenu() {
		String menu = "COMMAND:\n" + "1 - List\n" + "2 - Get\n" + "3 - Add\n" + "4 - Edit\n" + "5 - Delete\n"
				+ "6 - Exit\n" + "Command: ";
		return menu;
	}

	// get method
	private static Stuffy getStuffy(int id) {
		Stuffy s = sdb.get(id);
		if (s != null) {
			System.out.println("Stuffy: ");
			System.out.println(s);
		} else {
			System.out.println("No stuffy exists for id: " + id);
		}
		return s;
	}
	

}
