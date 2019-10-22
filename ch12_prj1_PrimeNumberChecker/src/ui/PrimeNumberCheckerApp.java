package ui;

import java.util.ArrayList;

import util.Console;

public class PrimeNumberCheckerApp {

	public static void main(String[] args) {
		System.out.println("Prime Number Checker");

		String choice = "y";
		while (choice.equalsIgnoreCase("y")) {
			int numInput = Console.getInt("\nPlease enter an integer between 1 and 5000: ", 0, 5001);

			int count = 0;
			ArrayList<Integer> factors = new ArrayList<>(numInput);
			for (int i = 1; i <= numInput; i++) {
				if ((numInput % i) == 0) {
					factors.add(i);
					count++;
				}
			}
			if (count > 2) {
				System.out.println(numInput + " is NOT a prime number.");
				System.out.println("It has " + count + " factors: " + factors);
			} else {
				System.out.println(numInput + " is a prime number.");
			}
			choice = Console.getString("\nTry Again? (y/n): ");
		}
		System.out.println("\nBye!");
	}
}
