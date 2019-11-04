package ui;

import util.Console;

public class MakeChocolateApp {

	public static void main(String[] args) {
		System.out.println("Welcome to the Make Chocolate App!");

		int small = Console.getInt("\nSmall: ");
		int big1 = Console.getInt("Big: ");
		int big = (big1 * 5);
		int goal = Console.getInt("Goal: ");

		int result = makeChocolate(small, big, goal);
		System.out.println(result);

		System.out.println("Goodbye!");
	}

	public static int makeChocolate(int small, int big, int goal) {

		int nbr = 0;
		int sum = small + big;
		if (sum < goal) {
			nbr = -1;
		} else {
			nbr = goal - big;
		}
		return nbr;
	}
}

