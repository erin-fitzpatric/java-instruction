package ch04_class_demos;

public class WhileDoWhileApp {

	public static void main(String[] args) {
		
		// while loop evaluating a numeric value
		int i = 1;
		int months = 36;
		
		while (i <= months) {
			System.out.println("Running!!! i is "+i);
			i++;
		}
		
		// do while loop
		do {
			System.out.println("do while is running! i is " +i);
		} while (i <= months);
	}
}
