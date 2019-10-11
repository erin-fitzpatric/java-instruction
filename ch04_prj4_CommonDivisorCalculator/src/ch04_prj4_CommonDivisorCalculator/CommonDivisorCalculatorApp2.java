package ch04_prj4_CommonDivisorCalculator;

import java.util.InputMismatchException;
import java.util.Scanner;

public class CommonDivisorCalculatorApp2 {

	public static void main(String[] args) {

		System.out.println("Welcome to Greatest Common Divisor Finder\n");
		Scanner sc = new Scanner(System.in);
		String moreCalcs = "y";

		// loop
		while (moreCalcs.equalsIgnoreCase("y")) {

// EXAMPLE OF CALLING THE METHOD		
//ORIG		System.out.println("Enter first number: ");
			int first = getInt("Enter first: ", sc);

//ORIG		System.out.println("Enter second number: ");
			int second = getInt("Enter second number: ", sc);

			while (first != 0) {
				while (second >= first) {
					second -= first;
				}
				int origSecond = second;
				second = first;
				first = origSecond;
			}
			// print greatest common divisor
			System.out.println("Greatest common divisor: " + second + "\n");
			// continue?
			System.out.println("Continue? (y/n): ");
			moreCalcs = sc.next();
		}
		sc.close();
		System.out.println("Good bye!");
	}

	// THIS IS THE METHOD

	private static int getInt(String prompt, Scanner scan) {
		boolean isValid = false;
		int i = 0;
		while (!isValid) {
			try {
				System.out.println(prompt);
				i = scan.nextInt();
				// <----- could validate if the number is positive here
				isValid = true;
			} catch (InputMismatchException ime) {
				System.out.println("Invalid entry! Try again.");
				scan.nextLine(); // discard input
				continue;
			}
		}
		return i;
	}
}
