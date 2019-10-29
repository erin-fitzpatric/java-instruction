package ui;

public class TernaryDemoApp {

	public static void main(String[] args) {
		int num = 10;
		String msg = "";
		
		if (num > 10 ) {
			msg = "Number is greater than 10.";
		}
		else {
			msg = "Number is less than 10.";
		}
		
		System.out.println(msg);
		
		// ternary operator ? 
		msg = (num >= 10) ? "Number is greater than, or equal to 10." :
							"Number is less than 10.";
		
		System.out.println(msg);
	}

}
