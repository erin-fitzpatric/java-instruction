package ch03_prj2_TravelTimeCalculator;

import java.util.Scanner;

public class TimeCalculatorApp {

	public static void main(String[] args) {
		// create a Scanner object named sc
	    @SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
	    
		// Define Variables
	    String moreCalcs = "y";
	    
	    // Welcome message
	 	System.out.println("Welcome to the Travel Time Calculator");
    	System.out.println("");
	    
	    while(moreCalcs.equalsIgnoreCase("y")) 
	    {
	    	System.out.println("Enter miles: ");
		    double miles = 0.0;
	    	miles = sc.nextDouble();
	    	
	    	System.out.println("Enter miles per hour: ");
	    	double speed = 0.0;
	    	speed = sc.nextDouble();
	    	
	    	// Calculate hours and minutes
	    	int totalMinutes = (int)((miles/speed)*60);
	    	
	    	int hours = totalMinutes / 60;
	    	int minutes = totalMinutes % 60;
	    
	    	// Print Hours and Minutes
	    	System.out.println("Estimated travel time");
	    	System.out.println("---------------------");
	    	System.out.println("Hours: " + hours);
	    	System.out.println("Minutes: " + minutes);
	    	System.out.println("");
	    	
	    	// Prompt to continue "y" or "Y" using equalsIgnoreCase
            System.out.println("Continue? (y/n)");
            moreCalcs = sc.next();
	    }
	}
}
