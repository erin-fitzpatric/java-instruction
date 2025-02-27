package ui;

import business.JUnitTesting;
import util.Console;

public class JUnitTestingApp {

	public static void main(String[] args) {
		System.out.println("Welcome to the JUnitTesting App!");
		JUnitTesting j = new JUnitTesting();

		// Accept an int from the user and call the square method of JUnitTesting to
		int input = Console.getInt("\nEnter a number: ");
		// Return the squared version.
		System.out.println(j.square(input));

		// Accept a String from the user and call the countA method of JUnitTesting to
		String str = Console.getString("\nType a sentence with 'a's in it.");
		// return the number of 'A's.
		System.out.println(j.countA(str));
	}
}