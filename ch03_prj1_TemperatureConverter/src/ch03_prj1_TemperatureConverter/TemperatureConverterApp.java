package ch03_prj1_TemperatureConverter;

import java.text.NumberFormat;
import java.util.Scanner;

public class TemperatureConverterApp {

	public static void main(String[] args) {
		// create a Scanner object named sc
	    @SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
	    
		// Define Variables
	    String moreCalcs = "y";
	    
	    // Welcome message
	 	System.out.println("Welcome to the Temperature Converter");
    	System.out.println("");	
    	
    	while(moreCalcs.equalsIgnoreCase("y")) 
    	{
    		// Prompt user for degrees in Fahrenheit
    		System.out.println("Enter degrees in Fahrenheit: ");
    	    double f = 0.0;
	    	f = sc.nextDouble();
    		
	    	// rounds number to 100th
	    	NumberFormat number = NumberFormat.getNumberInstance();
	    	number.setMaximumFractionDigits(2);
	    	System.out.println("Degrees in Celsius: " + (number.format((f-32)*5/9)));
    		
	    	// continue? or exit
    		System.out.println("Continue? (y/n)");
            moreCalcs = sc.next();
    	}
	}
}
