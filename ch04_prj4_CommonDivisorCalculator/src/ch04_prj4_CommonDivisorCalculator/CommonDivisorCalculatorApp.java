package ch04_prj4_CommonDivisorCalculator;

import java.util.Scanner;

public class CommonDivisorCalculatorApp {

	public static void main(String[] args) {
		
		System.out.println("Welcome to Greatest Common Divisor Finder\n");
		Scanner sc = new Scanner(System.in);
		String moreCalcs = "y";

		// loop
		while (moreCalcs.equalsIgnoreCase("y")) {
			System.out.println("Enter first number: ");
			int first = sc.nextInt();

			System.out.println("Enter second number: ");
			int second = sc.nextInt();

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
}
