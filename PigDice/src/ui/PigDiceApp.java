package ui;

import util.Console;

public class PigDiceApp {

	public static void main(String[] args) {
		System.out.println("Welcome to the Pig Dice App!");
		String choice = "y";
		int totalGames = 0;
		
		while (choice.equalsIgnoreCase("y")) {
			int input = Console.getInt("# of times to play?: ");
			System.out.println("Here we go...");
			System.out.println("Played "+input+" games");
			int total = 0;
			int highScore = 0;
			
			for(int i = 0; i < input; i ++) {
				int roll = (int) (Math.random() * 6) + 1;
				System.out.println(roll);
				total += roll;
				if (roll > highScore ) {
					highScore = roll;
				}
			}
			int average= total/input;
		
			
			System.out.println("Toal: "+total); 
			System.out.println("Average: "+average);
			System.out.println("Highest score: "+highScore);
			
			
			totalGames ++;
			choice = Console.getString("Again? (y/n): ");
		}
		
		System.out.println("Total games played: "+totalGames);
		System.out.println("Good Bye!");
	}

}

// Additional interesting stats to keep:
// Highest score
// Total rolls
// Highest rolls within a game
// Average rolls per game
// Average score per game
// Most common # rolled
// How long did we play?
