package ch05_prj1_DiceRoller;

import java.util.Scanner;
import java.util.InputMismatchException;

public class DiceRollerApp {

	public static void main(String[] args) {
		System.out.print("Dice Roller\n" + "\n");
		Scanner sc = new Scanner(System.in);
		String moreCalcs = "y";
		moreCalcs = getString("Roll the dice? (y/n): ", sc);

		while (moreCalcs.equalsIgnoreCase("y")) {

			// calculate first random number
			int firstNumber = (int) (Math.random() * 6) + 1;

			// calculate second random number
			int secondNumber = (int) (Math.random() * 6) + 1;

			// calculate total of two numbers
			int total = firstNumber + secondNumber;

			// print everything
			System.out.println("Die 1: " + firstNumber);
			System.out.println("Die 2: " + secondNumber);
			System.out.println("Total: " + total);

			// if special conditions, calc print snake eyes or box cars
			if (total == 2) {
				System.out.println("Snake Eyes!");
			}
			if (total == 12) {
				System.out.println("Box Cars!");
			}
			
			// call method to "Roll again?"
			System.out.print("\n" + "Roll again? (y/n): ");
			moreCalcs = sc.next();
		}

		System.out.println("Good bye!");
		sc.close();

	}

	// static method create
	public static String getString(String input, Scanner sc) {
		System.out.println(input);
		return input = sc.next();
	}

	// static method create
//	public static int getNumber(int random, Scanner sc) {
//		System.out.println("Die 1: " + dieOne + "\n");
//		System.out.println("Die 2: " + dieTwo + "\n");
//		System.out.println("Total: " + total + "\n");
//		System.out.println("\n");
}
