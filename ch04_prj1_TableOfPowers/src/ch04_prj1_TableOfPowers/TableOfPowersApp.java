package ch04_prj1_TableOfPowers;

import java.util.Scanner;

public class TableOfPowersApp {

	public static void main(String[] args) {
		// welcome
		System.out.println("Welcome to the Squares and Cubes Table\n");

		// scanner
		Scanner sc = new Scanner(System.in);

		// define variable
		String moreCalcs = "y";

		while (moreCalcs.equalsIgnoreCase("y")) {
			System.out.println("Enter an integer: ");
			int number = sc.nextInt();
			String message = "Number	" + "Squared " + "Cubed" + "\n" 
					   + "======  " + "======= " + "=====";
			System.out.println(message);
			
			// bizz logic
			for (int i = 1; i <= number; i++) {
				int squared = i * i;
				int cubed =  i * i * i ;;

				// print number, squared, cube
				String anotherMessage = i + "       " + squared + "      " + cubed + "    " + "\n";
				System.out.println(anotherMessage);
		    }
			// continue?
			System.out.println("Continue? (y/n): ");
			moreCalcs = sc.next();
		}
		sc.close();
		System.out.println("Good bye!");
	}

}
