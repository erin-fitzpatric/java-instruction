package ch05_prj1_DiceRollerReview;

import java.util.Scanner;

public class DiceRollerReviewApp {

	public static void main(String[] args) {
		System.out.println("Welcome to the Dice Roller!\n");
		Scanner sc = new Scanner(System.in);
		String choice = "y";

		while (choice.equalsIgnoreCase("y")) {
			System.out.print("Roll the dice? (y/n): ");
			choice = inputVerify(choice, sc);

			while (choice.equalsIgnoreCase("y")) {
				choice = diceRoll(choice, sc);
			}
		}
		System.out.println("\n" + "Bye - Come back soon!");
		sc.close();
	}

	public static String inputVerify(String choice, Scanner sc) {

		choice = "y";
		do {
			if (choice.equals("")) {
				System.out.print("Error! This entry is required.");
			} else if (!choice.equalsIgnoreCase("y") && !choice.equalsIgnoreCase("n")) {
				System.out.print("Error! Entry must be 'y' or 'n'.");
			}
			choice = sc.nextLine().trim();
		} while (!choice.equalsIgnoreCase("y") && !choice.equalsIgnoreCase("n"));
		return choice;
	}

	public static String diceRoll(String choice, Scanner sc) {
		int dieOne = (int) (Math.random() * 6) + 1;
		int dieTwo = (int) (Math.random() * 6) + 1;
		int total = dieOne + dieTwo;

		System.out.println("\n" + "Die 1: " + dieOne);
		System.out.println("Die 2: " + dieTwo);
		System.out.println("Total: " + total);
		System.out.print("\n" + "Roll again? (y/n): ");
		choice = inputVerify(choice, sc);
		return choice;
	}
}
