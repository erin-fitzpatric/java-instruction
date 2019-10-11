import java.util.Scanner;

public class GradeConverterApp {

	public static void main(String[] args) {
		// Display "Welcome to the Letter Grade Converter"
        System.out.println("Welcome to the Letter Grade Converter");
        System.out.println();  // print a blank line
        
        // create a Scanner object named sc
        @SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
        
        // define variables
        
        String moreGrades = "y";
       
     	// Calculate letter grade   
        while (moreGrades.equalsIgnoreCase("y")) {
        	
     		// Display "Enter numerical grade:" and "Letter Grade:"
        	System.out.println("Enter numerical grade: ");
        	int numericalGrade = 0;
        	numericalGrade = sc.nextInt();
	     
        		String letterGrade = "";
        		if (numericalGrade >= 88) {
	        		letterGrade = "A";
	       		 }
	        	else if (numericalGrade >= 80) {
	        		letterGrade = "B";
	        	 }
	        	else if (numericalGrade >= 67) {
	        	    letterGrade = "C";
	        	}
	       		 else if (numericalGrade >= 60) {
	            	letterGrade = "D";
	        	}
	       		 else {
	          	 	letterGrade = "F";
	        	}
	         // Display letter grade	
	            System.out.println("Letter grade: " + letterGrade);
	            System.out.println();  
	            
	         // Prompt to continue "y" or "Y" using equalsIgnoreCase
	            System.out.println("Continue? (y/n)");
	            moreGrades = sc.next();       
	    	}
        System.out.println("Goodbye!");
	}
}	

