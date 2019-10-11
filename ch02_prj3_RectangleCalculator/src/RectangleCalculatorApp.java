import java.util.Scanner;

public class RectangleCalculatorApp {
	public static void main(String[] args) {
		//display welcome message 
		System.out.println("Welcome to the Area and Perimeter Calculator");
		System.out.println();

		//define variables and scanner object
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);

		int length = 0;
		int width = 0;
		double area = 0.0;
		double perimeter = 0.0;
		String moreCalc = "y";

		// Take input and prompt user for loop
		while (moreCalc.equalsIgnoreCase("y")) {
			System.out.println("Enter length: ");
			length = sc.nextInt();
			
			System.out.println("Enter width: ");
			width = sc.nextInt();

			area = (width * length);
			perimeter = (2 * width + 2 * length);

			System.out.println("Area: " + area);
			System.out.println("Perimeter: " + perimeter);
			System.out.println();

			// Prompt to continue "y" or "Y" using equalsIgnoreCase
	        System.out.println("Continue? (y/n)");
	        moreCalc = sc.next();       
		}
			
	}

}
