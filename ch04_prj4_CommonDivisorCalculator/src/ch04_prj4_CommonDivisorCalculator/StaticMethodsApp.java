package ch04_prj4_CommonDivisorCalculator;

public class StaticMethodsApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		printWelcomeMessage();
		int a = sum(4,5);
		
	}
	
	private static void printWelcomeMessage() {
		System.out.println("Welcome to my method. ");
	}
	
	private static int sum(int a, int b) {
		return a + b;
	}
	
}
