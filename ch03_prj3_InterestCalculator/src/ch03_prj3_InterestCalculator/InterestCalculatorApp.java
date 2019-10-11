package ch03_prj3_InterestCalculator;

import java.util.Scanner;
import java.math.BigDecimal;

public class InterestCalculatorApp {

	public static void main(String[] args) {
		// create a Scanner object named sc
	    @SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
	    
		// Define Variables
	    String moreCalcs = "y";
		
		System.out.println("Welcome to the Interest Calculator!");
		System.out.println("");
		
		while (moreCalcs.equalsIgnoreCase("y")) {
			System.out.println("Enter Loan Amount: ");
			BigDecimal amount = sc.nextBigDecimal();
			
			System.out.println("Enter Interest Rate: ");
			BigDecimal rate = sc.nextBigDecimal();
		// Calculate and return loan amount, interest rate, and total interest. START HERE!!!!
		
		// Continue?
			System.out.println("Continue? (y/n)");
			moreCalcs = sc.next();	
		}
		System.out.println("Goodbye!");
	}
}
