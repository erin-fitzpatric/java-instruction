package ui;

import java.time.LocalDate;
import java.util.List;
import business.Actor;
import business.Movie;
import db.ActorDB;
import db.MovieDB;
import util.Console;

public class BMDBConsoleApp {

	// create new instance of DB(s)
	private static MovieDB movieDB = new MovieDB();
	private static ActorDB actorDB = new ActorDB();

	
	public static void main(String[] args) {
		System.out.println("bmdb Console App\n");
		
		int choice = 0;
		
		while (choice!=99) {
			choice = Console.getInt(getMenu(), 0, 100);
			switch (choice) {
			case 1:
				// list movies
				List<Movie> movies = movieDB.list();
				System.out.println("List of movies:");
				for (Movie m: movies) {
					System.out.println(m);
				}
				break;
			case 2:
				// list actors
				List<Actor> actors = actorDB.listActor();
				System.out.println("List of actors:");
				for (Actor a: actors) {
					System.out.println(a);
				}
				break;
			case 3:
				// add movie
				System.out.println("Add a movie: ");
				String t = Console.getString("Title: ");
				String r = Console.getString("Rating: ");
				int y = Console.getInt("Year: ");
				String d = Console.getString("Director: ");
				Movie m = new Movie(t, r, y, d);
				int rc = movieDB.add(m);
				if (rc==1) {
					System.out.println("Movie added successfuly!");
				}
				else {
					System.out.println("error adding movie.. check logs");
				}
				break;
			case 4:
				// update movie
				m = getMovie();
				if (m!=null) {
					int year = Console.getInt("New Year? ");
					m.setYear(year);
					rc = movieDB.update(m);
					if (rc==1) {
						System.out.println("Movie updated successfully!");
					}
					else {
						System.out.println("Error updating movie year.");
					}
				}
				else {
					System.out.println("Error...movie id doesn't exist.");
				}
				break;
			case 5:
				// delete movie
				m = getMovie();
				if (m!=null) {
					rc = movieDB.delete(m);
					if (rc==1) {
						System.out.println("Movie deleted successfully!");
					}
					else {
						System.out.println("Error deleting a movie.");
					}
				}
				else {
					System.out.println("Error...movie id doesn't exist.");
				}
				break;
			case 6:
				// get movie
				m = getMovie();
				if (m!=null) {
					System.out.println("Movie: ");
					System.out.println(m);
				}else {
					System.out.println("Error...movie id doesn't exist.");
				}
				break;
			case 7:
				// get actor
				
				Actor a = getActor();
				if (a!=null) {
					System.out.println("Actor: ");
					System.out.println(a);
				}else {
					System.out.println("Error...actor id doesn't exist.");
				}
				break;
			case 8:
				// add actor 
				System.out.println("Add a actor: ");
				String f = Console.getString("First Name: ");
				String l = Console.getString("Last Name: ");
				String g = Console.getString("Gender: ");
				String bds = Console.getString("Birth Date (YYYY-MM-DD): ");
				LocalDate bd = LocalDate.parse(bds);
				Actor actor = new Actor(f, l, g, bd);
				int rcActor = actorDB.add(actor);
				if (rcActor==1) {
					System.out.println("Movie added successfuly!");
				}
				else {
					System.out.println("error adding actor... check logs");
				}
				break;
			case 9:
				// update actors 
				a = getActor();
				if (a!=null) {
					String firstName = Console.getString("New first name?: ");
					a.setFirstName(firstName);
					rc = actorDB.update(a);
					if (rc==1) {
						System.out.println("First name updated successfully!");
					}
					else {
						System.out.println("Error updating first name.");
					}
				}
				else {
					System.out.println("Error...first name doesn't exist.");
				}
				break;
			case 10:
				// delete actors TODO
				a = getActor();
				if (a!=null) {
					rc = actorDB.delete(a);
					if (rc==1) {
						System.out.println("Actor deleted successfully!");
					}
					else {
						System.out.println("Error deleting a actor.");
					}
				}
				else {
					System.out.println("Error...actor id doesn't exist.");
				}
				break;
			case 99:
				// exit
				break;
			default:
				System.out.println("Invalid command.");
				break;
			}
		}		
		
		System.out.println("Bye!");
	}

	private static String getMenu() {
		String menu = "COMMAND:\n" + "1 - List Movies\n" + "2 - List Actors\n" + "3 - Add Movie\n" + "4 - Update Movie\n" + "5 - Delete Movie\n"
				+ "6 - Get Movie\n" 
				+ "7 - Get Actor\n" 
				+ "8 - Add Actor\n" 
				+ "9 - Update Actor\n" 
				+ "10 - Delete Actor\n" 
				+ "99 - Exit\n" + "Command: ";
		return menu;
	}

	// getMovie 
	private static Movie getMovie() {
		int id = Console.getInt("ID? ", 0, Integer.MAX_VALUE);
		Movie m = movieDB.get(id);
		return m;
	}
	
	// getActor TODO
	private static Actor getActor() {
		int id = Console.getInt("ID? ", 0, Integer.MAX_VALUE);
		Actor a = actorDB.get(id);
		return a;
	}
}
