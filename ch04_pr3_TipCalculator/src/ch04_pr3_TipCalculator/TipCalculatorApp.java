package ch04_pr3_TipCalculator;
import java.util.Scanner;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class TipCalculatorApp {

	public static void main(String[] args) {
		// welcome
		System.out.println("Tip Calculator\n");

		Scanner sc = new Scanner(System.in);
		// define variable
		String moreCalcs = "y";

		while (moreCalcs.equalsIgnoreCase("y")) {
			System.out.println("Cost of Meal: ");
			BigDecimal mealCost = sc.nextBigDecimal();
			System.out.println("\n");
			
			// Do biz logic
			//15
			BigDecimal tipPercentage = new BigDecimal(".15");
			BigDecimal tipAmount = mealCost.multiply(tipPercentage); 
			BigDecimal totalAmount = mealCost.add(tipAmount);
			
			//rounding
			totalAmount = totalAmount.setScale(2, RoundingMode.HALF_UP);
			tipAmount = tipAmount.setScale(2, RoundingMode.HALF_UP);

			System.out.println("15%\n" + "Tip amount:       $" + tipAmount + "\n" + "Total amount:     $" + totalAmount + "\n");
			
			//20

			tipPercentage = new BigDecimal(".20");
			tipAmount = mealCost.multiply(tipPercentage); 
			totalAmount = mealCost.add(tipAmount);
			
			//rounding
			totalAmount = totalAmount.setScale(2, RoundingMode.HALF_UP);
			tipAmount = tipAmount.setScale(2, RoundingMode.HALF_UP);

			System.out.println("20%\n" + "Tip amount:       $" + tipAmount + "\n" + "Total amount:     $" + totalAmount + "\n");
			
			//25
			
			tipPercentage = new BigDecimal(".25");
			tipAmount = mealCost.multiply(tipPercentage); 
			totalAmount = mealCost.add(tipAmount);
			
			//rounding
			totalAmount = totalAmount.setScale(2, RoundingMode.HALF_UP);
			tipAmount = tipAmount.setScale(2, RoundingMode.HALF_UP);

			System.out.println("25%\n" + "Tip amount:       $" + tipAmount + "\n" + "Total amount:     $" + totalAmount + "\n");

			// continue?
			System.out.println("Continue? (y/n): ");
			moreCalcs = sc.next();	
		}

		sc.close();
		System.out.println("Good bye!");
	}
}
