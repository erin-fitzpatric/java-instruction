package ch04_prj2_FactorialCalculator;

import java.util.Scanner;

public class FactorialCalculatorApp {

	public static void main(String[] args) {
		// welcome
		System.out.println("Welcome to the Factorial Calculator\n");

		// scanner
		Scanner sc = new Scanner(System.in);

		// define variable
		String moreCalcs = "y";

		// loop
		while (moreCalcs.equalsIgnoreCase("y")) {
			System.out.println("Enter an integer that's greater than 0 and less than 10: ");
			int input = sc.nextInt();
		

			// biz logic
			
			long factorial = 1;
			for (int i = 2; i <= input; i++) {
				factorial = i * factorial;
				// print to console
			}
			String message = "The factorial of " + input + " is " + factorial + "\n";
			System.out.println(message);
		
			// continue?
			System.out.println("Continue? (y/n): ");
			moreCalcs = sc.next();
		}
		sc.close();
		System.out.println("Good bye!");
	}
}
