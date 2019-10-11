package ch03_prj2_TravelTimeCalculatorTwo;

import java.util.Scanner;

public class TravelTimeCalculatorTwoApp {

	public static void main(String[] args) {
		System.out.println("Welcome to the Travel Time Calculator App #2!!!");
		
		Scanner sc = new Scanner(System.in);
		
		String choice = "y";
		while(choice.equalsIgnoreCase("y")) {
			System.out.println("Enter miles: ");
			double miles = sc.nextDouble();
			
			System.out.println("Miles per hour: ");
			double mph = sc.nextDouble();
			
			// biz logic - compute hours and minutes to be int
			double hours = miles / mph;
			int min = (int)(hours * 60);
			int hoursInt = min / 60;
			min %= 60; 
			
			// display results
			System.out.println("Estimate Travel Time: ");
			System.out.println("======================");
			System.out.println("Hours:   "+hoursInt);
			System.out.println("Minutes: "+min);
						
			System.out.println("Continue? (y/n)");
			choice = sc.next();
		}	
		sc.close();
		System.out.println("Good Bye Traveler!");
	}
}
