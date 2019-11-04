package ui;

import util.Console;

public class ArrowheadApp {

	public static void main(String[] args) {
		System.out.println("Welcome to the Arrowhead App!");

		int input = Console.getInt("\nHow big is your arrowhead?: ");

		for (int i = 0; i < input; i++) {
			for (int j = 0; j < i; j++) {
				System.out.print(">");
			}
			System.out.println();
		}
		if ((input%2)== 0) {
			for (int m = 0; m < input; m++) {
				System.out.print(">");
			}
			System.out.println();
		}
		for (int k = input; k > 0; k--) {
			for (int l = 0; l < k; l++) {
				System.out.print(">");
			}
			System.out.println();
		}
		
		System.out.println("Good bye!");
	}

}
