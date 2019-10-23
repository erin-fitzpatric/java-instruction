package ui;

import util.Console;

public class PigLatinTranslatorApp {

	public static void main(String[] args) {
		System.out.println("Welcome to the Pig Latin Translator App!");

		String choice = "y";
		while (choice.equalsIgnoreCase("y")) {
			String input = Console.getString("Enter a line: ");
			String[] inputArray = input.split(" ");
			
			// change input to pig latin
			
			
			
			
			
			choice = Console.getString("Another line? (y/n): ");
		}
		System.out.println("Goodbye!");
	}

}
